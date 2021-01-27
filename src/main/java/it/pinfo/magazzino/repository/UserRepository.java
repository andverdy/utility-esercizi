package it.pinfo.magazzino.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import it.pinfo.magazzino.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	User findByUsername(String username);

	Integer findIdByUsername(Integer id);

	@Query(value = "select  roles.descrizione \r\n" + "from user_has_roles \r\n" + "inner join roles \r\n"
			+ "on roles.id = user_has_roles.role_id \r\n"
			+ "where user_id = (select id from user where username = :username);", nativeQuery = true)
	List<String> findRolesByUsername(@Param("username") String username);

	@Transactional
	@Modifying
	@Query(value = "insert into user_has_roles (user_id, role_id) values (:id, 11)", nativeQuery = true)
	void saveRole(@Param("id") Integer id);

}

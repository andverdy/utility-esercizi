package Modelli;
//package algoritmi;
//
//@Getter
//@RequiredArgsConstructor
//public class EnumDomini {
//
//	EMPTY(0, "   ", Company.ALLEANZA, " ", " "),
//	    AFGHANISTAN(2, "002", Company.ALLEANZA, "AFGHANISTAN", "AFGHANISTAN"),
//	    ALGERIA(3, "003", Company.ALLEANZA, "ALGERIA", "ALGERIA"),
//	    ANDORRA(4, "004", Company.ALLEANZA, "ANDORRA", "ANDORRA"),
//	    ARABIA_SAUDITA(5, "005", Company.ALLEANZA, "ARABIA SAUDITA", "ARABIA SAUDITA"),
//	    ARGENTINA(6, "006", Company.ALLEANZA, "ARGENTINA", "ARGENTINA"),
//	    AUSTRALIA(7, "007", Company.ALLEANZA, "AUSTRALIA", "AUSTRALIA"),
//	    AUSTRIA(8, "008", Company.ALLEANZA, "AUSTRIA", "AUSTRIA"),
//	    BELGIO(9, "009", Company.ALLEANZA, "BELGIO", "BELGIO"),
//	    BOLIVIA(10, "010", Company.ALLEANZA, "BOLIVIA", "BOLIVIA"),
//	    BRASILE(11, "011", Company.ALLEANZA, "BRASILE", "BRASILE"),
//	    BULGARIA(12, "012", Company.ALLEANZA, "BULGARIA", "BULGARIA"),
//	    CANADA(13, "013", Company.ALLEANZA, "CANADA", "CANADA"),
//	    CECOSLOVACCHIA(14, "014", Company.ALLEANZA, "CECOSLOVACCHIA", "CECOSLOVACCHIA"),
//	    CILE(15, "015", Company.ALLEANZA, "CILE", "CILE"),
//	    CINA_REPUBBLICA_POPOLARE(16, "016", Company.ALLEANZA, "CINA REPUBBLICA POPOLARE", "CINA REPUBBLICA POPOLARE"),
//	    COLOMBIA(17, "017", Company.ALLEANZA, "COLOMBIA", "COLOMBIA"),
//	    CONGO_REPUBBLICA_DEMOCRAT(18, "018", Company.ALLEANZA, "CONGO REPUBBLICA DEMOCRAT", "CONGO REPUBBLICA DEMOCRATICA"),
//	    COSTA_RICA(19, "019", Company.ALLEANZA, "COSTA RICA", "COSTA RICA"),
//	    CUBA(20, "020", Company.ALLEANZA, "CUBA", "CUBA"),
//	    DANIMARCA(21, "021", Company.ALLEANZA, "DANIMARCA", "DANIMARCA"),
//	    REPUBBLICA_DELLA_CINA_NAZ(22, "022", Company.ALLEANZA, "REPUBBLICA DELLA CINA NAZ", "REPUBBLICA DELLA CINA NAZIONALE - TAIWAN"),
//	    EGITTO(23, "023", Company.ALLEANZA, "EGITTO", "EGITTO"),
//	    ECUADOR(24, "024", Company.ALLEANZA, "ECUADOR", "ECUADOR"),
//	    BURUNDI(25, "025", Company.ALLEANZA, "BURUNDI", "BURUNDI"),
//	    ETIOPIA(26, "026", Company.ALLEANZA, "ETIOPIA", "ETIOPIA"),
//	    FILIPPINE(27, "027", Company.ALLEANZA, "FILIPPINE", "FILIPPINE"),
//	    FINLANDIA(28, "028", Company.ALLEANZA, "FINLANDIA", "FINLANDIA"),
//	    FRANCIA(29, "029", Company.ALLEANZA, "FRANCIA", "FRANCIA"),
//	    GRAN_BRETAGNA(31, "031", Company.ALLEANZA, "GRAN BRETAGNA", "GRAN BRETAGNA"),
//	    GRECIA(32, "032", Company.ALLEANZA, "GRECIA", "GRECIA"),
//	    GUATEMALA(33, "033", Company.ALLEANZA, "GUATEMALA", "GUATEMALA"),
//	    HAITI(34, "034", Company.ALLEANZA, "HAITI", "HAITI"),
//	    HONDURAS(35, "035", Company.ALLEANZA, "HONDURAS", "HONDURAS"),
//	    PAKISTAN(36, "036", Company.ALLEANZA, "PAKISTAN", "PAKISTAN"),
//	    SAN_MARINO(37, "037", Company.ALLEANZA, "SAN MARINO", "SAN MARINO"),
//	    IRAQ(38, "038", Company.ALLEANZA, "IRAQ", "IRAQ"),
//	    IRAN(39, "039", Company.ALLEANZA, "IRAN", "IRAN"),
//	    IRLANDA(40, "040", Company.ALLEANZA, "IRLANDA", "IRLANDA"),
//	    ISLANDA(41, "041", Company.ALLEANZA, "ISLANDA", "ISLANDA"),
//	    YEMEN(42, "042", Company.ALLEANZA, "YEMEN", "YEMEN"),
//	    IUGOSLAVIA(43, "043", Company.ALLEANZA, "IUGOSLAVIA", "IUGOSLAVIA"),
//	    LIBERIA(44, "044", Company.ALLEANZA, "LIBERIA", "LIBERIA"),
//	    LIBIA(45, "045", Company.ALLEANZA, "LIBIA", "LIBIA"),
//	    MESSICO(46, "046", Company.ALLEANZA, "MESSICO", "MESSICO"),
//	    NICARAGUA(47, "047", Company.ALLEANZA, "NICARAGUA", "NICARAGUA"),
//	    NORVEGIA(48, "048", Company.ALLEANZA, "NORVEGIA", "NORVEGIA"),
//	    NUOVA_ZELANDA(49, "049", Company.ALLEANZA, "NUOVA ZELANDA", "NUOVA ZELANDA"),
//	    PAESI_BASSI(50, "050", Company.ALLEANZA, "PAESI BASSI", "PAESI BASSI"),
//	    PANAMA(51, "051", Company.ALLEANZA, "PANAMA", "PANAMA"),
//	    PARAGUAY(52, "052", Company.ALLEANZA, "PARAGUAY", "PARAGUAY"),
//	    PERU(53, "053", Company.ALLEANZA, "PERU'", "PERU'"),
//	    POLONIA(54, "054", Company.ALLEANZA, "POLONIA", "POLONIA"),
//	    PORTOGALLO(55, "055", Company.ALLEANZA, "PORTOGALLO", "PORTOGALLO"),
//	    MALAWI(56, "056", Company.ALLEANZA, "MALAWI", "MALAWI"),
//	    TANZANIA(57, "057", Company.ALLEANZA, "TANZANIA", "TANZANIA"),
//	    ZAMBIA(58, "058", Company.ALLEANZA, "ZAMBIA", "ZAMBIA"),
//	    MACAO(59, "059", Company.ALLEANZA, "MACAO", "MACAO"),
//	    ROMANIA(61, "061", Company.ALLEANZA, "ROMANIA", "ROMANIA"),
//	    VIETNAM(62, "062", Company.ALLEANZA, "VIETNAM", "VIETNAM"),
//	    REPUBBLICA_DOMINICANA(63, "063", Company.ALLEANZA, "REPUBBLICA DOMINICANA", "REPUBBLICA DOMINICANA"),
//	    EL_SALVADOR(64, "064", Company.ALLEANZA, "EL SALVADOR", "EL SALVADOR"),
//	    SIRIA(65, "065", Company.ALLEANZA, "SIRIA", "SIRIA"),
//	    SOMALIA(66, "066", Company.ALLEANZA, "SOMALIA", "SOMALIA"),
//	    SPAGNA(67, "067", Company.ALLEANZA, "SPAGNA", "SPAGNA"),
//	    SVEZIA(68, "068", Company.ALLEANZA, "SVEZIA", "SVEZIA"),
//	    STATI_UNITI_DAMERICA(69, "069", Company.ALLEANZA, "STATI UNITI D'AMERICA", "STATI UNITI D'AMERICA"),
//	    SUDAN(70, "070", Company.ALLEANZA, "SUDAN", "SUDAN"),
//	    SVIZZERA(71, "071", Company.ALLEANZA, "SVIZZERA", "SVIZZERA"),
//	    THAILANDIA(72, "072", Company.ALLEANZA, "THAILANDIA", "THAILANDIA"),
//	    ZIMBABWE(73, "073", Company.ALLEANZA, "ZIMBABWE", "ZIMBABWE"),
//	    COREA_DEL_NORD(74, "074", Company.ALLEANZA, "COREA DEL NORD", "COREA DEL NORD"),
//	    TUNISIA(75, "075", Company.ALLEANZA, "TUNISIA", "TUNISIA"),
//	    TURCHIA(76, "076", Company.ALLEANZA, "TURCHIA", "TURCHIA"),
//	    UNGHERIA(77, "077", Company.ALLEANZA, "UNGHERIA", "UNGHERIA"),
//	    SUD_AFRICA(78, "078", Company.ALLEANZA, "SUD AFRICA", "SUD AFRICA"),
//	    URUGUAY(80, "080", Company.ALLEANZA, "URUGUAY", "URUGUAY"),
//	    VENEZUELA(81, "081", Company.ALLEANZA, "VENEZUELA", "VENEZUELA"),
//	    GIAMAICA(82, "082", Company.ALLEANZA, "GIAMAICA", "GIAMAICA"),
//	    MYANMAR(83, "083", Company.ALLEANZA, "MYANMAR", "MYANMAR"),
//	    COREA_DEL_SUD(84, "084", Company.ALLEANZA, "COREA DEL SUD", "COREA DEL SUD"),
//	    SRI_LANKA(85, "085", Company.ALLEANZA, "SRI LANKA", "SRI LANKA"),
//	    ITALIA(86, "086", Company.ALLEANZA, "ITALIA", "ITALIA"),
//	    ALBANIA(87, "087", Company.ALLEANZA, "ALBANIA", "ALBANIA"),
//	    GIAPPONE(88, "088", Company.ALLEANZA, "GIAPPONE", "GIAPPONE"),
//	    LESOTHO(89, "089", Company.ALLEANZA, "LESOTHO", "LESOTHO"),
//	    LIECHTENSTEIN(90, "090", Company.ALLEANZA, "LIECHTENSTEIN", "LIECHTENSTEIN"),
//	    PRINCIPATO_DI_MONACO(91, "091", Company.ALLEANZA, "PRINCIPATO DI MONACO", "PRINCIPATO DI MONACO"),
//	    LUSSEMBURGO(92, "092", Company.ALLEANZA, "LUSSEMBURGO", "LUSSEMBURGO"),
//	    CITTA_DEL_VATICANO(93, "093", Company.ALLEANZA, "CITTA' DEL VATICANO", "CITTA' DEL VATICANO"),
//	    GERMANIA(94, "094", Company.ALLEANZA, "GERMANIA", "GERMANIA"),
//	    LIBANO(95, "095", Company.ALLEANZA, "LIBANO", "LIBANO"),
//	    BHUTAN(97, "097", Company.ALLEANZA, "BHUTAN", "BHUTAN"),
//	    BOTSWANA(98, "098", Company.ALLEANZA, "BOTSWANA", "BOTSWANA"),
//	    CANARIE_ISOLE(100, "100", Company.ALLEANZA, "CANARIE ISOLE", "CANARIE ISOLE"),
//	    CIPRO(101, "101", Company.ALLEANZA, "CIPRO", "CIPRO"),
//	    GIBILTERRA(102, "102", Company.ALLEANZA, "GIBILTERRA", "GIBILTERRA"),
//	    HONG_KONG(103, "103", Company.ALLEANZA, "HONG KONG", "HONG KONG"),
//	    MADAGASCAR(104, "104", Company.ALLEANZA, "MADAGASCAR", "MADAGASCAR"),
//	    MALTA(105, "105", Company.ALLEANZA, "MALTA", "MALTA"),
//	    MALAYSIA(106, "106", Company.ALLEANZA, "MALAYSIA", "MALAYSIA"),
//	    MAROCCO(107, "107", Company.ALLEANZA, "MAROCCO", "MAROCCO"),
//	    NAURU(109, "109", Company.ALLEANZA, "NAURU", "NAURU"),
//	    MONGOLIA(110, "110", Company.ALLEANZA, "MONGOLIA", "MONGOLIA"),
//	    GHANA(112, "112", Company.ALLEANZA, "GHANA", "GHANA"),
//	    GIBUTI(113, "113", Company.ALLEANZA, "GIBUTI", "GIBUTI"),
//	    INDIA(114, "114", Company.ALLEANZA, "INDIA", "INDIA"),
//	    NEPAL(115, "115", Company.ALLEANZA, "NEPAL", "NEPAL"),
//	    KENYA(116, "116", Company.ALLEANZA, "KENYA", "KENYA"),
//	    NIGERIA(117, "117", Company.ALLEANZA, "NIGERIA", "NIGERIA"),
//	    BARBADOS(118, "118", Company.ALLEANZA, "BARBADOS", "BARBADOS"),
//	    CAMERUN(119, "119", Company.ALLEANZA, "CAMERUN", "CAMERUN"),
//	    TRINIDAD_E_TOBAGO(120, "120", Company.ALLEANZA, "TRINIDAD E TOBAGO", "TRINIDAD E TOBAGO"),
//	    VANUATU(121, "121", Company.ALLEANZA, "VANUATU", "VANUATU"),
//	    GIORDANIA(122, "122", Company.ALLEANZA, "GIORDANIA", "GIORDANIA"),
//	    GUYANA_FRANCESE(123, "123", Company.ALLEANZA, "GUYANA FRANCESE", "GUYANA FRANCESE"),
//	    SURINAME(124, "124", Company.ALLEANZA, "SURINAME", "SURINAME"),
//	    BRUNEI(125, "125", Company.ALLEANZA, "BRUNEI", "BRUNEI"),
//	    KUWAIT(126, "126", Company.ALLEANZA, "KUWAIT", "KUWAIT"),
//	    MALDIVE(127, "127", Company.ALLEANZA, "MALDIVE", "MALDIVE"),
//	    MAURIZIO(128, "128", Company.ALLEANZA, "MAURIZIO", "MAURIZIO"),
//	    INDONESIA(129, "129", Company.ALLEANZA, "INDONESIA", "INDONESIA"),
//	    BANGLADESH(130, "130", Company.ALLEANZA, "BANGLADESH", "BANGLADESH"),
//	    SAMCA(131, "131", Company.ALLEANZA, "SAMCA", "SAMCA"),
//	    UGANDA(132, "132", Company.ALLEANZA, "UGANDA", "UGANDA"),
//	    ANGOLA(133, "133", Company.ALLEANZA, "ANGOLA", "ANGOLA"),
//	    MOZAMBICO(134, "134", Company.ALLEANZA, "MOZAMBICO", "MOZAMBICO"),
//	    CAMBOGIA(135, "135", Company.ALLEANZA, "CAMBOGIA", "CAMBOGIA"),
//	    LAOS(136, "136", Company.ALLEANZA, "LAOS", "LAOS"),
//	    GUINEA(137, "137", Company.ALLEANZA, "GUINEA", "GUINEA"),
//	    SWAZILAND(138, "138", Company.ALLEANZA, "SWAZILAND", "SWAZILAND"),
//	    MAURITANIA(141, "141", Company.ALLEANZA, "MAURITANIA", "MAURITANIA"),
//	    BURKINA_FASO(142, "142", Company.ALLEANZA, "BURKINA FASO", "BURKINA FASO"),
//	    REPUBBLICA_CENTRAFRICANA(143, "143", Company.ALLEANZA, "REPUBBLICA CENTRAFRICANA", "REPUBBLICA CENTRAFRICANA"),
//	    CIAD(144, "144", Company.ALLEANZA, "CIAD", "CIAD"),
//	    CONGO_REPUBBLICA_POPOLARE(145, "145", Company.ALLEANZA, "CONGO REPUBBLICA POPOLARE", "CONGO REPUBBLICA POPOLARE"),
//	    COSTA_DAVORIO(146, "146", Company.ALLEANZA, "COSTA D'AVORIO", "COSTA D'AVORIO"),
//	    SINGAPORE(147, "147", Company.ALLEANZA, "SINGAPORE", "SINGAPORE"),
//	    SAMOA_AMERICANE(148, "148", Company.ALLEANZA, "SAMOA AMERICANE", "SAMOA AMERICANE"),
//	    MALI(149, "149", Company.ALLEANZA, "MALI", "MALI"),
//	    NIGER(150, "150", Company.ALLEANZA, "NIGER", "NIGER"),
//	    RUANDA(151, "151", Company.ALLEANZA, "RUANDA", "RUANDA"),
//	    SENEGAL(152, "152", Company.ALLEANZA, "SENEGAL", "SENEGAL"),
//	    SIERRA_LEONE(153, "153", Company.ALLEANZA, "SIERRA LEONE", "SIERRA LEONE"),
//	    GUAM(154, "154", Company.ALLEANZA, "GUAM", "GUAM"),
//	    TOGO(155, "155", Company.ALLEANZA, "TOGO", "TOGO"),
//	    GRENADA(156, "156", Company.ALLEANZA, "GRENADA", "GRENADA"),
//	    GABON(157, "157", Company.ALLEANZA, "GABON", "GABON"),
//	    BENIN(158, "158", Company.ALLEANZA, "BENIN", "BENIN"),
//	    GUYANA(159, "159", Company.ALLEANZA, "GUYANA", "GUYANA"),
//	    BAHAMA(160, "160", Company.ALLEANZA, "BAHAMA", "BAHAMA"),
//	    FUI(161, "161", Company.ALLEANZA, "FUI", "FUI"),
//	    TONGA(162, "162", Company.ALLEANZA, "TONGA", "TONGA"),
//	    OMAN(163, "163", Company.ALLEANZA, "OMAN", "OMAN"),
//	    GAMBIA(164, "164", Company.ALLEANZA, "GAMBIA", "GAMBIA"),
//	    SAHARA_OCCIDENTALE(166, "166", Company.ALLEANZA, "SAHARA OCCIDENTALE", "SAHARA OCCIDENTALE"),
//	    GUINEA_EQUATORIALE(167, "167", Company.ALLEANZA, "GUINEA EQUATORIALE", "GUINEA EQUATORIALE"),
//	    QATAR(168, "168", Company.ALLEANZA, "QATAR", "QATAR"),
//	    BAHREIN(169, "169", Company.ALLEANZA, "BAHREIN", "BAHREIN"),
//	    PITCAIRN(175, "175", Company.ALLEANZA, "PITCAIRN", "PITCAIRN"),
//	    COMORE(176, "176", Company.ALLEANZA, "COMORE", "COMORE"),
//	    MIDWAY(177, "177", Company.ALLEANZA, "MIDWAY", "MIDWAY"),
//	    WAKE(178, "178", Company.ALLEANZA, "WAKE", "WAKE"),
//	    TERRITOR_ANTARTICO_BRITAN(180, "180", Company.ALLEANZA, "TERRITOR.ANTARTICO BRITAN", "TERRITOR.ANTARTICO BRITANNICO"),
//	    ISRAELE(182, "182", Company.ALLEANZA, "ISRAELE", "ISRAELE"),
//	    TERRIT_ANTART_FRANCESE(183, "183", Company.ALLEANZA, "TERRIT. ANTART.FRANCESE", "TERRITORIO ANTARTICO FRANCESE"),
//	    GUINEA_BISSAU(185, "185", Company.ALLEANZA, "GUINEA BISSAU", "GUINEA BISSAU"),
//	    PAPUA_NUOVA_GUINEA(186, "186", Company.ALLEANZA, "PAPUA NUOVA GUINEA", "PAPUA NUOVA GUINEA"),
//	    SAO_TOME_E_PRINCIPE(187, "187", Company.ALLEANZA, "SAO TOME' E PRINCIPE", "SAO TOME' E PRINCIPE"),
//	    CAPO_VERDE(188, "188", Company.ALLEANZA, "CAPO VERDE", "CAPO VERDE"),
//	    SEYCHELLES(189, "189", Company.ALLEANZA, "SEYCHELLES", "SEYCHELLES"),
//	    MALVINE_O_FALKLAND(190, "190", Company.ALLEANZA, "MALVINE O FALKLAND", "MALVINE O FALKLAND"),
//	    SALOMONE(191, "191", Company.ALLEANZA, "SALOMONE", "SALOMONE"),
//	    DOMINICA(192, "192", Company.ALLEANZA, "DOMINICA", "DOMINICA"),
//	    TUVALU(193, "193", Company.ALLEANZA, "TUVALU", "TUVALU"),
//	    KIRIBATI(194, "194", Company.ALLEANZA, "KIRIBATI", "KIRIBATI"),
//	    SAINT_KITTS_E_NEVIS(195, "195", Company.ALLEANZA, "SAINT KITTS E NEVIS", "SAINT KITTS E NEVIS"),
//	    VINCENT_E_GRENADINE(196, "196", Company.ALLEANZA, "VINCENT E GRENADINE", "VINCENT E GRENADINE"),
//	    ANTIGUA_E_BARBUDA(197, "197", Company.ALLEANZA, "ANTIGUA E BARBUDA", "ANTIGUA E BARBUDA"),
//	    BELIZE(198, "198", Company.ALLEANZA, "BELIZE", "BELIZE"),
//	    SAINT_LUCIA(199, "199", Company.ALLEANZA, "SAINT LUCIA", "SAINT LUCIA"),
//	    GROENLANDIA(200, "200", Company.ALLEANZA, "GROENLANDIA", "GROENLANDIA"),
//	    GUERNSEY(201, "201", Company.ALLEANZA, "GUERNSEY", "GUERNSEY"),
//	    JERSEY(202, "202", Company.ALLEANZA, "JERSEY", "JERSEY"),
//	    MAN(203, "203", Company.ALLEANZA, "MAN", "MAN"),
//	    FAER_OER(204, "204", Company.ALLEANZA, "FAER OER", "FAER OER"),
//	    NIUE_O_SAVAGE(205, "205", Company.ALLEANZA, "NIUE O SAVAGE", "NIUE O SAVAGE"),
//	    NAMIBIA(206, "206", Company.ALLEANZA, "NAMIBIA", "NAMIBIA"),
//	    BERMUDE(207, "207", Company.ALLEANZA, "BERMUDE", "BERMUDE"),
//	    MONTSERRAT(208, "208", Company.ALLEANZA, "MONTSERRAT", "MONTSERRAT"),
//	    ANGUILLA_ISOLA(209, "209", Company.ALLEANZA, "ANGUILLA ISOLA", "ANGUILLA ISOLA"),
//	    TURKS_E_CAICOS(210, "210", Company.ALLEANZA, "TURKS E CAICOS", "TURKS E CAICOS"),
//	    CAYMAN_ISLANDS(211, "211", Company.ALLEANZA, "CAYMAN ISLANDS", "CAYMAN ISLANDS"),
//	    ARUBA(212, "212", Company.ALLEANZA, "ARUBA", "ARUBA"),
//	    MARTINICA(213, "213", Company.ALLEANZA, "MARTINICA", "MARTINICA"),
//	    GUADALUPA(214, "214", Company.ALLEANZA, "GUADALUPA", "GUADALUPA"),
//	    MICRONESIA_STATI_FEDERATI(215, "215", Company.ALLEANZA, "MICRONESIA STATI FEDERATI", "MICRONESIA STATI FEDERATI"),
//	    PALAU(216, "216", Company.ALLEANZA, "PALAU", "PALAU"),
//	    MARSHALL(217, "217", Company.ALLEANZA, "MARSHALL", "MARSHALL"),
//	    WALLIS_E_FUTUNA(218, "218", Company.ALLEANZA, "WALLIS E FUTUNA", "WALLIS E FUTUNA"),
//	    MARIANNE(219, "219", Company.ALLEANZA, "MARIANNE", "MARIANNE"),
//	    PUERTO_RICO(220, "220", Company.ALLEANZA, "PUERTO RICO", "PUERTO RICO"),
//	    VERGINI_AMERICANE_ISOLE(221, "221", Company.ALLEANZA, "VERGINI AMERICANE ISOLE", "VERGINI AMERICANE ISOLE"),
//	    SAINT_MARTIN_SETTENT(222, "222", Company.ALLEANZA, "SAINT MARTIN SETTENT.", "SAINT MARTIN SETTENTRIONALE"),
//	    CLIPPERTON(223, "223", Company.ALLEANZA, "CLIPPERTON", "CLIPPERTON"),
//	    POLINESIA(225, "225", Company.ALLEANZA, "POLINESIA", "POLINESIA"),
//	    MAYOTTE(226, "226", Company.ALLEANZA, "MAYOTTE", "MAYOTTE"),
//	    ASCENSION(227, "227", Company.ALLEANZA, "ASCENSION", "ASCENSION"),
//	    GOUGH(228, "228", Company.ALLEANZA, "GOUGH", "GOUGH"),
//	    TRISTAN_DA_CUNHA(229, "229", Company.ALLEANZA, "TRISTAN DA CUNHA", "TRISTAN DA CUNHA"),
//	    CHAFARINAS(230, "230", Company.ALLEANZA, "CHAFARINAS", "CHAFARINAS"),
//	    MELILLA(231, "231", Company.ALLEANZA, "MELILLA", "MELILLA"),
//	    PENON_DE_ALHUCEMAS(232, "232", Company.ALLEANZA, "PENON DE ALHUCEMAS", "PENON DE ALHUCEMAS"),
//	    PENON_DE_VELEZ_DE_LA_GOM(233, "233", Company.ALLEANZA, "PENON DE VELEZ DE LA GOM.", "PENON DE VELEZ DE LA GOMERA"),
//	    AZZORRE_ISOLE(234, "234", Company.ALLEANZA, "AZZORRE ISOLE", "AZZORRE ISOLE"),
//	    MADEIRA(235, "235", Company.ALLEANZA, "MADEIRA", "MADEIRA"),
//	    TOKELAU(236, "236", Company.ALLEANZA, "TOKELAU", "TOKELAU"),
//	    COOK(237, "237", Company.ALLEANZA, "COOK", "COOK"),
//	    ABU_DHABI(238, "238", Company.ALLEANZA, "ABU DHABI", "ABU DHABI"),
//	    AJMAN(239, "239", Company.ALLEANZA, "AJMAN", "AJMAN"),
//	    DUBAI(240, "240", Company.ALLEANZA, "DUBAI", "DUBAI"),
//	    FUUAYRAH(241, "241", Company.ALLEANZA, "FUUAYRAH", "FUUAYRAH"),
//	    RASEL_KHAIMAH(242, "242", Company.ALLEANZA, "RASEL KHAIMAH", "RASEL KHAIMAH"),
//	    SHARIAH(243, "243", Company.ALLEANZA, "SHARIAH", "SHARIAH"),
//	    UNOM_AL_QAIWAIN(244, "244", Company.ALLEANZA, "UNOM AL QAIWAIN", "UNOM AL QAIWAIN"),
//	    TERR_BRIT_OCEANO_INDIANO(245, "245", Company.ALLEANZA, "TERR.BRIT. OCEANO INDIANO", "TERR.BRITANNICO OCEANO INDIANO"),
//	    CELTA(246, "246", Company.ALLEANZA, "CELTA", "CELTA"),
//	    LA_REUNION(247, "247", Company.ALLEANZA, "LA REUNION", "LA REUNION"),
//	    SAINT_PIERRE_ET_MIQUELON(248, "248", Company.ALLEANZA, "SAINT PIERRE ET MIQUELON", "SAINT PIERRE ET MIQUELON"),
//	    VERGINI_BRITANNICHE_ISOLE(249, "249", Company.ALLEANZA, "VERGINI BRITANNICHE ISOLE", "VERGINI BRITANNICHE ISOLE"),
//	    PANAMA_ZONA_DEL_CANALE(250, "250", Company.ALLEANZA, "PANAMA ZONA DEL CANALE", "PANAMA ZONA DEL CANALE"),
//	    ANTILLE_OLANDESI(251, "251", Company.ALLEANZA, "ANTILLE OLANDESI", "ANTILLE OLANDESI"),
//	    IS_AMERICANE_DEL_PACIF(252, "252", Company.ALLEANZA, "IS. AMERICANE DEL PACIF.", "ISOLE AMERICANE DEL PACIFICO"),
//	    NUOVA_CALEDONIA(253, "253", Company.ALLEANZA, "NUOVA CALEDONIA", "NUOVA CALEDONIA"),
//	    SANT_ELENA(254, "254", Company.ALLEANZA, "SANT' ELENA", "SANT' ELENA"),
//	    CHAGOS_ISOLE(255, "255", Company.ALLEANZA, "CHAGOS ISOLE", "CHAGOS ISOLE"),
//	    CAROLINE(256, "256", Company.ALLEANZA, "CAROLINE", "CAROLINE"),
//	    ESTONIA(257, "257", Company.ALLEANZA, "ESTONIA", "ESTONIA"),
//	    LETTONIA(258, "258", Company.ALLEANZA, "LETTONIA", "LETTONIA"),
//	    LITUANIA(259, "259", Company.ALLEANZA, "LITUANIA", "LITUANIA"),
//	    SLOVENIA(260, "260", Company.ALLEANZA, "SLOVENIA", "SLOVENIA"),
//	    CROAZIA(261, "261", Company.ALLEANZA, "CROAZIA", "CROAZIA"),
//	    RUSSIA(262, "262", Company.ALLEANZA, "RUSSIA", "RUSSIA"),
//	    UCRAINA(263, "263", Company.ALLEANZA, "UCRAINA", "UCRAINA"),
//	    BIELORUSSIA(264, "264", Company.ALLEANZA, "BIELORUSSIA", "BIELORUSSIA"),
//	    MOLDAVIA(265, "265", Company.ALLEANZA, "MOLDAVIA", "MOLDAVIA"),
//	    ARMENIA(266, "266", Company.ALLEANZA, "ARMENIA", "ARMENIA"),
//	    GEORGIA(267, "267", Company.ALLEANZA, "GEORGIA", "GEORGIA"),
//	    AZERBAIGIAN(268, "268", Company.ALLEANZA, "AZERBAIGIAN", "AZERBAIGIAN"),
//	    KAZAKISTAN(269, "269", Company.ALLEANZA, "KAZAKISTAN", "KAZAKISTAN"),
//	    KIRGHIZISTAN(270, "270", Company.ALLEANZA, "KIRGHIZISTAN", "KIRGHIZISTAN"),
//	    UZBEKISTAN(271, "271", Company.ALLEANZA, "UZBEKISTAN", "UZBEKISTAN"),
//	    TAGIKISTAN(272, "272", Company.ALLEANZA, "TAGIKISTAN", "TAGIKISTAN"),
//	    TURKMENISTAN(273, "273", Company.ALLEANZA, "TURKMENISTAN", "TURKMENISTAN"),
//	    BOSNIA_ERZEGOVINA(274, "274", Company.ALLEANZA, "BOSNIA ERZEGOVINA", "BOSNIA ERZEGOVINA"),
//	    MACEDONIA(278, "278", Company.ALLEANZA, "MACEDONIA", "MACEDONIA"),
//	    ERITREA(279, "279", Company.ALLEANZA, "ERITREA", "ERITREA"),
//	    REPUBBLICA_SLOVACCA(339, "339", Company.ALLEANZA, "REPUBBLICA SLOVACCA", "REPUBBLICA SLOVACCA"),
//	    SERBIA(340, "340", Company.ALLEANZA, "SERBIA", "SERBIA"),
//	    MONTENEGRO(341, "341", Company.ALLEANZA, "MONTENEGRO", "MONTENEGRO"),
//	    REPUBBLICA_CECA(366, "366", Company.ALLEANZA, "REPUBBLICA CECA", "REPUBBLICA CECA"),
//	    KOSOVO(367, "367", Company.ALLEANZA, "KOSOVO", "KOSOVO"),
//	    SINT_MAARTEN_MERIDIONALE(434, "434", Company.ALLEANZA, "SINT MAARTEN MERIDIONALE", "SINT MAARTEN MERIDIONALE"),
//	    PAESI_NON_CLASSIFICABILI(799, "799", Company.ALLEANZA, "PAESI NON CLASSIFICABILI", "PAESI NON CLASSIFICABILI"),
//	    ALTRO(999, "999", Company.ALLEANZA, "ALTRO", "ALTRO");
//
//	private final Integer internalCode; // SAG legacy ANC coding
//	private final String externalCode; // SAG legacy ANG coding
//	private final Company company;
//	private final String description; // SAG legacy short description
//	private final String longDescription; // SAG legacy long description
//
//	public static AdminArea1Alleanza getByInternalCode(Company company, Integer internalCode) {
//		return Arrays.stream(AdminArea1Alleanza.values()).filter(x -> x.getCompany() == company && x.getInternalCode().equals(internalCode)).findFirst().orElse(null);
//	}
//
//	public static AdminArea1Alleanza getByExternalCode(Company company, String externalCode) {
//		return Arrays.stream(AdminArea1Alleanza.values()).filter(x -> x.getCompany() == company && x.getExternalCode().equals(externalCode)).findFirst().orElse(null);
//	}
//}
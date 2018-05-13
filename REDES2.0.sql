-- phpMyAdmin SQL Dump
-- version 4.7.9
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 13-05-2018 a las 02:58:29
-- Versión del servidor: 10.1.31-MariaDB
-- Versión de PHP: 7.2.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `redes`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alcance`
--

CREATE TABLE `alcance` (
  `CodAlc` int(11) NOT NULL,
  `NomAlc` varchar(10) COLLATE utf8_bin NOT NULL,
  `DesAlc` varchar(40) COLLATE utf8_bin DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `alcance`
--

INSERT INTO `alcance` (`CodAlc`, `NomAlc`, `DesAlc`) VALUES
(220, 'PAN', 'Personal Area Network'),
(230, 'WPAN', 'Wireless Area Network'),
(240, 'LAN', 'Local Area Network'),
(250, 'WLAN', 'Wireless Local Area Network'),
(260, 'CAN', 'Campus Area Network'),
(270, 'MAN', 'Metropolitan Area Network'),
(280, 'WAN', 'Wide Area Network'),
(290, 'SAN', 'Storage Area Network');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `CodCli` int(11) NOT NULL,
  `NomCli` varchar(25) COLLATE utf8_bin NOT NULL,
  `CatCli` varchar(25) COLLATE utf8_bin NOT NULL,
  `SisCli` varchar(25) COLLATE utf8_bin DEFAULT 'Windows 10 Pro',
  `NicCli` varchar(70) COLLATE utf8_bin DEFAULT NULL,
  `MacCli` varchar(17) COLLATE utf8_bin DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=COMPACT;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`CodCli`, `NomCli`, `CatCli`, `SisCli`, `NicCli`, `MacCli`) VALUES
(506, 'ASUS TS 100-E9-M62', 'Sobremesa', 'Windows 10 Pro', 'Edimax EN-9320-TXE', '44:47:L2:C1:CD:32'),
(507, 'Apple Iphone X 256GB', 'Móvil', 'iOS 11', 'Wi-Fi 802.11ac MIMO', '34:6A:C1:S3:LL:30'),
(508, 'Acer Aspire E5-573G', 'Portátil', 'Windows 7 Starter', 'Intel Dual Band Wireless-AC 8265 Wi-Fi', '81:74:20:D2:A9:B3'),
(509, 'Dell Latitude 580', 'Portátil', 'Windows 10 Pro', 'Intel Dual Band Wireless-AC 8265 Wi-Fi', 'G9:F5:S3:22:39:5S'),
(510, 'HL-L5200DW', 'Impresora', 'Windows 8 32 bits', 'Wi-Fi 802.11 ac', '4A:C3:SS:F1:5G:H3'),
(511, 'HP Láser JetPro M254DW', 'Impresora', 'Windows 7 Ultimate', 'Wi-Fi 802.11 b/g/n', '36:61:CD:A3:B9:41'),
(512, 'Epson WorkForce DS-1660W', 'Escáner', 'Windows 7 Starter', 'Wi-Fi 802.11 a/b/g/n', '50:43:F1:V8:J9:21'),
(513, 'Lenovo Legion Y720-151KB', 'Portátil', 'Windows 10 Pro', 'Wireless AC 3165', 'X0:11:10:12:CF:D2'),
(514, 'MSI GT73EVR 7RD-1027XES', 'Portátil', 'Windows 10 Pro', 'Killer DoubleShot Pro', '34:22:D4:21:G5:V8'),
(515, 'ASUS GL702ZC', 'Portátil', 'Debian Gnome', '802.11 a/b/g/n/ac (2x2)', '99:75:88:F2:02:0D'),
(516, 'Acer Swift 3 SF314-51-31M', 'Portátil', 'Fedora', 'Wi-Fi 802.11 ac', '33:55:56:0D:V3:A2'),
(517, 'Denver TIQ-1034310.1', 'Tablet', 'Android  6.0', 'Wi-Fi 802.11 a/b/g/n', 'C0:C6:2D:FF:25:63'),
(518, 'Dell Vostro 3650', 'Sobremesa', 'Arch Linux', '802.11 b/g/n', '20:02:2K:DD:93:34'),
(519, 'Apple MacBook Pro Touch', 'Portátil', 'macOS SIERRA', 'Wi-Fi 802.11 ac', '60:54:F3:G5:FF:V5'),
(520, 'PcCom StartUp2', 'Sobremesa', 'Tails', 'ASUS PCE-N15', '7Y:4K:DD:33:11:21'),
(521, 'Packard Bell iMedia s3730', 'Sobremesa', 'Windows 10 Pro', 'TP-LINK TL-WN881ND', '00:98:3J:F3:C3:22'),
(522, 'Huawei 10 Lite Dual Slim', 'Móvil', 'Android 6.0', 'Wi-Fi 802.11 b/g/n', '4H:JJ:J2:VC:22:10'),
(523, 'Samsung Note 7', 'Móvil', 'Android 6.0', 'Wi-Fi 802.11 a/n', '5J:6K:L2:1L:G7:U9'),
(524, 'BQ Aquaris U2', 'Móvil', 'Android 5.1', 'Wi-Fi 802.11 b/g/n/ac', '0S:3F:C4:E3:W2:1Q'),
(525, 'Lenovo Thinkpad L470', 'Portátil', 'Zorin OS', 'Wi-Fi 802.11 ac', '9D:C5:3E:DD:GF:C5'),
(526, 'HP Desktjet 3729', 'Impresora', 'Windows 10 Educational', 'Wi-Fi 802.11 b/g/n', 'GG:C3:12:00:00:01'),
(527, 'Xiaomi Mi A1', 'Móvil', 'Android 7.0 Nougat', 'Wi-Fi 802.11 ac', '10:1C:4C:2C:5C:10'),
(528, 'Samsung Galaxy J7', 'Móvil', 'Android 7.1 Nougat', 'Wi-Fi 802.11 a/b/g/n/ac', '6J:CC:S4:28:5X:10'),
(529, 'HP Pavilion Power 580-129', 'Sobremesa', 'Windows 10 Home', 'Wi-Fi 802.11 ac', 'DD:C3:56:00:5X:21'),
(530, 'Brother MFC', 'Escáner', 'Windows 8.1', 'Wi-Fi 802.11 b/g/n', 'V4:4D:D3:51:04:35'),
(531, 'Intel Pentium G4400', 'Sobremesa', 'Windows 10 Home', 'Silver Card 2.12', '43:D3:GT:55:23:09'),
(532, 'Iphone 6s', 'Móvil', 'iOS 7', 'Wifi 802.11 a/g/c', 'FF:32:12:75:43:G5'),
(533, 'Asus GForce 451', 'Portátil', 'Windows 7 Starter', 'Edimax 15-GT', 'DJ:23:63:11:10:C3'),
(534, 'Xiaomi Smile 9.0', 'Tablet', 'Android 6.0', 'Wifi 802.11 a/b', 'DD:23:55:72:21:55'),
(535, 'Alcatel First Floor', 'Móvil', 'Android 7.1', 'Wifi 802.11 a/g/n', 'D9:22:23:25:00:1J'),
(536, 'Huaweii Y8', 'Móvil', 'Android 8.00', 'Wifi 802.11 a/g/n', 'N1:22:00:34:76:1K'),
(537, 'Sony VAIO 3300', 'Portátil', 'Windows 10 Pro', 'DevKiller 34', 'DD:74:2F:64:75:24'),
(538, 'Toshiba Berserker 9', 'Portátil', 'Windows 8,1', 'Fav Strock 2.23', 'F3:34:54:27:FF:23'),
(539, 'Epson 2100BCO', 'Escáner', 'Windows Vista', 'Wifi 802.11 a/c', '65:10:01:23:JJ:C3'),
(540, 'HP ServletConn', 'Impresora', 'Windows 7', 'Wifi 802.11 a/g/l', 'C5:5J:41:00:34:01'),
(541, 'Mobb Deep Survival', 'Tablet', 'Android 10.2', 'Wifi 802.11 a/b/n', 'C2:10:69:91:12:30'),
(542, 'Sony Infinite', 'Móvil', 'Android 7.3', 'Wifi 802.11 a/n', 'FD:12:69:83:36:24'),
(543, 'Lenovo ThinkPad 3', 'Portátil', 'Windows 8.2', 'Extract 2000', 'DL:23:63:V4:25:00'),
(544, 'Lenovo IdeaPad 2', 'Portátil', 'Windows 10 Home', 'FetchDev 10', 'DJ:35:72:47:29:33'),
(545, 'LG R8', 'Móvil', 'Android 7', 'Wifi 802.11', 'FF:23:63:47:F4:22'),
(546, 'Xiaomi 2000', 'Tablet', 'Android 9.0', 'Wifi 802.11 a/g/z', 'J4:22:10:46:F3:CC'),
(547, 'Epson 54010A', 'Impresora', 'Windows 10', 'Wifi 802.11 a/b/n', 'CK:34:46:27:3C:D3'),
(548, 'BQ Aquarius', 'Móvil', 'Android 7.5', 'Wifi 802.11 a/b/n/t', 'D2:38:C4:C6:JJ:33'),
(549, 'Sony Bomber 21.0', 'Portátil', 'Windows 10 Home', 'BasicPro 74.5', 'D3:GH:35:12:00:45'),
(550, 'HP Servlet API', 'Escáner', 'Windows Vista', 'Wifi 802.11', '55:C3:T1:29:F3:23');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `enlace`
--

CREATE TABLE `enlace` (
  `CodCli` int(11) NOT NULL,
  `CodSer` int(11) NOT NULL,
  `ProEnl` varchar(100) COLLATE utf8_bin NOT NULL,
  `DisEnl` varchar(25) COLLATE utf8_bin DEFAULT NULL,
  `MedEnl` varchar(25) COLLATE utf8_bin DEFAULT NULL,
  `AlcEnl` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `enlace`
--

INSERT INTO `enlace` (`CodCli`, `CodSer`, `ProEnl`, `DisEnl`, `MedEnl`, `AlcEnl`) VALUES
(522, 700, 'FTP/DCCP/NDP/TCP', 'Gateway', 'Fibra Óptica', 270),
(529, 700, 'L2TP/UDP/SSH', 'Brouter', 'Fibra Óptica', 230),
(508, 701, 'TCP/IP/SMTP', 'Router', 'Fibra Óptica', 230),
(509, 701, 'NDP', 'Gateway', 'Fibra Óptica', 280),
(515, 701, 'DHCP', 'Router', 'Fibra Óptica', 250),
(517, 701, 'HTTP/DNS', 'Router', 'Inalámbrica', 230),
(524, 701, 'IP/ICMP', 'Router', 'Coaxial', 290),
(528, 701, 'FCP/UDP/TCP', 'Puente/Router', 'Fibra Óptica', 250),
(513, 702, 'DNS/DHCP', 'Puente/Modem', 'Coaxial', 270),
(524, 702, 'IGMP/IP', 'Router/Brouter', 'Fibra Óptica', 240),
(506, 704, 'RIP/SMTP/DHCP', 'Puente', 'Fibra Óptica', 220),
(523, 704, 'UTP/SSH/FTP/HTTP', 'Puente', 'Fibra Óptica', 280),
(533, 704, 'RIP/SMTP/DHCP', 'Puente', 'Fibra Óptica', 220),
(514, 705, 'ICMP/DCCP/HTTP', 'Modem', 'Fibra Óptica', 290),
(516, 705, 'TCP/ICMP', 'Hub', 'Coaxial', 240),
(525, 705, 'DCCP/SNMP', 'Router', 'UTP', 250),
(527, 705, 'ETHERNET,L2TP', 'Hub', 'Fibra Óptica', 290),
(544, 705, 'ICMP/DCCP/HTTP', 'Modem', 'Fibra Óptica', 290),
(518, 706, 'DNS/SSH/FTP', 'Repetidor', 'Fibra Óptica', 250),
(527, 706, 'NDP/ARP/IPSEC/DNS', 'Brouter', 'Inalámbrica', 280),
(545, 706, 'FCP/IPSEC', 'Gateway', 'Fibra Óptica', 250),
(507, 708, 'ICMP', 'Router', 'Fibra Óptica', 260),
(537, 708, 'ICMP', 'Router', 'Fibra Óptica', 260),
(512, 709, 'ETHERNET', 'Gateway/Hub', 'Coaxial', 220),
(520, 709, 'DCCP/SNMP/DHCP', 'Router', 'Coaxial', 250),
(519, 710, 'ETHERNET/ARP', 'Repetidor/Brouter', 'Inalámbrica', 230),
(530, 710, 'IGMP/ARP', 'Modem', 'Fibra Óptica', 250),
(540, 710, 'IGMP/ARP', 'Modem', 'Fibra Óptica', 250),
(511, 711, 'IPSEC/IP', 'Hub', 'Inalámbrica', 250),
(512, 711, 'L2TP', 'Puente', 'Fibra Óptica', 250),
(514, 711, 'L2TP', 'Puente', 'Fibra Óptica', 250),
(539, 711, 'NDP', 'Gateway', 'Fibra Óptica', 280),
(541, 711, 'IPSEC/IP', 'Hub', 'Inalámbrica', 250),
(545, 712, 'HTTP/DNS', 'Router', 'Inalámbrica', 230),
(533, 713, 'L2TP/UDP/SSH', 'Brouter', 'Fibra Óptica', 230),
(538, 713, 'TCP/IP/SMTP', 'Router', 'Fibra Óptica', 230),
(520, 714, 'ICMP', 'Repetidor', 'Inalámbrica', 250),
(528, 714, 'UTP/SSH/FTP/HTTP', 'Puente', 'Fibra Óptica', 280),
(537, 714, 'FTP/DCCP/NDP/TCP', 'Gateway', 'Fibra Óptica', 270),
(538, 715, 'FCP/UDP/TCP', 'Puente/Router', 'Fibra Óptica', 250),
(539, 715, 'IGMP/IP', 'Router/Brouter', 'Fibra Óptica', 240),
(542, 715, 'DHCP', 'Router', 'Fibra Óptica', 250),
(545, 715, 'DCCP/SNMP', 'Router', 'UTP', 250),
(546, 715, 'TCP/ICMP', 'Hub', 'Coaxial', 240),
(547, 715, 'ETHERNET,L2TP', 'Hub', 'Fibra Óptica', 290),
(518, 716, 'DNS/SSH/FTP', 'Repetidor', 'Fibra Óptica', 250),
(530, 716, 'ETHERNET/ARP', 'Repetidor/Brouter', 'Inalámbrica', 230),
(547, 716, 'NDP/ARP/IPSEC/DNS', 'Brouter', 'Inalámbrica', 280),
(512, 717, 'ETHERNET', 'Hub/Modem', 'UTP', 240),
(549, 717, 'ETHERNET', 'Gateway/Hub', 'Coaxial', 220),
(521, 719, 'DCCP/SNMP/DHCP', 'Router', 'Coaxial', 250),
(531, 719, 'FTP/HTTP/IGMP', 'Hub/Repetidor', 'Fibra Óptica', 290),
(525, 720, 'DNS/DHCP', 'Puente/Modem', 'Coaxial', 270),
(532, 720, 'IP/ICMP', 'Router', 'Coaxial', 290);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `servidor`
--

CREATE TABLE `servidor` (
  `CodSer` int(11) NOT NULL,
  `NomSer` varchar(30) COLLATE utf8_bin NOT NULL,
  `CatSer` varchar(30) COLLATE utf8_bin NOT NULL,
  `SisSer` varchar(30) COLLATE utf8_bin DEFAULT 'Windows Server 2012',
  `NicSer` varchar(70) COLLATE utf8_bin DEFAULT NULL,
  `MacSer` varchar(17) COLLATE utf8_bin DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `servidor`
--

INSERT INTO `servidor` (`CodSer`, `NomSer`, `CatSer`, `SisSer`, `NicSer`, `MacSer`) VALUES
(700, 'Apache', 'Servidor Web', 'Windows Server 2016', 'HP 647594-B21 Ethernet 1GB', '6J:4F:44:21:5X:08'),
(701, 'Outlook Express', 'Servidor de correo electrónico', 'Red Hat Enterprise Linux', 'Lenovo 00AG520', '33:D2:FD:A3:1G:55'),
(702, 'DB2', 'Servidor de bases de datos', 'Gentoo', 'HP 633-B21', '22:33:34:DE:D4:7G'),
(703, 'Ngnix', 'Servidor Web', 'Windows Server 2016', 'HP Storage AK344A', 'D2:11:F3:D3:04:R2'),
(704, 'GMX', 'Servidor de correo electrónico', 'Windows Server 2012', 'Lenovo 33GTX500-1', 'D3:CV:3F:S2:H6:CC'),
(705, 'Georizen', 'Servidor dedicado', 'Windows Server 2016', 'HP 344-B22', 'DD:22:10:SS:S2:34'),
(706, 'Linux.exe', 'Servidor proxy', 'Fedora', 'Lenovo A240 1GB', 'D4:22:D3:11:10:F4'),
(707, 'bLack_Mirror', 'Servidor de archivos', 'Red Hat Enterprise Linux', 'TP LINK AMADEUS G2043', 'DD:30:5G:D3:DD:2X'),
(708, 'prom.back', 'Servidor de seguridad', 'Windows Server 2012', 'HP ING-510-ER', 'AL:7V:C4:2K:99:90'),
(709, 'pilestacks.org', 'Servidor de acceso remoto', 'Debian', 'LENOVO AKG 2300', 'H4:CV:33:C8:22:10'),
(710, 'fuckstanis', 'Servidor de correo electrónico', 'Red Hat Enterprise Linux', 'HP 400 EE-1', '32:C4:11:20:D4:24'),
(711, 'damn.mediterranean', 'Servidor proxy', 'Windows Server 2012', 'Fastly Down ESP-345', '44:11:43:DD:DD:ED'),
(712, 'aLDerson', 'Servidor proxy', 'Windows Server 2015', 'ASUS FF-C3', 'DD:35:35:FF:D4:25'),
(713, 'ElliotDeStroy', 'Servidor de correo electrónico', 'Debian', 'Lenovo AX-W', 'CH:11:39:C4:H4:CA'),
(714, 'SunCoast1000', 'Servidor dedicado', 'Ubuntu 16', 'Lenovo AX-W', 'C3:23:27:74:F4:CC'),
(715, 'pOOldrown', 'Servidor de seguridad', 'Windows Server 2012', 'AKG-201', 'DD:21:56:C4:J4:F3'),
(716, 'kNIFEbehavior01', 'Servidor de seguridad', 'Fedora', 'Fetch 2000', '44:35:77:01:24:QA'),
(717, 'DEepBlueSeA', 'Servidor proxy', 'Ubuntu Server 2001', 'View Hardcore 2', '2F:35:FF:C4:09:DD'),
(718, 'FREEsummer', 'Servidor de bases de datos', 'Linuz Server 10', 'EF-Sedor-21', 'F3:11:16:63:66:CE'),
(719, 'DROpdownBUSiness', 'Servidor dedicado', 'Windows Server 2014', 'Nvidia 253', 'KL:LL:34:2D:C4:00'),
(720, 'realSmackIntoDATA', 'Servidor de bases de datos', 'Windows Server 2016', 'LL-Logitech 20', 'D2:12:55:V4:C3:DD');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `alcance`
--
ALTER TABLE `alcance`
  ADD PRIMARY KEY (`CodAlc`);

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`CodCli`),
  ADD UNIQUE KEY `MacCli_UNIQUE` (`MacCli`);

--
-- Indices de la tabla `enlace`
--
ALTER TABLE `enlace`
  ADD PRIMARY KEY (`CodSer`,`CodCli`),
  ADD KEY `AlcEnl_idx` (`AlcEnl`),
  ADD KEY `CodCli_idx` (`CodCli`);

--
-- Indices de la tabla `servidor`
--
ALTER TABLE `servidor`
  ADD PRIMARY KEY (`CodSer`),
  ADD UNIQUE KEY `MacSer_UNIQUE` (`MacSer`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `enlace`
--
ALTER TABLE `enlace`
  ADD CONSTRAINT `AlcEnl` FOREIGN KEY (`AlcEnl`) REFERENCES `alcance` (`CodAlc`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `CodCli` FOREIGN KEY (`CodCli`) REFERENCES `cliente` (`CodCli`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `CodSer` FOREIGN KEY (`CodSer`) REFERENCES `servidor` (`CodSer`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

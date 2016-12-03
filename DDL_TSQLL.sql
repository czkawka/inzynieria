SET FOREIGN_KEY_CHECKS=0;



DROP TABLE IF EXISTS ChlodzenieProcesora CASCADE
go
DROP TABLE IF EXISTS DyskTwardy CASCADE
go
DROP TABLE IF EXISTS KartaDzwiekowa CASCADE
go
DROP TABLE IF EXISTS KartaGraficzna CASCADE
go
DROP TABLE IF EXISTS KartaSieciowa CASCADE
go
DROP TABLE IF EXISTS Klawiatura CASCADE
go
DROP TABLE IF EXISTS Komputer CASCADE
go
DROP TABLE IF EXISTS Monitor CASCADE
go
DROP TABLE IF EXISTS Myszka CASCADE
go
DROP TABLE IF EXISTS Nagrywarka CASCADE
go
DROP TABLE IF EXISTS Obudowa CASCADE
go
DROP TABLE IF EXISTS PamieciRam CASCADE
go
DROP TABLE IF EXISTS PlytaGlowna CASCADE
go
DROP TABLE IF EXISTS Procesor CASCADE
go
DROP TABLE IF EXISTS Uzytkownik CASCADE
go
DROP TABLE IF EXISTS Zasilacz CASCADE
go
DROP TABLE IF EXISTS ZestawKomputerowy CASCADE
go

CREATE TABLE ChlodzenieProcesora
(
	chlodzenieID INT NOT NULL,
	obslugiwaneGniazda VARCHAR(50),
	obslugiwaneProcesory VARCHAR(200),
	wymiary VARCHAR(50),
	producent VARCHAR(50),
	urlMiniaturki INT,
	cechyDodatkowe VARCHAR(500),
	typPodzespolu VARCHAR(50),
	PRIMARY KEY (chlodzenieID)

) 
go


CREATE TABLE DyskTwardy
(
	dyskTwardyID INT NOT NULL,
	rodzaj INT,
	pojemnosc INT,
	interfejs VARCHAR(50),
	szybkoscOdczytu INT,
	szybkoscZapisu INT,
	format VARCHAR(50),
	producent VARCHAR(50),
	urlMiniaturki INT,
	cechyDodatkowe VARCHAR(500),
	typPodzespolu VARCHAR(50),
	PRIMARY KEY (dyskTwardyID)

) 
go


CREATE TABLE KartaDzwiekowa
(
	kartaDzwiekowaID INT NOT NULL,
	interfejs VARCHAR(50),
	probkowanie VARCHAR(50),
	czestotliwoscProbkowania INT,
	zlacza VARCHAR(50),
	producent VARCHAR(50),
	urlMiniaturki INT,
	cechyDodatkowe VARCHAR(500),
	typPodzespolu VARCHAR(50),
	PRIMARY KEY (kartaDzwiekowaID)

) 
go


CREATE TABLE KartaGraficzna
(
	kartaGraficznaID INT NOT NULL,
	rodzinaProduktow VARCHAR(50),
	nazwa VARCHAR(50),
	taktowanieRdzenia INT,
	rodzajPamieci VARCHAR(50),
	taktowaniePamieci INT,
	szynaPamieci INT,
	maxRozdzielczosc VARCHAR(50),
	zlacze VARCHAR(50),
	zlaczeZewnetrzne VARCHAR(50),
	producent VARCHAR(50),
	urlMiniaturki INT,
	cechyDodatkowe VARCHAR(500),
	typPodzespolu VARCHAR(50),
	PRIMARY KEY (kartaGraficznaID)

) 
go


CREATE TABLE KartaSieciowa
(
	kartaSieciowaID INT NOT NULL,
	architektura INT,
	zlaczeZewnetrzne INT,
	zlacze INT,
	obslugiwaneProtokoly VARCHAR(50),
	obslugiwaneOS VARCHAR(50),
	wakeOnLan BOOL,
	producent VARCHAR(50),
	cechyDodatkowe VARCHAR(500),
	typPodzespolu VARCHAR(50),
	PRIMARY KEY (kartaSieciowaID)

) 
go


CREATE TABLE Klawiatura
(
	idKlawiatury INT NOT NULL,
	zlacze VARCHAR(50),
	iloscKlawiszy int,
	kolor int,
	rodzaj VARCHAR(50),
	urlMiniaturki INT,
	typPeryferi VARCHAR(50),
	PRIMARY KEY (idKlawiatury)

) 
go


CREATE TABLE Komputer
(
	id BIGINT NOT NULL,
	procesor INT,
	obudowa INT,
	ram INT,
	plytaGl INT,
	dyskiTwarde INT,
	kartaSieciowa INT,
	nagrywarka INT,
	kartaDzwiekowa INT,
	kartaGraficzna INT,
	chlodzenieProcesora INT,
	zasilacz INT,
	PRIMARY KEY (id),
	KEY (chlodzenieProcesora),
	KEY (dyskiTwarde),
	KEY (kartaDzwiekowa),
	KEY (kartaGraficzna),
	KEY (kartaSieciowa),
	KEY (nagrywarka),
	KEY (obudowa),
	KEY (ram),
	KEY (plytaGl),
	KEY (procesor),
	KEY (zasilacz)

) 
go


CREATE TABLE Monitor
(
	idMonitora INT NOT NULL,
	przekatna float(0),
	format VARCHAR(50),
	matryca VARCHAR(50),
	rozdzielczosc VARCHAR(50),
	lizbaKolorow VARCHAR(50),
	Jasnosc int,
	czasReakcji int,
	katWidzeniaV int,
	katWidzieniaH int,
	zlacza VARCHAR(50),
	pobrmocy int,
	urlMiniaturki INT,
	typPeryferi VARCHAR(50),
	PRIMARY KEY (idMonitora)

) 
go


CREATE TABLE Myszka
(
	IdMyszki INT NOT NULL,
	rodzaj VARCHAR(50),
	iloscPrzyciskow int,
	iloscRolek int,
	kolor VARCHAR(50),
	dpi int,
	urlMiniaturki INT,
	typPeryferi VARCHAR(50),
	PRIMARY KEY (IdMyszki)

) 
go


CREATE TABLE Nagrywarka
(
	nagrywarkaID INT NOT NULL,
	rodzaj INT,
	producent VARCHAR(50),
	urlMiniaturki INT,
	cechyDodatkowe VARCHAR(500),
	typPodzespolu VARCHAR(50),
	PRIMARY KEY (nagrywarkaID)

) 
go


CREATE TABLE Obudowa
(
	obudowaID INT NOT NULL,
	kolor VARCHAR(50),
	typ INT,
	kompatybilnePlytyGl INT,
	dodatkoweCechy VARCHAR(50),
	zlacza VARCHAR(50),
	wnekiHDD INT,
	wnekiDVD INT,
	slotyRozszerzen INT,
	wymiary VARCHAR(50),
	producent VARCHAR(50),
	urlMiniaturki INT,
	cechyDodatkowe VARCHAR(500),
	typPodzespolu VARCHAR(50),
	PRIMARY KEY (obudowaID)

) 
go


CREATE TABLE PamieciRam
(
	pamieciRamID INT NOT NULL,
	rodzaj INT,
	predkosc INT,
	pojemnosc INT,
	opoznienie VARCHAR(50),
	napiecie FLOAT(0),
	producent VARCHAR(50),
	urlMiniaturki INT,
	cechyDodatkowe VARCHAR(500),
	typPodzespolu VARCHAR(50),
	PRIMARY KEY (pamieciRamID)

) 
go


CREATE TABLE PlytaGlowna
(
	plytaGlownaID INT NOT NULL,
	iloscSlotowDIMM INT,
	standard INT,
	chipset VARCHAR(50),
	socket VARCHAR(50),
	obslugiwaneRodzajeProc INT,
	kontrolerRaid BOOL,
	rodzajPamieci INT,
	maxWlkPamieci INT,
	kartaDzwiekowa VARCHAR(50),
	dodatkoweTechnologie VARCHAR(50),
	zlaczaWewnetrzne VARCHAR(50),
	zlaczPcieX16 INT,
	zlaczPcieX4 INT,
	zlaczPcieX1 INT,
	zlaczUSB2 INT,
	zlaczUSB3 INT,
	zlaczUSB31 INT,
	format VARCHAR(50),
	producent VARCHAR(50),
	urlMiniaturki INT,
	cechyDodatkowe VARCHAR(500),
	typPodzespo³u VARCHAR(50),
	PRIMARY KEY (plytaGlownaID)

) 
go


CREATE TABLE Procesor
(
	procesorID INT NOT NULL,
	gniazdo VARCHAR(50),
	taktownaieTurbo FLOAT(0),
	taktowanie FLOAT(0),
	nazwa VARCHAR(50),
	kod VARCHAR(50),
	tdp INT,
	liczbaRdzeni INT,
	liczbaWatkow INT,
	igpu BOOL,
	obslugiwaneTechnologie INT,
	obslugiwaneTypyPamieci INT,
	cache INT,
	producent VARCHAR(50),
	urlMiniaturki INT,
	cechyDodatkowe VARCHAR(500),
	typPodzespolu VARCHAR(50),
	PRIMARY KEY (procesorID)

) 
go


CREATE TABLE Uzytkownik
(
	idUzytkownika INT NOT NULL,
	login VARCHAR(50),
	imiona VARCHAR(50),
	nazwisko VARCHAR(50),
	PRIMARY KEY (idUzytkownika)

) 
go


CREATE TABLE Zasilacz
(
	zasilaczID INT NOT NULL,
	wymiary VARCHAR(50),
	moc INT,
	producent VARCHAR(50),
	urlMiniaturki INT,
	cechyDodatkowe VARCHAR(500),
	typPodzespo³u VARCHAR(50),
	PRIMARY KEY (zasilaczID)

) 
go


CREATE TABLE ZestawKomputerowy
(
	idZestawu INT NOT NULL,
	uzytkownik INT,
	Monitor INT,
	Klawiatura INT,
	Myszka INT,
	Komputer BIGINT,
	PRIMARY KEY (idZestawu),
	KEY (Klawiatura),
	KEY (Komputer),
	KEY (Monitor),
	KEY (Myszka),
	KEY (uzytkownik)

) 
go



SET FOREIGN_KEY_CHECKS=1;


ALTER TABLE Komputer ADD CONSTRAINT FK_Komputer_ChlodzenieProcesora 
	FOREIGN KEY (chlodzenieProcesora) REFERENCES ChlodzenieProcesora (chlodzenieID)
go

ALTER TABLE Komputer ADD CONSTRAINT FK_Komputer_DyskTwardy 
	FOREIGN KEY (dyskiTwarde) REFERENCES DyskTwardy (dyskTwardyID)
go

ALTER TABLE Komputer ADD CONSTRAINT FK_Komputer_KartaDzwiekowa 
	FOREIGN KEY (kartaDzwiekowa) REFERENCES KartaDzwiekowa (kartaDzwiekowaID)
go

ALTER TABLE Komputer ADD CONSTRAINT FK_Komputer_KartaGraficzna 
	FOREIGN KEY (kartaGraficzna) REFERENCES KartaGraficzna (kartaGraficznaID)
go

ALTER TABLE Komputer ADD CONSTRAINT FK_Komputer_KartaSieciowa 
	FOREIGN KEY (kartaSieciowa) REFERENCES KartaSieciowa (kartaSieciowaID)
go

ALTER TABLE Komputer ADD CONSTRAINT FK_Komputer_Nagrywarka 
	FOREIGN KEY (nagrywarka) REFERENCES Nagrywarka (nagrywarkaID)
go

ALTER TABLE Komputer ADD CONSTRAINT FK_Komputer_Obudowa 
	FOREIGN KEY (obudowa) REFERENCES Obudowa (obudowaID)
go

ALTER TABLE Komputer ADD CONSTRAINT FK_Komputer_PamieciRam 
	FOREIGN KEY (ram) REFERENCES PamieciRam (pamieciRamID)
go

ALTER TABLE Komputer ADD CONSTRAINT FK_Komputer_PlytaGlowna 
	FOREIGN KEY (plytaGl) REFERENCES PlytaGlowna (plytaGlownaID)
go

ALTER TABLE Komputer ADD CONSTRAINT FK_Komputer_Procesor 
	FOREIGN KEY (procesor) REFERENCES Procesor (procesorID)
go

ALTER TABLE Komputer ADD CONSTRAINT FK_Komputer_Zasilacz 
	FOREIGN KEY (zasilacz) REFERENCES Zasilacz (zasilaczID)
go

ALTER TABLE ZestawKomputerowy ADD CONSTRAINT FK_ZestawKomputerowy_Klawiatura 
	FOREIGN KEY (Klawiatura) REFERENCES Klawiatura (idKlawiatury)
go

ALTER TABLE ZestawKomputerowy ADD CONSTRAINT FK_ZestawKomputerowy_Komputer 
	FOREIGN KEY (Komputer) REFERENCES Komputer (id)
go

ALTER TABLE ZestawKomputerowy ADD CONSTRAINT FK_ZestawKomputerowy_Monitor 
	FOREIGN KEY (Monitor) REFERENCES Monitor (idMonitora)
go

ALTER TABLE ZestawKomputerowy ADD CONSTRAINT FK_ZestawKomputerowy_Myszka 
	FOREIGN KEY (Myszka) REFERENCES Myszka (IdMyszki)
go

ALTER TABLE ZestawKomputerowy ADD CONSTRAINT FK_ZestawKomputerowy_Uzytkownik 
	FOREIGN KEY (uzytkownik) REFERENCES Uzytkownik (idUzytkownika)
go

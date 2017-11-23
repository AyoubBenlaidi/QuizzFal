CREATE TABLE `insgines` (
  `id_insgines` int(11) NOT NULL AUTO_INCREMENT,
  `insigne` varchar(255) NOT NULL,
  `decernement` varchar(255) NOT NULL,
  `sens1` varchar(255) NOT NULL,
  `sens2` varchar(255) DEFAULT NULL,
  `sens3` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_insgines`)
) ENGINE=MyISAM AUTO_INCREMENT=102 DEFAULT CHARSET=latin1;

CREATE TABLE `emblemes` (
  `id_emblemes` int(11) NOT NULL AUTO_INCREMENT,
  `embleme` varchar(255) NOT NULL,
  `filiere1` varchar(255) NOT NULL,
  `filiere2` varchar(255) DEFAULT NULL,
  `filiere3` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_emblemes`)
) ENGINE=MyISAM AUTO_INCREMENT=33 DEFAULT CHARSET=latin1;

CREATE TABLE `circulaires` (
  `id_circulaire` int(11) NOT NULL AUTO_INCREMENT,
  `matiere` varchar(255) NOT NULL,
  `couleur` varchar(255) NOT NULL,
  `filiere1` varchar(255) NOT NULL,
  `filiere2` varchar(255) DEFAULT NULL,
  `filiere3` varchar(255) DEFAULT NULL,
  `filiere4` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_circulaire`)
) ENGINE=MyISAM AUTO_INCREMENT=25 DEFAULT CHARSET=latin1;
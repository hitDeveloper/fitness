CREATE TABLE `tb_users` (
  `uID` int(11) NOT NULL,
  `username` varchar(45) DEFAULT 'null',
  `password` varchar(45) DEFAULT 'null' COMMENT '鐢ㄦ埛鍩烘湰淇℃伅',
  `number` varchar(20) DEFAULT 'null',
  `college` varchar(45) DEFAULT 'null',
  PRIMARY KEY (`uID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
CREATE TABLE `tb_admin` (
  `aID` INT NOT NULL,
  `password` VARCHAR(45) NULL,
  `adminName` VARCHAR(45) NULL,
  `gymName` VARCHAR(100) NULL,
  PRIMARY KEY (`aID`))
ENGINE = InnoDB DEFAULT CHARSET=utf8;
CREATE TABLE `tb_gym` (
  `usedNumber` VARCHAR(45) NULL,
  `totalNumber` VARCHAR(45) NULL,
  `adminName` VARCHAR(45) NULL,
  `time` VARCHAR(45) NULL,
  `telNumber` VARCHAR(45) NULL,
  `price` VARCHAR(100) NULL,
  `introduction` VARCHAR(999) NULL,
  `news` VARCHAR(999) NULL
) ENGINE = InnoDB DEFAULT CHARSET=utf8;


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
  `gymName` VARCHAR(45) NOT NULL,
  `usedNumber` VARCHAR(45) NULL,
  `totalNumber` VARCHAR(45) NULL,
  `manager` VARCHAR(45) NULL,
  `time` VARCHAR(45) NULL,
  `telNumber` VARCHAR(45) NULL,
  `price` VARCHAR(100) NULL,
  `news` VARCHAR(999) NULL,
  `introduction` VARCHAR(999) NULL,
  PRIMARY KEY (`gymName`)
) ENGINE = InnoDB DEFAULT CHARSET=utf8;
CREATE TABLE `tb_book` (
  `gymName` VARCHAR(45) NOT NULL,
  `userName` VARCHAR(45) NULL,
  `booktime` VARCHAR(45) NULL
) ENGINE = InnoDB DEFAULT CHARSET=utf8;
CREATE TABLE `tb_plan` (
  `pID` int(11) NOT NULL,
  `introduction` VARCHAR(999) NULL,
  PRIMARY KEY (`pID`)
) ENGINE = InnoDB DEFAULT CHARSET=utf8;
CREATE TABLE `tb_info` (
  `userName` VARCHAR(45) NOT NULL,
  `age` VARCHAR(45) NULL,
  `height` VARCHAR(45) NULL,
  `weight` VARCHAR(45) NULL,
  `payTime` VARCHAR(45) NULL,
  `gender` VARCHAR(45) NULL,
  `hobby` VARCHAR(45) NULL,
  PRIMARY KEY (`userName`)
) ENGINE = InnoDB DEFAULT CHARSET=utf8;
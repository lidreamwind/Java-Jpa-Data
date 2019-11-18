# Java-Jpa-Data
how to use jpa with all db type.

1、有一个例子，是many to one 和one to many
  代码路径：src/main/java/com.lph.spring.dev.ManyToOne 包下。
  
  创建表的语句如下：
  CREATE TABLE `student` (
  `student_id` int(11) NOT NULL,
  `name` varchar(30) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  PRIMARY KEY (`student_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
  
  CREATE TABLE `couurse_student` (
  `id` int(11) DEFAULT NULL,
  `course_id` int(11) DEFAULT NULL,
  `student_id` int(11) NOT NULL,
  `course_student_id` int(11) NOT NULL,
  KEY `FK39446dci5ot8114bulhj4uhf4` (`student_id`),
  CONSTRAINT `FK39446dci5ot8114bulhj4uhf4` FOREIGN KEY (`student_id`) REFERENCES `student` (`student_id`) //不需要指定
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

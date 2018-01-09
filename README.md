# SpringBatchPractice
Required:
1. jdk1.8
2. to change your spring datasource config
spring.datasource.url = jdbc:mysql://localhost:3306/[your_db_name]
spring.datasource.username = [username]
spring.datasource.password = [userpassword]
spring.datasource.driver-class-name = com.mysql.jdbc.Driver

3. database tables of student and employee:
student
+---------+-------------+------+-----+---------+----------------+
| Field   | Type        | Null | Key | Default | Extra          |
+---------+-------------+------+-----+---------+----------------+
| id      | int(11)     | NO   | PRI | NULL    | auto_increment |
| name    | varchar(20) | YES  |     | NULL    |                |
| age     | int(11)     | YES  |     | NULL    |                |
| score   | float       | YES  |     | NULL    |                |
| grade   | int(11)     | YES  |     | NULL    |                |
| courses | varchar(50) | YES  |     | NULL    |                |
| photo   | longblob    | YES  |     | NULL    |                |
| memo    | text        | YES  |     | NULL    |                |
+---------+-------------+------+-----+---------+----------------+

employee
+--------------+-------------+------+-----+---------+----------------+
| Field        | Type        | Null | Key | Default | Extra          |
+--------------+-------------+------+-----+---------+----------------+
| id           | int(11)     | NO   | PRI | NULL    | auto_increment |
| name         | varchar(20) | YES  |     | NULL    |                |
| age          | int(11)     | YES  |     | NULL    |                |
| gender       | int(11)     | YES  |     | NULL    |                |
| salary       | float       | YES  |     | NULL    |                |
| hireDate     | date        | YES  |     | NULL    |                |
| hireType     | int(11)     | YES  |     | NULL    |                |
| isProbation  | int(11)     | YES  |     | NULL    |                |
| hire_date    | datetime    | YES  |     | NULL    |                |
| hire_type    | int(11)     | YES  |     | NULL    |                |
| is_probation | int(11)     | YES  |     | NULL    |                |
+--------------+-------------+------+-----+---------+----------------+

/***************************************************************************************************************/
Write the database tables while startup project, and you can clean records for new testing like below(if your job step's attribute of allowStartIfComplete not true, you must clear the step's history records before next testing):

delete from batch_job_execution_context;
delete from batch_job_execution_params;
delete from batch_job_execution_seq; 
delete from batch_job_seq;
delete from batch_step_execution_context;
delete from batch_step_execution_seq;

delete from batch_step_execution;
delete from batch_job_execution;
delete from batch_job_instance; 

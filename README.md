# SpringBatchPractice
Required:
1. jdk1.8
2. to change your spring datasource config
spring.datasource.url = jdbc:mysql://localhost:3306/[your_db_name]
spring.datasource.username = [username]
spring.datasource.password = [userpassword]
spring.datasource.driver-class-name = com.mysql.jdbc.Driver

3. database tables of student and employee(sql file in directory of 'resources/')


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

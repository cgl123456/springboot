package com.demo.springboot.Test;

/**
 * Created by cgl on 2018/3/21
 */
public class QuartzTest {
    // Initiate a Schedule Factory
//    SchedulerFactory schedulerFactory = new StdSchedulerFactory();
//    // Retrieve a scheduler from schedule factory
//    Scheduler scheduler = schedulerFactory.getScheduler();
//
//    // current time
//    long ctime = System.currentTimeMillis();
//
//    // Initiate JobDetail with job name, job group, and executable job class
//    JobDetail jobDetail =
//        new JobDetail("jobDetail-s1", "jobDetailGroup-s1", SimpleQuartzJob.class);
//    // Initiate SimpleTrigger with its name and group name
//    SimpleTrigger simpleTrigger =
//        new SimpleTrigger("simpleTrigger", "triggerGroup-s1");
//    // set its start up time
//    simpleTrigger.setStartTime(new Date(ctime));
//    // set the interval, how often the job should run (10 seconds here)
//    simpleTrigger.setRepeatInterval(10000);
//    // set the number of execution of this job, set to 10 times.
//    // It will run 10 time and exhaust.
//    simpleTrigger.setRepeatCount(100);
//    // set the ending time of this job.
//    // We set it for 60 seconds from its startup time here
//    // Even if we set its repeat count to 10,
//    // this will stop its process after 6 repeats as it gets it endtime by then.
//    //simpleTrigger.setEndTime(new Date(ctime + 60000L));
//    // set priority of trigger. If not set, the default is 5
//    //simpleTrigger.setPriority(10);
//    // schedule a job with JobDetail and Trigger
//    scheduler.scheduleJob(jobDetail, simpleTrigger);
//
//    // start the scheduler
//    scheduler.start();
}

package com.example.android.ssoeuniversity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import java.util.ArrayList;

public class DetailActivity extends AppCompatActivity {

    private static final String TAG = "DetailActivity";
    private ArrayList<String> mName = new ArrayList<>();
    private ArrayList<String> mAuthor = new ArrayList<>();
    private ArrayList<String> mContent = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Log.d(TAG, "onCreate: opened");
        createData();
        getIncomingIntent();

    }

    void getIncomingIntent() {

        String location = getIntent().getStringExtra("location");
        Log.d(TAG, "getIncomingIntent: location = " + location);

        setDetail(location);


    }

    void setDetail(String location) {

        TextView title = findViewById(R.id.title_tv);
        TextView author = findViewById(R.id.author_tv);
        TextView content = findViewById(R.id.content_tv);


        Log.d(TAG, "setDetail: " + location);

        title.setText(mName.get(Integer.parseInt(location)));
        author.setText(mAuthor.get(Integer.parseInt(location)));
        content.setText(mContent.get(Integer.parseInt(location)));


    }

    private void createData() {

        // 1.1a
        mName.add("Safety First - with BIM 360 Field");
        mAuthor.add("Lauren Collier, Department Manager (VDC, Toledo); Scott Goodwin, Safety Manager (Toledo); & Mitch Cornelius (Autodesk) ");
        mContent.add("This class will “safely” introduce how to integrate BIM 360 Field software into our U.S. and China construction safety program. As SSOE focuses on data driven work flows and is looking to start using BIM 360 Field, safety is an excellent place to start. A safety first culture is all about being both preventative and proactive on our job sites. We’ll explore the creation of custom checklists and how to create templates for consistency across projects. The presentation will guide you through the application, providing some tips and tricks to being successful in data collection even beyond just safety. The second part of the presentation will look at the open BIM 360 API (application programming interface). We’ll share live project dashboards to replace your stagnant weekly or monthly summaries—but, more importantly, to assist you in making safer decisions for your projects. The activity trends are now more visible to the construction teams and owners, allowing for both praise and corrective actions to occur. In conclusion, we will highlight how the China office are using BIM 360 Field on projects with success.");
        // 1.1b
        mName.add("The Whole Package: Delivering a Plant 3D Project from P&ID and Specification");
        mAuthor.add("Brad Kowalinski, BIM / CAD Technical Coordinator & Kurt Huss, Project VDC / BIM Specialist (Toledo)");
        mContent.add("This class will cover using Plant 3D to create a typical project and show users what is involved in kicking off a new project. The goal is to emphasize the importance of a well-defined scope with deliverables and a well-coordinated model management team early in a project to get the most out of our Plant 3D software. We will walk through a simple project assuming a client will want the full process. Then, we will show how to create a smart P&ID, route piping from the P&ID in our 3D model, and generate a Plan drawing orthographic as well as Piping isometrics. ");
        //1.1c
        mName.add("Naviworks Timeliner (Schedule, Group, Action!");
        mAuthor.add("Cesar Alvarado Adaya, Project VDC / BIM Specialist (Mexico)");
        mContent.add("This hands on presentation will give you the experience of scheduling inside Naviworks, importing from Microsoft Project or CSV, and scheduling and dropping all the model elements that need assigned in their respective task in order to create a 4D simulation. We will also cover some advanced techniques about how to use a more detailed programing simulation. ");


        //1.2a
        mName.add("The Collaborative Model and the Checking Process");
        mAuthor.add("Jonathan Krager, Architect 6, (AMF, Brentwood)  ");
        mContent.add("This roundtable discussion is intended to be a follow-up of last year's \"All in the Family\" session (not a pre-requisite). In this session, the 3D Data Checking Initiative will be presented along with a discussion of challenges as direct feedback to this initiative. We need your help to get from theory to reality and are looking for input from a diverse user base. If you have ideas for how to improve the quality of our 3D content, this is your opportunity to shape the future of how SSOE utilizes BIM data.");
        //1.2b
        mName.add("Large File Conversions and Simplification");
        mAuthor.add("Mike Loughman, Project VDC / BIM Specialist (EGCM) & Shane Jamerson, BIM / CAD Technical Coordinator (Toledo)");
        mContent.add("What do Revit and Plant 3D users do with large STEP or SAT files (or other conversions)? How do we help get information into each other’s projects when vendor files are too large? Your local Inventor guy can help answer these questions! ");
        //1.2c
        mName.add("Revit Automatio");
        mAuthor.add("Gayathri Kankipati, Project VDC / BIM Coordinator (VDC, Toledo) & Swapnil Raut, BIM / CAD Technical Coordinator (Mumbai)");
        mContent.add("This class will cover use of Dynamo software to automate unique project goals in Revit. This workflow will help users understand how to interact with models and manage model information. Most of the tedious tasks and workflows in Revit can be automated with just a button click in Dynamo. ");


        //1.3a
        mName.add("You Scream, I Scream, We All Scream for Help! Lessons Learned from a 3D Design Team");
        mAuthor.add("David Rizo, Department Manager, (EGCM); Shane Jamerson, BIM / CAD Technical Coordinator; & Kurt Huss, Project VDC / BIM Specialist (EGCM, Toledo) ");
        mContent.add("We will discuss issues that arose between disciplines and the different 3D CAD packages and how these issues were recognized and discussed during the life of the project. Next, we will cover what methods were taken to determine resolutions and how this impacted the schedule and budget. The presentation will also go through team technical issues with CAD and how they were handled. After the project designs were completed, a Lessons Learned meeting was held and a team was formed to investigate solutions and work on action items. We will discuss the resolutions found to date and open items that we are still working on. ");
        //1.3b
        mName.add("The VDC Gauntlet - How the Proper Mix of Software and Collaboration Can Render the Most Challenging Projects Trivia");
        mAuthor.add("Tony Sabat, BIM / CAD Technical Specialist (Portage)");
        mContent.add("What began with a simple question turned into the utilization of the full gamut of Autodesk and other software tools to properly and safely plan the logistics and process of removing/replacing three Sugar tanks in what some would consider a confined space. This talk will walk through the task at hand and how collaboration and a combination of software packages were utilized to properly plan and redesign the process for successful installation. Software used includes: AutoCAD, AutoCAD Civil 3D, Vehicle Tracking, SketchUp, Naviworks, Google Earth, ReCap, and UAV Photogrammetry. ");
        //1.3c
        mName.add("The Virtual Realm of Lumion");
        mAuthor.add("Trevor McMahon, Architect 1 (HCE, Troy) & Vanessa Woods, Architect 1 (HCE, Troy) ");
        mContent.add("This class will go through the process used to create a Lumion rendering and a virtual reality walk-through. It will begin where we begin - with physical samples, then will go through drawings and how to prepare a Revit model for Lumion. After that, we will discuss the details that go into creating a successful rendering or walk-through. We will show how the actual built environment relates to the virtual reality and how this software can help the client visualize a space. ");

        //1.4a
        mName.add("BIM2FAB STEEL - Driving Greater Value to our Customers");
        mAuthor.add("Jessica Dandino, Designer 3 & Josh Zimmerman, Section Manager (BIM2FAB, Toledo) ");
        mContent.add("This class will explain what the BIM2Fab Steel Detailing department does, as well as examples of process and services. Jessica and Josh will go over the advantages of having detailing services included in our engineering jobs and client benefits. A demonstration will show necessary Revit model details. There will also be examples of final output of fabrication drawings and the types of electronic files we provide the fabricator to aid in the fabrication / erection process. Jessica and Josh will provide an example of how our detailing model can be used for clash detection with the structural model and other discipline models in Naviworks. Finally, the pair will answer the question: “When is the best time for Steel Detailing to get involved in the project to maximize time and cost benefits?” ");
        //1.4b
        mName.add("Ask a Programme");
        mAuthor.add("James Malcolm, VDC Technical Leader, (VDC) & Jonathan Bolbach, BIM / CAD Technical Specialist (Toledo) ");
        mContent.add("In this roundtable, attendees will discuss automation ideas with other experts and get input directly from experienced programmers on what it would take to make their ideas a reality. We will work out rough high-level scope definitions and discuss a budget and timeline for each idea we discuss. The programmers hosting the round table will discuss how those ideas might be implemented and whether they're fully custom solutions or something they know can be purchased. Attendees are expected to either bring an idea to the table or be ready to give constructive feedback on the ideas of others. ");
        //1.4c
        mName.add("Lost and Found in Translation: Moving Files between Inventor, Revit, and Plant 3");
        mAuthor.add("Shane Jamerson, Brad Kowalinski, & Josh Churchill, BIM / CAD Technical Coordinators (Toledo) ");
        mContent.add("Translating files for use between Inventor, Revit, and Plant 3D can be cumbersome if certain work flows are not followed. With this hands on session, we’ll give users the opportunity to create files that are meant to be opened and referenced in other software by multiple departments during the 3D design stage. ");


        //2.0 - A/B/C all will be there.
        mName.add("Project Profiles");
        mAuthor.add("NIH, DTE, Sentury Tire, GM Conveyor Study, DOW, MOD2");
        mContent.add("15 minute profiles of: NIH - Scott Kluegel; DTE - Bob Siebenaller; Sentury Tire - David Johnson; DOW - Rick Fox; MOD2 Restart (Laterals) – Charles; OC - David Rizo; GM - Zac Taranto");

        //2.1a
        mName.add("BIM2FAB: The Setbacks and Triumph");
        mAuthor.add("Katie King, Project VDC / BIM Specialist (AT, Hillsboro) ");
        mContent.add("The presentation will cover challenges that the team faced from both a designer point of view and a model manager's point of view. It will include the requirements set by the client and the standards the team had to follow, as well as the solutions used to hit those standards and quality. This project within BIM2FAB has been recognized by the client's tool owner and other contractors to set the bar for quality and teamwork. Plus, there will be a sneak peek in the updated Meantools for electrical fabrication. ");
        //2.1b
        mName.add("Keeping Collaboration Civil: The Importance of Geolocatio");
        mAuthor.add("Tony Sabat, BIM / CAD Technical Specialist (Portage) ");
        mContent.add("Geolocation is a concept foreign to most and pivotal to few. As a civil engineer by background, geolocation and real world coordinates are key to most of the designs I work or collaborate on. Tony will talk about how proper geolocation throughout a project can be done successfully as well as streamline a project. Topics will cover how other programs talk and consume geolocation and how we can keep collaboration civil between programs like Revit and AutoCAD with Infraworks and Civil 3D.  ");

        //2.1c
        mName.add("Bluebeam Revu Studio Session");
        mAuthor.add("Jon Evans, BIM / CAD Technical Specialist (Troy)");
        mContent.add("We will walk through the various parts of the Studio system. This will be a total hands on class with a quick overview and then we will walk into creating, attending, connecting, and trouble-shooting the studio system. There is no need to know anything about the system at all, we will walk through the class as if you are a total beginner to Bluebeam as well as the Studio system.");

        //2.2a
        mName.add("Are you In or Out?: Exporting and Importing Data with Plant 3D");
        mAuthor.add("Brad Kowalinski, BIM / CAD Technical Coordinator & Kurt Huss, Project VDC / BIM Specialist (Toledo)");
        mContent.add("In this class, we will show the basics of exporting data using the various methods available within Plant 3D software and then show the means to re-import data and reconcile this data on P&IDs. The focus will be on what can and cannot be done within the constraints of the program and best practices as well as some possible lessons learned from real project experience. ");
        //2.2b
        mName.add("How About a Nice Hawaiian Punch-list?");
        mAuthor.add("Daniel Wyckoff, Architect 5 (HCE, Cincinnati) ");
        mContent.add("This presentation will cover how to maximize the tools in Bluebeam and Bluebeam Revu to improve contractor response to quality control and spend less time at the keyboard. Learn field tested methodology on how to manipulate and create a database of information linked to a PDF copy of any drawing. ");
        //2.2c
        mName.add("The Art of the Famil");
        mAuthor.add("Ryan Kelley, Designer 3 (AT, Hillsboro) ");
        mContent.add("This presentation will share valuable knowledge on family fundamentals and advanced techniques.");

        //2.3a
        mName.add("Commitment to People: Using Kanban to Create Fluidity");
        mAuthor.add("David Semproch, Department Manager (AMF, Toledo) ");
        mContent.add("What is Kanban? How can it speed up work and create efficiencies? Learn about the Kanban method, created by software pioneer David J. Anderson, and Kanban boards, an organizational approach that breaks work down into a manageable, commitment based iteration plan.");
        //2.3b
        mName.add("Navisworks Simulate as a Designer's Too");
        mAuthor.add("Richard Brennan, Designer 5 (EGCM, Toledo) ");
        mContent.add("The primary objective is to show features of Naviworks Simulate, which may be new to many today. Primarily we will cover updating \"live\" changes from a 3D model to do real-time clash resolution or changes for a client allowing us to iterate more quickly. Other features include basic navigation and measuring tools and sectioning views, which is quite powerful especially on large projects or projects with point clouds, as well as other features.");
        //2.3c
        mName.add("Capturing Your Client’s Reality on Small Projects with SSOE's Laser Scanner Made Eas");
        mAuthor.add("Mark LaBell, Sr. VDC Technical Leader (VDC, Toledo)");
        mContent.add("This class will cover how to use SSOE's BLK scanner on projects. Currently, SSOE has used the scanner on 20+ projects in 3 months of ownership with discussions of purchasing more scanners in the future. With the expansion of scanners at SSOE, this class will show users how to use the device and process the data for project use. We train the user before they go to the field in 60 minutes and the results have helped teams achieve solid as-builts where there was no record drawings. This class will be that training and will also show how to process the data after scanning is complete. ");

        //2.4a
        mName.add("It’s all about the Plan! BIM Execution Plan that is....");
        mAuthor.add("Lauren Collier, Department Manager (VDC, Toledo) ");
        mContent.add("The industry has been BIM planning now for many years. You may notice large agencies / owners Penn State, USACE and AGC BIM Forum have very familiar templates because SSOE’s is actually a blend of all three with our own twist. The class will cover the different sections and purposes of the BIM Plan. It will explain how this becomes the framework for the project team as well as contract language for project execution. We will discuss the current state of the templates and then do break out brainstorming to improve adoption and usage. The goal of the course is to have the class walk away confident in the ability to create and communicate BIM plans. ");
        //2.4b
        mName.add("“Moving Mountains: Getting Large Clients on Board with New Technologies and the Cloud");
        mAuthor.add("Charles Berteaux IV, Section Manager (AT, Hillsboro) ");
        mContent.add("This presentation will cover our two and a half year long journey moving Intel to the cloud. It will go through what it took to get there, declassifying IP, re-writing construction specs and contracts, OOC, Syncplicity, and In-house tools as well as achievements and fails along the way. ");
        //2.4c
        mName.add("Diagramming the System");
        mAuthor.add("David Johnson, Engineer 4 (AMF, Toledo)");
        mContent.add("The class will focus on the groundwork of building system logic diagrams, which generally use a set of symbolic notation. At the heart of every building system project is communication of system components and functionality. In our current state, communicating this logic is made tedious when considering the multitude of technology platforms and other media that must be negotiated to take a concept to a finalized document. It is especially difficult and inconvenient to build a diagram without a solid set of parts from which to build. In order to clean up this process, it makes sense to develop a standard set of symbolic notation that will function and look the same across multiple platforms. With this in mind, the class will focus on ways to create and use these essential elements and techniques to share them across technology platforms while preserving the integrity of their appearance. The class will also focus on improving the efficiency of working with these symbolic notations to remove some of the tediousness of a highly repetitive process. ");

    }

}


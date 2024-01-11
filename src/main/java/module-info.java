module com.pigcat {
    requires java.compiler;

    provides javax.annotation.processing.Processor
            with com.pigcat.TestProc;

    exports com.pigcat;
}
package org.infra;

import java.io.IOException;

public interface ManipulationAction {
    void manipulate(String inputFile, String outputFile) throws IOException;
}
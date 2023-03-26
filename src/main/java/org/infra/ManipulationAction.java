package org.infra;

import java.io.File;
import java.io.IOException;

public interface ManipulationAction {
    void manipulate(File inputFile, File outputFile) throws IOException;
}
package org.mario;

import org.mario.extraction.Orchestrator;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Orchestrator.extractionOrchestrator(args[0], args[1]);
    }
}
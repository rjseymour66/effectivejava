package edu.rseymour.java.creatinganddestroyingobjects;

import java.io.*;

/**
 * If you use resources, you must invoke the .close() method when you are done
 * with them. It is common to use try-finally blocks, but try-with-resources is
 * better because you can track exceptions better.
 *
 * When more than one exception is thrown, secondary exceptions are suppressed,
 * so you see the exception that you want to see. However, the other exceptions
 * are printed in the stack trace.
 *
 * The resource must implement the AutoCloseable interface.
 */
public class PreferTryWithResourcesToTryFinally {

    private static final int BUFFER_SIZE = 100;

    static String firstLineOfFile(String path) throws IOException {
        try (BufferedReader br = new BufferedReader(
                new FileReader(path))) {
            return br.readLine();
        }
    }

    static void copy(String src, String dst) throws IOException {
        try (InputStream in = new FileInputStream(src);
            OutputStream out = new FileOutputStream(dst)) {
            byte[] buf = new byte[BUFFER_SIZE];
            int n;
            while ((n = in.read(buf)) >= 0)
                out.write(buf, 0, n);
        }
    }
}

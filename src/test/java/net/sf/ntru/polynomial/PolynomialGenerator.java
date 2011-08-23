/**
 * This software is dual-licensed. You may choose either the
 * Non-Profit Open Software License version 3.0, or any license
 * agreement into which you enter with Security Innovation, Inc.
 * 
 * Use of this code, or certain portions thereof, implements
 * inventions covered by claims of one or more of the following
 * U.S. Patents and/or foreign counterpart patents, owned by
 * Security Innovation, Inc.:
 * 7,308,097, 7,031,468, 6,959,085, 6,298,137, and 6,081,597.
 * Practice or sale of the inventions embodied in the code hereof
 * requires a license from Security Innovation Inc. at:
 * 
 * 187 Ballardvale St, Suite A195
 * Wilmington, MA 01887
 * USA
 */

package net.sf.ntru.polynomial;

import java.util.Random;

import net.sf.ntru.polynomial.IntegerPolynomial;

public class PolynomialGenerator {
    
    /**
     * Creates a random polynomial with <code>N</code> coefficients
     * between <code>0</code> and <code>q-1</code>.
     * @param N length of the polynomial
     * @param q coefficients will all be below this number
     * @return a random polynomial
     */
    public static IntegerPolynomial generateRandom(int N, int q) {
        Random rng = new Random();
        int[] coeffs = new int[N];
        for (int i=0; i<N; i++)
            coeffs[i] = rng.nextInt(q);
        return new IntegerPolynomial(coeffs);
    }
}
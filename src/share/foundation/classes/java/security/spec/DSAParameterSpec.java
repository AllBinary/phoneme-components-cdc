/*
 * @(#)DSAParameterSpec.java	1.19 06/10/10
 *
 * Copyright  1990-2008 Sun Microsystems, Inc. All Rights Reserved.  
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER  
 *   
 * This program is free software; you can redistribute it and/or  
 * modify it under the terms of the GNU General Public License version  
 * 2 only, as published by the Free Software Foundation.   
 *   
 * This program is distributed in the hope that it will be useful, but  
 * WITHOUT ANY WARRANTY; without even the implied warranty of  
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU  
 * General Public License version 2 for more details (a copy is  
 * included at /legal/license.txt).   
 *   
 * You should have received a copy of the GNU General Public License  
 * version 2 along with this work; if not, write to the Free Software  
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  
 * 02110-1301 USA   
 *   
 * Please contact Sun Microsystems, Inc., 4150 Network Circle, Santa  
 * Clara, CA 95054 or visit www.sun.com if you need additional  
 * information or have any questions. 
 *
 */

package java.security.spec;

import java.math.BigInteger;

/**
 * This class specifies the set of parameters used with the DSA algorithm.
 * 
 * @author Jan Luehe
 *
 * @version 1.13, 02/02/00
 *
 * @see AlgorithmParameterSpec
 *
 * @since 1.2
 */

public class DSAParameterSpec implements AlgorithmParameterSpec,
java.security.interfaces.DSAParams {

    BigInteger p;
    BigInteger q;
    BigInteger g;

    /**
     * Creates a new DSAParameterSpec with the specified parameter values.
     * 
     * @param p the prime.
     * 
     * @param q the sub-prime.
     * 
     * @param g the base.
     */
    public DSAParameterSpec(BigInteger p, BigInteger q, BigInteger g) {
	this.p = p;
	this.q = q;
	this.g = g;
    }

    /**
     * Returns the prime <code>p</code>.
     *
     * @return the prime <code>p</code>.
     */
    public BigInteger getP() {
	return this.p;
    }

    /**
     * Returns the sub-prime <code>q</code>.
     *
     * @return the sub-prime <code>q</code>.
     */
    public BigInteger getQ() {
	return this.q;
    }

    /**
     * Returns the base <code>g</code>.
     *
     * @return the base <code>g</code>.
     */
    public BigInteger getG() {
	return this.g;
    }    
}

/*
 * MIT License
 * 
 * Copyright (c) 2019 Cepos e Mabecos
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and
 * associated documentation files (the "Software"), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge, publish, distribute,
 * sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT
 * NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.ceposmabecos.places;

import java.io.Serializable;

/**
 * 
 * @author <a href="https://brenosalles.com" target="_blank">Breno</a>
 *
 * @since 1.0
 * @version 1.1
 * 
 */
public class Place implements Serializable {
  private static final long serialVersionUID = 5233792969868971769L;

  /*
   * Attributes
   */
  private String postalCode;
  private String locality;

  /*
   * Constructor
   */
  public Place(String postalCode, String locality) {
    this.postalCode = postalCode;
    this.locality = locality;
  }

  /*
   * Getters and Setters
   */
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public String getLocality() {
    return locality;
  }

  public void setLocality(String locality) {
    this.locality = locality;
  }

  /*
   * String toString
   */
  @Override
  public String toString() {
    return this.getPostalCode() + "," + this.getLocality();
  }
}
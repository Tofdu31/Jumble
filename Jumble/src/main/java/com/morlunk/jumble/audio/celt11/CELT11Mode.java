/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.morlunk.jumble.audio.celt11;

public class CELT11Mode {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CELT11Mode(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CELT11Mode obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CELT11JNI.delete_CELT11Mode(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public CELT11Mode() {
    this(CELT11JNI.new_CELT11Mode(), true);
  }

}
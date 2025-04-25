class X8 {
    double pro() {
        return 1.2;
    }
}


class H extends X8 {
    // overriding method must return double... (same primitive type...)
    float pro() {
        return 3.4f;
    }
}

/*H.java:10: error: pro() in H cannot override pro() in X8
    float pro() {
          ^
  return type float is not compatible with double
1 error*/
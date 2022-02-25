package com.cpprhtn.chapter7;

class TVCR extends Tv{
    VCR vcr = new VCR();
    int counter = vcr.counter;

    void play() {
        vcr.play();
    }

    void stop() {
        vcr.stop();
    }

    void rew() {
        vcr.rew();
    }

    void ff() {
        vcr.ff();
    }
}

class VCR {
    boolean power;
    int counter = 0;
    void power() { 	power = !power; }
    void play()  { /* ... */ }
    void stop()  { /* ... */ }
    void rew()   { /* ... */ }
    void ff()    { /* ... */ }
}

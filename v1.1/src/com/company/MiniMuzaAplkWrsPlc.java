package com.company;

import javax.sound.midi.*;

public class MiniMuzaAplkWrsPlc {

  public void graj(int instrument, int nuta){
      try{
          Sequencer sekwenser = MidiSystem.getSequencer();
          sekwenser.open();

          Sequence sekw = new Sequence(Sequence.PPQ, 4);
          Track sciezka = sekw.createTrack();

          MidiEvent zdarzenie = null;

          ShortMessage pierwszy = new ShortMessage();
          pierwszy.setMessage(192, 1, instrument, 0);
          MidiEvent zmienInstrument = new MidiEvent(pierwszy, 1);
          sciezka.add(zmienInstrument);

          ShortMessage a = new ShortMessage();
          a.setMessage(144, 1, nuta, 100);
          MidiEvent nutaP = new MidiEvent(a, 1);
          sciezka.add(nutaP);

          ShortMessage b = new ShortMessage();
          b.setMessage(128, 1, nuta, 100);
          MidiEvent nutaK = new MidiEvent(b, 16);
          sciezka.add(nutaK);
          sekwenser.setSequence(sekw);
          sekwenser.start();

      }catch (Exception ex) {
          ex.printStackTrace();
      }
  }
}

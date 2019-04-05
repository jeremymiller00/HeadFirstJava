import java.util.*;

class V2Radiator {
  V2Radiator(ArrayList list) {
    for (int x=0; x<5; x++) {
      list.add(new SimUnit("Radiator"));
    }  
  }
}

class V3Radiator extends V2Radiator {
  V3Radiator(ArrayList lglist) {
    super(lglist);
    for (int g=0; g<10; g++) {
      lglist.add(new SimUnit("Radiator"));
    }
  }
}

class RetentionBot {
  RetentionBot(ArrayList rlist) {
    rlist.add(new simUnit("Retention"));
  }
}

class SimUnit {
  String botType;
  SimUnit(String type) {
    botType = type;
  }
  int powerUse() {
    if ("Retention".equals(botType)) {
      return 2;
    } else {
      return 4;
    }
  }
}


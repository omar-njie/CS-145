package com.omar.learn.cs145_from_re.enums;

/**
 * @author Omar
 * @version 10/7/22
 */
public enum Cereals {
    CAPTAIN_CRUNCH(40),
    CHEERIOS(30),
    CINNAMON_TOAST_CRUNCH(50),
    COCO_PUFFS(40),
    CORN_POPS(30);

    final int levelOfDeliciousness;

    Cereals(int levelOfDeliciousness) {
        this.levelOfDeliciousness = levelOfDeliciousness;
    }

}

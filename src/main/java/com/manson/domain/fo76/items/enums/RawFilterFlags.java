package com.manson.domain.fo76.items.enums;

public interface RawFilterFlags {
  long FILTER_FAVORITES = 1 << 0;

  long FILTER_WEAPONS = 1 << 2;

  long FILTER_ARMOR = 1 << 3;

  long FILTER_APPAREL = 1 << 4;

  long FILTER_FOODWATER = 1 << 5;

  long FILTER_AID = 1 << 6;

  long FILTER_BOOKS = 1 << 10;

  long FILTER_MISC = 1 << 12;

  long FILTER_JUNK = 1 << 13;

  long FILTER_MODS = 1 << 14;

  long FILTER_AMMO = 1 << 15;

  long FILTER_HOLOTAPES = 1 << 16;

  long FILTER_CANAUTOSCRAP = 1 << 18;

  long FILTER_ALL = 4294967295L;
}

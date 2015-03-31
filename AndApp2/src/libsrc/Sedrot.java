package libsrc;

public class Sedrot
{
  private static final byte[] LeapMondayCompleteDiaspora;
  private static final byte[] LeapMondayCompleteIsrael;
  private static final byte[] LeapMondayIncompleteDiaspora;
  private static final byte[] LeapMondayIncompleteIsrael;
  private static final byte[] LeapSaturdayCompleteDiaspora;
  private static final byte[] LeapSaturdayCompleteIsrael;
  private static final byte[] LeapSaturdayIncomplete;
  private static final byte[] LeapThursdayComplete;
  private static final byte[] LeapThursdayIncomplete;
  private static final byte[] LeapTuesdayRegularDiaspora;
  private static final byte[] LeapTuesdayRegularIsrael;
  private static final byte[] NonleapMondayCompleteDiaspora;
  private static final byte[] NonleapMondayCompleteIsrael;
  private static final byte[] NonleapMondayIncomplete;
  private static final byte[] NonleapSaturdayComplete;
  private static final byte[] NonleapSaturdayIncomplete;
  private static final byte[] NonleapThursdayComplete;
  private static final byte[] NonleapThursdayRegularDiaspora;
  private static final byte[] NonleapThursdayRegularIsrael;
  private static final byte[] NonleapTuesdayRegularDiaspora;
  private static final byte[] NonleapTuesdayRegularIsrael;
  private static final byte[][][] SedraYearsMonday;
  private static final byte[][][][] SedraYearsReference;
  private static final byte[][][] SedraYearsSaturday;
  private static final byte[][][] SedraYearsThursday;
  private static final byte[][][] SedraYearsTuesday;
  private static final int YEAR_TYPE_COMPLETE = 2;
  private static final int YEAR_TYPE_INCOMPLETE = 0;
  private static final int YEAR_TYPE_REGULAR = 1;

  static
  {
    byte[] arrayOfByte1 = new byte[50];
    arrayOfByte1[0] = 51;
    arrayOfByte1[1] = 52;
    arrayOfByte1[2] = -1;
    arrayOfByte1[4] = 1;
    arrayOfByte1[5] = 2;
    arrayOfByte1[6] = 3;
    arrayOfByte1[7] = 4;
    arrayOfByte1[8] = 5;
    arrayOfByte1[9] = 6;
    arrayOfByte1[10] = 7;
    arrayOfByte1[11] = 8;
    arrayOfByte1[12] = 9;
    arrayOfByte1[13] = 10;
    arrayOfByte1[14] = 11;
    arrayOfByte1[15] = 12;
    arrayOfByte1[16] = 13;
    arrayOfByte1[17] = 14;
    arrayOfByte1[18] = 15;
    arrayOfByte1[19] = 16;
    arrayOfByte1[20] = 17;
    arrayOfByte1[21] = 18;
    arrayOfByte1[22] = 19;
    arrayOfByte1[23] = 20;
    arrayOfByte1[24] = -21;
    arrayOfByte1[25] = 23;
    arrayOfByte1[26] = 24;
    arrayOfByte1[27] = -1;
    arrayOfByte1[28] = 25;
    arrayOfByte1[29] = -26;
    arrayOfByte1[30] = -28;
    arrayOfByte1[31] = 30;
    arrayOfByte1[32] = -31;
    arrayOfByte1[33] = 33;
    arrayOfByte1[34] = 34;
    arrayOfByte1[35] = 35;
    arrayOfByte1[36] = 36;
    arrayOfByte1[37] = 37;
    arrayOfByte1[38] = 38;
    arrayOfByte1[39] = 39;
    arrayOfByte1[40] = 40;
    arrayOfByte1[41] = -41;
    arrayOfByte1[42] = 43;
    arrayOfByte1[43] = 44;
    arrayOfByte1[44] = 45;
    arrayOfByte1[45] = 46;
    arrayOfByte1[46] = 47;
    arrayOfByte1[47] = 48;
    arrayOfByte1[48] = 49;
    arrayOfByte1[49] = -50;
    NonleapMondayIncomplete = arrayOfByte1;
    byte[] arrayOfByte2 = new byte[50];
    arrayOfByte2[0] = 51;
    arrayOfByte2[1] = 52;
    arrayOfByte2[2] = -1;
    arrayOfByte2[4] = 1;
    arrayOfByte2[5] = 2;
    arrayOfByte2[6] = 3;
    arrayOfByte2[7] = 4;
    arrayOfByte2[8] = 5;
    arrayOfByte2[9] = 6;
    arrayOfByte2[10] = 7;
    arrayOfByte2[11] = 8;
    arrayOfByte2[12] = 9;
    arrayOfByte2[13] = 10;
    arrayOfByte2[14] = 11;
    arrayOfByte2[15] = 12;
    arrayOfByte2[16] = 13;
    arrayOfByte2[17] = 14;
    arrayOfByte2[18] = 15;
    arrayOfByte2[19] = 16;
    arrayOfByte2[20] = 17;
    arrayOfByte2[21] = 18;
    arrayOfByte2[22] = 19;
    arrayOfByte2[23] = 20;
    arrayOfByte2[24] = -21;
    arrayOfByte2[25] = 23;
    arrayOfByte2[26] = 24;
    arrayOfByte2[27] = -1;
    arrayOfByte2[28] = 25;
    arrayOfByte2[29] = -26;
    arrayOfByte2[30] = -28;
    arrayOfByte2[31] = 30;
    arrayOfByte2[32] = -31;
    arrayOfByte2[33] = 33;
    arrayOfByte2[34] = -1;
    arrayOfByte2[35] = 34;
    arrayOfByte2[36] = 35;
    arrayOfByte2[37] = 36;
    arrayOfByte2[38] = 37;
    arrayOfByte2[39] = -38;
    arrayOfByte2[40] = 40;
    arrayOfByte2[41] = -41;
    arrayOfByte2[42] = 43;
    arrayOfByte2[43] = 44;
    arrayOfByte2[44] = 45;
    arrayOfByte2[45] = 46;
    arrayOfByte2[46] = 47;
    arrayOfByte2[47] = 48;
    arrayOfByte2[48] = 49;
    arrayOfByte2[49] = -50;
    NonleapMondayCompleteDiaspora = arrayOfByte2;
    NonleapMondayCompleteIsrael = NonleapMondayIncomplete;
    NonleapTuesdayRegularDiaspora = NonleapMondayCompleteDiaspora;
    NonleapTuesdayRegularIsrael = NonleapMondayIncomplete;
    byte[] arrayOfByte3 = new byte[51];
    arrayOfByte3[0] = 52;
    arrayOfByte3[1] = -1;
    arrayOfByte3[2] = -1;
    arrayOfByte3[4] = 1;
    arrayOfByte3[5] = 2;
    arrayOfByte3[6] = 3;
    arrayOfByte3[7] = 4;
    arrayOfByte3[8] = 5;
    arrayOfByte3[9] = 6;
    arrayOfByte3[10] = 7;
    arrayOfByte3[11] = 8;
    arrayOfByte3[12] = 9;
    arrayOfByte3[13] = 10;
    arrayOfByte3[14] = 11;
    arrayOfByte3[15] = 12;
    arrayOfByte3[16] = 13;
    arrayOfByte3[17] = 14;
    arrayOfByte3[18] = 15;
    arrayOfByte3[19] = 16;
    arrayOfByte3[20] = 17;
    arrayOfByte3[21] = 18;
    arrayOfByte3[22] = 19;
    arrayOfByte3[23] = 20;
    arrayOfByte3[24] = -21;
    arrayOfByte3[25] = 23;
    arrayOfByte3[26] = 24;
    arrayOfByte3[27] = -1;
    arrayOfByte3[28] = -1;
    arrayOfByte3[29] = 25;
    arrayOfByte3[30] = -26;
    arrayOfByte3[31] = -28;
    arrayOfByte3[32] = 30;
    arrayOfByte3[33] = -31;
    arrayOfByte3[34] = 33;
    arrayOfByte3[35] = 34;
    arrayOfByte3[36] = 35;
    arrayOfByte3[37] = 36;
    arrayOfByte3[38] = 37;
    arrayOfByte3[39] = 38;
    arrayOfByte3[40] = 39;
    arrayOfByte3[41] = 40;
    arrayOfByte3[42] = -41;
    arrayOfByte3[43] = 43;
    arrayOfByte3[44] = 44;
    arrayOfByte3[45] = 45;
    arrayOfByte3[46] = 46;
    arrayOfByte3[47] = 47;
    arrayOfByte3[48] = 48;
    arrayOfByte3[49] = 49;
    arrayOfByte3[50] = 50;
    NonleapThursdayRegularDiaspora = arrayOfByte3;
    byte[] arrayOfByte4 = new byte[51];
    arrayOfByte4[0] = 52;
    arrayOfByte4[1] = -1;
    arrayOfByte4[2] = -1;
    arrayOfByte4[4] = 1;
    arrayOfByte4[5] = 2;
    arrayOfByte4[6] = 3;
    arrayOfByte4[7] = 4;
    arrayOfByte4[8] = 5;
    arrayOfByte4[9] = 6;
    arrayOfByte4[10] = 7;
    arrayOfByte4[11] = 8;
    arrayOfByte4[12] = 9;
    arrayOfByte4[13] = 10;
    arrayOfByte4[14] = 11;
    arrayOfByte4[15] = 12;
    arrayOfByte4[16] = 13;
    arrayOfByte4[17] = 14;
    arrayOfByte4[18] = 15;
    arrayOfByte4[19] = 16;
    arrayOfByte4[20] = 17;
    arrayOfByte4[21] = 18;
    arrayOfByte4[22] = 19;
    arrayOfByte4[23] = 20;
    arrayOfByte4[24] = -21;
    arrayOfByte4[25] = 23;
    arrayOfByte4[26] = 24;
    arrayOfByte4[27] = -1;
    arrayOfByte4[28] = 25;
    arrayOfByte4[29] = -26;
    arrayOfByte4[30] = -28;
    arrayOfByte4[31] = 30;
    arrayOfByte4[32] = 31;
    arrayOfByte4[33] = 32;
    arrayOfByte4[34] = 33;
    arrayOfByte4[35] = 34;
    arrayOfByte4[36] = 35;
    arrayOfByte4[37] = 36;
    arrayOfByte4[38] = 37;
    arrayOfByte4[39] = 38;
    arrayOfByte4[40] = 39;
    arrayOfByte4[41] = 40;
    arrayOfByte4[42] = -41;
    arrayOfByte4[43] = 43;
    arrayOfByte4[44] = 44;
    arrayOfByte4[45] = 45;
    arrayOfByte4[46] = 46;
    arrayOfByte4[47] = 47;
    arrayOfByte4[48] = 48;
    arrayOfByte4[49] = 49;
    arrayOfByte4[50] = 50;
    NonleapThursdayRegularIsrael = arrayOfByte4;
    byte[] arrayOfByte5 = new byte[51];
    arrayOfByte5[0] = 52;
    arrayOfByte5[1] = -1;
    arrayOfByte5[2] = -1;
    arrayOfByte5[4] = 1;
    arrayOfByte5[5] = 2;
    arrayOfByte5[6] = 3;
    arrayOfByte5[7] = 4;
    arrayOfByte5[8] = 5;
    arrayOfByte5[9] = 6;
    arrayOfByte5[10] = 7;
    arrayOfByte5[11] = 8;
    arrayOfByte5[12] = 9;
    arrayOfByte5[13] = 10;
    arrayOfByte5[14] = 11;
    arrayOfByte5[15] = 12;
    arrayOfByte5[16] = 13;
    arrayOfByte5[17] = 14;
    arrayOfByte5[18] = 15;
    arrayOfByte5[19] = 16;
    arrayOfByte5[20] = 17;
    arrayOfByte5[21] = 18;
    arrayOfByte5[22] = 19;
    arrayOfByte5[23] = 20;
    arrayOfByte5[24] = 21;
    arrayOfByte5[25] = 22;
    arrayOfByte5[26] = 23;
    arrayOfByte5[27] = 24;
    arrayOfByte5[28] = -1;
    arrayOfByte5[29] = 25;
    arrayOfByte5[30] = -26;
    arrayOfByte5[31] = -28;
    arrayOfByte5[32] = 30;
    arrayOfByte5[33] = -31;
    arrayOfByte5[34] = 33;
    arrayOfByte5[35] = 34;
    arrayOfByte5[36] = 35;
    arrayOfByte5[37] = 36;
    arrayOfByte5[38] = 37;
    arrayOfByte5[39] = 38;
    arrayOfByte5[40] = 39;
    arrayOfByte5[41] = 40;
    arrayOfByte5[42] = -41;
    arrayOfByte5[43] = 43;
    arrayOfByte5[44] = 44;
    arrayOfByte5[45] = 45;
    arrayOfByte5[46] = 46;
    arrayOfByte5[47] = 47;
    arrayOfByte5[48] = 48;
    arrayOfByte5[49] = 49;
    arrayOfByte5[50] = 50;
    NonleapThursdayComplete = arrayOfByte5;
    byte[] arrayOfByte6 = new byte[51];
    arrayOfByte6[0] = -1;
    arrayOfByte6[1] = 52;
    arrayOfByte6[2] = -1;
    arrayOfByte6[3] = -1;
    arrayOfByte6[5] = 1;
    arrayOfByte6[6] = 2;
    arrayOfByte6[7] = 3;
    arrayOfByte6[8] = 4;
    arrayOfByte6[9] = 5;
    arrayOfByte6[10] = 6;
    arrayOfByte6[11] = 7;
    arrayOfByte6[12] = 8;
    arrayOfByte6[13] = 9;
    arrayOfByte6[14] = 10;
    arrayOfByte6[15] = 11;
    arrayOfByte6[16] = 12;
    arrayOfByte6[17] = 13;
    arrayOfByte6[18] = 14;
    arrayOfByte6[19] = 15;
    arrayOfByte6[20] = 16;
    arrayOfByte6[21] = 17;
    arrayOfByte6[22] = 18;
    arrayOfByte6[23] = 19;
    arrayOfByte6[24] = 20;
    arrayOfByte6[25] = -21;
    arrayOfByte6[26] = 23;
    arrayOfByte6[27] = 24;
    arrayOfByte6[28] = -1;
    arrayOfByte6[29] = 25;
    arrayOfByte6[30] = -26;
    arrayOfByte6[31] = -28;
    arrayOfByte6[32] = 30;
    arrayOfByte6[33] = -31;
    arrayOfByte6[34] = 33;
    arrayOfByte6[35] = 34;
    arrayOfByte6[36] = 35;
    arrayOfByte6[37] = 36;
    arrayOfByte6[38] = 37;
    arrayOfByte6[39] = 38;
    arrayOfByte6[40] = 39;
    arrayOfByte6[41] = 40;
    arrayOfByte6[42] = -41;
    arrayOfByte6[43] = 43;
    arrayOfByte6[44] = 44;
    arrayOfByte6[45] = 45;
    arrayOfByte6[46] = 46;
    arrayOfByte6[47] = 47;
    arrayOfByte6[48] = 48;
    arrayOfByte6[49] = 49;
    arrayOfByte6[50] = 50;
    NonleapSaturdayIncomplete = arrayOfByte6;
    byte[] arrayOfByte7 = new byte[51];
    arrayOfByte7[0] = -1;
    arrayOfByte7[1] = 52;
    arrayOfByte7[2] = -1;
    arrayOfByte7[3] = -1;
    arrayOfByte7[5] = 1;
    arrayOfByte7[6] = 2;
    arrayOfByte7[7] = 3;
    arrayOfByte7[8] = 4;
    arrayOfByte7[9] = 5;
    arrayOfByte7[10] = 6;
    arrayOfByte7[11] = 7;
    arrayOfByte7[12] = 8;
    arrayOfByte7[13] = 9;
    arrayOfByte7[14] = 10;
    arrayOfByte7[15] = 11;
    arrayOfByte7[16] = 12;
    arrayOfByte7[17] = 13;
    arrayOfByte7[18] = 14;
    arrayOfByte7[19] = 15;
    arrayOfByte7[20] = 16;
    arrayOfByte7[21] = 17;
    arrayOfByte7[22] = 18;
    arrayOfByte7[23] = 19;
    arrayOfByte7[24] = 20;
    arrayOfByte7[25] = -21;
    arrayOfByte7[26] = 23;
    arrayOfByte7[27] = 24;
    arrayOfByte7[28] = -1;
    arrayOfByte7[29] = 25;
    arrayOfByte7[30] = -26;
    arrayOfByte7[31] = -28;
    arrayOfByte7[32] = 30;
    arrayOfByte7[33] = -31;
    arrayOfByte7[34] = 33;
    arrayOfByte7[35] = 34;
    arrayOfByte7[36] = 35;
    arrayOfByte7[37] = 36;
    arrayOfByte7[38] = 37;
    arrayOfByte7[39] = 38;
    arrayOfByte7[40] = 39;
    arrayOfByte7[41] = 40;
    arrayOfByte7[42] = -41;
    arrayOfByte7[43] = 43;
    arrayOfByte7[44] = 44;
    arrayOfByte7[45] = 45;
    arrayOfByte7[46] = 46;
    arrayOfByte7[47] = 47;
    arrayOfByte7[48] = 48;
    arrayOfByte7[49] = 49;
    arrayOfByte7[50] = -50;
    NonleapSaturdayComplete = arrayOfByte7;
    byte[] arrayOfByte8 = new byte[54];
    arrayOfByte8[0] = 51;
    arrayOfByte8[1] = 52;
    arrayOfByte8[2] = -1;
    arrayOfByte8[4] = 1;
    arrayOfByte8[5] = 2;
    arrayOfByte8[6] = 3;
    arrayOfByte8[7] = 4;
    arrayOfByte8[8] = 5;
    arrayOfByte8[9] = 6;
    arrayOfByte8[10] = 7;
    arrayOfByte8[11] = 8;
    arrayOfByte8[12] = 9;
    arrayOfByte8[13] = 10;
    arrayOfByte8[14] = 11;
    arrayOfByte8[15] = 12;
    arrayOfByte8[16] = 13;
    arrayOfByte8[17] = 14;
    arrayOfByte8[18] = 15;
    arrayOfByte8[19] = 16;
    arrayOfByte8[20] = 17;
    arrayOfByte8[21] = 18;
    arrayOfByte8[22] = 19;
    arrayOfByte8[23] = 20;
    arrayOfByte8[24] = 21;
    arrayOfByte8[25] = 22;
    arrayOfByte8[26] = 23;
    arrayOfByte8[27] = 24;
    arrayOfByte8[28] = 25;
    arrayOfByte8[29] = 26;
    arrayOfByte8[30] = 27;
    arrayOfByte8[31] = -1;
    arrayOfByte8[32] = 28;
    arrayOfByte8[33] = 29;
    arrayOfByte8[34] = 30;
    arrayOfByte8[35] = 31;
    arrayOfByte8[36] = 32;
    arrayOfByte8[37] = 33;
    arrayOfByte8[38] = -1;
    arrayOfByte8[39] = 34;
    arrayOfByte8[40] = 35;
    arrayOfByte8[41] = 36;
    arrayOfByte8[42] = 37;
    arrayOfByte8[43] = -38;
    arrayOfByte8[44] = 40;
    arrayOfByte8[45] = -41;
    arrayOfByte8[46] = 43;
    arrayOfByte8[47] = 44;
    arrayOfByte8[48] = 45;
    arrayOfByte8[49] = 46;
    arrayOfByte8[50] = 47;
    arrayOfByte8[51] = 48;
    arrayOfByte8[52] = 49;
    arrayOfByte8[53] = -50;
    LeapMondayIncompleteDiaspora = arrayOfByte8;
    byte[] arrayOfByte9 = new byte[54];
    arrayOfByte9[0] = 51;
    arrayOfByte9[1] = 52;
    arrayOfByte9[2] = -1;
    arrayOfByte9[4] = 1;
    arrayOfByte9[5] = 2;
    arrayOfByte9[6] = 3;
    arrayOfByte9[7] = 4;
    arrayOfByte9[8] = 5;
    arrayOfByte9[9] = 6;
    arrayOfByte9[10] = 7;
    arrayOfByte9[11] = 8;
    arrayOfByte9[12] = 9;
    arrayOfByte9[13] = 10;
    arrayOfByte9[14] = 11;
    arrayOfByte9[15] = 12;
    arrayOfByte9[16] = 13;
    arrayOfByte9[17] = 14;
    arrayOfByte9[18] = 15;
    arrayOfByte9[19] = 16;
    arrayOfByte9[20] = 17;
    arrayOfByte9[21] = 18;
    arrayOfByte9[22] = 19;
    arrayOfByte9[23] = 20;
    arrayOfByte9[24] = 21;
    arrayOfByte9[25] = 22;
    arrayOfByte9[26] = 23;
    arrayOfByte9[27] = 24;
    arrayOfByte9[28] = 25;
    arrayOfByte9[29] = 26;
    arrayOfByte9[30] = 27;
    arrayOfByte9[31] = -1;
    arrayOfByte9[32] = 28;
    arrayOfByte9[33] = 29;
    arrayOfByte9[34] = 30;
    arrayOfByte9[35] = 31;
    arrayOfByte9[36] = 32;
    arrayOfByte9[37] = 33;
    arrayOfByte9[38] = 34;
    arrayOfByte9[39] = 35;
    arrayOfByte9[40] = 36;
    arrayOfByte9[41] = 37;
    arrayOfByte9[42] = 38;
    arrayOfByte9[43] = 39;
    arrayOfByte9[44] = 40;
    arrayOfByte9[45] = -41;
    arrayOfByte9[46] = 43;
    arrayOfByte9[47] = 44;
    arrayOfByte9[48] = 45;
    arrayOfByte9[49] = 46;
    arrayOfByte9[50] = 47;
    arrayOfByte9[51] = 48;
    arrayOfByte9[52] = 49;
    arrayOfByte9[53] = -50;
    LeapMondayIncompleteIsrael = arrayOfByte9;
    byte[] arrayOfByte10 = new byte[55];
    arrayOfByte10[0] = 51;
    arrayOfByte10[1] = 52;
    arrayOfByte10[2] = -1;
    arrayOfByte10[4] = 1;
    arrayOfByte10[5] = 2;
    arrayOfByte10[6] = 3;
    arrayOfByte10[7] = 4;
    arrayOfByte10[8] = 5;
    arrayOfByte10[9] = 6;
    arrayOfByte10[10] = 7;
    arrayOfByte10[11] = 8;
    arrayOfByte10[12] = 9;
    arrayOfByte10[13] = 10;
    arrayOfByte10[14] = 11;
    arrayOfByte10[15] = 12;
    arrayOfByte10[16] = 13;
    arrayOfByte10[17] = 14;
    arrayOfByte10[18] = 15;
    arrayOfByte10[19] = 16;
    arrayOfByte10[20] = 17;
    arrayOfByte10[21] = 18;
    arrayOfByte10[22] = 19;
    arrayOfByte10[23] = 20;
    arrayOfByte10[24] = 21;
    arrayOfByte10[25] = 22;
    arrayOfByte10[26] = 23;
    arrayOfByte10[27] = 24;
    arrayOfByte10[28] = 25;
    arrayOfByte10[29] = 26;
    arrayOfByte10[30] = 27;
    arrayOfByte10[31] = -1;
    arrayOfByte10[32] = -1;
    arrayOfByte10[33] = 28;
    arrayOfByte10[34] = 29;
    arrayOfByte10[35] = 30;
    arrayOfByte10[36] = 31;
    arrayOfByte10[37] = 32;
    arrayOfByte10[38] = 33;
    arrayOfByte10[39] = 34;
    arrayOfByte10[40] = 35;
    arrayOfByte10[41] = 36;
    arrayOfByte10[42] = 37;
    arrayOfByte10[43] = 38;
    arrayOfByte10[44] = 39;
    arrayOfByte10[45] = 40;
    arrayOfByte10[46] = -41;
    arrayOfByte10[47] = 43;
    arrayOfByte10[48] = 44;
    arrayOfByte10[49] = 45;
    arrayOfByte10[50] = 46;
    arrayOfByte10[51] = 47;
    arrayOfByte10[52] = 48;
    arrayOfByte10[53] = 49;
    arrayOfByte10[54] = 50;
    LeapMondayCompleteDiaspora = arrayOfByte10;
    byte[] arrayOfByte11 = new byte[55];
    arrayOfByte11[0] = 51;
    arrayOfByte11[1] = 52;
    arrayOfByte11[2] = -1;
    arrayOfByte11[4] = 1;
    arrayOfByte11[5] = 2;
    arrayOfByte11[6] = 3;
    arrayOfByte11[7] = 4;
    arrayOfByte11[8] = 5;
    arrayOfByte11[9] = 6;
    arrayOfByte11[10] = 7;
    arrayOfByte11[11] = 8;
    arrayOfByte11[12] = 9;
    arrayOfByte11[13] = 10;
    arrayOfByte11[14] = 11;
    arrayOfByte11[15] = 12;
    arrayOfByte11[16] = 13;
    arrayOfByte11[17] = 14;
    arrayOfByte11[18] = 15;
    arrayOfByte11[19] = 16;
    arrayOfByte11[20] = 17;
    arrayOfByte11[21] = 18;
    arrayOfByte11[22] = 19;
    arrayOfByte11[23] = 20;
    arrayOfByte11[24] = 21;
    arrayOfByte11[25] = 22;
    arrayOfByte11[26] = 23;
    arrayOfByte11[27] = 24;
    arrayOfByte11[28] = 25;
    arrayOfByte11[29] = 26;
    arrayOfByte11[30] = 27;
    arrayOfByte11[31] = -1;
    arrayOfByte11[32] = 28;
    arrayOfByte11[33] = 29;
    arrayOfByte11[34] = 30;
    arrayOfByte11[35] = 31;
    arrayOfByte11[36] = 32;
    arrayOfByte11[37] = 33;
    arrayOfByte11[38] = 34;
    arrayOfByte11[39] = 35;
    arrayOfByte11[40] = 36;
    arrayOfByte11[41] = 37;
    arrayOfByte11[42] = 38;
    arrayOfByte11[43] = 39;
    arrayOfByte11[44] = 40;
    arrayOfByte11[45] = 41;
    arrayOfByte11[46] = 42;
    arrayOfByte11[47] = 43;
    arrayOfByte11[48] = 44;
    arrayOfByte11[49] = 45;
    arrayOfByte11[50] = 46;
    arrayOfByte11[51] = 47;
    arrayOfByte11[52] = 48;
    arrayOfByte11[53] = 49;
    arrayOfByte11[54] = 50;
    LeapMondayCompleteIsrael = arrayOfByte11;
    LeapTuesdayRegularDiaspora = LeapMondayCompleteDiaspora;
    LeapTuesdayRegularIsrael = LeapMondayCompleteIsrael;
    byte[] arrayOfByte12 = new byte[55];
    arrayOfByte12[0] = 52;
    arrayOfByte12[1] = -1;
    arrayOfByte12[2] = -1;
    arrayOfByte12[4] = 1;
    arrayOfByte12[5] = 2;
    arrayOfByte12[6] = 3;
    arrayOfByte12[7] = 4;
    arrayOfByte12[8] = 5;
    arrayOfByte12[9] = 6;
    arrayOfByte12[10] = 7;
    arrayOfByte12[11] = 8;
    arrayOfByte12[12] = 9;
    arrayOfByte12[13] = 10;
    arrayOfByte12[14] = 11;
    arrayOfByte12[15] = 12;
    arrayOfByte12[16] = 13;
    arrayOfByte12[17] = 14;
    arrayOfByte12[18] = 15;
    arrayOfByte12[19] = 16;
    arrayOfByte12[20] = 17;
    arrayOfByte12[21] = 18;
    arrayOfByte12[22] = 19;
    arrayOfByte12[23] = 20;
    arrayOfByte12[24] = 21;
    arrayOfByte12[25] = 22;
    arrayOfByte12[26] = 23;
    arrayOfByte12[27] = 24;
    arrayOfByte12[28] = 25;
    arrayOfByte12[29] = 26;
    arrayOfByte12[30] = 27;
    arrayOfByte12[31] = 28;
    arrayOfByte12[32] = -1;
    arrayOfByte12[33] = 29;
    arrayOfByte12[34] = 30;
    arrayOfByte12[35] = 31;
    arrayOfByte12[36] = 32;
    arrayOfByte12[37] = 33;
    arrayOfByte12[38] = 34;
    arrayOfByte12[39] = 35;
    arrayOfByte12[40] = 36;
    arrayOfByte12[41] = 37;
    arrayOfByte12[42] = 38;
    arrayOfByte12[43] = 39;
    arrayOfByte12[44] = 40;
    arrayOfByte12[45] = 41;
    arrayOfByte12[46] = 42;
    arrayOfByte12[47] = 43;
    arrayOfByte12[48] = 44;
    arrayOfByte12[49] = 45;
    arrayOfByte12[50] = 46;
    arrayOfByte12[51] = 47;
    arrayOfByte12[52] = 48;
    arrayOfByte12[53] = 49;
    arrayOfByte12[54] = 50;
    LeapThursdayIncomplete = arrayOfByte12;
    byte[] arrayOfByte13 = new byte[55];
    arrayOfByte13[0] = 52;
    arrayOfByte13[1] = -1;
    arrayOfByte13[2] = -1;
    arrayOfByte13[4] = 1;
    arrayOfByte13[5] = 2;
    arrayOfByte13[6] = 3;
    arrayOfByte13[7] = 4;
    arrayOfByte13[8] = 5;
    arrayOfByte13[9] = 6;
    arrayOfByte13[10] = 7;
    arrayOfByte13[11] = 8;
    arrayOfByte13[12] = 9;
    arrayOfByte13[13] = 10;
    arrayOfByte13[14] = 11;
    arrayOfByte13[15] = 12;
    arrayOfByte13[16] = 13;
    arrayOfByte13[17] = 14;
    arrayOfByte13[18] = 15;
    arrayOfByte13[19] = 16;
    arrayOfByte13[20] = 17;
    arrayOfByte13[21] = 18;
    arrayOfByte13[22] = 19;
    arrayOfByte13[23] = 20;
    arrayOfByte13[24] = 21;
    arrayOfByte13[25] = 22;
    arrayOfByte13[26] = 23;
    arrayOfByte13[27] = 24;
    arrayOfByte13[28] = 25;
    arrayOfByte13[29] = 26;
    arrayOfByte13[30] = 27;
    arrayOfByte13[31] = 28;
    arrayOfByte13[32] = -1;
    arrayOfByte13[33] = 29;
    arrayOfByte13[34] = 30;
    arrayOfByte13[35] = 31;
    arrayOfByte13[36] = 32;
    arrayOfByte13[37] = 33;
    arrayOfByte13[38] = 34;
    arrayOfByte13[39] = 35;
    arrayOfByte13[40] = 36;
    arrayOfByte13[41] = 37;
    arrayOfByte13[42] = 38;
    arrayOfByte13[43] = 39;
    arrayOfByte13[44] = 40;
    arrayOfByte13[45] = 41;
    arrayOfByte13[46] = 42;
    arrayOfByte13[47] = 43;
    arrayOfByte13[48] = 44;
    arrayOfByte13[49] = 45;
    arrayOfByte13[50] = 46;
    arrayOfByte13[51] = 47;
    arrayOfByte13[52] = 48;
    arrayOfByte13[53] = 49;
    arrayOfByte13[54] = -50;
    LeapThursdayComplete = arrayOfByte13;
    byte[] arrayOfByte14 = new byte[55];
    arrayOfByte14[0] = -1;
    arrayOfByte14[1] = 52;
    arrayOfByte14[2] = -1;
    arrayOfByte14[3] = -1;
    arrayOfByte14[5] = 1;
    arrayOfByte14[6] = 2;
    arrayOfByte14[7] = 3;
    arrayOfByte14[8] = 4;
    arrayOfByte14[9] = 5;
    arrayOfByte14[10] = 6;
    arrayOfByte14[11] = 7;
    arrayOfByte14[12] = 8;
    arrayOfByte14[13] = 9;
    arrayOfByte14[14] = 10;
    arrayOfByte14[15] = 11;
    arrayOfByte14[16] = 12;
    arrayOfByte14[17] = 13;
    arrayOfByte14[18] = 14;
    arrayOfByte14[19] = 15;
    arrayOfByte14[20] = 16;
    arrayOfByte14[21] = 17;
    arrayOfByte14[22] = 18;
    arrayOfByte14[23] = 19;
    arrayOfByte14[24] = 20;
    arrayOfByte14[25] = 21;
    arrayOfByte14[26] = 22;
    arrayOfByte14[27] = 23;
    arrayOfByte14[28] = 24;
    arrayOfByte14[29] = 25;
    arrayOfByte14[30] = 26;
    arrayOfByte14[31] = 27;
    arrayOfByte14[32] = -1;
    arrayOfByte14[33] = 28;
    arrayOfByte14[34] = 29;
    arrayOfByte14[35] = 30;
    arrayOfByte14[36] = 31;
    arrayOfByte14[37] = 32;
    arrayOfByte14[38] = 33;
    arrayOfByte14[39] = 34;
    arrayOfByte14[40] = 35;
    arrayOfByte14[41] = 36;
    arrayOfByte14[42] = 37;
    arrayOfByte14[43] = 38;
    arrayOfByte14[44] = 39;
    arrayOfByte14[45] = 40;
    arrayOfByte14[46] = -41;
    arrayOfByte14[47] = 43;
    arrayOfByte14[48] = 44;
    arrayOfByte14[49] = 45;
    arrayOfByte14[50] = 46;
    arrayOfByte14[51] = 47;
    arrayOfByte14[52] = 48;
    arrayOfByte14[53] = 49;
    arrayOfByte14[54] = -50;
    LeapSaturdayIncomplete = arrayOfByte14;
    byte[] arrayOfByte15 = new byte[55];
    arrayOfByte15[0] = -1;
    arrayOfByte15[1] = 52;
    arrayOfByte15[2] = -1;
    arrayOfByte15[3] = -1;
    arrayOfByte15[5] = 1;
    arrayOfByte15[6] = 2;
    arrayOfByte15[7] = 3;
    arrayOfByte15[8] = 4;
    arrayOfByte15[9] = 5;
    arrayOfByte15[10] = 6;
    arrayOfByte15[11] = 7;
    arrayOfByte15[12] = 8;
    arrayOfByte15[13] = 9;
    arrayOfByte15[14] = 10;
    arrayOfByte15[15] = 11;
    arrayOfByte15[16] = 12;
    arrayOfByte15[17] = 13;
    arrayOfByte15[18] = 14;
    arrayOfByte15[19] = 15;
    arrayOfByte15[20] = 16;
    arrayOfByte15[21] = 17;
    arrayOfByte15[22] = 18;
    arrayOfByte15[23] = 19;
    arrayOfByte15[24] = 20;
    arrayOfByte15[25] = 21;
    arrayOfByte15[26] = 22;
    arrayOfByte15[27] = 23;
    arrayOfByte15[28] = 24;
    arrayOfByte15[29] = 25;
    arrayOfByte15[30] = 26;
    arrayOfByte15[31] = 27;
    arrayOfByte15[32] = -1;
    arrayOfByte15[33] = 28;
    arrayOfByte15[34] = 29;
    arrayOfByte15[35] = 30;
    arrayOfByte15[36] = 31;
    arrayOfByte15[37] = 32;
    arrayOfByte15[38] = 33;
    arrayOfByte15[39] = -1;
    arrayOfByte15[40] = 34;
    arrayOfByte15[41] = 35;
    arrayOfByte15[42] = 36;
    arrayOfByte15[43] = 37;
    arrayOfByte15[44] = -38;
    arrayOfByte15[45] = 40;
    arrayOfByte15[46] = 41;
    arrayOfByte15[47] = 43;
    arrayOfByte15[48] = 44;
    arrayOfByte15[49] = 45;
    arrayOfByte15[50] = 46;
    arrayOfByte15[51] = 47;
    arrayOfByte15[52] = 48;
    arrayOfByte15[53] = 49;
    arrayOfByte15[54] = 50;
    LeapSaturdayCompleteDiaspora = arrayOfByte15;
    LeapSaturdayCompleteIsrael = LeapSaturdayIncomplete;
    byte[][][] arrayOfByte16 = new byte[4][][];
    byte[][] arrayOfByte17 = new byte[3][];
    arrayOfByte17[0] = NonleapMondayIncomplete;
    arrayOfByte17[2] = NonleapMondayCompleteIsrael;
    arrayOfByte16[0] = arrayOfByte17;
    byte[][] arrayOfByte18 = new byte[3][];
    arrayOfByte18[0] = NonleapMondayIncomplete;
    arrayOfByte18[2] = NonleapMondayCompleteDiaspora;
    arrayOfByte16[1] = arrayOfByte18;
    byte[][] arrayOfByte19 = new byte[3][];
    arrayOfByte19[0] = LeapMondayIncompleteIsrael;
    arrayOfByte19[2] = LeapMondayCompleteIsrael;
    arrayOfByte16[2] = arrayOfByte19;
    byte[][] arrayOfByte20 = new byte[3][];
    arrayOfByte20[0] = LeapMondayIncompleteDiaspora;
    arrayOfByte20[2] = LeapMondayCompleteDiaspora;
    arrayOfByte16[3] = arrayOfByte20;
    SedraYearsMonday = arrayOfByte16;
    byte[][][] arrayOfByte21 = new byte[4][][];
    byte[][] arrayOfByte22 = new byte[3][];
    arrayOfByte22[1] = NonleapTuesdayRegularIsrael;
    arrayOfByte21[0] = arrayOfByte22;
    byte[][] arrayOfByte23 = new byte[3][];
    arrayOfByte23[1] = NonleapTuesdayRegularDiaspora;
    arrayOfByte21[1] = arrayOfByte23;
    byte[][] arrayOfByte24 = new byte[3][];
    arrayOfByte24[1] = LeapTuesdayRegularIsrael;
    arrayOfByte21[2] = arrayOfByte24;
    byte[][] arrayOfByte25 = new byte[3][];
    arrayOfByte25[1] = LeapTuesdayRegularDiaspora;
    arrayOfByte21[3] = arrayOfByte25;
    SedraYearsTuesday = arrayOfByte21;
    byte[][][] arrayOfByte26 = new byte[4][][];
    byte[][] arrayOfByte27 = new byte[3][];
    arrayOfByte27[1] = NonleapThursdayRegularIsrael;
    arrayOfByte27[2] = NonleapThursdayComplete;
    arrayOfByte26[0] = arrayOfByte27;
    byte[][] arrayOfByte28 = new byte[3][];
    arrayOfByte28[1] = NonleapThursdayRegularDiaspora;
    arrayOfByte28[2] = NonleapThursdayComplete;
    arrayOfByte26[1] = arrayOfByte28;
    byte[][] arrayOfByte29 = new byte[3][];
    arrayOfByte29[0] = LeapThursdayIncomplete;
    arrayOfByte29[2] = LeapThursdayComplete;
    arrayOfByte26[2] = arrayOfByte29;
    byte[][] arrayOfByte30 = new byte[3][];
    arrayOfByte30[0] = LeapThursdayIncomplete;
    arrayOfByte30[2] = LeapThursdayComplete;
    arrayOfByte26[3] = arrayOfByte30;
    SedraYearsThursday = arrayOfByte26;
    byte[][][] arrayOfByte31 = new byte[4][][];
    byte[][] arrayOfByte32 = new byte[3][];
    arrayOfByte32[0] = NonleapSaturdayIncomplete;
    arrayOfByte32[2] = NonleapSaturdayComplete;
    arrayOfByte31[0] = arrayOfByte32;
    byte[][] arrayOfByte33 = new byte[3][];
    arrayOfByte33[0] = NonleapSaturdayIncomplete;
    arrayOfByte33[2] = NonleapSaturdayComplete;
    arrayOfByte31[1] = arrayOfByte33;
    byte[][] arrayOfByte34 = new byte[3][];
    arrayOfByte34[0] = LeapSaturdayIncomplete;
    arrayOfByte34[2] = LeapSaturdayCompleteIsrael;
    arrayOfByte31[2] = arrayOfByte34;
    byte[][] arrayOfByte35 = new byte[3][];
    arrayOfByte35[0] = LeapSaturdayIncomplete;
    arrayOfByte35[2] = LeapSaturdayCompleteDiaspora;
    arrayOfByte31[3] = arrayOfByte35;
    SedraYearsSaturday = arrayOfByte31;
    byte[][][][] arrayOfByte = new byte[4][][][];
    arrayOfByte[0] = SedraYearsMonday;
    arrayOfByte[1] = SedraYearsTuesday;
    arrayOfByte[2] = SedraYearsThursday;
    arrayOfByte[3] = SedraYearsSaturday;
    SedraYearsReference = arrayOfByte;
  }

  public static String[] getSedrotNames(DateHolder paramDateHolder, LocationHolder paramLocationHolder)
  {
    String[] arrayOfString1 = (String[])null;
    int i = paramDateHolder.hebNewYearAbsolute;
    int j = HebCalendar.getDayOfWeek(i);
    int k = i + (6 - j);
    byte[][][] arrayOfByte = SedraYearsReference[(j >> 1)];
    int m = 1;
    int[] arrayOfInt = paramDateHolder.hebMonthDurations;
    int n;
    int i1;
    label70: label83: int i2;
    label94: byte[] arrayOfByte1;
    if (arrayOfInt[8] >= 30)
    {
      n = 1;
      if (arrayOfInt[7] < 30)
        break label126;
      i1 = 1;
      if (n == 0)
        break label132;
      if (i1 != 0)
        m = 2;
      if (arrayOfInt.length < 13)
        break label143;
      i2 = 2;
      arrayOfByte1 = arrayOfByte[(i2 + paramLocationHolder.holidayStyle)][m];
      if (arrayOfByte1 != null)
        break label149;
    }
    label126: int i4;
    for (String[] arrayOfString2 = arrayOfString1; ; arrayOfString2 = arrayOfString1)
    {
      return arrayOfString2;
      n = 0;
      break;
      i1 = 0;
      break label70;
      label132: if (i1 != 0)
        break label83;
      m = 0;
      break label83;
      label143: i2 = 0;
      break label94;
      label149: int i3 = paramDateHolder.dateAbsolute;
      i4 = (i3 + (6 - HebCalendar.getDayOfWeek(i3)) - k) / 7;
      if (i4 < arrayOfByte1.length)
        break label188;
    }
    label188: int i5 = arrayOfByte1[i4];
    if (i5 >= 0)
    {
      arrayOfString1 = new String[1];
      arrayOfString1[0] = MText.SedrotNames[i5];
    }
    while (true)
    {
      arrayOfString2 = arrayOfString1;
      break;
      if (i5 == -1)
        continue;
      int i6 = -i5;
      arrayOfString1 = new String[2];
      arrayOfString1[0] = MText.SedrotNames[i6];
      arrayOfString1[1] = MText.SedrotNames[(i6 + 1)];
    }
  }
}

/* Location:           D:\MySoftware\decomp\classes_dex2jar.jar
 * Qualified Name:     libsrc.Sedrot
 * JD-Core Version:    0.6.0
 */
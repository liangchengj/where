#include "include/simple.h"
#include <android/log.h>
#include <vector>


static const string MEYOU = "MEYOU/";

extern "C" {

JNIEXPORT void JNICALL
Java_com_meyou_Me_le(JNIEnv *env, jclass type, jstring tag_, jstring message_, jboolean debug) {
    if (debug == JNI_TRUE)
        __android_log_print(ANDROID_LOG_ERROR, cStrToChars(MEYOU + jStrToCStr(env, tag_)), "%s",
                            jStrToChars(env, message_));

}


JNIEXPORT void JNICALL
Java_com_meyou_Me_ld(JNIEnv *env, jclass type, jstring tag_, jstring message_, jboolean debug) {
    if (debug == JNI_TRUE)
        __android_log_print(ANDROID_LOG_DEBUG, cStrToChars(MEYOU + jStrToCStr(env, tag_)), "%s",
                            jStrToChars(env, message_));
}


JNIEXPORT void JNICALL
Java_com_meyou_Me_li(JNIEnv *env, jclass type, jstring tag_, jstring message_, jboolean debug) {
    if (debug == JNI_TRUE)
        __android_log_print(ANDROID_LOG_INFO, cStrToChars(MEYOU + jStrToCStr(env, tag_)), "%s",
                            jStrToChars(env, message_));
}


JNIEXPORT void JNICALL
Java_com_meyou_Me_lt(JNIEnv *env, jclass type, jstring tag_, jstring methodName_,
                     jstring exceptionName_, jboolean debug) {
    string throwInfo =
            "Method " + jStrToCStr(env, methodName_) + " with " + jStrToCStr(env, exceptionName_) +
            "!";
    Java_com_meyou_Me_le(env, type, tag_, cStrToJStr(env, throwInfo), debug);
}


JNIEXPORT jstring JNICALL
Java_com_meyou_Me_subWithLastIndex(JNIEnv *env, jclass type,
                                   jstring string_,
                                   jstring ch_,
                                   jint moveRight) {

    return cStrToJStr(env,
                      subWithLastIndex(jStrToCStr(env, string_), jStrToCStr(env, ch_), moveRight));
}


JNIEXPORT jstring JNICALL
Java_com_meyou_Me_getTypeByName(JNIEnv *env, jclass type, jstring name_) {
    return Java_com_meyou_Me_subWithLastIndex(env, type, name_, cStrToJStr(env, "."), 1);
}


JNIEXPORT jstring JNICALL
Java_com_meyou_Me_getMimeByName(JNIEnv *env, jclass type, jstring name_) {

    vector<vector<string>> mime;

    vector<string> item_1;
    item_1.push_back("123");
    item_1.push_back("application/vnd.lotus-1-2-3");
    mime.push_back(item_1);

    vector<string> item_2;
    item_2.push_back("3dml");
    item_2.push_back("text/vnd.in3d.3dml");
    mime.push_back(item_2);

    vector<string> item_3;
    item_3.push_back("3ds");
    item_3.push_back("image/x-3ds");
    mime.push_back(item_3);

    vector<string> item_4;
    item_4.push_back("3g2");
    item_4.push_back("video/3gpp2");
    mime.push_back(item_4);

    vector<string> item_5;
    item_5.push_back("3gp");
    item_5.push_back("video/3gpp");
    mime.push_back(item_5);

    vector<string> item_6;
    item_6.push_back("7z");
    item_6.push_back("application/x-7z-compressed");
    mime.push_back(item_6);

    vector<string> item_7;
    item_7.push_back("aab");
    item_7.push_back("application/x-authorware-bin");
    mime.push_back(item_7);

    vector<string> item_8;
    item_8.push_back("aac");
    item_8.push_back("audio/x-aac");
    mime.push_back(item_8);

    vector<string> item_9;
    item_9.push_back("aam");
    item_9.push_back("application/x-authorware-map");
    mime.push_back(item_9);

    vector<string> item_10;
    item_10.push_back("aas");
    item_10.push_back("application/x-authorware-seg");
    mime.push_back(item_10);

    vector<string> item_11;
    item_11.push_back("abs");
    item_11.push_back("audio/x-mpeg");
    mime.push_back(item_11);

    vector<string> item_12;
    item_12.push_back("abw");
    item_12.push_back("application/x-abiword");
    mime.push_back(item_12);

    vector<string> item_13;
    item_13.push_back("ac");
    item_13.push_back("application/pkix-attr-cert");
    mime.push_back(item_13);

    vector<string> item_14;
    item_14.push_back("acc");
    item_14.push_back("application/vnd.americandynamics.acc");
    mime.push_back(item_14);

    vector<string> item_15;
    item_15.push_back("ace");
    item_15.push_back("application/x-ace-compressed");
    mime.push_back(item_15);

    vector<string> item_16;
    item_16.push_back("acu");
    item_16.push_back("application/vnd.acucobol");
    mime.push_back(item_16);

    vector<string> item_17;
    item_17.push_back("acutc");
    item_17.push_back("application/vnd.acucorp");
    mime.push_back(item_17);

    vector<string> item_18;
    item_18.push_back("adp");
    item_18.push_back("audio/adpcm");
    mime.push_back(item_18);

    vector<string> item_19;
    item_19.push_back("aep");
    item_19.push_back("application/vnd.audiograph");
    mime.push_back(item_19);

    vector<string> item_20;
    item_20.push_back("afm");
    item_20.push_back("application/x-font-type1");
    mime.push_back(item_20);

    vector<string> item_21;
    item_21.push_back("afp");
    item_21.push_back("application/vnd.ibm.modcap");
    mime.push_back(item_21);

    vector<string> item_22;
    item_22.push_back("ahead");
    item_22.push_back("application/vnd.ahead.space");
    mime.push_back(item_22);

    vector<string> item_23;
    item_23.push_back("ai");
    item_23.push_back("application/postscript");
    mime.push_back(item_23);

    vector<string> item_24;
    item_24.push_back("aif");
    item_24.push_back("audio/x-aiff");
    mime.push_back(item_24);

    vector<string> item_25;
    item_25.push_back("aifc");
    item_25.push_back("audio/x-aiff");
    mime.push_back(item_25);

    vector<string> item_26;
    item_26.push_back("aiff");
    item_26.push_back("audio/x-aiff");
    mime.push_back(item_26);

    vector<string> item_27;
    item_27.push_back("aim");
    item_27.push_back("application/x-aim");
    mime.push_back(item_27);

    vector<string> item_28;
    item_28.push_back("air");
    item_28.push_back("application/vnd.adobe.air-application-installer-package+zip");
    mime.push_back(item_28);

    vector<string> item_29;
    item_29.push_back("ait");
    item_29.push_back("application/vnd.dvb.ait");
    mime.push_back(item_29);

    vector<string> item_30;
    item_30.push_back("ami");
    item_30.push_back("application/vnd.amiga.ami");
    mime.push_back(item_30);

    vector<string> item_31;
    item_31.push_back("anx");
    item_31.push_back("application/annodex");
    mime.push_back(item_31);

    vector<string> item_32;
    item_32.push_back("apk");
    item_32.push_back("application/vnd.android.package-archive");
    mime.push_back(item_32);

    vector<string> item_33;
    item_33.push_back("appcache");
    item_33.push_back("text/cache-manifest");
    mime.push_back(item_33);

    vector<string> item_34;
    item_34.push_back("application");
    item_34.push_back("application/x-ms-application");
    mime.push_back(item_34);

    vector<string> item_35;
    item_35.push_back("apr");
    item_35.push_back("application/vnd.lotus-approach");
    mime.push_back(item_35);

    vector<string> item_36;
    item_36.push_back("arc");
    item_36.push_back("application/x-freearc");
    mime.push_back(item_36);

    vector<string> item_37;
    item_37.push_back("art");
    item_37.push_back("image/x-jg");
    mime.push_back(item_37);

    vector<string> item_38;
    item_38.push_back("asc");
    item_38.push_back("application/pgp-signature");
    mime.push_back(item_38);

    vector<string> item_39;
    item_39.push_back("asf");
    item_39.push_back("video/x-ms-asf");
    mime.push_back(item_39);

    vector<string> item_40;
    item_40.push_back("asm");
    item_40.push_back("text/x-asm");
    mime.push_back(item_40);

    vector<string> item_41;
    item_41.push_back("aso");
    item_41.push_back("application/vnd.accpac.simply.aso");
    mime.push_back(item_41);

    vector<string> item_42;
    item_42.push_back("asx");
    item_42.push_back("video/x-ms-asf");
    mime.push_back(item_42);

    vector<string> item_43;
    item_43.push_back("atc");
    item_43.push_back("application/vnd.acucorp");
    mime.push_back(item_43);

    vector<string> item_44;
    item_44.push_back("atom");
    item_44.push_back("application/atom+xml");
    mime.push_back(item_44);

    vector<string> item_45;
    item_45.push_back("atomcat");
    item_45.push_back("application/atomcat+xml");
    mime.push_back(item_45);

    vector<string> item_46;
    item_46.push_back("atomsvc");
    item_46.push_back("application/atomsvc+xml");
    mime.push_back(item_46);

    vector<string> item_47;
    item_47.push_back("atx");
    item_47.push_back("application/vnd.antix.game-component");
    mime.push_back(item_47);

    vector<string> item_48;
    item_48.push_back("au");
    item_48.push_back("audio/basic");
    mime.push_back(item_48);

    vector<string> item_49;
    item_49.push_back("avi");
    item_49.push_back("video/x-msvideo");
    mime.push_back(item_49);

    vector<string> item_50;
    item_50.push_back("avx");
    item_50.push_back("video/x-rad-screenplay");
    mime.push_back(item_50);

    vector<string> item_51;
    item_51.push_back("aw");
    item_51.push_back("application/applixware");
    mime.push_back(item_51);

    vector<string> item_52;
    item_52.push_back("axa");
    item_52.push_back("audio/annodex");
    mime.push_back(item_52);

    vector<string> item_53;
    item_53.push_back("axv");
    item_53.push_back("video/annodex");
    mime.push_back(item_53);

    vector<string> item_54;
    item_54.push_back("azf");
    item_54.push_back("application/vnd.airzip.filesecure.azf");
    mime.push_back(item_54);

    vector<string> item_55;
    item_55.push_back("azs");
    item_55.push_back("application/vnd.airzip.filesecure.azs");
    mime.push_back(item_55);

    vector<string> item_56;
    item_56.push_back("azw");
    item_56.push_back("application/vnd.amazon.ebook");
    mime.push_back(item_56);

    vector<string> item_57;
    item_57.push_back("bat");
    item_57.push_back("application/x-msdownload");
    mime.push_back(item_57);

    vector<string> item_58;
    item_58.push_back("bcpio");
    item_58.push_back("application/x-bcpio");
    mime.push_back(item_58);

    vector<string> item_59;
    item_59.push_back("bdf");
    item_59.push_back("application/x-font-bdf");
    mime.push_back(item_59);

    vector<string> item_60;
    item_60.push_back("bdm");
    item_60.push_back("application/vnd.syncml.dm+wbxml");
    mime.push_back(item_60);

    vector<string> item_61;
    item_61.push_back("bed");
    item_61.push_back("application/vnd.realvnc.bed");
    mime.push_back(item_61);

    vector<string> item_62;
    item_62.push_back("bh2");
    item_62.push_back("application/vnd.fujitsu.oasysprs");
    mime.push_back(item_62);

    vector<string> item_63;
    item_63.push_back("bin");
    item_63.push_back("application/octet-stream");
    mime.push_back(item_63);

    vector<string> item_64;
    item_64.push_back("blb");
    item_64.push_back("application/x-blorb");
    mime.push_back(item_64);

    vector<string> item_65;
    item_65.push_back("blorb");
    item_65.push_back("application/x-blorb");
    mime.push_back(item_65);

    vector<string> item_66;
    item_66.push_back("bmi");
    item_66.push_back("application/vnd.bmi");
    mime.push_back(item_66);

    vector<string> item_67;
    item_67.push_back("bmp");
    item_67.push_back("image/bmp");
    mime.push_back(item_67);

    vector<string> item_68;
    item_68.push_back("body");
    item_68.push_back("text/html");
    mime.push_back(item_68);

    vector<string> item_69;
    item_69.push_back("book");
    item_69.push_back("application/vnd.framemaker");
    mime.push_back(item_69);

    vector<string> item_70;
    item_70.push_back("box");
    item_70.push_back("application/vnd.previewsystems.box");
    mime.push_back(item_70);

    vector<string> item_71;
    item_71.push_back("boz");
    item_71.push_back("application/x-bzip2");
    mime.push_back(item_71);

    vector<string> item_72;
    item_72.push_back("bpk");
    item_72.push_back("application/octet-stream");
    mime.push_back(item_72);

    vector<string> item_73;
    item_73.push_back("btif");
    item_73.push_back("image/prs.btif");
    mime.push_back(item_73);

    vector<string> item_74;
    item_74.push_back("bz");
    item_74.push_back("application/x-bzip");
    mime.push_back(item_74);

    vector<string> item_75;
    item_75.push_back("bz2");
    item_75.push_back("application/x-bzip2");
    mime.push_back(item_75);

    vector<string> item_76;
    item_76.push_back("c");
    item_76.push_back("text/x-c");
    mime.push_back(item_76);

    vector<string> item_77;
    item_77.push_back("c11amc");
    item_77.push_back("application/vnd.cluetrust.cartomobile-config");
    mime.push_back(item_77);

    vector<string> item_78;
    item_78.push_back("c11amz");
    item_78.push_back("application/vnd.cluetrust.cartomobile-config-pkg");
    mime.push_back(item_78);

    vector<string> item_79;
    item_79.push_back("c4d");
    item_79.push_back("application/vnd.clonk.c4group");
    mime.push_back(item_79);

    vector<string> item_80;
    item_80.push_back("c4f");
    item_80.push_back("application/vnd.clonk.c4group");
    mime.push_back(item_80);

    vector<string> item_81;
    item_81.push_back("c4g");
    item_81.push_back("application/vnd.clonk.c4group");
    mime.push_back(item_81);

    vector<string> item_82;
    item_82.push_back("c4p");
    item_82.push_back("application/vnd.clonk.c4group");
    mime.push_back(item_82);

    vector<string> item_83;
    item_83.push_back("c4u");
    item_83.push_back("application/vnd.clonk.c4group");
    mime.push_back(item_83);

    vector<string> item_84;
    item_84.push_back("cab");
    item_84.push_back("application/vnd.ms-cab-compressed");
    mime.push_back(item_84);

    vector<string> item_85;
    item_85.push_back("caf");
    item_85.push_back("audio/x-caf");
    mime.push_back(item_85);

    vector<string> item_86;
    item_86.push_back("cap");
    item_86.push_back("application/vnd.tcpdump.pcap");
    mime.push_back(item_86);

    vector<string> item_87;
    item_87.push_back("car");
    item_87.push_back("application/vnd.curl.car");
    mime.push_back(item_87);

    vector<string> item_88;
    item_88.push_back("cat");
    item_88.push_back("application/vnd.ms-pki.seccat");
    mime.push_back(item_88);

    vector<string> item_89;
    item_89.push_back("cb7");
    item_89.push_back("application/x-cbr");
    mime.push_back(item_89);

    vector<string> item_90;
    item_90.push_back("cba");
    item_90.push_back("application/x-cbr");
    mime.push_back(item_90);

    vector<string> item_91;
    item_91.push_back("cbr");
    item_91.push_back("application/x-cbr");
    mime.push_back(item_91);

    vector<string> item_92;
    item_92.push_back("cbt");
    item_92.push_back("application/x-cbr");
    mime.push_back(item_92);

    vector<string> item_93;
    item_93.push_back("cbz");
    item_93.push_back("application/x-cbr");
    mime.push_back(item_93);

    vector<string> item_94;
    item_94.push_back("cc");
    item_94.push_back("text/x-c");
    mime.push_back(item_94);

    vector<string> item_95;
    item_95.push_back("cct");
    item_95.push_back("application/x-director");
    mime.push_back(item_95);

    vector<string> item_96;
    item_96.push_back("ccxml");
    item_96.push_back("application/ccxml+xml");
    mime.push_back(item_96);

    vector<string> item_97;
    item_97.push_back("cdbcmsg");
    item_97.push_back("application/vnd.contact.cmsg");
    mime.push_back(item_97);

    vector<string> item_98;
    item_98.push_back("cdf");
    item_98.push_back("application/x-cdf");
    mime.push_back(item_98);

    vector<string> item_99;
    item_99.push_back("cdkey");
    item_99.push_back("application/vnd.mediastation.cdkey");
    mime.push_back(item_99);

    vector<string> item_100;
    item_100.push_back("cdmia");
    item_100.push_back("application/cdmi-capability");
    mime.push_back(item_100);

    vector<string> item_101;
    item_101.push_back("cdmic");
    item_101.push_back("application/cdmi-container");
    mime.push_back(item_101);

    vector<string> item_102;
    item_102.push_back("cdmid");
    item_102.push_back("application/cdmi-domain");
    mime.push_back(item_102);

    vector<string> item_103;
    item_103.push_back("cdmio");
    item_103.push_back("application/cdmi-object");
    mime.push_back(item_103);

    vector<string> item_104;
    item_104.push_back("cdmiq");
    item_104.push_back("application/cdmi-queue");
    mime.push_back(item_104);

    vector<string> item_105;
    item_105.push_back("cdx");
    item_105.push_back("chemical/x-cdx");
    mime.push_back(item_105);

    vector<string> item_106;
    item_106.push_back("cdxml");
    item_106.push_back("application/vnd.chemdraw+xml");
    mime.push_back(item_106);

    vector<string> item_107;
    item_107.push_back("cdy");
    item_107.push_back("application/vnd.cinderella");
    mime.push_back(item_107);

    vector<string> item_108;
    item_108.push_back("cer");
    item_108.push_back("application/pkix-cert");
    mime.push_back(item_108);

    vector<string> item_109;
    item_109.push_back("cfs");
    item_109.push_back("application/x-cfs-compressed");
    mime.push_back(item_109);

    vector<string> item_110;
    item_110.push_back("cgm");
    item_110.push_back("image/cgm");
    mime.push_back(item_110);

    vector<string> item_111;
    item_111.push_back("chat");
    item_111.push_back("application/x-chat");
    mime.push_back(item_111);

    vector<string> item_112;
    item_112.push_back("chm");
    item_112.push_back("application/vnd.ms-htmlhelp");
    mime.push_back(item_112);

    vector<string> item_113;
    item_113.push_back("chrt");
    item_113.push_back("application/vnd.kde.kchart");
    mime.push_back(item_113);

    vector<string> item_114;
    item_114.push_back("cif");
    item_114.push_back("chemical/x-cif");
    mime.push_back(item_114);

    vector<string> item_115;
    item_115.push_back("cii");
    item_115.push_back("application/vnd.anser-web-certificate-issue-initiation");
    mime.push_back(item_115);

    vector<string> item_116;
    item_116.push_back("cil");
    item_116.push_back("application/vnd.ms-artgalry");
    mime.push_back(item_116);

    vector<string> item_117;
    item_117.push_back("cla");
    item_117.push_back("application/vnd.claymore");
    mime.push_back(item_117);

    vector<string> item_118;
    item_118.push_back("class");
    item_118.push_back("application/java");
    mime.push_back(item_118);

    vector<string> item_119;
    item_119.push_back("clkk");
    item_119.push_back("application/vnd.crick.clicker.keyboard");
    mime.push_back(item_119);

    vector<string> item_120;
    item_120.push_back("clkp");
    item_120.push_back("application/vnd.crick.clicker.palette");
    mime.push_back(item_120);

    vector<string> item_121;
    item_121.push_back("clkt");
    item_121.push_back("application/vnd.crick.clicker.template");
    mime.push_back(item_121);

    vector<string> item_122;
    item_122.push_back("clkw");
    item_122.push_back("application/vnd.crick.clicker.wordbank");
    mime.push_back(item_122);

    vector<string> item_123;
    item_123.push_back("clkx");
    item_123.push_back("application/vnd.crick.clicker");
    mime.push_back(item_123);

    vector<string> item_124;
    item_124.push_back("clp");
    item_124.push_back("application/x-msclip");
    mime.push_back(item_124);

    vector<string> item_125;
    item_125.push_back("cmc");
    item_125.push_back("application/vnd.cosmocaller");
    mime.push_back(item_125);

    vector<string> item_126;
    item_126.push_back("cmdf");
    item_126.push_back("chemical/x-cmdf");
    mime.push_back(item_126);

    vector<string> item_127;
    item_127.push_back("cml");
    item_127.push_back("chemical/x-cml");
    mime.push_back(item_127);

    vector<string> item_128;
    item_128.push_back("cmp");
    item_128.push_back("application/vnd.yellowriver-custom-menu");
    mime.push_back(item_128);

    vector<string> item_129;
    item_129.push_back("cmx");
    item_129.push_back("image/x-cmx");
    mime.push_back(item_129);

    vector<string> item_130;
    item_130.push_back("cod");
    item_130.push_back("application/vnd.rim.cod");
    mime.push_back(item_130);

    vector<string> item_131;
    item_131.push_back("com");
    item_131.push_back("application/x-msdownload");
    mime.push_back(item_131);

    vector<string> item_132;
    item_132.push_back("conf");
    item_132.push_back("text/plain");
    mime.push_back(item_132);

    vector<string> item_133;
    item_133.push_back("cpio");
    item_133.push_back("application/x-cpio");
    mime.push_back(item_133);

    vector<string> item_134;
    item_134.push_back("cpp");
    item_134.push_back("text/x-c");
    mime.push_back(item_134);

    vector<string> item_135;
    item_135.push_back("cpt");
    item_135.push_back("application/mac-compactpro");
    mime.push_back(item_135);

    vector<string> item_136;
    item_136.push_back("crd");
    item_136.push_back("application/x-mscardfile");
    mime.push_back(item_136);

    vector<string> item_137;
    item_137.push_back("crl");
    item_137.push_back("application/pkix-crl");
    mime.push_back(item_137);

    vector<string> item_138;
    item_138.push_back("crt");
    item_138.push_back("application/x-x509-ca-cert");
    mime.push_back(item_138);

    vector<string> item_139;
    item_139.push_back("cryptonote");
    item_139.push_back("application/vnd.rig.cryptonote");
    mime.push_back(item_139);

    vector<string> item_140;
    item_140.push_back("csh");
    item_140.push_back("application/x-csh");
    mime.push_back(item_140);

    vector<string> item_141;
    item_141.push_back("csml");
    item_141.push_back("chemical/x-csml");
    mime.push_back(item_141);

    vector<string> item_142;
    item_142.push_back("csp");
    item_142.push_back("application/vnd.commonspace");
    mime.push_back(item_142);

    vector<string> item_143;
    item_143.push_back("css");
    item_143.push_back("text/css");
    mime.push_back(item_143);

    vector<string> item_144;
    item_144.push_back("cst");
    item_144.push_back("application/x-director");
    mime.push_back(item_144);

    vector<string> item_145;
    item_145.push_back("csv");
    item_145.push_back("text/csv");
    mime.push_back(item_145);

    vector<string> item_146;
    item_146.push_back("cu");
    item_146.push_back("application/cu-seeme");
    mime.push_back(item_146);

    vector<string> item_147;
    item_147.push_back("curl");
    item_147.push_back("text/vnd.curl");
    mime.push_back(item_147);

    vector<string> item_148;
    item_148.push_back("cww");
    item_148.push_back("application/prs.cww");
    mime.push_back(item_148);

    vector<string> item_149;
    item_149.push_back("cxt");
    item_149.push_back("application/x-director");
    mime.push_back(item_149);

    vector<string> item_150;
    item_150.push_back("cxx");
    item_150.push_back("text/x-c");
    mime.push_back(item_150);

    vector<string> item_151;
    item_151.push_back("dae");
    item_151.push_back("model/vnd.collada+xml");
    mime.push_back(item_151);

    vector<string> item_152;
    item_152.push_back("daf");
    item_152.push_back("application/vnd.mobius.daf");
    mime.push_back(item_152);

    vector<string> item_153;
    item_153.push_back("dart");
    item_153.push_back("application/vnd.dart");
    mime.push_back(item_153);

    vector<string> item_154;
    item_154.push_back("dataless");
    item_154.push_back("application/vnd.fdsn.seed");
    mime.push_back(item_154);

    vector<string> item_155;
    item_155.push_back("davmount");
    item_155.push_back("application/davmount+xml");
    mime.push_back(item_155);

    vector<string> item_156;
    item_156.push_back("dbk");
    item_156.push_back("application/docbook+xml");
    mime.push_back(item_156);

    vector<string> item_157;
    item_157.push_back("dcr");
    item_157.push_back("application/x-director");
    mime.push_back(item_157);

    vector<string> item_158;
    item_158.push_back("dcurl");
    item_158.push_back("text/vnd.curl.dcurl");
    mime.push_back(item_158);

    vector<string> item_159;
    item_159.push_back("dd2");
    item_159.push_back("application/vnd.oma.dd2+xml");
    mime.push_back(item_159);

    vector<string> item_160;
    item_160.push_back("ddd");
    item_160.push_back("application/vnd.fujixerox.ddd");
    mime.push_back(item_160);

    vector<string> item_161;
    item_161.push_back("deb");
    item_161.push_back("application/x-debian-package");
    mime.push_back(item_161);

    vector<string> item_162;
    item_162.push_back("def");
    item_162.push_back("text/plain");
    mime.push_back(item_162);

    vector<string> item_163;
    item_163.push_back("deploy");
    item_163.push_back("application/octet-stream");
    mime.push_back(item_163);

    vector<string> item_164;
    item_164.push_back("der");
    item_164.push_back("application/x-x509-ca-cert");
    mime.push_back(item_164);

    vector<string> item_165;
    item_165.push_back("dfac");
    item_165.push_back("application/vnd.dreamfactory");
    mime.push_back(item_165);

    vector<string> item_166;
    item_166.push_back("dgc");
    item_166.push_back("application/x-dgc-compressed");
    mime.push_back(item_166);

    vector<string> item_167;
    item_167.push_back("dib");
    item_167.push_back("image/bmp");
    mime.push_back(item_167);

    vector<string> item_168;
    item_168.push_back("dic");
    item_168.push_back("text/x-c");
    mime.push_back(item_168);

    vector<string> item_169;
    item_169.push_back("dir");
    item_169.push_back("application/x-director");
    mime.push_back(item_169);

    vector<string> item_170;
    item_170.push_back("dis");
    item_170.push_back("application/vnd.mobius.dis");
    mime.push_back(item_170);

    vector<string> item_171;
    item_171.push_back("dist");
    item_171.push_back("application/octet-stream");
    mime.push_back(item_171);

    vector<string> item_172;
    item_172.push_back("distz");
    item_172.push_back("application/octet-stream");
    mime.push_back(item_172);

    vector<string> item_173;
    item_173.push_back("djv");
    item_173.push_back("image/vnd.djvu");
    mime.push_back(item_173);

    vector<string> item_174;
    item_174.push_back("djvu");
    item_174.push_back("image/vnd.djvu");
    mime.push_back(item_174);

    vector<string> item_175;
    item_175.push_back("dll");
    item_175.push_back("application/x-msdownload");
    mime.push_back(item_175);

    vector<string> item_176;
    item_176.push_back("dmg");
    item_176.push_back("application/x-apple-diskimage");
    mime.push_back(item_176);

    vector<string> item_177;
    item_177.push_back("dmp");
    item_177.push_back("application/vnd.tcpdump.pcap");
    mime.push_back(item_177);

    vector<string> item_178;
    item_178.push_back("dms");
    item_178.push_back("application/octet-stream");
    mime.push_back(item_178);

    vector<string> item_179;
    item_179.push_back("dna");
    item_179.push_back("application/vnd.dna");
    mime.push_back(item_179);

    vector<string> item_180;
    item_180.push_back("doc");
    item_180.push_back("application/msword");
    mime.push_back(item_180);

    vector<string> item_181;
    item_181.push_back("docm");
    item_181.push_back("application/vnd.ms-word.document.macroenabled.12");
    mime.push_back(item_181);

    vector<string> item_182;
    item_182.push_back("docx");
    item_182.push_back("application/vnd.openxmlformats-officedocument.wordprocessingml.document");
    mime.push_back(item_182);

    vector<string> item_183;
    item_183.push_back("dot");
    item_183.push_back("application/msword");
    mime.push_back(item_183);

    vector<string> item_184;
    item_184.push_back("dotm");
    item_184.push_back("application/vnd.ms-word.template.macroenabled.12");
    mime.push_back(item_184);

    vector<string> item_185;
    item_185.push_back("dotx");
    item_185.push_back("application/vnd.openxmlformats-officedocument.wordprocessingml.template");
    mime.push_back(item_185);

    vector<string> item_186;
    item_186.push_back("dp");
    item_186.push_back("application/vnd.osgi.dp");
    mime.push_back(item_186);

    vector<string> item_187;
    item_187.push_back("dpg");
    item_187.push_back("application/vnd.dpgraph");
    mime.push_back(item_187);

    vector<string> item_188;
    item_188.push_back("dra");
    item_188.push_back("audio/vnd.dra");
    mime.push_back(item_188);

    vector<string> item_189;
    item_189.push_back("dsc");
    item_189.push_back("text/prs.lines.tag");
    mime.push_back(item_189);

    vector<string> item_190;
    item_190.push_back("dssc");
    item_190.push_back("application/dssc+der");
    mime.push_back(item_190);

    vector<string> item_191;
    item_191.push_back("dtb");
    item_191.push_back("application/x-dtbook+xml");
    mime.push_back(item_191);

    vector<string> item_192;
    item_192.push_back("dtd");
    item_192.push_back("application/xml-dtd");
    mime.push_back(item_192);

    vector<string> item_193;
    item_193.push_back("dts");
    item_193.push_back("audio/vnd.dts");
    mime.push_back(item_193);

    vector<string> item_194;
    item_194.push_back("dtshd");
    item_194.push_back("audio/vnd.dts.hd");
    mime.push_back(item_194);

    vector<string> item_195;
    item_195.push_back("dump");
    item_195.push_back("application/octet-stream");
    mime.push_back(item_195);

    vector<string> item_196;
    item_196.push_back("dv");
    item_196.push_back("video/x-dv");
    mime.push_back(item_196);

    vector<string> item_197;
    item_197.push_back("dvb");
    item_197.push_back("video/vnd.dvb.file");
    mime.push_back(item_197);

    vector<string> item_198;
    item_198.push_back("dvi");
    item_198.push_back("application/x-dvi");
    mime.push_back(item_198);

    vector<string> item_199;
    item_199.push_back("dwf");
    item_199.push_back("model/vnd.dwf");
    mime.push_back(item_199);

    vector<string> item_200;
    item_200.push_back("dwg");
    item_200.push_back("image/vnd.dwg");
    mime.push_back(item_200);

    vector<string> item_201;
    item_201.push_back("dxf");
    item_201.push_back("image/vnd.dxf");
    mime.push_back(item_201);

    vector<string> item_202;
    item_202.push_back("dxp");
    item_202.push_back("application/vnd.spotfire.dxp");
    mime.push_back(item_202);

    vector<string> item_203;
    item_203.push_back("dxr");
    item_203.push_back("application/x-director");
    mime.push_back(item_203);

    vector<string> item_204;
    item_204.push_back("ecelp4800");
    item_204.push_back("audio/vnd.nuera.ecelp4800");
    mime.push_back(item_204);

    vector<string> item_205;
    item_205.push_back("ecelp7470");
    item_205.push_back("audio/vnd.nuera.ecelp7470");
    mime.push_back(item_205);

    vector<string> item_206;
    item_206.push_back("ecelp9600");
    item_206.push_back("audio/vnd.nuera.ecelp9600");
    mime.push_back(item_206);

    vector<string> item_207;
    item_207.push_back("ecma");
    item_207.push_back("application/ecmascript");
    mime.push_back(item_207);

    vector<string> item_208;
    item_208.push_back("edm");
    item_208.push_back("application/vnd.novadigm.edm");
    mime.push_back(item_208);

    vector<string> item_209;
    item_209.push_back("edx");
    item_209.push_back("application/vnd.novadigm.edx");
    mime.push_back(item_209);

    vector<string> item_210;
    item_210.push_back("efif");
    item_210.push_back("application/vnd.picsel");
    mime.push_back(item_210);

    vector<string> item_211;
    item_211.push_back("ei6");
    item_211.push_back("application/vnd.pg.osasli");
    mime.push_back(item_211);

    vector<string> item_212;
    item_212.push_back("elc");
    item_212.push_back("application/octet-stream");
    mime.push_back(item_212);

    vector<string> item_213;
    item_213.push_back("emf");
    item_213.push_back("application/x-msmetafile");
    mime.push_back(item_213);

    vector<string> item_214;
    item_214.push_back("eml");
    item_214.push_back("message/rfc822");
    mime.push_back(item_214);

    vector<string> item_215;
    item_215.push_back("emma");
    item_215.push_back("application/emma+xml");
    mime.push_back(item_215);

    vector<string> item_216;
    item_216.push_back("emz");
    item_216.push_back("application/x-msmetafile");
    mime.push_back(item_216);

    vector<string> item_217;
    item_217.push_back("eol");
    item_217.push_back("audio/vnd.digital-winds");
    mime.push_back(item_217);

    vector<string> item_218;
    item_218.push_back("eot");
    item_218.push_back("application/vnd.ms-fontobject");
    mime.push_back(item_218);

    vector<string> item_219;
    item_219.push_back("eps");
    item_219.push_back("application/postscript");
    mime.push_back(item_219);

    vector<string> item_220;
    item_220.push_back("epub");
    item_220.push_back("application/epub+zip");
    mime.push_back(item_220);

    vector<string> item_221;
    item_221.push_back("es3");
    item_221.push_back("application/vnd.eszigno3+xml");
    mime.push_back(item_221);

    vector<string> item_222;
    item_222.push_back("esa");
    item_222.push_back("application/vnd.osgi.subsystem");
    mime.push_back(item_222);

    vector<string> item_223;
    item_223.push_back("esf");
    item_223.push_back("application/vnd.epson.esf");
    mime.push_back(item_223);

    vector<string> item_224;
    item_224.push_back("et3");
    item_224.push_back("application/vnd.eszigno3+xml");
    mime.push_back(item_224);

    vector<string> item_225;
    item_225.push_back("etx");
    item_225.push_back("text/x-setext");
    mime.push_back(item_225);

    vector<string> item_226;
    item_226.push_back("eva");
    item_226.push_back("application/x-eva");
    mime.push_back(item_226);

    vector<string> item_227;
    item_227.push_back("evy");
    item_227.push_back("application/x-envoy");
    mime.push_back(item_227);

    vector<string> item_228;
    item_228.push_back("exe");
    item_228.push_back("application/octet-stream");
    mime.push_back(item_228);

    vector<string> item_229;
    item_229.push_back("exi");
    item_229.push_back("application/exi");
    mime.push_back(item_229);

    vector<string> item_230;
    item_230.push_back("ext");
    item_230.push_back("application/vnd.novadigm.ext");
    mime.push_back(item_230);

    vector<string> item_231;
    item_231.push_back("ez");
    item_231.push_back("application/andrew-inset");
    mime.push_back(item_231);

    vector<string> item_232;
    item_232.push_back("ez2");
    item_232.push_back("application/vnd.ezpix-album");
    mime.push_back(item_232);

    vector<string> item_233;
    item_233.push_back("ez3");
    item_233.push_back("application/vnd.ezpix-package");
    mime.push_back(item_233);

    vector<string> item_234;
    item_234.push_back("f");
    item_234.push_back("text/x-fortran");
    mime.push_back(item_234);

    vector<string> item_235;
    item_235.push_back("f4v");
    item_235.push_back("video/x-f4v");
    mime.push_back(item_235);

    vector<string> item_236;
    item_236.push_back("f77");
    item_236.push_back("text/x-fortran");
    mime.push_back(item_236);

    vector<string> item_237;
    item_237.push_back("f90");
    item_237.push_back("text/x-fortran");
    mime.push_back(item_237);

    vector<string> item_238;
    item_238.push_back("fbs");
    item_238.push_back("image/vnd.fastbidsheet");
    mime.push_back(item_238);

    vector<string> item_239;
    item_239.push_back("fcdt");
    item_239.push_back("application/vnd.adobe.formscentral.fcdt");
    mime.push_back(item_239);

    vector<string> item_240;
    item_240.push_back("fcs");
    item_240.push_back("application/vnd.isac.fcs");
    mime.push_back(item_240);

    vector<string> item_241;
    item_241.push_back("fdf");
    item_241.push_back("application/vnd.fdf");
    mime.push_back(item_241);

    vector<string> item_242;
    item_242.push_back("fe_launch");
    item_242.push_back("application/vnd.denovo.fcselayout-link");
    mime.push_back(item_242);

    vector<string> item_243;
    item_243.push_back("fg5");
    item_243.push_back("application/vnd.fujitsu.oasysgp");
    mime.push_back(item_243);

    vector<string> item_244;
    item_244.push_back("fgd");
    item_244.push_back("application/x-director");
    mime.push_back(item_244);

    vector<string> item_245;
    item_245.push_back("fh");
    item_245.push_back("image/x-freehand");
    mime.push_back(item_245);

    vector<string> item_246;
    item_246.push_back("fh4");
    item_246.push_back("image/x-freehand");
    mime.push_back(item_246);

    vector<string> item_247;
    item_247.push_back("fh5");
    item_247.push_back("image/x-freehand");
    mime.push_back(item_247);

    vector<string> item_248;
    item_248.push_back("fh7");
    item_248.push_back("image/x-freehand");
    mime.push_back(item_248);

    vector<string> item_249;
    item_249.push_back("fhc");
    item_249.push_back("image/x-freehand");
    mime.push_back(item_249);

    vector<string> item_250;
    item_250.push_back("fig");
    item_250.push_back("application/x-xfig");
    mime.push_back(item_250);

    vector<string> item_251;
    item_251.push_back("flac");
    item_251.push_back("audio/flac");
    mime.push_back(item_251);

    vector<string> item_252;
    item_252.push_back("fli");
    item_252.push_back("video/x-fli");
    mime.push_back(item_252);

    vector<string> item_253;
    item_253.push_back("flo");
    item_253.push_back("application/vnd.micrografx.flo");
    mime.push_back(item_253);

    vector<string> item_254;
    item_254.push_back("flv");
    item_254.push_back("video/x-flv");
    mime.push_back(item_254);

    vector<string> item_255;
    item_255.push_back("flw");
    item_255.push_back("application/vnd.kde.kivio");
    mime.push_back(item_255);

    vector<string> item_256;
    item_256.push_back("flx");
    item_256.push_back("text/vnd.fmi.flexstor");
    mime.push_back(item_256);

    vector<string> item_257;
    item_257.push_back("fly");
    item_257.push_back("text/vnd.fly");
    mime.push_back(item_257);

    vector<string> item_258;
    item_258.push_back("fm");
    item_258.push_back("application/vnd.framemaker");
    mime.push_back(item_258);

    vector<string> item_259;
    item_259.push_back("fnc");
    item_259.push_back("application/vnd.frogans.fnc");
    mime.push_back(item_259);

    vector<string> item_260;
    item_260.push_back("for");
    item_260.push_back("text/x-fortran");
    mime.push_back(item_260);

    vector<string> item_261;
    item_261.push_back("fpx");
    item_261.push_back("image/vnd.fpx");
    mime.push_back(item_261);

    vector<string> item_262;
    item_262.push_back("frame");
    item_262.push_back("application/vnd.framemaker");
    mime.push_back(item_262);

    vector<string> item_263;
    item_263.push_back("fsc");
    item_263.push_back("application/vnd.fsc.weblaunch");
    mime.push_back(item_263);

    vector<string> item_264;
    item_264.push_back("fst");
    item_264.push_back("image/vnd.fst");
    mime.push_back(item_264);

    vector<string> item_265;
    item_265.push_back("ftc");
    item_265.push_back("application/vnd.fluxtime.clip");
    mime.push_back(item_265);

    vector<string> item_266;
    item_266.push_back("fti");
    item_266.push_back("application/vnd.anser-web-funds-transfer-initiation");
    mime.push_back(item_266);

    vector<string> item_267;
    item_267.push_back("fvt");
    item_267.push_back("video/vnd.fvt");
    mime.push_back(item_267);

    vector<string> item_268;
    item_268.push_back("fxp");
    item_268.push_back("application/vnd.adobe.fxp");
    mime.push_back(item_268);

    vector<string> item_269;
    item_269.push_back("fxpl");
    item_269.push_back("application/vnd.adobe.fxp");
    mime.push_back(item_269);

    vector<string> item_270;
    item_270.push_back("fzs");
    item_270.push_back("application/vnd.fuzzysheet");
    mime.push_back(item_270);

    vector<string> item_271;
    item_271.push_back("g2w");
    item_271.push_back("application/vnd.geoplan");
    mime.push_back(item_271);

    vector<string> item_272;
    item_272.push_back("g3");
    item_272.push_back("image/g3fax");
    mime.push_back(item_272);

    vector<string> item_273;
    item_273.push_back("g3w");
    item_273.push_back("application/vnd.geospace");
    mime.push_back(item_273);

    vector<string> item_274;
    item_274.push_back("gac");
    item_274.push_back("application/vnd.groove-account");
    mime.push_back(item_274);

    vector<string> item_275;
    item_275.push_back("gam");
    item_275.push_back("application/x-tads");
    mime.push_back(item_275);

    vector<string> item_276;
    item_276.push_back("gbr");
    item_276.push_back("application/rpki-ghostbusters");
    mime.push_back(item_276);

    vector<string> item_277;
    item_277.push_back("gca");
    item_277.push_back("application/x-gca-compressed");
    mime.push_back(item_277);

    vector<string> item_278;
    item_278.push_back("gdl");
    item_278.push_back("model/vnd.gdl");
    mime.push_back(item_278);

    vector<string> item_279;
    item_279.push_back("geo");
    item_279.push_back("application/vnd.dynageo");
    mime.push_back(item_279);

    vector<string> item_280;
    item_280.push_back("gex");
    item_280.push_back("application/vnd.geometry-explorer");
    mime.push_back(item_280);

    vector<string> item_281;
    item_281.push_back("ggb");
    item_281.push_back("application/vnd.geogebra.file");
    mime.push_back(item_281);

    vector<string> item_282;
    item_282.push_back("ggt");
    item_282.push_back("application/vnd.geogebra.tool");
    mime.push_back(item_282);

    vector<string> item_283;
    item_283.push_back("ghf");
    item_283.push_back("application/vnd.groove-help");
    mime.push_back(item_283);

    vector<string> item_284;
    item_284.push_back("gif");
    item_284.push_back("image/gif");
    mime.push_back(item_284);

    vector<string> item_285;
    item_285.push_back("gim");
    item_285.push_back("application/vnd.groove-identity-message");
    mime.push_back(item_285);

    vector<string> item_286;
    item_286.push_back("gml");
    item_286.push_back("application/gml+xml");
    mime.push_back(item_286);

    vector<string> item_287;
    item_287.push_back("gmx");
    item_287.push_back("application/vnd.gmx");
    mime.push_back(item_287);

    vector<string> item_288;
    item_288.push_back("gnumeric");
    item_288.push_back("application/x-gnumeric");
    mime.push_back(item_288);

    vector<string> item_289;
    item_289.push_back("gph");
    item_289.push_back("application/vnd.flographit");
    mime.push_back(item_289);

    vector<string> item_290;
    item_290.push_back("gpx");
    item_290.push_back("application/gpx+xml");
    mime.push_back(item_290);

    vector<string> item_291;
    item_291.push_back("gqf");
    item_291.push_back("application/vnd.grafeq");
    mime.push_back(item_291);

    vector<string> item_292;
    item_292.push_back("gqs");
    item_292.push_back("application/vnd.grafeq");
    mime.push_back(item_292);

    vector<string> item_293;
    item_293.push_back("gram");
    item_293.push_back("application/srgs");
    mime.push_back(item_293);

    vector<string> item_294;
    item_294.push_back("gramps");
    item_294.push_back("application/x-gramps-xml");
    mime.push_back(item_294);

    vector<string> item_295;
    item_295.push_back("gre");
    item_295.push_back("application/vnd.geometry-explorer");
    mime.push_back(item_295);

    vector<string> item_296;
    item_296.push_back("grv");
    item_296.push_back("application/vnd.groove-injector");
    mime.push_back(item_296);

    vector<string> item_297;
    item_297.push_back("grxml");
    item_297.push_back("application/srgs+xml");
    mime.push_back(item_297);

    vector<string> item_298;
    item_298.push_back("gsf");
    item_298.push_back("application/x-font-ghostscript");
    mime.push_back(item_298);

    vector<string> item_299;
    item_299.push_back("gtar");
    item_299.push_back("application/x-gtar");
    mime.push_back(item_299);

    vector<string> item_300;
    item_300.push_back("gtm");
    item_300.push_back("application/vnd.groove-tool-message");
    mime.push_back(item_300);

    vector<string> item_301;
    item_301.push_back("gtw");
    item_301.push_back("model/vnd.gtw");
    mime.push_back(item_301);

    vector<string> item_302;
    item_302.push_back("gv");
    item_302.push_back("text/vnd.graphviz");
    mime.push_back(item_302);

    vector<string> item_303;
    item_303.push_back("gxf");
    item_303.push_back("application/gxf");
    mime.push_back(item_303);

    vector<string> item_304;
    item_304.push_back("gxt");
    item_304.push_back("application/vnd.geonext");
    mime.push_back(item_304);

    vector<string> item_305;
    item_305.push_back("gz");
    item_305.push_back("application/x-gzip");
    mime.push_back(item_305);

    vector<string> item_306;
    item_306.push_back("h");
    item_306.push_back("text/x-c");
    mime.push_back(item_306);

    vector<string> item_307;
    item_307.push_back("h261");
    item_307.push_back("video/h261");
    mime.push_back(item_307);

    vector<string> item_308;
    item_308.push_back("h263");
    item_308.push_back("video/h263");
    mime.push_back(item_308);

    vector<string> item_309;
    item_309.push_back("h264");
    item_309.push_back("video/h264");
    mime.push_back(item_309);

    vector<string> item_310;
    item_310.push_back("hal");
    item_310.push_back("application/vnd.hal+xml");
    mime.push_back(item_310);

    vector<string> item_311;
    item_311.push_back("hbci");
    item_311.push_back("application/vnd.hbci");
    mime.push_back(item_311);

    vector<string> item_312;
    item_312.push_back("hdf");
    item_312.push_back("application/x-hdf");
    mime.push_back(item_312);

    vector<string> item_313;
    item_313.push_back("hh");
    item_313.push_back("text/x-c");
    mime.push_back(item_313);

    vector<string> item_314;
    item_314.push_back("hlp");
    item_314.push_back("application/winhlp");
    mime.push_back(item_314);

    vector<string> item_315;
    item_315.push_back("hpgl");
    item_315.push_back("application/vnd.hp-hpgl");
    mime.push_back(item_315);

    vector<string> item_316;
    item_316.push_back("hpid");
    item_316.push_back("application/vnd.hp-hpid");
    mime.push_back(item_316);

    vector<string> item_317;
    item_317.push_back("hps");
    item_317.push_back("application/vnd.hp-hps");
    mime.push_back(item_317);

    vector<string> item_318;
    item_318.push_back("hqx");
    item_318.push_back("application/mac-binhex40");
    mime.push_back(item_318);

    vector<string> item_319;
    item_319.push_back("htc");
    item_319.push_back("text/x-component");
    mime.push_back(item_319);

    vector<string> item_320;
    item_320.push_back("htke");
    item_320.push_back("application/vnd.kenameaapp");
    mime.push_back(item_320);

    vector<string> item_321;
    item_321.push_back("htm");
    item_321.push_back("text/html");
    mime.push_back(item_321);

    vector<string> item_322;
    item_322.push_back("html");
    item_322.push_back("text/html");
    mime.push_back(item_322);

    vector<string> item_323;
    item_323.push_back("hvd");
    item_323.push_back("application/vnd.yamaha.hv-dic");
    mime.push_back(item_323);

    vector<string> item_324;
    item_324.push_back("hvp");
    item_324.push_back("application/vnd.yamaha.hv-voice");
    mime.push_back(item_324);

    vector<string> item_325;
    item_325.push_back("hvs");
    item_325.push_back("application/vnd.yamaha.hv-script");
    mime.push_back(item_325);

    vector<string> item_326;
    item_326.push_back("i2g");
    item_326.push_back("application/vnd.intergeo");
    mime.push_back(item_326);

    vector<string> item_327;
    item_327.push_back("icc");
    item_327.push_back("application/vnd.iccprofile");
    mime.push_back(item_327);

    vector<string> item_328;
    item_328.push_back("ice");
    item_328.push_back("x-conference/x-cooltalk");
    mime.push_back(item_328);

    vector<string> item_329;
    item_329.push_back("icm");
    item_329.push_back("application/vnd.iccprofile");
    mime.push_back(item_329);

    vector<string> item_330;
    item_330.push_back("ico");
    item_330.push_back("image/x-icon");
    mime.push_back(item_330);

    vector<string> item_331;
    item_331.push_back("ics");
    item_331.push_back("text/calendar");
    mime.push_back(item_331);

    vector<string> item_332;
    item_332.push_back("ief");
    item_332.push_back("image/ief");
    mime.push_back(item_332);

    vector<string> item_333;
    item_333.push_back("ifb");
    item_333.push_back("text/calendar");
    mime.push_back(item_333);

    vector<string> item_334;
    item_334.push_back("ifm");
    item_334.push_back("application/vnd.shana.informed.formdata");
    mime.push_back(item_334);

    vector<string> item_335;
    item_335.push_back("iges");
    item_335.push_back("model/iges");
    mime.push_back(item_335);

    vector<string> item_336;
    item_336.push_back("igl");
    item_336.push_back("application/vnd.igloader");
    mime.push_back(item_336);

    vector<string> item_337;
    item_337.push_back("igm");
    item_337.push_back("application/vnd.insors.igm");
    mime.push_back(item_337);

    vector<string> item_338;
    item_338.push_back("igs");
    item_338.push_back("model/iges");
    mime.push_back(item_338);

    vector<string> item_339;
    item_339.push_back("igx");
    item_339.push_back("application/vnd.micrografx.igx");
    mime.push_back(item_339);

    vector<string> item_340;
    item_340.push_back("iif");
    item_340.push_back("application/vnd.shana.informed.interchange");
    mime.push_back(item_340);

    vector<string> item_341;
    item_341.push_back("imp");
    item_341.push_back("application/vnd.accpac.simply.imp");
    mime.push_back(item_341);

    vector<string> item_342;
    item_342.push_back("ims");
    item_342.push_back("application/vnd.ms-ims");
    mime.push_back(item_342);

    vector<string> item_343;
    item_343.push_back("in");
    item_343.push_back("text/plain");
    mime.push_back(item_343);

    vector<string> item_344;
    item_344.push_back("ink");
    item_344.push_back("application/inkml+xml");
    mime.push_back(item_344);

    vector<string> item_345;
    item_345.push_back("inkml");
    item_345.push_back("application/inkml+xml");
    mime.push_back(item_345);

    vector<string> item_346;
    item_346.push_back("install");
    item_346.push_back("application/x-install-instructions");
    mime.push_back(item_346);

    vector<string> item_347;
    item_347.push_back("iota");
    item_347.push_back("application/vnd.astraea-software.iota");
    mime.push_back(item_347);

    vector<string> item_348;
    item_348.push_back("ipfix");
    item_348.push_back("application/ipfix");
    mime.push_back(item_348);

    vector<string> item_349;
    item_349.push_back("ipk");
    item_349.push_back("application/vnd.shana.informed.package");
    mime.push_back(item_349);

    vector<string> item_350;
    item_350.push_back("irm");
    item_350.push_back("application/vnd.ibm.rights-management");
    mime.push_back(item_350);

    vector<string> item_351;
    item_351.push_back("irp");
    item_351.push_back("application/vnd.irepository.package+xml");
    mime.push_back(item_351);

    vector<string> item_352;
    item_352.push_back("iso");
    item_352.push_back("application/x-iso9660-image");
    mime.push_back(item_352);

    vector<string> item_353;
    item_353.push_back("itp");
    item_353.push_back("application/vnd.shana.informed.formtemplate");
    mime.push_back(item_353);

    vector<string> item_354;
    item_354.push_back("ivp");
    item_354.push_back("application/vnd.immervision-ivp");
    mime.push_back(item_354);

    vector<string> item_355;
    item_355.push_back("ivu");
    item_355.push_back("application/vnd.immervision-ivu");
    mime.push_back(item_355);

    vector<string> item_356;
    item_356.push_back("jad");
    item_356.push_back("text/vnd.sun.j2me.app-descriptor");
    mime.push_back(item_356);

    vector<string> item_357;
    item_357.push_back("jam");
    item_357.push_back("application/vnd.jam");
    mime.push_back(item_357);

    vector<string> item_358;
    item_358.push_back("jar");
    item_358.push_back("application/java-archive");
    mime.push_back(item_358);

    vector<string> item_359;
    item_359.push_back("java");
    item_359.push_back("text/x-java-source");
    mime.push_back(item_359);

    vector<string> item_360;
    item_360.push_back("jisp");
    item_360.push_back("application/vnd.jisp");
    mime.push_back(item_360);

    vector<string> item_361;
    item_361.push_back("jlt");
    item_361.push_back("application/vnd.hp-jlyt");
    mime.push_back(item_361);

    vector<string> item_362;
    item_362.push_back("jnlp");
    item_362.push_back("application/x-java-jnlp-file");
    mime.push_back(item_362);

    vector<string> item_363;
    item_363.push_back("joda");
    item_363.push_back("application/vnd.joost.joda-archive");
    mime.push_back(item_363);

    vector<string> item_364;
    item_364.push_back("jpe");
    item_364.push_back("image/jpeg");
    mime.push_back(item_364);

    vector<string> item_365;
    item_365.push_back("jpeg");
    item_365.push_back("image/jpeg");
    mime.push_back(item_365);

    vector<string> item_366;
    item_366.push_back("jpg");
    item_366.push_back("image/jpeg");
    mime.push_back(item_366);

    vector<string> item_367;
    item_367.push_back("jpgm");
    item_367.push_back("video/jpm");
    mime.push_back(item_367);

    vector<string> item_368;
    item_368.push_back("jpgv");
    item_368.push_back("video/jpeg");
    mime.push_back(item_368);

    vector<string> item_369;
    item_369.push_back("jpm");
    item_369.push_back("video/jpm");
    mime.push_back(item_369);

    vector<string> item_370;
    item_370.push_back("js");
    item_370.push_back("application/javascript");
    mime.push_back(item_370);

    vector<string> item_371;
    item_371.push_back("jsf");
    item_371.push_back("text/plain");
    mime.push_back(item_371);

    vector<string> item_372;
    item_372.push_back("json");
    item_372.push_back("application/json");
    mime.push_back(item_372);

    vector<string> item_373;
    item_373.push_back("jsonml");
    item_373.push_back("application/jsonml+json");
    mime.push_back(item_373);

    vector<string> item_374;
    item_374.push_back("jspf");
    item_374.push_back("text/plain");
    mime.push_back(item_374);

    vector<string> item_375;
    item_375.push_back("kar");
    item_375.push_back("audio/midi");
    mime.push_back(item_375);

    vector<string> item_376;
    item_376.push_back("karbon");
    item_376.push_back("application/vnd.kde.karbon");
    mime.push_back(item_376);

    vector<string> item_377;
    item_377.push_back("kfo");
    item_377.push_back("application/vnd.kde.kformula");
    mime.push_back(item_377);

    vector<string> item_378;
    item_378.push_back("kia");
    item_378.push_back("application/vnd.kidspiration");
    mime.push_back(item_378);

    vector<string> item_379;
    item_379.push_back("kml");
    item_379.push_back("application/vnd.google-earth.kml+xml");
    mime.push_back(item_379);

    vector<string> item_380;
    item_380.push_back("kmz");
    item_380.push_back("application/vnd.google-earth.kmz");
    mime.push_back(item_380);

    vector<string> item_381;
    item_381.push_back("kne");
    item_381.push_back("application/vnd.kinar");
    mime.push_back(item_381);

    vector<string> item_382;
    item_382.push_back("knp");
    item_382.push_back("application/vnd.kinar");
    mime.push_back(item_382);

    vector<string> item_383;
    item_383.push_back("kon");
    item_383.push_back("application/vnd.kde.kontour");
    mime.push_back(item_383);

    vector<string> item_384;
    item_384.push_back("kpr");
    item_384.push_back("application/vnd.kde.kpresenter");
    mime.push_back(item_384);

    vector<string> item_385;
    item_385.push_back("kpt");
    item_385.push_back("application/vnd.kde.kpresenter");
    mime.push_back(item_385);

    vector<string> item_386;
    item_386.push_back("kpxx");
    item_386.push_back("application/vnd.ds-keypoint");
    mime.push_back(item_386);

    vector<string> item_387;
    item_387.push_back("ksp");
    item_387.push_back("application/vnd.kde.kspread");
    mime.push_back(item_387);

    vector<string> item_388;
    item_388.push_back("ktr");
    item_388.push_back("application/vnd.kahootz");
    mime.push_back(item_388);

    vector<string> item_389;
    item_389.push_back("ktx");
    item_389.push_back("image/ktx");
    mime.push_back(item_389);

    vector<string> item_390;
    item_390.push_back("ktz");
    item_390.push_back("application/vnd.kahootz");
    mime.push_back(item_390);

    vector<string> item_391;
    item_391.push_back("kwd");
    item_391.push_back("application/vnd.kde.kword");
    mime.push_back(item_391);

    vector<string> item_392;
    item_392.push_back("kwt");
    item_392.push_back("application/vnd.kde.kword");
    mime.push_back(item_392);

    vector<string> item_393;
    item_393.push_back("lasxml");
    item_393.push_back("application/vnd.las.las+xml");
    mime.push_back(item_393);

    vector<string> item_394;
    item_394.push_back("latex");
    item_394.push_back("application/x-latex");
    mime.push_back(item_394);

    vector<string> item_395;
    item_395.push_back("lbd");
    item_395.push_back("application/vnd.llamagraphics.life-balance.desktop");
    mime.push_back(item_395);

    vector<string> item_396;
    item_396.push_back("lbe");
    item_396.push_back("application/vnd.llamagraphics.life-balance.exchange+xml");
    mime.push_back(item_396);

    vector<string> item_397;
    item_397.push_back("les");
    item_397.push_back("application/vnd.hhe.lesson-player");
    mime.push_back(item_397);

    vector<string> item_398;
    item_398.push_back("lha");
    item_398.push_back("application/x-lzh-compressed");
    mime.push_back(item_398);

    vector<string> item_399;
    item_399.push_back("link66");
    item_399.push_back("application/vnd.route66.link66+xml");
    mime.push_back(item_399);

    vector<string> item_400;
    item_400.push_back("list");
    item_400.push_back("text/plain");
    mime.push_back(item_400);

    vector<string> item_401;
    item_401.push_back("list3820");
    item_401.push_back("application/vnd.ibm.modcap");
    mime.push_back(item_401);

    vector<string> item_402;
    item_402.push_back("listafp");
    item_402.push_back("application/vnd.ibm.modcap");
    mime.push_back(item_402);

    vector<string> item_403;
    item_403.push_back("lnk");
    item_403.push_back("application/x-ms-shortcut");
    mime.push_back(item_403);

    vector<string> item_404;
    item_404.push_back("log");
    item_404.push_back("text/plain");
    mime.push_back(item_404);

    vector<string> item_405;
    item_405.push_back("lostxml");
    item_405.push_back("application/lost+xml");
    mime.push_back(item_405);

    vector<string> item_406;
    item_406.push_back("lrf");
    item_406.push_back("application/octet-stream");
    mime.push_back(item_406);

    vector<string> item_407;
    item_407.push_back("lrm");
    item_407.push_back("application/vnd.ms-lrm");
    mime.push_back(item_407);

    vector<string> item_408;
    item_408.push_back("ltf");
    item_408.push_back("application/vnd.frogans.ltf");
    mime.push_back(item_408);

    vector<string> item_409;
    item_409.push_back("lvp");
    item_409.push_back("audio/vnd.lucent.voice");
    mime.push_back(item_409);

    vector<string> item_410;
    item_410.push_back("lwp");
    item_410.push_back("application/vnd.lotus-wordpro");
    mime.push_back(item_410);

    vector<string> item_411;
    item_411.push_back("lzh");
    item_411.push_back("application/x-lzh-compressed");
    mime.push_back(item_411);

    vector<string> item_412;
    item_412.push_back("m13");
    item_412.push_back("application/x-msmediaview");
    mime.push_back(item_412);

    vector<string> item_413;
    item_413.push_back("m14");
    item_413.push_back("application/x-msmediaview");
    mime.push_back(item_413);

    vector<string> item_414;
    item_414.push_back("m1v");
    item_414.push_back("video/mpeg");
    mime.push_back(item_414);

    vector<string> item_415;
    item_415.push_back("m21");
    item_415.push_back("application/mp21");
    mime.push_back(item_415);

    vector<string> item_416;
    item_416.push_back("m2a");
    item_416.push_back("audio/mpeg");
    mime.push_back(item_416);

    vector<string> item_417;
    item_417.push_back("m2v");
    item_417.push_back("video/mpeg");
    mime.push_back(item_417);

    vector<string> item_418;
    item_418.push_back("m3a");
    item_418.push_back("audio/mpeg");
    mime.push_back(item_418);

    vector<string> item_419;
    item_419.push_back("m3u");
    item_419.push_back("audio/x-mpegurl");
    mime.push_back(item_419);

    vector<string> item_420;
    item_420.push_back("m3u8");
    item_420.push_back("application/vnd.apple.mpegurl");
    mime.push_back(item_420);

    vector<string> item_421;
    item_421.push_back("m4a");
    item_421.push_back("audio/mp4");
    mime.push_back(item_421);

    vector<string> item_422;
    item_422.push_back("m4b");
    item_422.push_back("audio/mp4");
    mime.push_back(item_422);

    vector<string> item_423;
    item_423.push_back("m4r");
    item_423.push_back("audio/mp4");
    mime.push_back(item_423);

    vector<string> item_424;
    item_424.push_back("m4u");
    item_424.push_back("video/vnd.mpegurl");
    mime.push_back(item_424);

    vector<string> item_425;
    item_425.push_back("m4v");
    item_425.push_back("video/mp4");
    mime.push_back(item_425);

    vector<string> item_426;
    item_426.push_back("ma");
    item_426.push_back("application/mathematica");
    mime.push_back(item_426);

    vector<string> item_427;
    item_427.push_back("mac");
    item_427.push_back("image/x-macpaint");
    mime.push_back(item_427);

    vector<string> item_428;
    item_428.push_back("mads");
    item_428.push_back("application/mads+xml");
    mime.push_back(item_428);

    vector<string> item_429;
    item_429.push_back("mag");
    item_429.push_back("application/vnd.ecowin.chart");
    mime.push_back(item_429);

    vector<string> item_430;
    item_430.push_back("maker");
    item_430.push_back("application/vnd.framemaker");
    mime.push_back(item_430);

    vector<string> item_431;
    item_431.push_back("man");
    item_431.push_back("text/troff");
    mime.push_back(item_431);

    vector<string> item_432;
    item_432.push_back("mar");
    item_432.push_back("application/octet-stream");
    mime.push_back(item_432);

    vector<string> item_433;
    item_433.push_back("mathml");
    item_433.push_back("application/mathml+xml");
    mime.push_back(item_433);

    vector<string> item_434;
    item_434.push_back("mb");
    item_434.push_back("application/mathematica");
    mime.push_back(item_434);

    vector<string> item_435;
    item_435.push_back("mbk");
    item_435.push_back("application/vnd.mobius.mbk");
    mime.push_back(item_435);

    vector<string> item_436;
    item_436.push_back("mbox");
    item_436.push_back("application/mbox");
    mime.push_back(item_436);

    vector<string> item_437;
    item_437.push_back("mc1");
    item_437.push_back("application/vnd.medcalcdata");
    mime.push_back(item_437);

    vector<string> item_438;
    item_438.push_back("mcd");
    item_438.push_back("application/vnd.mcd");
    mime.push_back(item_438);

    vector<string> item_439;
    item_439.push_back("mcurl");
    item_439.push_back("text/vnd.curl.mcurl");
    mime.push_back(item_439);

    vector<string> item_440;
    item_440.push_back("mdb");
    item_440.push_back("application/x-msaccess");
    mime.push_back(item_440);

    vector<string> item_441;
    item_441.push_back("mdi");
    item_441.push_back("image/vnd.ms-modi");
    mime.push_back(item_441);

    vector<string> item_442;
    item_442.push_back("me");
    item_442.push_back("text/troff");
    mime.push_back(item_442);

    vector<string> item_443;
    item_443.push_back("mesh");
    item_443.push_back("model/mesh");
    mime.push_back(item_443);

    vector<string> item_444;
    item_444.push_back("meta4");
    item_444.push_back("application/metalink4+xml");
    mime.push_back(item_444);

    vector<string> item_445;
    item_445.push_back("metalink");
    item_445.push_back("application/metalink+xml");
    mime.push_back(item_445);

    vector<string> item_446;
    item_446.push_back("mets");
    item_446.push_back("application/mets+xml");
    mime.push_back(item_446);

    vector<string> item_447;
    item_447.push_back("mfm");
    item_447.push_back("application/vnd.mfmp");
    mime.push_back(item_447);

    vector<string> item_448;
    item_448.push_back("mft");
    item_448.push_back("application/rpki-manifest");
    mime.push_back(item_448);

    vector<string> item_449;
    item_449.push_back("mgp");
    item_449.push_back("application/vnd.osgeo.mapguide.package");
    mime.push_back(item_449);

    vector<string> item_450;
    item_450.push_back("mgz");
    item_450.push_back("application/vnd.proteus.magazine");
    mime.push_back(item_450);

    vector<string> item_451;
    item_451.push_back("mid");
    item_451.push_back("audio/midi");
    mime.push_back(item_451);

    vector<string> item_452;
    item_452.push_back("midi");
    item_452.push_back("audio/midi");
    mime.push_back(item_452);

    vector<string> item_453;
    item_453.push_back("mie");
    item_453.push_back("application/x-mie");
    mime.push_back(item_453);

    vector<string> item_454;
    item_454.push_back("mif");
    item_454.push_back("application/x-mif");
    mime.push_back(item_454);

    vector<string> item_455;
    item_455.push_back("mime");
    item_455.push_back("message/rfc822");
    mime.push_back(item_455);

    vector<string> item_456;
    item_456.push_back("mj2");
    item_456.push_back("video/mj2");
    mime.push_back(item_456);

    vector<string> item_457;
    item_457.push_back("mjp2");
    item_457.push_back("video/mj2");
    mime.push_back(item_457);

    vector<string> item_458;
    item_458.push_back("mk3d");
    item_458.push_back("video/x-matroska");
    mime.push_back(item_458);

    vector<string> item_459;
    item_459.push_back("mka");
    item_459.push_back("audio/x-matroska");
    mime.push_back(item_459);

    vector<string> item_460;
    item_460.push_back("mks");
    item_460.push_back("video/x-matroska");
    mime.push_back(item_460);

    vector<string> item_461;
    item_461.push_back("mkv");
    item_461.push_back("video/x-matroska");
    mime.push_back(item_461);

    vector<string> item_462;
    item_462.push_back("mlp");
    item_462.push_back("application/vnd.dolby.mlp");
    mime.push_back(item_462);

    vector<string> item_463;
    item_463.push_back("mmd");
    item_463.push_back("application/vnd.chipnuts.karaoke-mmd");
    mime.push_back(item_463);

    vector<string> item_464;
    item_464.push_back("mmf");
    item_464.push_back("application/vnd.smaf");
    mime.push_back(item_464);

    vector<string> item_465;
    item_465.push_back("mmr");
    item_465.push_back("image/vnd.fujixerox.edmics-mmr");
    mime.push_back(item_465);

    vector<string> item_466;
    item_466.push_back("mng");
    item_466.push_back("video/x-mng");
    mime.push_back(item_466);

    vector<string> item_467;
    item_467.push_back("mny");
    item_467.push_back("application/x-msmoney");
    mime.push_back(item_467);

    vector<string> item_468;
    item_468.push_back("mobi");
    item_468.push_back("application/x-mobipocket-ebook");
    mime.push_back(item_468);

    vector<string> item_469;
    item_469.push_back("mods");
    item_469.push_back("application/mods+xml");
    mime.push_back(item_469);

    vector<string> item_470;
    item_470.push_back("mov");
    item_470.push_back("video/quicktime");
    mime.push_back(item_470);

    vector<string> item_471;
    item_471.push_back("movie");
    item_471.push_back("video/x-sgi-movie");
    mime.push_back(item_471);

    vector<string> item_472;
    item_472.push_back("mp1");
    item_472.push_back("audio/mpeg");
    mime.push_back(item_472);

    vector<string> item_473;
    item_473.push_back("mp2");
    item_473.push_back("audio/mpeg");
    mime.push_back(item_473);

    vector<string> item_474;
    item_474.push_back("mp21");
    item_474.push_back("application/mp21");
    mime.push_back(item_474);

    vector<string> item_475;
    item_475.push_back("mp2a");
    item_475.push_back("audio/mpeg");
    mime.push_back(item_475);

    vector<string> item_476;
    item_476.push_back("mp3");
    item_476.push_back("audio/mpeg");
    mime.push_back(item_476);

    vector<string> item_477;
    item_477.push_back("mp4");
    item_477.push_back("video/mp4");
    mime.push_back(item_477);

    vector<string> item_478;
    item_478.push_back("mp4a");
    item_478.push_back("audio/mp4");
    mime.push_back(item_478);

    vector<string> item_479;
    item_479.push_back("mp4s");
    item_479.push_back("application/mp4");
    mime.push_back(item_479);

    vector<string> item_480;
    item_480.push_back("mp4v");
    item_480.push_back("video/mp4");
    mime.push_back(item_480);

    vector<string> item_481;
    item_481.push_back("mpa");
    item_481.push_back("audio/mpeg");
    mime.push_back(item_481);

    vector<string> item_482;
    item_482.push_back("mpc");
    item_482.push_back("application/vnd.mophun.certificate");
    mime.push_back(item_482);

    vector<string> item_483;
    item_483.push_back("mpe");
    item_483.push_back("video/mpeg");
    mime.push_back(item_483);

    vector<string> item_484;
    item_484.push_back("mpeg");
    item_484.push_back("video/mpeg");
    mime.push_back(item_484);

    vector<string> item_485;
    item_485.push_back("mpega");
    item_485.push_back("audio/x-mpeg");
    mime.push_back(item_485);

    vector<string> item_486;
    item_486.push_back("mpg");
    item_486.push_back("video/mpeg");
    mime.push_back(item_486);

    vector<string> item_487;
    item_487.push_back("mpg4");
    item_487.push_back("video/mp4");
    mime.push_back(item_487);

    vector<string> item_488;
    item_488.push_back("mpga");
    item_488.push_back("audio/mpeg");
    mime.push_back(item_488);

    vector<string> item_489;
    item_489.push_back("mpkg");
    item_489.push_back("application/vnd.apple.installer+xml");
    mime.push_back(item_489);

    vector<string> item_490;
    item_490.push_back("mpm");
    item_490.push_back("application/vnd.blueice.multipass");
    mime.push_back(item_490);

    vector<string> item_491;
    item_491.push_back("mpn");
    item_491.push_back("application/vnd.mophun.application");
    mime.push_back(item_491);

    vector<string> item_492;
    item_492.push_back("mpp");
    item_492.push_back("application/vnd.ms-project");
    mime.push_back(item_492);

    vector<string> item_493;
    item_493.push_back("mpt");
    item_493.push_back("application/vnd.ms-project");
    mime.push_back(item_493);

    vector<string> item_494;
    item_494.push_back("mpv2");
    item_494.push_back("video/mpeg2");
    mime.push_back(item_494);

    vector<string> item_495;
    item_495.push_back("mpy");
    item_495.push_back("application/vnd.ibm.minipay");
    mime.push_back(item_495);

    vector<string> item_496;
    item_496.push_back("mqy");
    item_496.push_back("application/vnd.mobius.mqy");
    mime.push_back(item_496);

    vector<string> item_497;
    item_497.push_back("mrc");
    item_497.push_back("application/marc");
    mime.push_back(item_497);

    vector<string> item_498;
    item_498.push_back("mrcx");
    item_498.push_back("application/marcxml+xml");
    mime.push_back(item_498);

    vector<string> item_499;
    item_499.push_back("ms");
    item_499.push_back("text/troff");
    mime.push_back(item_499);

    vector<string> item_500;
    item_500.push_back("mscml");
    item_500.push_back("application/mediaservercontrol+xml");
    mime.push_back(item_500);

    vector<string> item_501;
    item_501.push_back("mseed");
    item_501.push_back("application/vnd.fdsn.mseed");
    mime.push_back(item_501);

    vector<string> item_502;
    item_502.push_back("mseq");
    item_502.push_back("application/vnd.mseq");
    mime.push_back(item_502);

    vector<string> item_503;
    item_503.push_back("msf");
    item_503.push_back("application/vnd.epson.msf");
    mime.push_back(item_503);

    vector<string> item_504;
    item_504.push_back("msh");
    item_504.push_back("model/mesh");
    mime.push_back(item_504);

    vector<string> item_505;
    item_505.push_back("msi");
    item_505.push_back("application/x-msdownload");
    mime.push_back(item_505);

    vector<string> item_506;
    item_506.push_back("msl");
    item_506.push_back("application/vnd.mobius.msl");
    mime.push_back(item_506);

    vector<string> item_507;
    item_507.push_back("msty");
    item_507.push_back("application/vnd.muvee.style");
    mime.push_back(item_507);

    vector<string> item_508;
    item_508.push_back("mts");
    item_508.push_back("model/vnd.mts");
    mime.push_back(item_508);

    vector<string> item_509;
    item_509.push_back("mus");
    item_509.push_back("application/vnd.musician");
    mime.push_back(item_509);

    vector<string> item_510;
    item_510.push_back("musicxml");
    item_510.push_back("application/vnd.recordare.musicxml+xml");
    mime.push_back(item_510);

    vector<string> item_511;
    item_511.push_back("mvb");
    item_511.push_back("application/x-msmediaview");
    mime.push_back(item_511);

    vector<string> item_512;
    item_512.push_back("mwf");
    item_512.push_back("application/vnd.mfer");
    mime.push_back(item_512);

    vector<string> item_513;
    item_513.push_back("mxf");
    item_513.push_back("application/mxf");
    mime.push_back(item_513);

    vector<string> item_514;
    item_514.push_back("mxl");
    item_514.push_back("application/vnd.recordare.musicxml");
    mime.push_back(item_514);

    vector<string> item_515;
    item_515.push_back("mxml");
    item_515.push_back("application/xv+xml");
    mime.push_back(item_515);

    vector<string> item_516;
    item_516.push_back("mxs");
    item_516.push_back("application/vnd.triscape.mxs");
    mime.push_back(item_516);

    vector<string> item_517;
    item_517.push_back("mxu");
    item_517.push_back("video/vnd.mpegurl");
    mime.push_back(item_517);

    vector<string> item_518;
    item_518.push_back("n-gage");
    item_518.push_back("application/vnd.nokia.n-gage.symbian.install");
    mime.push_back(item_518);

    vector<string> item_519;
    item_519.push_back("n3");
    item_519.push_back("text/n3");
    mime.push_back(item_519);

    vector<string> item_520;
    item_520.push_back("nb");
    item_520.push_back("application/mathematica");
    mime.push_back(item_520);

    vector<string> item_521;
    item_521.push_back("nbp");
    item_521.push_back("application/vnd.wolfram.player");
    mime.push_back(item_521);

    vector<string> item_522;
    item_522.push_back("nc");
    item_522.push_back("application/x-netcdf");
    mime.push_back(item_522);

    vector<string> item_523;
    item_523.push_back("ncx");
    item_523.push_back("application/x-dtbncx+xml");
    mime.push_back(item_523);

    vector<string> item_524;
    item_524.push_back("nfo");
    item_524.push_back("text/x-nfo");
    mime.push_back(item_524);

    vector<string> item_525;
    item_525.push_back("ngdat");
    item_525.push_back("application/vnd.nokia.n-gage.data");
    mime.push_back(item_525);

    vector<string> item_526;
    item_526.push_back("nitf");
    item_526.push_back("application/vnd.nitf");
    mime.push_back(item_526);

    vector<string> item_527;
    item_527.push_back("nlu");
    item_527.push_back("application/vnd.neurolanguage.nlu");
    mime.push_back(item_527);

    vector<string> item_528;
    item_528.push_back("nml");
    item_528.push_back("application/vnd.enliven");
    mime.push_back(item_528);

    vector<string> item_529;
    item_529.push_back("nnd");
    item_529.push_back("application/vnd.noblenet-directory");
    mime.push_back(item_529);

    vector<string> item_530;
    item_530.push_back("nns");
    item_530.push_back("application/vnd.noblenet-sealer");
    mime.push_back(item_530);

    vector<string> item_531;
    item_531.push_back("nnw");
    item_531.push_back("application/vnd.noblenet-web");
    mime.push_back(item_531);

    vector<string> item_532;
    item_532.push_back("npx");
    item_532.push_back("image/vnd.net-fpx");
    mime.push_back(item_532);

    vector<string> item_533;
    item_533.push_back("nsc");
    item_533.push_back("application/x-conference");
    mime.push_back(item_533);

    vector<string> item_534;
    item_534.push_back("nsf");
    item_534.push_back("application/vnd.lotus-notes");
    mime.push_back(item_534);

    vector<string> item_535;
    item_535.push_back("ntf");
    item_535.push_back("application/vnd.nitf");
    mime.push_back(item_535);

    vector<string> item_536;
    item_536.push_back("nzb");
    item_536.push_back("application/x-nzb");
    mime.push_back(item_536);

    vector<string> item_537;
    item_537.push_back("oa2");
    item_537.push_back("application/vnd.fujitsu.oasys2");
    mime.push_back(item_537);

    vector<string> item_538;
    item_538.push_back("oa3");
    item_538.push_back("application/vnd.fujitsu.oasys3");
    mime.push_back(item_538);

    vector<string> item_539;
    item_539.push_back("oas");
    item_539.push_back("application/vnd.fujitsu.oasys");
    mime.push_back(item_539);

    vector<string> item_540;
    item_540.push_back("obd");
    item_540.push_back("application/x-msbinder");
    mime.push_back(item_540);

    vector<string> item_541;
    item_541.push_back("obj");
    item_541.push_back("application/x-tgif");
    mime.push_back(item_541);

    vector<string> item_542;
    item_542.push_back("oda");
    item_542.push_back("application/oda");
    mime.push_back(item_542);

    vector<string> item_543;
    item_543.push_back("odb");
    item_543.push_back("application/vnd.oasis.opendocument.database");
    mime.push_back(item_543);

    vector<string> item_544;
    item_544.push_back("odc");
    item_544.push_back("application/vnd.oasis.opendocument.chart");
    mime.push_back(item_544);

    vector<string> item_545;
    item_545.push_back("odf");
    item_545.push_back("application/vnd.oasis.opendocument.formula");
    mime.push_back(item_545);

    vector<string> item_546;
    item_546.push_back("odft");
    item_546.push_back("application/vnd.oasis.opendocument.formula-template");
    mime.push_back(item_546);

    vector<string> item_547;
    item_547.push_back("odg");
    item_547.push_back("application/vnd.oasis.opendocument.graphics");
    mime.push_back(item_547);

    vector<string> item_548;
    item_548.push_back("odi");
    item_548.push_back("application/vnd.oasis.opendocument.image");
    mime.push_back(item_548);

    vector<string> item_549;
    item_549.push_back("odm");
    item_549.push_back("application/vnd.oasis.opendocument.text-master");
    mime.push_back(item_549);

    vector<string> item_550;
    item_550.push_back("odp");
    item_550.push_back("application/vnd.oasis.opendocument.presentation");
    mime.push_back(item_550);

    vector<string> item_551;
    item_551.push_back("ods");
    item_551.push_back("application/vnd.oasis.opendocument.spreadsheet");
    mime.push_back(item_551);

    vector<string> item_552;
    item_552.push_back("odt");
    item_552.push_back("application/vnd.oasis.opendocument.text");
    mime.push_back(item_552);

    vector<string> item_553;
    item_553.push_back("oga");
    item_553.push_back("audio/ogg");
    mime.push_back(item_553);

    vector<string> item_554;
    item_554.push_back("ogg");
    item_554.push_back("audio/ogg");
    mime.push_back(item_554);

    vector<string> item_555;
    item_555.push_back("ogv");
    item_555.push_back("video/ogg");
    mime.push_back(item_555);

    vector<string> item_556;
    item_556.push_back("ogx");
    item_556.push_back("application/ogg");
    mime.push_back(item_556);

    vector<string> item_557;
    item_557.push_back("omdoc");
    item_557.push_back("application/omdoc+xml");
    mime.push_back(item_557);

    vector<string> item_558;
    item_558.push_back("onepkg");
    item_558.push_back("application/onenote");
    mime.push_back(item_558);

    vector<string> item_559;
    item_559.push_back("onetmp");
    item_559.push_back("application/onenote");
    mime.push_back(item_559);

    vector<string> item_560;
    item_560.push_back("onetoc");
    item_560.push_back("application/onenote");
    mime.push_back(item_560);

    vector<string> item_561;
    item_561.push_back("onetoc2");
    item_561.push_back("application/onenote");
    mime.push_back(item_561);

    vector<string> item_562;
    item_562.push_back("opf");
    item_562.push_back("application/oebps-package+xml");
    mime.push_back(item_562);

    vector<string> item_563;
    item_563.push_back("opml");
    item_563.push_back("text/x-opml");
    mime.push_back(item_563);

    vector<string> item_564;
    item_564.push_back("oprc");
    item_564.push_back("application/vnd.palm");
    mime.push_back(item_564);

    vector<string> item_565;
    item_565.push_back("org");
    item_565.push_back("application/vnd.lotus-organizer");
    mime.push_back(item_565);

    vector<string> item_566;
    item_566.push_back("osf");
    item_566.push_back("application/vnd.yamaha.openscoreformat");
    mime.push_back(item_566);

    vector<string> item_567;
    item_567.push_back("osfpvg");
    item_567.push_back("application/vnd.yamaha.openscoreformat.osfpvg+xml");
    mime.push_back(item_567);

    vector<string> item_568;
    item_568.push_back("otc");
    item_568.push_back("application/vnd.oasis.opendocument.chart-template");
    mime.push_back(item_568);

    vector<string> item_569;
    item_569.push_back("otf");
    item_569.push_back("font/otf");
    mime.push_back(item_569);

    vector<string> item_570;
    item_570.push_back("otg");
    item_570.push_back("application/vnd.oasis.opendocument.graphics-template");
    mime.push_back(item_570);

    vector<string> item_571;
    item_571.push_back("oth");
    item_571.push_back("application/vnd.oasis.opendocument.text-web");
    mime.push_back(item_571);

    vector<string> item_572;
    item_572.push_back("oti");
    item_572.push_back("application/vnd.oasis.opendocument.image-template");
    mime.push_back(item_572);

    vector<string> item_573;
    item_573.push_back("otp");
    item_573.push_back("application/vnd.oasis.opendocument.presentation-template");
    mime.push_back(item_573);

    vector<string> item_574;
    item_574.push_back("ots");
    item_574.push_back("application/vnd.oasis.opendocument.spreadsheet-template");
    mime.push_back(item_574);

    vector<string> item_575;
    item_575.push_back("ott");
    item_575.push_back("application/vnd.oasis.opendocument.text-template");
    mime.push_back(item_575);

    vector<string> item_576;
    item_576.push_back("oxps");
    item_576.push_back("application/oxps");
    mime.push_back(item_576);

    vector<string> item_577;
    item_577.push_back("oxt");
    item_577.push_back("application/vnd.openofficeorg.extension");
    mime.push_back(item_577);

    vector<string> item_578;
    item_578.push_back("p");
    item_578.push_back("text/x-pascal");
    mime.push_back(item_578);

    vector<string> item_579;
    item_579.push_back("p10");
    item_579.push_back("application/pkcs10");
    mime.push_back(item_579);

    vector<string> item_580;
    item_580.push_back("p12");
    item_580.push_back("application/x-pkcs12");
    mime.push_back(item_580);

    vector<string> item_581;
    item_581.push_back("p7b");
    item_581.push_back("application/x-pkcs7-certificates");
    mime.push_back(item_581);

    vector<string> item_582;
    item_582.push_back("p7c");
    item_582.push_back("application/pkcs7-mime");
    mime.push_back(item_582);

    vector<string> item_583;
    item_583.push_back("p7m");
    item_583.push_back("application/pkcs7-mime");
    mime.push_back(item_583);

    vector<string> item_584;
    item_584.push_back("p7r");
    item_584.push_back("application/x-pkcs7-certreqresp");
    mime.push_back(item_584);

    vector<string> item_585;
    item_585.push_back("p7s");
    item_585.push_back("application/pkcs7-signature");
    mime.push_back(item_585);

    vector<string> item_586;
    item_586.push_back("p8");
    item_586.push_back("application/pkcs8");
    mime.push_back(item_586);

    vector<string> item_587;
    item_587.push_back("pas");
    item_587.push_back("text/x-pascal");
    mime.push_back(item_587);

    vector<string> item_588;
    item_588.push_back("paw");
    item_588.push_back("application/vnd.pawaafile");
    mime.push_back(item_588);

    vector<string> item_589;
    item_589.push_back("pbd");
    item_589.push_back("application/vnd.powerbuilder6");
    mime.push_back(item_589);

    vector<string> item_590;
    item_590.push_back("pbm");
    item_590.push_back("image/x-portable-bitmap");
    mime.push_back(item_590);

    vector<string> item_591;
    item_591.push_back("pcap");
    item_591.push_back("application/vnd.tcpdump.pcap");
    mime.push_back(item_591);

    vector<string> item_592;
    item_592.push_back("pcf");
    item_592.push_back("application/x-font-pcf");
    mime.push_back(item_592);

    vector<string> item_593;
    item_593.push_back("pcl");
    item_593.push_back("application/vnd.hp-pcl");
    mime.push_back(item_593);

    vector<string> item_594;
    item_594.push_back("pclxl");
    item_594.push_back("application/vnd.hp-pclxl");
    mime.push_back(item_594);

    vector<string> item_595;
    item_595.push_back("pct");
    item_595.push_back("image/pict");
    mime.push_back(item_595);

    vector<string> item_596;
    item_596.push_back("pcurl");
    item_596.push_back("application/vnd.curl.pcurl");
    mime.push_back(item_596);

    vector<string> item_597;
    item_597.push_back("pcx");
    item_597.push_back("image/x-pcx");
    mime.push_back(item_597);

    vector<string> item_598;
    item_598.push_back("pdb");
    item_598.push_back("application/vnd.palm");
    mime.push_back(item_598);

    vector<string> item_599;
    item_599.push_back("pdf");
    item_599.push_back("application/pdf");
    mime.push_back(item_599);

    vector<string> item_600;
    item_600.push_back("pfa");
    item_600.push_back("application/x-font-type1");
    mime.push_back(item_600);

    vector<string> item_601;
    item_601.push_back("pfb");
    item_601.push_back("application/x-font-type1");
    mime.push_back(item_601);

    vector<string> item_602;
    item_602.push_back("pfm");
    item_602.push_back("application/x-font-type1");
    mime.push_back(item_602);

    vector<string> item_603;
    item_603.push_back("pfr");
    item_603.push_back("application/font-tdpfr");
    mime.push_back(item_603);

    vector<string> item_604;
    item_604.push_back("pfx");
    item_604.push_back("application/x-pkcs12");
    mime.push_back(item_604);

    vector<string> item_605;
    item_605.push_back("pgm");
    item_605.push_back("image/x-portable-graymap");
    mime.push_back(item_605);

    vector<string> item_606;
    item_606.push_back("pgn");
    item_606.push_back("application/x-chess-pgn");
    mime.push_back(item_606);

    vector<string> item_607;
    item_607.push_back("pgp");
    item_607.push_back("application/pgp-encrypted");
    mime.push_back(item_607);

    vector<string> item_608;
    item_608.push_back("pic");
    item_608.push_back("image/pict");
    mime.push_back(item_608);

    vector<string> item_609;
    item_609.push_back("pict");
    item_609.push_back("image/pict");
    mime.push_back(item_609);

    vector<string> item_610;
    item_610.push_back("pkg");
    item_610.push_back("application/octet-stream");
    mime.push_back(item_610);

    vector<string> item_611;
    item_611.push_back("pki");
    item_611.push_back("application/pkixcmp");
    mime.push_back(item_611);

    vector<string> item_612;
    item_612.push_back("pkipath");
    item_612.push_back("application/pkix-pkipath");
    mime.push_back(item_612);

    vector<string> item_613;
    item_613.push_back("plb");
    item_613.push_back("application/vnd.3gpp.pic-bw-large");
    mime.push_back(item_613);

    vector<string> item_614;
    item_614.push_back("plc");
    item_614.push_back("application/vnd.mobius.plc");
    mime.push_back(item_614);

    vector<string> item_615;
    item_615.push_back("plf");
    item_615.push_back("application/vnd.pocketlearn");
    mime.push_back(item_615);

    vector<string> item_616;
    item_616.push_back("pls");
    item_616.push_back("audio/x-scpls");
    mime.push_back(item_616);

    vector<string> item_617;
    item_617.push_back("pml");
    item_617.push_back("application/vnd.ctc-posml");
    mime.push_back(item_617);

    vector<string> item_618;
    item_618.push_back("png");
    item_618.push_back("image/png");
    mime.push_back(item_618);

    vector<string> item_619;
    item_619.push_back("pnm");
    item_619.push_back("image/x-portable-anymap");
    mime.push_back(item_619);

    vector<string> item_620;
    item_620.push_back("pnt");
    item_620.push_back("image/x-macpaint");
    mime.push_back(item_620);

    vector<string> item_621;
    item_621.push_back("portpkg");
    item_621.push_back("application/vnd.macports.portpkg");
    mime.push_back(item_621);

    vector<string> item_622;
    item_622.push_back("pot");
    item_622.push_back("application/vnd.ms-powerpoint");
    mime.push_back(item_622);

    vector<string> item_623;
    item_623.push_back("potm");
    item_623.push_back("application/vnd.ms-powerpoint.template.macroenabled.12");
    mime.push_back(item_623);

    vector<string> item_624;
    item_624.push_back("potx");
    item_624.push_back("application/vnd.openxmlformats-officedocument.presentationml.template");
    mime.push_back(item_624);

    vector<string> item_625;
    item_625.push_back("ppam");
    item_625.push_back("application/vnd.ms-powerpoint.addin.macroenabled.12");
    mime.push_back(item_625);

    vector<string> item_626;
    item_626.push_back("ppd");
    item_626.push_back("application/vnd.cups-ppd");
    mime.push_back(item_626);

    vector<string> item_627;
    item_627.push_back("ppm");
    item_627.push_back("image/x-portable-pixmap");
    mime.push_back(item_627);

    vector<string> item_628;
    item_628.push_back("pps");
    item_628.push_back("application/vnd.ms-powerpoint");
    mime.push_back(item_628);

    vector<string> item_629;
    item_629.push_back("ppsm");
    item_629.push_back("application/vnd.ms-powerpoint.slideshow.macroenabled.12");
    mime.push_back(item_629);

    vector<string> item_630;
    item_630.push_back("ppsx");
    item_630.push_back("application/vnd.openxmlformats-officedocument.presentationml.slideshow");
    mime.push_back(item_630);

    vector<string> item_631;
    item_631.push_back("ppt");
    item_631.push_back("application/vnd.ms-powerpoint");
    mime.push_back(item_631);

    vector<string> item_632;
    item_632.push_back("pptm");
    item_632.push_back("application/vnd.ms-powerpoint.presentation.macroenabled.12");
    mime.push_back(item_632);

    vector<string> item_633;
    item_633.push_back("pptx");
    item_633.push_back("application/vnd.openxmlformats-officedocument.presentationml.presentation");
    mime.push_back(item_633);

    vector<string> item_634;
    item_634.push_back("pqa");
    item_634.push_back("application/vnd.palm");
    mime.push_back(item_634);

    vector<string> item_635;
    item_635.push_back("prc");
    item_635.push_back("application/x-mobipocket-ebook");
    mime.push_back(item_635);

    vector<string> item_636;
    item_636.push_back("pre");
    item_636.push_back("application/vnd.lotus-freelance");
    mime.push_back(item_636);

    vector<string> item_637;
    item_637.push_back("prf");
    item_637.push_back("application/pics-rules");
    mime.push_back(item_637);

    vector<string> item_638;
    item_638.push_back("ps");
    item_638.push_back("application/postscript");
    mime.push_back(item_638);

    vector<string> item_639;
    item_639.push_back("psb");
    item_639.push_back("application/vnd.3gpp.pic-bw-small");
    mime.push_back(item_639);

    vector<string> item_640;
    item_640.push_back("psd");
    item_640.push_back("image/vnd.adobe.photoshop");
    mime.push_back(item_640);

    vector<string> item_641;
    item_641.push_back("psf");
    item_641.push_back("application/x-font-linux-psf");
    mime.push_back(item_641);

    vector<string> item_642;
    item_642.push_back("pskcxml");
    item_642.push_back("application/pskc+xml");
    mime.push_back(item_642);

    vector<string> item_643;
    item_643.push_back("ptid");
    item_643.push_back("application/vnd.pvi.ptid1");
    mime.push_back(item_643);

    vector<string> item_644;
    item_644.push_back("pub");
    item_644.push_back("application/x-mspublisher");
    mime.push_back(item_644);

    vector<string> item_645;
    item_645.push_back("pvb");
    item_645.push_back("application/vnd.3gpp.pic-bw-var");
    mime.push_back(item_645);

    vector<string> item_646;
    item_646.push_back("pwn");
    item_646.push_back("application/vnd.3m.post-it-notes");
    mime.push_back(item_646);

    vector<string> item_647;
    item_647.push_back("pya");
    item_647.push_back("audio/vnd.ms-playready.media.pya");
    mime.push_back(item_647);

    vector<string> item_648;
    item_648.push_back("pyv");
    item_648.push_back("video/vnd.ms-playready.media.pyv");
    mime.push_back(item_648);

    vector<string> item_649;
    item_649.push_back("qam");
    item_649.push_back("application/vnd.epson.quickanime");
    mime.push_back(item_649);

    vector<string> item_650;
    item_650.push_back("qbo");
    item_650.push_back("application/vnd.intu.qbo");
    mime.push_back(item_650);

    vector<string> item_651;
    item_651.push_back("qfx");
    item_651.push_back("application/vnd.intu.qfx");
    mime.push_back(item_651);

    vector<string> item_652;
    item_652.push_back("qps");
    item_652.push_back("application/vnd.publishare-delta-tree");
    mime.push_back(item_652);

    vector<string> item_653;
    item_653.push_back("qt");
    item_653.push_back("video/quicktime");
    mime.push_back(item_653);

    vector<string> item_654;
    item_654.push_back("qti");
    item_654.push_back("image/x-quicktime");
    mime.push_back(item_654);

    vector<string> item_655;
    item_655.push_back("qtif");
    item_655.push_back("image/x-quicktime");
    mime.push_back(item_655);

    vector<string> item_656;
    item_656.push_back("qwd");
    item_656.push_back("application/vnd.quark.quarkxpress");
    mime.push_back(item_656);

    vector<string> item_657;
    item_657.push_back("qwt");
    item_657.push_back("application/vnd.quark.quarkxpress");
    mime.push_back(item_657);

    vector<string> item_658;
    item_658.push_back("qxb");
    item_658.push_back("application/vnd.quark.quarkxpress");
    mime.push_back(item_658);

    vector<string> item_659;
    item_659.push_back("qxd");
    item_659.push_back("application/vnd.quark.quarkxpress");
    mime.push_back(item_659);

    vector<string> item_660;
    item_660.push_back("qxl");
    item_660.push_back("application/vnd.quark.quarkxpress");
    mime.push_back(item_660);

    vector<string> item_661;
    item_661.push_back("qxt");
    item_661.push_back("application/vnd.quark.quarkxpress");
    mime.push_back(item_661);

    vector<string> item_662;
    item_662.push_back("ra");
    item_662.push_back("audio/x-pn-realaudio");
    mime.push_back(item_662);

    vector<string> item_663;
    item_663.push_back("ram");
    item_663.push_back("audio/x-pn-realaudio");
    mime.push_back(item_663);

    vector<string> item_664;
    item_664.push_back("rar");
    item_664.push_back("application/x-rar-compressed");
    mime.push_back(item_664);

    vector<string> item_665;
    item_665.push_back("ras");
    item_665.push_back("image/x-cmu-raster");
    mime.push_back(item_665);

    vector<string> item_666;
    item_666.push_back("rcprofile");
    item_666.push_back("application/vnd.ipunplugged.rcprofile");
    mime.push_back(item_666);

    vector<string> item_667;
    item_667.push_back("rdf");
    item_667.push_back("application/rdf+xml");
    mime.push_back(item_667);

    vector<string> item_668;
    item_668.push_back("rdz");
    item_668.push_back("application/vnd.data-vision.rdz");
    mime.push_back(item_668);

    vector<string> item_669;
    item_669.push_back("rep");
    item_669.push_back("application/vnd.businessobjects");
    mime.push_back(item_669);

    vector<string> item_670;
    item_670.push_back("res");
    item_670.push_back("application/x-dtbresource+xml");
    mime.push_back(item_670);

    vector<string> item_671;
    item_671.push_back("rgb");
    item_671.push_back("image/x-rgb");
    mime.push_back(item_671);

    vector<string> item_672;
    item_672.push_back("rif");
    item_672.push_back("application/reginfo+xml");
    mime.push_back(item_672);

    vector<string> item_673;
    item_673.push_back("rip");
    item_673.push_back("audio/vnd.rip");
    mime.push_back(item_673);

    vector<string> item_674;
    item_674.push_back("ris");
    item_674.push_back("application/x-research-info-systems");
    mime.push_back(item_674);

    vector<string> item_675;
    item_675.push_back("rl");
    item_675.push_back("application/resource-lists+xml");
    mime.push_back(item_675);

    vector<string> item_676;
    item_676.push_back("rlc");
    item_676.push_back("image/vnd.fujixerox.edmics-rlc");
    mime.push_back(item_676);

    vector<string> item_677;
    item_677.push_back("rld");
    item_677.push_back("application/resource-lists-diff+xml");
    mime.push_back(item_677);

    vector<string> item_678;
    item_678.push_back("rm");
    item_678.push_back("application/vnd.rn-realmedia");
    mime.push_back(item_678);

    vector<string> item_679;
    item_679.push_back("rmi");
    item_679.push_back("audio/midi");
    mime.push_back(item_679);

    vector<string> item_680;
    item_680.push_back("rmp");
    item_680.push_back("audio/x-pn-realaudio-plugin");
    mime.push_back(item_680);

    vector<string> item_681;
    item_681.push_back("rms");
    item_681.push_back("application/vnd.jcp.javame.midlet-rms");
    mime.push_back(item_681);

    vector<string> item_682;
    item_682.push_back("rmvb");
    item_682.push_back("application/vnd.rn-realmedia-vbr");
    mime.push_back(item_682);

    vector<string> item_683;
    item_683.push_back("rnc");
    item_683.push_back("application/relax-ng-compact-syntax");
    mime.push_back(item_683);

    vector<string> item_684;
    item_684.push_back("roa");
    item_684.push_back("application/rpki-roa");
    mime.push_back(item_684);

    vector<string> item_685;
    item_685.push_back("roff");
    item_685.push_back("text/troff");
    mime.push_back(item_685);

    vector<string> item_686;
    item_686.push_back("rp9");
    item_686.push_back("application/vnd.cloanto.rp9");
    mime.push_back(item_686);

    vector<string> item_687;
    item_687.push_back("rpss");
    item_687.push_back("application/vnd.nokia.radio-presets");
    mime.push_back(item_687);

    vector<string> item_688;
    item_688.push_back("rpst");
    item_688.push_back("application/vnd.nokia.radio-preset");
    mime.push_back(item_688);

    vector<string> item_689;
    item_689.push_back("rq");
    item_689.push_back("application/sparql-query");
    mime.push_back(item_689);

    vector<string> item_690;
    item_690.push_back("rs");
    item_690.push_back("application/rls-services+xml");
    mime.push_back(item_690);

    vector<string> item_691;
    item_691.push_back("rsd");
    item_691.push_back("application/rsd+xml");
    mime.push_back(item_691);

    vector<string> item_692;
    item_692.push_back("rss");
    item_692.push_back("application/rss+xml");
    mime.push_back(item_692);

    vector<string> item_693;
    item_693.push_back("rtf");
    item_693.push_back("application/rtf");
    mime.push_back(item_693);

    vector<string> item_694;
    item_694.push_back("rtx");
    item_694.push_back("text/richtext");
    mime.push_back(item_694);

    vector<string> item_695;
    item_695.push_back("s");
    item_695.push_back("text/x-asm");
    mime.push_back(item_695);

    vector<string> item_696;
    item_696.push_back("s3m");
    item_696.push_back("audio/s3m");
    mime.push_back(item_696);

    vector<string> item_697;
    item_697.push_back("saf");
    item_697.push_back("application/vnd.yamaha.smaf-audio");
    mime.push_back(item_697);

    vector<string> item_698;
    item_698.push_back("sbml");
    item_698.push_back("application/sbml+xml");
    mime.push_back(item_698);

    vector<string> item_699;
    item_699.push_back("sc");
    item_699.push_back("application/vnd.ibm.secure-container");
    mime.push_back(item_699);

    vector<string> item_700;
    item_700.push_back("scd");
    item_700.push_back("application/x-msschedule");
    mime.push_back(item_700);

    vector<string> item_701;
    item_701.push_back("scm");
    item_701.push_back("application/vnd.lotus-screencam");
    mime.push_back(item_701);

    vector<string> item_702;
    item_702.push_back("scq");
    item_702.push_back("application/scvp-cv-request");
    mime.push_back(item_702);

    vector<string> item_703;
    item_703.push_back("scs");
    item_703.push_back("application/scvp-cv-response");
    mime.push_back(item_703);

    vector<string> item_704;
    item_704.push_back("scurl");
    item_704.push_back("text/vnd.curl.scurl");
    mime.push_back(item_704);

    vector<string> item_705;
    item_705.push_back("sda");
    item_705.push_back("application/vnd.stardivision.draw");
    mime.push_back(item_705);

    vector<string> item_706;
    item_706.push_back("sdc");
    item_706.push_back("application/vnd.stardivision.calc");
    mime.push_back(item_706);

    vector<string> item_707;
    item_707.push_back("sdd");
    item_707.push_back("application/vnd.stardivision.impress");
    mime.push_back(item_707);

    vector<string> item_708;
    item_708.push_back("sdkd");
    item_708.push_back("application/vnd.solent.sdkm+xml");
    mime.push_back(item_708);

    vector<string> item_709;
    item_709.push_back("sdkm");
    item_709.push_back("application/vnd.solent.sdkm+xml");
    mime.push_back(item_709);

    vector<string> item_710;
    item_710.push_back("sdp");
    item_710.push_back("application/sdp");
    mime.push_back(item_710);

    vector<string> item_711;
    item_711.push_back("sdw");
    item_711.push_back("application/vnd.stardivision.writer");
    mime.push_back(item_711);

    vector<string> item_712;
    item_712.push_back("see");
    item_712.push_back("application/vnd.seemail");
    mime.push_back(item_712);

    vector<string> item_713;
    item_713.push_back("seed");
    item_713.push_back("application/vnd.fdsn.seed");
    mime.push_back(item_713);

    vector<string> item_714;
    item_714.push_back("sema");
    item_714.push_back("application/vnd.sema");
    mime.push_back(item_714);

    vector<string> item_715;
    item_715.push_back("semd");
    item_715.push_back("application/vnd.semd");
    mime.push_back(item_715);

    vector<string> item_716;
    item_716.push_back("semf");
    item_716.push_back("application/vnd.semf");
    mime.push_back(item_716);

    vector<string> item_717;
    item_717.push_back("ser");
    item_717.push_back("application/java-serialized-object");
    mime.push_back(item_717);

    vector<string> item_718;
    item_718.push_back("setpay");
    item_718.push_back("application/set-payment-initiation");
    mime.push_back(item_718);

    vector<string> item_719;
    item_719.push_back("setreg");
    item_719.push_back("application/set-registration-initiation");
    mime.push_back(item_719);

    vector<string> item_720;
    item_720.push_back("sfd-hdstx");
    item_720.push_back("application/vnd.hydrostatix.sof-data");
    mime.push_back(item_720);

    vector<string> item_721;
    item_721.push_back("sfs");
    item_721.push_back("application/vnd.spotfire.sfs");
    mime.push_back(item_721);

    vector<string> item_722;
    item_722.push_back("sfv");
    item_722.push_back("text/x-sfv");
    mime.push_back(item_722);

    vector<string> item_723;
    item_723.push_back("sgi");
    item_723.push_back("image/sgi");
    mime.push_back(item_723);

    vector<string> item_724;
    item_724.push_back("sgl");
    item_724.push_back("application/vnd.stardivision.writer-global");
    mime.push_back(item_724);

    vector<string> item_725;
    item_725.push_back("sgm");
    item_725.push_back("text/sgml");
    mime.push_back(item_725);

    vector<string> item_726;
    item_726.push_back("sgml");
    item_726.push_back("text/sgml");
    mime.push_back(item_726);

    vector<string> item_727;
    item_727.push_back("sh");
    item_727.push_back("application/x-sh");
    mime.push_back(item_727);

    vector<string> item_728;
    item_728.push_back("shar");
    item_728.push_back("application/x-shar");
    mime.push_back(item_728);

    vector<string> item_729;
    item_729.push_back("shf");
    item_729.push_back("application/shf+xml");
    mime.push_back(item_729);

    vector<string> item_730;
    item_730.push_back("sid");
    item_730.push_back("image/x-mrsid-image");
    mime.push_back(item_730);

    vector<string> item_731;
    item_731.push_back("sig");
    item_731.push_back("application/pgp-signature");
    mime.push_back(item_731);

    vector<string> item_732;
    item_732.push_back("sil");
    item_732.push_back("audio/silk");
    mime.push_back(item_732);

    vector<string> item_733;
    item_733.push_back("silo");
    item_733.push_back("model/mesh");
    mime.push_back(item_733);

    vector<string> item_734;
    item_734.push_back("sis");
    item_734.push_back("application/vnd.symbian.install");
    mime.push_back(item_734);

    vector<string> item_735;
    item_735.push_back("sisx");
    item_735.push_back("application/vnd.symbian.install");
    mime.push_back(item_735);

    vector<string> item_736;
    item_736.push_back("sit");
    item_736.push_back("application/x-stuffit");
    mime.push_back(item_736);

    vector<string> item_737;
    item_737.push_back("sitx");
    item_737.push_back("application/x-stuffitx");
    mime.push_back(item_737);

    vector<string> item_738;
    item_738.push_back("skd");
    item_738.push_back("application/vnd.koan");
    mime.push_back(item_738);

    vector<string> item_739;
    item_739.push_back("skm");
    item_739.push_back("application/vnd.koan");
    mime.push_back(item_739);

    vector<string> item_740;
    item_740.push_back("skp");
    item_740.push_back("application/vnd.koan");
    mime.push_back(item_740);

    vector<string> item_741;
    item_741.push_back("skt");
    item_741.push_back("application/vnd.koan");
    mime.push_back(item_741);

    vector<string> item_742;
    item_742.push_back("sldm");
    item_742.push_back("application/vnd.ms-powerpoint.slide.macroenabled.12");
    mime.push_back(item_742);

    vector<string> item_743;
    item_743.push_back("sldx");
    item_743.push_back("application/vnd.openxmlformats-officedocument.presentationml.slide");
    mime.push_back(item_743);

    vector<string> item_744;
    item_744.push_back("slt");
    item_744.push_back("application/vnd.epson.salt");
    mime.push_back(item_744);

    vector<string> item_745;
    item_745.push_back("sm");
    item_745.push_back("application/vnd.stepmania.stepchart");
    mime.push_back(item_745);

    vector<string> item_746;
    item_746.push_back("smf");
    item_746.push_back("application/vnd.stardivision.math");
    mime.push_back(item_746);

    vector<string> item_747;
    item_747.push_back("smi");
    item_747.push_back("application/smil+xml");
    mime.push_back(item_747);

    vector<string> item_748;
    item_748.push_back("smil");
    item_748.push_back("application/smil+xml");
    mime.push_back(item_748);

    vector<string> item_749;
    item_749.push_back("smv");
    item_749.push_back("video/x-smv");
    mime.push_back(item_749);

    vector<string> item_750;
    item_750.push_back("smzip");
    item_750.push_back("application/vnd.stepmania.package");
    mime.push_back(item_750);

    vector<string> item_751;
    item_751.push_back("snd");
    item_751.push_back("audio/basic");
    mime.push_back(item_751);

    vector<string> item_752;
    item_752.push_back("snf");
    item_752.push_back("application/x-font-snf");
    mime.push_back(item_752);

    vector<string> item_753;
    item_753.push_back("so");
    item_753.push_back("application/octet-stream");
    mime.push_back(item_753);

    vector<string> item_754;
    item_754.push_back("spc");
    item_754.push_back("application/x-pkcs7-certificates");
    mime.push_back(item_754);

    vector<string> item_755;
    item_755.push_back("spf");
    item_755.push_back("application/vnd.yamaha.smaf-phrase");
    mime.push_back(item_755);

    vector<string> item_756;
    item_756.push_back("spl");
    item_756.push_back("application/x-futuresplash");
    mime.push_back(item_756);

    vector<string> item_757;
    item_757.push_back("spot");
    item_757.push_back("text/vnd.in3d.spot");
    mime.push_back(item_757);

    vector<string> item_758;
    item_758.push_back("spp");
    item_758.push_back("application/scvp-vp-response");
    mime.push_back(item_758);

    vector<string> item_759;
    item_759.push_back("spq");
    item_759.push_back("application/scvp-vp-request");
    mime.push_back(item_759);

    vector<string> item_760;
    item_760.push_back("spx");
    item_760.push_back("audio/ogg");
    mime.push_back(item_760);

    vector<string> item_761;
    item_761.push_back("sql");
    item_761.push_back("application/x-sql");
    mime.push_back(item_761);

    vector<string> item_762;
    item_762.push_back("src");
    item_762.push_back("application/x-wais-source");
    mime.push_back(item_762);

    vector<string> item_763;
    item_763.push_back("srt");
    item_763.push_back("application/x-subrip");
    mime.push_back(item_763);

    vector<string> item_764;
    item_764.push_back("sru");
    item_764.push_back("application/sru+xml");
    mime.push_back(item_764);

    vector<string> item_765;
    item_765.push_back("srx");
    item_765.push_back("application/sparql-results+xml");
    mime.push_back(item_765);

    vector<string> item_766;
    item_766.push_back("ssdl");
    item_766.push_back("application/ssdl+xml");
    mime.push_back(item_766);

    vector<string> item_767;
    item_767.push_back("sse");
    item_767.push_back("application/vnd.kodak-descriptor");
    mime.push_back(item_767);

    vector<string> item_768;
    item_768.push_back("ssf");
    item_768.push_back("application/vnd.epson.ssf");
    mime.push_back(item_768);

    vector<string> item_769;
    item_769.push_back("ssml");
    item_769.push_back("application/ssml+xml");
    mime.push_back(item_769);

    vector<string> item_770;
    item_770.push_back("st");
    item_770.push_back("application/vnd.sailingtracker.track");
    mime.push_back(item_770);

    vector<string> item_771;
    item_771.push_back("stc");
    item_771.push_back("application/vnd.sun.xml.calc.template");
    mime.push_back(item_771);

    vector<string> item_772;
    item_772.push_back("std");
    item_772.push_back("application/vnd.sun.xml.draw.template");
    mime.push_back(item_772);

    vector<string> item_773;
    item_773.push_back("stf");
    item_773.push_back("application/vnd.wt.stf");
    mime.push_back(item_773);

    vector<string> item_774;
    item_774.push_back("sti");
    item_774.push_back("application/vnd.sun.xml.impress.template");
    mime.push_back(item_774);

    vector<string> item_775;
    item_775.push_back("stk");
    item_775.push_back("application/hyperstudio");
    mime.push_back(item_775);

    vector<string> item_776;
    item_776.push_back("stl");
    item_776.push_back("application/vnd.ms-pki.stl");
    mime.push_back(item_776);

    vector<string> item_777;
    item_777.push_back("str");
    item_777.push_back("application/vnd.pg.format");
    mime.push_back(item_777);

    vector<string> item_778;
    item_778.push_back("stw");
    item_778.push_back("application/vnd.sun.xml.writer.template");
    mime.push_back(item_778);

    vector<string> item_779;
    item_779.push_back("sub");
    item_779.push_back("text/vnd.dvb.subtitle");
    mime.push_back(item_779);

    vector<string> item_780;
    item_780.push_back("sus");
    item_780.push_back("application/vnd.sus-calendar");
    mime.push_back(item_780);

    vector<string> item_781;
    item_781.push_back("susp");
    item_781.push_back("application/vnd.sus-calendar");
    mime.push_back(item_781);

    vector<string> item_782;
    item_782.push_back("sv4cpio");
    item_782.push_back("application/x-sv4cpio");
    mime.push_back(item_782);

    vector<string> item_783;
    item_783.push_back("sv4crc");
    item_783.push_back("application/x-sv4crc");
    mime.push_back(item_783);

    vector<string> item_784;
    item_784.push_back("svc");
    item_784.push_back("application/vnd.dvb.service");
    mime.push_back(item_784);

    vector<string> item_785;
    item_785.push_back("svd");
    item_785.push_back("application/vnd.svd");
    mime.push_back(item_785);

    vector<string> item_786;
    item_786.push_back("svg");
    item_786.push_back("image/svg+xml");
    mime.push_back(item_786);

    vector<string> item_787;
    item_787.push_back("svgz");
    item_787.push_back("image/svg+xml");
    mime.push_back(item_787);

    vector<string> item_788;
    item_788.push_back("swa");
    item_788.push_back("application/x-director");
    mime.push_back(item_788);

    vector<string> item_789;
    item_789.push_back("swf");
    item_789.push_back("application/x-shockwave-flash");
    mime.push_back(item_789);

    vector<string> item_790;
    item_790.push_back("swi");
    item_790.push_back("application/vnd.aristanetworks.swi");
    mime.push_back(item_790);

    vector<string> item_791;
    item_791.push_back("sxc");
    item_791.push_back("application/vnd.sun.xml.calc");
    mime.push_back(item_791);

    vector<string> item_792;
    item_792.push_back("sxd");
    item_792.push_back("application/vnd.sun.xml.draw");
    mime.push_back(item_792);

    vector<string> item_793;
    item_793.push_back("sxg");
    item_793.push_back("application/vnd.sun.xml.writer.global");
    mime.push_back(item_793);

    vector<string> item_794;
    item_794.push_back("sxi");
    item_794.push_back("application/vnd.sun.xml.impress");
    mime.push_back(item_794);

    vector<string> item_795;
    item_795.push_back("sxm");
    item_795.push_back("application/vnd.sun.xml.math");
    mime.push_back(item_795);

    vector<string> item_796;
    item_796.push_back("sxw");
    item_796.push_back("application/vnd.sun.xml.writer");
    mime.push_back(item_796);

    vector<string> item_797;
    item_797.push_back("t");
    item_797.push_back("text/troff");
    mime.push_back(item_797);

    vector<string> item_798;
    item_798.push_back("t3");
    item_798.push_back("application/x-t3vm-image");
    mime.push_back(item_798);

    vector<string> item_799;
    item_799.push_back("taglet");
    item_799.push_back("application/vnd.mynfc");
    mime.push_back(item_799);

    vector<string> item_800;
    item_800.push_back("tao");
    item_800.push_back("application/vnd.tao.intent-module-archive");
    mime.push_back(item_800);

    vector<string> item_801;
    item_801.push_back("tar");
    item_801.push_back("application/x-tar");
    mime.push_back(item_801);

    vector<string> item_802;
    item_802.push_back("tcap");
    item_802.push_back("application/vnd.3gpp2.tcap");
    mime.push_back(item_802);

    vector<string> item_803;
    item_803.push_back("tcl");
    item_803.push_back("application/x-tcl");
    mime.push_back(item_803);

    vector<string> item_804;
    item_804.push_back("teacher");
    item_804.push_back("application/vnd.smart.teacher");
    mime.push_back(item_804);

    vector<string> item_805;
    item_805.push_back("tei");
    item_805.push_back("application/tei+xml");
    mime.push_back(item_805);

    vector<string> item_806;
    item_806.push_back("teicorpus");
    item_806.push_back("application/tei+xml");
    mime.push_back(item_806);

    vector<string> item_807;
    item_807.push_back("tex");
    item_807.push_back("application/x-tex");
    mime.push_back(item_807);

    vector<string> item_808;
    item_808.push_back("texi");
    item_808.push_back("application/x-texinfo");
    mime.push_back(item_808);

    vector<string> item_809;
    item_809.push_back("texinfo");
    item_809.push_back("application/x-texinfo");
    mime.push_back(item_809);

    vector<string> item_810;
    item_810.push_back("text");
    item_810.push_back("text/plain");
    mime.push_back(item_810);

    vector<string> item_811;
    item_811.push_back("tfi");
    item_811.push_back("application/thraud+xml");
    mime.push_back(item_811);

    vector<string> item_812;
    item_812.push_back("tfm");
    item_812.push_back("application/x-tex-tfm");
    mime.push_back(item_812);

    vector<string> item_813;
    item_813.push_back("tga");
    item_813.push_back("image/x-tga");
    mime.push_back(item_813);

    vector<string> item_814;
    item_814.push_back("thmx");
    item_814.push_back("application/vnd.ms-officetheme");
    mime.push_back(item_814);

    vector<string> item_815;
    item_815.push_back("tif");
    item_815.push_back("image/tiff");
    mime.push_back(item_815);

    vector<string> item_816;
    item_816.push_back("tiff");
    item_816.push_back("image/tiff");
    mime.push_back(item_816);

    vector<string> item_817;
    item_817.push_back("tmo");
    item_817.push_back("application/vnd.tmobile-livetv");
    mime.push_back(item_817);

    vector<string> item_818;
    item_818.push_back("torrent");
    item_818.push_back("application/x-bittorrent");
    mime.push_back(item_818);

    vector<string> item_819;
    item_819.push_back("tpl");
    item_819.push_back("application/vnd.groove-tool-template");
    mime.push_back(item_819);

    vector<string> item_820;
    item_820.push_back("tpt");
    item_820.push_back("application/vnd.trid.tpt");
    mime.push_back(item_820);

    vector<string> item_821;
    item_821.push_back("tr");
    item_821.push_back("text/troff");
    mime.push_back(item_821);

    vector<string> item_822;
    item_822.push_back("tra");
    item_822.push_back("application/vnd.trueapp");
    mime.push_back(item_822);

    vector<string> item_823;
    item_823.push_back("trm");
    item_823.push_back("application/x-msterminal");
    mime.push_back(item_823);

    vector<string> item_824;
    item_824.push_back("tsd");
    item_824.push_back("application/timestamped-data");
    mime.push_back(item_824);

    vector<string> item_825;
    item_825.push_back("tsv");
    item_825.push_back("text/tab-separated-values");
    mime.push_back(item_825);

    vector<string> item_826;
    item_826.push_back("ttc");
    item_826.push_back("font/collection");
    mime.push_back(item_826);

    vector<string> item_827;
    item_827.push_back("ttf");
    item_827.push_back("font/ttf");
    mime.push_back(item_827);

    vector<string> item_828;
    item_828.push_back("ttl");
    item_828.push_back("text/turtle");
    mime.push_back(item_828);

    vector<string> item_829;
    item_829.push_back("twd");
    item_829.push_back("application/vnd.simtech-mindmapper");
    mime.push_back(item_829);

    vector<string> item_830;
    item_830.push_back("twds");
    item_830.push_back("application/vnd.simtech-mindmapper");
    mime.push_back(item_830);

    vector<string> item_831;
    item_831.push_back("txd");
    item_831.push_back("application/vnd.genomatix.tuxedo");
    mime.push_back(item_831);

    vector<string> item_832;
    item_832.push_back("txf");
    item_832.push_back("application/vnd.mobius.txf");
    mime.push_back(item_832);

    vector<string> item_833;
    item_833.push_back("txt");
    item_833.push_back("text/plain");
    mime.push_back(item_833);

    vector<string> item_834;
    item_834.push_back("u32");
    item_834.push_back("application/x-authorware-bin");
    mime.push_back(item_834);

    vector<string> item_835;
    item_835.push_back("udeb");
    item_835.push_back("application/x-debian-package");
    mime.push_back(item_835);

    vector<string> item_836;
    item_836.push_back("ufd");
    item_836.push_back("application/vnd.ufdl");
    mime.push_back(item_836);

    vector<string> item_837;
    item_837.push_back("ufdl");
    item_837.push_back("application/vnd.ufdl");
    mime.push_back(item_837);

    vector<string> item_838;
    item_838.push_back("ulw");
    item_838.push_back("audio/basic");
    mime.push_back(item_838);

    vector<string> item_839;
    item_839.push_back("ulx");
    item_839.push_back("application/x-glulx");
    mime.push_back(item_839);

    vector<string> item_840;
    item_840.push_back("umj");
    item_840.push_back("application/vnd.umajin");
    mime.push_back(item_840);

    vector<string> item_841;
    item_841.push_back("unityweb");
    item_841.push_back("application/vnd.unity");
    mime.push_back(item_841);

    vector<string> item_842;
    item_842.push_back("uoml");
    item_842.push_back("application/vnd.uoml+xml");
    mime.push_back(item_842);

    vector<string> item_843;
    item_843.push_back("uri");
    item_843.push_back("text/uri-list");
    mime.push_back(item_843);

    vector<string> item_844;
    item_844.push_back("uris");
    item_844.push_back("text/uri-list");
    mime.push_back(item_844);

    vector<string> item_845;
    item_845.push_back("urls");
    item_845.push_back("text/uri-list");
    mime.push_back(item_845);

    vector<string> item_846;
    item_846.push_back("ustar");
    item_846.push_back("application/x-ustar");
    mime.push_back(item_846);

    vector<string> item_847;
    item_847.push_back("utz");
    item_847.push_back("application/vnd.uiq.theme");
    mime.push_back(item_847);

    vector<string> item_848;
    item_848.push_back("uu");
    item_848.push_back("text/x-uuencode");
    mime.push_back(item_848);

    vector<string> item_849;
    item_849.push_back("uva");
    item_849.push_back("audio/vnd.dece.audio");
    mime.push_back(item_849);

    vector<string> item_850;
    item_850.push_back("uvd");
    item_850.push_back("application/vnd.dece.data");
    mime.push_back(item_850);

    vector<string> item_851;
    item_851.push_back("uvf");
    item_851.push_back("application/vnd.dece.data");
    mime.push_back(item_851);

    vector<string> item_852;
    item_852.push_back("uvg");
    item_852.push_back("image/vnd.dece.graphic");
    mime.push_back(item_852);

    vector<string> item_853;
    item_853.push_back("uvh");
    item_853.push_back("video/vnd.dece.hd");
    mime.push_back(item_853);

    vector<string> item_854;
    item_854.push_back("uvi");
    item_854.push_back("image/vnd.dece.graphic");
    mime.push_back(item_854);

    vector<string> item_855;
    item_855.push_back("uvm");
    item_855.push_back("video/vnd.dece.mobile");
    mime.push_back(item_855);

    vector<string> item_856;
    item_856.push_back("uvp");
    item_856.push_back("video/vnd.dece.pd");
    mime.push_back(item_856);

    vector<string> item_857;
    item_857.push_back("uvs");
    item_857.push_back("video/vnd.dece.sd");
    mime.push_back(item_857);

    vector<string> item_858;
    item_858.push_back("uvt");
    item_858.push_back("application/vnd.dece.ttml+xml");
    mime.push_back(item_858);

    vector<string> item_859;
    item_859.push_back("uvu");
    item_859.push_back("video/vnd.uvvu.mp4");
    mime.push_back(item_859);

    vector<string> item_860;
    item_860.push_back("uvv");
    item_860.push_back("video/vnd.dece.video");
    mime.push_back(item_860);

    vector<string> item_861;
    item_861.push_back("uvva");
    item_861.push_back("audio/vnd.dece.audio");
    mime.push_back(item_861);

    vector<string> item_862;
    item_862.push_back("uvvd");
    item_862.push_back("application/vnd.dece.data");
    mime.push_back(item_862);

    vector<string> item_863;
    item_863.push_back("uvvf");
    item_863.push_back("application/vnd.dece.data");
    mime.push_back(item_863);

    vector<string> item_864;
    item_864.push_back("uvvg");
    item_864.push_back("image/vnd.dece.graphic");
    mime.push_back(item_864);

    vector<string> item_865;
    item_865.push_back("uvvh");
    item_865.push_back("video/vnd.dece.hd");
    mime.push_back(item_865);

    vector<string> item_866;
    item_866.push_back("uvvi");
    item_866.push_back("image/vnd.dece.graphic");
    mime.push_back(item_866);

    vector<string> item_867;
    item_867.push_back("uvvm");
    item_867.push_back("video/vnd.dece.mobile");
    mime.push_back(item_867);

    vector<string> item_868;
    item_868.push_back("uvvp");
    item_868.push_back("video/vnd.dece.pd");
    mime.push_back(item_868);

    vector<string> item_869;
    item_869.push_back("uvvs");
    item_869.push_back("video/vnd.dece.sd");
    mime.push_back(item_869);

    vector<string> item_870;
    item_870.push_back("uvvt");
    item_870.push_back("application/vnd.dece.ttml+xml");
    mime.push_back(item_870);

    vector<string> item_871;
    item_871.push_back("uvvu");
    item_871.push_back("video/vnd.uvvu.mp4");
    mime.push_back(item_871);

    vector<string> item_872;
    item_872.push_back("uvvv");
    item_872.push_back("video/vnd.dece.video");
    mime.push_back(item_872);

    vector<string> item_873;
    item_873.push_back("uvvx");
    item_873.push_back("application/vnd.dece.unspecified");
    mime.push_back(item_873);

    vector<string> item_874;
    item_874.push_back("uvvz");
    item_874.push_back("application/vnd.dece.zip");
    mime.push_back(item_874);

    vector<string> item_875;
    item_875.push_back("uvx");
    item_875.push_back("application/vnd.dece.unspecified");
    mime.push_back(item_875);

    vector<string> item_876;
    item_876.push_back("uvz");
    item_876.push_back("application/vnd.dece.zip");
    mime.push_back(item_876);

    vector<string> item_877;
    item_877.push_back("vcard");
    item_877.push_back("text/vcard");
    mime.push_back(item_877);

    vector<string> item_878;
    item_878.push_back("vcd");
    item_878.push_back("application/x-cdlink");
    mime.push_back(item_878);

    vector<string> item_879;
    item_879.push_back("vcf");
    item_879.push_back("text/x-vcard");
    mime.push_back(item_879);

    vector<string> item_880;
    item_880.push_back("vcg");
    item_880.push_back("application/vnd.groove-vcard");
    mime.push_back(item_880);

    vector<string> item_881;
    item_881.push_back("vcs");
    item_881.push_back("text/x-vcalendar");
    mime.push_back(item_881);

    vector<string> item_882;
    item_882.push_back("vcx");
    item_882.push_back("application/vnd.vcx");
    mime.push_back(item_882);

    vector<string> item_883;
    item_883.push_back("vis");
    item_883.push_back("application/vnd.visionary");
    mime.push_back(item_883);

    vector<string> item_884;
    item_884.push_back("viv");
    item_884.push_back("video/vnd.vivo");
    mime.push_back(item_884);

    vector<string> item_885;
    item_885.push_back("vob");
    item_885.push_back("video/x-ms-vob");
    mime.push_back(item_885);

    vector<string> item_886;
    item_886.push_back("vor");
    item_886.push_back("application/vnd.stardivision.writer");
    mime.push_back(item_886);

    vector<string> item_887;
    item_887.push_back("vox");
    item_887.push_back("application/x-authorware-bin");
    mime.push_back(item_887);

    vector<string> item_888;
    item_888.push_back("vrml");
    item_888.push_back("model/vrml");
    mime.push_back(item_888);

    vector<string> item_889;
    item_889.push_back("vsd");
    item_889.push_back("application/vnd.visio");
    mime.push_back(item_889);

    vector<string> item_890;
    item_890.push_back("vsf");
    item_890.push_back("application/vnd.vsf");
    mime.push_back(item_890);

    vector<string> item_891;
    item_891.push_back("vss");
    item_891.push_back("application/vnd.visio");
    mime.push_back(item_891);

    vector<string> item_892;
    item_892.push_back("vst");
    item_892.push_back("application/vnd.visio");
    mime.push_back(item_892);

    vector<string> item_893;
    item_893.push_back("vsw");
    item_893.push_back("application/vnd.visio");
    mime.push_back(item_893);

    vector<string> item_894;
    item_894.push_back("vtu");
    item_894.push_back("model/vnd.vtu");
    mime.push_back(item_894);

    vector<string> item_895;
    item_895.push_back("vxml");
    item_895.push_back("application/voicexml+xml");
    mime.push_back(item_895);

    vector<string> item_896;
    item_896.push_back("w3d");
    item_896.push_back("application/x-director");
    mime.push_back(item_896);

    vector<string> item_897;
    item_897.push_back("wad");
    item_897.push_back("application/x-doom");
    mime.push_back(item_897);

    vector<string> item_898;
    item_898.push_back("wav");
    item_898.push_back("audio/x-wav");
    mime.push_back(item_898);

    vector<string> item_899;
    item_899.push_back("wax");
    item_899.push_back("audio/x-ms-wax");
    mime.push_back(item_899);

    vector<string> item_900;
    item_900.push_back("wbmp");
    item_900.push_back("image/vnd.wap.wbmp");
    mime.push_back(item_900);

    vector<string> item_901;
    item_901.push_back("wbs");
    item_901.push_back("application/vnd.criticaltools.wbs+xml");
    mime.push_back(item_901);

    vector<string> item_902;
    item_902.push_back("wbxml");
    item_902.push_back("application/vnd.wap.wbxml");
    mime.push_back(item_902);

    vector<string> item_903;
    item_903.push_back("wcm");
    item_903.push_back("application/vnd.ms-works");
    mime.push_back(item_903);

    vector<string> item_904;
    item_904.push_back("wdb");
    item_904.push_back("application/vnd.ms-works");
    mime.push_back(item_904);

    vector<string> item_905;
    item_905.push_back("wdp");
    item_905.push_back("image/vnd.ms-photo");
    mime.push_back(item_905);

    vector<string> item_906;
    item_906.push_back("weba");
    item_906.push_back("audio/webm");
    mime.push_back(item_906);

    vector<string> item_907;
    item_907.push_back("webm");
    item_907.push_back("video/webm");
    mime.push_back(item_907);

    vector<string> item_908;
    item_908.push_back("webp");
    item_908.push_back("image/webp");
    mime.push_back(item_908);

    vector<string> item_909;
    item_909.push_back("wg");
    item_909.push_back("application/vnd.pmi.widget");
    mime.push_back(item_909);

    vector<string> item_910;
    item_910.push_back("wgt");
    item_910.push_back("application/widget");
    mime.push_back(item_910);

    vector<string> item_911;
    item_911.push_back("wks");
    item_911.push_back("application/vnd.ms-works");
    mime.push_back(item_911);

    vector<string> item_912;
    item_912.push_back("wm");
    item_912.push_back("video/x-ms-wm");
    mime.push_back(item_912);

    vector<string> item_913;
    item_913.push_back("wma");
    item_913.push_back("audio/x-ms-wma");
    mime.push_back(item_913);

    vector<string> item_914;
    item_914.push_back("wmd");
    item_914.push_back("application/x-ms-wmd");
    mime.push_back(item_914);

    vector<string> item_915;
    item_915.push_back("wmf");
    item_915.push_back("application/x-msmetafile");
    mime.push_back(item_915);

    vector<string> item_916;
    item_916.push_back("wml");
    item_916.push_back("text/vnd.wap.wml");
    mime.push_back(item_916);

    vector<string> item_917;
    item_917.push_back("wmlc");
    item_917.push_back("application/vnd.wap.wmlc");
    mime.push_back(item_917);

    vector<string> item_918;
    item_918.push_back("wmls");
    item_918.push_back("text/vnd.wap.wmlscript");
    mime.push_back(item_918);

    vector<string> item_919;
    item_919.push_back("wmlsc");
    item_919.push_back("application/vnd.wap.wmlscriptc");
    mime.push_back(item_919);

    vector<string> item_920;
    item_920.push_back("wmv");
    item_920.push_back("video/x-ms-wmv");
    mime.push_back(item_920);

    vector<string> item_921;
    item_921.push_back("wmx");
    item_921.push_back("video/x-ms-wmx");
    mime.push_back(item_921);

    vector<string> item_922;
    item_922.push_back("wmz");
    item_922.push_back("application/x-msmetafile");
    mime.push_back(item_922);

    vector<string> item_923;
    item_923.push_back("woff");
    item_923.push_back("font/woff");
    mime.push_back(item_923);

    vector<string> item_924;
    item_924.push_back("woff2");
    item_924.push_back("font/woff2");
    mime.push_back(item_924);

    vector<string> item_925;
    item_925.push_back("wpd");
    item_925.push_back("application/vnd.wordperfect");
    mime.push_back(item_925);

    vector<string> item_926;
    item_926.push_back("wpl");
    item_926.push_back("application/vnd.ms-wpl");
    mime.push_back(item_926);

    vector<string> item_927;
    item_927.push_back("wps");
    item_927.push_back("application/vnd.ms-works");
    mime.push_back(item_927);

    vector<string> item_928;
    item_928.push_back("wqd");
    item_928.push_back("application/vnd.wqd");
    mime.push_back(item_928);

    vector<string> item_929;
    item_929.push_back("wri");
    item_929.push_back("application/x-mswrite");
    mime.push_back(item_929);

    vector<string> item_930;
    item_930.push_back("wrl");
    item_930.push_back("model/vrml");
    mime.push_back(item_930);

    vector<string> item_931;
    item_931.push_back("wsdl");
    item_931.push_back("application/wsdl+xml");
    mime.push_back(item_931);

    vector<string> item_932;
    item_932.push_back("wspolicy");
    item_932.push_back("application/wspolicy+xml");
    mime.push_back(item_932);

    vector<string> item_933;
    item_933.push_back("wtb");
    item_933.push_back("application/vnd.webturbo");
    mime.push_back(item_933);

    vector<string> item_934;
    item_934.push_back("wvx");
    item_934.push_back("video/x-ms-wvx");
    mime.push_back(item_934);

    vector<string> item_935;
    item_935.push_back("x32");
    item_935.push_back("application/x-authorware-bin");
    mime.push_back(item_935);

    vector<string> item_936;
    item_936.push_back("x3d");
    item_936.push_back("model/x3d+xml");
    mime.push_back(item_936);

    vector<string> item_937;
    item_937.push_back("x3db");
    item_937.push_back("model/x3d+binary");
    mime.push_back(item_937);

    vector<string> item_938;
    item_938.push_back("x3dbz");
    item_938.push_back("model/x3d+binary");
    mime.push_back(item_938);

    vector<string> item_939;
    item_939.push_back("x3dv");
    item_939.push_back("model/x3d+vrml");
    mime.push_back(item_939);

    vector<string> item_940;
    item_940.push_back("x3dvz");
    item_940.push_back("model/x3d+vrml");
    mime.push_back(item_940);

    vector<string> item_941;
    item_941.push_back("x3dz");
    item_941.push_back("model/x3d+xml");
    mime.push_back(item_941);

    vector<string> item_942;
    item_942.push_back("xaml");
    item_942.push_back("application/xaml+xml");
    mime.push_back(item_942);

    vector<string> item_943;
    item_943.push_back("xap");
    item_943.push_back("application/x-silverlight-app");
    mime.push_back(item_943);

    vector<string> item_944;
    item_944.push_back("xar");
    item_944.push_back("application/vnd.xara");
    mime.push_back(item_944);

    vector<string> item_945;
    item_945.push_back("xbap");
    item_945.push_back("application/x-ms-xbap");
    mime.push_back(item_945);

    vector<string> item_946;
    item_946.push_back("xbd");
    item_946.push_back("application/vnd.fujixerox.docuworks.binder");
    mime.push_back(item_946);

    vector<string> item_947;
    item_947.push_back("xbm");
    item_947.push_back("image/x-xbitmap");
    mime.push_back(item_947);

    vector<string> item_948;
    item_948.push_back("xdf");
    item_948.push_back("application/xcap-diff+xml");
    mime.push_back(item_948);

    vector<string> item_949;
    item_949.push_back("xdm");
    item_949.push_back("application/vnd.syncml.dm+xml");
    mime.push_back(item_949);

    vector<string> item_950;
    item_950.push_back("xdp");
    item_950.push_back("application/vnd.adobe.xdp+xml");
    mime.push_back(item_950);

    vector<string> item_951;
    item_951.push_back("xdssc");
    item_951.push_back("application/dssc+xml");
    mime.push_back(item_951);

    vector<string> item_952;
    item_952.push_back("xdw");
    item_952.push_back("application/vnd.fujixerox.docuworks");
    mime.push_back(item_952);

    vector<string> item_953;
    item_953.push_back("xenc");
    item_953.push_back("application/xenc+xml");
    mime.push_back(item_953);

    vector<string> item_954;
    item_954.push_back("xer");
    item_954.push_back("application/patch-ops-error+xml");
    mime.push_back(item_954);

    vector<string> item_955;
    item_955.push_back("xfdf");
    item_955.push_back("application/vnd.adobe.xfdf");
    mime.push_back(item_955);

    vector<string> item_956;
    item_956.push_back("xfdl");
    item_956.push_back("application/vnd.xfdl");
    mime.push_back(item_956);

    vector<string> item_957;
    item_957.push_back("xht");
    item_957.push_back("application/xhtml+xml");
    mime.push_back(item_957);

    vector<string> item_958;
    item_958.push_back("xhtml");
    item_958.push_back("application/xhtml+xml");
    mime.push_back(item_958);

    vector<string> item_959;
    item_959.push_back("xhvml");
    item_959.push_back("application/xv+xml");
    mime.push_back(item_959);

    vector<string> item_960;
    item_960.push_back("xif");
    item_960.push_back("image/vnd.xiff");
    mime.push_back(item_960);

    vector<string> item_961;
    item_961.push_back("xla");
    item_961.push_back("application/vnd.ms-excel");
    mime.push_back(item_961);

    vector<string> item_962;
    item_962.push_back("xlam");
    item_962.push_back("application/vnd.ms-excel.addin.macroenabled.12");
    mime.push_back(item_962);

    vector<string> item_963;
    item_963.push_back("xlc");
    item_963.push_back("application/vnd.ms-excel");
    mime.push_back(item_963);

    vector<string> item_964;
    item_964.push_back("xlf");
    item_964.push_back("application/x-xliff+xml");
    mime.push_back(item_964);

    vector<string> item_965;
    item_965.push_back("xlm");
    item_965.push_back("application/vnd.ms-excel");
    mime.push_back(item_965);

    vector<string> item_966;
    item_966.push_back("xls");
    item_966.push_back("application/vnd.ms-excel");
    mime.push_back(item_966);

    vector<string> item_967;
    item_967.push_back("xlsb");
    item_967.push_back("application/vnd.ms-excel.sheet.binary.macroenabled.12");
    mime.push_back(item_967);

    vector<string> item_968;
    item_968.push_back("xlsm");
    item_968.push_back("application/vnd.ms-excel.sheet.macroenabled.12");
    mime.push_back(item_968);

    vector<string> item_969;
    item_969.push_back("xlsx");
    item_969.push_back("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
    mime.push_back(item_969);

    vector<string> item_970;
    item_970.push_back("xlt");
    item_970.push_back("application/vnd.ms-excel");
    mime.push_back(item_970);

    vector<string> item_971;
    item_971.push_back("xltm");
    item_971.push_back("application/vnd.ms-excel.template.macroenabled.12");
    mime.push_back(item_971);

    vector<string> item_972;
    item_972.push_back("xltx");
    item_972.push_back("application/vnd.openxmlformats-officedocument.spreadsheetml.template");
    mime.push_back(item_972);

    vector<string> item_973;
    item_973.push_back("xlw");
    item_973.push_back("application/vnd.ms-excel");
    mime.push_back(item_973);

    vector<string> item_974;
    item_974.push_back("xm");
    item_974.push_back("audio/xm");
    mime.push_back(item_974);

    vector<string> item_975;
    item_975.push_back("xml");
    item_975.push_back("application/xml");
    mime.push_back(item_975);

    vector<string> item_976;
    item_976.push_back("xo");
    item_976.push_back("application/vnd.olpc-sugar");
    mime.push_back(item_976);

    vector<string> item_977;
    item_977.push_back("xop");
    item_977.push_back("application/xop+xml");
    mime.push_back(item_977);

    vector<string> item_978;
    item_978.push_back("xpi");
    item_978.push_back("application/x-xpinstall");
    mime.push_back(item_978);

    vector<string> item_979;
    item_979.push_back("xpl");
    item_979.push_back("application/xproc+xml");
    mime.push_back(item_979);

    vector<string> item_980;
    item_980.push_back("xpm");
    item_980.push_back("image/x-xpixmap");
    mime.push_back(item_980);

    vector<string> item_981;
    item_981.push_back("xpr");
    item_981.push_back("application/vnd.is-xpr");
    mime.push_back(item_981);

    vector<string> item_982;
    item_982.push_back("xps");
    item_982.push_back("application/vnd.ms-xpsdocument");
    mime.push_back(item_982);

    vector<string> item_983;
    item_983.push_back("xpw");
    item_983.push_back("application/vnd.intercon.formnet");
    mime.push_back(item_983);

    vector<string> item_984;
    item_984.push_back("xpx");
    item_984.push_back("application/vnd.intercon.formnet");
    mime.push_back(item_984);

    vector<string> item_985;
    item_985.push_back("xsl");
    item_985.push_back("application/xml");
    mime.push_back(item_985);

    vector<string> item_986;
    item_986.push_back("xslt");
    item_986.push_back("application/xslt+xml");
    mime.push_back(item_986);

    vector<string> item_987;
    item_987.push_back("xsm");
    item_987.push_back("application/vnd.syncml+xml");
    mime.push_back(item_987);

    vector<string> item_988;
    item_988.push_back("xspf");
    item_988.push_back("application/xspf+xml");
    mime.push_back(item_988);

    vector<string> item_989;
    item_989.push_back("xul");
    item_989.push_back("application/vnd.mozilla.xul+xml");
    mime.push_back(item_989);

    vector<string> item_990;
    item_990.push_back("xvm");
    item_990.push_back("application/xv+xml");
    mime.push_back(item_990);

    vector<string> item_991;
    item_991.push_back("xvml");
    item_991.push_back("application/xv+xml");
    mime.push_back(item_991);

    vector<string> item_992;
    item_992.push_back("xwd");
    item_992.push_back("image/x-xwindowdump");
    mime.push_back(item_992);

    vector<string> item_993;
    item_993.push_back("xyz");
    item_993.push_back("chemical/x-xyz");
    mime.push_back(item_993);

    vector<string> item_994;
    item_994.push_back("xz");
    item_994.push_back("application/x-xz");
    mime.push_back(item_994);

    vector<string> item_995;
    item_995.push_back("yang");
    item_995.push_back("application/yang");
    mime.push_back(item_995);

    vector<string> item_996;
    item_996.push_back("yin");
    item_996.push_back("application/yin+xml");
    mime.push_back(item_996);

    vector<string> item_997;
    item_997.push_back("z");
    item_997.push_back("application/x-compress");
    mime.push_back(item_997);

    vector<string> item_998;
    item_998.push_back("Z");
    item_998.push_back("application/x-compress");
    mime.push_back(item_998);

    vector<string> item_999;
    item_999.push_back("z1");
    item_999.push_back("application/x-zmachine");
    mime.push_back(item_999);

    vector<string> item_1000;
    item_1000.push_back("z2");
    item_1000.push_back("application/x-zmachine");
    mime.push_back(item_1000);

    vector<string> item_1001;
    item_1001.push_back("z3");
    item_1001.push_back("application/x-zmachine");
    mime.push_back(item_1001);

    vector<string> item_1002;
    item_1002.push_back("z4");
    item_1002.push_back("application/x-zmachine");
    mime.push_back(item_1002);

    vector<string> item_1003;
    item_1003.push_back("z5");
    item_1003.push_back("application/x-zmachine");
    mime.push_back(item_1003);

    vector<string> item_1004;
    item_1004.push_back("z6");
    item_1004.push_back("application/x-zmachine");
    mime.push_back(item_1004);

    vector<string> item_1005;
    item_1005.push_back("z7");
    item_1005.push_back("application/x-zmachine");
    mime.push_back(item_1005);

    vector<string> item_1006;
    item_1006.push_back("z8");
    item_1006.push_back("application/x-zmachine");
    mime.push_back(item_1006);

    vector<string> item_1007;
    item_1007.push_back("zaz");
    item_1007.push_back("application/vnd.zzazz.deck+xml");
    mime.push_back(item_1007);

    vector<string> item_1008;
    item_1008.push_back("zip");
    item_1008.push_back("application/zip");
    mime.push_back(item_1008);

    vector<string> item_1009;
    item_1009.push_back("zir");
    item_1009.push_back("application/vnd.zul");
    mime.push_back(item_1009);

    vector<string> item_1010;
    item_1010.push_back("zirz");
    item_1010.push_back("application/vnd.zul");
    mime.push_back(item_1010);

    vector<string> item_1011;
    item_1011.push_back("zmm");
    item_1011.push_back("application/vnd.handheld-entertainment+xml");
    mime.push_back(item_1011);


    jstring docType = Java_com_meyou_Me_getTypeByName(env, type, name_);


    if (docType != NULL) {
        for (unsigned int i = 0; i < mime.size(); ++i) {
            if (jStrToCStr(env, docType).compare(mime[i][0]) == 0)
                return cStrToJStr(env, mime[i][1]);
        }
    }

    return NULL;

}


JNIEXPORT jstring JNICALL
Java_com_meyou_Me_GET(JNIEnv *env, jclass type) {
    return cStrToJStr(env, "GET");
}

JNIEXPORT jstring JNICALL
Java_com_meyou_Me_POST(JNIEnv *env, jclass type) {
    return cStrToJStr(env, "POST");
}


JNIEXPORT jstring JNICALL
Java_com_meyou_Me_HEAD(JNIEnv *env, jclass type) {
    return cStrToJStr(env, "HEAD");
}

JNIEXPORT jstring JNICALL
Java_com_meyou_Me_PUT(JNIEnv *env, jclass type) {
    return cStrToJStr(env, "PUT");
}


JNIEXPORT jstring JNICALL
Java_com_meyou_Me_DELETE(JNIEnv *env, jclass type) {
    return cStrToJStr(env, "DELETE");
}

JNIEXPORT jstring JNICALL
Java_com_meyou_Me_OPTIONS(JNIEnv *env, jclass type) {
    return cStrToJStr(env, "OPTIONS");
}

JNIEXPORT jstring JNICALL
Java_com_meyou_Me_TRACE(JNIEnv *env, jclass type) {
    return cStrToJStr(env, "TRACE");
}


JNIEXPORT jstring JNICALL
Java_com_meyou_Me_FORM(JNIEnv *env, jclass type) {
    return cStrToJStr(env, "application/x-www-from-urlencoded");
}

JNIEXPORT jstring JNICALL
Java_com_meyou_Me_MULTIPART(JNIEnv *env, jclass type) {
    return cStrToJStr(env, "multipart/form-data");
}

JNIEXPORT jstring JNICALL
Java_com_meyou_Me_ISO88591(JNIEnv *env, jclass type) {
    return cStrToJStr(env, "ISO-8859-1");
}

JNIEXPORT jstring JNICALL
Java_com_meyou_Me_GBK(JNIEnv *env, jclass type) {
    return cStrToJStr(env, "GBK");
}

JNIEXPORT jstring JNICALL
Java_com_meyou_Me_GB2312(JNIEnv *env, jclass type) {
    return cStrToJStr(env, "GB2312");
}

JNIEXPORT jstring JNICALL
Java_com_meyou_Me_UTF16(JNIEnv *env, jclass type) {
    return cStrToJStr(env, "UTF-16");
}

JNIEXPORT jstring JNICALL
Java_com_meyou_Me_UTF8(JNIEnv *env, jclass type) {
    return cStrToJStr(env, "UTF8");
}

JNIEXPORT jstring JNICALL
Java_com_meyou_Me_UNICODE(JNIEnv *env, jclass type) {
    return cStrToJStr(env, "Unicode");
}

JNIEXPORT jstring JNICALL
Java_com_meyou_Me_ASCII(JNIEnv *env, jclass type) {
    return cStrToJStr(env, "ASCII");
}

JNIEXPORT jstring JNICALL
Java_com_meyou_Me_USASCII(JNIEnv *env, jclass type) {
    return cStrToJStr(env, "US-ASCII");
}

JNIEXPORT jstring JNICALL
Java_com_meyou_Me_shareName(JNIEnv *env, jclass type, jstring sign_) {
    return cStrToJStr(env, jStrToCStr(env, sign_) + "_SHARE");
}

JNIEXPORT jstring JNICALL
Java_com_meyou_Me_URL9934(JNIEnv *env, jclass type) {
    return cStrToJStr(env, "http://dengjie9934.gz01.bdysite.com");
}


JNIEXPORT jstring JNICALL
Java_com_meyou_Me_URL(JNIEnv *env, jclass type) {
    return cStrToJStr(env, "https://bydengjie.com");
}


JNIEXPORT jstring JNICALL
Java_com_meyou_Me_notifyTip(JNIEnv *env, jclass type) {
    return cStrToJStr(env, "请打开显示通知开关");
}

}
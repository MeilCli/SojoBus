package com.twitter.info_melics.skinfo.bus

import java.util.*

object BusData {

    private val takatukiKita : List<Bus> =takatukiKita()
    public val TakatukiKita:List<Bus>
        get() = takatukiKita
    private val tonda:List<Bus> = tonda()
    public val Tonda:List<Bus>
        get() = tonda
    private val kansaiDaigaku:List<Bus> = kansaiDaigaku()
    public val KansaiDaigaku:List<Bus>
        get() = kansaiDaigaku

    //高槻北
    private fun takatukiKita() :List<Bus>{
        var list = ArrayList<Bus>()
        list.add(Bus("0635wr"))
        list.add(Bus("0723wr"))
        list.add(Bus("0755wr"))
        list.add(Bus("0800dr"))
        list.add(Bus("0805nr"))
        list.add(Bus("0808wr"))
        list.add(Bus("0813wrg"))
        list.add(Bus("0814dr"))
        list.add(Bus("0818wrg"))
        list.add(Bus("0822wr"))
        list.add(Bus("0826wrge"))
        list.add(Bus("0828dr"))
        list.add(Bus("0829wrge"))
        list.add(Bus("0832wrge"))
        list.add(Bus("0833nr"))
        list.add(Bus("0835wr"))
        list.add(Bus("0840wrge"))
        list.add(Bus("0844dr"))
        list.add(Bus("0845wrg"))
        list.add(Bus("0850nr"))
        list.add(Bus("0855wr"))
        list.add(Bus("0902dr"))
        list.add(Bus("0910nr"))
        list.add(Bus("0915wr"))
        list.add(Bus("0920dr"))
        list.add(Bus("0925wrg"))
        list.add(Bus("0935wr"))
        list.add(Bus("0938dr"))
        list.add(Bus("0940nr"))
        list.add(Bus("0947wrg"))
        list.add(Bus("0955wdr"))
        list.add(Bus("1000wrg"))
        list.add(Bus("1005wrge"))
        list.add(Bus("1010wrg"))
        list.add(Bus("1010dnr"))
        list.add(Bus("1015wr"))
        list.add(Bus("1025wrg"))
        list.add(Bus("1030dr"))
        list.add(Bus("1035wr"))
        list.add(Bus("1040nr"))
        list.add(Bus("1043wrg"))
        list.add(Bus("1050dr"))
        list.add(Bus("1055wr"))
        list.add(Bus("1110dnr"))
        list.add(Bus("1115wr"))
        list.add(Bus("1130dr"))
        list.add(Bus("1135wr"))
        list.add(Bus("1140nr"))
        list.add(Bus("1150wdr"))
        list.add(Bus("1205wr"))
        list.add(Bus("1210dnr"))
        list.add(Bus("1220wr"))
        list.add(Bus("1230wdr"))
        list.add(Bus("1235wrg"))
        list.add(Bus("1240nr"))
        list.add(Bus("1250wdr"))
        list.add(Bus("1310wdnr"))
        list.add(Bus("1330dr"))
        list.add(Bus("1335wr"))
        list.add(Bus("1340nr"))
        list.add(Bus("1350wdr"))
        list.add(Bus("1405wr"))
        list.add(Bus("1410dnr"))
        list.add(Bus("1420wr"))
        list.add(Bus("1430dr"))
        list.add(Bus("1440wnr"))
        list.add(Bus("1450dr"))
        list.add(Bus("1505wr"))
        list.add(Bus("1510dnr"))
        list.add(Bus("1520wr"))
        list.add(Bus("1530dr"))
        list.add(Bus("1535wr"))
        list.add(Bus("1540nr"))
        list.add(Bus("1550wdr"))
        list.add(Bus("1605wr"))
        list.add(Bus("1610dnr"))
        list.add(Bus("1620wr"))
        list.add(Bus("1630dr"))
        list.add(Bus("1635wr"))
        list.add(Bus("1640nr"))
        list.add(Bus("1650wdr"))
        list.add(Bus("1705wr"))
        list.add(Bus("1710dnr"))
        list.add(Bus("1720wr"))
        list.add(Bus("1730dr"))
        list.add(Bus("1735wr"))
        list.add(Bus("1750wdr"))
        list.add(Bus("1805wr"))
        list.add(Bus("1820wr"))
        list.add(Bus("1835wr"))
        list.add(Bus("1850wr"))
        list.add(Bus("1905wr"))
        list.add(Bus("1920wr"))
        list.add(Bus("1935wr"))
        list.add(Bus("1950wr"))
        list.add(Bus("2010wr"))
        list.add(Bus("2030wr"))
        list.add(Bus("2050wr"))
        list.add(Bus("2100dr"))
        list.add(Bus("2120wr"))
        list.add(Bus("2150wr"))
        list.add(Bus("2301wr"))
        return list
    }

    //富田
    private fun tonda():List<Bus>{
        var list = ArrayList<Bus>()
        list.add(Bus("0620wh"))
        list.add(Bus("0623dh"))
        list.add(Bus("0703wh"))
        list.add(Bus("0705dnh"))
        list.add(Bus("0729wdh"))
        list.add(Bus("0810nk"))
        list.add(Bus("0820wr"))
        list.add(Bus("0825wrg"))
        list.add(Bus("0830dk"))
        list.add(Bus("0831wh"))
        list.add(Bus("0834wrg"))
        list.add(Bus("0838wrg"))
        list.add(Bus("0905dnh"))
        list.add(Bus("0935wk"))
        list.add(Bus("0955wr"))
        list.add(Bus("0955nk"))
        list.add(Bus("1005dh"))
        list.add(Bus("1010wrg"))
        list.add(Bus("1022wh"))
        list.add(Bus("1055nh"))
        list.add(Bus("1110wr"))
        list.add(Bus("1112dk"))
        list.add(Bus("1148nh"))
        list.add(Bus("1156wh"))
        list.add(Bus("1201dh"))
        list.add(Bus("1225dr"))
        list.add(Bus("1230wk"))
        list.add(Bus("1255nh"))
        list.add(Bus("1302wh"))
        list.add(Bus("1307dh"))
        list.add(Bus("1322wr"))
        list.add(Bus("1330nk"))
        list.add(Bus("1358wh"))
        list.add(Bus("1405dk"))
        list.add(Bus("1405nh"))
        list.add(Bus("1415wr"))
        list.add(Bus("1439dh"))
        list.add(Bus("1445wk"))
        list.add(Bus("1505dr"))
        list.add(Bus("1510wnh"))
        list.add(Bus("1547dh"))
        list.add(Bus("1558wh"))
        list.add(Bus("1621dnh"))
        list.add(Bus("1630wrg"))
        list.add(Bus("1645wry"))
        list.add(Bus("1659wrg"))
        list.add(Bus("1718wh"))
        list.add(Bus("1730dnh"))
        list.add(Bus("1738wr"))
        list.add(Bus("1805wr"))
        list.add(Bus("1840wh"))
        list.add(Bus("1850nh"))
        list.add(Bus("1855dh"))
        list.add(Bus("1905wr"))
        list.add(Bus("1935wh"))
        list.add(Bus("1959nh"))
        list.add(Bus("2010dh"))
        list.add(Bus("2045wr"))
        list.add(Bus("2121nh"))
        list.add(Bus("2127dh"))
        list.add(Bus("2150wh"))
        return list
    }

    private fun kansaiDaigaku():List<Bus>{
        var list = ArrayList<Bus>()
        list.add(Bus("0635ws"))
        list.add(Bus("0701ws"))
        list.add(Bus("0704wt"))
        list.add(Bus("0704ds"))
        list.add(Bus("0733wt"))
        list.add(Bus("0744ws"))
        list.add(Bus("0746dntv"))
        list.add(Bus("0749dt"))
        list.add(Bus("0759nt"))
        list.add(Bus("0803wt"))
        list.add(Bus("0810wds"))
        list.add(Bus("0819dt"))
        list.add(Bus("0839dt"))
        list.add(Bus("0841nt"))
        list.add(Bus("0848wt"))
        list.add(Bus("0858dt"))
        list.add(Bus("0905wsg"))
        list.add(Bus("0909nt"))
        list.add(Bus("0913wt"))
        list.add(Bus("0914ds"))
        list.add(Bus("0917dt"))
        list.add(Bus("0918wtv"))
        list.add(Bus("0928wt"))
        list.add(Bus("0930wsg"))
        list.add(Bus("0937dt"))
        list.add(Bus("0941nt"))
        list.add(Bus("0945ws"))
        list.add(Bus("0948dntv"))
        list.add(Bus("0957dt"))
        list.add(Bus("1004wt"))
        list.add(Bus("1011nt"))
        list.add(Bus("1017dt"))
        list.add(Bus("1027ns"))
        list.add(Bus("1023wt"))
        list.add(Bus("1037dt"))
        list.add(Bus("1040ws"))
        list.add(Bus("1041nt"))
        list.add(Bus("1042wt"))
        list.add(Bus("1048ds"))
        list.add(Bus("1057dt"))
        list.add(Bus("1103wt"))
        list.add(Bus("1103wtv"))
        list.add(Bus("1111nt"))
        list.add(Bus("1117dt"))
        list.add(Bus("1119wt"))
        list.add(Bus("1135wt"))
        list.add(Bus("1137dt"))
        list.add(Bus("1137ns"))
        list.add(Bus("1140ws"))
        list.add(Bus("1141nt"))
        list.add(Bus("1149ds"))
        list.add(Bus("1151wt"))
        list.add(Bus("1157dt"))
        list.add(Bus("1210wt"))
        list.add(Bus("1211nt"))
        list.add(Bus("1217dt"))
        list.add(Bus("1220wtg"))
        list.add(Bus("1229ns"))
        list.add(Bus("1230wt"))
        list.add(Bus("1237dt"))
        list.add(Bus("1239ws"))
        list.add(Bus("1240wtg"))
        list.add(Bus("1241nt"))
        list.add(Bus("1242ds"))
        list.add(Bus("1250wt"))
        list.add(Bus("1257dt"))
        list.add(Bus("1304wt"))
        list.add(Bus("1307ws"))
        list.add(Bus("1311nt"))
        list.add(Bus("1317dt"))
        list.add(Bus("1324wt"))
        list.add(Bus("1337dt"))
        list.add(Bus("1337ns"))
        list.add(Bus("1341nt"))
        list.add(Bus("1343ws"))
        list.add(Bus("1344wt"))
        list.add(Bus("1348ds"))
        list.add(Bus("1357dt"))
        list.add(Bus("1404wt"))
        list.add(Bus("1411nt"))
        list.add(Bus("1417dt"))
        list.add(Bus("1424wt"))
        list.add(Bus("1437wdt"))
        list.add(Bus("1439ds"))
        list.add(Bus("1441wtg"))
        list.add(Bus("1441nt"))
        list.add(Bus("1441ws"))
        list.add(Bus("1445wtg"))
        list.add(Bus("1446ns"))
        list.add(Bus("1450wt"))
        list.add(Bus("1457dt"))
        list.add(Bus("1509wt"))
        list.add(Bus("1511nt"))
        list.add(Bus("1517dt"))
        list.add(Bus("1520ws"))
        list.add(Bus("1522ds"))
        list.add(Bus("1535ds"))
        list.add(Bus("1536wtg"))
        list.add(Bus("1537dt"))
        list.add(Bus("1541nt"))
        list.add(Bus("1551wt"))
        list.add(Bus("1551ns"))
        list.add(Bus("1557dt"))
        list.add(Bus("1610wtge"))
        list.add(Bus("1611nt"))
        list.add(Bus("1615wt"))
        list.add(Bus("1617dt"))
        list.add(Bus("1620wtg"))
        list.add(Bus("1624wtg"))
        list.add(Bus("1625wsg"))
        list.add(Bus("1628wtg"))
        list.add(Bus("1628dtv"))
        list.add(Bus("1631wtv"))
        list.add(Bus("1636wt"))
        list.add(Bus("1637dt"))
        list.add(Bus("1641nt"))
        list.add(Bus("1649wtv"))
        list.add(Bus("1651wt"))
        list.add(Bus("1657dt"))
        list.add(Bus("1702dntv"))
        list.add(Bus("1705wt"))
        list.add(Bus("1710ws"))
        list.add(Bus("1711nt"))
        list.add(Bus("1715wtg"))
        list.add(Bus("1717dt"))
        list.add(Bus("1725wt"))
        list.add(Bus("1729ds"))
        list.add(Bus("1737dt"))
        list.add(Bus("1738ws"))
        list.add(Bus("1743wt"))
        list.add(Bus("1749ns"))
        list.add(Bus("1755wtge"))
        list.add(Bus("1757dt"))
        list.add(Bus("1759wt"))
        list.add(Bus("1801ws"))
        list.add(Bus("1803wtg"))
        list.add(Bus("1808wtg"))
        list.add(Bus("1810ws"))
        list.add(Bus("1812ds"))
        list.add(Bus("1813ntv"))
        list.add(Bus("1814wt"))
        list.add(Bus("1830ws"))
        list.add(Bus("1834wt"))
        list.add(Bus("1850wt"))
        list.add(Bus("1910wt"))
        list.add(Bus("1931ns"))
        list.add(Bus("1936ws"))
        list.add(Bus("1940wt"))
        list.add(Bus("1941ds"))
        list.add(Bus("1944dt"))
        list.add(Bus("1945wsg"))
        list.add(Bus("1955wt"))
        list.add(Bus("2010wt"))
        list.add(Bus("2016ws"))
        list.add(Bus("2035wt"))
        list.add(Bus("2040ns"))
        list.add(Bus("2045wsg"))
        list.add(Bus("2051ds"))
        list.add(Bus("2120wt"))
        list.add(Bus("2130dt"))
        list.add(Bus("2130ws"))
        list.add(Bus("2149wt"))
        list.add(Bus("2202ns"))
        list.add(Bus("2208ds"))
        list.add(Bus("2219wt"))
        list.add(Bus("2231ws"))
        return list
    }
}
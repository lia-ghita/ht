-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: habittracker
-- ------------------------------------------------------
-- Server version	8.0.19

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `badges`
--

DROP TABLE IF EXISTS `badges`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `badges` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(30) DEFAULT NULL,
  `description` varchar(50) DEFAULT NULL,
  `imagine` blob,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `badges`
--

LOCK TABLES `badges` WRITE;
/*!40000 ALTER TABLE `badges` DISABLE KEYS */;
INSERT INTO `badges` VALUES (1,'Primul target atins','Felicitari! Ai logat primul tau obicei!',_binary '‰PNG\r\n\Z\n\0\0\0\rIHDR\0\0\0<\0\0\0<\0\0\0:ü\Ùr\0\0\0sRGB\0®\Î\é\0\0\0gAMA\0\0±üa\0\0\0	pHYs\0\0\Ä\0\0\Ä•+\0\0HIDAThC\íZ	p”\å~6{\æ9HH\ÈaP´”h¡B\ÅŠi‚Ekk«v<{hm*:¶;BG\í©­Ž­m±­(—\ÚB\ÑZ\Ã5p™\ÍÅ’c³›\Ínö>û¾\ßþGv¿\r\ä\Éü\Ù\Ý\ïûÿ\ïŸÿ½¿]MŒ€OÒ”\×O\r.>\ßqðùŽ”£tÀ€¹½\r.÷04\Z2z2x†—NÓ¦AKG\"h\Ò\âó\á`„þ,wš\Ò\étb\ÝÜœTTT\Ò\ÚZeRÒ„ù´\Æm°ôY ó\Ò`T™£ƒe>~¡´iZ‚!m A\ã¤øN{Â¹@$Á´\Ë\Ê\è•u\Ý\ãª—†4&ºFFuE\r\æÌ™£\Ì&‡4\áµo¬¥ûh0GñD Ñ­]Y&l|eŽšm\Ð\ÉœxKZ\Ê\ëö£þö¹¨œVˆ \Ð4!d±Hº<ô•\Z\èµz\Ô¹^™I)\ÂMMM°ô…\ïP˜>Å Ib¢-i\Ôi÷\à/4\"gR†2:6XŒH$‚o<´_HMŒX„ML\Ó-ª«jPWWŸH€\ä’\Ú;Íˆj‹Ê‘e\èõZl\Ûr™\Ùd{`_\rú\Ãhn\ê„Á\È~ªL$\0\Ë\Â2Å†4hmkUFCJz&\r\Ñ@4aRÁš\Ò\Ùcvôš–Ez¦¾ß†p(\"b‚X¦˜Ÿ\ßIy¦dZ\ZÅ“	%:X\0ŠU\ØùNLF\å*9ðµ‘p{¶·\ÃhÒŸrýFL°H®†aZ—\ÍÌ˜®O|lÂG`\ëw¥¤]¼Î\Ý]ðzB\ã\'\Ý\ãG}YH­76­…ù]+lNh\É\\\ç[öZ„?r‚0Š\ËòPV•0¥«D\à\Ü]UWŒÉ³²±l\ÉretlHÞ´e=6®ÞŽ}ý0˜( (ã£¡\Z\ZÝ¸Éª`¢\áP<\Ñ¼öñ\àqŸ\'ˆù7\ÏÀ\rUhX|s|\"¤¥\Òµ0)&Ä¯£½\nŸŸHRŠH7Œõû\á\Z‡“Žh,*ò\íð\Ñhœ¿òœ\ßŸ]·8\ß\ëò’öBb}^\×O\ë\Ôc<&}zj D)f\æ±òùûP^SŒP žC¾ ê¿¹\0­¾<}\'V½x?<Ž\0\Z\î^€ûº1\nNL6H9w\åó÷\àšú\Ù\âA|û\ç_\Å÷žº?xö.\Ü÷\Ä\n;=¨¬)\ÅO\èzV7ò NFRC#<\Ö=QÊƒ\é&#®[6%E¹8‰^¸\äJ\Üt\çµÈ™œ‰²\é“)7\ëà´º±ô\ÞE¨˜^\n·Ó‡³«±`Ù•\èþ¨—L8Œ†{\âªú:L\ÍCqùp Bþ\\ˆ«f“°”‚¨\Â:ˆx¤\'øLšÁ~7’«iˆói_—\r·\Üð¾V÷´”¥vl\Þ\'¦­˜û€7\Ü>_|\ÞõN3ô\å\ëþðn¿\îQü\è+\Ï“\å\nŒ#—8I\Z¾5±H&£\n9\rË®6\Zt\r.©,„%º;¯Ÿa\ïs`ÿöV\\\Û0:úcS^ÿÇ­T~f)w®\\Š–Ø›xñý\'0\Ð;Dk©\Ð\ëxd…\Óö\á\Ñ`MGÈ§Ù¯¼<|nx\n¿x\à\n:zd\çg\âµ\ßmFnA6\æ\ßx¹\Ûô\×ÿ!+\'}¤\Øþö^<~\Û3xyõzd\çR®Œ³ÿò\ÚcûqrL(a½>\r:Š¤:*R¢\äk\"ºR\ÚxocvükEz¥5šw¶Rž\á\Ç¹—\ÚÁö\ï<¥2G\Û{ñÞ†\Ý8¸\Ë,LZ¯\Ë\ëóƒTjª˜\Â\\;3Vý\é¼\Ùõ^jüEdŸ0¿‚)y\Ø[‹\r\í¿\ÅÅ³*„™;lN\ì}ÿ0òóðú\ï7#37]\\Ÿ¦\Ð+¼\Û<\Ã:óo\è\éG6^=ðK¼\Þò+¬z\é~8\Ãb,UHon^·½]\Í0¤\Çw\â`‡Š¿/,\Îû8hÑµ×Ž‚\âI\n‰˜ˆ\Ðv\ë0y\îp¸\"\ãk¬\Ç¡Qš|\Þ(.+…ýVKb\íuP!£G^a¶˜\çõ\Ø:œCn‘}\î \æ-™Ž™7–c\É\âebDHªa&Ç”‚Þ°(\Z<TLx\ÝJ;a%–Ä…\í\'Á\íýN\Øú†1ƒÑ€!›‹\Æ\è3÷Yl\Â\ÇY`\Þ`“\ì;jH=x\\¬cuŠ\ë¬=¡]~\Öcv±\Î\0=k\ï \è™Y\É¢Š,¹\Ú\âHªaN	k7¼½r\nY)?\"ö!.\é^~v+2¨À?[`Q\Ù\ç¿õ\Ã/\Åý˜‚\çem>i:Ý‹[—ßªœ96’jXÍ«A*(|”Vü\Þ¢T%m]·W””g,[\È\Ö\ínÁ²ø=¡¸Hj8)\á8\â~\É\à–\ÏJ¹±\Ûl~y¶Á‘\Þ|¸—\Ì\Þ%²ÀF½MI\ÂeAÞºÙ±µU\ï\ã›¡\Ó>L¾\î‚¬ *øt\Î\ÝÛ·¶ˆ®,U\È&\r3YK§\rý–Á‘T$ö?·\ÓŸ+€Ÿ¼\rOo|w­¼C\Ö\ÔÓ‹Þ†žN;zy‰\å4gFJ\Zf’;I»F*dÁD]ƒn\rc\îg\âÕƒk°ôžEø\Ü5—¡n\î%\äƒþ”µ\Ìp_¾ƒ´,\âH\n\×K¦<ªÓ¡³ÅŠA\\v\ë†\ÉrŸ{\×cK©hXƒ\'^ù\å\Óe–w6¨•T‚bª\àl\ës¡£¥_XÞ„-NöE‰×¸\å\Ðq¥^2pÂ‹Q·x\Û÷o\Âd*(&\Z¼\Ù\Ðø\ïƒ\"ðÅ˜HJ˜\Ë=‡\æ¦±±–\ì{¢\Ñ`F§ùÿ{–#}Ê§\ÓGi®ö\ÐE\î&À¤¤\çíŽƒV2\ëó.1\ÖS)º\å\ï\Ûp÷U«°|Á\Ã(V\0ï²œø\ÔXV—–:¡TÁ…º5\ßý3zQb,„V\ÖöR€Z\É u)‚+£\ì¼LÊdr)¤3IÂ±T\"ÿ)qp\"\Ì_“Š]†‰·Æ‰\ÃD¥%ŽðF\Ý9HX\å©þŠ ’ž%v‰(“>Á™¢‰Oî±œ›\\4\Ì …l)g\Òöy+%ÿn\á™B8F\ÈÏ¹]N+R„\í\Ôÿ^½b¦^R\0—\Í\'v\"\Õ\Í÷O¼#ê¥®\Ë\íð¡\æòRT_QB­¦K™M©M<»}m\í­°9¬púÑ¼¹‡-ôÞ‹ô£hÑ’>_:¡§ÝŠ·ºŸÃ¤’\\1dn\î\Æ\×g?Ž)Õ…I£,‹	E\àq0©43¯©Ä¥§\"=Û€‚IE˜^{1òóó•³Ç†a~¿\í\í\è·õ`h\Ð	\ËA>\ØÐ†þv´bÏ™Šø•”\ßÀ¥u5¢\ç.\É\ëö¡õ@—h\Æoöù}d²dQ\å3\np\Å\âZ”\Ô\æ\"/?SŠ\ÊPYY“I\îw$Œ”Fo_/::\Ípº‡`\ëra\Ï[0\ï\éE\Ð‚13þ•\é©*>þ–\ê\\ò\' ®\Í(´Vfž	\Ï+\Å\ÌE\È/\ËEvF¦UOGQQ‘rvj7aGü2\Ï\ê\è#ÿv£\íƒ~\ì\Þ`¦¦\ßC=«z™»d­\ËsL’%*ª\ÌÁœ\Å5(ŸU„¬\Ü”•‹_\Þed$ÿ	T\"œ6\á\Ñ\è\îî‚¹³\rÁˆ=‡øð\í\ÙÕƒ4j<Œú1Í{\î€7,6\äg]_ÏoVd#Ã…š‹¦¡tJ©r\æ\écB	«F›ùzm„|z×‚mÿüH|ùm¢ \Ãý5ß–\Ó	GÛ¢Š<|\á–é¨7EøjE\ÙE¨­™–’o\Ê\âŒ\ÎN\Ò2Eø˜>Œ\î½v4­?‚¶\Zÿ\ìõUø|}-²K\È2NBMU-JK\'N›§\Â\'¬‚µ\Þ\ÚÖ‚>Šð!6_ƒ&ƒ¥\ÅSqÙ¥3¥ø\Ó\ÅY#¬‚»®\Ö\Ödff¡¼¼\\={8\ë„?i\È5\ç.>\ßqðù\r\àÿÂª»=e’\0\0\0\0IEND®B`‚'),(2,'Al doilea target atins','Felicitari! Ai atins targetul de minim 5 logari!',_binary '‰PNG\r\n\Z\n\0\0\0\rIHDR\0\0\0<\0\0\0<\0\0\0:ü\Ùr\0\0\0sRGB\0®\Î\é\0\0\0gAMA\0\0±üa\0\0\0	pHYs\0\0\Ä\0\0\Ä•+\0\0—IDAThC\íš	tT\Õ\Çÿ“Y³¯d#;Tð„¥­\Å#¢ Öº ®p¬ÖµÕº•sÔ–ö¥jÒžö`X7ˆ\ÚD QH\ÈN¶™l3“Ìš™\é÷\Ýy&1É»=ùÁ#\ä¾÷\î»ÿû}÷û¾ûf4? ¢”Ÿ?\Î>\×9/ø\\\'\â(\ír¹P\ßP«ÍŠ€\ßO=h”3A4ü{XQZ\r´:­ò[ˆ\0¢4\Ô6ðV\êÿ	þx\èÞ¨($%&cüøñ\Ðj÷=2	Þ»w/\Z[ ÷p+:*Jo_\0\'\Í\Ð\ê¿;0ö´ƒù|~L˜žË«´‚ú\n!†€ŸþLÊŸ„¢¢\"\åŒ:Ò‚K·–’À\0¼µ~x\ì}Aaƒ,$\ë-:Îˆ›¢ž\ë¾cee\ày…£Ç…e·þ¹“\Ó\àuû‚\í#ð K\ÖAŸ§QoÄ’k–(gFFJðþû\Ñ\Ü\Ü\ç±>\ÒC.f™\á\ÐÒ„Ø»]øÇ†ÿ 19Fi[y\åCWÀ\å\ÆÊƒô‘‹\ÑsLÓ´˜P0³g+g†G*h\Õ\Ö\Õ\Âß­–\Ë\è\r:\ìù\ä[Ä‘•e\àµ\Ï\î|\ä`ŒF-M€rb4º(!:`BeU¥\Ò:2R£\ç \áwùƒI¶”N…¦†.´\Ôw¹v‡#:ÆˆŠ=•´\î\éYróJc\"\Ñ.z®FjeJ¦¥0,h¤ƒ\'EK^p \ì8L$ 4\ä<~\ÚW£I?dÿƒ\àüW\ÝŒœ`\êWo\ÔÁ­ù A\ÆÆ›\ÐPm¹\ÅJ\éH\ÒLa˜¨Ÿ£\r´Ž=ˆŽ5ýœAGð9r–\nZ¥\ïoFÍ§Xj»U]”ÏŸ8tŠ\Ö#Gò\È3·™y\É\È\ÎMA_\ß\È»\Ï\ãC~a\Ò/Œ\Ãò’J\ëðH	~ÿ“­Ø¾®µ‡\Û`0é†œËC‘£Á@k´bC°\Ð>o0ÑŸ\î{ \Ü\î\ìõ\à\Ò\ëf °¸\0%K®ž\éQ\é)r²»±ñ\ÏðCo\Ð\Â\ít“HvIC¿X‡\Ý	[§]V:üT©p¾µw÷\Â\ÏU\ZÁ?ùœ\ËA•a\ë\ê\×;l²žWô\Ï9\ß\åtÁ Œ!t„\\z¨?\ß\Ï„Ÿrgl‚¿}\ã\äM\É\îÈ¸hŠW.Â¯\ÖÝ†G^½\Ïþu\rœ],]u9V?#¥ª”H¬\×\é÷\Î_:6šˆû\×ÞŒ_¾\rþ~\î{\îFØ­½ÈŸ˜)\î\×iuý5²½º£\n\äõ?\å\æh“®¿\é9id•>\Ñ\î¡\âaQ\É\\\\s\Ç\åHHEö\Ôq´¾£`·8Qr\ï•ÈŸ–«Ó‹&c\áõs\Ñx¢>oŠ\ïY„K¯Ôœ$dä¥ˆª++/—ÏŽ\\ˆ+¬\ïB1Z\ÒtR—©|\ÍøhÝ…\çj¯×‡¶†v¬Xün)|Z£\åŸ\ç®˜‹‹‹ož\'~//û\ZzŠòÌ–¿”\áÇ¯W¼&\\\×\×œ\Ä\ÐsÀM¬B\ÎÀ’VS<x2ò\ÒpÊ¿\å\îw\É\Í=\èh\é\Â\á=Ç±p\ÙE\Ðit˜_\\„-Ê˜§\Ü¬|bNv\à\Í}ka¡\ë\ÕIµ„¤#\ÈÁ\àz˜\×5\ÃÁ«\×\îÀ\Ã\Å/\ã¥5¦\èm@|J,\Þ{cS\ã1oq!\"=>x÷s\Ä\ÅG÷{w|‰\'þ\Z\Þü])\âcû\Ûyý†Ž\È[dL\ëi\ê(’r‘\Â\ây{\è\êñ\à³\íQþ¹,3˜8üE¥nOÿý^Q?.¯‚ŽRYˆ\æz3>\ßVoöŸ¤j-\è\æŒ\Þ@EõÁš\ÔHÁ:¥y\æ\Í5\ØQÿ:6\îy½\ÝNÑ–š•„¯›±­öO˜ú\ã˜º\Ì6úü8RÒ’ð\Þ\ë»(\ÊG‹k¹fgV¬YŒ½½\ï`Kõ\Å\ä…6ù›Ž¾Œ\Ò\ëñ\Ì\ÆÕ°v\ÙE[¤H;>ÞŠ\ÖBý\×¢©ðPn\áú•\r&-#I¬Y^o|\Þ\ÒÜ…Tj\æä€°NGk|äŽ¼\ë\Ò\éut>m§:úó6½Œñ©TpPu¥\Ô\ä\æ–NZ\nz$¥\Åƒ\"MŠ—¼\ÃJùšó¯“<\è’eS1\ë\ê\\,[r½\èg$T-\çqô‰¢¡\×î¢Ÿn*4¼´C	ŠfÚš:\Ñ\ÑfE{k7:\ÍVr]=º;l\Ô\Ö-\Ú[-Tx_\Ïð+Ÿ\ÏGm$–~\çI›jý\Ðý|Ÿ¹¹Sˆ\æ‰47u(ýwŠv~>\ÅIc\á\r‡ºÙ‚¨Z˜Vº}3´\íh\ØKiŠ\Ø\"nŠ¸o½º[øg*\×\èw>v%A+‚\çem2Y:Æ›–ß¤\\9<ªfû±\Ûò,:i\Ão#üô][¾\î_»Ã\Ê\Ö~„\'P Ü½ýˆX<W¯WEYYª¨\nŒþQ·b–f+\ê«\Ìâ­†,l/\Õ\Æ\\G[\Z;\ÑVß\ÎV«ð\'\0±“Gš¨h±“•\ÃfMr\Õ‡P:\äBùn\Ú\ÜS$¡NŠ\ÌY¹\é(¹\ç\n¼ð\Îx\å½\Çñ\Ðk·b\æES`\í\è¡k‚Õ”\Z<NmûËŽ‹.?UAT\×0—\Í\Û6#Ð¤…\Æ˜\É*;þy11º[}ZE¾¤\Ë^)}g\æ*­i¬n\Å\Ýóžo9C[\r Kn¹ii‰Ð¥P\äNt\Í\Z\îŸB§§5»¿\ì\Í,¹²„X\ÆK{\Ú<\Ú(„‹<Ç¹“2±þ\Ã\'„‹\Ë\ÂY`ÿ®J\áq²\îÌ¨-ñœò(­\ÝÚ“f´Sjˆdÿ\Éw‡Šþm?Å½óŸ\Ã\r<Œ».yM5f\Ñ\ÎL-,À¸¬\ä`\0’€\Ç`¡XWiOI\ßV,’=ý\á5[þ\Ñ1\Úp“+G€ø¨…ŽÕ‹žÇºû7¢\å”Elù\Zj[ðôë•«‚LC•˜²½”Ç²\ï\ãoa$û`bDTs®\ã*\éð:ôô:E!	<û\ÕG\Z\ÑTkFFn*-*\É[L8¥„\ãr¹¥—\n\Ãc\é¡\â\ãHE½¨\Üd\Z½!Z‹ºo\ÛÈ­\å\ÓP8M¤0\Ò\Ô\ÙjC\É\êJCoöUSÚ‘þ‹\æ\roTd3­(\Ú	f\Ê\Ã?»aVüòj¥ø¬ô\0<”§eŽú~ù4c§BNq–¦.\ÜAü§ßºOi\rÆ‰µ«\Þ@Ò¸¥\å\Ì!%˜`\äó>\Þÿ:mnüa\ço°\ê©Ó¯SÍ´(.x\0Ñ‰Ñ£²n¤H	\æ‹\Ä[†QŽ‡ß‚¸©\îý×±W0{þ¥øh\Ó\Ü4óQhh\Ùò:ÿ^ŒUZý\Ð\Zñq.¥\à–:\Þ>ø¢x­b\í]ðü”‘ ö»£…\Ç\'<Pyy †º`þ˜_hZg¯\×Þ¾Yù\ã”`\åœ\'±õo»—h¯jyCÁ‡l=ó¼\ìðTki§Ó‰\Ï\Êw¡ôÅƒh­\éŒh‡\Äð\Îh\Ó\áuÈ™’)~oklÇ‡o\ï¾\Ö	{2Tº\í2´\ÒyÙœ\Ê8\ì,¸õL¿4\ÅKK”\Ö\á‘òûü*Å§|\Ö	^²ZH,“‘›†ÛŸº\Ëø)–?xú¸\æ\îùHJOˆøüŽL|EB25I	\æ\×-ón˜†\Ì	É°µ;¨Bòô\×\Ç#Á\Î\Ã•,Áoû¨÷\Ë\Ïv’e\íNL˜•‰ü™©°[{”³##õ\Ï\ÜfFMC5\Ú;,°w¸pø\ÃZT–7¡§Û˜D£(‡\Ã\íò ð¢\é´ù§õ9Â“¸Âª®l€\Ó\á²|\åa²õV7ºXÌ¸,³®\ÈEl²	\É	©˜4q2\Ò\ÓÓ•«‡GJp§Óš\ÚZ´u¶ \ÛbE\Ã\ÑNTl¯‚¹\ÎF\ÖBo¢\"~P.\å\îY´­\ï‡9rJ\Ð|eOKFÑ’IÈš‘‚Ä¤xdŽ\Ë_f1™L\Ê\Õ\êD$8\ß\Ò\ÒÒŒšúj\Ø{l0\×wã«u¨ùª^gŒ±ü‘iðM\äh\àþÙš,4&Áˆ)s³q\áUùH„\ØDL,˜Œ\ÌŠ£\è~T‚Ã±\Û\í¨®9‰vkº\Í=8ùE+¾\ÜYƒž.\ÚY\Ñ\æœ-/+œ‡\â¡	ó÷ù‘š“€¢¥“‘_˜Šø¤Xd¤ŽGA~\â\âN5\Z¾·\àp\Z\Z\êQU[	¯ß&r÷ÿ\î¬FME«ø\Z„1†\Üu˜Ò‘ki·#˜ƒg-\ÈÇ¬«ò>!	1úXaMþŠ\áX1¦‚C\Øl6TV€¹«‡Gw5bß¿	a\Æx£xUÄ\åtâ°ºš€y+¦c\êeY\âe}^VB11\ê_h‹”3\"8œ\ê\êjT\×UQDò¡®¢·T¡ò@3&-f.*À\Å\Ë&#9\'1ºxaÍœœ\å\Î3\Ã\Âjµ\âD\Õq´wµQ\ãk\Ûh2 3-üh&t£|¹)gMpN3ÇC,Ÿü¼|¥õ\ìq\Öÿ¿‘*-\Ï%\Î>\×9/ø\Üø”U\É\éK¨¦j\0\0\0\0IEND®B`‚'),(3,'Al treilea target atins','Felicitari! Ai atins targetul de minim 10 logari!',_binary '‰PNG\r\n\Z\n\0\0\0\rIHDR\0\0\0<\0\0\0<\0\0\0:ü\Ùr\0\0\0sRGB\0®\Î\é\0\0\0gAMA\0\0±üa\0\0\0	pHYs\0\0\Ä\0\0\Ä•+\0\0yIDAThC\íš	pTõÇ¿›=³	\Ù\Ü79 €€š\0¶…šb©©\ÊQ¼uuÐ¢L©m©\Êè ŽG=¨ÕŠSÑ–NET@+G\Ä+\ÑDrš\Ä\Üwv“½¯þ~ÿ}1\Ç\îÛ\Ðò™yÙ¼ÿ{\ïÿþ¿ÿÿwþw^\ß#Â¤\Ï\ï\r>ß¹ ðùN\È^\Ún·£¦¦¦~#Š@ó\å\ëV¡P@¥RŠÿ‡…®ƒ‡@N‡[4…‰~‡+,,ŒZ½P†)mˆAFF”\Ê\0}CH¢±­j·\Z‹O˜‘ðx<4p<ô}uT\ê‘FÐ„¸]Lžž»\Í\å“up\×\Ô\æUx©OþW…\Îw˜™\éY¸r\î•\ÒMÁ‘-ð®ww\Ñ\Í\n\Øjp÷{ P,¬}„{ÿö9\ê+; T\Ð\Z\ÅlÇ¢¹˜23:^7MT”\n\Ú,­²\nK¤+‘%ð±c\Ç\Ð\Ðð-¬\å<š_ep\ÓW*\è7\Ùðö¶#0\Ä\è¥Ö‘\áa8.¬þ\åB\Ø)µ\ÆKZ\á3THOŸˆ\Ùy³¥+##\Ëi}SWQ!^ GXF­Q¡ð\ãSˆŒ\ÔJ-aó`µ.-ªV§f\Û4\Ý\è\éU \æ›\Z©50²F\Ï\ïö\Øie:)<\0•*-\Ýhª\ë\"U–\ïTtz\rJ?­!\Ç\è\"E\rr„æ‰²’¿¹²\î\"Á,P ƒF¬D8	\nü,u’£\ÕÐ†«IÞ¡ý>|Ï‰YÈ›BC*ªÕ«¡£:\"£th¨\éB{S/y_\ÙÝŸF£S£¼´}F+ôdÃ½c\àÁcR³\É\ÐF–\Óz÷ƒwPõ¯v´Wõ@©	¬¢¬\Î\Õ\'[„§•«fƒqP<ŽOŠDjf,\\NrLV\Ðew#sV\"\ÒgGã†‚eR\ë\È\Èx\Ï?w\ã\Ã\çJQ]\Òu¸Jjý.<&G<\ã£\Ö;0—Ë—ˆ0ûˆ\Ý\ìD\Þ\âü`E–^{ƒ\Ô:2²G¥V«H\ÝH­I\å*Š±6‹M8\Z>÷k\é³\Â\Ô\Ý\'#¯–~úz\Í\"1aø“¯\Ù,vqn\ê\é÷›Mf8\íN_”mX©5i\×À÷òÁ&À‰‹L–/ðHx\ÜDôxx\ÛZd\äP\Ò@ƒd\ìV;\nV/ÀýOÞ†\r\ÏÜŽÍ¯­ƒ­Ç¥w\æ\ã\îGW\ÂK!…uXœxøkqÕ’\\1÷n¹	\ë·Þ†Ÿ»w=²R´eMN¥\çï†Š~\ß\Ùpö{¼\Ð \Ù$MŒ‡‹’\ÆN‚,¸~.®»ý*#65QxoS‡×¯ý)2§¥ \ßhÁô¼\ÉøÉsP_\Ñ\n·Ó…‚50o\é\åˆOFrF¬È¯“\'&`~A	L+I\ï‚h’\çª\ÏZ`\ÆCöÆ°\Íqhñ\ã¤ó–\ÚN,_´7\Ïú\Ât\n|\\\\[°l.º:zñ³[\æ‰ó\âCePi\Õ\âÿÝ¯\ÂMù±qù³žTÂžžÜ¡P~\Íi®Ì…Gš\\—Ó”\ìx4x\âSû[pX\èh\éÁñOÊ‘\Ã¨*\Ì_š‹Ý¯„!6\â´WZ½\é\ç¨ð\î\Åö¢-t\ï™8;\Ì{¸i\\\â°x\Üdc~;c\çe1Yð@ÁV<±\îO\"ÝŒ\"Ávmc#ñ£EW@C«ºo\ÇŠ\ßz’\×\'qÑ‡¥Ø´\êY¼ñ\änL0DP‚!šE¿¢\Éá†1XM\ÞZ­U‰\ÃC\Õ{WsŸG>8†\âOˆvNƒ²\â\n\á\Ü~ó\æ\ZQ(œø´Š<ý™p\×TÛ†£\ï—\à«\â*‘\\ø—^£¡$ƒ\"O\äh×˜\ì/ð·}öÔ¿Œ\×ƒ™2%&!-\Z_xÿ÷j_À\ÔY\á&\'\Ô\ÓnB\é\ár\Ä\ÆE\ã\Ým 7„‹{•R8[¾\î\Zšw`wõ$ F„\æ­[±«\âyl~ýn)|Ù‰\Çþ—¾\Â7¥”x\Ðû\áÛ¯†ñIÑ§{ÒŽ–n\ÄQ[˜Ø‘ð’:«\Ñ\Õ\ÖK*\é\×yEùz[S—\Ð\ÆM\Ï\'¥\Å	\Û\ç~Tbv4÷Ú«%®s…\Äñ™c·’ú°÷;K‰G\î’l,¾^ô™+¬€“T\ÏfuP‚@Ÿt8¨¢\áQXmM\Ý$­½\è\î0\n\Õ\í\í\êBr{kC‡°=Þ¦;$8·ñ®ˆŽný´S?ô\Ëù¸‹¼t;MŒ¯ÿnñ§\Ã›™\ÆCcòyñ \ë&µ\Â;\ß\Ù	­IoÿìŒ”°\Û\ØþôŠÁò\êÝ±€‡j#O\çCE\Ö\Åv\ì¥\ìS{¤+—­”\î\Ù6\ÌÅ€\Õâ€•rWžñ»J\ìS¬\\œ\ì\ßõ%\Å~¯‹•T\Ú\É& iZ0d	<°+Þº\él1¢¾ªC„¹8)‹2võ“jvû\îh&\Õm5žNE\å\Âï¬« ÊžMù\Ú¤üZŠUˆ¤].»É©q¸ù\ëð‡}›ð\Ú\'\â•Ã›ñ\Ðó«‘=-M\îw~r\àÍ¢\åB­CE–\rÿl\í´šf ƒÇž·?§\âœw3‚«w\Ïùóž×¤–¡|´\ã(¿\ëU\na±RKp,}6,Z™‡Ô´À@‘!Æ…\ËVHWG&„Vˆ->X.\ÊD9\Â«ð`5^t\Ë|\\³jÙ¤¯D”ƒ6\\CšV.<»\\ûed	\Ì*ÀÎ¢¾²Â…\ét¢!—ˆ	\á8^X5ó6ciÖ½X’q_óŠt\ÕÇ’\Ûó\ÉÙ¤³\à°ýövö£òd™™/\Ö\Ë!¨À;yþ44£Ÿ\ì/3\n\"\ÆjX\íhm\îBx¤ú(ö½y_>%\Ýè£µbBKuz-ŠiL¼\0r}€¬V‘g<URþ>\Ë\éô/””lÄ¥D\Õ\ã\Ø\É\î.J1c¢¤;€º²&¨Bp„ghvJˆ\Ê>¯ýN.Y£g\ÏümygÈª\ì‡§…‰\ä©\ãb0uf–ð\ÖY3Ò¤;€—~½Q¾œ:ø‹ö	þô4²—k41\ÏÌ»‹¯þþ\ì1<³o#\æ\\s©¸öŸýeø\Å\Ìas\ØG=¡d5²½!\âÁ<c“È¹4“\êf_u5ÞœEa@µò¾·Ž\àý\í‡P´·T»\å¯÷\á¦õ\×Á\ÔM~œ‘-°\Ø<]\èõ\åÀÃŸº\ç\r<³þ/xh\Ù\ÓX>\í~±\Õ\ãg\íc”4P! #:+‚,\É\é \\8”\0?ö\Ì\nr*±\ÉQˆKFJf<\Õ\Õj<¿a‡t‡\ì‹SE\Î*<Er\í8¨À.7	\ÊwruYX\Þ\Ä\ïj\é¡\Ä\ÂNÅ»‹¼*f\\”7IºË‡\Åd\Ú\Z¡i„L•\í\Ú}F3~i-žÛ³	yù3eÐ‹\Ê[7,\Æ\Æ\ï\îòQ_NY“\Ìxz…\Øl\ÓmZžtkÕÒNB÷D:©\à˜õ\ã‹ð\èŽû°£ôI¼Y²wmùn±þ\ÛU/\"2>R:“‹5†\"1V*\Íð\Ö\ÊüUÓ‘uIL]Qt¿)>\Õ\Ï\ÆN“t6VùGn}G÷¿	‘ïˆ²ú÷w[“›Šœ+h\\Fy›z²\Ê\Ã\î\înT\ÕT¢«§\æ^\Ê>þ§\n¨\ì³ Ü õU,#\Ì0wo¦›”Ë¯¾\'%C­T¡§Çˆã‡«p²¤Jl»Ë²Dò\ât\Ãb´#&9—\äga\æ‚4\è&h“€©9\Ó¼¼”%°þV]}š\Ûa\ì6¡\éT7¾\Ø[‹ÆŠ‘\ËjÂ•b“n0b°”Z\Ú-d¼ùG\ç<Iº\r•œ¾oG‚5ÀaqÁM\ÏdL\Ç‹\'!yŠ†\è(¤&¥#3#:Nº;8!	<ööv\Ô\ÔVÁd6¢½¾eÕ¡º¤UØº6‚¿\Â…\ÇõÁCr;=\â¹ˆ¦\ÎMÃ¥3—6‘z\ÊÌ²s˜˜$\Ý\Z£Ø\Ùl¦U¯EkgeJÔ–´\á\Ø\Õ\èi3‹M>µŽ\Õ]ž\àœ\ÜØ­¤ô™…\ÙKr0ñ²xDR=’0Y™Y\Ð\ëƒÿ*g-ð@\ZQSW›Ë‚–Š|I«^Q\ÔH6ª¿\ÅðQ>\ÞW\æ\Õä‰¹la.¹:ñ®‰Ä¤\Ì¤¥©ªÎ–1Ø\ÅbAeUš;\Z\àqzqò\ßM(\Úùµøž)‚œŒŠ\ÊM~­“Â‰\Å\ä@b¦W\Þ8S~˜\"V73-9“§„d›rR__O«^\r—ÒŠ\æ½ø\ì½*|}´\Z­—/šŒ\Ü\Å\Ù0¤\è¡‰\Æd²\Í\Ô\ÔT\é\Éña\ÜöÃ¶^^y\nm\Í\"Q`§¦\Ñh\ÉÓ¦aæŒ‹‡õ\î\ãÁ9\Ø¿®ºº\n\á\áz¤§§K­\çŽs.ðÿšs£GÿG\\ø|\ç‚À\ç7À ­Š3&|\0\0\0\0IEND®B`‚');
/*!40000 ALTER TABLE `badges` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-06-21 19:13:39

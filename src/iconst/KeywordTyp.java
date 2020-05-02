package iconst;

public enum KeywordTyp {
	NULL, ZPAREN, ZSTMT, ZCALL, DO, IMPORT, FROM, ALL, AS, 
	CLASS, ICLASS, ABCLASS, SCOOL, ISCOOL, 
	DEFUN, IDEFUN, ABDEFUN, GDEFUN, DEFIMP, VAR, IVAR, GVAR, ENUM, IENUM,
	DOES, CONST, DECOR, RETURN, RAISE, CALL, UNTUP, SLICE,
	IF, ELIF, ELSE, WHILE, FOR, IN, TRY, EXCEPT, EOTRY, UNTIL, SWITCH, CASE,
	BREAK, CONTINUE, DEL, QUOTE, IS, TUPLE, JIST, VENUM,
	DICT, CAST, PRINT, ECHO, LAMBDA, TRUE, FALSE,
	DOT, SET, ADDSET, MINUSSET, MPYSET, DIVSET, IDIVSET, MODSET, 
	SHLSET, SHRSET, SHRUSET, ANDBSET, XORBSET, ORBSET,
	ANDSET, XORSET, ORSET, QUEST, MINUS, NOTBITZ, NOT,
	DIV, IDIV, MOD, MPY, ADD, 
	GE, LE, GT, LT, EQ, NE, SHL, SHR, SHRU, 
	ANDBITZ, XORBITZ, ORBITZ, AND, XOR, OR, INCINT, DECINT,
	STRDO, STRCAT, STAR, DBLSTAR;
	
	public static final KeywordTyp values[] = values();
}

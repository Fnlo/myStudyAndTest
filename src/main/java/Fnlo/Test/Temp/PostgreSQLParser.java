package Fnlo.Test.Temp;

// Generated from PostgreSQLParser.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PostgreSQLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WHITESPACE=1, BLOCK_COMMENT=2, LINE_COMMENT=3, A_=4, ABORT=5, ABS=6, ABSOLUTE=7, 
		ACCESS=8, ACTION=9, ADA=10, ADD=11, ADMIN=12, AFTER=13, AGGREGATE=14, 
		ALIAS=15, ALL=16, ALLOCATE=17, ALSO=18, ALTER=19, ALWAYS=20, ANALYSE=21, 
		ANALYZE=22, AND=23, ANY=24, ARE=25, ARRAY=26, AS=27, ASC=28, ASENSITIVE=29, 
		ASSERTION=30, ASSIGNMENT=31, ASYMMETRIC=32, AT=33, ATOMIC=34, ATTRIBUTE=35, 
		ATTRIBUTES=36, AUTHORIZATION=37, AVG=38, BACKWARD=39, BEFORE=40, BEGIN=41, 
		BERNOULLI=42, BETWEEN=43, BIGINT=44, BINARY=45, BIT=46, BITVAR=47, BIT_LENGTH=48, 
		BLOB=49, BOOLEAN=50, BOTH=51, BREADTH=52, BY=53, C_=54, CACHE=55, CALL=56, 
		CALLED=57, CARDINALITY=58, CASCADE=59, CASCADED=60, CASE=61, CAST=62, 
		CATALOG=63, CATALOG_NAME=64, CEIL=65, CEILING=66, CHAIN=67, CHAR=68, CHARACTER=69, 
		CHARACTERISTICS=70, CHARACTERS=71, CHARACTER_LENGTH=72, CHARACTER_SET_CATALOG=73, 
		CHARACTER_SET_NAME=74, CHARACTER_SET_SCHEMA=75, CHAR_LENGTH=76, CHECK=77, 
		CHECKED=78, CHECKPOINT=79, CLASS=80, CLASS_ORIGIN=81, CLOB=82, CLOSE=83, 
		CLUSTER=84, COALESCE=85, COBOL=86, COLLATE=87, COLLATION=88, COLLATION_CATALOG=89, 
		COLLATION_NAME=90, COLLATION_SCHEMA=91, COLLECT=92, COLUMN=93, COLUMN_NAME=94, 
		COMMAND_FUNCTION=95, COMMAND_FUNCTION_CODE=96, COMMENT=97, COMMIT=98, 
		COMMITTED=99, COMPLETION=100, CONDITION=101, CONDITION_NUMBER=102, CONNECT=103, 
		CONNECTION=104, CONNECTION_NAME=105, CONSTRAINT=106, CONSTRAINTS=107, 
		CONSTRAINT_CATALOG=108, CONSTRAINT_NAME=109, CONSTRAINT_SCHEMA=110, CONSTRUCTOR=111, 
		CONTAINS=112, CONTINUE=113, CONVERSION=114, CONVERT=115, COPY=116, CORR=117, 
		CORRESPONDING=118, COUNT=119, COVAR_POP=120, COVAR_SAMP=121, CREATE=122, 
		CREATEDB=123, CREATEUSER=124, CROSS=125, CSV=126, CUBE=127, CUME_DIST=128, 
		CURRENT=129, CURRENT_DATE=130, CURRENT_DEFAULT_TRANSFORM_GROUP=131, CURRENT_PATH=132, 
		CURRENT_ROLE=133, CURRENT_TIME=134, CURRENT_TIMESTAMP=135, CURRENT_TRANSFORM_GROUP_FOR_TYPE=136, 
		CURRENT_USER=137, CURSOR=138, CURSOR_NAME=139, CYCLE=140, DATA=141, DATABASE=142, 
		DATE=143, DATETIME_INTERVAL_CODE=144, DATETIME_INTERVAL_PRECISION=145, 
		DAY=146, DEALLOCATE=147, DEC=148, DECIMAL=149, DECLARE=150, DEFAULT=151, 
		DEFAULTS=152, DEFERRABLE=153, DEFERRED=154, DEFINED=155, DEFINER=156, 
		DEGREE=157, DELETE=158, DELIMITER=159, DELIMITERS=160, DENSE_RANK=161, 
		DEPTH=162, DEREF=163, DERIVED=164, DESC=165, DESCRIBE=166, DESCRIPTOR=167, 
		DESTROY=168, DESTRUCTOR=169, DETERMINISTIC=170, DIAGNOSTICS=171, DICTIONARY=172, 
		DISCONNECT=173, DISPATCH=174, DISTINCT=175, DO=176, DOMAIN=177, DOUBLE=178, 
		DROP=179, DYNAMIC=180, DYNAMIC_FUNCTION=181, DYNAMIC_FUNCTION_CODE=182, 
		EACH=183, ELEMENT=184, ELSE=185, ENCODING=186, ENCRYPTED=187, END=188, 
		END_EXEC=189, EQUALS=190, ESCAPE=191, EVERY=192, EXCEPT=193, EXCEPTION=194, 
		EXCLUDE=195, EXCLUDING=196, EXCLUSIVE=197, EXEC=198, EXECUTE=199, EXISTING=200, 
		EXISTS=201, EXP=202, EXPLAIN=203, EXTERNAL=204, EXTRACT=205, FALSE=206, 
		FETCH=207, FILTER=208, FINAL=209, FIRST=210, FLOAT=211, FLOOR=212, FOLLOWING=213, 
		FOR=214, FORCE=215, FOREIGN=216, FORTRAN=217, FORWARD=218, FOUND=219, 
		FREE=220, FREEZE=221, FROM=222, FULL=223, FUNCTION=224, FUSION=225, G_=226, 
		GENERAL=227, GENERATED=228, GET=229, GLOBAL=230, GO=231, GOTO=232, GRANT=233, 
		GRANTED=234, GROUP=235, GROUPING=236, HANDLER=237, HAVING=238, HIERARCHY=239, 
		HOLD=240, HOST=241, HOUR=242, IDENTITY=243, IGNORE=244, ILIKE=245, IMMEDIATE=246, 
		IMMUTABLE=247, IMPLEMENTATION=248, IMPLICIT=249, IN=250, INCLUDING=251, 
		INCREMENT=252, INDEX=253, INDICATOR=254, INFIX=255, INHERITS=256, INITIALIZE=257, 
		INITIALLY=258, INNER=259, INOUT=260, INPUT=261, INSENSITIVE=262, INSERT=263, 
		INSTANCE=264, INSTANTIABLE=265, INSTEAD=266, INT=267, INTEGER=268, INTERSECT=269, 
		INTERSECTION=270, INTERVAL=271, INTO=272, INVOKER=273, IS=274, ISNULL=275, 
		ISOLATION=276, ITERATE=277, JOIN=278, K_=279, KEY=280, KEY_MEMBER=281, 
		KEY_TYPE=282, LANCOMPILER=283, LANGUAGE=284, LARGE=285, LAST=286, LATERAL=287, 
		LEADING=288, LEFT=289, LENGTH=290, LESS=291, LEVEL=292, LIKE=293, LIMIT=294, 
		LISTEN=295, LN=296, LOAD=297, LOCAL=298, LOCALTIME=299, LOCALTIMESTAMP=300, 
		LOCATION=301, LOCATOR=302, LOCK=303, LOCKED=304, LOWER=305, M_=306, MAP=307, 
		MATCH=308, MATCHED=309, MAX=310, MAXVALUE=311, MEMBER=312, MERGE=313, 
		MESSAGE_LENGTH=314, MESSAGE_OCTET_LENGTH=315, MESSAGE_TEXT=316, METHOD=317, 
		MIN=318, MINUTE=319, MINVALUE=320, MOD=321, MODE=322, MODIFIES=323, MODIFY=324, 
		MODULE=325, MONTH=326, MORE_=327, MOVE=328, MULTISET=329, MUMPS=330, NAME=331, 
		NAMES=332, NATIONAL=333, NATURAL=334, NCHAR=335, NCLOB=336, NESTING=337, 
		NEW=338, NEXT=339, NO=340, NOCREATEDB=341, NOCREATEUSER=342, NONE=343, 
		NORMALIZE=344, NORMALIZED=345, NOT=346, NOTHING=347, NOTIFY=348, NOTNULL=349, 
		NOWAIT=350, NULL=351, NULLABLE=352, NULLIF=353, NULLS=354, NUMBER=355, 
		NUMERIC=356, OBJECT=357, OCTETS=358, OCTET_LENGTH=359, OF=360, OFF=361, 
		OFFSET=362, OIDS=363, OLD=364, ON=365, ONLY=366, OPEN=367, OPERATION=368, 
		OPERATOR=369, OPTION=370, OPTIONS=371, OR=372, ORDER=373, ORDERING=374, 
		ORDINALITY=375, OTHERS=376, OUT=377, OUTER=378, OUTPUT=379, OVER=380, 
		OVERLAPS=381, OVERLAY=382, OVERRIDING=383, OWNER=384, PAD=385, PARAMETER=386, 
		PARAMETERS=387, PARAMETER_MODE=388, PARAMETER_NAME=389, PARAMETER_ORDINAL_POSITION=390, 
		PARAMETER_SPECIFIC_CATALOG=391, PARAMETER_SPECIFIC_NAME=392, PARAMETER_SPECIFIC_SCHEMA=393, 
		PARTIAL=394, PARTITION=395, PASCAL=396, PASSWORD=397, PATH=398, PERCENTILE_CONT=399, 
		PERCENTILE_DISC=400, PERCENT_RANK=401, PLACING=402, PLI=403, POSITION=404, 
		POSTFIX=405, POWER=406, PRECEDING=407, PRECISION=408, PREFIX=409, PREORDER=410, 
		PREPARE=411, PRESERVE=412, PRIMARY=413, PRIOR=414, PRIVILEGES=415, PROCEDURAL=416, 
		PROCEDURE=417, PUBLIC=418, QUOTE=419, RANGE=420, RANK=421, READ=422, READS=423, 
		REAL=424, RECHECK=425, RECURSIVE=426, REF=427, REFERENCES=428, REFERENCING=429, 
		REGR_AVGX=430, REGR_AVGY=431, REGR_COUNT=432, REGR_INTERCEPT=433, REGR_R2=434, 
		REGR_SLOPE=435, REGR_SXX=436, REGR_SXY=437, REGR_SYY=438, REINDEX=439, 
		RELATIVE=440, RELEASE=441, RENAME=442, REPEATABLE=443, REPLACE=444, RESET=445, 
		RESTART=446, RESTRICT=447, RESULT=448, RETURN=449, RETURNED_CARDINALITY=450, 
		RETURNED_LENGTH=451, RETURNED_OCTET_LENGTH=452, RETURNED_SQLSTATE=453, 
		RETURNS=454, REVOKE=455, RIGHT=456, ROLE=457, ROLLBACK=458, ROLLUP=459, 
		ROUTINE=460, ROUTINE_CATALOG=461, ROUTINE_NAME=462, ROUTINE_SCHEMA=463, 
		ROW=464, ROWS=465, ROW_COUNT=466, ROW_NUMBER=467, RULE=468, SAVEPOINT=469, 
		SCALE=470, SCHEMA=471, SCHEMA_NAME=472, SCOPE=473, SCOPE_CATALOG=474, 
		SCOPE_NAME=475, SCOPE_SCHEMA=476, SCROLL=477, SEARCH=478, SECOND=479, 
		SECTION=480, SECURITY=481, SELECT=482, SELF=483, SENSITIVE=484, SEQUENCE=485, 
		SERIALIZABLE=486, SERVER_NAME=487, SESSION=488, SESSION_USER=489, SET=490, 
		SETOF=491, SETS=492, SHARE=493, SHOW=494, SIMILAR=495, SIMPLE=496, SIZE=497, 
		SKIP_=498, SMALLINT=499, SOME=500, SOURCE=501, SPACE=502, SPECIFIC=503, 
		SPECIFICTYPE=504, SPECIFIC_NAME=505, SQL=506, SQLCODE=507, SQLERROR=508, 
		SQLEXCEPTION=509, SQLSTATE=510, SQLWARNING=511, SQRT=512, STABLE=513, 
		START=514, STATE=515, STATEMENT=516, STATIC=517, STATISTICS=518, STDDEV_POP=519, 
		STDDEV_SAMP=520, STDIN=521, STDOUT=522, STORAGE=523, STRICT=524, STRUCTURE=525, 
		STYLE=526, SUBCLASS_ORIGIN=527, SUBLIST=528, SUBMULTISET=529, SUBSTRING=530, 
		SUM=531, SYMMETRIC=532, SYSID=533, SYSTEM=534, SYSTEM_USER=535, TABLE=536, 
		TABLESAMPLE=537, TABLESPACE=538, TABLE_NAME=539, TEMP=540, TEMPLATE=541, 
		TEMPORARY=542, TERMINATE=543, THAN=544, THEN=545, TIES=546, TIME=547, 
		TIME_TZ=548, TIMESTAMP=549, TIMESTAMP_TZ=550, TIMEZONE_HOUR=551, TIMEZONE_MINUTE=552, 
		TO=553, TOAST=554, TOP_LEVEL_COUNT=555, TRAILING=556, TRANSACTION=557, 
		TRANSACTIONS_COMMITTED=558, TRANSACTIONS_ROLLED_BACK=559, TRANSACTION_ACTIVE=560, 
		TRANSFORM=561, TRANSFORMS=562, TRANSLATE=563, TRANSLATION=564, TREAT=565, 
		TRIGGER=566, TRIGGER_CATALOG=567, TRIGGER_NAME=568, TRIGGER_SCHEMA=569, 
		TRIM=570, TRUE=571, TRUNCATE=572, TRUSTED=573, TYPE=574, UESCAPE=575, 
		UNBOUNDED=576, UNCOMMITTED=577, UNDER=578, UNENCRYPTED=579, UNION=580, 
		UNIQUE=581, UNKNOWN=582, UNLISTEN=583, UNNAMED=584, UNNEST=585, UNTIL=586, 
		UPDATE=587, UPPER=588, USAGE=589, USER=590, USER_DEFINED_TYPE_CATALOG=591, 
		USER_DEFINED_TYPE_CODE=592, USER_DEFINED_TYPE_NAME=593, USER_DEFINED_TYPE_SCHEMA=594, 
		USING=595, VACUUM=596, VALID=597, VALIDATOR=598, VALUE=599, VALUES=600, 
		VARCHAR=601, VARIABLE=602, VARIADIC=603, VARYING=604, VAR_POP=605, VAR_SAMP=606, 
		VERBOSE=607, VIEW=608, VOLATILE=609, WHEN=610, WHENEVER=611, WHERE=612, 
		WIDTH_BUCKET=613, WINDOW=614, WITH=615, WITHIN=616, WITHOUT=617, WORK=618, 
		WRITE=619, YEAR=620, ZONE=621, SUPERUSER=622, NOSUPERUSER=623, CREATEROLE=624, 
		NOCREATEROLE=625, INHERIT=626, NOINHERIT=627, LOGIN=628, NOLOGIN=629, 
		REPLICATION=630, NOREPLICATION=631, BYPASSRLS=632, NOBYPASSRLS=633, SFUNC=634, 
		STYPE=635, SSPACE=636, FINALFUNC=637, FINALFUNC_EXTRA=638, COMBINEFUNC=639, 
		SERIALFUNC=640, DESERIALFUNC=641, INITCOND=642, MSFUNC=643, MINVFUNC=644, 
		MSTYPE=645, MSSPACE=646, MFINALFUNC=647, MFINALFUNC_EXTRA=648, MINITCOND=649, 
		SORTOP=650, PARALLEL=651, HYPOTHETICAL=652, SAFE=653, RESTRICTED=654, 
		UNSAFE=655, BASETYPE=656, IF=657, LOCALE=658, LC_COLLATE=659, LC_CTYPE=660, 
		PROVIDER=661, VERSION=662, ALLOW_CONNECTIONS=663, IS_TEMPLATE=664, EVENT=665, 
		WRAPPER=666, SERVER=667, BTREE=668, HASH_=669, GIST=670, SPGIST=671, GIN=672, 
		BRIN=673, CONCURRENTLY=674, INLINE=675, MATERIALIZED=676, LEFTARG=677, 
		RIGHTARG=678, COMMUTATOR=679, NEGATOR=680, HASHES=681, MERGES=682, FAMILY=683, 
		POLICY=684, OWNED=685, ABSTIME=686, BOOL=687, BOX=688, FLOAT4=689, FLOAT8=690, 
		INT2=691, INT4=692, INT8=693, JSON=694, JSONB=695, LINE=696, POINT=697, 
		RELTIME=698, TEXT=699, COMMA=700, COLON=701, COLON_COLON=702, DOLLAR=703, 
		DOLLAR_DOLLAR=704, STAR=705, OPEN_PAREN=706, CLOSE_PAREN=707, OPEN_BRACKET=708, 
		CLOSE_BRACKET=709, BIT_STRING=710, REGEX_STRING=711, NUMERIC_LITERAL=712, 
		INTEGER_LITERAL=713, HEX_INTEGER_LITERAL=714, DOT=715, SINGLEQ_STRING_LITERAL=716, 
		DOUBLEQ_STRING_LITERAL=717, IDENTIFIER=718, AMP=719, AMP_AMP=720, AMP_LT=721, 
		AT_AT=722, AT_GT=723, AT_SIGN=724, BANG=725, BANG_BANG=726, BANG_EQUAL=727, 
		CARET=728, EQUAL=729, EQUAL_GT=730, GT=731, GTE=732, GT_GT=733, HASH=734, 
		HASH_EQ=735, HASH_GT=736, HASH_GT_GT=737, HASH_HASH=738, HYPHEN_GT=739, 
		HYPHEN_GT_GT=740, HYPHEN_PIPE_HYPHEN=741, LT=742, LTE=743, LT_AT=744, 
		LT_CARET=745, LT_GT=746, LT_HYPHEN_GT=747, LT_LT=748, LT_LT_EQ=749, LT_QMARK_GT=750, 
		MINUS=751, PERCENT=752, PIPE=753, PIPE_PIPE=754, PIPE_PIPE_SLASH=755, 
		PIPE_SLASH=756, PLUS=757, QMARK=758, QMARK_AMP=759, QMARK_HASH=760, QMARK_HYPHEN=761, 
		QMARK_PIPE=762, SLASH=763, TIL=764, TIL_EQ=765, TIL_GTE_TIL=766, TIL_GT_TIL=767, 
		TIL_LTE_TIL=768, TIL_LT_TIL=769, TIL_STAR=770, TIL_TIL=771;
	public static final int
		RULE_stmt = 0, RULE_abort_stmt = 1, RULE_alter_stmt = 2, RULE_alter_aggregate_stmt = 3, 
		RULE_alter_collation_stmt = 4, RULE_alter_conversion_stmt = 5, RULE_alter_database_stmt = 6, 
		RULE_alter_default_privileges_stmt = 7, RULE_alter_domain_stmt = 8, RULE_alter_event_trigger_stmt = 9, 
		RULE_alter_extension_stmt = 10, RULE_alter_foreign_data_wrapper_stmt = 11, 
		RULE_alter_foreign_table_stmt = 12, RULE_alter_function_stmt = 13, RULE_alter_group_stmt = 14, 
		RULE_alter_index_stmt = 15, RULE_alter_language_stmt = 16, RULE_alter_large_object_stmt = 17, 
		RULE_alter_materialize_view_stmt = 18, RULE_alter_operator_stmt = 19, 
		RULE_alter_operator_class_stmt = 20, RULE_alter_operator_family_stmt = 21, 
		RULE_alter_policy_stmt = 22, RULE_alter_publication_stmt = 23, RULE_alter_role_stmt = 24, 
		RULE_alter_rule_stmt = 25, RULE_alter_schema_stmt = 26, RULE_alter_sequence_stmt = 27, 
		RULE_alter_server_stmt = 28, RULE_alter_statistics_stmt = 29, RULE_alter_subscription_stmt = 30, 
		RULE_alter_system_stmt = 31, RULE_alter_table_stmt = 32, RULE_alter_tablespace_stmt = 33, 
		RULE_alter_text_search_config_stmt = 34, RULE_alter_text_search_dict_stmt = 35, 
		RULE_alter_text_search_parser_stmt = 36, RULE_alter_text_search_template_stmt = 37, 
		RULE_alter_trigger_stmt = 38, RULE_alter_type_stmt = 39, RULE_alter_user_stmt = 40, 
		RULE_alter_user_mapping_stmt = 41, RULE_alter_view_stmt = 42, RULE_analyze_stmt = 43, 
		RULE_close_stmt = 44, RULE_cluster_stmt = 45, RULE_comment_stmt = 46, 
		RULE_commit_stmt = 47, RULE_commit_prepared_stmt = 48, RULE_copy_stmt = 49, 
		RULE_create_stmt = 50, RULE_create_access_method_stmt = 51, RULE_create_aggregate_stmt = 52, 
		RULE_create_cast_stmt = 53, RULE_create_collation_opt = 54, RULE_create_collation_opt_list = 55, 
		RULE_create_collation_stmt = 56, RULE_create_conversion_stmt = 57, RULE_create_database_stmt = 58, 
		RULE_domain_constraint = 59, RULE_create_domain_stmt = 60, RULE_create_event_trigger_cond = 61, 
		RULE_create_event_trigger_stmt = 62, RULE_create_foreign_data_options = 63, 
		RULE_create_foreign_data_stmt = 64, RULE_create_foreign_table_stmt = 65, 
		RULE_create_function_stmt = 66, RULE_create_group_stmt = 67, RULE_create_index_stmt = 68, 
		RULE_create_language_stmt = 69, RULE_create_materialized_view_stmt = 70, 
		RULE_create_operator_stmt = 71, RULE_create_operator_class_opt = 72, RULE_create_operator_class_stmt = 73, 
		RULE_create_operator_family_stmt = 74, RULE_create_policy_stmt = 75, RULE_create_role_stmt = 76, 
		RULE_create_rule_event = 77, RULE_create_rule_stmt = 78, RULE_create_schema_role_spec = 79, 
		RULE_create_schema_stmt = 80, RULE_create_sequence_stmt = 81, RULE_create_server_stmt = 82, 
		RULE_create_statistics_stmt = 83, RULE_create_subscription_stmt = 84, 
		RULE_create_table_stmt = 85, RULE_create_table_as_stmt = 86, RULE_create_tablespace_stmt = 87, 
		RULE_create_text_search_config_stmt = 88, RULE_create_text_search_dict_stmt = 89, 
		RULE_create_text_search_parser_stmt = 90, RULE_create_text_search_template_stmt = 91, 
		RULE_create_transform_stmt = 92, RULE_create_trigger_stmt = 93, RULE_create_type_stmt = 94, 
		RULE_create_user_stmt = 95, RULE_create_user_mapping_stmt = 96, RULE_create_view_stmt = 97, 
		RULE_deallocate_stmt = 98, RULE_declare_stmt = 99, RULE_delete_stmt = 100, 
		RULE_discard_stmt = 101, RULE_drop_stmt = 102, RULE_drop_access_method_stmt = 103, 
		RULE_drop_aggregate_stmt = 104, RULE_drop_cast_stmt = 105, RULE_drop_collation_stmt = 106, 
		RULE_drop_conversion_stmt = 107, RULE_drop_database_stmt = 108, RULE_drop_domain_stmt = 109, 
		RULE_drop_event_trigger_stmt = 110, RULE_drop_extension_stmt = 111, RULE_drop_foreign_data_wrapper_stmt = 112, 
		RULE_drop_foreign_table_stmt = 113, RULE_drop_function_stmt = 114, RULE_drop_group_stmt = 115, 
		RULE_drop_index_stmt = 116, RULE_drop_language_stmt = 117, RULE_drop_materialized_view_stmt = 118, 
		RULE_drop_operator_stmt = 119, RULE_drop_operator_class_stmt = 120, RULE_drop_operator_family_stmt = 121, 
		RULE_drop_owned_stmt = 122, RULE_drop_policy_stmt = 123, RULE_drop_publication_stmt = 124, 
		RULE_drop_role_stmt = 125, RULE_drop_rule_stmt = 126, RULE_drop_schema_stmt = 127, 
		RULE_drop_sequence_stmt = 128, RULE_drop_server_stmt = 129, RULE_drop_statistics_stmt = 130, 
		RULE_drop_subscription_stmt = 131, RULE_drop_table_stmt = 132, RULE_drop_tablespace_stmt = 133, 
		RULE_drop_text_search_config_stmt = 134, RULE_drop_text_search_dict_stmt = 135, 
		RULE_drop_text_search_parser_stmt = 136, RULE_drop_text_search_template_stmt = 137, 
		RULE_drop_transform_stmt = 138, RULE_drop_trigger_stmt = 139, RULE_drop_type_stmt = 140, 
		RULE_drop_user_stmt = 141, RULE_drop_user_mapping_stmt = 142, RULE_drop_view_stmt = 143, 
		RULE_execute_stmt = 144, RULE_explain_stmt = 145, RULE_fetch_stmt = 146, 
		RULE_grant_stmt = 147, RULE_import_foreign_schema_stmt = 148, RULE_insert_stmt = 149, 
		RULE_listen_stmt = 150, RULE_load_stmt = 151, RULE_lock_stmt = 152, RULE_move_stmt = 153, 
		RULE_notify_stmt = 154, RULE_prepare_stmt = 155, RULE_prepare_transaction_stmt = 156, 
		RULE_reassign_owned_stmt = 157, RULE_refresh_materialized_view_stmt = 158, 
		RULE_reindex_stmt = 159, RULE_release_savepoint_stmt = 160, RULE_reset_stmt = 161, 
		RULE_revoke_stmt = 162, RULE_rollback_stmt = 163, RULE_rollback_prepared_stmt = 164, 
		RULE_rollback_to_savepoint_stmt = 165, RULE_savepoint_stmt = 166, RULE_security_label_stmt = 167, 
		RULE_select_stmt = 168, RULE_set_stmt = 169, RULE_set_constraints_stmt = 170, 
		RULE_set_role_stmt = 171, RULE_set_session_authorization_stmt = 172, RULE_set_transaction_stmt = 173, 
		RULE_show_stmt = 174, RULE_truncate_stmt = 175, RULE_unlisten_stmt = 176, 
		RULE_update_stmt = 177, RULE_vacuum_stmt = 178, RULE_values_stmt = 179, 
		RULE_selector_clause = 180, RULE_from_clause = 181, RULE_where_clause = 182, 
		RULE_group_by_clause = 183, RULE_grouping_elem = 184, RULE_grouping_elem_list = 185, 
		RULE_having_clause = 186, RULE_frame = 187, RULE_frame_start = 188, RULE_frame_end = 189, 
		RULE_frame_clause = 190, RULE_window_definition = 191, RULE_window_clause = 192, 
		RULE_combine_clause = 193, RULE_order_by_clause = 194, RULE_order_by_item = 195, 
		RULE_limit_clause = 196, RULE_offset_clause = 197, RULE_fetch_clause = 198, 
		RULE_for_clause = 199, RULE_expr = 200, RULE_bool_expr = 201, RULE_expr_list = 202, 
		RULE_expr_list_list = 203, RULE_type_literal = 204, RULE_oper = 205, RULE_aggregate = 206, 
		RULE_name = 207, RULE_name_list = 208, RULE_identifier_list = 209, RULE_table_name = 210, 
		RULE_type = 211, RULE_type_list = 212, RULE_index_method = 213, RULE_func_name = 214, 
		RULE_func_call = 215, RULE_array_cons_expr = 216, RULE_from_item = 217, 
		RULE_with_column_alias = 218, RULE_join_type = 219, RULE_join_clause = 220, 
		RULE_predicate = 221, RULE_non_reserved_keyword = 222, RULE_identifier = 223, 
		RULE_todo_fill_in = 224, RULE_todo_implement = 225, RULE_correlation_name = 226, 
		RULE_column_name = 227, RULE_alias = 228, RULE_column_alias = 229, RULE_column_definition = 230, 
		RULE_window_name = 231;
	public static final String[] ruleNames = {
		"stmt", "abort_stmt", "alter_stmt", "alter_aggregate_stmt", "alter_collation_stmt", 
		"alter_conversion_stmt", "alter_database_stmt", "alter_default_privileges_stmt", 
		"alter_domain_stmt", "alter_event_trigger_stmt", "alter_extension_stmt", 
		"alter_foreign_data_wrapper_stmt", "alter_foreign_table_stmt", "alter_function_stmt", 
		"alter_group_stmt", "alter_index_stmt", "alter_language_stmt", "alter_large_object_stmt", 
		"alter_materialize_view_stmt", "alter_operator_stmt", "alter_operator_class_stmt", 
		"alter_operator_family_stmt", "alter_policy_stmt", "alter_publication_stmt", 
		"alter_role_stmt", "alter_rule_stmt", "alter_schema_stmt", "alter_sequence_stmt", 
		"alter_server_stmt", "alter_statistics_stmt", "alter_subscription_stmt", 
		"alter_system_stmt", "alter_table_stmt", "alter_tablespace_stmt", "alter_text_search_config_stmt", 
		"alter_text_search_dict_stmt", "alter_text_search_parser_stmt", "alter_text_search_template_stmt", 
		"alter_trigger_stmt", "alter_type_stmt", "alter_user_stmt", "alter_user_mapping_stmt", 
		"alter_view_stmt", "analyze_stmt", "close_stmt", "cluster_stmt", "comment_stmt", 
		"commit_stmt", "commit_prepared_stmt", "copy_stmt", "create_stmt", "create_access_method_stmt", 
		"create_aggregate_stmt", "create_cast_stmt", "create_collation_opt", "create_collation_opt_list", 
		"create_collation_stmt", "create_conversion_stmt", "create_database_stmt", 
		"domain_constraint", "create_domain_stmt", "create_event_trigger_cond", 
		"create_event_trigger_stmt", "create_foreign_data_options", "create_foreign_data_stmt", 
		"create_foreign_table_stmt", "create_function_stmt", "create_group_stmt", 
		"create_index_stmt", "create_language_stmt", "create_materialized_view_stmt", 
		"create_operator_stmt", "create_operator_class_opt", "create_operator_class_stmt", 
		"create_operator_family_stmt", "create_policy_stmt", "create_role_stmt", 
		"create_rule_event", "create_rule_stmt", "create_schema_role_spec", "create_schema_stmt", 
		"create_sequence_stmt", "create_server_stmt", "create_statistics_stmt", 
		"create_subscription_stmt", "create_table_stmt", "create_table_as_stmt", 
		"create_tablespace_stmt", "create_text_search_config_stmt", "create_text_search_dict_stmt", 
		"create_text_search_parser_stmt", "create_text_search_template_stmt", 
		"create_transform_stmt", "create_trigger_stmt", "create_type_stmt", "create_user_stmt", 
		"create_user_mapping_stmt", "create_view_stmt", "deallocate_stmt", "declare_stmt", 
		"delete_stmt", "discard_stmt", "drop_stmt", "drop_access_method_stmt", 
		"drop_aggregate_stmt", "drop_cast_stmt", "drop_collation_stmt", "drop_conversion_stmt", 
		"drop_database_stmt", "drop_domain_stmt", "drop_event_trigger_stmt", "drop_extension_stmt", 
		"drop_foreign_data_wrapper_stmt", "drop_foreign_table_stmt", "drop_function_stmt", 
		"drop_group_stmt", "drop_index_stmt", "drop_language_stmt", "drop_materialized_view_stmt", 
		"drop_operator_stmt", "drop_operator_class_stmt", "drop_operator_family_stmt", 
		"drop_owned_stmt", "drop_policy_stmt", "drop_publication_stmt", "drop_role_stmt", 
		"drop_rule_stmt", "drop_schema_stmt", "drop_sequence_stmt", "drop_server_stmt", 
		"drop_statistics_stmt", "drop_subscription_stmt", "drop_table_stmt", "drop_tablespace_stmt", 
		"drop_text_search_config_stmt", "drop_text_search_dict_stmt", "drop_text_search_parser_stmt", 
		"drop_text_search_template_stmt", "drop_transform_stmt", "drop_trigger_stmt", 
		"drop_type_stmt", "drop_user_stmt", "drop_user_mapping_stmt", "drop_view_stmt", 
		"execute_stmt", "explain_stmt", "fetch_stmt", "grant_stmt", "import_foreign_schema_stmt", 
		"insert_stmt", "listen_stmt", "load_stmt", "lock_stmt", "move_stmt", "notify_stmt", 
		"prepare_stmt", "prepare_transaction_stmt", "reassign_owned_stmt", "refresh_materialized_view_stmt", 
		"reindex_stmt", "release_savepoint_stmt", "reset_stmt", "revoke_stmt", 
		"rollback_stmt", "rollback_prepared_stmt", "rollback_to_savepoint_stmt", 
		"savepoint_stmt", "security_label_stmt", "select_stmt", "set_stmt", "set_constraints_stmt", 
		"set_role_stmt", "set_session_authorization_stmt", "set_transaction_stmt", 
		"show_stmt", "truncate_stmt", "unlisten_stmt", "update_stmt", "vacuum_stmt", 
		"values_stmt", "selector_clause", "from_clause", "where_clause", "group_by_clause", 
		"grouping_elem", "grouping_elem_list", "having_clause", "frame", "frame_start", 
		"frame_end", "frame_clause", "window_definition", "window_clause", "combine_clause", 
		"order_by_clause", "order_by_item", "limit_clause", "offset_clause", "fetch_clause", 
		"for_clause", "expr", "bool_expr", "expr_list", "expr_list_list", "type_literal", 
		"oper", "aggregate", "name", "name_list", "identifier_list", "table_name", 
		"type", "type_list", "index_method", "func_name", "func_call", "array_cons_expr", 
		"from_item", "with_column_alias", "join_type", "join_clause", "predicate", 
		"non_reserved_keyword", "identifier", "todo_fill_in", "todo_implement", 
		"correlation_name", "column_name", "alias", "column_alias", "column_definition", 
		"window_name"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "','", "':'", "'::'", "'$'", "'$$'", "'*'", "'('", 
		"')'", "'['", "']'", null, null, null, null, null, "'.'", null, null, 
		null, "'&'", "'&&'", "'&<'", "'@@'", "'@>'", "'@'", "'!'", "'!!'", "'!='", 
		"'^'", "'='", "'=>'", "'>'", "'>='", "'>>'", "'#'", "'#='", "'#>'", "'#>>'", 
		"'##'", "'->'", "'->>'", "'-|-'", "'<'", "'<='", "'<@'", "'<^'", "'<>'", 
		"'<->'", "'<<'", "'<<='", "'<?>'", "'-'", "'%'", "'|'", "'||'", "'||/'", 
		"'|/'", "'+'", "'?'", "'?&'", "'?#'", "'?-'", "'?|'", "'/'", "'~'", "'~='", 
		"'~>=~'", "'~>~'", "'~<=~'", "'~<~'", "'~*'", "'~~'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WHITESPACE", "BLOCK_COMMENT", "LINE_COMMENT", "A_", "ABORT", "ABS", 
		"ABSOLUTE", "ACCESS", "ACTION", "ADA", "ADD", "ADMIN", "AFTER", "AGGREGATE", 
		"ALIAS", "ALL", "ALLOCATE", "ALSO", "ALTER", "ALWAYS", "ANALYSE", "ANALYZE", 
		"AND", "ANY", "ARE", "ARRAY", "AS", "ASC", "ASENSITIVE", "ASSERTION", 
		"ASSIGNMENT", "ASYMMETRIC", "AT", "ATOMIC", "ATTRIBUTE", "ATTRIBUTES", 
		"AUTHORIZATION", "AVG", "BACKWARD", "BEFORE", "BEGIN", "BERNOULLI", "BETWEEN", 
		"BIGINT", "BINARY", "BIT", "BITVAR", "BIT_LENGTH", "BLOB", "BOOLEAN", 
		"BOTH", "BREADTH", "BY", "C_", "CACHE", "CALL", "CALLED", "CARDINALITY", 
		"CASCADE", "CASCADED", "CASE", "CAST", "CATALOG", "CATALOG_NAME", "CEIL", 
		"CEILING", "CHAIN", "CHAR", "CHARACTER", "CHARACTERISTICS", "CHARACTERS", 
		"CHARACTER_LENGTH", "CHARACTER_SET_CATALOG", "CHARACTER_SET_NAME", "CHARACTER_SET_SCHEMA", 
		"CHAR_LENGTH", "CHECK", "CHECKED", "CHECKPOINT", "CLASS", "CLASS_ORIGIN", 
		"CLOB", "CLOSE", "CLUSTER", "COALESCE", "COBOL", "COLLATE", "COLLATION", 
		"COLLATION_CATALOG", "COLLATION_NAME", "COLLATION_SCHEMA", "COLLECT", 
		"COLUMN", "COLUMN_NAME", "COMMAND_FUNCTION", "COMMAND_FUNCTION_CODE", 
		"COMMENT", "COMMIT", "COMMITTED", "COMPLETION", "CONDITION", "CONDITION_NUMBER", 
		"CONNECT", "CONNECTION", "CONNECTION_NAME", "CONSTRAINT", "CONSTRAINTS", 
		"CONSTRAINT_CATALOG", "CONSTRAINT_NAME", "CONSTRAINT_SCHEMA", "CONSTRUCTOR", 
		"CONTAINS", "CONTINUE", "CONVERSION", "CONVERT", "COPY", "CORR", "CORRESPONDING", 
		"COUNT", "COVAR_POP", "COVAR_SAMP", "CREATE", "CREATEDB", "CREATEUSER", 
		"CROSS", "CSV", "CUBE", "CUME_DIST", "CURRENT", "CURRENT_DATE", "CURRENT_DEFAULT_TRANSFORM_GROUP", 
		"CURRENT_PATH", "CURRENT_ROLE", "CURRENT_TIME", "CURRENT_TIMESTAMP", "CURRENT_TRANSFORM_GROUP_FOR_TYPE", 
		"CURRENT_USER", "CURSOR", "CURSOR_NAME", "CYCLE", "DATA", "DATABASE", 
		"DATE", "DATETIME_INTERVAL_CODE", "DATETIME_INTERVAL_PRECISION", "DAY", 
		"DEALLOCATE", "DEC", "DECIMAL", "DECLARE", "DEFAULT", "DEFAULTS", "DEFERRABLE", 
		"DEFERRED", "DEFINED", "DEFINER", "DEGREE", "DELETE", "DELIMITER", "DELIMITERS", 
		"DENSE_RANK", "DEPTH", "DEREF", "DERIVED", "DESC", "DESCRIBE", "DESCRIPTOR", 
		"DESTROY", "DESTRUCTOR", "DETERMINISTIC", "DIAGNOSTICS", "DICTIONARY", 
		"DISCONNECT", "DISPATCH", "DISTINCT", "DO", "DOMAIN", "DOUBLE", "DROP", 
		"DYNAMIC", "DYNAMIC_FUNCTION", "DYNAMIC_FUNCTION_CODE", "EACH", "ELEMENT", 
		"ELSE", "ENCODING", "ENCRYPTED", "END", "END_EXEC", "EQUALS", "ESCAPE", 
		"EVERY", "EXCEPT", "EXCEPTION", "EXCLUDE", "EXCLUDING", "EXCLUSIVE", "EXEC", 
		"EXECUTE", "EXISTING", "EXISTS", "EXP", "EXPLAIN", "EXTERNAL", "EXTRACT", 
		"FALSE", "FETCH", "FILTER", "FINAL", "FIRST", "FLOAT", "FLOOR", "FOLLOWING", 
		"FOR", "FORCE", "FOREIGN", "FORTRAN", "FORWARD", "FOUND", "FREE", "FREEZE", 
		"FROM", "FULL", "FUNCTION", "FUSION", "G_", "GENERAL", "GENERATED", "GET", 
		"GLOBAL", "GO", "GOTO", "GRANT", "GRANTED", "GROUP", "GROUPING", "HANDLER", 
		"HAVING", "HIERARCHY", "HOLD", "HOST", "HOUR", "IDENTITY", "IGNORE", "ILIKE", 
		"IMMEDIATE", "IMMUTABLE", "IMPLEMENTATION", "IMPLICIT", "IN", "INCLUDING", 
		"INCREMENT", "INDEX", "INDICATOR", "INFIX", "INHERITS", "INITIALIZE", 
		"INITIALLY", "INNER", "INOUT", "INPUT", "INSENSITIVE", "INSERT", "INSTANCE", 
		"INSTANTIABLE", "INSTEAD", "INT", "INTEGER", "INTERSECT", "INTERSECTION", 
		"INTERVAL", "INTO", "INVOKER", "IS", "ISNULL", "ISOLATION", "ITERATE", 
		"JOIN", "K_", "KEY", "KEY_MEMBER", "KEY_TYPE", "LANCOMPILER", "LANGUAGE", 
		"LARGE", "LAST", "LATERAL", "LEADING", "LEFT", "LENGTH", "LESS", "LEVEL", 
		"LIKE", "LIMIT", "LISTEN", "LN", "LOAD", "LOCAL", "LOCALTIME", "LOCALTIMESTAMP", 
		"LOCATION", "LOCATOR", "LOCK", "LOCKED", "LOWER", "M_", "MAP", "MATCH", 
		"MATCHED", "MAX", "MAXVALUE", "MEMBER", "MERGE", "MESSAGE_LENGTH", "MESSAGE_OCTET_LENGTH", 
		"MESSAGE_TEXT", "METHOD", "MIN", "MINUTE", "MINVALUE", "MOD", "MODE", 
		"MODIFIES", "MODIFY", "MODULE", "MONTH", "MORE_", "MOVE", "MULTISET", 
		"MUMPS", "NAME", "NAMES", "NATIONAL", "NATURAL", "NCHAR", "NCLOB", "NESTING", 
		"NEW", "NEXT", "NO", "NOCREATEDB", "NOCREATEUSER", "NONE", "NORMALIZE", 
		"NORMALIZED", "NOT", "NOTHING", "NOTIFY", "NOTNULL", "NOWAIT", "NULL", 
		"NULLABLE", "NULLIF", "NULLS", "NUMBER", "NUMERIC", "OBJECT", "OCTETS", 
		"OCTET_LENGTH", "OF", "OFF", "OFFSET", "OIDS", "OLD", "ON", "ONLY", "OPEN", 
		"OPERATION", "OPERATOR", "OPTION", "OPTIONS", "OR", "ORDER", "ORDERING", 
		"ORDINALITY", "OTHERS", "OUT", "OUTER", "OUTPUT", "OVER", "OVERLAPS", 
		"OVERLAY", "OVERRIDING", "OWNER", "PAD", "PARAMETER", "PARAMETERS", "PARAMETER_MODE", 
		"PARAMETER_NAME", "PARAMETER_ORDINAL_POSITION", "PARAMETER_SPECIFIC_CATALOG", 
		"PARAMETER_SPECIFIC_NAME", "PARAMETER_SPECIFIC_SCHEMA", "PARTIAL", "PARTITION", 
		"PASCAL", "PASSWORD", "PATH", "PERCENTILE_CONT", "PERCENTILE_DISC", "PERCENT_RANK", 
		"PLACING", "PLI", "POSITION", "POSTFIX", "POWER", "PRECEDING", "PRECISION", 
		"PREFIX", "PREORDER", "PREPARE", "PRESERVE", "PRIMARY", "PRIOR", "PRIVILEGES", 
		"PROCEDURAL", "PROCEDURE", "PUBLIC", "QUOTE", "RANGE", "RANK", "READ", 
		"READS", "REAL", "RECHECK", "RECURSIVE", "REF", "REFERENCES", "REFERENCING", 
		"REGR_AVGX", "REGR_AVGY", "REGR_COUNT", "REGR_INTERCEPT", "REGR_R2", "REGR_SLOPE", 
		"REGR_SXX", "REGR_SXY", "REGR_SYY", "REINDEX", "RELATIVE", "RELEASE", 
		"RENAME", "REPEATABLE", "REPLACE", "RESET", "RESTART", "RESTRICT", "RESULT", 
		"RETURN", "RETURNED_CARDINALITY", "RETURNED_LENGTH", "RETURNED_OCTET_LENGTH", 
		"RETURNED_SQLSTATE", "RETURNS", "REVOKE", "RIGHT", "ROLE", "ROLLBACK", 
		"ROLLUP", "ROUTINE", "ROUTINE_CATALOG", "ROUTINE_NAME", "ROUTINE_SCHEMA", 
		"ROW", "ROWS", "ROW_COUNT", "ROW_NUMBER", "RULE", "SAVEPOINT", "SCALE", 
		"SCHEMA", "SCHEMA_NAME", "SCOPE", "SCOPE_CATALOG", "SCOPE_NAME", "SCOPE_SCHEMA", 
		"SCROLL", "SEARCH", "SECOND", "SECTION", "SECURITY", "SELECT", "SELF", 
		"SENSITIVE", "SEQUENCE", "SERIALIZABLE", "SERVER_NAME", "SESSION", "SESSION_USER", 
		"SET", "SETOF", "SETS", "SHARE", "SHOW", "SIMILAR", "SIMPLE", "SIZE", 
		"SKIP_", "SMALLINT", "SOME", "SOURCE", "SPACE", "SPECIFIC", "SPECIFICTYPE", 
		"SPECIFIC_NAME", "SQL", "SQLCODE", "SQLERROR", "SQLEXCEPTION", "SQLSTATE", 
		"SQLWARNING", "SQRT", "STABLE", "START", "STATE", "STATEMENT", "STATIC", 
		"STATISTICS", "STDDEV_POP", "STDDEV_SAMP", "STDIN", "STDOUT", "STORAGE", 
		"STRICT", "STRUCTURE", "STYLE", "SUBCLASS_ORIGIN", "SUBLIST", "SUBMULTISET", 
		"SUBSTRING", "SUM", "SYMMETRIC", "SYSID", "SYSTEM", "SYSTEM_USER", "TABLE", 
		"TABLESAMPLE", "TABLESPACE", "TABLE_NAME", "TEMP", "TEMPLATE", "TEMPORARY", 
		"TERMINATE", "THAN", "THEN", "TIES", "TIME", "TIME_TZ", "TIMESTAMP", "TIMESTAMP_TZ", 
		"TIMEZONE_HOUR", "TIMEZONE_MINUTE", "TO", "TOAST", "TOP_LEVEL_COUNT", 
		"TRAILING", "TRANSACTION", "TRANSACTIONS_COMMITTED", "TRANSACTIONS_ROLLED_BACK", 
		"TRANSACTION_ACTIVE", "TRANSFORM", "TRANSFORMS", "TRANSLATE", "TRANSLATION", 
		"TREAT", "TRIGGER", "TRIGGER_CATALOG", "TRIGGER_NAME", "TRIGGER_SCHEMA", 
		"TRIM", "TRUE", "TRUNCATE", "TRUSTED", "TYPE", "UESCAPE", "UNBOUNDED", 
		"UNCOMMITTED", "UNDER", "UNENCRYPTED", "UNION", "UNIQUE", "UNKNOWN", "UNLISTEN", 
		"UNNAMED", "UNNEST", "UNTIL", "UPDATE", "UPPER", "USAGE", "USER", "USER_DEFINED_TYPE_CATALOG", 
		"USER_DEFINED_TYPE_CODE", "USER_DEFINED_TYPE_NAME", "USER_DEFINED_TYPE_SCHEMA", 
		"USING", "VACUUM", "VALID", "VALIDATOR", "VALUE", "VALUES", "VARCHAR", 
		"VARIABLE", "VARIADIC", "VARYING", "VAR_POP", "VAR_SAMP", "VERBOSE", "VIEW", 
		"VOLATILE", "WHEN", "WHENEVER", "WHERE", "WIDTH_BUCKET", "WINDOW", "WITH", 
		"WITHIN", "WITHOUT", "WORK", "WRITE", "YEAR", "ZONE", "SUPERUSER", "NOSUPERUSER", 
		"CREATEROLE", "NOCREATEROLE", "INHERIT", "NOINHERIT", "LOGIN", "NOLOGIN", 
		"REPLICATION", "NOREPLICATION", "BYPASSRLS", "NOBYPASSRLS", "SFUNC", "STYPE", 
		"SSPACE", "FINALFUNC", "FINALFUNC_EXTRA", "COMBINEFUNC", "SERIALFUNC", 
		"DESERIALFUNC", "INITCOND", "MSFUNC", "MINVFUNC", "MSTYPE", "MSSPACE", 
		"MFINALFUNC", "MFINALFUNC_EXTRA", "MINITCOND", "SORTOP", "PARALLEL", "HYPOTHETICAL", 
		"SAFE", "RESTRICTED", "UNSAFE", "BASETYPE", "IF", "LOCALE", "LC_COLLATE", 
		"LC_CTYPE", "PROVIDER", "VERSION", "ALLOW_CONNECTIONS", "IS_TEMPLATE", 
		"EVENT", "WRAPPER", "SERVER", "BTREE", "HASH_", "GIST", "SPGIST", "GIN", 
		"BRIN", "CONCURRENTLY", "INLINE", "MATERIALIZED", "LEFTARG", "RIGHTARG", 
		"COMMUTATOR", "NEGATOR", "HASHES", "MERGES", "FAMILY", "POLICY", "OWNED", 
		"ABSTIME", "BOOL", "BOX", "FLOAT4", "FLOAT8", "INT2", "INT4", "INT8", 
		"JSON", "JSONB", "LINE", "POINT", "RELTIME", "TEXT", "COMMA", "COLON", 
		"COLON_COLON", "DOLLAR", "DOLLAR_DOLLAR", "STAR", "OPEN_PAREN", "CLOSE_PAREN", 
		"OPEN_BRACKET", "CLOSE_BRACKET", "BIT_STRING", "REGEX_STRING", "NUMERIC_LITERAL", 
		"INTEGER_LITERAL", "HEX_INTEGER_LITERAL", "DOT", "SINGLEQ_STRING_LITERAL", 
		"DOUBLEQ_STRING_LITERAL", "IDENTIFIER", "AMP", "AMP_AMP", "AMP_LT", "AT_AT", 
		"AT_GT", "AT_SIGN", "BANG", "BANG_BANG", "BANG_EQUAL", "CARET", "EQUAL", 
		"EQUAL_GT", "GT", "GTE", "GT_GT", "HASH", "HASH_EQ", "HASH_GT", "HASH_GT_GT", 
		"HASH_HASH", "HYPHEN_GT", "HYPHEN_GT_GT", "HYPHEN_PIPE_HYPHEN", "LT", 
		"LTE", "LT_AT", "LT_CARET", "LT_GT", "LT_HYPHEN_GT", "LT_LT", "LT_LT_EQ", 
		"LT_QMARK_GT", "MINUS", "PERCENT", "PIPE", "PIPE_PIPE", "PIPE_PIPE_SLASH", 
		"PIPE_SLASH", "PLUS", "QMARK", "QMARK_AMP", "QMARK_HASH", "QMARK_HYPHEN", 
		"QMARK_PIPE", "SLASH", "TIL", "TIL_EQ", "TIL_GTE_TIL", "TIL_GT_TIL", "TIL_LTE_TIL", 
		"TIL_LT_TIL", "TIL_STAR", "TIL_TIL"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "PostgreSQLParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PostgreSQLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StmtContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(PostgreSQLParser.EOF, 0); }
		public Abort_stmtContext abort_stmt() {
			return getRuleContext(Abort_stmtContext.class,0);
		}
		public Alter_stmtContext alter_stmt() {
			return getRuleContext(Alter_stmtContext.class,0);
		}
		public Analyze_stmtContext analyze_stmt() {
			return getRuleContext(Analyze_stmtContext.class,0);
		}
		public Create_stmtContext create_stmt() {
			return getRuleContext(Create_stmtContext.class,0);
		}
		public Close_stmtContext close_stmt() {
			return getRuleContext(Close_stmtContext.class,0);
		}
		public Cluster_stmtContext cluster_stmt() {
			return getRuleContext(Cluster_stmtContext.class,0);
		}
		public Comment_stmtContext comment_stmt() {
			return getRuleContext(Comment_stmtContext.class,0);
		}
		public Commit_stmtContext commit_stmt() {
			return getRuleContext(Commit_stmtContext.class,0);
		}
		public Commit_prepared_stmtContext commit_prepared_stmt() {
			return getRuleContext(Commit_prepared_stmtContext.class,0);
		}
		public Copy_stmtContext copy_stmt() {
			return getRuleContext(Copy_stmtContext.class,0);
		}
		public Deallocate_stmtContext deallocate_stmt() {
			return getRuleContext(Deallocate_stmtContext.class,0);
		}
		public Declare_stmtContext declare_stmt() {
			return getRuleContext(Declare_stmtContext.class,0);
		}
		public Delete_stmtContext delete_stmt() {
			return getRuleContext(Delete_stmtContext.class,0);
		}
		public Discard_stmtContext discard_stmt() {
			return getRuleContext(Discard_stmtContext.class,0);
		}
		public Drop_stmtContext drop_stmt() {
			return getRuleContext(Drop_stmtContext.class,0);
		}
		public Execute_stmtContext execute_stmt() {
			return getRuleContext(Execute_stmtContext.class,0);
		}
		public Explain_stmtContext explain_stmt() {
			return getRuleContext(Explain_stmtContext.class,0);
		}
		public Fetch_stmtContext fetch_stmt() {
			return getRuleContext(Fetch_stmtContext.class,0);
		}
		public Grant_stmtContext grant_stmt() {
			return getRuleContext(Grant_stmtContext.class,0);
		}
		public Import_foreign_schema_stmtContext import_foreign_schema_stmt() {
			return getRuleContext(Import_foreign_schema_stmtContext.class,0);
		}
		public Insert_stmtContext insert_stmt() {
			return getRuleContext(Insert_stmtContext.class,0);
		}
		public Listen_stmtContext listen_stmt() {
			return getRuleContext(Listen_stmtContext.class,0);
		}
		public Load_stmtContext load_stmt() {
			return getRuleContext(Load_stmtContext.class,0);
		}
		public Lock_stmtContext lock_stmt() {
			return getRuleContext(Lock_stmtContext.class,0);
		}
		public Move_stmtContext move_stmt() {
			return getRuleContext(Move_stmtContext.class,0);
		}
		public Notify_stmtContext notify_stmt() {
			return getRuleContext(Notify_stmtContext.class,0);
		}
		public Prepare_stmtContext prepare_stmt() {
			return getRuleContext(Prepare_stmtContext.class,0);
		}
		public Prepare_transaction_stmtContext prepare_transaction_stmt() {
			return getRuleContext(Prepare_transaction_stmtContext.class,0);
		}
		public Reassign_owned_stmtContext reassign_owned_stmt() {
			return getRuleContext(Reassign_owned_stmtContext.class,0);
		}
		public Refresh_materialized_view_stmtContext refresh_materialized_view_stmt() {
			return getRuleContext(Refresh_materialized_view_stmtContext.class,0);
		}
		public Reindex_stmtContext reindex_stmt() {
			return getRuleContext(Reindex_stmtContext.class,0);
		}
		public Release_savepoint_stmtContext release_savepoint_stmt() {
			return getRuleContext(Release_savepoint_stmtContext.class,0);
		}
		public Reset_stmtContext reset_stmt() {
			return getRuleContext(Reset_stmtContext.class,0);
		}
		public Revoke_stmtContext revoke_stmt() {
			return getRuleContext(Revoke_stmtContext.class,0);
		}
		public Rollback_stmtContext rollback_stmt() {
			return getRuleContext(Rollback_stmtContext.class,0);
		}
		public Rollback_prepared_stmtContext rollback_prepared_stmt() {
			return getRuleContext(Rollback_prepared_stmtContext.class,0);
		}
		public Rollback_to_savepoint_stmtContext rollback_to_savepoint_stmt() {
			return getRuleContext(Rollback_to_savepoint_stmtContext.class,0);
		}
		public Savepoint_stmtContext savepoint_stmt() {
			return getRuleContext(Savepoint_stmtContext.class,0);
		}
		public Security_label_stmtContext security_label_stmt() {
			return getRuleContext(Security_label_stmtContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Set_stmtContext set_stmt() {
			return getRuleContext(Set_stmtContext.class,0);
		}
		public Set_constraints_stmtContext set_constraints_stmt() {
			return getRuleContext(Set_constraints_stmtContext.class,0);
		}
		public Set_role_stmtContext set_role_stmt() {
			return getRuleContext(Set_role_stmtContext.class,0);
		}
		public Set_session_authorization_stmtContext set_session_authorization_stmt() {
			return getRuleContext(Set_session_authorization_stmtContext.class,0);
		}
		public Set_transaction_stmtContext set_transaction_stmt() {
			return getRuleContext(Set_transaction_stmtContext.class,0);
		}
		public Show_stmtContext show_stmt() {
			return getRuleContext(Show_stmtContext.class,0);
		}
		public Truncate_stmtContext truncate_stmt() {
			return getRuleContext(Truncate_stmtContext.class,0);
		}
		public Unlisten_stmtContext unlisten_stmt() {
			return getRuleContext(Unlisten_stmtContext.class,0);
		}
		public Update_stmtContext update_stmt() {
			return getRuleContext(Update_stmtContext.class,0);
		}
		public Vacuum_stmtContext vacuum_stmt() {
			return getRuleContext(Vacuum_stmtContext.class,0);
		}
		public Values_stmtContext values_stmt() {
			return getRuleContext(Values_stmtContext.class,0);
		}
		public TerminalNode OPEN_PAREN() { return getToken(PostgreSQLParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(PostgreSQLParser.CLOSE_PAREN, 0); }
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitStmt(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(464);
				abort_stmt();
				}
				break;
			case 2:
				{
				setState(465);
				alter_stmt();
				}
				break;
			case 3:
				{
				setState(466);
				analyze_stmt();
				}
				break;
			case 4:
				{
				setState(467);
				create_stmt();
				}
				break;
			case 5:
				{
				setState(468);
				close_stmt();
				}
				break;
			case 6:
				{
				setState(469);
				cluster_stmt();
				}
				break;
			case 7:
				{
				setState(470);
				comment_stmt();
				}
				break;
			case 8:
				{
				setState(471);
				commit_stmt();
				}
				break;
			case 9:
				{
				setState(472);
				commit_prepared_stmt();
				}
				break;
			case 10:
				{
				setState(473);
				copy_stmt();
				}
				break;
			case 11:
				{
				setState(474);
				deallocate_stmt();
				}
				break;
			case 12:
				{
				setState(475);
				declare_stmt();
				}
				break;
			case 13:
				{
				setState(476);
				delete_stmt();
				}
				break;
			case 14:
				{
				setState(477);
				discard_stmt();
				}
				break;
			case 15:
				{
				setState(478);
				drop_stmt();
				}
				break;
			case 16:
				{
				setState(479);
				execute_stmt();
				}
				break;
			case 17:
				{
				setState(480);
				explain_stmt();
				}
				break;
			case 18:
				{
				setState(481);
				fetch_stmt();
				}
				break;
			case 19:
				{
				setState(482);
				grant_stmt();
				}
				break;
			case 20:
				{
				setState(483);
				import_foreign_schema_stmt();
				}
				break;
			case 21:
				{
				setState(484);
				insert_stmt();
				}
				break;
			case 22:
				{
				setState(485);
				listen_stmt();
				}
				break;
			case 23:
				{
				setState(486);
				load_stmt();
				}
				break;
			case 24:
				{
				setState(487);
				lock_stmt();
				}
				break;
			case 25:
				{
				setState(488);
				move_stmt();
				}
				break;
			case 26:
				{
				setState(489);
				notify_stmt();
				}
				break;
			case 27:
				{
				setState(490);
				prepare_stmt();
				}
				break;
			case 28:
				{
				setState(491);
				prepare_transaction_stmt();
				}
				break;
			case 29:
				{
				setState(492);
				reassign_owned_stmt();
				}
				break;
			case 30:
				{
				setState(493);
				refresh_materialized_view_stmt();
				}
				break;
			case 31:
				{
				setState(494);
				reindex_stmt();
				}
				break;
			case 32:
				{
				setState(495);
				release_savepoint_stmt();
				}
				break;
			case 33:
				{
				setState(496);
				reset_stmt();
				}
				break;
			case 34:
				{
				setState(497);
				revoke_stmt();
				}
				break;
			case 35:
				{
				setState(498);
				rollback_stmt();
				}
				break;
			case 36:
				{
				setState(499);
				rollback_prepared_stmt();
				}
				break;
			case 37:
				{
				setState(500);
				rollback_to_savepoint_stmt();
				}
				break;
			case 38:
				{
				setState(501);
				savepoint_stmt();
				}
				break;
			case 39:
				{
				setState(502);
				security_label_stmt();
				}
				break;
			case 40:
				{
				setState(503);
				select_stmt();
				}
				break;
			case 41:
				{
				{
				setState(504);
				match(OPEN_PAREN);
				setState(505);
				select_stmt();
				setState(506);
				match(CLOSE_PAREN);
				}
				}
				break;
			case 42:
				{
				setState(508);
				set_stmt();
				}
				break;
			case 43:
				{
				setState(509);
				set_constraints_stmt();
				}
				break;
			case 44:
				{
				setState(510);
				set_role_stmt();
				}
				break;
			case 45:
				{
				setState(511);
				set_session_authorization_stmt();
				}
				break;
			case 46:
				{
				setState(512);
				set_transaction_stmt();
				}
				break;
			case 47:
				{
				setState(513);
				show_stmt();
				}
				break;
			case 48:
				{
				setState(514);
				truncate_stmt();
				}
				break;
			case 49:
				{
				setState(515);
				unlisten_stmt();
				}
				break;
			case 50:
				{
				setState(516);
				update_stmt();
				}
				break;
			case 51:
				{
				setState(517);
				vacuum_stmt();
				}
				break;
			case 52:
				{
				setState(518);
				values_stmt();
				}
				break;
			}
			setState(521);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Abort_stmtContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Abort_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abort_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterAbort_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitAbort_stmt(this);
		}
	}

	public final Abort_stmtContext abort_stmt() throws RecognitionException {
		Abort_stmtContext _localctx = new Abort_stmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_abort_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			identifier(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_stmtContext extends ParserRuleContext {
		public Alter_aggregate_stmtContext alter_aggregate_stmt() {
			return getRuleContext(Alter_aggregate_stmtContext.class,0);
		}
		public Alter_collation_stmtContext alter_collation_stmt() {
			return getRuleContext(Alter_collation_stmtContext.class,0);
		}
		public Alter_conversion_stmtContext alter_conversion_stmt() {
			return getRuleContext(Alter_conversion_stmtContext.class,0);
		}
		public Alter_database_stmtContext alter_database_stmt() {
			return getRuleContext(Alter_database_stmtContext.class,0);
		}
		public Alter_default_privileges_stmtContext alter_default_privileges_stmt() {
			return getRuleContext(Alter_default_privileges_stmtContext.class,0);
		}
		public Alter_domain_stmtContext alter_domain_stmt() {
			return getRuleContext(Alter_domain_stmtContext.class,0);
		}
		public Alter_event_trigger_stmtContext alter_event_trigger_stmt() {
			return getRuleContext(Alter_event_trigger_stmtContext.class,0);
		}
		public Alter_extension_stmtContext alter_extension_stmt() {
			return getRuleContext(Alter_extension_stmtContext.class,0);
		}
		public Alter_foreign_data_wrapper_stmtContext alter_foreign_data_wrapper_stmt() {
			return getRuleContext(Alter_foreign_data_wrapper_stmtContext.class,0);
		}
		public Alter_foreign_table_stmtContext alter_foreign_table_stmt() {
			return getRuleContext(Alter_foreign_table_stmtContext.class,0);
		}
		public Alter_function_stmtContext alter_function_stmt() {
			return getRuleContext(Alter_function_stmtContext.class,0);
		}
		public Alter_group_stmtContext alter_group_stmt() {
			return getRuleContext(Alter_group_stmtContext.class,0);
		}
		public Alter_index_stmtContext alter_index_stmt() {
			return getRuleContext(Alter_index_stmtContext.class,0);
		}
		public Alter_language_stmtContext alter_language_stmt() {
			return getRuleContext(Alter_language_stmtContext.class,0);
		}
		public Alter_large_object_stmtContext alter_large_object_stmt() {
			return getRuleContext(Alter_large_object_stmtContext.class,0);
		}
		public Alter_materialize_view_stmtContext alter_materialize_view_stmt() {
			return getRuleContext(Alter_materialize_view_stmtContext.class,0);
		}
		public Alter_operator_stmtContext alter_operator_stmt() {
			return getRuleContext(Alter_operator_stmtContext.class,0);
		}
		public Alter_operator_class_stmtContext alter_operator_class_stmt() {
			return getRuleContext(Alter_operator_class_stmtContext.class,0);
		}
		public Alter_operator_family_stmtContext alter_operator_family_stmt() {
			return getRuleContext(Alter_operator_family_stmtContext.class,0);
		}
		public Alter_policy_stmtContext alter_policy_stmt() {
			return getRuleContext(Alter_policy_stmtContext.class,0);
		}
		public Alter_publication_stmtContext alter_publication_stmt() {
			return getRuleContext(Alter_publication_stmtContext.class,0);
		}
		public Alter_role_stmtContext alter_role_stmt() {
			return getRuleContext(Alter_role_stmtContext.class,0);
		}
		public Alter_rule_stmtContext alter_rule_stmt() {
			return getRuleContext(Alter_rule_stmtContext.class,0);
		}
		public Alter_schema_stmtContext alter_schema_stmt() {
			return getRuleContext(Alter_schema_stmtContext.class,0);
		}
		public Alter_sequence_stmtContext alter_sequence_stmt() {
			return getRuleContext(Alter_sequence_stmtContext.class,0);
		}
		public Alter_server_stmtContext alter_server_stmt() {
			return getRuleContext(Alter_server_stmtContext.class,0);
		}
		public Alter_statistics_stmtContext alter_statistics_stmt() {
			return getRuleContext(Alter_statistics_stmtContext.class,0);
		}
		public Alter_subscription_stmtContext alter_subscription_stmt() {
			return getRuleContext(Alter_subscription_stmtContext.class,0);
		}
		public Alter_system_stmtContext alter_system_stmt() {
			return getRuleContext(Alter_system_stmtContext.class,0);
		}
		public Alter_table_stmtContext alter_table_stmt() {
			return getRuleContext(Alter_table_stmtContext.class,0);
		}
		public Alter_tablespace_stmtContext alter_tablespace_stmt() {
			return getRuleContext(Alter_tablespace_stmtContext.class,0);
		}
		public Alter_text_search_config_stmtContext alter_text_search_config_stmt() {
			return getRuleContext(Alter_text_search_config_stmtContext.class,0);
		}
		public Alter_text_search_dict_stmtContext alter_text_search_dict_stmt() {
			return getRuleContext(Alter_text_search_dict_stmtContext.class,0);
		}
		public Alter_text_search_parser_stmtContext alter_text_search_parser_stmt() {
			return getRuleContext(Alter_text_search_parser_stmtContext.class,0);
		}
		public Alter_text_search_template_stmtContext alter_text_search_template_stmt() {
			return getRuleContext(Alter_text_search_template_stmtContext.class,0);
		}
		public Alter_trigger_stmtContext alter_trigger_stmt() {
			return getRuleContext(Alter_trigger_stmtContext.class,0);
		}
		public Alter_type_stmtContext alter_type_stmt() {
			return getRuleContext(Alter_type_stmtContext.class,0);
		}
		public Alter_user_stmtContext alter_user_stmt() {
			return getRuleContext(Alter_user_stmtContext.class,0);
		}
		public Alter_user_mapping_stmtContext alter_user_mapping_stmt() {
			return getRuleContext(Alter_user_mapping_stmtContext.class,0);
		}
		public Alter_view_stmtContext alter_view_stmt() {
			return getRuleContext(Alter_view_stmtContext.class,0);
		}
		public Alter_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterAlter_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitAlter_stmt(this);
		}
	}

	public final Alter_stmtContext alter_stmt() throws RecognitionException {
		Alter_stmtContext _localctx = new Alter_stmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_alter_stmt);
		try {
			setState(565);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(525);
				alter_aggregate_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(526);
				alter_collation_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(527);
				alter_conversion_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(528);
				alter_database_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(529);
				alter_default_privileges_stmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(530);
				alter_domain_stmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(531);
				alter_event_trigger_stmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(532);
				alter_extension_stmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(533);
				alter_foreign_data_wrapper_stmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(534);
				alter_foreign_table_stmt();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(535);
				alter_function_stmt();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(536);
				alter_group_stmt();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(537);
				alter_index_stmt();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(538);
				alter_language_stmt();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(539);
				alter_large_object_stmt();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(540);
				alter_materialize_view_stmt();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(541);
				alter_operator_stmt();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(542);
				alter_operator_class_stmt();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(543);
				alter_operator_family_stmt();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(544);
				alter_policy_stmt();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(545);
				alter_publication_stmt();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(546);
				alter_role_stmt();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(547);
				alter_rule_stmt();
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(548);
				alter_schema_stmt();
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(549);
				alter_sequence_stmt();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(550);
				alter_server_stmt();
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(551);
				alter_statistics_stmt();
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(552);
				alter_subscription_stmt();
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(553);
				alter_system_stmt();
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(554);
				alter_table_stmt();
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(555);
				alter_tablespace_stmt();
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(556);
				alter_text_search_config_stmt();
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(557);
				alter_text_search_dict_stmt();
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(558);
				alter_text_search_parser_stmt();
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(559);
				alter_text_search_template_stmt();
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(560);
				alter_trigger_stmt();
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(561);
				alter_type_stmt();
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(562);
				alter_user_stmt();
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(563);
				alter_user_mapping_stmt();
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(564);
				alter_view_stmt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_aggregate_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Alter_aggregate_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_aggregate_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterAlter_aggregate_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitAlter_aggregate_stmt(this);
		}
	}

	public final Alter_aggregate_stmtContext alter_aggregate_stmt() throws RecognitionException {
		Alter_aggregate_stmtContext _localctx = new Alter_aggregate_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_alter_aggregate_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(567);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_collation_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Alter_collation_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_collation_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterAlter_collation_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitAlter_collation_stmt(this);
		}
	}

	public final Alter_collation_stmtContext alter_collation_stmt() throws RecognitionException {
		Alter_collation_stmtContext _localctx = new Alter_collation_stmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_alter_collation_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(569);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_conversion_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Alter_conversion_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_conversion_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterAlter_conversion_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitAlter_conversion_stmt(this);
		}
	}

	public final Alter_conversion_stmtContext alter_conversion_stmt() throws RecognitionException {
		Alter_conversion_stmtContext _localctx = new Alter_conversion_stmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_alter_conversion_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_database_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Alter_database_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_database_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterAlter_database_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitAlter_database_stmt(this);
		}
	}

	public final Alter_database_stmtContext alter_database_stmt() throws RecognitionException {
		Alter_database_stmtContext _localctx = new Alter_database_stmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_alter_database_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_default_privileges_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Alter_default_privileges_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_default_privileges_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterAlter_default_privileges_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitAlter_default_privileges_stmt(this);
		}
	}

	public final Alter_default_privileges_stmtContext alter_default_privileges_stmt() throws RecognitionException {
		Alter_default_privileges_stmtContext _localctx = new Alter_default_privileges_stmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_alter_default_privileges_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(575);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_domain_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Alter_domain_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_domain_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterAlter_domain_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitAlter_domain_stmt(this);
		}
	}

	public final Alter_domain_stmtContext alter_domain_stmt() throws RecognitionException {
		Alter_domain_stmtContext _localctx = new Alter_domain_stmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_alter_domain_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(577);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_event_trigger_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Alter_event_trigger_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_event_trigger_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterAlter_event_trigger_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitAlter_event_trigger_stmt(this);
		}
	}

	public final Alter_event_trigger_stmtContext alter_event_trigger_stmt() throws RecognitionException {
		Alter_event_trigger_stmtContext _localctx = new Alter_event_trigger_stmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_alter_event_trigger_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(579);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_extension_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Alter_extension_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_extension_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterAlter_extension_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitAlter_extension_stmt(this);
		}
	}

	public final Alter_extension_stmtContext alter_extension_stmt() throws RecognitionException {
		Alter_extension_stmtContext _localctx = new Alter_extension_stmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_alter_extension_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(581);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_foreign_data_wrapper_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Alter_foreign_data_wrapper_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_foreign_data_wrapper_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterAlter_foreign_data_wrapper_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitAlter_foreign_data_wrapper_stmt(this);
		}
	}

	public final Alter_foreign_data_wrapper_stmtContext alter_foreign_data_wrapper_stmt() throws RecognitionException {
		Alter_foreign_data_wrapper_stmtContext _localctx = new Alter_foreign_data_wrapper_stmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_alter_foreign_data_wrapper_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(583);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_foreign_table_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Alter_foreign_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_foreign_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterAlter_foreign_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitAlter_foreign_table_stmt(this);
		}
	}

	public final Alter_foreign_table_stmtContext alter_foreign_table_stmt() throws RecognitionException {
		Alter_foreign_table_stmtContext _localctx = new Alter_foreign_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_alter_foreign_table_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(585);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_function_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Alter_function_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_function_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterAlter_function_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitAlter_function_stmt(this);
		}
	}

	public final Alter_function_stmtContext alter_function_stmt() throws RecognitionException {
		Alter_function_stmtContext _localctx = new Alter_function_stmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_alter_function_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(587);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_group_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Alter_group_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_group_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterAlter_group_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitAlter_group_stmt(this);
		}
	}

	public final Alter_group_stmtContext alter_group_stmt() throws RecognitionException {
		Alter_group_stmtContext _localctx = new Alter_group_stmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_alter_group_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(589);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_index_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Alter_index_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_index_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterAlter_index_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitAlter_index_stmt(this);
		}
	}

	public final Alter_index_stmtContext alter_index_stmt() throws RecognitionException {
		Alter_index_stmtContext _localctx = new Alter_index_stmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_alter_index_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(591);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_language_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Alter_language_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_language_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterAlter_language_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitAlter_language_stmt(this);
		}
	}

	public final Alter_language_stmtContext alter_language_stmt() throws RecognitionException {
		Alter_language_stmtContext _localctx = new Alter_language_stmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_alter_language_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(593);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_large_object_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Alter_large_object_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_large_object_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterAlter_large_object_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitAlter_large_object_stmt(this);
		}
	}

	public final Alter_large_object_stmtContext alter_large_object_stmt() throws RecognitionException {
		Alter_large_object_stmtContext _localctx = new Alter_large_object_stmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_alter_large_object_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(595);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_materialize_view_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Alter_materialize_view_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_materialize_view_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterAlter_materialize_view_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitAlter_materialize_view_stmt(this);
		}
	}

	public final Alter_materialize_view_stmtContext alter_materialize_view_stmt() throws RecognitionException {
		Alter_materialize_view_stmtContext _localctx = new Alter_materialize_view_stmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_alter_materialize_view_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(597);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_operator_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Alter_operator_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_operator_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterAlter_operator_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitAlter_operator_stmt(this);
		}
	}

	public final Alter_operator_stmtContext alter_operator_stmt() throws RecognitionException {
		Alter_operator_stmtContext _localctx = new Alter_operator_stmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_alter_operator_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(599);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_operator_class_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Alter_operator_class_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_operator_class_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterAlter_operator_class_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitAlter_operator_class_stmt(this);
		}
	}

	public final Alter_operator_class_stmtContext alter_operator_class_stmt() throws RecognitionException {
		Alter_operator_class_stmtContext _localctx = new Alter_operator_class_stmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_alter_operator_class_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(601);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_operator_family_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Alter_operator_family_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_operator_family_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterAlter_operator_family_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitAlter_operator_family_stmt(this);
		}
	}

	public final Alter_operator_family_stmtContext alter_operator_family_stmt() throws RecognitionException {
		Alter_operator_family_stmtContext _localctx = new Alter_operator_family_stmtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_alter_operator_family_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(603);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_policy_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Alter_policy_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_policy_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterAlter_policy_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitAlter_policy_stmt(this);
		}
	}

	public final Alter_policy_stmtContext alter_policy_stmt() throws RecognitionException {
		Alter_policy_stmtContext _localctx = new Alter_policy_stmtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_alter_policy_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(605);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_publication_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Alter_publication_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_publication_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterAlter_publication_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitAlter_publication_stmt(this);
		}
	}

	public final Alter_publication_stmtContext alter_publication_stmt() throws RecognitionException {
		Alter_publication_stmtContext _localctx = new Alter_publication_stmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_alter_publication_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(607);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_role_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Alter_role_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_role_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterAlter_role_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitAlter_role_stmt(this);
		}
	}

	public final Alter_role_stmtContext alter_role_stmt() throws RecognitionException {
		Alter_role_stmtContext _localctx = new Alter_role_stmtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_alter_role_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(609);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_rule_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Alter_rule_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_rule_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterAlter_rule_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitAlter_rule_stmt(this);
		}
	}

	public final Alter_rule_stmtContext alter_rule_stmt() throws RecognitionException {
		Alter_rule_stmtContext _localctx = new Alter_rule_stmtContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_alter_rule_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(611);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_schema_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Alter_schema_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_schema_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterAlter_schema_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitAlter_schema_stmt(this);
		}
	}

	public final Alter_schema_stmtContext alter_schema_stmt() throws RecognitionException {
		Alter_schema_stmtContext _localctx = new Alter_schema_stmtContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_alter_schema_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(613);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_sequence_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Alter_sequence_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_sequence_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterAlter_sequence_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitAlter_sequence_stmt(this);
		}
	}

	public final Alter_sequence_stmtContext alter_sequence_stmt() throws RecognitionException {
		Alter_sequence_stmtContext _localctx = new Alter_sequence_stmtContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_alter_sequence_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(615);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_server_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Alter_server_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_server_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterAlter_server_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitAlter_server_stmt(this);
		}
	}

	public final Alter_server_stmtContext alter_server_stmt() throws RecognitionException {
		Alter_server_stmtContext _localctx = new Alter_server_stmtContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_alter_server_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(617);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_statistics_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Alter_statistics_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_statistics_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterAlter_statistics_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitAlter_statistics_stmt(this);
		}
	}

	public final Alter_statistics_stmtContext alter_statistics_stmt() throws RecognitionException {
		Alter_statistics_stmtContext _localctx = new Alter_statistics_stmtContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_alter_statistics_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(619);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_subscription_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Alter_subscription_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_subscription_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterAlter_subscription_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitAlter_subscription_stmt(this);
		}
	}

	public final Alter_subscription_stmtContext alter_subscription_stmt() throws RecognitionException {
		Alter_subscription_stmtContext _localctx = new Alter_subscription_stmtContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_alter_subscription_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(621);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_system_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Alter_system_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_system_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterAlter_system_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitAlter_system_stmt(this);
		}
	}

	public final Alter_system_stmtContext alter_system_stmt() throws RecognitionException {
		Alter_system_stmtContext _localctx = new Alter_system_stmtContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_alter_system_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(623);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_table_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Alter_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterAlter_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitAlter_table_stmt(this);
		}
	}

	public final Alter_table_stmtContext alter_table_stmt() throws RecognitionException {
		Alter_table_stmtContext _localctx = new Alter_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_alter_table_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(625);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_tablespace_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Alter_tablespace_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_tablespace_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterAlter_tablespace_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitAlter_tablespace_stmt(this);
		}
	}

	public final Alter_tablespace_stmtContext alter_tablespace_stmt() throws RecognitionException {
		Alter_tablespace_stmtContext _localctx = new Alter_tablespace_stmtContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_alter_tablespace_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(627);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_text_search_config_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Alter_text_search_config_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_text_search_config_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterAlter_text_search_config_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitAlter_text_search_config_stmt(this);
		}
	}

	public final Alter_text_search_config_stmtContext alter_text_search_config_stmt() throws RecognitionException {
		Alter_text_search_config_stmtContext _localctx = new Alter_text_search_config_stmtContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_alter_text_search_config_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(629);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_text_search_dict_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Alter_text_search_dict_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_text_search_dict_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterAlter_text_search_dict_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitAlter_text_search_dict_stmt(this);
		}
	}

	public final Alter_text_search_dict_stmtContext alter_text_search_dict_stmt() throws RecognitionException {
		Alter_text_search_dict_stmtContext _localctx = new Alter_text_search_dict_stmtContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_alter_text_search_dict_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(631);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_text_search_parser_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Alter_text_search_parser_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_text_search_parser_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterAlter_text_search_parser_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitAlter_text_search_parser_stmt(this);
		}
	}

	public final Alter_text_search_parser_stmtContext alter_text_search_parser_stmt() throws RecognitionException {
		Alter_text_search_parser_stmtContext _localctx = new Alter_text_search_parser_stmtContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_alter_text_search_parser_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(633);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_text_search_template_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Alter_text_search_template_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_text_search_template_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterAlter_text_search_template_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitAlter_text_search_template_stmt(this);
		}
	}

	public final Alter_text_search_template_stmtContext alter_text_search_template_stmt() throws RecognitionException {
		Alter_text_search_template_stmtContext _localctx = new Alter_text_search_template_stmtContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_alter_text_search_template_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(635);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_trigger_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Alter_trigger_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_trigger_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterAlter_trigger_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitAlter_trigger_stmt(this);
		}
	}

	public final Alter_trigger_stmtContext alter_trigger_stmt() throws RecognitionException {
		Alter_trigger_stmtContext _localctx = new Alter_trigger_stmtContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_alter_trigger_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(637);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_type_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Alter_type_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_type_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterAlter_type_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitAlter_type_stmt(this);
		}
	}

	public final Alter_type_stmtContext alter_type_stmt() throws RecognitionException {
		Alter_type_stmtContext _localctx = new Alter_type_stmtContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_alter_type_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(639);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_user_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Alter_user_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_user_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterAlter_user_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitAlter_user_stmt(this);
		}
	}

	public final Alter_user_stmtContext alter_user_stmt() throws RecognitionException {
		Alter_user_stmtContext _localctx = new Alter_user_stmtContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_alter_user_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(641);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_user_mapping_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Alter_user_mapping_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_user_mapping_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterAlter_user_mapping_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitAlter_user_mapping_stmt(this);
		}
	}

	public final Alter_user_mapping_stmtContext alter_user_mapping_stmt() throws RecognitionException {
		Alter_user_mapping_stmtContext _localctx = new Alter_user_mapping_stmtContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_alter_user_mapping_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(643);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_view_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Alter_view_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_view_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterAlter_view_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitAlter_view_stmt(this);
		}
	}

	public final Alter_view_stmtContext alter_view_stmt() throws RecognitionException {
		Alter_view_stmtContext _localctx = new Alter_view_stmtContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_alter_view_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(645);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Analyze_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Analyze_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_analyze_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterAnalyze_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitAnalyze_stmt(this);
		}
	}

	public final Analyze_stmtContext analyze_stmt() throws RecognitionException {
		Analyze_stmtContext _localctx = new Analyze_stmtContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_analyze_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(647);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Close_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Close_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_close_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterClose_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitClose_stmt(this);
		}
	}

	public final Close_stmtContext close_stmt() throws RecognitionException {
		Close_stmtContext _localctx = new Close_stmtContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_close_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(649);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cluster_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Cluster_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cluster_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterCluster_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitCluster_stmt(this);
		}
	}

	public final Cluster_stmtContext cluster_stmt() throws RecognitionException {
		Cluster_stmtContext _localctx = new Cluster_stmtContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_cluster_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(651);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Comment_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Comment_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterComment_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitComment_stmt(this);
		}
	}

	public final Comment_stmtContext comment_stmt() throws RecognitionException {
		Comment_stmtContext _localctx = new Comment_stmtContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_comment_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(653);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Commit_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Commit_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commit_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterCommit_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitCommit_stmt(this);
		}
	}

	public final Commit_stmtContext commit_stmt() throws RecognitionException {
		Commit_stmtContext _localctx = new Commit_stmtContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_commit_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(655);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Commit_prepared_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Commit_prepared_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commit_prepared_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterCommit_prepared_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitCommit_prepared_stmt(this);
		}
	}

	public final Commit_prepared_stmtContext commit_prepared_stmt() throws RecognitionException {
		Commit_prepared_stmtContext _localctx = new Commit_prepared_stmtContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_commit_prepared_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(657);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Copy_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Copy_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_copy_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterCopy_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitCopy_stmt(this);
		}
	}

	public final Copy_stmtContext copy_stmt() throws RecognitionException {
		Copy_stmtContext _localctx = new Copy_stmtContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_copy_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(659);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_stmtContext extends ParserRuleContext {
		public Create_access_method_stmtContext create_access_method_stmt() {
			return getRuleContext(Create_access_method_stmtContext.class,0);
		}
		public Create_aggregate_stmtContext create_aggregate_stmt() {
			return getRuleContext(Create_aggregate_stmtContext.class,0);
		}
		public Create_cast_stmtContext create_cast_stmt() {
			return getRuleContext(Create_cast_stmtContext.class,0);
		}
		public Create_collation_stmtContext create_collation_stmt() {
			return getRuleContext(Create_collation_stmtContext.class,0);
		}
		public Create_conversion_stmtContext create_conversion_stmt() {
			return getRuleContext(Create_conversion_stmtContext.class,0);
		}
		public Create_database_stmtContext create_database_stmt() {
			return getRuleContext(Create_database_stmtContext.class,0);
		}
		public Create_domain_stmtContext create_domain_stmt() {
			return getRuleContext(Create_domain_stmtContext.class,0);
		}
		public Create_event_trigger_stmtContext create_event_trigger_stmt() {
			return getRuleContext(Create_event_trigger_stmtContext.class,0);
		}
		public Create_foreign_data_stmtContext create_foreign_data_stmt() {
			return getRuleContext(Create_foreign_data_stmtContext.class,0);
		}
		public Create_foreign_table_stmtContext create_foreign_table_stmt() {
			return getRuleContext(Create_foreign_table_stmtContext.class,0);
		}
		public Create_function_stmtContext create_function_stmt() {
			return getRuleContext(Create_function_stmtContext.class,0);
		}
		public Create_group_stmtContext create_group_stmt() {
			return getRuleContext(Create_group_stmtContext.class,0);
		}
		public Create_index_stmtContext create_index_stmt() {
			return getRuleContext(Create_index_stmtContext.class,0);
		}
		public Create_language_stmtContext create_language_stmt() {
			return getRuleContext(Create_language_stmtContext.class,0);
		}
		public Create_materialized_view_stmtContext create_materialized_view_stmt() {
			return getRuleContext(Create_materialized_view_stmtContext.class,0);
		}
		public Create_operator_stmtContext create_operator_stmt() {
			return getRuleContext(Create_operator_stmtContext.class,0);
		}
		public Create_operator_class_stmtContext create_operator_class_stmt() {
			return getRuleContext(Create_operator_class_stmtContext.class,0);
		}
		public Create_operator_family_stmtContext create_operator_family_stmt() {
			return getRuleContext(Create_operator_family_stmtContext.class,0);
		}
		public Create_policy_stmtContext create_policy_stmt() {
			return getRuleContext(Create_policy_stmtContext.class,0);
		}
		public Create_role_stmtContext create_role_stmt() {
			return getRuleContext(Create_role_stmtContext.class,0);
		}
		public Create_rule_stmtContext create_rule_stmt() {
			return getRuleContext(Create_rule_stmtContext.class,0);
		}
		public Create_schema_stmtContext create_schema_stmt() {
			return getRuleContext(Create_schema_stmtContext.class,0);
		}
		public Create_sequence_stmtContext create_sequence_stmt() {
			return getRuleContext(Create_sequence_stmtContext.class,0);
		}
		public Create_server_stmtContext create_server_stmt() {
			return getRuleContext(Create_server_stmtContext.class,0);
		}
		public Create_statistics_stmtContext create_statistics_stmt() {
			return getRuleContext(Create_statistics_stmtContext.class,0);
		}
		public Create_subscription_stmtContext create_subscription_stmt() {
			return getRuleContext(Create_subscription_stmtContext.class,0);
		}
		public Create_table_stmtContext create_table_stmt() {
			return getRuleContext(Create_table_stmtContext.class,0);
		}
		public Create_table_as_stmtContext create_table_as_stmt() {
			return getRuleContext(Create_table_as_stmtContext.class,0);
		}
		public Create_tablespace_stmtContext create_tablespace_stmt() {
			return getRuleContext(Create_tablespace_stmtContext.class,0);
		}
		public Create_text_search_config_stmtContext create_text_search_config_stmt() {
			return getRuleContext(Create_text_search_config_stmtContext.class,0);
		}
		public Create_text_search_dict_stmtContext create_text_search_dict_stmt() {
			return getRuleContext(Create_text_search_dict_stmtContext.class,0);
		}
		public Create_text_search_parser_stmtContext create_text_search_parser_stmt() {
			return getRuleContext(Create_text_search_parser_stmtContext.class,0);
		}
		public Create_text_search_template_stmtContext create_text_search_template_stmt() {
			return getRuleContext(Create_text_search_template_stmtContext.class,0);
		}
		public Create_transform_stmtContext create_transform_stmt() {
			return getRuleContext(Create_transform_stmtContext.class,0);
		}
		public Create_trigger_stmtContext create_trigger_stmt() {
			return getRuleContext(Create_trigger_stmtContext.class,0);
		}
		public Create_type_stmtContext create_type_stmt() {
			return getRuleContext(Create_type_stmtContext.class,0);
		}
		public Create_user_stmtContext create_user_stmt() {
			return getRuleContext(Create_user_stmtContext.class,0);
		}
		public Create_user_mapping_stmtContext create_user_mapping_stmt() {
			return getRuleContext(Create_user_mapping_stmtContext.class,0);
		}
		public Create_view_stmtContext create_view_stmt() {
			return getRuleContext(Create_view_stmtContext.class,0);
		}
		public Create_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterCreate_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitCreate_stmt(this);
		}
	}

	public final Create_stmtContext create_stmt() throws RecognitionException {
		Create_stmtContext _localctx = new Create_stmtContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_create_stmt);
		try {
			setState(700);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(661);
				create_access_method_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(662);
				create_aggregate_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(663);
				create_cast_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(664);
				create_collation_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(665);
				create_conversion_stmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(666);
				create_database_stmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(667);
				create_domain_stmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(668);
				create_event_trigger_stmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(669);
				create_foreign_data_stmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(670);
				create_foreign_table_stmt();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(671);
				create_function_stmt();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(672);
				create_group_stmt();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(673);
				create_index_stmt();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(674);
				create_language_stmt();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(675);
				create_materialized_view_stmt();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(676);
				create_operator_stmt();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(677);
				create_operator_class_stmt();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(678);
				create_operator_family_stmt();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(679);
				create_policy_stmt();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(680);
				create_role_stmt();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(681);
				create_rule_stmt();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(682);
				create_schema_stmt();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(683);
				create_sequence_stmt();
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(684);
				create_server_stmt();
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(685);
				create_statistics_stmt();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(686);
				create_subscription_stmt();
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(687);
				create_table_stmt();
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(688);
				create_table_as_stmt();
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(689);
				create_tablespace_stmt();
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(690);
				create_text_search_config_stmt();
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(691);
				create_text_search_dict_stmt();
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(692);
				create_text_search_parser_stmt();
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(693);
				create_text_search_template_stmt();
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(694);
				create_transform_stmt();
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(695);
				create_trigger_stmt();
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(696);
				create_type_stmt();
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(697);
				create_user_stmt();
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(698);
				create_user_mapping_stmt();
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(699);
				create_view_stmt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_access_method_stmtContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(PostgreSQLParser.CREATE, 0); }
		public TerminalNode ACCESS() { return getToken(PostgreSQLParser.ACCESS, 0); }
		public TerminalNode METHOD() { return getToken(PostgreSQLParser.METHOD, 0); }
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public TerminalNode TYPE() { return getToken(PostgreSQLParser.TYPE, 0); }
		public TerminalNode INDEX() { return getToken(PostgreSQLParser.INDEX, 0); }
		public TerminalNode HANDLER() { return getToken(PostgreSQLParser.HANDLER, 0); }
		public Create_access_method_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_access_method_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterCreate_access_method_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitCreate_access_method_stmt(this);
		}
	}

	public final Create_access_method_stmtContext create_access_method_stmt() throws RecognitionException {
		Create_access_method_stmtContext _localctx = new Create_access_method_stmtContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_create_access_method_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(702);
			match(CREATE);
			setState(703);
			match(ACCESS);
			setState(704);
			match(METHOD);
			setState(705);
			name();
			setState(706);
			match(TYPE);
			setState(707);
			match(INDEX);
			setState(708);
			match(HANDLER);
			setState(709);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_aggregate_stmtContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(PostgreSQLParser.CREATE, 0); }
		public TerminalNode AGGREGATE() { return getToken(PostgreSQLParser.AGGREGATE, 0); }
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<TerminalNode> OPEN_PAREN() { return getTokens(PostgreSQLParser.OPEN_PAREN); }
		public TerminalNode OPEN_PAREN(int i) {
			return getToken(PostgreSQLParser.OPEN_PAREN, i);
		}
		public List<Type_listContext> type_list() {
			return getRuleContexts(Type_listContext.class);
		}
		public Type_listContext type_list(int i) {
			return getRuleContext(Type_listContext.class,i);
		}
		public List<TerminalNode> CLOSE_PAREN() { return getTokens(PostgreSQLParser.CLOSE_PAREN); }
		public TerminalNode CLOSE_PAREN(int i) {
			return getToken(PostgreSQLParser.CLOSE_PAREN, i);
		}
		public TerminalNode SFUNC() { return getToken(PostgreSQLParser.SFUNC, 0); }
		public List<TerminalNode> EQUAL() { return getTokens(PostgreSQLParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(PostgreSQLParser.EQUAL, i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PostgreSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PostgreSQLParser.COMMA, i);
		}
		public TerminalNode STYPE() { return getToken(PostgreSQLParser.STYPE, 0); }
		public TerminalNode SSPACE() { return getToken(PostgreSQLParser.SSPACE, 0); }
		public List<TerminalNode> INTEGER_LITERAL() { return getTokens(PostgreSQLParser.INTEGER_LITERAL); }
		public TerminalNode INTEGER_LITERAL(int i) {
			return getToken(PostgreSQLParser.INTEGER_LITERAL, i);
		}
		public TerminalNode FINALFUNC() { return getToken(PostgreSQLParser.FINALFUNC, 0); }
		public TerminalNode FINALFUNC_EXTRA() { return getToken(PostgreSQLParser.FINALFUNC_EXTRA, 0); }
		public TerminalNode COMBINEFUNC() { return getToken(PostgreSQLParser.COMBINEFUNC, 0); }
		public TerminalNode SERIALFUNC() { return getToken(PostgreSQLParser.SERIALFUNC, 0); }
		public TerminalNode DESERIALFUNC() { return getToken(PostgreSQLParser.DESERIALFUNC, 0); }
		public TerminalNode INITCOND() { return getToken(PostgreSQLParser.INITCOND, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode MSFUNC() { return getToken(PostgreSQLParser.MSFUNC, 0); }
		public TerminalNode MINVFUNC() { return getToken(PostgreSQLParser.MINVFUNC, 0); }
		public TerminalNode MSTYPE() { return getToken(PostgreSQLParser.MSTYPE, 0); }
		public TerminalNode MSSPACE() { return getToken(PostgreSQLParser.MSSPACE, 0); }
		public TerminalNode MFINALFUNC() { return getToken(PostgreSQLParser.MFINALFUNC, 0); }
		public TerminalNode MFINALFUNC_EXTRA() { return getToken(PostgreSQLParser.MFINALFUNC_EXTRA, 0); }
		public TerminalNode MINITCOND() { return getToken(PostgreSQLParser.MINITCOND, 0); }
		public TerminalNode SORTOP() { return getToken(PostgreSQLParser.SORTOP, 0); }
		public TerminalNode PARALLEL() { return getToken(PostgreSQLParser.PARALLEL, 0); }
		public List<TerminalNode> IN() { return getTokens(PostgreSQLParser.IN); }
		public TerminalNode IN(int i) {
			return getToken(PostgreSQLParser.IN, i);
		}
		public List<TerminalNode> VARIADIC() { return getTokens(PostgreSQLParser.VARIADIC); }
		public TerminalNode VARIADIC(int i) {
			return getToken(PostgreSQLParser.VARIADIC, i);
		}
		public TerminalNode SAFE() { return getToken(PostgreSQLParser.SAFE, 0); }
		public TerminalNode RESTRICTED() { return getToken(PostgreSQLParser.RESTRICTED, 0); }
		public TerminalNode UNSAFE() { return getToken(PostgreSQLParser.UNSAFE, 0); }
		public TerminalNode ORDER() { return getToken(PostgreSQLParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(PostgreSQLParser.BY, 0); }
		public TerminalNode HYPOTHETICAL() { return getToken(PostgreSQLParser.HYPOTHETICAL, 0); }
		public TerminalNode BASETYPE() { return getToken(PostgreSQLParser.BASETYPE, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Create_aggregate_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_aggregate_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterCreate_aggregate_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitCreate_aggregate_stmt(this);
		}
	}

	public final Create_aggregate_stmtContext create_aggregate_stmt() throws RecognitionException {
		Create_aggregate_stmtContext _localctx = new Create_aggregate_stmtContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_create_aggregate_stmt);
		int _la;
		try {
			setState(993);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(711);
				match(CREATE);
				setState(712);
				match(AGGREGATE);
				setState(713);
				name();
				setState(714);
				match(OPEN_PAREN);
				setState(716);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IN || _la==VARIADIC) {
					{
					setState(715);
					_la = _input.LA(1);
					if ( !(_la==IN || _la==VARIADIC) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(719);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(718);
					name();
					}
					break;
				}
				setState(721);
				type_list();
				setState(722);
				match(CLOSE_PAREN);
				setState(723);
				match(OPEN_PAREN);
				setState(724);
				match(SFUNC);
				setState(725);
				match(EQUAL);
				setState(726);
				identifier(0);
				setState(727);
				match(COMMA);
				setState(728);
				match(STYPE);
				setState(729);
				match(EQUAL);
				setState(730);
				identifier(0);
				setState(735);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(731);
					match(COMMA);
					setState(732);
					match(SSPACE);
					setState(733);
					match(EQUAL);
					setState(734);
					match(INTEGER_LITERAL);
					}
					break;
				}
				setState(741);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(737);
					match(COMMA);
					setState(738);
					match(FINALFUNC);
					setState(739);
					match(EQUAL);
					setState(740);
					identifier(0);
					}
					break;
				}
				setState(745);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(743);
					match(COMMA);
					setState(744);
					match(FINALFUNC_EXTRA);
					}
					break;
				}
				setState(751);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(747);
					match(COMMA);
					setState(748);
					match(COMBINEFUNC);
					setState(749);
					match(EQUAL);
					setState(750);
					identifier(0);
					}
					break;
				}
				setState(757);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(753);
					match(COMMA);
					setState(754);
					match(SERIALFUNC);
					setState(755);
					match(EQUAL);
					setState(756);
					identifier(0);
					}
					break;
				}
				setState(763);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(759);
					match(COMMA);
					setState(760);
					match(DESERIALFUNC);
					setState(761);
					match(EQUAL);
					setState(762);
					identifier(0);
					}
					break;
				}
				setState(769);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(765);
					match(COMMA);
					setState(766);
					match(INITCOND);
					setState(767);
					match(EQUAL);
					setState(768);
					expr(0);
					}
					break;
				}
				setState(775);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(771);
					match(COMMA);
					setState(772);
					match(MSFUNC);
					setState(773);
					match(EQUAL);
					setState(774);
					identifier(0);
					}
					break;
				}
				setState(781);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(777);
					match(COMMA);
					setState(778);
					match(MINVFUNC);
					setState(779);
					match(EQUAL);
					setState(780);
					identifier(0);
					}
					break;
				}
				setState(787);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(783);
					match(COMMA);
					setState(784);
					match(MSTYPE);
					setState(785);
					match(EQUAL);
					setState(786);
					identifier(0);
					}
					break;
				}
				setState(793);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(789);
					match(COMMA);
					setState(790);
					match(MSSPACE);
					setState(791);
					match(EQUAL);
					setState(792);
					match(INTEGER_LITERAL);
					}
					break;
				}
				setState(799);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(795);
					match(COMMA);
					setState(796);
					match(MFINALFUNC);
					setState(797);
					match(EQUAL);
					setState(798);
					identifier(0);
					}
					break;
				}
				setState(803);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(801);
					match(COMMA);
					setState(802);
					match(MFINALFUNC_EXTRA);
					}
					break;
				}
				setState(809);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(805);
					match(COMMA);
					setState(806);
					match(MINITCOND);
					setState(807);
					match(EQUAL);
					setState(808);
					identifier(0);
					}
					break;
				}
				setState(815);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(811);
					match(COMMA);
					setState(812);
					match(SORTOP);
					setState(813);
					match(EQUAL);
					setState(814);
					identifier(0);
					}
					break;
				}
				setState(821);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(817);
					match(COMMA);
					setState(818);
					match(PARALLEL);
					setState(819);
					match(EQUAL);
					setState(820);
					_la = _input.LA(1);
					if ( !(((((_la - 653)) & ~0x3f) == 0 && ((1L << (_la - 653)) & ((1L << (SAFE - 653)) | (1L << (RESTRICTED - 653)) | (1L << (UNSAFE - 653)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(823);
				match(CLOSE_PAREN);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(825);
				match(CREATE);
				setState(826);
				match(AGGREGATE);
				setState(827);
				name();
				setState(828);
				match(OPEN_PAREN);
				setState(836);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHITESPACE) | (1L << A_) | (1L << ABORT) | (1L << ABS) | (1L << ABSOLUTE) | (1L << ACCESS) | (1L << ACTION) | (1L << ADA) | (1L << ADD) | (1L << ADMIN) | (1L << AFTER) | (1L << AGGREGATE) | (1L << ALLOCATE) | (1L << ALSO) | (1L << ALTER) | (1L << ALWAYS) | (1L << ARE) | (1L << ASENSITIVE) | (1L << ASSERTION) | (1L << ASSIGNMENT) | (1L << AT) | (1L << ATOMIC) | (1L << ATTRIBUTE) | (1L << ATTRIBUTES) | (1L << AVG) | (1L << BACKWARD) | (1L << BEFORE) | (1L << BEGIN) | (1L << BERNOULLI) | (1L << BETWEEN) | (1L << BIGINT) | (1L << BIT) | (1L << BIT_LENGTH) | (1L << BLOB) | (1L << BOOLEAN) | (1L << BREADTH) | (1L << BY) | (1L << C_) | (1L << CACHE) | (1L << CALL) | (1L << CALLED) | (1L << CARDINALITY) | (1L << CASCADE) | (1L << CASCADED) | (1L << CATALOG))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CATALOG_NAME - 64)) | (1L << (CEIL - 64)) | (1L << (CEILING - 64)) | (1L << (CHAIN - 64)) | (1L << (CHAR - 64)) | (1L << (CHARACTER - 64)) | (1L << (CHARACTERISTICS - 64)) | (1L << (CHARACTERS - 64)) | (1L << (CHARACTER_LENGTH - 64)) | (1L << (CHARACTER_SET_CATALOG - 64)) | (1L << (CHARACTER_SET_NAME - 64)) | (1L << (CHARACTER_SET_SCHEMA - 64)) | (1L << (CHAR_LENGTH - 64)) | (1L << (CHECKPOINT - 64)) | (1L << (CLASS - 64)) | (1L << (CLASS_ORIGIN - 64)) | (1L << (CLOB - 64)) | (1L << (CLOSE - 64)) | (1L << (CLUSTER - 64)) | (1L << (COALESCE - 64)) | (1L << (COBOL - 64)) | (1L << (COLLATION_CATALOG - 64)) | (1L << (COLLATION_NAME - 64)) | (1L << (COLLATION_SCHEMA - 64)) | (1L << (COLLECT - 64)) | (1L << (COLUMN_NAME - 64)) | (1L << (COMMAND_FUNCTION - 64)) | (1L << (COMMAND_FUNCTION_CODE - 64)) | (1L << (COMMENT - 64)) | (1L << (COMMIT - 64)) | (1L << (COMMITTED - 64)) | (1L << (CONDITION - 64)) | (1L << (CONDITION_NUMBER - 64)) | (1L << (CONNECT - 64)) | (1L << (CONNECTION - 64)) | (1L << (CONNECTION_NAME - 64)) | (1L << (CONSTRAINTS - 64)) | (1L << (CONSTRAINT_CATALOG - 64)) | (1L << (CONSTRAINT_NAME - 64)) | (1L << (CONSTRAINT_SCHEMA - 64)) | (1L << (CONSTRUCTOR - 64)) | (1L << (CONTAINS - 64)) | (1L << (CONTINUE - 64)) | (1L << (CONVERSION - 64)) | (1L << (CONVERT - 64)) | (1L << (COPY - 64)) | (1L << (CORR - 64)) | (1L << (CORRESPONDING - 64)) | (1L << (COUNT - 64)) | (1L << (COVAR_POP - 64)) | (1L << (COVAR_SAMP - 64)) | (1L << (CSV - 64)) | (1L << (CUBE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (CUME_DIST - 128)) | (1L << (CURRENT - 128)) | (1L << (CURRENT_DEFAULT_TRANSFORM_GROUP - 128)) | (1L << (CURRENT_PATH - 128)) | (1L << (CURRENT_TRANSFORM_GROUP_FOR_TYPE - 128)) | (1L << (CURSOR - 128)) | (1L << (CURSOR_NAME - 128)) | (1L << (CYCLE - 128)) | (1L << (DATA - 128)) | (1L << (DATABASE - 128)) | (1L << (DATE - 128)) | (1L << (DATETIME_INTERVAL_CODE - 128)) | (1L << (DATETIME_INTERVAL_PRECISION - 128)) | (1L << (DAY - 128)) | (1L << (DEALLOCATE - 128)) | (1L << (DEC - 128)) | (1L << (DECIMAL - 128)) | (1L << (DECLARE - 128)) | (1L << (DEFAULTS - 128)) | (1L << (DEFERRED - 128)) | (1L << (DEFINED - 128)) | (1L << (DEFINER - 128)) | (1L << (DEGREE - 128)) | (1L << (DELETE - 128)) | (1L << (DELIMITER - 128)) | (1L << (DELIMITERS - 128)) | (1L << (DENSE_RANK - 128)) | (1L << (DEPTH - 128)) | (1L << (DEREF - 128)) | (1L << (DERIVED - 128)) | (1L << (DESCRIBE - 128)) | (1L << (DESCRIPTOR - 128)) | (1L << (DETERMINISTIC - 128)) | (1L << (DIAGNOSTICS - 128)) | (1L << (DICTIONARY - 128)) | (1L << (DISCONNECT - 128)) | (1L << (DISPATCH - 128)) | (1L << (DOMAIN - 128)) | (1L << (DOUBLE - 128)) | (1L << (DROP - 128)) | (1L << (DYNAMIC - 128)) | (1L << (DYNAMIC_FUNCTION - 128)) | (1L << (DYNAMIC_FUNCTION_CODE - 128)) | (1L << (EACH - 128)) | (1L << (ELEMENT - 128)) | (1L << (ENCODING - 128)) | (1L << (ENCRYPTED - 128)) | (1L << (END - 128)) | (1L << (EQUALS - 128)) | (1L << (ESCAPE - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (EVERY - 192)) | (1L << (EXCEPTION - 192)) | (1L << (EXCLUDE - 192)) | (1L << (EXCLUDING - 192)) | (1L << (EXCLUSIVE - 192)) | (1L << (EXEC - 192)) | (1L << (EXECUTE - 192)) | (1L << (EXISTS - 192)) | (1L << (EXP - 192)) | (1L << (EXPLAIN - 192)) | (1L << (EXTERNAL - 192)) | (1L << (EXTRACT - 192)) | (1L << (FILTER - 192)) | (1L << (FINAL - 192)) | (1L << (FIRST - 192)) | (1L << (FLOAT - 192)) | (1L << (FLOOR - 192)) | (1L << (FOLLOWING - 192)) | (1L << (FORCE - 192)) | (1L << (FORTRAN - 192)) | (1L << (FORWARD - 192)) | (1L << (FOUND - 192)) | (1L << (FREE - 192)) | (1L << (FUNCTION - 192)) | (1L << (FUSION - 192)) | (1L << (G_ - 192)) | (1L << (GENERAL - 192)) | (1L << (GENERATED - 192)) | (1L << (GET - 192)) | (1L << (GLOBAL - 192)) | (1L << (GO - 192)) | (1L << (GOTO - 192)) | (1L << (GRANTED - 192)) | (1L << (GROUPING - 192)) | (1L << (HANDLER - 192)) | (1L << (HIERARCHY - 192)) | (1L << (HOLD - 192)) | (1L << (HOUR - 192)) | (1L << (IDENTITY - 192)) | (1L << (IGNORE - 192)) | (1L << (IMMEDIATE - 192)) | (1L << (IMMUTABLE - 192)) | (1L << (IMPLEMENTATION - 192)) | (1L << (IMPLICIT - 192)) | (1L << (IN - 192)) | (1L << (INCLUDING - 192)) | (1L << (INCREMENT - 192)) | (1L << (INDEX - 192)) | (1L << (INDICATOR - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (INHERITS - 256)) | (1L << (INOUT - 256)) | (1L << (INPUT - 256)) | (1L << (INSENSITIVE - 256)) | (1L << (INSERT - 256)) | (1L << (INSTANCE - 256)) | (1L << (INSTANTIABLE - 256)) | (1L << (INSTEAD - 256)) | (1L << (INT - 256)) | (1L << (INTEGER - 256)) | (1L << (INTERSECTION - 256)) | (1L << (INTERVAL - 256)) | (1L << (INVOKER - 256)) | (1L << (ISOLATION - 256)) | (1L << (KEY - 256)) | (1L << (KEY_MEMBER - 256)) | (1L << (KEY_TYPE - 256)) | (1L << (LANGUAGE - 256)) | (1L << (LARGE - 256)) | (1L << (LAST - 256)) | (1L << (LEFT - 256)) | (1L << (LENGTH - 256)) | (1L << (LEVEL - 256)) | (1L << (LISTEN - 256)) | (1L << (LN - 256)) | (1L << (LOAD - 256)) | (1L << (LOCAL - 256)) | (1L << (LOCATION - 256)) | (1L << (LOCATOR - 256)) | (1L << (LOCK - 256)) | (1L << (LOCKED - 256)) | (1L << (LOWER - 256)) | (1L << (M_ - 256)) | (1L << (MAP - 256)) | (1L << (MATCH - 256)) | (1L << (MATCHED - 256)) | (1L << (MAX - 256)) | (1L << (MAXVALUE - 256)) | (1L << (MEMBER - 256)) | (1L << (MERGE - 256)) | (1L << (MESSAGE_LENGTH - 256)) | (1L << (MESSAGE_OCTET_LENGTH - 256)) | (1L << (MESSAGE_TEXT - 256)) | (1L << (METHOD - 256)) | (1L << (MIN - 256)) | (1L << (MINUTE - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (MINVALUE - 320)) | (1L << (MOD - 320)) | (1L << (MODE - 320)) | (1L << (MODIFIES - 320)) | (1L << (MODULE - 320)) | (1L << (MONTH - 320)) | (1L << (MORE_ - 320)) | (1L << (MOVE - 320)) | (1L << (MULTISET - 320)) | (1L << (MUMPS - 320)) | (1L << (NAME - 320)) | (1L << (NAMES - 320)) | (1L << (NATIONAL - 320)) | (1L << (NCHAR - 320)) | (1L << (NCLOB - 320)) | (1L << (NESTING - 320)) | (1L << (NEW - 320)) | (1L << (NEXT - 320)) | (1L << (NO - 320)) | (1L << (NONE - 320)) | (1L << (NORMALIZE - 320)) | (1L << (NORMALIZED - 320)) | (1L << (NOTHING - 320)) | (1L << (NOTIFY - 320)) | (1L << (NOWAIT - 320)) | (1L << (NULLABLE - 320)) | (1L << (NULLIF - 320)) | (1L << (NULLS - 320)) | (1L << (NUMBER - 320)) | (1L << (NUMERIC - 320)) | (1L << (OBJECT - 320)) | (1L << (OCTETS - 320)) | (1L << (OCTET_LENGTH - 320)) | (1L << (OF - 320)) | (1L << (OFF - 320)) | (1L << (OIDS - 320)) | (1L << (OLD - 320)) | (1L << (OPEN - 320)) | (1L << (OPERATOR - 320)) | (1L << (OPTION - 320)) | (1L << (OPTIONS - 320)) | (1L << (ORDERING - 320)) | (1L << (ORDINALITY - 320)) | (1L << (OTHERS - 320)) | (1L << (OUT - 320)) | (1L << (OUTPUT - 320)) | (1L << (OVER - 320)) | (1L << (OVERLAY - 320)) | (1L << (OVERRIDING - 320)))) != 0) || ((((_la - 384)) & ~0x3f) == 0 && ((1L << (_la - 384)) & ((1L << (OWNER - 384)) | (1L << (PAD - 384)) | (1L << (PARAMETER - 384)) | (1L << (PARAMETER_MODE - 384)) | (1L << (PARAMETER_NAME - 384)) | (1L << (PARAMETER_ORDINAL_POSITION - 384)) | (1L << (PARAMETER_SPECIFIC_CATALOG - 384)) | (1L << (PARAMETER_SPECIFIC_NAME - 384)) | (1L << (PARAMETER_SPECIFIC_SCHEMA - 384)) | (1L << (PARTIAL - 384)) | (1L << (PARTITION - 384)) | (1L << (PASCAL - 384)) | (1L << (PASSWORD - 384)) | (1L << (PATH - 384)) | (1L << (PERCENTILE_CONT - 384)) | (1L << (PERCENTILE_DISC - 384)) | (1L << (PERCENT_RANK - 384)) | (1L << (PLI - 384)) | (1L << (POSITION - 384)) | (1L << (POWER - 384)) | (1L << (PRECEDING - 384)) | (1L << (PRECISION - 384)) | (1L << (PREPARE - 384)) | (1L << (PRESERVE - 384)) | (1L << (PRIOR - 384)) | (1L << (PRIVILEGES - 384)) | (1L << (PROCEDURAL - 384)) | (1L << (PROCEDURE - 384)) | (1L << (PUBLIC - 384)) | (1L << (QUOTE - 384)) | (1L << (RANGE - 384)) | (1L << (RANK - 384)) | (1L << (READ - 384)) | (1L << (READS - 384)) | (1L << (REAL - 384)) | (1L << (RECHECK - 384)) | (1L << (RECURSIVE - 384)) | (1L << (REF - 384)) | (1L << (REFERENCING - 384)) | (1L << (REGR_AVGX - 384)) | (1L << (REGR_AVGY - 384)) | (1L << (REGR_COUNT - 384)) | (1L << (REGR_INTERCEPT - 384)) | (1L << (REGR_SLOPE - 384)) | (1L << (REGR_SXX - 384)) | (1L << (REGR_SXY - 384)) | (1L << (REGR_SYY - 384)) | (1L << (REINDEX - 384)) | (1L << (RELATIVE - 384)) | (1L << (RELEASE - 384)) | (1L << (RENAME - 384)) | (1L << (REPEATABLE - 384)) | (1L << (REPLACE - 384)) | (1L << (RESET - 384)) | (1L << (RESTART - 384)) | (1L << (RESTRICT - 384)))) != 0) || ((((_la - 448)) & ~0x3f) == 0 && ((1L << (_la - 448)) & ((1L << (RESULT - 448)) | (1L << (RETURN - 448)) | (1L << (RETURNED_CARDINALITY - 448)) | (1L << (RETURNED_LENGTH - 448)) | (1L << (RETURNED_OCTET_LENGTH - 448)) | (1L << (RETURNED_SQLSTATE - 448)) | (1L << (RETURNS - 448)) | (1L << (REVOKE - 448)) | (1L << (RIGHT - 448)) | (1L << (ROLE - 448)) | (1L << (ROLLBACK - 448)) | (1L << (ROLLUP - 448)) | (1L << (ROUTINE - 448)) | (1L << (ROUTINE_CATALOG - 448)) | (1L << (ROUTINE_NAME - 448)) | (1L << (ROUTINE_SCHEMA - 448)) | (1L << (ROW - 448)) | (1L << (ROWS - 448)) | (1L << (ROW_COUNT - 448)) | (1L << (ROW_NUMBER - 448)) | (1L << (RULE - 448)) | (1L << (SAVEPOINT - 448)) | (1L << (SCALE - 448)) | (1L << (SCHEMA - 448)) | (1L << (SCHEMA_NAME - 448)) | (1L << (SCOPE - 448)) | (1L << (SCOPE_CATALOG - 448)) | (1L << (SCOPE_NAME - 448)) | (1L << (SCOPE_SCHEMA - 448)) | (1L << (SCROLL - 448)) | (1L << (SEARCH - 448)) | (1L << (SECOND - 448)) | (1L << (SECTION - 448)) | (1L << (SECURITY - 448)) | (1L << (SELF - 448)) | (1L << (SENSITIVE - 448)) | (1L << (SEQUENCE - 448)) | (1L << (SERIALIZABLE - 448)) | (1L << (SERVER_NAME - 448)) | (1L << (SESSION - 448)) | (1L << (SET - 448)) | (1L << (SETOF - 448)) | (1L << (SETS - 448)) | (1L << (SHARE - 448)) | (1L << (SHOW - 448)) | (1L << (SIMPLE - 448)) | (1L << (SIZE - 448)) | (1L << (SMALLINT - 448)) | (1L << (SOURCE - 448)) | (1L << (SPACE - 448)) | (1L << (SPECIFIC - 448)) | (1L << (SPECIFICTYPE - 448)) | (1L << (SPECIFIC_NAME - 448)) | (1L << (SQL - 448)) | (1L << (SQLCODE - 448)) | (1L << (SQLERROR - 448)) | (1L << (SQLEXCEPTION - 448)) | (1L << (SQLSTATE - 448)) | (1L << (SQLWARNING - 448)))) != 0) || ((((_la - 512)) & ~0x3f) == 0 && ((1L << (_la - 512)) & ((1L << (SQRT - 512)) | (1L << (STABLE - 512)) | (1L << (START - 512)) | (1L << (STATE - 512)) | (1L << (STATEMENT - 512)) | (1L << (STATIC - 512)) | (1L << (STATISTICS - 512)) | (1L << (STDDEV_POP - 512)) | (1L << (STDDEV_SAMP - 512)) | (1L << (STDIN - 512)) | (1L << (STDOUT - 512)) | (1L << (STORAGE - 512)) | (1L << (STRICT - 512)) | (1L << (STRUCTURE - 512)) | (1L << (STYLE - 512)) | (1L << (SUBCLASS_ORIGIN - 512)) | (1L << (SUBMULTISET - 512)) | (1L << (SUBSTRING - 512)) | (1L << (SUM - 512)) | (1L << (SYSID - 512)) | (1L << (SYSTEM - 512)) | (1L << (SYSTEM_USER - 512)) | (1L << (TABLESPACE - 512)) | (1L << (TABLE_NAME - 512)) | (1L << (TEMP - 512)) | (1L << (TEMPLATE - 512)) | (1L << (TEMPORARY - 512)) | (1L << (TIES - 512)) | (1L << (TIME - 512)) | (1L << (TIME_TZ - 512)) | (1L << (TIMESTAMP - 512)) | (1L << (TIMESTAMP_TZ - 512)) | (1L << (TIMEZONE_HOUR - 512)) | (1L << (TIMEZONE_MINUTE - 512)) | (1L << (TOP_LEVEL_COUNT - 512)) | (1L << (TRANSACTION - 512)) | (1L << (TRANSACTIONS_COMMITTED - 512)) | (1L << (TRANSACTIONS_ROLLED_BACK - 512)) | (1L << (TRANSACTION_ACTIVE - 512)) | (1L << (TRANSFORM - 512)) | (1L << (TRANSFORMS - 512)) | (1L << (TRANSLATE - 512)) | (1L << (TRANSLATION - 512)) | (1L << (TREAT - 512)) | (1L << (TRIGGER - 512)) | (1L << (TRIGGER_CATALOG - 512)) | (1L << (TRIGGER_NAME - 512)) | (1L << (TRIGGER_SCHEMA - 512)) | (1L << (TRIM - 512)) | (1L << (TRUNCATE - 512)) | (1L << (TRUSTED - 512)) | (1L << (TYPE - 512)) | (1L << (UESCAPE - 512)))) != 0) || ((((_la - 576)) & ~0x3f) == 0 && ((1L << (_la - 576)) & ((1L << (UNBOUNDED - 576)) | (1L << (UNCOMMITTED - 576)) | (1L << (UNDER - 576)) | (1L << (UNENCRYPTED - 576)) | (1L << (UNKNOWN - 576)) | (1L << (UNLISTEN - 576)) | (1L << (UNNAMED - 576)) | (1L << (UNNEST - 576)) | (1L << (UNTIL - 576)) | (1L << (UPDATE - 576)) | (1L << (UPPER - 576)) | (1L << (USAGE - 576)) | (1L << (USER_DEFINED_TYPE_CATALOG - 576)) | (1L << (USER_DEFINED_TYPE_CODE - 576)) | (1L << (USER_DEFINED_TYPE_NAME - 576)) | (1L << (USER_DEFINED_TYPE_SCHEMA - 576)) | (1L << (VACUUM - 576)) | (1L << (VALID - 576)) | (1L << (VALIDATOR - 576)) | (1L << (VALUE - 576)) | (1L << (VALUES - 576)) | (1L << (VARCHAR - 576)) | (1L << (VARIADIC - 576)) | (1L << (VARYING - 576)) | (1L << (VAR_POP - 576)) | (1L << (VAR_SAMP - 576)) | (1L << (VIEW - 576)) | (1L << (VOLATILE - 576)) | (1L << (WHENEVER - 576)) | (1L << (WIDTH_BUCKET - 576)) | (1L << (WITHIN - 576)) | (1L << (WITHOUT - 576)) | (1L << (WORK - 576)) | (1L << (WRITE - 576)) | (1L << (YEAR - 576)) | (1L << (ZONE - 576)))) != 0) || ((((_la - 686)) & ~0x3f) == 0 && ((1L << (_la - 686)) & ((1L << (ABSTIME - 686)) | (1L << (BOOL - 686)) | (1L << (BOX - 686)) | (1L << (FLOAT4 - 686)) | (1L << (FLOAT8 - 686)) | (1L << (INT2 - 686)) | (1L << (INT4 - 686)) | (1L << (INT8 - 686)) | (1L << (JSON - 686)) | (1L << (JSONB - 686)) | (1L << (LINE - 686)) | (1L << (POINT - 686)) | (1L << (RELTIME - 686)) | (1L << (TEXT - 686)) | (1L << (SINGLEQ_STRING_LITERAL - 686)) | (1L << (DOUBLEQ_STRING_LITERAL - 686)) | (1L << (IDENTIFIER - 686)))) != 0)) {
					{
					setState(830);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IN || _la==VARIADIC) {
						{
						setState(829);
						_la = _input.LA(1);
						if ( !(_la==IN || _la==VARIADIC) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					setState(833);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						setState(832);
						name();
						}
						break;
					}
					setState(835);
					type_list();
					}
				}

				setState(838);
				match(ORDER);
				setState(839);
				match(BY);
				setState(841);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IN || _la==VARIADIC) {
					{
					setState(840);
					_la = _input.LA(1);
					if ( !(_la==IN || _la==VARIADIC) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(844);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(843);
					name();
					}
					break;
				}
				setState(846);
				type_list();
				setState(847);
				match(CLOSE_PAREN);
				setState(848);
				match(OPEN_PAREN);
				setState(849);
				match(SFUNC);
				setState(850);
				match(EQUAL);
				setState(851);
				identifier(0);
				setState(852);
				match(COMMA);
				setState(853);
				match(STYPE);
				setState(854);
				match(EQUAL);
				setState(855);
				identifier(0);
				setState(860);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(856);
					match(COMMA);
					setState(857);
					match(SSPACE);
					setState(858);
					match(EQUAL);
					setState(859);
					match(INTEGER_LITERAL);
					}
					break;
				}
				setState(866);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(862);
					match(COMMA);
					setState(863);
					match(FINALFUNC);
					setState(864);
					match(EQUAL);
					setState(865);
					identifier(0);
					}
					break;
				}
				setState(870);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(868);
					match(COMMA);
					setState(869);
					match(FINALFUNC_EXTRA);
					}
					break;
				}
				setState(876);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(872);
					match(COMMA);
					setState(873);
					match(INITCOND);
					setState(874);
					match(EQUAL);
					setState(875);
					expr(0);
					}
					break;
				}
				setState(882);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(878);
					match(COMMA);
					setState(879);
					match(PARALLEL);
					setState(880);
					match(EQUAL);
					setState(881);
					_la = _input.LA(1);
					if ( !(((((_la - 653)) & ~0x3f) == 0 && ((1L << (_la - 653)) & ((1L << (SAFE - 653)) | (1L << (RESTRICTED - 653)) | (1L << (UNSAFE - 653)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(886);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(884);
					match(COMMA);
					setState(885);
					match(HYPOTHETICAL);
					}
				}

				setState(888);
				match(CLOSE_PAREN);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(890);
				match(CREATE);
				setState(891);
				match(AGGREGATE);
				setState(892);
				name();
				setState(893);
				match(OPEN_PAREN);
				setState(894);
				match(BASETYPE);
				setState(895);
				match(EQUAL);
				setState(896);
				type(0);
				setState(897);
				match(COMMA);
				setState(898);
				match(SFUNC);
				setState(899);
				match(EQUAL);
				setState(900);
				identifier(0);
				setState(901);
				match(COMMA);
				setState(902);
				match(STYPE);
				setState(903);
				match(EQUAL);
				setState(904);
				identifier(0);
				setState(909);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(905);
					match(COMMA);
					setState(906);
					match(SSPACE);
					setState(907);
					match(EQUAL);
					setState(908);
					match(INTEGER_LITERAL);
					}
					break;
				}
				setState(915);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(911);
					match(COMMA);
					setState(912);
					match(FINALFUNC);
					setState(913);
					match(EQUAL);
					setState(914);
					identifier(0);
					}
					break;
				}
				setState(919);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(917);
					match(COMMA);
					setState(918);
					match(FINALFUNC_EXTRA);
					}
					break;
				}
				setState(925);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(921);
					match(COMMA);
					setState(922);
					match(COMBINEFUNC);
					setState(923);
					match(EQUAL);
					setState(924);
					identifier(0);
					}
					break;
				}
				setState(931);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(927);
					match(COMMA);
					setState(928);
					match(SERIALFUNC);
					setState(929);
					match(EQUAL);
					setState(930);
					identifier(0);
					}
					break;
				}
				setState(937);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(933);
					match(COMMA);
					setState(934);
					match(DESERIALFUNC);
					setState(935);
					match(EQUAL);
					setState(936);
					identifier(0);
					}
					break;
				}
				setState(943);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(939);
					match(COMMA);
					setState(940);
					match(INITCOND);
					setState(941);
					match(EQUAL);
					setState(942);
					expr(0);
					}
					break;
				}
				setState(949);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(945);
					match(COMMA);
					setState(946);
					match(MSFUNC);
					setState(947);
					match(EQUAL);
					setState(948);
					identifier(0);
					}
					break;
				}
				setState(955);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(951);
					match(COMMA);
					setState(952);
					match(MINVFUNC);
					setState(953);
					match(EQUAL);
					setState(954);
					identifier(0);
					}
					break;
				}
				setState(961);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(957);
					match(COMMA);
					setState(958);
					match(MSTYPE);
					setState(959);
					match(EQUAL);
					setState(960);
					identifier(0);
					}
					break;
				}
				setState(967);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(963);
					match(COMMA);
					setState(964);
					match(MSSPACE);
					setState(965);
					match(EQUAL);
					setState(966);
					match(INTEGER_LITERAL);
					}
					break;
				}
				setState(973);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(969);
					match(COMMA);
					setState(970);
					match(MFINALFUNC);
					setState(971);
					match(EQUAL);
					setState(972);
					identifier(0);
					}
					break;
				}
				setState(977);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(975);
					match(COMMA);
					setState(976);
					match(MFINALFUNC_EXTRA);
					}
					break;
				}
				setState(983);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(979);
					match(COMMA);
					setState(980);
					match(MINITCOND);
					setState(981);
					match(EQUAL);
					setState(982);
					identifier(0);
					}
					break;
				}
				setState(989);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(985);
					match(COMMA);
					setState(986);
					match(SORTOP);
					setState(987);
					match(EQUAL);
					setState(988);
					identifier(0);
					}
				}

				setState(991);
				match(CLOSE_PAREN);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_cast_stmtContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(PostgreSQLParser.CREATE, 0); }
		public TerminalNode CAST() { return getToken(PostgreSQLParser.CAST, 0); }
		public List<TerminalNode> OPEN_PAREN() { return getTokens(PostgreSQLParser.OPEN_PAREN); }
		public TerminalNode OPEN_PAREN(int i) {
			return getToken(PostgreSQLParser.OPEN_PAREN, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> AS() { return getTokens(PostgreSQLParser.AS); }
		public TerminalNode AS(int i) {
			return getToken(PostgreSQLParser.AS, i);
		}
		public List<TerminalNode> CLOSE_PAREN() { return getTokens(PostgreSQLParser.CLOSE_PAREN); }
		public TerminalNode CLOSE_PAREN(int i) {
			return getToken(PostgreSQLParser.CLOSE_PAREN, i);
		}
		public TerminalNode ASSIGNMENT() { return getToken(PostgreSQLParser.ASSIGNMENT, 0); }
		public TerminalNode IMPLICIT() { return getToken(PostgreSQLParser.IMPLICIT, 0); }
		public TerminalNode WITH() { return getToken(PostgreSQLParser.WITH, 0); }
		public TerminalNode FUNCTION() { return getToken(PostgreSQLParser.FUNCTION, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode WITHOUT() { return getToken(PostgreSQLParser.WITHOUT, 0); }
		public TerminalNode INOUT() { return getToken(PostgreSQLParser.INOUT, 0); }
		public Type_listContext type_list() {
			return getRuleContext(Type_listContext.class,0);
		}
		public Create_cast_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_cast_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterCreate_cast_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitCreate_cast_stmt(this);
		}
	}

	public final Create_cast_stmtContext create_cast_stmt() throws RecognitionException {
		Create_cast_stmtContext _localctx = new Create_cast_stmtContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_create_cast_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(995);
			match(CREATE);
			setState(996);
			match(CAST);
			setState(997);
			match(OPEN_PAREN);
			setState(998);
			type(0);
			setState(999);
			match(AS);
			setState(1000);
			type(0);
			setState(1001);
			match(CLOSE_PAREN);
			setState(1015);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				{
				setState(1002);
				match(WITH);
				setState(1003);
				match(FUNCTION);
				setState(1004);
				identifier(0);
				setState(1009);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_PAREN) {
					{
					setState(1005);
					match(OPEN_PAREN);
					setState(1006);
					type_list();
					setState(1007);
					match(CLOSE_PAREN);
					}
				}

				}
				}
				break;
			case 2:
				{
				{
				setState(1011);
				match(WITHOUT);
				setState(1012);
				match(FUNCTION);
				}
				}
				break;
			case 3:
				{
				{
				setState(1013);
				match(WITH);
				setState(1014);
				match(INOUT);
				}
				}
				break;
			}
			setState(1021);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(1017);
				match(AS);
				setState(1018);
				match(ASSIGNMENT);
				}
				break;
			case 2:
				{
				setState(1019);
				match(AS);
				setState(1020);
				match(IMPLICIT);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_collation_optContext extends ParserRuleContext {
		public TerminalNode LOCALE() { return getToken(PostgreSQLParser.LOCALE, 0); }
		public TerminalNode EQUAL() { return getToken(PostgreSQLParser.EQUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode LC_COLLATE() { return getToken(PostgreSQLParser.LC_COLLATE, 0); }
		public TerminalNode LC_CTYPE() { return getToken(PostgreSQLParser.LC_CTYPE, 0); }
		public TerminalNode PROVIDER() { return getToken(PostgreSQLParser.PROVIDER, 0); }
		public TerminalNode VERSION() { return getToken(PostgreSQLParser.VERSION, 0); }
		public TerminalNode DOUBLEQ_STRING_LITERAL() { return getToken(PostgreSQLParser.DOUBLEQ_STRING_LITERAL, 0); }
		public Create_collation_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_collation_opt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterCreate_collation_opt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitCreate_collation_opt(this);
		}
	}

	public final Create_collation_optContext create_collation_opt() throws RecognitionException {
		Create_collation_optContext _localctx = new Create_collation_optContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_create_collation_opt);
		try {
			setState(1041);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LOCALE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1023);
				match(LOCALE);
				setState(1024);
				match(EQUAL);
				setState(1025);
				expr(0);
				}
				break;
			case LC_COLLATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1026);
				match(LC_COLLATE);
				setState(1027);
				match(EQUAL);
				setState(1028);
				expr(0);
				}
				break;
			case LC_CTYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1029);
				match(LC_CTYPE);
				setState(1030);
				match(EQUAL);
				setState(1031);
				expr(0);
				}
				break;
			case PROVIDER:
				enterOuterAlt(_localctx, 4);
				{
				setState(1032);
				match(PROVIDER);
				setState(1033);
				match(EQUAL);
				setState(1034);
				expr(0);
				}
				break;
			case VERSION:
				enterOuterAlt(_localctx, 5);
				{
				setState(1035);
				match(VERSION);
				setState(1036);
				match(EQUAL);
				setState(1037);
				expr(0);
				}
				break;
			case DOUBLEQ_STRING_LITERAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(1038);
				match(DOUBLEQ_STRING_LITERAL);
				setState(1039);
				match(EQUAL);
				setState(1040);
				expr(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_collation_opt_listContext extends ParserRuleContext {
		public List<Create_collation_optContext> create_collation_opt() {
			return getRuleContexts(Create_collation_optContext.class);
		}
		public Create_collation_optContext create_collation_opt(int i) {
			return getRuleContext(Create_collation_optContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PostgreSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PostgreSQLParser.COMMA, i);
		}
		public Create_collation_opt_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_collation_opt_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterCreate_collation_opt_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitCreate_collation_opt_list(this);
		}
	}

	public final Create_collation_opt_listContext create_collation_opt_list() throws RecognitionException {
		Create_collation_opt_listContext _localctx = new Create_collation_opt_listContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_create_collation_opt_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1043);
			create_collation_opt();
			setState(1048);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1044);
				match(COMMA);
				setState(1045);
				create_collation_opt();
				}
				}
				setState(1050);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_collation_stmtContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(PostgreSQLParser.CREATE, 0); }
		public TerminalNode COLLATION() { return getToken(PostgreSQLParser.COLLATION, 0); }
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public TerminalNode OPEN_PAREN() { return getToken(PostgreSQLParser.OPEN_PAREN, 0); }
		public Create_collation_opt_listContext create_collation_opt_list() {
			return getRuleContext(Create_collation_opt_listContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(PostgreSQLParser.CLOSE_PAREN, 0); }
		public TerminalNode IF() { return getToken(PostgreSQLParser.IF, 0); }
		public TerminalNode NOT() { return getToken(PostgreSQLParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(PostgreSQLParser.EXISTS, 0); }
		public TerminalNode FROM() { return getToken(PostgreSQLParser.FROM, 0); }
		public Create_collation_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_collation_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterCreate_collation_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitCreate_collation_stmt(this);
		}
	}

	public final Create_collation_stmtContext create_collation_stmt() throws RecognitionException {
		Create_collation_stmtContext _localctx = new Create_collation_stmtContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_create_collation_stmt);
		int _la;
		try {
			setState(1074);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1051);
				match(CREATE);
				setState(1052);
				match(COLLATION);
				setState(1056);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(1053);
					match(IF);
					setState(1054);
					match(NOT);
					setState(1055);
					match(EXISTS);
					}
				}

				setState(1058);
				name();
				setState(1059);
				match(OPEN_PAREN);
				setState(1060);
				create_collation_opt_list();
				setState(1061);
				match(CLOSE_PAREN);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1063);
				match(CREATE);
				setState(1064);
				match(COLLATION);
				setState(1068);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(1065);
					match(IF);
					setState(1066);
					match(NOT);
					setState(1067);
					match(EXISTS);
					}
				}

				setState(1070);
				name();
				setState(1071);
				match(FROM);
				setState(1072);
				name();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_conversion_stmtContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(PostgreSQLParser.CREATE, 0); }
		public TerminalNode CONVERSION() { return getToken(PostgreSQLParser.CONVERSION, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode FOR() { return getToken(PostgreSQLParser.FOR, 0); }
		public List<TerminalNode> SINGLEQ_STRING_LITERAL() { return getTokens(PostgreSQLParser.SINGLEQ_STRING_LITERAL); }
		public TerminalNode SINGLEQ_STRING_LITERAL(int i) {
			return getToken(PostgreSQLParser.SINGLEQ_STRING_LITERAL, i);
		}
		public TerminalNode TO() { return getToken(PostgreSQLParser.TO, 0); }
		public TerminalNode FROM() { return getToken(PostgreSQLParser.FROM, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(PostgreSQLParser.DEFAULT, 0); }
		public Create_conversion_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_conversion_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterCreate_conversion_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitCreate_conversion_stmt(this);
		}
	}

	public final Create_conversion_stmtContext create_conversion_stmt() throws RecognitionException {
		Create_conversion_stmtContext _localctx = new Create_conversion_stmtContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_create_conversion_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1076);
			match(CREATE);
			setState(1078);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(1077);
				match(DEFAULT);
				}
			}

			setState(1080);
			match(CONVERSION);
			setState(1081);
			identifier(0);
			setState(1082);
			match(FOR);
			setState(1083);
			match(SINGLEQ_STRING_LITERAL);
			setState(1084);
			match(TO);
			setState(1085);
			match(SINGLEQ_STRING_LITERAL);
			setState(1086);
			match(FROM);
			setState(1087);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_database_stmtContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(PostgreSQLParser.CREATE, 0); }
		public TerminalNode DATABASE() { return getToken(PostgreSQLParser.DATABASE, 0); }
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public TerminalNode WITH() { return getToken(PostgreSQLParser.WITH, 0); }
		public TerminalNode OWNER() { return getToken(PostgreSQLParser.OWNER, 0); }
		public List<TerminalNode> EQUAL() { return getTokens(PostgreSQLParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(PostgreSQLParser.EQUAL, i);
		}
		public TerminalNode TEMPLATE() { return getToken(PostgreSQLParser.TEMPLATE, 0); }
		public TerminalNode ENCODING() { return getToken(PostgreSQLParser.ENCODING, 0); }
		public TerminalNode LC_COLLATE() { return getToken(PostgreSQLParser.LC_COLLATE, 0); }
		public TerminalNode LC_CTYPE() { return getToken(PostgreSQLParser.LC_CTYPE, 0); }
		public TerminalNode TABLESPACE() { return getToken(PostgreSQLParser.TABLESPACE, 0); }
		public TerminalNode ALLOW_CONNECTIONS() { return getToken(PostgreSQLParser.ALLOW_CONNECTIONS, 0); }
		public TerminalNode CONNECTION() { return getToken(PostgreSQLParser.CONNECTION, 0); }
		public TerminalNode LIMIT() { return getToken(PostgreSQLParser.LIMIT, 0); }
		public List<TerminalNode> INTEGER_LITERAL() { return getTokens(PostgreSQLParser.INTEGER_LITERAL); }
		public TerminalNode INTEGER_LITERAL(int i) {
			return getToken(PostgreSQLParser.INTEGER_LITERAL, i);
		}
		public TerminalNode IS_TEMPLATE() { return getToken(PostgreSQLParser.IS_TEMPLATE, 0); }
		public Create_database_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_database_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterCreate_database_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitCreate_database_stmt(this);
		}
	}

	public final Create_database_stmtContext create_database_stmt() throws RecognitionException {
		Create_database_stmtContext _localctx = new Create_database_stmtContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_create_database_stmt);
		int _la;
		try {
			setState(1143);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CREATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1089);
				match(CREATE);
				setState(1090);
				match(DATABASE);
				setState(1091);
				name();
				}
				break;
			case EOF:
			case CONNECTION:
			case ENCODING:
			case OWNER:
			case TABLESPACE:
			case TEMPLATE:
			case WITH:
			case LC_COLLATE:
			case LC_CTYPE:
			case ALLOW_CONNECTIONS:
			case IS_TEMPLATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1141);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
				case 1:
					{
					setState(1093);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WITH) {
						{
						setState(1092);
						match(WITH);
						}
					}

					setState(1098);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==OWNER) {
						{
						setState(1095);
						match(OWNER);
						setState(1096);
						match(EQUAL);
						setState(1097);
						name();
						}
					}

					setState(1103);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==TEMPLATE) {
						{
						setState(1100);
						match(TEMPLATE);
						setState(1101);
						match(EQUAL);
						setState(1102);
						name();
						}
					}

					setState(1108);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ENCODING) {
						{
						setState(1105);
						match(ENCODING);
						setState(1106);
						match(EQUAL);
						setState(1107);
						name();
						}
					}

					setState(1113);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LC_COLLATE) {
						{
						setState(1110);
						match(LC_COLLATE);
						setState(1111);
						match(EQUAL);
						setState(1112);
						name();
						}
					}

					setState(1118);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LC_CTYPE) {
						{
						setState(1115);
						match(LC_CTYPE);
						setState(1116);
						match(EQUAL);
						setState(1117);
						name();
						}
					}

					setState(1123);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==TABLESPACE) {
						{
						setState(1120);
						match(TABLESPACE);
						setState(1121);
						match(EQUAL);
						setState(1122);
						name();
						}
					}

					setState(1128);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ALLOW_CONNECTIONS) {
						{
						setState(1125);
						match(ALLOW_CONNECTIONS);
						setState(1126);
						match(EQUAL);
						setState(1127);
						name();
						}
					}

					setState(1134);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==CONNECTION) {
						{
						setState(1130);
						match(CONNECTION);
						setState(1131);
						match(LIMIT);
						setState(1132);
						match(EQUAL);
						setState(1133);
						match(INTEGER_LITERAL);
						}
					}

					setState(1139);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IS_TEMPLATE) {
						{
						setState(1136);
						match(IS_TEMPLATE);
						setState(1137);
						match(EQUAL);
						setState(1138);
						match(INTEGER_LITERAL);
						}
					}

					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Domain_constraintContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(PostgreSQLParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(PostgreSQLParser.NULL, 0); }
		public TerminalNode CHECK() { return getToken(PostgreSQLParser.CHECK, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(PostgreSQLParser.OPEN_PAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(PostgreSQLParser.CLOSE_PAREN, 0); }
		public TerminalNode CONSTRAINT() { return getToken(PostgreSQLParser.CONSTRAINT, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Domain_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_domain_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterDomain_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitDomain_constraint(this);
		}
	}

	public final Domain_constraintContext domain_constraint() throws RecognitionException {
		Domain_constraintContext _localctx = new Domain_constraintContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_domain_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(1145);
				match(CONSTRAINT);
				setState(1146);
				name();
				}
			}

			setState(1157);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				{
				setState(1149);
				match(NOT);
				setState(1150);
				match(NULL);
				}
				break;
			case NULL:
				{
				setState(1151);
				match(NULL);
				}
				break;
			case CHECK:
				{
				setState(1152);
				match(CHECK);
				setState(1153);
				match(OPEN_PAREN);
				setState(1154);
				expr(0);
				setState(1155);
				match(CLOSE_PAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_domain_stmtContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(PostgreSQLParser.CREATE, 0); }
		public TerminalNode DOMAIN() { return getToken(PostgreSQLParser.DOMAIN, 0); }
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode AS() { return getToken(PostgreSQLParser.AS, 0); }
		public List<Domain_constraintContext> domain_constraint() {
			return getRuleContexts(Domain_constraintContext.class);
		}
		public Domain_constraintContext domain_constraint(int i) {
			return getRuleContext(Domain_constraintContext.class,i);
		}
		public List<TerminalNode> COLLATE() { return getTokens(PostgreSQLParser.COLLATE); }
		public TerminalNode COLLATE(int i) {
			return getToken(PostgreSQLParser.COLLATE, i);
		}
		public List<TerminalNode> DEFAULT() { return getTokens(PostgreSQLParser.DEFAULT); }
		public TerminalNode DEFAULT(int i) {
			return getToken(PostgreSQLParser.DEFAULT, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Create_domain_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_domain_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterCreate_domain_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitCreate_domain_stmt(this);
		}
	}

	public final Create_domain_stmtContext create_domain_stmt() throws RecognitionException {
		Create_domain_stmtContext _localctx = new Create_domain_stmtContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_create_domain_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1159);
			match(CREATE);
			setState(1160);
			match(DOMAIN);
			setState(1161);
			name();
			setState(1163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(1162);
				match(AS);
				}
			}

			setState(1165);
			type(0);
			setState(1173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (CHECK - 77)) | (1L << (COLLATE - 77)) | (1L << (CONSTRAINT - 77)))) != 0) || _la==DEFAULT || _la==NOT || _la==NULL) {
				{
				setState(1171);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case COLLATE:
					{
					{
					setState(1166);
					match(COLLATE);
					setState(1167);
					name();
					}
					}
					break;
				case DEFAULT:
					{
					{
					setState(1168);
					match(DEFAULT);
					setState(1169);
					expr(0);
					}
					}
					break;
				case CHECK:
				case CONSTRAINT:
				case NOT:
				case NULL:
					{
					setState(1170);
					domain_constraint();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1175);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_event_trigger_condContext extends ParserRuleContext {
		public IdentifierContext filter;
		public TerminalNode IN() { return getToken(PostgreSQLParser.IN, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(PostgreSQLParser.OPEN_PAREN, 0); }
		public List<TerminalNode> SINGLEQ_STRING_LITERAL() { return getTokens(PostgreSQLParser.SINGLEQ_STRING_LITERAL); }
		public TerminalNode SINGLEQ_STRING_LITERAL(int i) {
			return getToken(PostgreSQLParser.SINGLEQ_STRING_LITERAL, i);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(PostgreSQLParser.CLOSE_PAREN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(PostgreSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PostgreSQLParser.COMMA, i);
		}
		public List<TerminalNode> AND() { return getTokens(PostgreSQLParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(PostgreSQLParser.AND, i);
		}
		public List<Create_event_trigger_condContext> create_event_trigger_cond() {
			return getRuleContexts(Create_event_trigger_condContext.class);
		}
		public Create_event_trigger_condContext create_event_trigger_cond(int i) {
			return getRuleContext(Create_event_trigger_condContext.class,i);
		}
		public Create_event_trigger_condContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_event_trigger_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterCreate_event_trigger_cond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitCreate_event_trigger_cond(this);
		}
	}

	public final Create_event_trigger_condContext create_event_trigger_cond() throws RecognitionException {
		Create_event_trigger_condContext _localctx = new Create_event_trigger_condContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_create_event_trigger_cond);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1176);
			((Create_event_trigger_condContext)_localctx).filter = identifier(0);
			setState(1177);
			match(IN);
			setState(1178);
			match(OPEN_PAREN);
			setState(1179);
			match(SINGLEQ_STRING_LITERAL);
			setState(1184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1180);
				match(COMMA);
				setState(1181);
				match(SINGLEQ_STRING_LITERAL);
				}
				}
				setState(1186);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1187);
			match(CLOSE_PAREN);
			setState(1192);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1188);
					match(AND);
					setState(1189);
					create_event_trigger_cond();
					}
					} 
				}
				setState(1194);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_event_trigger_stmtContext extends ParserRuleContext {
		public IdentifierContext trigger;
		public IdentifierContext event;
		public IdentifierContext fn_name;
		public TerminalNode CREATE() { return getToken(PostgreSQLParser.CREATE, 0); }
		public TerminalNode EVENT() { return getToken(PostgreSQLParser.EVENT, 0); }
		public TerminalNode TRIGGER() { return getToken(PostgreSQLParser.TRIGGER, 0); }
		public TerminalNode ON() { return getToken(PostgreSQLParser.ON, 0); }
		public TerminalNode EXECUTE() { return getToken(PostgreSQLParser.EXECUTE, 0); }
		public TerminalNode PROCEDURE() { return getToken(PostgreSQLParser.PROCEDURE, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(PostgreSQLParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(PostgreSQLParser.CLOSE_PAREN, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode WHEN() { return getToken(PostgreSQLParser.WHEN, 0); }
		public Create_event_trigger_condContext create_event_trigger_cond() {
			return getRuleContext(Create_event_trigger_condContext.class,0);
		}
		public Create_event_trigger_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_event_trigger_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterCreate_event_trigger_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitCreate_event_trigger_stmt(this);
		}
	}

	public final Create_event_trigger_stmtContext create_event_trigger_stmt() throws RecognitionException {
		Create_event_trigger_stmtContext _localctx = new Create_event_trigger_stmtContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_create_event_trigger_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1195);
			match(CREATE);
			setState(1196);
			match(EVENT);
			setState(1197);
			match(TRIGGER);
			setState(1198);
			((Create_event_trigger_stmtContext)_localctx).trigger = identifier(0);
			setState(1199);
			match(ON);
			setState(1200);
			((Create_event_trigger_stmtContext)_localctx).event = identifier(0);
			setState(1203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHEN) {
				{
				setState(1201);
				match(WHEN);
				setState(1202);
				create_event_trigger_cond();
				}
			}

			setState(1205);
			match(EXECUTE);
			setState(1206);
			match(PROCEDURE);
			setState(1207);
			((Create_event_trigger_stmtContext)_localctx).fn_name = identifier(0);
			setState(1208);
			match(OPEN_PAREN);
			setState(1209);
			match(CLOSE_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_foreign_data_optionsContext extends ParserRuleContext {
		public NameContext opt;
		public TerminalNode SINGLEQ_STRING_LITERAL() { return getToken(PostgreSQLParser.SINGLEQ_STRING_LITERAL, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(PostgreSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PostgreSQLParser.COMMA, i);
		}
		public List<Create_foreign_data_optionsContext> create_foreign_data_options() {
			return getRuleContexts(Create_foreign_data_optionsContext.class);
		}
		public Create_foreign_data_optionsContext create_foreign_data_options(int i) {
			return getRuleContext(Create_foreign_data_optionsContext.class,i);
		}
		public Create_foreign_data_optionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_foreign_data_options; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterCreate_foreign_data_options(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitCreate_foreign_data_options(this);
		}
	}

	public final Create_foreign_data_optionsContext create_foreign_data_options() throws RecognitionException {
		Create_foreign_data_optionsContext _localctx = new Create_foreign_data_optionsContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_create_foreign_data_options);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1211);
			((Create_foreign_data_optionsContext)_localctx).opt = name();
			setState(1212);
			match(SINGLEQ_STRING_LITERAL);
			setState(1217);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1213);
					match(COMMA);
					setState(1214);
					create_foreign_data_options();
					}
					} 
				}
				setState(1219);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_foreign_data_stmtContext extends ParserRuleContext {
		public IdentifierContext wrapper;
		public IdentifierContext handler;
		public IdentifierContext validator;
		public Create_foreign_data_optionsContext opts;
		public TerminalNode CREATE() { return getToken(PostgreSQLParser.CREATE, 0); }
		public TerminalNode FOREIGN() { return getToken(PostgreSQLParser.FOREIGN, 0); }
		public TerminalNode DATA() { return getToken(PostgreSQLParser.DATA, 0); }
		public TerminalNode WRAPPER() { return getToken(PostgreSQLParser.WRAPPER, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> HANDLER() { return getTokens(PostgreSQLParser.HANDLER); }
		public TerminalNode HANDLER(int i) {
			return getToken(PostgreSQLParser.HANDLER, i);
		}
		public List<TerminalNode> NO() { return getTokens(PostgreSQLParser.NO); }
		public TerminalNode NO(int i) {
			return getToken(PostgreSQLParser.NO, i);
		}
		public TerminalNode VALIDATOR() { return getToken(PostgreSQLParser.VALIDATOR, 0); }
		public TerminalNode OPTIONS() { return getToken(PostgreSQLParser.OPTIONS, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(PostgreSQLParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(PostgreSQLParser.CLOSE_PAREN, 0); }
		public Create_foreign_data_optionsContext create_foreign_data_options() {
			return getRuleContext(Create_foreign_data_optionsContext.class,0);
		}
		public Create_foreign_data_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_foreign_data_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterCreate_foreign_data_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitCreate_foreign_data_stmt(this);
		}
	}

	public final Create_foreign_data_stmtContext create_foreign_data_stmt() throws RecognitionException {
		Create_foreign_data_stmtContext _localctx = new Create_foreign_data_stmtContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_create_foreign_data_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1220);
			match(CREATE);
			setState(1221);
			match(FOREIGN);
			setState(1222);
			match(DATA);
			setState(1223);
			match(WRAPPER);
			setState(1224);
			((Create_foreign_data_stmtContext)_localctx).wrapper = identifier(0);
			setState(1231);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(1229);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case HANDLER:
						{
						setState(1225);
						match(HANDLER);
						setState(1226);
						((Create_foreign_data_stmtContext)_localctx).handler = identifier(0);
						}
						break;
					case NO:
						{
						setState(1227);
						match(NO);
						setState(1228);
						match(HANDLER);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(1233);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			}
			setState(1238);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VALIDATOR:
				{
				setState(1234);
				match(VALIDATOR);
				setState(1235);
				((Create_foreign_data_stmtContext)_localctx).validator = identifier(0);
				}
				break;
			case NO:
				{
				setState(1236);
				match(NO);
				setState(1237);
				match(VALIDATOR);
				}
				break;
			case EOF:
			case OPTIONS:
				break;
			default:
				break;
			}
			setState(1245);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPTIONS) {
				{
				setState(1240);
				match(OPTIONS);
				setState(1241);
				match(OPEN_PAREN);
				setState(1242);
				((Create_foreign_data_stmtContext)_localctx).opts = create_foreign_data_options();
				setState(1243);
				match(CLOSE_PAREN);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_foreign_table_stmtContext extends ParserRuleContext {
		public IdentifierContext table_name_TODO;
		public IdentifierContext column_name_TODO;
		public IdentifierContext data_type;
		public Create_foreign_data_optionsContext opts;
		public NameContext server_name;
		public TerminalNode CREATE() { return getToken(PostgreSQLParser.CREATE, 0); }
		public TerminalNode FOREIGN() { return getToken(PostgreSQLParser.FOREIGN, 0); }
		public TerminalNode TABLE() { return getToken(PostgreSQLParser.TABLE, 0); }
		public List<TerminalNode> OPEN_PAREN() { return getTokens(PostgreSQLParser.OPEN_PAREN); }
		public TerminalNode OPEN_PAREN(int i) {
			return getToken(PostgreSQLParser.OPEN_PAREN, i);
		}
		public List<TerminalNode> CLOSE_PAREN() { return getTokens(PostgreSQLParser.CLOSE_PAREN); }
		public TerminalNode CLOSE_PAREN(int i) {
			return getToken(PostgreSQLParser.CLOSE_PAREN, i);
		}
		public TerminalNode SERVER() { return getToken(PostgreSQLParser.SERVER, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode IF() { return getToken(PostgreSQLParser.IF, 0); }
		public TerminalNode NOT() { return getToken(PostgreSQLParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(PostgreSQLParser.EXISTS, 0); }
		public List<TerminalNode> OPTIONS() { return getTokens(PostgreSQLParser.OPTIONS); }
		public TerminalNode OPTIONS(int i) {
			return getToken(PostgreSQLParser.OPTIONS, i);
		}
		public TerminalNode COLLATE() { return getToken(PostgreSQLParser.COLLATE, 0); }
		public Create_collation_optContext create_collation_opt() {
			return getRuleContext(Create_collation_optContext.class,0);
		}
		public TerminalNode INHERITS() { return getToken(PostgreSQLParser.INHERITS, 0); }
		public Name_listContext name_list() {
			return getRuleContext(Name_listContext.class,0);
		}
		public List<Create_foreign_data_optionsContext> create_foreign_data_options() {
			return getRuleContexts(Create_foreign_data_optionsContext.class);
		}
		public Create_foreign_data_optionsContext create_foreign_data_options(int i) {
			return getRuleContext(Create_foreign_data_optionsContext.class,i);
		}
		public Create_foreign_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_foreign_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterCreate_foreign_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitCreate_foreign_table_stmt(this);
		}
	}

	public final Create_foreign_table_stmtContext create_foreign_table_stmt() throws RecognitionException {
		Create_foreign_table_stmtContext _localctx = new Create_foreign_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_create_foreign_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1247);
			match(CREATE);
			setState(1248);
			match(FOREIGN);
			setState(1249);
			match(TABLE);
			setState(1253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(1250);
				match(IF);
				setState(1251);
				match(NOT);
				setState(1252);
				match(EXISTS);
				}
			}

			setState(1255);
			((Create_foreign_table_stmtContext)_localctx).table_name_TODO = identifier(0);
			setState(1256);
			match(OPEN_PAREN);
			setState(1257);
			((Create_foreign_table_stmtContext)_localctx).column_name_TODO = identifier(0);
			setState(1258);
			((Create_foreign_table_stmtContext)_localctx).data_type = identifier(0);
			setState(1264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPTIONS) {
				{
				setState(1259);
				match(OPTIONS);
				setState(1260);
				match(OPEN_PAREN);
				setState(1261);
				((Create_foreign_table_stmtContext)_localctx).opts = create_foreign_data_options();
				setState(1262);
				match(CLOSE_PAREN);
				}
			}

			setState(1268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLLATE) {
				{
				setState(1266);
				match(COLLATE);
				setState(1267);
				create_collation_opt();
				}
			}

			setState(1270);
			match(CLOSE_PAREN);
			setState(1273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INHERITS) {
				{
				setState(1271);
				match(INHERITS);
				setState(1272);
				name_list();
				}
			}

			setState(1275);
			match(SERVER);
			setState(1276);
			((Create_foreign_table_stmtContext)_localctx).server_name = name();
			setState(1282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPTIONS) {
				{
				setState(1277);
				match(OPTIONS);
				setState(1278);
				match(OPEN_PAREN);
				setState(1279);
				((Create_foreign_table_stmtContext)_localctx).opts = create_foreign_data_options();
				setState(1280);
				match(CLOSE_PAREN);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_function_stmtContext extends ParserRuleContext {
		public NameContext fn_name;
		public TerminalNode CREATE() { return getToken(PostgreSQLParser.CREATE, 0); }
		public TerminalNode FUNCTION() { return getToken(PostgreSQLParser.FUNCTION, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode OR() { return getToken(PostgreSQLParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(PostgreSQLParser.REPLACE, 0); }
		public Create_function_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_function_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterCreate_function_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitCreate_function_stmt(this);
		}
	}

	public final Create_function_stmtContext create_function_stmt() throws RecognitionException {
		Create_function_stmtContext _localctx = new Create_function_stmtContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_create_function_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1284);
			match(CREATE);
			setState(1287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OR) {
				{
				setState(1285);
				match(OR);
				setState(1286);
				match(REPLACE);
				}
			}

			setState(1289);
			match(FUNCTION);
			setState(1290);
			((Create_function_stmtContext)_localctx).fn_name = name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_group_stmtContext extends ParserRuleContext {
		public IdentifierContext group;
		public TerminalNode CREATE() { return getToken(PostgreSQLParser.CREATE, 0); }
		public List<TerminalNode> GROUP() { return getTokens(PostgreSQLParser.GROUP); }
		public TerminalNode GROUP(int i) {
			return getToken(PostgreSQLParser.GROUP, i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode WITH() { return getToken(PostgreSQLParser.WITH, 0); }
		public List<TerminalNode> SUPERUSER() { return getTokens(PostgreSQLParser.SUPERUSER); }
		public TerminalNode SUPERUSER(int i) {
			return getToken(PostgreSQLParser.SUPERUSER, i);
		}
		public List<TerminalNode> NOSUPERUSER() { return getTokens(PostgreSQLParser.NOSUPERUSER); }
		public TerminalNode NOSUPERUSER(int i) {
			return getToken(PostgreSQLParser.NOSUPERUSER, i);
		}
		public List<TerminalNode> CREATEDB() { return getTokens(PostgreSQLParser.CREATEDB); }
		public TerminalNode CREATEDB(int i) {
			return getToken(PostgreSQLParser.CREATEDB, i);
		}
		public List<TerminalNode> NOCREATEDB() { return getTokens(PostgreSQLParser.NOCREATEDB); }
		public TerminalNode NOCREATEDB(int i) {
			return getToken(PostgreSQLParser.NOCREATEDB, i);
		}
		public List<TerminalNode> CREATEROLE() { return getTokens(PostgreSQLParser.CREATEROLE); }
		public TerminalNode CREATEROLE(int i) {
			return getToken(PostgreSQLParser.CREATEROLE, i);
		}
		public List<TerminalNode> NOCREATEROLE() { return getTokens(PostgreSQLParser.NOCREATEROLE); }
		public TerminalNode NOCREATEROLE(int i) {
			return getToken(PostgreSQLParser.NOCREATEROLE, i);
		}
		public List<TerminalNode> CREATEUSER() { return getTokens(PostgreSQLParser.CREATEUSER); }
		public TerminalNode CREATEUSER(int i) {
			return getToken(PostgreSQLParser.CREATEUSER, i);
		}
		public List<TerminalNode> NOCREATEUSER() { return getTokens(PostgreSQLParser.NOCREATEUSER); }
		public TerminalNode NOCREATEUSER(int i) {
			return getToken(PostgreSQLParser.NOCREATEUSER, i);
		}
		public List<TerminalNode> INHERIT() { return getTokens(PostgreSQLParser.INHERIT); }
		public TerminalNode INHERIT(int i) {
			return getToken(PostgreSQLParser.INHERIT, i);
		}
		public List<TerminalNode> NOINHERIT() { return getTokens(PostgreSQLParser.NOINHERIT); }
		public TerminalNode NOINHERIT(int i) {
			return getToken(PostgreSQLParser.NOINHERIT, i);
		}
		public List<TerminalNode> LOGIN() { return getTokens(PostgreSQLParser.LOGIN); }
		public TerminalNode LOGIN(int i) {
			return getToken(PostgreSQLParser.LOGIN, i);
		}
		public List<TerminalNode> NOLOGIN() { return getTokens(PostgreSQLParser.NOLOGIN); }
		public TerminalNode NOLOGIN(int i) {
			return getToken(PostgreSQLParser.NOLOGIN, i);
		}
		public List<TerminalNode> PASSWORD() { return getTokens(PostgreSQLParser.PASSWORD); }
		public TerminalNode PASSWORD(int i) {
			return getToken(PostgreSQLParser.PASSWORD, i);
		}
		public List<TerminalNode> VALID() { return getTokens(PostgreSQLParser.VALID); }
		public TerminalNode VALID(int i) {
			return getToken(PostgreSQLParser.VALID, i);
		}
		public List<TerminalNode> UNTIL() { return getTokens(PostgreSQLParser.UNTIL); }
		public TerminalNode UNTIL(int i) {
			return getToken(PostgreSQLParser.UNTIL, i);
		}
		public List<TerminalNode> SINGLEQ_STRING_LITERAL() { return getTokens(PostgreSQLParser.SINGLEQ_STRING_LITERAL); }
		public TerminalNode SINGLEQ_STRING_LITERAL(int i) {
			return getToken(PostgreSQLParser.SINGLEQ_STRING_LITERAL, i);
		}
		public List<TerminalNode> IN() { return getTokens(PostgreSQLParser.IN); }
		public TerminalNode IN(int i) {
			return getToken(PostgreSQLParser.IN, i);
		}
		public List<TerminalNode> ROLE() { return getTokens(PostgreSQLParser.ROLE); }
		public TerminalNode ROLE(int i) {
			return getToken(PostgreSQLParser.ROLE, i);
		}
		public List<Name_listContext> name_list() {
			return getRuleContexts(Name_listContext.class);
		}
		public Name_listContext name_list(int i) {
			return getRuleContext(Name_listContext.class,i);
		}
		public List<TerminalNode> ADMIN() { return getTokens(PostgreSQLParser.ADMIN); }
		public TerminalNode ADMIN(int i) {
			return getToken(PostgreSQLParser.ADMIN, i);
		}
		public List<TerminalNode> USER() { return getTokens(PostgreSQLParser.USER); }
		public TerminalNode USER(int i) {
			return getToken(PostgreSQLParser.USER, i);
		}
		public List<TerminalNode> SYSID() { return getTokens(PostgreSQLParser.SYSID); }
		public TerminalNode SYSID(int i) {
			return getToken(PostgreSQLParser.SYSID, i);
		}
		public List<TerminalNode> INTEGER_LITERAL() { return getTokens(PostgreSQLParser.INTEGER_LITERAL); }
		public TerminalNode INTEGER_LITERAL(int i) {
			return getToken(PostgreSQLParser.INTEGER_LITERAL, i);
		}
		public List<TerminalNode> NULL() { return getTokens(PostgreSQLParser.NULL); }
		public TerminalNode NULL(int i) {
			return getToken(PostgreSQLParser.NULL, i);
		}
		public List<TerminalNode> ENCRYPTED() { return getTokens(PostgreSQLParser.ENCRYPTED); }
		public TerminalNode ENCRYPTED(int i) {
			return getToken(PostgreSQLParser.ENCRYPTED, i);
		}
		public List<TerminalNode> UNENCRYPTED() { return getTokens(PostgreSQLParser.UNENCRYPTED); }
		public TerminalNode UNENCRYPTED(int i) {
			return getToken(PostgreSQLParser.UNENCRYPTED, i);
		}
		public Create_group_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_group_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterCreate_group_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitCreate_group_stmt(this);
		}
	}

	public final Create_group_stmtContext create_group_stmt() throws RecognitionException {
		Create_group_stmtContext _localctx = new Create_group_stmtContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_create_group_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1292);
			match(CREATE);
			setState(1293);
			match(GROUP);
			setState(1294);
			((Create_group_stmtContext)_localctx).group = identifier(0);
			setState(1336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ADMIN || _la==CREATEDB || _la==CREATEUSER || _la==ENCRYPTED || _la==IN || ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (NOCREATEDB - 341)) | (1L << (NOCREATEUSER - 341)) | (1L << (PASSWORD - 341)))) != 0) || _la==ROLE || ((((_la - 533)) & ~0x3f) == 0 && ((1L << (_la - 533)) & ((1L << (SYSID - 533)) | (1L << (UNENCRYPTED - 533)) | (1L << (USER - 533)))) != 0) || ((((_la - 597)) & ~0x3f) == 0 && ((1L << (_la - 597)) & ((1L << (VALID - 597)) | (1L << (WITH - 597)) | (1L << (SUPERUSER - 597)) | (1L << (NOSUPERUSER - 597)) | (1L << (CREATEROLE - 597)) | (1L << (NOCREATEROLE - 597)) | (1L << (INHERIT - 597)) | (1L << (NOINHERIT - 597)) | (1L << (LOGIN - 597)) | (1L << (NOLOGIN - 597)))) != 0)) {
				{
				setState(1296);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(1295);
					match(WITH);
					}
				}

				setState(1332); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(1332);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
					case 1:
						{
						setState(1298);
						match(SUPERUSER);
						}
						break;
					case 2:
						{
						setState(1299);
						match(NOSUPERUSER);
						}
						break;
					case 3:
						{
						setState(1300);
						match(CREATEDB);
						}
						break;
					case 4:
						{
						setState(1301);
						match(NOCREATEDB);
						}
						break;
					case 5:
						{
						setState(1302);
						match(CREATEROLE);
						}
						break;
					case 6:
						{
						setState(1303);
						match(NOCREATEROLE);
						}
						break;
					case 7:
						{
						setState(1304);
						match(CREATEUSER);
						}
						break;
					case 8:
						{
						setState(1305);
						match(NOCREATEUSER);
						}
						break;
					case 9:
						{
						setState(1306);
						match(INHERIT);
						}
						break;
					case 10:
						{
						setState(1307);
						match(NOINHERIT);
						}
						break;
					case 11:
						{
						setState(1308);
						match(LOGIN);
						}
						break;
					case 12:
						{
						setState(1309);
						match(NOLOGIN);
						}
						break;
					case 13:
						{
						setState(1311);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ENCRYPTED || _la==UNENCRYPTED) {
							{
							setState(1310);
							_la = _input.LA(1);
							if ( !(_la==ENCRYPTED || _la==UNENCRYPTED) ) {
							_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							}
						}

						setState(1313);
						match(PASSWORD);
						setState(1314);
						_la = _input.LA(1);
						if ( !(_la==NULL || _la==SINGLEQ_STRING_LITERAL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case 14:
						{
						setState(1315);
						match(VALID);
						setState(1316);
						match(UNTIL);
						setState(1317);
						match(SINGLEQ_STRING_LITERAL);
						}
						break;
					case 15:
						{
						setState(1318);
						match(IN);
						setState(1319);
						match(ROLE);
						setState(1320);
						name_list();
						}
						break;
					case 16:
						{
						setState(1321);
						match(IN);
						setState(1322);
						match(GROUP);
						setState(1323);
						name_list();
						}
						break;
					case 17:
						{
						setState(1324);
						match(ROLE);
						setState(1325);
						name_list();
						}
						break;
					case 18:
						{
						setState(1326);
						match(ADMIN);
						setState(1327);
						name_list();
						}
						break;
					case 19:
						{
						setState(1328);
						match(USER);
						setState(1329);
						name_list();
						}
						break;
					case 20:
						{
						setState(1330);
						match(SYSID);
						setState(1331);
						match(INTEGER_LITERAL);
						}
						break;
					}
					}
					setState(1334); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ADMIN || _la==CREATEDB || _la==CREATEUSER || _la==ENCRYPTED || _la==IN || ((((_la - 341)) & ~0x3f) == 0 && ((1L << (_la - 341)) & ((1L << (NOCREATEDB - 341)) | (1L << (NOCREATEUSER - 341)) | (1L << (PASSWORD - 341)))) != 0) || _la==ROLE || ((((_la - 533)) & ~0x3f) == 0 && ((1L << (_la - 533)) & ((1L << (SYSID - 533)) | (1L << (UNENCRYPTED - 533)) | (1L << (USER - 533)))) != 0) || ((((_la - 597)) & ~0x3f) == 0 && ((1L << (_la - 597)) & ((1L << (VALID - 597)) | (1L << (SUPERUSER - 597)) | (1L << (NOSUPERUSER - 597)) | (1L << (CREATEROLE - 597)) | (1L << (NOCREATEROLE - 597)) | (1L << (INHERIT - 597)) | (1L << (NOINHERIT - 597)) | (1L << (LOGIN - 597)) | (1L << (NOLOGIN - 597)))) != 0) );
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_index_stmtContext extends ParserRuleContext {
		public IdentifierContext index_name;
		public IdentifierContext tableName;
		public IdentifierContext tablespace_name;
		public TerminalNode CREATE() { return getToken(PostgreSQLParser.CREATE, 0); }
		public TerminalNode INDEX() { return getToken(PostgreSQLParser.INDEX, 0); }
		public TerminalNode ON() { return getToken(PostgreSQLParser.ON, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode UNIQUE() { return getToken(PostgreSQLParser.UNIQUE, 0); }
		public TerminalNode CONCURRENTLY() { return getToken(PostgreSQLParser.CONCURRENTLY, 0); }
		public TerminalNode USING() { return getToken(PostgreSQLParser.USING, 0); }
		public Index_methodContext index_method() {
			return getRuleContext(Index_methodContext.class,0);
		}
		public TerminalNode TABLESPACE() { return getToken(PostgreSQLParser.TABLESPACE, 0); }
		public TerminalNode WHERE() { return getToken(PostgreSQLParser.WHERE, 0); }
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public TerminalNode IF() { return getToken(PostgreSQLParser.IF, 0); }
		public TerminalNode NOT() { return getToken(PostgreSQLParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(PostgreSQLParser.EXISTS, 0); }
		public Create_index_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_index_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterCreate_index_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitCreate_index_stmt(this);
		}
	}

	public final Create_index_stmtContext create_index_stmt() throws RecognitionException {
		Create_index_stmtContext _localctx = new Create_index_stmtContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_create_index_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1338);
			match(CREATE);
			setState(1340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNIQUE) {
				{
				setState(1339);
				match(UNIQUE);
				}
			}

			setState(1342);
			match(INDEX);
			setState(1344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONCURRENTLY) {
				{
				setState(1343);
				match(CONCURRENTLY);
				}
			}

			setState(1352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHITESPACE) | (1L << A_) | (1L << ABORT) | (1L << ABS) | (1L << ABSOLUTE) | (1L << ACCESS) | (1L << ACTION) | (1L << ADA) | (1L << ADD) | (1L << ADMIN) | (1L << AFTER) | (1L << AGGREGATE) | (1L << ALLOCATE) | (1L << ALSO) | (1L << ALTER) | (1L << ALWAYS) | (1L << ARE) | (1L << ASENSITIVE) | (1L << ASSERTION) | (1L << ASSIGNMENT) | (1L << AT) | (1L << ATOMIC) | (1L << ATTRIBUTE) | (1L << ATTRIBUTES) | (1L << AVG) | (1L << BACKWARD) | (1L << BEFORE) | (1L << BEGIN) | (1L << BERNOULLI) | (1L << BETWEEN) | (1L << BIGINT) | (1L << BIT) | (1L << BIT_LENGTH) | (1L << BLOB) | (1L << BOOLEAN) | (1L << BREADTH) | (1L << BY) | (1L << C_) | (1L << CACHE) | (1L << CALL) | (1L << CALLED) | (1L << CARDINALITY) | (1L << CASCADE) | (1L << CASCADED) | (1L << CATALOG))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CATALOG_NAME - 64)) | (1L << (CEIL - 64)) | (1L << (CEILING - 64)) | (1L << (CHAIN - 64)) | (1L << (CHAR - 64)) | (1L << (CHARACTER - 64)) | (1L << (CHARACTERISTICS - 64)) | (1L << (CHARACTERS - 64)) | (1L << (CHARACTER_LENGTH - 64)) | (1L << (CHARACTER_SET_CATALOG - 64)) | (1L << (CHARACTER_SET_NAME - 64)) | (1L << (CHARACTER_SET_SCHEMA - 64)) | (1L << (CHAR_LENGTH - 64)) | (1L << (CHECKPOINT - 64)) | (1L << (CLASS - 64)) | (1L << (CLASS_ORIGIN - 64)) | (1L << (CLOB - 64)) | (1L << (CLOSE - 64)) | (1L << (CLUSTER - 64)) | (1L << (COALESCE - 64)) | (1L << (COBOL - 64)) | (1L << (COLLATION_CATALOG - 64)) | (1L << (COLLATION_NAME - 64)) | (1L << (COLLATION_SCHEMA - 64)) | (1L << (COLLECT - 64)) | (1L << (COLUMN_NAME - 64)) | (1L << (COMMAND_FUNCTION - 64)) | (1L << (COMMAND_FUNCTION_CODE - 64)) | (1L << (COMMENT - 64)) | (1L << (COMMIT - 64)) | (1L << (COMMITTED - 64)) | (1L << (CONDITION - 64)) | (1L << (CONDITION_NUMBER - 64)) | (1L << (CONNECT - 64)) | (1L << (CONNECTION - 64)) | (1L << (CONNECTION_NAME - 64)) | (1L << (CONSTRAINTS - 64)) | (1L << (CONSTRAINT_CATALOG - 64)) | (1L << (CONSTRAINT_NAME - 64)) | (1L << (CONSTRAINT_SCHEMA - 64)) | (1L << (CONSTRUCTOR - 64)) | (1L << (CONTAINS - 64)) | (1L << (CONTINUE - 64)) | (1L << (CONVERSION - 64)) | (1L << (CONVERT - 64)) | (1L << (COPY - 64)) | (1L << (CORR - 64)) | (1L << (CORRESPONDING - 64)) | (1L << (COUNT - 64)) | (1L << (COVAR_POP - 64)) | (1L << (COVAR_SAMP - 64)) | (1L << (CSV - 64)) | (1L << (CUBE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (CUME_DIST - 128)) | (1L << (CURRENT - 128)) | (1L << (CURRENT_DEFAULT_TRANSFORM_GROUP - 128)) | (1L << (CURRENT_PATH - 128)) | (1L << (CURRENT_TRANSFORM_GROUP_FOR_TYPE - 128)) | (1L << (CURSOR - 128)) | (1L << (CURSOR_NAME - 128)) | (1L << (CYCLE - 128)) | (1L << (DATA - 128)) | (1L << (DATABASE - 128)) | (1L << (DATE - 128)) | (1L << (DATETIME_INTERVAL_CODE - 128)) | (1L << (DATETIME_INTERVAL_PRECISION - 128)) | (1L << (DAY - 128)) | (1L << (DEALLOCATE - 128)) | (1L << (DEC - 128)) | (1L << (DECIMAL - 128)) | (1L << (DECLARE - 128)) | (1L << (DEFAULTS - 128)) | (1L << (DEFERRED - 128)) | (1L << (DEFINED - 128)) | (1L << (DEFINER - 128)) | (1L << (DEGREE - 128)) | (1L << (DELETE - 128)) | (1L << (DELIMITER - 128)) | (1L << (DELIMITERS - 128)) | (1L << (DENSE_RANK - 128)) | (1L << (DEPTH - 128)) | (1L << (DEREF - 128)) | (1L << (DERIVED - 128)) | (1L << (DESCRIBE - 128)) | (1L << (DESCRIPTOR - 128)) | (1L << (DETERMINISTIC - 128)) | (1L << (DIAGNOSTICS - 128)) | (1L << (DICTIONARY - 128)) | (1L << (DISCONNECT - 128)) | (1L << (DISPATCH - 128)) | (1L << (DOMAIN - 128)) | (1L << (DOUBLE - 128)) | (1L << (DROP - 128)) | (1L << (DYNAMIC - 128)) | (1L << (DYNAMIC_FUNCTION - 128)) | (1L << (DYNAMIC_FUNCTION_CODE - 128)) | (1L << (EACH - 128)) | (1L << (ELEMENT - 128)) | (1L << (ENCODING - 128)) | (1L << (ENCRYPTED - 128)) | (1L << (END - 128)) | (1L << (EQUALS - 128)) | (1L << (ESCAPE - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (EVERY - 192)) | (1L << (EXCEPTION - 192)) | (1L << (EXCLUDE - 192)) | (1L << (EXCLUDING - 192)) | (1L << (EXCLUSIVE - 192)) | (1L << (EXEC - 192)) | (1L << (EXECUTE - 192)) | (1L << (EXISTS - 192)) | (1L << (EXP - 192)) | (1L << (EXPLAIN - 192)) | (1L << (EXTERNAL - 192)) | (1L << (EXTRACT - 192)) | (1L << (FILTER - 192)) | (1L << (FINAL - 192)) | (1L << (FIRST - 192)) | (1L << (FLOAT - 192)) | (1L << (FLOOR - 192)) | (1L << (FOLLOWING - 192)) | (1L << (FORCE - 192)) | (1L << (FORTRAN - 192)) | (1L << (FORWARD - 192)) | (1L << (FOUND - 192)) | (1L << (FREE - 192)) | (1L << (FUNCTION - 192)) | (1L << (FUSION - 192)) | (1L << (G_ - 192)) | (1L << (GENERAL - 192)) | (1L << (GENERATED - 192)) | (1L << (GET - 192)) | (1L << (GLOBAL - 192)) | (1L << (GO - 192)) | (1L << (GOTO - 192)) | (1L << (GRANTED - 192)) | (1L << (GROUPING - 192)) | (1L << (HANDLER - 192)) | (1L << (HIERARCHY - 192)) | (1L << (HOLD - 192)) | (1L << (HOUR - 192)) | (1L << (IDENTITY - 192)) | (1L << (IGNORE - 192)) | (1L << (IMMEDIATE - 192)) | (1L << (IMMUTABLE - 192)) | (1L << (IMPLEMENTATION - 192)) | (1L << (IMPLICIT - 192)) | (1L << (INCLUDING - 192)) | (1L << (INCREMENT - 192)) | (1L << (INDEX - 192)) | (1L << (INDICATOR - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (INHERITS - 256)) | (1L << (INOUT - 256)) | (1L << (INPUT - 256)) | (1L << (INSENSITIVE - 256)) | (1L << (INSERT - 256)) | (1L << (INSTANCE - 256)) | (1L << (INSTANTIABLE - 256)) | (1L << (INSTEAD - 256)) | (1L << (INT - 256)) | (1L << (INTEGER - 256)) | (1L << (INTERSECTION - 256)) | (1L << (INTERVAL - 256)) | (1L << (INVOKER - 256)) | (1L << (ISOLATION - 256)) | (1L << (KEY - 256)) | (1L << (KEY_MEMBER - 256)) | (1L << (KEY_TYPE - 256)) | (1L << (LANGUAGE - 256)) | (1L << (LARGE - 256)) | (1L << (LAST - 256)) | (1L << (LEFT - 256)) | (1L << (LENGTH - 256)) | (1L << (LEVEL - 256)) | (1L << (LISTEN - 256)) | (1L << (LN - 256)) | (1L << (LOAD - 256)) | (1L << (LOCAL - 256)) | (1L << (LOCATION - 256)) | (1L << (LOCATOR - 256)) | (1L << (LOCK - 256)) | (1L << (LOCKED - 256)) | (1L << (LOWER - 256)) | (1L << (M_ - 256)) | (1L << (MAP - 256)) | (1L << (MATCH - 256)) | (1L << (MATCHED - 256)) | (1L << (MAX - 256)) | (1L << (MAXVALUE - 256)) | (1L << (MEMBER - 256)) | (1L << (MERGE - 256)) | (1L << (MESSAGE_LENGTH - 256)) | (1L << (MESSAGE_OCTET_LENGTH - 256)) | (1L << (MESSAGE_TEXT - 256)) | (1L << (METHOD - 256)) | (1L << (MIN - 256)) | (1L << (MINUTE - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (MINVALUE - 320)) | (1L << (MOD - 320)) | (1L << (MODE - 320)) | (1L << (MODIFIES - 320)) | (1L << (MODULE - 320)) | (1L << (MONTH - 320)) | (1L << (MORE_ - 320)) | (1L << (MOVE - 320)) | (1L << (MULTISET - 320)) | (1L << (MUMPS - 320)) | (1L << (NAME - 320)) | (1L << (NAMES - 320)) | (1L << (NATIONAL - 320)) | (1L << (NCHAR - 320)) | (1L << (NCLOB - 320)) | (1L << (NESTING - 320)) | (1L << (NEW - 320)) | (1L << (NEXT - 320)) | (1L << (NO - 320)) | (1L << (NONE - 320)) | (1L << (NORMALIZE - 320)) | (1L << (NORMALIZED - 320)) | (1L << (NOTHING - 320)) | (1L << (NOTIFY - 320)) | (1L << (NOWAIT - 320)) | (1L << (NULLABLE - 320)) | (1L << (NULLIF - 320)) | (1L << (NULLS - 320)) | (1L << (NUMBER - 320)) | (1L << (NUMERIC - 320)) | (1L << (OBJECT - 320)) | (1L << (OCTETS - 320)) | (1L << (OCTET_LENGTH - 320)) | (1L << (OF - 320)) | (1L << (OFF - 320)) | (1L << (OIDS - 320)) | (1L << (OLD - 320)) | (1L << (OPEN - 320)) | (1L << (OPERATOR - 320)) | (1L << (OPTION - 320)) | (1L << (OPTIONS - 320)) | (1L << (ORDERING - 320)) | (1L << (ORDINALITY - 320)) | (1L << (OTHERS - 320)) | (1L << (OUT - 320)) | (1L << (OUTPUT - 320)) | (1L << (OVER - 320)) | (1L << (OVERLAY - 320)) | (1L << (OVERRIDING - 320)))) != 0) || ((((_la - 384)) & ~0x3f) == 0 && ((1L << (_la - 384)) & ((1L << (OWNER - 384)) | (1L << (PAD - 384)) | (1L << (PARAMETER - 384)) | (1L << (PARAMETER_MODE - 384)) | (1L << (PARAMETER_NAME - 384)) | (1L << (PARAMETER_ORDINAL_POSITION - 384)) | (1L << (PARAMETER_SPECIFIC_CATALOG - 384)) | (1L << (PARAMETER_SPECIFIC_NAME - 384)) | (1L << (PARAMETER_SPECIFIC_SCHEMA - 384)) | (1L << (PARTIAL - 384)) | (1L << (PARTITION - 384)) | (1L << (PASCAL - 384)) | (1L << (PASSWORD - 384)) | (1L << (PATH - 384)) | (1L << (PERCENTILE_CONT - 384)) | (1L << (PERCENTILE_DISC - 384)) | (1L << (PERCENT_RANK - 384)) | (1L << (PLI - 384)) | (1L << (POSITION - 384)) | (1L << (POWER - 384)) | (1L << (PRECEDING - 384)) | (1L << (PRECISION - 384)) | (1L << (PREPARE - 384)) | (1L << (PRESERVE - 384)) | (1L << (PRIOR - 384)) | (1L << (PRIVILEGES - 384)) | (1L << (PROCEDURAL - 384)) | (1L << (PROCEDURE - 384)) | (1L << (PUBLIC - 384)) | (1L << (QUOTE - 384)) | (1L << (RANGE - 384)) | (1L << (RANK - 384)) | (1L << (READ - 384)) | (1L << (READS - 384)) | (1L << (REAL - 384)) | (1L << (RECHECK - 384)) | (1L << (RECURSIVE - 384)) | (1L << (REF - 384)) | (1L << (REFERENCING - 384)) | (1L << (REGR_AVGX - 384)) | (1L << (REGR_AVGY - 384)) | (1L << (REGR_COUNT - 384)) | (1L << (REGR_INTERCEPT - 384)) | (1L << (REGR_SLOPE - 384)) | (1L << (REGR_SXX - 384)) | (1L << (REGR_SXY - 384)) | (1L << (REGR_SYY - 384)) | (1L << (REINDEX - 384)) | (1L << (RELATIVE - 384)) | (1L << (RELEASE - 384)) | (1L << (RENAME - 384)) | (1L << (REPEATABLE - 384)) | (1L << (REPLACE - 384)) | (1L << (RESET - 384)) | (1L << (RESTART - 384)) | (1L << (RESTRICT - 384)))) != 0) || ((((_la - 448)) & ~0x3f) == 0 && ((1L << (_la - 448)) & ((1L << (RESULT - 448)) | (1L << (RETURN - 448)) | (1L << (RETURNED_CARDINALITY - 448)) | (1L << (RETURNED_LENGTH - 448)) | (1L << (RETURNED_OCTET_LENGTH - 448)) | (1L << (RETURNED_SQLSTATE - 448)) | (1L << (RETURNS - 448)) | (1L << (REVOKE - 448)) | (1L << (RIGHT - 448)) | (1L << (ROLE - 448)) | (1L << (ROLLBACK - 448)) | (1L << (ROLLUP - 448)) | (1L << (ROUTINE - 448)) | (1L << (ROUTINE_CATALOG - 448)) | (1L << (ROUTINE_NAME - 448)) | (1L << (ROUTINE_SCHEMA - 448)) | (1L << (ROW - 448)) | (1L << (ROWS - 448)) | (1L << (ROW_COUNT - 448)) | (1L << (ROW_NUMBER - 448)) | (1L << (RULE - 448)) | (1L << (SAVEPOINT - 448)) | (1L << (SCALE - 448)) | (1L << (SCHEMA - 448)) | (1L << (SCHEMA_NAME - 448)) | (1L << (SCOPE - 448)) | (1L << (SCOPE_CATALOG - 448)) | (1L << (SCOPE_NAME - 448)) | (1L << (SCOPE_SCHEMA - 448)) | (1L << (SCROLL - 448)) | (1L << (SEARCH - 448)) | (1L << (SECOND - 448)) | (1L << (SECTION - 448)) | (1L << (SECURITY - 448)) | (1L << (SELF - 448)) | (1L << (SENSITIVE - 448)) | (1L << (SEQUENCE - 448)) | (1L << (SERIALIZABLE - 448)) | (1L << (SERVER_NAME - 448)) | (1L << (SESSION - 448)) | (1L << (SET - 448)) | (1L << (SETOF - 448)) | (1L << (SETS - 448)) | (1L << (SHARE - 448)) | (1L << (SHOW - 448)) | (1L << (SIMPLE - 448)) | (1L << (SIZE - 448)) | (1L << (SMALLINT - 448)) | (1L << (SOURCE - 448)) | (1L << (SPACE - 448)) | (1L << (SPECIFIC - 448)) | (1L << (SPECIFICTYPE - 448)) | (1L << (SPECIFIC_NAME - 448)) | (1L << (SQL - 448)) | (1L << (SQLCODE - 448)) | (1L << (SQLERROR - 448)) | (1L << (SQLEXCEPTION - 448)) | (1L << (SQLSTATE - 448)) | (1L << (SQLWARNING - 448)))) != 0) || ((((_la - 512)) & ~0x3f) == 0 && ((1L << (_la - 512)) & ((1L << (SQRT - 512)) | (1L << (STABLE - 512)) | (1L << (START - 512)) | (1L << (STATE - 512)) | (1L << (STATEMENT - 512)) | (1L << (STATIC - 512)) | (1L << (STATISTICS - 512)) | (1L << (STDDEV_POP - 512)) | (1L << (STDDEV_SAMP - 512)) | (1L << (STDIN - 512)) | (1L << (STDOUT - 512)) | (1L << (STORAGE - 512)) | (1L << (STRICT - 512)) | (1L << (STRUCTURE - 512)) | (1L << (STYLE - 512)) | (1L << (SUBCLASS_ORIGIN - 512)) | (1L << (SUBMULTISET - 512)) | (1L << (SUBSTRING - 512)) | (1L << (SUM - 512)) | (1L << (SYSID - 512)) | (1L << (SYSTEM - 512)) | (1L << (SYSTEM_USER - 512)) | (1L << (TABLESPACE - 512)) | (1L << (TABLE_NAME - 512)) | (1L << (TEMP - 512)) | (1L << (TEMPLATE - 512)) | (1L << (TEMPORARY - 512)) | (1L << (TIES - 512)) | (1L << (TIME - 512)) | (1L << (TIMESTAMP - 512)) | (1L << (TIMEZONE_HOUR - 512)) | (1L << (TIMEZONE_MINUTE - 512)) | (1L << (TOP_LEVEL_COUNT - 512)) | (1L << (TRANSACTION - 512)) | (1L << (TRANSACTIONS_COMMITTED - 512)) | (1L << (TRANSACTIONS_ROLLED_BACK - 512)) | (1L << (TRANSACTION_ACTIVE - 512)) | (1L << (TRANSFORM - 512)) | (1L << (TRANSFORMS - 512)) | (1L << (TRANSLATE - 512)) | (1L << (TRANSLATION - 512)) | (1L << (TREAT - 512)) | (1L << (TRIGGER - 512)) | (1L << (TRIGGER_CATALOG - 512)) | (1L << (TRIGGER_NAME - 512)) | (1L << (TRIGGER_SCHEMA - 512)) | (1L << (TRIM - 512)) | (1L << (TRUNCATE - 512)) | (1L << (TRUSTED - 512)) | (1L << (TYPE - 512)) | (1L << (UESCAPE - 512)))) != 0) || ((((_la - 576)) & ~0x3f) == 0 && ((1L << (_la - 576)) & ((1L << (UNBOUNDED - 576)) | (1L << (UNCOMMITTED - 576)) | (1L << (UNDER - 576)) | (1L << (UNENCRYPTED - 576)) | (1L << (UNKNOWN - 576)) | (1L << (UNLISTEN - 576)) | (1L << (UNNAMED - 576)) | (1L << (UNNEST - 576)) | (1L << (UNTIL - 576)) | (1L << (UPDATE - 576)) | (1L << (UPPER - 576)) | (1L << (USAGE - 576)) | (1L << (USER_DEFINED_TYPE_CATALOG - 576)) | (1L << (USER_DEFINED_TYPE_CODE - 576)) | (1L << (USER_DEFINED_TYPE_NAME - 576)) | (1L << (USER_DEFINED_TYPE_SCHEMA - 576)) | (1L << (VACUUM - 576)) | (1L << (VALID - 576)) | (1L << (VALIDATOR - 576)) | (1L << (VALUE - 576)) | (1L << (VALUES - 576)) | (1L << (VARCHAR - 576)) | (1L << (VARYING - 576)) | (1L << (VAR_POP - 576)) | (1L << (VAR_SAMP - 576)) | (1L << (VIEW - 576)) | (1L << (VOLATILE - 576)) | (1L << (WHENEVER - 576)) | (1L << (WIDTH_BUCKET - 576)) | (1L << (WITHIN - 576)) | (1L << (WITHOUT - 576)) | (1L << (WORK - 576)) | (1L << (WRITE - 576)) | (1L << (YEAR - 576)) | (1L << (ZONE - 576)))) != 0) || _la==IF || _la==IDENTIFIER) {
				{
				setState(1349);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(1346);
					match(IF);
					setState(1347);
					match(NOT);
					setState(1348);
					match(EXISTS);
					}
				}

				setState(1351);
				((Create_index_stmtContext)_localctx).index_name = identifier(0);
				}
			}

			setState(1354);
			match(ON);
			setState(1355);
			((Create_index_stmtContext)_localctx).tableName = identifier(0);
			setState(1358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(1356);
				match(USING);
				setState(1357);
				index_method();
				}
			}

			setState(1362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TABLESPACE) {
				{
				setState(1360);
				match(TABLESPACE);
				setState(1361);
				((Create_index_stmtContext)_localctx).tablespace_name = identifier(0);
				}
			}

			setState(1366);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(1364);
				match(WHERE);
				setState(1365);
				predicate(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_language_stmtContext extends ParserRuleContext {
		public IdentifierContext language_name;
		public IdentifierContext call_handler;
		public IdentifierContext inline_handler;
		public IdentifierContext valfunction;
		public TerminalNode CREATE() { return getToken(PostgreSQLParser.CREATE, 0); }
		public TerminalNode LANGUAGE() { return getToken(PostgreSQLParser.LANGUAGE, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode OR() { return getToken(PostgreSQLParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(PostgreSQLParser.REPLACE, 0); }
		public TerminalNode PROCEDURAL() { return getToken(PostgreSQLParser.PROCEDURAL, 0); }
		public TerminalNode HANDLER() { return getToken(PostgreSQLParser.HANDLER, 0); }
		public TerminalNode TRUSTED() { return getToken(PostgreSQLParser.TRUSTED, 0); }
		public TerminalNode INLINE() { return getToken(PostgreSQLParser.INLINE, 0); }
		public TerminalNode VALIDATOR() { return getToken(PostgreSQLParser.VALIDATOR, 0); }
		public Create_language_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_language_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterCreate_language_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitCreate_language_stmt(this);
		}
	}

	public final Create_language_stmtContext create_language_stmt() throws RecognitionException {
		Create_language_stmtContext _localctx = new Create_language_stmtContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_create_language_stmt);
		int _la;
		try {
			setState(1401);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1368);
				match(CREATE);
				setState(1371);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(1369);
					match(OR);
					setState(1370);
					match(REPLACE);
					}
				}

				setState(1374);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PROCEDURAL) {
					{
					setState(1373);
					match(PROCEDURAL);
					}
				}

				setState(1376);
				match(LANGUAGE);
				setState(1377);
				((Create_language_stmtContext)_localctx).language_name = identifier(0);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1378);
				match(CREATE);
				setState(1381);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(1379);
					match(OR);
					setState(1380);
					match(REPLACE);
					}
				}

				setState(1384);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TRUSTED) {
					{
					setState(1383);
					match(TRUSTED);
					}
				}

				setState(1387);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PROCEDURAL) {
					{
					setState(1386);
					match(PROCEDURAL);
					}
				}

				setState(1389);
				match(LANGUAGE);
				setState(1390);
				((Create_language_stmtContext)_localctx).language_name = identifier(0);
				setState(1391);
				match(HANDLER);
				setState(1392);
				((Create_language_stmtContext)_localctx).call_handler = identifier(0);
				setState(1395);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INLINE) {
					{
					setState(1393);
					match(INLINE);
					setState(1394);
					((Create_language_stmtContext)_localctx).inline_handler = identifier(0);
					}
				}

				setState(1399);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VALIDATOR) {
					{
					setState(1397);
					match(VALIDATOR);
					setState(1398);
					((Create_language_stmtContext)_localctx).valfunction = identifier(0);
					}
				}

				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_materialized_view_stmtContext extends ParserRuleContext {
		public IdentifierContext tableName;
		public Identifier_listContext columns;
		public IdentifierContext tablespace_name;
		public Select_stmtContext query;
		public TerminalNode CREATE() { return getToken(PostgreSQLParser.CREATE, 0); }
		public TerminalNode MATERIALIZED() { return getToken(PostgreSQLParser.MATERIALIZED, 0); }
		public TerminalNode VIEW() { return getToken(PostgreSQLParser.VIEW, 0); }
		public TerminalNode AS() { return getToken(PostgreSQLParser.AS, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode IF() { return getToken(PostgreSQLParser.IF, 0); }
		public TerminalNode NOT() { return getToken(PostgreSQLParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(PostgreSQLParser.EXISTS, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(PostgreSQLParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(PostgreSQLParser.CLOSE_PAREN, 0); }
		public List<TerminalNode> WITH() { return getTokens(PostgreSQLParser.WITH); }
		public TerminalNode WITH(int i) {
			return getToken(PostgreSQLParser.WITH, i);
		}
		public TerminalNode TABLESPACE() { return getToken(PostgreSQLParser.TABLESPACE, 0); }
		public TerminalNode DATA() { return getToken(PostgreSQLParser.DATA, 0); }
		public Identifier_listContext identifier_list() {
			return getRuleContext(Identifier_listContext.class,0);
		}
		public TerminalNode NO() { return getToken(PostgreSQLParser.NO, 0); }
		public Create_materialized_view_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_materialized_view_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterCreate_materialized_view_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitCreate_materialized_view_stmt(this);
		}
	}

	public final Create_materialized_view_stmtContext create_materialized_view_stmt() throws RecognitionException {
		Create_materialized_view_stmtContext _localctx = new Create_materialized_view_stmtContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_create_materialized_view_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1403);
			match(CREATE);
			setState(1404);
			match(MATERIALIZED);
			setState(1405);
			match(VIEW);
			setState(1409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(1406);
				match(IF);
				setState(1407);
				match(NOT);
				setState(1408);
				match(EXISTS);
				}
			}

			setState(1411);
			((Create_materialized_view_stmtContext)_localctx).tableName = identifier(0);
			setState(1416);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAREN) {
				{
				setState(1412);
				match(OPEN_PAREN);
				setState(1413);
				((Create_materialized_view_stmtContext)_localctx).columns = identifier_list();
				setState(1414);
				match(CLOSE_PAREN);
				}
			}

			setState(1419);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1418);
				match(WITH);
				}
			}

			setState(1423);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TABLESPACE) {
				{
				setState(1421);
				match(TABLESPACE);
				setState(1422);
				((Create_materialized_view_stmtContext)_localctx).tablespace_name = identifier(0);
				}
			}

			setState(1425);
			match(AS);
			setState(1426);
			((Create_materialized_view_stmtContext)_localctx).query = select_stmt();
			setState(1432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1427);
				match(WITH);
				setState(1429);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NO) {
					{
					setState(1428);
					match(NO);
					}
				}

				setState(1431);
				match(DATA);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_operator_stmtContext extends ParserRuleContext {
		public IdentifierContext opName;
		public IdentifierContext function_name;
		public NameContext left_type;
		public NameContext right_type;
		public NameContext com_op;
		public NameContext neg_op;
		public NameContext res_proc;
		public NameContext join_proc;
		public TerminalNode CREATE() { return getToken(PostgreSQLParser.CREATE, 0); }
		public TerminalNode OPERATOR() { return getToken(PostgreSQLParser.OPERATOR, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(PostgreSQLParser.OPEN_PAREN, 0); }
		public TerminalNode PROCEDURE() { return getToken(PostgreSQLParser.PROCEDURE, 0); }
		public List<TerminalNode> EQUAL() { return getTokens(PostgreSQLParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(PostgreSQLParser.EQUAL, i);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(PostgreSQLParser.CLOSE_PAREN, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PostgreSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PostgreSQLParser.COMMA, i);
		}
		public TerminalNode LEFTARG() { return getToken(PostgreSQLParser.LEFTARG, 0); }
		public TerminalNode RIGHTARG() { return getToken(PostgreSQLParser.RIGHTARG, 0); }
		public TerminalNode COMMUTATOR() { return getToken(PostgreSQLParser.COMMUTATOR, 0); }
		public TerminalNode NEGATOR() { return getToken(PostgreSQLParser.NEGATOR, 0); }
		public TerminalNode RESTRICT() { return getToken(PostgreSQLParser.RESTRICT, 0); }
		public TerminalNode JOIN() { return getToken(PostgreSQLParser.JOIN, 0); }
		public TerminalNode HASHES() { return getToken(PostgreSQLParser.HASHES, 0); }
		public TerminalNode MERGES() { return getToken(PostgreSQLParser.MERGES, 0); }
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public Create_operator_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_operator_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterCreate_operator_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitCreate_operator_stmt(this);
		}
	}

	public final Create_operator_stmtContext create_operator_stmt() throws RecognitionException {
		Create_operator_stmtContext _localctx = new Create_operator_stmtContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_create_operator_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1434);
			match(CREATE);
			setState(1435);
			match(OPERATOR);
			setState(1436);
			((Create_operator_stmtContext)_localctx).opName = identifier(0);
			setState(1437);
			match(OPEN_PAREN);
			setState(1438);
			match(PROCEDURE);
			setState(1439);
			match(EQUAL);
			setState(1440);
			((Create_operator_stmtContext)_localctx).function_name = identifier(0);
			setState(1445);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				{
				setState(1441);
				match(COMMA);
				setState(1442);
				match(LEFTARG);
				setState(1443);
				match(EQUAL);
				setState(1444);
				((Create_operator_stmtContext)_localctx).left_type = name();
				}
				break;
			}
			setState(1451);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				{
				setState(1447);
				match(COMMA);
				setState(1448);
				match(RIGHTARG);
				setState(1449);
				match(EQUAL);
				setState(1450);
				((Create_operator_stmtContext)_localctx).right_type = name();
				}
				break;
			}
			setState(1457);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				{
				setState(1453);
				match(COMMA);
				setState(1454);
				match(COMMUTATOR);
				setState(1455);
				match(EQUAL);
				setState(1456);
				((Create_operator_stmtContext)_localctx).com_op = name();
				}
				break;
			}
			setState(1463);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				{
				setState(1459);
				match(COMMA);
				setState(1460);
				match(NEGATOR);
				setState(1461);
				match(EQUAL);
				setState(1462);
				((Create_operator_stmtContext)_localctx).neg_op = name();
				}
				break;
			}
			setState(1469);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				{
				setState(1465);
				match(COMMA);
				setState(1466);
				match(RESTRICT);
				setState(1467);
				match(EQUAL);
				setState(1468);
				((Create_operator_stmtContext)_localctx).res_proc = name();
				}
				break;
			}
			setState(1475);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				{
				setState(1471);
				match(COMMA);
				setState(1472);
				match(JOIN);
				setState(1473);
				match(EQUAL);
				setState(1474);
				((Create_operator_stmtContext)_localctx).join_proc = name();
				}
				break;
			}
			setState(1479);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				{
				setState(1477);
				match(COMMA);
				setState(1478);
				match(HASHES);
				}
				break;
			}
			setState(1483);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1481);
				match(COMMA);
				setState(1482);
				match(MERGES);
				}
			}

			setState(1485);
			match(CLOSE_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_operator_class_optContext extends ParserRuleContext {
		public Token strategy_number;
		public IdentifierContext opName;
		public Token support_number;
		public IdentifierContext func_name_;
		public IdentifierContext storage_type;
		public TerminalNode OPERATOR() { return getToken(PostgreSQLParser.OPERATOR, 0); }
		public TerminalNode INTEGER_LITERAL() { return getToken(PostgreSQLParser.INTEGER_LITERAL, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> OPEN_PAREN() { return getTokens(PostgreSQLParser.OPEN_PAREN); }
		public TerminalNode OPEN_PAREN(int i) {
			return getToken(PostgreSQLParser.OPEN_PAREN, i);
		}
		public TerminalNode COMMA() { return getToken(PostgreSQLParser.COMMA, 0); }
		public List<TerminalNode> CLOSE_PAREN() { return getTokens(PostgreSQLParser.CLOSE_PAREN); }
		public TerminalNode CLOSE_PAREN(int i) {
			return getToken(PostgreSQLParser.CLOSE_PAREN, i);
		}
		public TerminalNode FUNCTION() { return getToken(PostgreSQLParser.FUNCTION, 0); }
		public Type_listContext type_list() {
			return getRuleContext(Type_listContext.class,0);
		}
		public TerminalNode STORAGE() { return getToken(PostgreSQLParser.STORAGE, 0); }
		public Create_operator_class_optContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_operator_class_opt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterCreate_operator_class_opt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitCreate_operator_class_opt(this);
		}
	}

	public final Create_operator_class_optContext create_operator_class_opt() throws RecognitionException {
		Create_operator_class_optContext _localctx = new Create_operator_class_optContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_create_operator_class_opt);
		int _la;
		try {
			setState(1517);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPERATOR:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1487);
				match(OPERATOR);
				setState(1488);
				((Create_operator_class_optContext)_localctx).strategy_number = match(INTEGER_LITERAL);
				setState(1489);
				((Create_operator_class_optContext)_localctx).opName = identifier(0);
				setState(1496);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_PAREN) {
					{
					setState(1490);
					match(OPEN_PAREN);
					setState(1491);
					identifier(0);
					setState(1492);
					match(COMMA);
					setState(1493);
					identifier(0);
					setState(1494);
					match(CLOSE_PAREN);
					}
				}

				}
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1498);
				match(FUNCTION);
				setState(1499);
				((Create_operator_class_optContext)_localctx).support_number = match(INTEGER_LITERAL);
				setState(1508);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_PAREN) {
					{
					setState(1500);
					match(OPEN_PAREN);
					setState(1501);
					identifier(0);
					setState(1504);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(1502);
						match(COMMA);
						setState(1503);
						identifier(0);
						}
					}

					setState(1506);
					match(CLOSE_PAREN);
					}
				}

				setState(1510);
				((Create_operator_class_optContext)_localctx).func_name_ = identifier(0);
				setState(1511);
				match(OPEN_PAREN);
				setState(1512);
				type_list();
				setState(1513);
				match(CLOSE_PAREN);
				}
				}
				break;
			case STORAGE:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(1515);
				match(STORAGE);
				setState(1516);
				((Create_operator_class_optContext)_localctx).storage_type = identifier(0);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_operator_class_stmtContext extends ParserRuleContext {
		public IdentifierContext name_;
		public IdentifierContext data_type;
		public IdentifierContext family_name;
		public TerminalNode CREATE() { return getToken(PostgreSQLParser.CREATE, 0); }
		public TerminalNode OPERATOR() { return getToken(PostgreSQLParser.OPERATOR, 0); }
		public TerminalNode CLASS() { return getToken(PostgreSQLParser.CLASS, 0); }
		public TerminalNode FOR() { return getToken(PostgreSQLParser.FOR, 0); }
		public TerminalNode TYPE() { return getToken(PostgreSQLParser.TYPE, 0); }
		public TerminalNode USING() { return getToken(PostgreSQLParser.USING, 0); }
		public Index_methodContext index_method() {
			return getRuleContext(Index_methodContext.class,0);
		}
		public TerminalNode AS() { return getToken(PostgreSQLParser.AS, 0); }
		public List<Create_operator_class_optContext> create_operator_class_opt() {
			return getRuleContexts(Create_operator_class_optContext.class);
		}
		public Create_operator_class_optContext create_operator_class_opt(int i) {
			return getRuleContext(Create_operator_class_optContext.class,i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode DEFAULT() { return getToken(PostgreSQLParser.DEFAULT, 0); }
		public TerminalNode FAMILY() { return getToken(PostgreSQLParser.FAMILY, 0); }
		public List<TerminalNode> COMMA() { return getTokens(PostgreSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PostgreSQLParser.COMMA, i);
		}
		public Create_operator_class_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_operator_class_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterCreate_operator_class_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitCreate_operator_class_stmt(this);
		}
	}

	public final Create_operator_class_stmtContext create_operator_class_stmt() throws RecognitionException {
		Create_operator_class_stmtContext _localctx = new Create_operator_class_stmtContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_create_operator_class_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1519);
			match(CREATE);
			setState(1520);
			match(OPERATOR);
			setState(1521);
			match(CLASS);
			setState(1522);
			((Create_operator_class_stmtContext)_localctx).name_ = identifier(0);
			setState(1524);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(1523);
				match(DEFAULT);
				}
			}

			setState(1526);
			match(FOR);
			setState(1527);
			match(TYPE);
			setState(1528);
			((Create_operator_class_stmtContext)_localctx).data_type = identifier(0);
			setState(1529);
			match(USING);
			setState(1530);
			index_method();
			setState(1533);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FAMILY) {
				{
				setState(1531);
				match(FAMILY);
				setState(1532);
				((Create_operator_class_stmtContext)_localctx).family_name = identifier(0);
				}
			}

			setState(1535);
			match(AS);
			setState(1536);
			create_operator_class_opt();
			setState(1541);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1537);
				match(COMMA);
				setState(1538);
				create_operator_class_opt();
				}
				}
				setState(1543);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_operator_family_stmtContext extends ParserRuleContext {
		public IdentifierContext name_;
		public TerminalNode CREATE() { return getToken(PostgreSQLParser.CREATE, 0); }
		public TerminalNode OPERATOR() { return getToken(PostgreSQLParser.OPERATOR, 0); }
		public TerminalNode FAMILY() { return getToken(PostgreSQLParser.FAMILY, 0); }
		public TerminalNode USING() { return getToken(PostgreSQLParser.USING, 0); }
		public Index_methodContext index_method() {
			return getRuleContext(Index_methodContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Create_operator_family_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_operator_family_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterCreate_operator_family_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitCreate_operator_family_stmt(this);
		}
	}

	public final Create_operator_family_stmtContext create_operator_family_stmt() throws RecognitionException {
		Create_operator_family_stmtContext _localctx = new Create_operator_family_stmtContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_create_operator_family_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1544);
			match(CREATE);
			setState(1545);
			match(OPERATOR);
			setState(1546);
			match(FAMILY);
			setState(1547);
			((Create_operator_family_stmtContext)_localctx).name_ = identifier(0);
			setState(1548);
			match(USING);
			setState(1549);
			index_method();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_policy_stmtContext extends ParserRuleContext {
		public IdentifierContext name_;
		public IdentifierContext tableName;
		public IdentifierContext role_name;
		public TerminalNode CREATE() { return getToken(PostgreSQLParser.CREATE, 0); }
		public TerminalNode POLICY() { return getToken(PostgreSQLParser.POLICY, 0); }
		public TerminalNode ON() { return getToken(PostgreSQLParser.ON, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode FOR() { return getToken(PostgreSQLParser.FOR, 0); }
		public TerminalNode TO() { return getToken(PostgreSQLParser.TO, 0); }
		public TerminalNode USING() { return getToken(PostgreSQLParser.USING, 0); }
		public List<TerminalNode> OPEN_PAREN() { return getTokens(PostgreSQLParser.OPEN_PAREN); }
		public TerminalNode OPEN_PAREN(int i) {
			return getToken(PostgreSQLParser.OPEN_PAREN, i);
		}
		public List<PredicateContext> predicate() {
			return getRuleContexts(PredicateContext.class);
		}
		public PredicateContext predicate(int i) {
			return getRuleContext(PredicateContext.class,i);
		}
		public List<TerminalNode> CLOSE_PAREN() { return getTokens(PostgreSQLParser.CLOSE_PAREN); }
		public TerminalNode CLOSE_PAREN(int i) {
			return getToken(PostgreSQLParser.CLOSE_PAREN, i);
		}
		public TerminalNode WITH() { return getToken(PostgreSQLParser.WITH, 0); }
		public TerminalNode CHECK() { return getToken(PostgreSQLParser.CHECK, 0); }
		public TerminalNode ALL() { return getToken(PostgreSQLParser.ALL, 0); }
		public TerminalNode SELECT() { return getToken(PostgreSQLParser.SELECT, 0); }
		public TerminalNode INSERT() { return getToken(PostgreSQLParser.INSERT, 0); }
		public TerminalNode UPDATE() { return getToken(PostgreSQLParser.UPDATE, 0); }
		public TerminalNode DELETE() { return getToken(PostgreSQLParser.DELETE, 0); }
		public TerminalNode PUBLIC() { return getToken(PostgreSQLParser.PUBLIC, 0); }
		public TerminalNode CURRENT_USER() { return getToken(PostgreSQLParser.CURRENT_USER, 0); }
		public TerminalNode SESSION_USER() { return getToken(PostgreSQLParser.SESSION_USER, 0); }
		public Create_policy_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_policy_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterCreate_policy_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitCreate_policy_stmt(this);
		}
	}

	public final Create_policy_stmtContext create_policy_stmt() throws RecognitionException {
		Create_policy_stmtContext _localctx = new Create_policy_stmtContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_create_policy_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1551);
			match(CREATE);
			setState(1552);
			match(POLICY);
			setState(1553);
			((Create_policy_stmtContext)_localctx).name_ = identifier(0);
			setState(1554);
			match(ON);
			setState(1555);
			((Create_policy_stmtContext)_localctx).tableName = identifier(0);
			setState(1558);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FOR) {
				{
				setState(1556);
				match(FOR);
				setState(1557);
				_la = _input.LA(1);
				if ( !(_la==ALL || _la==DELETE || _la==INSERT || _la==SELECT || _la==UPDATE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1567);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TO) {
				{
				setState(1560);
				match(TO);
				setState(1565);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
				case 1:
					{
					setState(1561);
					((Create_policy_stmtContext)_localctx).role_name = identifier(0);
					}
					break;
				case 2:
					{
					setState(1562);
					match(PUBLIC);
					}
					break;
				case 3:
					{
					setState(1563);
					match(CURRENT_USER);
					}
					break;
				case 4:
					{
					setState(1564);
					match(SESSION_USER);
					}
					break;
				}
				}
			}

			setState(1574);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(1569);
				match(USING);
				setState(1570);
				match(OPEN_PAREN);
				setState(1571);
				predicate(0);
				setState(1572);
				match(CLOSE_PAREN);
				}
			}

			setState(1582);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1576);
				match(WITH);
				setState(1577);
				match(CHECK);
				setState(1578);
				match(OPEN_PAREN);
				setState(1579);
				predicate(0);
				setState(1580);
				match(CLOSE_PAREN);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_role_stmtContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(PostgreSQLParser.CREATE, 0); }
		public List<TerminalNode> ROLE() { return getTokens(PostgreSQLParser.ROLE); }
		public TerminalNode ROLE(int i) {
			return getToken(PostgreSQLParser.ROLE, i);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode CURRENT_USER() { return getToken(PostgreSQLParser.CURRENT_USER, 0); }
		public TerminalNode SESSION_USER() { return getToken(PostgreSQLParser.SESSION_USER, 0); }
		public TerminalNode WITH() { return getToken(PostgreSQLParser.WITH, 0); }
		public List<TerminalNode> SUPERUSER() { return getTokens(PostgreSQLParser.SUPERUSER); }
		public TerminalNode SUPERUSER(int i) {
			return getToken(PostgreSQLParser.SUPERUSER, i);
		}
		public List<TerminalNode> NOSUPERUSER() { return getTokens(PostgreSQLParser.NOSUPERUSER); }
		public TerminalNode NOSUPERUSER(int i) {
			return getToken(PostgreSQLParser.NOSUPERUSER, i);
		}
		public List<TerminalNode> CREATEDB() { return getTokens(PostgreSQLParser.CREATEDB); }
		public TerminalNode CREATEDB(int i) {
			return getToken(PostgreSQLParser.CREATEDB, i);
		}
		public List<TerminalNode> NOCREATEDB() { return getTokens(PostgreSQLParser.NOCREATEDB); }
		public TerminalNode NOCREATEDB(int i) {
			return getToken(PostgreSQLParser.NOCREATEDB, i);
		}
		public List<TerminalNode> CREATEROLE() { return getTokens(PostgreSQLParser.CREATEROLE); }
		public TerminalNode CREATEROLE(int i) {
			return getToken(PostgreSQLParser.CREATEROLE, i);
		}
		public List<TerminalNode> NOCREATEROLE() { return getTokens(PostgreSQLParser.NOCREATEROLE); }
		public TerminalNode NOCREATEROLE(int i) {
			return getToken(PostgreSQLParser.NOCREATEROLE, i);
		}
		public List<TerminalNode> INHERIT() { return getTokens(PostgreSQLParser.INHERIT); }
		public TerminalNode INHERIT(int i) {
			return getToken(PostgreSQLParser.INHERIT, i);
		}
		public List<TerminalNode> NOINHERIT() { return getTokens(PostgreSQLParser.NOINHERIT); }
		public TerminalNode NOINHERIT(int i) {
			return getToken(PostgreSQLParser.NOINHERIT, i);
		}
		public List<TerminalNode> LOGIN() { return getTokens(PostgreSQLParser.LOGIN); }
		public TerminalNode LOGIN(int i) {
			return getToken(PostgreSQLParser.LOGIN, i);
		}
		public List<TerminalNode> NOLOGIN() { return getTokens(PostgreSQLParser.NOLOGIN); }
		public TerminalNode NOLOGIN(int i) {
			return getToken(PostgreSQLParser.NOLOGIN, i);
		}
		public List<TerminalNode> REPLICATION() { return getTokens(PostgreSQLParser.REPLICATION); }
		public TerminalNode REPLICATION(int i) {
			return getToken(PostgreSQLParser.REPLICATION, i);
		}
		public List<TerminalNode> NOREPLICATION() { return getTokens(PostgreSQLParser.NOREPLICATION); }
		public TerminalNode NOREPLICATION(int i) {
			return getToken(PostgreSQLParser.NOREPLICATION, i);
		}
		public List<TerminalNode> BYPASSRLS() { return getTokens(PostgreSQLParser.BYPASSRLS); }
		public TerminalNode BYPASSRLS(int i) {
			return getToken(PostgreSQLParser.BYPASSRLS, i);
		}
		public List<TerminalNode> NOBYPASSRLS() { return getTokens(PostgreSQLParser.NOBYPASSRLS); }
		public TerminalNode NOBYPASSRLS(int i) {
			return getToken(PostgreSQLParser.NOBYPASSRLS, i);
		}
		public List<TerminalNode> CONNECTION() { return getTokens(PostgreSQLParser.CONNECTION); }
		public TerminalNode CONNECTION(int i) {
			return getToken(PostgreSQLParser.CONNECTION, i);
		}
		public List<TerminalNode> LIMIT() { return getTokens(PostgreSQLParser.LIMIT); }
		public TerminalNode LIMIT(int i) {
			return getToken(PostgreSQLParser.LIMIT, i);
		}
		public List<TerminalNode> INTEGER_LITERAL() { return getTokens(PostgreSQLParser.INTEGER_LITERAL); }
		public TerminalNode INTEGER_LITERAL(int i) {
			return getToken(PostgreSQLParser.INTEGER_LITERAL, i);
		}
		public List<TerminalNode> PASSWORD() { return getTokens(PostgreSQLParser.PASSWORD); }
		public TerminalNode PASSWORD(int i) {
			return getToken(PostgreSQLParser.PASSWORD, i);
		}
		public List<TerminalNode> VALID() { return getTokens(PostgreSQLParser.VALID); }
		public TerminalNode VALID(int i) {
			return getToken(PostgreSQLParser.VALID, i);
		}
		public List<TerminalNode> UNTIL() { return getTokens(PostgreSQLParser.UNTIL); }
		public TerminalNode UNTIL(int i) {
			return getToken(PostgreSQLParser.UNTIL, i);
		}
		public List<TerminalNode> SINGLEQ_STRING_LITERAL() { return getTokens(PostgreSQLParser.SINGLEQ_STRING_LITERAL); }
		public TerminalNode SINGLEQ_STRING_LITERAL(int i) {
			return getToken(PostgreSQLParser.SINGLEQ_STRING_LITERAL, i);
		}
		public List<TerminalNode> IN() { return getTokens(PostgreSQLParser.IN); }
		public TerminalNode IN(int i) {
			return getToken(PostgreSQLParser.IN, i);
		}
		public List<Name_listContext> name_list() {
			return getRuleContexts(Name_listContext.class);
		}
		public Name_listContext name_list(int i) {
			return getRuleContext(Name_listContext.class,i);
		}
		public List<TerminalNode> GROUP() { return getTokens(PostgreSQLParser.GROUP); }
		public TerminalNode GROUP(int i) {
			return getToken(PostgreSQLParser.GROUP, i);
		}
		public List<TerminalNode> ADMIN() { return getTokens(PostgreSQLParser.ADMIN); }
		public TerminalNode ADMIN(int i) {
			return getToken(PostgreSQLParser.ADMIN, i);
		}
		public List<TerminalNode> USER() { return getTokens(PostgreSQLParser.USER); }
		public TerminalNode USER(int i) {
			return getToken(PostgreSQLParser.USER, i);
		}
		public List<TerminalNode> SYSID() { return getTokens(PostgreSQLParser.SYSID); }
		public TerminalNode SYSID(int i) {
			return getToken(PostgreSQLParser.SYSID, i);
		}
		public List<TerminalNode> NULL() { return getTokens(PostgreSQLParser.NULL); }
		public TerminalNode NULL(int i) {
			return getToken(PostgreSQLParser.NULL, i);
		}
		public List<TerminalNode> ENCRYPTED() { return getTokens(PostgreSQLParser.ENCRYPTED); }
		public TerminalNode ENCRYPTED(int i) {
			return getToken(PostgreSQLParser.ENCRYPTED, i);
		}
		public Create_role_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_role_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterCreate_role_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitCreate_role_stmt(this);
		}
	}

	public final Create_role_stmtContext create_role_stmt() throws RecognitionException {
		Create_role_stmtContext _localctx = new Create_role_stmtContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_create_role_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1584);
			match(CREATE);
			setState(1585);
			match(ROLE);
			setState(1589);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHITESPACE:
			case A_:
			case ABORT:
			case ABS:
			case ABSOLUTE:
			case ACCESS:
			case ACTION:
			case ADA:
			case ADD:
			case ADMIN:
			case AFTER:
			case AGGREGATE:
			case ALLOCATE:
			case ALSO:
			case ALTER:
			case ALWAYS:
			case ARE:
			case ASENSITIVE:
			case ASSERTION:
			case ASSIGNMENT:
			case AT:
			case ATOMIC:
			case ATTRIBUTE:
			case ATTRIBUTES:
			case AVG:
			case BACKWARD:
			case BEFORE:
			case BEGIN:
			case BERNOULLI:
			case BETWEEN:
			case BIGINT:
			case BIT:
			case BIT_LENGTH:
			case BLOB:
			case BOOLEAN:
			case BREADTH:
			case BY:
			case C_:
			case CACHE:
			case CALL:
			case CALLED:
			case CARDINALITY:
			case CASCADE:
			case CASCADED:
			case CATALOG:
			case CATALOG_NAME:
			case CEIL:
			case CEILING:
			case CHAIN:
			case CHAR:
			case CHARACTER:
			case CHARACTERISTICS:
			case CHARACTERS:
			case CHARACTER_LENGTH:
			case CHARACTER_SET_CATALOG:
			case CHARACTER_SET_NAME:
			case CHARACTER_SET_SCHEMA:
			case CHAR_LENGTH:
			case CHECKPOINT:
			case CLASS:
			case CLASS_ORIGIN:
			case CLOB:
			case CLOSE:
			case CLUSTER:
			case COALESCE:
			case COBOL:
			case COLLATION_CATALOG:
			case COLLATION_NAME:
			case COLLATION_SCHEMA:
			case COLLECT:
			case COLUMN_NAME:
			case COMMAND_FUNCTION:
			case COMMAND_FUNCTION_CODE:
			case COMMENT:
			case COMMIT:
			case COMMITTED:
			case CONDITION:
			case CONDITION_NUMBER:
			case CONNECT:
			case CONNECTION:
			case CONNECTION_NAME:
			case CONSTRAINTS:
			case CONSTRAINT_CATALOG:
			case CONSTRAINT_NAME:
			case CONSTRAINT_SCHEMA:
			case CONSTRUCTOR:
			case CONTAINS:
			case CONTINUE:
			case CONVERSION:
			case CONVERT:
			case COPY:
			case CORR:
			case CORRESPONDING:
			case COUNT:
			case COVAR_POP:
			case COVAR_SAMP:
			case CSV:
			case CUBE:
			case CUME_DIST:
			case CURRENT:
			case CURRENT_DEFAULT_TRANSFORM_GROUP:
			case CURRENT_PATH:
			case CURRENT_TRANSFORM_GROUP_FOR_TYPE:
			case CURSOR:
			case CURSOR_NAME:
			case CYCLE:
			case DATA:
			case DATABASE:
			case DATE:
			case DATETIME_INTERVAL_CODE:
			case DATETIME_INTERVAL_PRECISION:
			case DAY:
			case DEALLOCATE:
			case DEC:
			case DECIMAL:
			case DECLARE:
			case DEFAULTS:
			case DEFERRED:
			case DEFINED:
			case DEFINER:
			case DEGREE:
			case DELETE:
			case DELIMITER:
			case DELIMITERS:
			case DENSE_RANK:
			case DEPTH:
			case DEREF:
			case DERIVED:
			case DESCRIBE:
			case DESCRIPTOR:
			case DETERMINISTIC:
			case DIAGNOSTICS:
			case DICTIONARY:
			case DISCONNECT:
			case DISPATCH:
			case DOMAIN:
			case DOUBLE:
			case DROP:
			case DYNAMIC:
			case DYNAMIC_FUNCTION:
			case DYNAMIC_FUNCTION_CODE:
			case EACH:
			case ELEMENT:
			case ENCODING:
			case ENCRYPTED:
			case END:
			case EQUALS:
			case ESCAPE:
			case EVERY:
			case EXCEPTION:
			case EXCLUDE:
			case EXCLUDING:
			case EXCLUSIVE:
			case EXEC:
			case EXECUTE:
			case EXISTS:
			case EXP:
			case EXPLAIN:
			case EXTERNAL:
			case EXTRACT:
			case FILTER:
			case FINAL:
			case FIRST:
			case FLOAT:
			case FLOOR:
			case FOLLOWING:
			case FORCE:
			case FORTRAN:
			case FORWARD:
			case FOUND:
			case FREE:
			case FUNCTION:
			case FUSION:
			case G_:
			case GENERAL:
			case GENERATED:
			case GET:
			case GLOBAL:
			case GO:
			case GOTO:
			case GRANTED:
			case GROUPING:
			case HANDLER:
			case HIERARCHY:
			case HOLD:
			case HOUR:
			case IDENTITY:
			case IGNORE:
			case IMMEDIATE:
			case IMMUTABLE:
			case IMPLEMENTATION:
			case IMPLICIT:
			case INCLUDING:
			case INCREMENT:
			case INDEX:
			case INDICATOR:
			case INHERITS:
			case INOUT:
			case INPUT:
			case INSENSITIVE:
			case INSERT:
			case INSTANCE:
			case INSTANTIABLE:
			case INSTEAD:
			case INT:
			case INTEGER:
			case INTERSECTION:
			case INTERVAL:
			case INVOKER:
			case ISOLATION:
			case KEY:
			case KEY_MEMBER:
			case KEY_TYPE:
			case LANGUAGE:
			case LARGE:
			case LAST:
			case LEFT:
			case LENGTH:
			case LEVEL:
			case LISTEN:
			case LN:
			case LOAD:
			case LOCAL:
			case LOCATION:
			case LOCATOR:
			case LOCK:
			case LOCKED:
			case LOWER:
			case M_:
			case MAP:
			case MATCH:
			case MATCHED:
			case MAX:
			case MAXVALUE:
			case MEMBER:
			case MERGE:
			case MESSAGE_LENGTH:
			case MESSAGE_OCTET_LENGTH:
			case MESSAGE_TEXT:
			case METHOD:
			case MIN:
			case MINUTE:
			case MINVALUE:
			case MOD:
			case MODE:
			case MODIFIES:
			case MODULE:
			case MONTH:
			case MORE_:
			case MOVE:
			case MULTISET:
			case MUMPS:
			case NAME:
			case NAMES:
			case NATIONAL:
			case NCHAR:
			case NCLOB:
			case NESTING:
			case NEW:
			case NEXT:
			case NO:
			case NONE:
			case NORMALIZE:
			case NORMALIZED:
			case NOTHING:
			case NOTIFY:
			case NOWAIT:
			case NULLABLE:
			case NULLIF:
			case NULLS:
			case NUMBER:
			case NUMERIC:
			case OBJECT:
			case OCTETS:
			case OCTET_LENGTH:
			case OF:
			case OFF:
			case OIDS:
			case OLD:
			case OPEN:
			case OPERATOR:
			case OPTION:
			case OPTIONS:
			case ORDERING:
			case ORDINALITY:
			case OTHERS:
			case OUT:
			case OUTPUT:
			case OVER:
			case OVERLAY:
			case OVERRIDING:
			case OWNER:
			case PAD:
			case PARAMETER:
			case PARAMETER_MODE:
			case PARAMETER_NAME:
			case PARAMETER_ORDINAL_POSITION:
			case PARAMETER_SPECIFIC_CATALOG:
			case PARAMETER_SPECIFIC_NAME:
			case PARAMETER_SPECIFIC_SCHEMA:
			case PARTIAL:
			case PARTITION:
			case PASCAL:
			case PASSWORD:
			case PATH:
			case PERCENTILE_CONT:
			case PERCENTILE_DISC:
			case PERCENT_RANK:
			case PLI:
			case POSITION:
			case POWER:
			case PRECEDING:
			case PRECISION:
			case PREPARE:
			case PRESERVE:
			case PRIOR:
			case PRIVILEGES:
			case PROCEDURAL:
			case PROCEDURE:
			case PUBLIC:
			case QUOTE:
			case RANGE:
			case RANK:
			case READ:
			case READS:
			case REAL:
			case RECHECK:
			case RECURSIVE:
			case REF:
			case REFERENCING:
			case REGR_AVGX:
			case REGR_AVGY:
			case REGR_COUNT:
			case REGR_INTERCEPT:
			case REGR_SLOPE:
			case REGR_SXX:
			case REGR_SXY:
			case REGR_SYY:
			case REINDEX:
			case RELATIVE:
			case RELEASE:
			case RENAME:
			case REPEATABLE:
			case REPLACE:
			case RESET:
			case RESTART:
			case RESTRICT:
			case RESULT:
			case RETURN:
			case RETURNED_CARDINALITY:
			case RETURNED_LENGTH:
			case RETURNED_OCTET_LENGTH:
			case RETURNED_SQLSTATE:
			case RETURNS:
			case REVOKE:
			case RIGHT:
			case ROLE:
			case ROLLBACK:
			case ROLLUP:
			case ROUTINE:
			case ROUTINE_CATALOG:
			case ROUTINE_NAME:
			case ROUTINE_SCHEMA:
			case ROW:
			case ROWS:
			case ROW_COUNT:
			case ROW_NUMBER:
			case RULE:
			case SAVEPOINT:
			case SCALE:
			case SCHEMA:
			case SCHEMA_NAME:
			case SCOPE:
			case SCOPE_CATALOG:
			case SCOPE_NAME:
			case SCOPE_SCHEMA:
			case SCROLL:
			case SEARCH:
			case SECOND:
			case SECTION:
			case SECURITY:
			case SELF:
			case SENSITIVE:
			case SEQUENCE:
			case SERIALIZABLE:
			case SERVER_NAME:
			case SESSION:
			case SET:
			case SETOF:
			case SETS:
			case SHARE:
			case SHOW:
			case SIMPLE:
			case SIZE:
			case SMALLINT:
			case SOURCE:
			case SPACE:
			case SPECIFIC:
			case SPECIFICTYPE:
			case SPECIFIC_NAME:
			case SQL:
			case SQLCODE:
			case SQLERROR:
			case SQLEXCEPTION:
			case SQLSTATE:
			case SQLWARNING:
			case SQRT:
			case STABLE:
			case START:
			case STATE:
			case STATEMENT:
			case STATIC:
			case STATISTICS:
			case STDDEV_POP:
			case STDDEV_SAMP:
			case STDIN:
			case STDOUT:
			case STORAGE:
			case STRICT:
			case STRUCTURE:
			case STYLE:
			case SUBCLASS_ORIGIN:
			case SUBMULTISET:
			case SUBSTRING:
			case SUM:
			case SYSID:
			case SYSTEM:
			case SYSTEM_USER:
			case TABLESPACE:
			case TABLE_NAME:
			case TEMP:
			case TEMPLATE:
			case TEMPORARY:
			case TIES:
			case TIME:
			case TIMESTAMP:
			case TIMEZONE_HOUR:
			case TIMEZONE_MINUTE:
			case TOP_LEVEL_COUNT:
			case TRANSACTION:
			case TRANSACTIONS_COMMITTED:
			case TRANSACTIONS_ROLLED_BACK:
			case TRANSACTION_ACTIVE:
			case TRANSFORM:
			case TRANSFORMS:
			case TRANSLATE:
			case TRANSLATION:
			case TREAT:
			case TRIGGER:
			case TRIGGER_CATALOG:
			case TRIGGER_NAME:
			case TRIGGER_SCHEMA:
			case TRIM:
			case TRUNCATE:
			case TRUSTED:
			case TYPE:
			case UESCAPE:
			case UNBOUNDED:
			case UNCOMMITTED:
			case UNDER:
			case UNENCRYPTED:
			case UNKNOWN:
			case UNLISTEN:
			case UNNAMED:
			case UNNEST:
			case UNTIL:
			case UPDATE:
			case UPPER:
			case USAGE:
			case USER_DEFINED_TYPE_CATALOG:
			case USER_DEFINED_TYPE_CODE:
			case USER_DEFINED_TYPE_NAME:
			case USER_DEFINED_TYPE_SCHEMA:
			case VACUUM:
			case VALID:
			case VALIDATOR:
			case VALUE:
			case VALUES:
			case VARCHAR:
			case VARYING:
			case VAR_POP:
			case VAR_SAMP:
			case VIEW:
			case VOLATILE:
			case WHENEVER:
			case WIDTH_BUCKET:
			case WITHIN:
			case WITHOUT:
			case WORK:
			case WRITE:
			case YEAR:
			case ZONE:
			case SINGLEQ_STRING_LITERAL:
			case DOUBLEQ_STRING_LITERAL:
			case IDENTIFIER:
				{
				setState(1586);
				name();
				}
				break;
			case CURRENT_USER:
				{
				setState(1587);
				match(CURRENT_USER);
				}
				break;
			case SESSION_USER:
				{
				setState(1588);
				match(SESSION_USER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1637);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ADMIN || _la==CONNECTION || _la==CREATEDB || _la==ENCRYPTED || _la==IN || _la==NOCREATEDB || _la==PASSWORD || _la==ROLE || _la==SYSID || _la==USER || ((((_la - 597)) & ~0x3f) == 0 && ((1L << (_la - 597)) & ((1L << (VALID - 597)) | (1L << (WITH - 597)) | (1L << (SUPERUSER - 597)) | (1L << (NOSUPERUSER - 597)) | (1L << (CREATEROLE - 597)) | (1L << (NOCREATEROLE - 597)) | (1L << (INHERIT - 597)) | (1L << (NOINHERIT - 597)) | (1L << (LOGIN - 597)) | (1L << (NOLOGIN - 597)) | (1L << (REPLICATION - 597)) | (1L << (NOREPLICATION - 597)) | (1L << (BYPASSRLS - 597)) | (1L << (NOBYPASSRLS - 597)))) != 0)) {
				{
				setState(1592);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(1591);
					match(WITH);
					}
				}

				setState(1633); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(1633);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
					case 1:
						{
						setState(1594);
						match(SUPERUSER);
						}
						break;
					case 2:
						{
						setState(1595);
						match(NOSUPERUSER);
						}
						break;
					case 3:
						{
						setState(1596);
						match(CREATEDB);
						}
						break;
					case 4:
						{
						setState(1597);
						match(NOCREATEDB);
						}
						break;
					case 5:
						{
						setState(1598);
						match(CREATEROLE);
						}
						break;
					case 6:
						{
						setState(1599);
						match(NOCREATEROLE);
						}
						break;
					case 7:
						{
						setState(1600);
						match(INHERIT);
						}
						break;
					case 8:
						{
						setState(1601);
						match(NOINHERIT);
						}
						break;
					case 9:
						{
						setState(1602);
						match(LOGIN);
						}
						break;
					case 10:
						{
						setState(1603);
						match(NOLOGIN);
						}
						break;
					case 11:
						{
						setState(1604);
						match(REPLICATION);
						}
						break;
					case 12:
						{
						setState(1605);
						match(NOREPLICATION);
						}
						break;
					case 13:
						{
						setState(1606);
						match(BYPASSRLS);
						}
						break;
					case 14:
						{
						setState(1607);
						match(NOBYPASSRLS);
						}
						break;
					case 15:
						{
						setState(1608);
						match(CONNECTION);
						setState(1609);
						match(LIMIT);
						setState(1610);
						match(INTEGER_LITERAL);
						}
						break;
					case 16:
						{
						setState(1612);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ENCRYPTED) {
							{
							setState(1611);
							match(ENCRYPTED);
							}
						}

						setState(1614);
						match(PASSWORD);
						setState(1615);
						_la = _input.LA(1);
						if ( !(_la==NULL || _la==SINGLEQ_STRING_LITERAL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case 17:
						{
						setState(1616);
						match(VALID);
						setState(1617);
						match(UNTIL);
						setState(1618);
						match(SINGLEQ_STRING_LITERAL);
						}
						break;
					case 18:
						{
						setState(1619);
						match(IN);
						setState(1620);
						match(ROLE);
						setState(1621);
						name_list();
						}
						break;
					case 19:
						{
						setState(1622);
						match(IN);
						setState(1623);
						match(GROUP);
						setState(1624);
						name_list();
						}
						break;
					case 20:
						{
						setState(1625);
						match(ROLE);
						setState(1626);
						name_list();
						}
						break;
					case 21:
						{
						setState(1627);
						match(ADMIN);
						setState(1628);
						name_list();
						}
						break;
					case 22:
						{
						setState(1629);
						match(USER);
						setState(1630);
						name_list();
						}
						break;
					case 23:
						{
						setState(1631);
						match(SYSID);
						setState(1632);
						match(INTEGER_LITERAL);
						}
						break;
					}
					}
					setState(1635); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ADMIN || _la==CONNECTION || _la==CREATEDB || _la==ENCRYPTED || _la==IN || _la==NOCREATEDB || _la==PASSWORD || _la==ROLE || _la==SYSID || _la==USER || ((((_la - 597)) & ~0x3f) == 0 && ((1L << (_la - 597)) & ((1L << (VALID - 597)) | (1L << (SUPERUSER - 597)) | (1L << (NOSUPERUSER - 597)) | (1L << (CREATEROLE - 597)) | (1L << (NOCREATEROLE - 597)) | (1L << (INHERIT - 597)) | (1L << (NOINHERIT - 597)) | (1L << (LOGIN - 597)) | (1L << (NOLOGIN - 597)) | (1L << (REPLICATION - 597)) | (1L << (NOREPLICATION - 597)) | (1L << (BYPASSRLS - 597)) | (1L << (NOBYPASSRLS - 597)))) != 0) );
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_rule_eventContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(PostgreSQLParser.SELECT, 0); }
		public TerminalNode INSERT() { return getToken(PostgreSQLParser.INSERT, 0); }
		public TerminalNode UPDATE() { return getToken(PostgreSQLParser.UPDATE, 0); }
		public TerminalNode DELETE() { return getToken(PostgreSQLParser.DELETE, 0); }
		public Create_rule_eventContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_rule_event; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterCreate_rule_event(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitCreate_rule_event(this);
		}
	}

	public final Create_rule_eventContext create_rule_event() throws RecognitionException {
		Create_rule_eventContext _localctx = new Create_rule_eventContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_create_rule_event);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1639);
			_la = _input.LA(1);
			if ( !(_la==DELETE || _la==INSERT || _la==SELECT || _la==UPDATE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_rule_stmtContext extends ParserRuleContext {
		public NameContext name_;
		public Create_rule_eventContext event;
		public IdentifierContext tableName;
		public IdentifierContext command;
		public TerminalNode CREATE() { return getToken(PostgreSQLParser.CREATE, 0); }
		public TerminalNode RULE() { return getToken(PostgreSQLParser.RULE, 0); }
		public TerminalNode AS() { return getToken(PostgreSQLParser.AS, 0); }
		public TerminalNode ON() { return getToken(PostgreSQLParser.ON, 0); }
		public TerminalNode TO() { return getToken(PostgreSQLParser.TO, 0); }
		public TerminalNode DO() { return getToken(PostgreSQLParser.DO, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Create_rule_eventContext create_rule_event() {
			return getRuleContext(Create_rule_eventContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode NOTHING() { return getToken(PostgreSQLParser.NOTHING, 0); }
		public TerminalNode OR() { return getToken(PostgreSQLParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(PostgreSQLParser.REPLACE, 0); }
		public TerminalNode WHERE() { return getToken(PostgreSQLParser.WHERE, 0); }
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public TerminalNode ALSO() { return getToken(PostgreSQLParser.ALSO, 0); }
		public TerminalNode INSTEAD() { return getToken(PostgreSQLParser.INSTEAD, 0); }
		public Create_rule_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_rule_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterCreate_rule_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitCreate_rule_stmt(this);
		}
	}

	public final Create_rule_stmtContext create_rule_stmt() throws RecognitionException {
		Create_rule_stmtContext _localctx = new Create_rule_stmtContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_create_rule_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1641);
			match(CREATE);
			setState(1644);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OR) {
				{
				setState(1642);
				match(OR);
				setState(1643);
				match(REPLACE);
				}
			}

			setState(1646);
			match(RULE);
			setState(1647);
			((Create_rule_stmtContext)_localctx).name_ = name();
			setState(1648);
			match(AS);
			setState(1649);
			match(ON);
			setState(1650);
			((Create_rule_stmtContext)_localctx).event = create_rule_event();
			setState(1651);
			match(TO);
			setState(1652);
			((Create_rule_stmtContext)_localctx).tableName = identifier(0);
			setState(1655);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(1653);
				match(WHERE);
				setState(1654);
				predicate(0);
				}
			}

			setState(1657);
			match(DO);
			setState(1659);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				{
				setState(1658);
				_la = _input.LA(1);
				if ( !(_la==ALSO || _la==INSTEAD) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(1663);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				{
				setState(1661);
				match(NOTHING);
				}
				break;
			case 2:
				{
				setState(1662);
				((Create_rule_stmtContext)_localctx).command = identifier(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_schema_role_specContext extends ParserRuleContext {
		public IdentifierContext user_name;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode CURRENT_USER() { return getToken(PostgreSQLParser.CURRENT_USER, 0); }
		public TerminalNode SESSION_USER() { return getToken(PostgreSQLParser.SESSION_USER, 0); }
		public Create_schema_role_specContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_schema_role_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterCreate_schema_role_spec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitCreate_schema_role_spec(this);
		}
	}

	public final Create_schema_role_specContext create_schema_role_spec() throws RecognitionException {
		Create_schema_role_specContext _localctx = new Create_schema_role_specContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_create_schema_role_spec);
		try {
			setState(1668);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHITESPACE:
			case A_:
			case ABORT:
			case ABS:
			case ABSOLUTE:
			case ACCESS:
			case ACTION:
			case ADA:
			case ADD:
			case ADMIN:
			case AFTER:
			case AGGREGATE:
			case ALLOCATE:
			case ALSO:
			case ALTER:
			case ALWAYS:
			case ARE:
			case ASENSITIVE:
			case ASSERTION:
			case ASSIGNMENT:
			case AT:
			case ATOMIC:
			case ATTRIBUTE:
			case ATTRIBUTES:
			case AVG:
			case BACKWARD:
			case BEFORE:
			case BEGIN:
			case BERNOULLI:
			case BETWEEN:
			case BIGINT:
			case BIT:
			case BIT_LENGTH:
			case BLOB:
			case BOOLEAN:
			case BREADTH:
			case BY:
			case C_:
			case CACHE:
			case CALL:
			case CALLED:
			case CARDINALITY:
			case CASCADE:
			case CASCADED:
			case CATALOG:
			case CATALOG_NAME:
			case CEIL:
			case CEILING:
			case CHAIN:
			case CHAR:
			case CHARACTER:
			case CHARACTERISTICS:
			case CHARACTERS:
			case CHARACTER_LENGTH:
			case CHARACTER_SET_CATALOG:
			case CHARACTER_SET_NAME:
			case CHARACTER_SET_SCHEMA:
			case CHAR_LENGTH:
			case CHECKPOINT:
			case CLASS:
			case CLASS_ORIGIN:
			case CLOB:
			case CLOSE:
			case CLUSTER:
			case COALESCE:
			case COBOL:
			case COLLATION_CATALOG:
			case COLLATION_NAME:
			case COLLATION_SCHEMA:
			case COLLECT:
			case COLUMN_NAME:
			case COMMAND_FUNCTION:
			case COMMAND_FUNCTION_CODE:
			case COMMENT:
			case COMMIT:
			case COMMITTED:
			case CONDITION:
			case CONDITION_NUMBER:
			case CONNECT:
			case CONNECTION:
			case CONNECTION_NAME:
			case CONSTRAINTS:
			case CONSTRAINT_CATALOG:
			case CONSTRAINT_NAME:
			case CONSTRAINT_SCHEMA:
			case CONSTRUCTOR:
			case CONTAINS:
			case CONTINUE:
			case CONVERSION:
			case CONVERT:
			case COPY:
			case CORR:
			case CORRESPONDING:
			case COUNT:
			case COVAR_POP:
			case COVAR_SAMP:
			case CSV:
			case CUBE:
			case CUME_DIST:
			case CURRENT:
			case CURRENT_DEFAULT_TRANSFORM_GROUP:
			case CURRENT_PATH:
			case CURRENT_TRANSFORM_GROUP_FOR_TYPE:
			case CURSOR:
			case CURSOR_NAME:
			case CYCLE:
			case DATA:
			case DATABASE:
			case DATE:
			case DATETIME_INTERVAL_CODE:
			case DATETIME_INTERVAL_PRECISION:
			case DAY:
			case DEALLOCATE:
			case DEC:
			case DECIMAL:
			case DECLARE:
			case DEFAULTS:
			case DEFERRED:
			case DEFINED:
			case DEFINER:
			case DEGREE:
			case DELETE:
			case DELIMITER:
			case DELIMITERS:
			case DENSE_RANK:
			case DEPTH:
			case DEREF:
			case DERIVED:
			case DESCRIBE:
			case DESCRIPTOR:
			case DETERMINISTIC:
			case DIAGNOSTICS:
			case DICTIONARY:
			case DISCONNECT:
			case DISPATCH:
			case DOMAIN:
			case DOUBLE:
			case DROP:
			case DYNAMIC:
			case DYNAMIC_FUNCTION:
			case DYNAMIC_FUNCTION_CODE:
			case EACH:
			case ELEMENT:
			case ENCODING:
			case ENCRYPTED:
			case END:
			case EQUALS:
			case ESCAPE:
			case EVERY:
			case EXCEPTION:
			case EXCLUDE:
			case EXCLUDING:
			case EXCLUSIVE:
			case EXEC:
			case EXECUTE:
			case EXISTS:
			case EXP:
			case EXPLAIN:
			case EXTERNAL:
			case EXTRACT:
			case FILTER:
			case FINAL:
			case FIRST:
			case FLOAT:
			case FLOOR:
			case FOLLOWING:
			case FORCE:
			case FORTRAN:
			case FORWARD:
			case FOUND:
			case FREE:
			case FUNCTION:
			case FUSION:
			case G_:
			case GENERAL:
			case GENERATED:
			case GET:
			case GLOBAL:
			case GO:
			case GOTO:
			case GRANTED:
			case GROUPING:
			case HANDLER:
			case HIERARCHY:
			case HOLD:
			case HOUR:
			case IDENTITY:
			case IGNORE:
			case IMMEDIATE:
			case IMMUTABLE:
			case IMPLEMENTATION:
			case IMPLICIT:
			case INCLUDING:
			case INCREMENT:
			case INDEX:
			case INDICATOR:
			case INHERITS:
			case INOUT:
			case INPUT:
			case INSENSITIVE:
			case INSERT:
			case INSTANCE:
			case INSTANTIABLE:
			case INSTEAD:
			case INT:
			case INTEGER:
			case INTERSECTION:
			case INTERVAL:
			case INVOKER:
			case ISOLATION:
			case KEY:
			case KEY_MEMBER:
			case KEY_TYPE:
			case LANGUAGE:
			case LARGE:
			case LAST:
			case LEFT:
			case LENGTH:
			case LEVEL:
			case LISTEN:
			case LN:
			case LOAD:
			case LOCAL:
			case LOCATION:
			case LOCATOR:
			case LOCK:
			case LOCKED:
			case LOWER:
			case M_:
			case MAP:
			case MATCH:
			case MATCHED:
			case MAX:
			case MAXVALUE:
			case MEMBER:
			case MERGE:
			case MESSAGE_LENGTH:
			case MESSAGE_OCTET_LENGTH:
			case MESSAGE_TEXT:
			case METHOD:
			case MIN:
			case MINUTE:
			case MINVALUE:
			case MOD:
			case MODE:
			case MODIFIES:
			case MODULE:
			case MONTH:
			case MORE_:
			case MOVE:
			case MULTISET:
			case MUMPS:
			case NAME:
			case NAMES:
			case NATIONAL:
			case NCHAR:
			case NCLOB:
			case NESTING:
			case NEW:
			case NEXT:
			case NO:
			case NONE:
			case NORMALIZE:
			case NORMALIZED:
			case NOTHING:
			case NOTIFY:
			case NOWAIT:
			case NULLABLE:
			case NULLIF:
			case NULLS:
			case NUMBER:
			case NUMERIC:
			case OBJECT:
			case OCTETS:
			case OCTET_LENGTH:
			case OF:
			case OFF:
			case OIDS:
			case OLD:
			case OPEN:
			case OPERATOR:
			case OPTION:
			case OPTIONS:
			case ORDERING:
			case ORDINALITY:
			case OTHERS:
			case OUT:
			case OUTPUT:
			case OVER:
			case OVERLAY:
			case OVERRIDING:
			case OWNER:
			case PAD:
			case PARAMETER:
			case PARAMETER_MODE:
			case PARAMETER_NAME:
			case PARAMETER_ORDINAL_POSITION:
			case PARAMETER_SPECIFIC_CATALOG:
			case PARAMETER_SPECIFIC_NAME:
			case PARAMETER_SPECIFIC_SCHEMA:
			case PARTIAL:
			case PARTITION:
			case PASCAL:
			case PASSWORD:
			case PATH:
			case PERCENTILE_CONT:
			case PERCENTILE_DISC:
			case PERCENT_RANK:
			case PLI:
			case POSITION:
			case POWER:
			case PRECEDING:
			case PRECISION:
			case PREPARE:
			case PRESERVE:
			case PRIOR:
			case PRIVILEGES:
			case PROCEDURAL:
			case PROCEDURE:
			case PUBLIC:
			case QUOTE:
			case RANGE:
			case RANK:
			case READ:
			case READS:
			case REAL:
			case RECHECK:
			case RECURSIVE:
			case REF:
			case REFERENCING:
			case REGR_AVGX:
			case REGR_AVGY:
			case REGR_COUNT:
			case REGR_INTERCEPT:
			case REGR_SLOPE:
			case REGR_SXX:
			case REGR_SXY:
			case REGR_SYY:
			case REINDEX:
			case RELATIVE:
			case RELEASE:
			case RENAME:
			case REPEATABLE:
			case REPLACE:
			case RESET:
			case RESTART:
			case RESTRICT:
			case RESULT:
			case RETURN:
			case RETURNED_CARDINALITY:
			case RETURNED_LENGTH:
			case RETURNED_OCTET_LENGTH:
			case RETURNED_SQLSTATE:
			case RETURNS:
			case REVOKE:
			case RIGHT:
			case ROLE:
			case ROLLBACK:
			case ROLLUP:
			case ROUTINE:
			case ROUTINE_CATALOG:
			case ROUTINE_NAME:
			case ROUTINE_SCHEMA:
			case ROW:
			case ROWS:
			case ROW_COUNT:
			case ROW_NUMBER:
			case RULE:
			case SAVEPOINT:
			case SCALE:
			case SCHEMA:
			case SCHEMA_NAME:
			case SCOPE:
			case SCOPE_CATALOG:
			case SCOPE_NAME:
			case SCOPE_SCHEMA:
			case SCROLL:
			case SEARCH:
			case SECOND:
			case SECTION:
			case SECURITY:
			case SELF:
			case SENSITIVE:
			case SEQUENCE:
			case SERIALIZABLE:
			case SERVER_NAME:
			case SESSION:
			case SET:
			case SETOF:
			case SETS:
			case SHARE:
			case SHOW:
			case SIMPLE:
			case SIZE:
			case SMALLINT:
			case SOURCE:
			case SPACE:
			case SPECIFIC:
			case SPECIFICTYPE:
			case SPECIFIC_NAME:
			case SQL:
			case SQLCODE:
			case SQLERROR:
			case SQLEXCEPTION:
			case SQLSTATE:
			case SQLWARNING:
			case SQRT:
			case STABLE:
			case START:
			case STATE:
			case STATEMENT:
			case STATIC:
			case STATISTICS:
			case STDDEV_POP:
			case STDDEV_SAMP:
			case STDIN:
			case STDOUT:
			case STORAGE:
			case STRICT:
			case STRUCTURE:
			case STYLE:
			case SUBCLASS_ORIGIN:
			case SUBMULTISET:
			case SUBSTRING:
			case SUM:
			case SYSID:
			case SYSTEM:
			case SYSTEM_USER:
			case TABLESPACE:
			case TABLE_NAME:
			case TEMP:
			case TEMPLATE:
			case TEMPORARY:
			case TIES:
			case TIME:
			case TIMESTAMP:
			case TIMEZONE_HOUR:
			case TIMEZONE_MINUTE:
			case TOP_LEVEL_COUNT:
			case TRANSACTION:
			case TRANSACTIONS_COMMITTED:
			case TRANSACTIONS_ROLLED_BACK:
			case TRANSACTION_ACTIVE:
			case TRANSFORM:
			case TRANSFORMS:
			case TRANSLATE:
			case TRANSLATION:
			case TREAT:
			case TRIGGER:
			case TRIGGER_CATALOG:
			case TRIGGER_NAME:
			case TRIGGER_SCHEMA:
			case TRIM:
			case TRUNCATE:
			case TRUSTED:
			case TYPE:
			case UESCAPE:
			case UNBOUNDED:
			case UNCOMMITTED:
			case UNDER:
			case UNENCRYPTED:
			case UNKNOWN:
			case UNLISTEN:
			case UNNAMED:
			case UNNEST:
			case UNTIL:
			case UPDATE:
			case UPPER:
			case USAGE:
			case USER_DEFINED_TYPE_CATALOG:
			case USER_DEFINED_TYPE_CODE:
			case USER_DEFINED_TYPE_NAME:
			case USER_DEFINED_TYPE_SCHEMA:
			case VACUUM:
			case VALID:
			case VALIDATOR:
			case VALUE:
			case VALUES:
			case VARCHAR:
			case VARYING:
			case VAR_POP:
			case VAR_SAMP:
			case VIEW:
			case VOLATILE:
			case WHENEVER:
			case WIDTH_BUCKET:
			case WITHIN:
			case WITHOUT:
			case WORK:
			case WRITE:
			case YEAR:
			case ZONE:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1665);
				((Create_schema_role_specContext)_localctx).user_name = identifier(0);
				}
				break;
			case CURRENT_USER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1666);
				match(CURRENT_USER);
				}
				break;
			case SESSION_USER:
				enterOuterAlt(_localctx, 3);
				{
				setState(1667);
				match(SESSION_USER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_schema_stmtContext extends ParserRuleContext {
		public IdentifierContext schema_name;
		public TerminalNode CREATE() { return getToken(PostgreSQLParser.CREATE, 0); }
		public TerminalNode SCHEMA() { return getToken(PostgreSQLParser.SCHEMA, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AUTHORIZATION() { return getToken(PostgreSQLParser.AUTHORIZATION, 0); }
		public Create_schema_role_specContext create_schema_role_spec() {
			return getRuleContext(Create_schema_role_specContext.class,0);
		}
		public Todo_fill_inContext todo_fill_in() {
			return getRuleContext(Todo_fill_inContext.class,0);
		}
		public TerminalNode IF() { return getToken(PostgreSQLParser.IF, 0); }
		public TerminalNode NOT() { return getToken(PostgreSQLParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(PostgreSQLParser.EXISTS, 0); }
		public Create_schema_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_schema_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterCreate_schema_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitCreate_schema_stmt(this);
		}
	}

	public final Create_schema_stmtContext create_schema_stmt() throws RecognitionException {
		Create_schema_stmtContext _localctx = new Create_schema_stmtContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_create_schema_stmt);
		int _la;
		try {
			setState(1704);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1670);
				match(CREATE);
				setState(1671);
				match(SCHEMA);
				setState(1672);
				((Create_schema_stmtContext)_localctx).schema_name = identifier(0);
				setState(1675);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
				case 1:
					{
					setState(1673);
					match(AUTHORIZATION);
					setState(1674);
					create_schema_role_spec();
					}
					break;
				}
				setState(1678);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHITESPACE) | (1L << BLOCK_COMMENT) | (1L << LINE_COMMENT) | (1L << A_) | (1L << ABORT) | (1L << ABS) | (1L << ABSOLUTE) | (1L << ACCESS) | (1L << ACTION) | (1L << ADA) | (1L << ADD) | (1L << ADMIN) | (1L << AFTER) | (1L << AGGREGATE) | (1L << ALIAS) | (1L << ALL) | (1L << ALLOCATE) | (1L << ALSO) | (1L << ALTER) | (1L << ALWAYS) | (1L << ANALYSE) | (1L << ANALYZE) | (1L << AND) | (1L << ANY) | (1L << ARE) | (1L << ARRAY) | (1L << AS) | (1L << ASC) | (1L << ASENSITIVE) | (1L << ASSERTION) | (1L << ASSIGNMENT) | (1L << ASYMMETRIC) | (1L << AT) | (1L << ATOMIC) | (1L << ATTRIBUTE) | (1L << ATTRIBUTES) | (1L << AUTHORIZATION) | (1L << AVG) | (1L << BACKWARD) | (1L << BEFORE) | (1L << BEGIN) | (1L << BERNOULLI) | (1L << BETWEEN) | (1L << BIGINT) | (1L << BINARY) | (1L << BIT) | (1L << BITVAR) | (1L << BIT_LENGTH) | (1L << BLOB) | (1L << BOOLEAN) | (1L << BOTH) | (1L << BREADTH) | (1L << BY) | (1L << C_) | (1L << CACHE) | (1L << CALL) | (1L << CALLED) | (1L << CARDINALITY) | (1L << CASCADE) | (1L << CASCADED) | (1L << CASE) | (1L << CAST) | (1L << CATALOG))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CATALOG_NAME - 64)) | (1L << (CEIL - 64)) | (1L << (CEILING - 64)) | (1L << (CHAIN - 64)) | (1L << (CHAR - 64)) | (1L << (CHARACTER - 64)) | (1L << (CHARACTERISTICS - 64)) | (1L << (CHARACTERS - 64)) | (1L << (CHARACTER_LENGTH - 64)) | (1L << (CHARACTER_SET_CATALOG - 64)) | (1L << (CHARACTER_SET_NAME - 64)) | (1L << (CHARACTER_SET_SCHEMA - 64)) | (1L << (CHAR_LENGTH - 64)) | (1L << (CHECK - 64)) | (1L << (CHECKED - 64)) | (1L << (CHECKPOINT - 64)) | (1L << (CLASS - 64)) | (1L << (CLASS_ORIGIN - 64)) | (1L << (CLOB - 64)) | (1L << (CLOSE - 64)) | (1L << (CLUSTER - 64)) | (1L << (COALESCE - 64)) | (1L << (COBOL - 64)) | (1L << (COLLATE - 64)) | (1L << (COLLATION - 64)) | (1L << (COLLATION_CATALOG - 64)) | (1L << (COLLATION_NAME - 64)) | (1L << (COLLATION_SCHEMA - 64)) | (1L << (COLLECT - 64)) | (1L << (COLUMN - 64)) | (1L << (COLUMN_NAME - 64)) | (1L << (COMMAND_FUNCTION - 64)) | (1L << (COMMAND_FUNCTION_CODE - 64)) | (1L << (COMMENT - 64)) | (1L << (COMMIT - 64)) | (1L << (COMMITTED - 64)) | (1L << (COMPLETION - 64)) | (1L << (CONDITION - 64)) | (1L << (CONDITION_NUMBER - 64)) | (1L << (CONNECT - 64)) | (1L << (CONNECTION - 64)) | (1L << (CONNECTION_NAME - 64)) | (1L << (CONSTRAINT - 64)) | (1L << (CONSTRAINTS - 64)) | (1L << (CONSTRAINT_CATALOG - 64)) | (1L << (CONSTRAINT_NAME - 64)) | (1L << (CONSTRAINT_SCHEMA - 64)) | (1L << (CONSTRUCTOR - 64)) | (1L << (CONTAINS - 64)) | (1L << (CONTINUE - 64)) | (1L << (CONVERSION - 64)) | (1L << (CONVERT - 64)) | (1L << (COPY - 64)) | (1L << (CORR - 64)) | (1L << (CORRESPONDING - 64)) | (1L << (COUNT - 64)) | (1L << (COVAR_POP - 64)) | (1L << (COVAR_SAMP - 64)) | (1L << (CREATE - 64)) | (1L << (CREATEDB - 64)) | (1L << (CREATEUSER - 64)) | (1L << (CROSS - 64)) | (1L << (CSV - 64)) | (1L << (CUBE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (CUME_DIST - 128)) | (1L << (CURRENT - 128)) | (1L << (CURRENT_DATE - 128)) | (1L << (CURRENT_DEFAULT_TRANSFORM_GROUP - 128)) | (1L << (CURRENT_PATH - 128)) | (1L << (CURRENT_ROLE - 128)) | (1L << (CURRENT_TIME - 128)) | (1L << (CURRENT_TIMESTAMP - 128)) | (1L << (CURRENT_TRANSFORM_GROUP_FOR_TYPE - 128)) | (1L << (CURRENT_USER - 128)) | (1L << (CURSOR - 128)) | (1L << (CURSOR_NAME - 128)) | (1L << (CYCLE - 128)) | (1L << (DATA - 128)) | (1L << (DATABASE - 128)) | (1L << (DATE - 128)) | (1L << (DATETIME_INTERVAL_CODE - 128)) | (1L << (DATETIME_INTERVAL_PRECISION - 128)) | (1L << (DAY - 128)) | (1L << (DEALLOCATE - 128)) | (1L << (DEC - 128)) | (1L << (DECIMAL - 128)) | (1L << (DECLARE - 128)) | (1L << (DEFAULT - 128)) | (1L << (DEFAULTS - 128)) | (1L << (DEFERRABLE - 128)) | (1L << (DEFERRED - 128)) | (1L << (DEFINED - 128)) | (1L << (DEFINER - 128)) | (1L << (DEGREE - 128)) | (1L << (DELETE - 128)) | (1L << (DELIMITER - 128)) | (1L << (DELIMITERS - 128)) | (1L << (DENSE_RANK - 128)) | (1L << (DEPTH - 128)) | (1L << (DEREF - 128)) | (1L << (DERIVED - 128)) | (1L << (DESC - 128)) | (1L << (DESCRIBE - 128)) | (1L << (DESCRIPTOR - 128)) | (1L << (DESTROY - 128)) | (1L << (DESTRUCTOR - 128)) | (1L << (DETERMINISTIC - 128)) | (1L << (DIAGNOSTICS - 128)) | (1L << (DICTIONARY - 128)) | (1L << (DISCONNECT - 128)) | (1L << (DISPATCH - 128)) | (1L << (DISTINCT - 128)) | (1L << (DO - 128)) | (1L << (DOMAIN - 128)) | (1L << (DOUBLE - 128)) | (1L << (DROP - 128)) | (1L << (DYNAMIC - 128)) | (1L << (DYNAMIC_FUNCTION - 128)) | (1L << (DYNAMIC_FUNCTION_CODE - 128)) | (1L << (EACH - 128)) | (1L << (ELEMENT - 128)) | (1L << (ELSE - 128)) | (1L << (ENCODING - 128)) | (1L << (ENCRYPTED - 128)) | (1L << (END - 128)) | (1L << (END_EXEC - 128)) | (1L << (EQUALS - 128)) | (1L << (ESCAPE - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (EVERY - 192)) | (1L << (EXCEPT - 192)) | (1L << (EXCEPTION - 192)) | (1L << (EXCLUDE - 192)) | (1L << (EXCLUDING - 192)) | (1L << (EXCLUSIVE - 192)) | (1L << (EXEC - 192)) | (1L << (EXECUTE - 192)) | (1L << (EXISTING - 192)) | (1L << (EXISTS - 192)) | (1L << (EXP - 192)) | (1L << (EXPLAIN - 192)) | (1L << (EXTERNAL - 192)) | (1L << (EXTRACT - 192)) | (1L << (FALSE - 192)) | (1L << (FETCH - 192)) | (1L << (FILTER - 192)) | (1L << (FINAL - 192)) | (1L << (FIRST - 192)) | (1L << (FLOAT - 192)) | (1L << (FLOOR - 192)) | (1L << (FOLLOWING - 192)) | (1L << (FOR - 192)) | (1L << (FORCE - 192)) | (1L << (FOREIGN - 192)) | (1L << (FORTRAN - 192)) | (1L << (FORWARD - 192)) | (1L << (FOUND - 192)) | (1L << (FREE - 192)) | (1L << (FREEZE - 192)) | (1L << (FROM - 192)) | (1L << (FULL - 192)) | (1L << (FUNCTION - 192)) | (1L << (FUSION - 192)) | (1L << (G_ - 192)) | (1L << (GENERAL - 192)) | (1L << (GENERATED - 192)) | (1L << (GET - 192)) | (1L << (GLOBAL - 192)) | (1L << (GO - 192)) | (1L << (GOTO - 192)) | (1L << (GRANT - 192)) | (1L << (GRANTED - 192)) | (1L << (GROUP - 192)) | (1L << (GROUPING - 192)) | (1L << (HANDLER - 192)) | (1L << (HAVING - 192)) | (1L << (HIERARCHY - 192)) | (1L << (HOLD - 192)) | (1L << (HOST - 192)) | (1L << (HOUR - 192)) | (1L << (IDENTITY - 192)) | (1L << (IGNORE - 192)) | (1L << (ILIKE - 192)) | (1L << (IMMEDIATE - 192)) | (1L << (IMMUTABLE - 192)) | (1L << (IMPLEMENTATION - 192)) | (1L << (IMPLICIT - 192)) | (1L << (IN - 192)) | (1L << (INCLUDING - 192)) | (1L << (INCREMENT - 192)) | (1L << (INDEX - 192)) | (1L << (INDICATOR - 192)) | (1L << (INFIX - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (INHERITS - 256)) | (1L << (INITIALIZE - 256)) | (1L << (INITIALLY - 256)) | (1L << (INNER - 256)) | (1L << (INOUT - 256)) | (1L << (INPUT - 256)) | (1L << (INSENSITIVE - 256)) | (1L << (INSERT - 256)) | (1L << (INSTANCE - 256)) | (1L << (INSTANTIABLE - 256)) | (1L << (INSTEAD - 256)) | (1L << (INT - 256)) | (1L << (INTEGER - 256)) | (1L << (INTERSECT - 256)) | (1L << (INTERSECTION - 256)) | (1L << (INTERVAL - 256)) | (1L << (INTO - 256)) | (1L << (INVOKER - 256)) | (1L << (IS - 256)) | (1L << (ISNULL - 256)) | (1L << (ISOLATION - 256)) | (1L << (ITERATE - 256)) | (1L << (JOIN - 256)) | (1L << (K_ - 256)) | (1L << (KEY - 256)) | (1L << (KEY_MEMBER - 256)) | (1L << (KEY_TYPE - 256)) | (1L << (LANCOMPILER - 256)) | (1L << (LANGUAGE - 256)) | (1L << (LARGE - 256)) | (1L << (LAST - 256)) | (1L << (LATERAL - 256)) | (1L << (LEADING - 256)) | (1L << (LEFT - 256)) | (1L << (LENGTH - 256)) | (1L << (LESS - 256)) | (1L << (LEVEL - 256)) | (1L << (LIKE - 256)) | (1L << (LIMIT - 256)) | (1L << (LISTEN - 256)) | (1L << (LN - 256)) | (1L << (LOAD - 256)) | (1L << (LOCAL - 256)) | (1L << (LOCALTIME - 256)) | (1L << (LOCALTIMESTAMP - 256)) | (1L << (LOCATION - 256)) | (1L << (LOCATOR - 256)) | (1L << (LOCK - 256)) | (1L << (LOCKED - 256)) | (1L << (LOWER - 256)) | (1L << (M_ - 256)) | (1L << (MAP - 256)) | (1L << (MATCH - 256)) | (1L << (MATCHED - 256)) | (1L << (MAX - 256)) | (1L << (MAXVALUE - 256)) | (1L << (MEMBER - 256)) | (1L << (MERGE - 256)) | (1L << (MESSAGE_LENGTH - 256)) | (1L << (MESSAGE_OCTET_LENGTH - 256)) | (1L << (MESSAGE_TEXT - 256)) | (1L << (METHOD - 256)) | (1L << (MIN - 256)) | (1L << (MINUTE - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (MINVALUE - 320)) | (1L << (MOD - 320)) | (1L << (MODE - 320)) | (1L << (MODIFIES - 320)) | (1L << (MODIFY - 320)) | (1L << (MODULE - 320)) | (1L << (MONTH - 320)) | (1L << (MORE_ - 320)) | (1L << (MOVE - 320)) | (1L << (MULTISET - 320)) | (1L << (MUMPS - 320)) | (1L << (NAME - 320)) | (1L << (NAMES - 320)) | (1L << (NATIONAL - 320)) | (1L << (NATURAL - 320)) | (1L << (NCHAR - 320)) | (1L << (NCLOB - 320)) | (1L << (NESTING - 320)) | (1L << (NEW - 320)) | (1L << (NEXT - 320)) | (1L << (NO - 320)) | (1L << (NOCREATEDB - 320)) | (1L << (NOCREATEUSER - 320)) | (1L << (NONE - 320)) | (1L << (NORMALIZE - 320)) | (1L << (NORMALIZED - 320)) | (1L << (NOT - 320)) | (1L << (NOTHING - 320)) | (1L << (NOTIFY - 320)) | (1L << (NOTNULL - 320)) | (1L << (NOWAIT - 320)) | (1L << (NULL - 320)) | (1L << (NULLABLE - 320)) | (1L << (NULLIF - 320)) | (1L << (NULLS - 320)) | (1L << (NUMBER - 320)) | (1L << (NUMERIC - 320)) | (1L << (OBJECT - 320)) | (1L << (OCTETS - 320)) | (1L << (OCTET_LENGTH - 320)) | (1L << (OF - 320)) | (1L << (OFF - 320)) | (1L << (OFFSET - 320)) | (1L << (OIDS - 320)) | (1L << (OLD - 320)) | (1L << (ON - 320)) | (1L << (ONLY - 320)) | (1L << (OPEN - 320)) | (1L << (OPERATION - 320)) | (1L << (OPERATOR - 320)) | (1L << (OPTION - 320)) | (1L << (OPTIONS - 320)) | (1L << (OR - 320)) | (1L << (ORDER - 320)) | (1L << (ORDERING - 320)) | (1L << (ORDINALITY - 320)) | (1L << (OTHERS - 320)) | (1L << (OUT - 320)) | (1L << (OUTER - 320)) | (1L << (OUTPUT - 320)) | (1L << (OVER - 320)) | (1L << (OVERLAPS - 320)) | (1L << (OVERLAY - 320)) | (1L << (OVERRIDING - 320)))) != 0) || ((((_la - 384)) & ~0x3f) == 0 && ((1L << (_la - 384)) & ((1L << (OWNER - 384)) | (1L << (PAD - 384)) | (1L << (PARAMETER - 384)) | (1L << (PARAMETERS - 384)) | (1L << (PARAMETER_MODE - 384)) | (1L << (PARAMETER_NAME - 384)) | (1L << (PARAMETER_ORDINAL_POSITION - 384)) | (1L << (PARAMETER_SPECIFIC_CATALOG - 384)) | (1L << (PARAMETER_SPECIFIC_NAME - 384)) | (1L << (PARAMETER_SPECIFIC_SCHEMA - 384)) | (1L << (PARTIAL - 384)) | (1L << (PARTITION - 384)) | (1L << (PASCAL - 384)) | (1L << (PASSWORD - 384)) | (1L << (PATH - 384)) | (1L << (PERCENTILE_CONT - 384)) | (1L << (PERCENTILE_DISC - 384)) | (1L << (PERCENT_RANK - 384)) | (1L << (PLACING - 384)) | (1L << (PLI - 384)) | (1L << (POSITION - 384)) | (1L << (POSTFIX - 384)) | (1L << (POWER - 384)) | (1L << (PRECEDING - 384)) | (1L << (PRECISION - 384)) | (1L << (PREFIX - 384)) | (1L << (PREORDER - 384)) | (1L << (PREPARE - 384)) | (1L << (PRESERVE - 384)) | (1L << (PRIMARY - 384)) | (1L << (PRIOR - 384)) | (1L << (PRIVILEGES - 384)) | (1L << (PROCEDURAL - 384)) | (1L << (PROCEDURE - 384)) | (1L << (PUBLIC - 384)) | (1L << (QUOTE - 384)) | (1L << (RANGE - 384)) | (1L << (RANK - 384)) | (1L << (READ - 384)) | (1L << (READS - 384)) | (1L << (REAL - 384)) | (1L << (RECHECK - 384)) | (1L << (RECURSIVE - 384)) | (1L << (REF - 384)) | (1L << (REFERENCES - 384)) | (1L << (REFERENCING - 384)) | (1L << (REGR_AVGX - 384)) | (1L << (REGR_AVGY - 384)) | (1L << (REGR_COUNT - 384)) | (1L << (REGR_INTERCEPT - 384)) | (1L << (REGR_R2 - 384)) | (1L << (REGR_SLOPE - 384)) | (1L << (REGR_SXX - 384)) | (1L << (REGR_SXY - 384)) | (1L << (REGR_SYY - 384)) | (1L << (REINDEX - 384)) | (1L << (RELATIVE - 384)) | (1L << (RELEASE - 384)) | (1L << (RENAME - 384)) | (1L << (REPEATABLE - 384)) | (1L << (REPLACE - 384)) | (1L << (RESET - 384)) | (1L << (RESTART - 384)) | (1L << (RESTRICT - 384)))) != 0) || ((((_la - 448)) & ~0x3f) == 0 && ((1L << (_la - 448)) & ((1L << (RESULT - 448)) | (1L << (RETURN - 448)) | (1L << (RETURNED_CARDINALITY - 448)) | (1L << (RETURNED_LENGTH - 448)) | (1L << (RETURNED_OCTET_LENGTH - 448)) | (1L << (RETURNED_SQLSTATE - 448)) | (1L << (RETURNS - 448)) | (1L << (REVOKE - 448)) | (1L << (RIGHT - 448)) | (1L << (ROLE - 448)) | (1L << (ROLLBACK - 448)) | (1L << (ROLLUP - 448)) | (1L << (ROUTINE - 448)) | (1L << (ROUTINE_CATALOG - 448)) | (1L << (ROUTINE_NAME - 448)) | (1L << (ROUTINE_SCHEMA - 448)) | (1L << (ROW - 448)) | (1L << (ROWS - 448)) | (1L << (ROW_COUNT - 448)) | (1L << (ROW_NUMBER - 448)) | (1L << (RULE - 448)) | (1L << (SAVEPOINT - 448)) | (1L << (SCALE - 448)) | (1L << (SCHEMA - 448)) | (1L << (SCHEMA_NAME - 448)) | (1L << (SCOPE - 448)) | (1L << (SCOPE_CATALOG - 448)) | (1L << (SCOPE_NAME - 448)) | (1L << (SCOPE_SCHEMA - 448)) | (1L << (SCROLL - 448)) | (1L << (SEARCH - 448)) | (1L << (SECOND - 448)) | (1L << (SECTION - 448)) | (1L << (SECURITY - 448)) | (1L << (SELECT - 448)) | (1L << (SELF - 448)) | (1L << (SENSITIVE - 448)) | (1L << (SEQUENCE - 448)) | (1L << (SERIALIZABLE - 448)) | (1L << (SERVER_NAME - 448)) | (1L << (SESSION - 448)) | (1L << (SESSION_USER - 448)) | (1L << (SET - 448)) | (1L << (SETOF - 448)) | (1L << (SETS - 448)) | (1L << (SHARE - 448)) | (1L << (SHOW - 448)) | (1L << (SIMILAR - 448)) | (1L << (SIMPLE - 448)) | (1L << (SIZE - 448)) | (1L << (SKIP_ - 448)) | (1L << (SMALLINT - 448)) | (1L << (SOME - 448)) | (1L << (SOURCE - 448)) | (1L << (SPACE - 448)) | (1L << (SPECIFIC - 448)) | (1L << (SPECIFICTYPE - 448)) | (1L << (SPECIFIC_NAME - 448)) | (1L << (SQL - 448)) | (1L << (SQLCODE - 448)) | (1L << (SQLERROR - 448)) | (1L << (SQLEXCEPTION - 448)) | (1L << (SQLSTATE - 448)) | (1L << (SQLWARNING - 448)))) != 0) || ((((_la - 512)) & ~0x3f) == 0 && ((1L << (_la - 512)) & ((1L << (SQRT - 512)) | (1L << (STABLE - 512)) | (1L << (START - 512)) | (1L << (STATE - 512)) | (1L << (STATEMENT - 512)) | (1L << (STATIC - 512)) | (1L << (STATISTICS - 512)) | (1L << (STDDEV_POP - 512)) | (1L << (STDDEV_SAMP - 512)) | (1L << (STDIN - 512)) | (1L << (STDOUT - 512)) | (1L << (STORAGE - 512)) | (1L << (STRICT - 512)) | (1L << (STRUCTURE - 512)) | (1L << (STYLE - 512)) | (1L << (SUBCLASS_ORIGIN - 512)) | (1L << (SUBLIST - 512)) | (1L << (SUBMULTISET - 512)) | (1L << (SUBSTRING - 512)) | (1L << (SUM - 512)) | (1L << (SYMMETRIC - 512)) | (1L << (SYSID - 512)) | (1L << (SYSTEM - 512)) | (1L << (SYSTEM_USER - 512)) | (1L << (TABLE - 512)) | (1L << (TABLESAMPLE - 512)) | (1L << (TABLESPACE - 512)) | (1L << (TABLE_NAME - 512)) | (1L << (TEMP - 512)) | (1L << (TEMPLATE - 512)) | (1L << (TEMPORARY - 512)) | (1L << (TERMINATE - 512)) | (1L << (THAN - 512)) | (1L << (THEN - 512)) | (1L << (TIES - 512)) | (1L << (TIME - 512)) | (1L << (TIME_TZ - 512)) | (1L << (TIMESTAMP - 512)) | (1L << (TIMESTAMP_TZ - 512)) | (1L << (TIMEZONE_HOUR - 512)) | (1L << (TIMEZONE_MINUTE - 512)) | (1L << (TO - 512)) | (1L << (TOAST - 512)) | (1L << (TOP_LEVEL_COUNT - 512)) | (1L << (TRAILING - 512)) | (1L << (TRANSACTION - 512)) | (1L << (TRANSACTIONS_COMMITTED - 512)) | (1L << (TRANSACTIONS_ROLLED_BACK - 512)) | (1L << (TRANSACTION_ACTIVE - 512)) | (1L << (TRANSFORM - 512)) | (1L << (TRANSFORMS - 512)) | (1L << (TRANSLATE - 512)) | (1L << (TRANSLATION - 512)) | (1L << (TREAT - 512)) | (1L << (TRIGGER - 512)) | (1L << (TRIGGER_CATALOG - 512)) | (1L << (TRIGGER_NAME - 512)) | (1L << (TRIGGER_SCHEMA - 512)) | (1L << (TRIM - 512)) | (1L << (TRUE - 512)) | (1L << (TRUNCATE - 512)) | (1L << (TRUSTED - 512)) | (1L << (TYPE - 512)) | (1L << (UESCAPE - 512)))) != 0) || ((((_la - 576)) & ~0x3f) == 0 && ((1L << (_la - 576)) & ((1L << (UNBOUNDED - 576)) | (1L << (UNCOMMITTED - 576)) | (1L << (UNDER - 576)) | (1L << (UNENCRYPTED - 576)) | (1L << (UNION - 576)) | (1L << (UNIQUE - 576)) | (1L << (UNKNOWN - 576)) | (1L << (UNLISTEN - 576)) | (1L << (UNNAMED - 576)) | (1L << (UNNEST - 576)) | (1L << (UNTIL - 576)) | (1L << (UPDATE - 576)) | (1L << (UPPER - 576)) | (1L << (USAGE - 576)) | (1L << (USER - 576)) | (1L << (USER_DEFINED_TYPE_CATALOG - 576)) | (1L << (USER_DEFINED_TYPE_CODE - 576)) | (1L << (USER_DEFINED_TYPE_NAME - 576)) | (1L << (USER_DEFINED_TYPE_SCHEMA - 576)) | (1L << (USING - 576)) | (1L << (VACUUM - 576)) | (1L << (VALID - 576)) | (1L << (VALIDATOR - 576)) | (1L << (VALUE - 576)) | (1L << (VALUES - 576)) | (1L << (VARCHAR - 576)) | (1L << (VARIABLE - 576)) | (1L << (VARIADIC - 576)) | (1L << (VARYING - 576)) | (1L << (VAR_POP - 576)) | (1L << (VAR_SAMP - 576)) | (1L << (VERBOSE - 576)) | (1L << (VIEW - 576)) | (1L << (VOLATILE - 576)) | (1L << (WHEN - 576)) | (1L << (WHENEVER - 576)) | (1L << (WHERE - 576)) | (1L << (WIDTH_BUCKET - 576)) | (1L << (WINDOW - 576)) | (1L << (WITH - 576)) | (1L << (WITHIN - 576)) | (1L << (WITHOUT - 576)) | (1L << (WORK - 576)) | (1L << (WRITE - 576)) | (1L << (YEAR - 576)) | (1L << (ZONE - 576)) | (1L << (SUPERUSER - 576)) | (1L << (NOSUPERUSER - 576)) | (1L << (CREATEROLE - 576)) | (1L << (NOCREATEROLE - 576)) | (1L << (INHERIT - 576)) | (1L << (NOINHERIT - 576)) | (1L << (LOGIN - 576)) | (1L << (NOLOGIN - 576)) | (1L << (REPLICATION - 576)) | (1L << (NOREPLICATION - 576)) | (1L << (BYPASSRLS - 576)) | (1L << (NOBYPASSRLS - 576)) | (1L << (SFUNC - 576)) | (1L << (STYPE - 576)) | (1L << (SSPACE - 576)) | (1L << (FINALFUNC - 576)) | (1L << (FINALFUNC_EXTRA - 576)) | (1L << (COMBINEFUNC - 576)))) != 0) || ((((_la - 640)) & ~0x3f) == 0 && ((1L << (_la - 640)) & ((1L << (SERIALFUNC - 640)) | (1L << (DESERIALFUNC - 640)) | (1L << (INITCOND - 640)) | (1L << (MSFUNC - 640)) | (1L << (MINVFUNC - 640)) | (1L << (MSTYPE - 640)) | (1L << (MSSPACE - 640)) | (1L << (MFINALFUNC - 640)) | (1L << (MFINALFUNC_EXTRA - 640)) | (1L << (MINITCOND - 640)) | (1L << (SORTOP - 640)) | (1L << (PARALLEL - 640)) | (1L << (HYPOTHETICAL - 640)) | (1L << (SAFE - 640)) | (1L << (RESTRICTED - 640)) | (1L << (UNSAFE - 640)) | (1L << (BASETYPE - 640)) | (1L << (IF - 640)) | (1L << (LOCALE - 640)) | (1L << (LC_COLLATE - 640)) | (1L << (LC_CTYPE - 640)) | (1L << (PROVIDER - 640)) | (1L << (VERSION - 640)) | (1L << (ALLOW_CONNECTIONS - 640)) | (1L << (IS_TEMPLATE - 640)) | (1L << (EVENT - 640)) | (1L << (WRAPPER - 640)) | (1L << (SERVER - 640)) | (1L << (BTREE - 640)) | (1L << (HASH_ - 640)) | (1L << (GIST - 640)) | (1L << (SPGIST - 640)) | (1L << (GIN - 640)) | (1L << (BRIN - 640)) | (1L << (CONCURRENTLY - 640)) | (1L << (INLINE - 640)) | (1L << (MATERIALIZED - 640)) | (1L << (LEFTARG - 640)) | (1L << (RIGHTARG - 640)) | (1L << (COMMUTATOR - 640)) | (1L << (NEGATOR - 640)) | (1L << (HASHES - 640)) | (1L << (MERGES - 640)) | (1L << (FAMILY - 640)) | (1L << (POLICY - 640)) | (1L << (OWNED - 640)) | (1L << (ABSTIME - 640)) | (1L << (BOOL - 640)) | (1L << (BOX - 640)) | (1L << (FLOAT4 - 640)) | (1L << (FLOAT8 - 640)) | (1L << (INT2 - 640)) | (1L << (INT4 - 640)) | (1L << (INT8 - 640)) | (1L << (JSON - 640)) | (1L << (JSONB - 640)) | (1L << (LINE - 640)) | (1L << (POINT - 640)) | (1L << (RELTIME - 640)) | (1L << (TEXT - 640)) | (1L << (COMMA - 640)) | (1L << (COLON - 640)) | (1L << (COLON_COLON - 640)) | (1L << (DOLLAR - 640)))) != 0) || ((((_la - 704)) & ~0x3f) == 0 && ((1L << (_la - 704)) & ((1L << (DOLLAR_DOLLAR - 704)) | (1L << (STAR - 704)) | (1L << (OPEN_PAREN - 704)) | (1L << (CLOSE_PAREN - 704)) | (1L << (OPEN_BRACKET - 704)) | (1L << (CLOSE_BRACKET - 704)) | (1L << (BIT_STRING - 704)) | (1L << (REGEX_STRING - 704)) | (1L << (NUMERIC_LITERAL - 704)) | (1L << (INTEGER_LITERAL - 704)) | (1L << (HEX_INTEGER_LITERAL - 704)) | (1L << (DOT - 704)) | (1L << (SINGLEQ_STRING_LITERAL - 704)) | (1L << (DOUBLEQ_STRING_LITERAL - 704)) | (1L << (IDENTIFIER - 704)) | (1L << (AMP - 704)) | (1L << (AMP_AMP - 704)) | (1L << (AMP_LT - 704)) | (1L << (AT_AT - 704)) | (1L << (AT_GT - 704)) | (1L << (AT_SIGN - 704)) | (1L << (BANG - 704)) | (1L << (BANG_BANG - 704)) | (1L << (BANG_EQUAL - 704)) | (1L << (CARET - 704)) | (1L << (EQUAL - 704)) | (1L << (EQUAL_GT - 704)) | (1L << (GT - 704)) | (1L << (GTE - 704)) | (1L << (GT_GT - 704)) | (1L << (HASH - 704)) | (1L << (HASH_EQ - 704)) | (1L << (HASH_GT - 704)) | (1L << (HASH_GT_GT - 704)) | (1L << (HASH_HASH - 704)) | (1L << (HYPHEN_GT - 704)) | (1L << (HYPHEN_GT_GT - 704)) | (1L << (HYPHEN_PIPE_HYPHEN - 704)) | (1L << (LT - 704)) | (1L << (LTE - 704)) | (1L << (LT_AT - 704)) | (1L << (LT_CARET - 704)) | (1L << (LT_GT - 704)) | (1L << (LT_HYPHEN_GT - 704)) | (1L << (LT_LT - 704)) | (1L << (LT_LT_EQ - 704)) | (1L << (LT_QMARK_GT - 704)) | (1L << (MINUS - 704)) | (1L << (PERCENT - 704)) | (1L << (PIPE - 704)) | (1L << (PIPE_PIPE - 704)) | (1L << (PIPE_PIPE_SLASH - 704)) | (1L << (PIPE_SLASH - 704)) | (1L << (PLUS - 704)) | (1L << (QMARK - 704)) | (1L << (QMARK_AMP - 704)) | (1L << (QMARK_HASH - 704)) | (1L << (QMARK_HYPHEN - 704)) | (1L << (QMARK_PIPE - 704)) | (1L << (SLASH - 704)) | (1L << (TIL - 704)) | (1L << (TIL_EQ - 704)) | (1L << (TIL_GTE_TIL - 704)) | (1L << (TIL_GT_TIL - 704)))) != 0) || ((((_la - 768)) & ~0x3f) == 0 && ((1L << (_la - 768)) & ((1L << (TIL_LTE_TIL - 768)) | (1L << (TIL_LT_TIL - 768)) | (1L << (TIL_STAR - 768)) | (1L << (TIL_TIL - 768)))) != 0)) {
					{
					setState(1677);
					todo_fill_in();
					}
				}

				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1680);
				match(CREATE);
				setState(1681);
				match(SCHEMA);
				setState(1682);
				match(AUTHORIZATION);
				setState(1683);
				create_schema_role_spec();
				setState(1685);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHITESPACE) | (1L << BLOCK_COMMENT) | (1L << LINE_COMMENT) | (1L << A_) | (1L << ABORT) | (1L << ABS) | (1L << ABSOLUTE) | (1L << ACCESS) | (1L << ACTION) | (1L << ADA) | (1L << ADD) | (1L << ADMIN) | (1L << AFTER) | (1L << AGGREGATE) | (1L << ALIAS) | (1L << ALL) | (1L << ALLOCATE) | (1L << ALSO) | (1L << ALTER) | (1L << ALWAYS) | (1L << ANALYSE) | (1L << ANALYZE) | (1L << AND) | (1L << ANY) | (1L << ARE) | (1L << ARRAY) | (1L << AS) | (1L << ASC) | (1L << ASENSITIVE) | (1L << ASSERTION) | (1L << ASSIGNMENT) | (1L << ASYMMETRIC) | (1L << AT) | (1L << ATOMIC) | (1L << ATTRIBUTE) | (1L << ATTRIBUTES) | (1L << AUTHORIZATION) | (1L << AVG) | (1L << BACKWARD) | (1L << BEFORE) | (1L << BEGIN) | (1L << BERNOULLI) | (1L << BETWEEN) | (1L << BIGINT) | (1L << BINARY) | (1L << BIT) | (1L << BITVAR) | (1L << BIT_LENGTH) | (1L << BLOB) | (1L << BOOLEAN) | (1L << BOTH) | (1L << BREADTH) | (1L << BY) | (1L << C_) | (1L << CACHE) | (1L << CALL) | (1L << CALLED) | (1L << CARDINALITY) | (1L << CASCADE) | (1L << CASCADED) | (1L << CASE) | (1L << CAST) | (1L << CATALOG))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CATALOG_NAME - 64)) | (1L << (CEIL - 64)) | (1L << (CEILING - 64)) | (1L << (CHAIN - 64)) | (1L << (CHAR - 64)) | (1L << (CHARACTER - 64)) | (1L << (CHARACTERISTICS - 64)) | (1L << (CHARACTERS - 64)) | (1L << (CHARACTER_LENGTH - 64)) | (1L << (CHARACTER_SET_CATALOG - 64)) | (1L << (CHARACTER_SET_NAME - 64)) | (1L << (CHARACTER_SET_SCHEMA - 64)) | (1L << (CHAR_LENGTH - 64)) | (1L << (CHECK - 64)) | (1L << (CHECKED - 64)) | (1L << (CHECKPOINT - 64)) | (1L << (CLASS - 64)) | (1L << (CLASS_ORIGIN - 64)) | (1L << (CLOB - 64)) | (1L << (CLOSE - 64)) | (1L << (CLUSTER - 64)) | (1L << (COALESCE - 64)) | (1L << (COBOL - 64)) | (1L << (COLLATE - 64)) | (1L << (COLLATION - 64)) | (1L << (COLLATION_CATALOG - 64)) | (1L << (COLLATION_NAME - 64)) | (1L << (COLLATION_SCHEMA - 64)) | (1L << (COLLECT - 64)) | (1L << (COLUMN - 64)) | (1L << (COLUMN_NAME - 64)) | (1L << (COMMAND_FUNCTION - 64)) | (1L << (COMMAND_FUNCTION_CODE - 64)) | (1L << (COMMENT - 64)) | (1L << (COMMIT - 64)) | (1L << (COMMITTED - 64)) | (1L << (COMPLETION - 64)) | (1L << (CONDITION - 64)) | (1L << (CONDITION_NUMBER - 64)) | (1L << (CONNECT - 64)) | (1L << (CONNECTION - 64)) | (1L << (CONNECTION_NAME - 64)) | (1L << (CONSTRAINT - 64)) | (1L << (CONSTRAINTS - 64)) | (1L << (CONSTRAINT_CATALOG - 64)) | (1L << (CONSTRAINT_NAME - 64)) | (1L << (CONSTRAINT_SCHEMA - 64)) | (1L << (CONSTRUCTOR - 64)) | (1L << (CONTAINS - 64)) | (1L << (CONTINUE - 64)) | (1L << (CONVERSION - 64)) | (1L << (CONVERT - 64)) | (1L << (COPY - 64)) | (1L << (CORR - 64)) | (1L << (CORRESPONDING - 64)) | (1L << (COUNT - 64)) | (1L << (COVAR_POP - 64)) | (1L << (COVAR_SAMP - 64)) | (1L << (CREATE - 64)) | (1L << (CREATEDB - 64)) | (1L << (CREATEUSER - 64)) | (1L << (CROSS - 64)) | (1L << (CSV - 64)) | (1L << (CUBE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (CUME_DIST - 128)) | (1L << (CURRENT - 128)) | (1L << (CURRENT_DATE - 128)) | (1L << (CURRENT_DEFAULT_TRANSFORM_GROUP - 128)) | (1L << (CURRENT_PATH - 128)) | (1L << (CURRENT_ROLE - 128)) | (1L << (CURRENT_TIME - 128)) | (1L << (CURRENT_TIMESTAMP - 128)) | (1L << (CURRENT_TRANSFORM_GROUP_FOR_TYPE - 128)) | (1L << (CURRENT_USER - 128)) | (1L << (CURSOR - 128)) | (1L << (CURSOR_NAME - 128)) | (1L << (CYCLE - 128)) | (1L << (DATA - 128)) | (1L << (DATABASE - 128)) | (1L << (DATE - 128)) | (1L << (DATETIME_INTERVAL_CODE - 128)) | (1L << (DATETIME_INTERVAL_PRECISION - 128)) | (1L << (DAY - 128)) | (1L << (DEALLOCATE - 128)) | (1L << (DEC - 128)) | (1L << (DECIMAL - 128)) | (1L << (DECLARE - 128)) | (1L << (DEFAULT - 128)) | (1L << (DEFAULTS - 128)) | (1L << (DEFERRABLE - 128)) | (1L << (DEFERRED - 128)) | (1L << (DEFINED - 128)) | (1L << (DEFINER - 128)) | (1L << (DEGREE - 128)) | (1L << (DELETE - 128)) | (1L << (DELIMITER - 128)) | (1L << (DELIMITERS - 128)) | (1L << (DENSE_RANK - 128)) | (1L << (DEPTH - 128)) | (1L << (DEREF - 128)) | (1L << (DERIVED - 128)) | (1L << (DESC - 128)) | (1L << (DESCRIBE - 128)) | (1L << (DESCRIPTOR - 128)) | (1L << (DESTROY - 128)) | (1L << (DESTRUCTOR - 128)) | (1L << (DETERMINISTIC - 128)) | (1L << (DIAGNOSTICS - 128)) | (1L << (DICTIONARY - 128)) | (1L << (DISCONNECT - 128)) | (1L << (DISPATCH - 128)) | (1L << (DISTINCT - 128)) | (1L << (DO - 128)) | (1L << (DOMAIN - 128)) | (1L << (DOUBLE - 128)) | (1L << (DROP - 128)) | (1L << (DYNAMIC - 128)) | (1L << (DYNAMIC_FUNCTION - 128)) | (1L << (DYNAMIC_FUNCTION_CODE - 128)) | (1L << (EACH - 128)) | (1L << (ELEMENT - 128)) | (1L << (ELSE - 128)) | (1L << (ENCODING - 128)) | (1L << (ENCRYPTED - 128)) | (1L << (END - 128)) | (1L << (END_EXEC - 128)) | (1L << (EQUALS - 128)) | (1L << (ESCAPE - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (EVERY - 192)) | (1L << (EXCEPT - 192)) | (1L << (EXCEPTION - 192)) | (1L << (EXCLUDE - 192)) | (1L << (EXCLUDING - 192)) | (1L << (EXCLUSIVE - 192)) | (1L << (EXEC - 192)) | (1L << (EXECUTE - 192)) | (1L << (EXISTING - 192)) | (1L << (EXISTS - 192)) | (1L << (EXP - 192)) | (1L << (EXPLAIN - 192)) | (1L << (EXTERNAL - 192)) | (1L << (EXTRACT - 192)) | (1L << (FALSE - 192)) | (1L << (FETCH - 192)) | (1L << (FILTER - 192)) | (1L << (FINAL - 192)) | (1L << (FIRST - 192)) | (1L << (FLOAT - 192)) | (1L << (FLOOR - 192)) | (1L << (FOLLOWING - 192)) | (1L << (FOR - 192)) | (1L << (FORCE - 192)) | (1L << (FOREIGN - 192)) | (1L << (FORTRAN - 192)) | (1L << (FORWARD - 192)) | (1L << (FOUND - 192)) | (1L << (FREE - 192)) | (1L << (FREEZE - 192)) | (1L << (FROM - 192)) | (1L << (FULL - 192)) | (1L << (FUNCTION - 192)) | (1L << (FUSION - 192)) | (1L << (G_ - 192)) | (1L << (GENERAL - 192)) | (1L << (GENERATED - 192)) | (1L << (GET - 192)) | (1L << (GLOBAL - 192)) | (1L << (GO - 192)) | (1L << (GOTO - 192)) | (1L << (GRANT - 192)) | (1L << (GRANTED - 192)) | (1L << (GROUP - 192)) | (1L << (GROUPING - 192)) | (1L << (HANDLER - 192)) | (1L << (HAVING - 192)) | (1L << (HIERARCHY - 192)) | (1L << (HOLD - 192)) | (1L << (HOST - 192)) | (1L << (HOUR - 192)) | (1L << (IDENTITY - 192)) | (1L << (IGNORE - 192)) | (1L << (ILIKE - 192)) | (1L << (IMMEDIATE - 192)) | (1L << (IMMUTABLE - 192)) | (1L << (IMPLEMENTATION - 192)) | (1L << (IMPLICIT - 192)) | (1L << (IN - 192)) | (1L << (INCLUDING - 192)) | (1L << (INCREMENT - 192)) | (1L << (INDEX - 192)) | (1L << (INDICATOR - 192)) | (1L << (INFIX - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (INHERITS - 256)) | (1L << (INITIALIZE - 256)) | (1L << (INITIALLY - 256)) | (1L << (INNER - 256)) | (1L << (INOUT - 256)) | (1L << (INPUT - 256)) | (1L << (INSENSITIVE - 256)) | (1L << (INSERT - 256)) | (1L << (INSTANCE - 256)) | (1L << (INSTANTIABLE - 256)) | (1L << (INSTEAD - 256)) | (1L << (INT - 256)) | (1L << (INTEGER - 256)) | (1L << (INTERSECT - 256)) | (1L << (INTERSECTION - 256)) | (1L << (INTERVAL - 256)) | (1L << (INTO - 256)) | (1L << (INVOKER - 256)) | (1L << (IS - 256)) | (1L << (ISNULL - 256)) | (1L << (ISOLATION - 256)) | (1L << (ITERATE - 256)) | (1L << (JOIN - 256)) | (1L << (K_ - 256)) | (1L << (KEY - 256)) | (1L << (KEY_MEMBER - 256)) | (1L << (KEY_TYPE - 256)) | (1L << (LANCOMPILER - 256)) | (1L << (LANGUAGE - 256)) | (1L << (LARGE - 256)) | (1L << (LAST - 256)) | (1L << (LATERAL - 256)) | (1L << (LEADING - 256)) | (1L << (LEFT - 256)) | (1L << (LENGTH - 256)) | (1L << (LESS - 256)) | (1L << (LEVEL - 256)) | (1L << (LIKE - 256)) | (1L << (LIMIT - 256)) | (1L << (LISTEN - 256)) | (1L << (LN - 256)) | (1L << (LOAD - 256)) | (1L << (LOCAL - 256)) | (1L << (LOCALTIME - 256)) | (1L << (LOCALTIMESTAMP - 256)) | (1L << (LOCATION - 256)) | (1L << (LOCATOR - 256)) | (1L << (LOCK - 256)) | (1L << (LOCKED - 256)) | (1L << (LOWER - 256)) | (1L << (M_ - 256)) | (1L << (MAP - 256)) | (1L << (MATCH - 256)) | (1L << (MATCHED - 256)) | (1L << (MAX - 256)) | (1L << (MAXVALUE - 256)) | (1L << (MEMBER - 256)) | (1L << (MERGE - 256)) | (1L << (MESSAGE_LENGTH - 256)) | (1L << (MESSAGE_OCTET_LENGTH - 256)) | (1L << (MESSAGE_TEXT - 256)) | (1L << (METHOD - 256)) | (1L << (MIN - 256)) | (1L << (MINUTE - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (MINVALUE - 320)) | (1L << (MOD - 320)) | (1L << (MODE - 320)) | (1L << (MODIFIES - 320)) | (1L << (MODIFY - 320)) | (1L << (MODULE - 320)) | (1L << (MONTH - 320)) | (1L << (MORE_ - 320)) | (1L << (MOVE - 320)) | (1L << (MULTISET - 320)) | (1L << (MUMPS - 320)) | (1L << (NAME - 320)) | (1L << (NAMES - 320)) | (1L << (NATIONAL - 320)) | (1L << (NATURAL - 320)) | (1L << (NCHAR - 320)) | (1L << (NCLOB - 320)) | (1L << (NESTING - 320)) | (1L << (NEW - 320)) | (1L << (NEXT - 320)) | (1L << (NO - 320)) | (1L << (NOCREATEDB - 320)) | (1L << (NOCREATEUSER - 320)) | (1L << (NONE - 320)) | (1L << (NORMALIZE - 320)) | (1L << (NORMALIZED - 320)) | (1L << (NOT - 320)) | (1L << (NOTHING - 320)) | (1L << (NOTIFY - 320)) | (1L << (NOTNULL - 320)) | (1L << (NOWAIT - 320)) | (1L << (NULL - 320)) | (1L << (NULLABLE - 320)) | (1L << (NULLIF - 320)) | (1L << (NULLS - 320)) | (1L << (NUMBER - 320)) | (1L << (NUMERIC - 320)) | (1L << (OBJECT - 320)) | (1L << (OCTETS - 320)) | (1L << (OCTET_LENGTH - 320)) | (1L << (OF - 320)) | (1L << (OFF - 320)) | (1L << (OFFSET - 320)) | (1L << (OIDS - 320)) | (1L << (OLD - 320)) | (1L << (ON - 320)) | (1L << (ONLY - 320)) | (1L << (OPEN - 320)) | (1L << (OPERATION - 320)) | (1L << (OPERATOR - 320)) | (1L << (OPTION - 320)) | (1L << (OPTIONS - 320)) | (1L << (OR - 320)) | (1L << (ORDER - 320)) | (1L << (ORDERING - 320)) | (1L << (ORDINALITY - 320)) | (1L << (OTHERS - 320)) | (1L << (OUT - 320)) | (1L << (OUTER - 320)) | (1L << (OUTPUT - 320)) | (1L << (OVER - 320)) | (1L << (OVERLAPS - 320)) | (1L << (OVERLAY - 320)) | (1L << (OVERRIDING - 320)))) != 0) || ((((_la - 384)) & ~0x3f) == 0 && ((1L << (_la - 384)) & ((1L << (OWNER - 384)) | (1L << (PAD - 384)) | (1L << (PARAMETER - 384)) | (1L << (PARAMETERS - 384)) | (1L << (PARAMETER_MODE - 384)) | (1L << (PARAMETER_NAME - 384)) | (1L << (PARAMETER_ORDINAL_POSITION - 384)) | (1L << (PARAMETER_SPECIFIC_CATALOG - 384)) | (1L << (PARAMETER_SPECIFIC_NAME - 384)) | (1L << (PARAMETER_SPECIFIC_SCHEMA - 384)) | (1L << (PARTIAL - 384)) | (1L << (PARTITION - 384)) | (1L << (PASCAL - 384)) | (1L << (PASSWORD - 384)) | (1L << (PATH - 384)) | (1L << (PERCENTILE_CONT - 384)) | (1L << (PERCENTILE_DISC - 384)) | (1L << (PERCENT_RANK - 384)) | (1L << (PLACING - 384)) | (1L << (PLI - 384)) | (1L << (POSITION - 384)) | (1L << (POSTFIX - 384)) | (1L << (POWER - 384)) | (1L << (PRECEDING - 384)) | (1L << (PRECISION - 384)) | (1L << (PREFIX - 384)) | (1L << (PREORDER - 384)) | (1L << (PREPARE - 384)) | (1L << (PRESERVE - 384)) | (1L << (PRIMARY - 384)) | (1L << (PRIOR - 384)) | (1L << (PRIVILEGES - 384)) | (1L << (PROCEDURAL - 384)) | (1L << (PROCEDURE - 384)) | (1L << (PUBLIC - 384)) | (1L << (QUOTE - 384)) | (1L << (RANGE - 384)) | (1L << (RANK - 384)) | (1L << (READ - 384)) | (1L << (READS - 384)) | (1L << (REAL - 384)) | (1L << (RECHECK - 384)) | (1L << (RECURSIVE - 384)) | (1L << (REF - 384)) | (1L << (REFERENCES - 384)) | (1L << (REFERENCING - 384)) | (1L << (REGR_AVGX - 384)) | (1L << (REGR_AVGY - 384)) | (1L << (REGR_COUNT - 384)) | (1L << (REGR_INTERCEPT - 384)) | (1L << (REGR_R2 - 384)) | (1L << (REGR_SLOPE - 384)) | (1L << (REGR_SXX - 384)) | (1L << (REGR_SXY - 384)) | (1L << (REGR_SYY - 384)) | (1L << (REINDEX - 384)) | (1L << (RELATIVE - 384)) | (1L << (RELEASE - 384)) | (1L << (RENAME - 384)) | (1L << (REPEATABLE - 384)) | (1L << (REPLACE - 384)) | (1L << (RESET - 384)) | (1L << (RESTART - 384)) | (1L << (RESTRICT - 384)))) != 0) || ((((_la - 448)) & ~0x3f) == 0 && ((1L << (_la - 448)) & ((1L << (RESULT - 448)) | (1L << (RETURN - 448)) | (1L << (RETURNED_CARDINALITY - 448)) | (1L << (RETURNED_LENGTH - 448)) | (1L << (RETURNED_OCTET_LENGTH - 448)) | (1L << (RETURNED_SQLSTATE - 448)) | (1L << (RETURNS - 448)) | (1L << (REVOKE - 448)) | (1L << (RIGHT - 448)) | (1L << (ROLE - 448)) | (1L << (ROLLBACK - 448)) | (1L << (ROLLUP - 448)) | (1L << (ROUTINE - 448)) | (1L << (ROUTINE_CATALOG - 448)) | (1L << (ROUTINE_NAME - 448)) | (1L << (ROUTINE_SCHEMA - 448)) | (1L << (ROW - 448)) | (1L << (ROWS - 448)) | (1L << (ROW_COUNT - 448)) | (1L << (ROW_NUMBER - 448)) | (1L << (RULE - 448)) | (1L << (SAVEPOINT - 448)) | (1L << (SCALE - 448)) | (1L << (SCHEMA - 448)) | (1L << (SCHEMA_NAME - 448)) | (1L << (SCOPE - 448)) | (1L << (SCOPE_CATALOG - 448)) | (1L << (SCOPE_NAME - 448)) | (1L << (SCOPE_SCHEMA - 448)) | (1L << (SCROLL - 448)) | (1L << (SEARCH - 448)) | (1L << (SECOND - 448)) | (1L << (SECTION - 448)) | (1L << (SECURITY - 448)) | (1L << (SELECT - 448)) | (1L << (SELF - 448)) | (1L << (SENSITIVE - 448)) | (1L << (SEQUENCE - 448)) | (1L << (SERIALIZABLE - 448)) | (1L << (SERVER_NAME - 448)) | (1L << (SESSION - 448)) | (1L << (SESSION_USER - 448)) | (1L << (SET - 448)) | (1L << (SETOF - 448)) | (1L << (SETS - 448)) | (1L << (SHARE - 448)) | (1L << (SHOW - 448)) | (1L << (SIMILAR - 448)) | (1L << (SIMPLE - 448)) | (1L << (SIZE - 448)) | (1L << (SKIP_ - 448)) | (1L << (SMALLINT - 448)) | (1L << (SOME - 448)) | (1L << (SOURCE - 448)) | (1L << (SPACE - 448)) | (1L << (SPECIFIC - 448)) | (1L << (SPECIFICTYPE - 448)) | (1L << (SPECIFIC_NAME - 448)) | (1L << (SQL - 448)) | (1L << (SQLCODE - 448)) | (1L << (SQLERROR - 448)) | (1L << (SQLEXCEPTION - 448)) | (1L << (SQLSTATE - 448)) | (1L << (SQLWARNING - 448)))) != 0) || ((((_la - 512)) & ~0x3f) == 0 && ((1L << (_la - 512)) & ((1L << (SQRT - 512)) | (1L << (STABLE - 512)) | (1L << (START - 512)) | (1L << (STATE - 512)) | (1L << (STATEMENT - 512)) | (1L << (STATIC - 512)) | (1L << (STATISTICS - 512)) | (1L << (STDDEV_POP - 512)) | (1L << (STDDEV_SAMP - 512)) | (1L << (STDIN - 512)) | (1L << (STDOUT - 512)) | (1L << (STORAGE - 512)) | (1L << (STRICT - 512)) | (1L << (STRUCTURE - 512)) | (1L << (STYLE - 512)) | (1L << (SUBCLASS_ORIGIN - 512)) | (1L << (SUBLIST - 512)) | (1L << (SUBMULTISET - 512)) | (1L << (SUBSTRING - 512)) | (1L << (SUM - 512)) | (1L << (SYMMETRIC - 512)) | (1L << (SYSID - 512)) | (1L << (SYSTEM - 512)) | (1L << (SYSTEM_USER - 512)) | (1L << (TABLE - 512)) | (1L << (TABLESAMPLE - 512)) | (1L << (TABLESPACE - 512)) | (1L << (TABLE_NAME - 512)) | (1L << (TEMP - 512)) | (1L << (TEMPLATE - 512)) | (1L << (TEMPORARY - 512)) | (1L << (TERMINATE - 512)) | (1L << (THAN - 512)) | (1L << (THEN - 512)) | (1L << (TIES - 512)) | (1L << (TIME - 512)) | (1L << (TIME_TZ - 512)) | (1L << (TIMESTAMP - 512)) | (1L << (TIMESTAMP_TZ - 512)) | (1L << (TIMEZONE_HOUR - 512)) | (1L << (TIMEZONE_MINUTE - 512)) | (1L << (TO - 512)) | (1L << (TOAST - 512)) | (1L << (TOP_LEVEL_COUNT - 512)) | (1L << (TRAILING - 512)) | (1L << (TRANSACTION - 512)) | (1L << (TRANSACTIONS_COMMITTED - 512)) | (1L << (TRANSACTIONS_ROLLED_BACK - 512)) | (1L << (TRANSACTION_ACTIVE - 512)) | (1L << (TRANSFORM - 512)) | (1L << (TRANSFORMS - 512)) | (1L << (TRANSLATE - 512)) | (1L << (TRANSLATION - 512)) | (1L << (TREAT - 512)) | (1L << (TRIGGER - 512)) | (1L << (TRIGGER_CATALOG - 512)) | (1L << (TRIGGER_NAME - 512)) | (1L << (TRIGGER_SCHEMA - 512)) | (1L << (TRIM - 512)) | (1L << (TRUE - 512)) | (1L << (TRUNCATE - 512)) | (1L << (TRUSTED - 512)) | (1L << (TYPE - 512)) | (1L << (UESCAPE - 512)))) != 0) || ((((_la - 576)) & ~0x3f) == 0 && ((1L << (_la - 576)) & ((1L << (UNBOUNDED - 576)) | (1L << (UNCOMMITTED - 576)) | (1L << (UNDER - 576)) | (1L << (UNENCRYPTED - 576)) | (1L << (UNION - 576)) | (1L << (UNIQUE - 576)) | (1L << (UNKNOWN - 576)) | (1L << (UNLISTEN - 576)) | (1L << (UNNAMED - 576)) | (1L << (UNNEST - 576)) | (1L << (UNTIL - 576)) | (1L << (UPDATE - 576)) | (1L << (UPPER - 576)) | (1L << (USAGE - 576)) | (1L << (USER - 576)) | (1L << (USER_DEFINED_TYPE_CATALOG - 576)) | (1L << (USER_DEFINED_TYPE_CODE - 576)) | (1L << (USER_DEFINED_TYPE_NAME - 576)) | (1L << (USER_DEFINED_TYPE_SCHEMA - 576)) | (1L << (USING - 576)) | (1L << (VACUUM - 576)) | (1L << (VALID - 576)) | (1L << (VALIDATOR - 576)) | (1L << (VALUE - 576)) | (1L << (VALUES - 576)) | (1L << (VARCHAR - 576)) | (1L << (VARIABLE - 576)) | (1L << (VARIADIC - 576)) | (1L << (VARYING - 576)) | (1L << (VAR_POP - 576)) | (1L << (VAR_SAMP - 576)) | (1L << (VERBOSE - 576)) | (1L << (VIEW - 576)) | (1L << (VOLATILE - 576)) | (1L << (WHEN - 576)) | (1L << (WHENEVER - 576)) | (1L << (WHERE - 576)) | (1L << (WIDTH_BUCKET - 576)) | (1L << (WINDOW - 576)) | (1L << (WITH - 576)) | (1L << (WITHIN - 576)) | (1L << (WITHOUT - 576)) | (1L << (WORK - 576)) | (1L << (WRITE - 576)) | (1L << (YEAR - 576)) | (1L << (ZONE - 576)) | (1L << (SUPERUSER - 576)) | (1L << (NOSUPERUSER - 576)) | (1L << (CREATEROLE - 576)) | (1L << (NOCREATEROLE - 576)) | (1L << (INHERIT - 576)) | (1L << (NOINHERIT - 576)) | (1L << (LOGIN - 576)) | (1L << (NOLOGIN - 576)) | (1L << (REPLICATION - 576)) | (1L << (NOREPLICATION - 576)) | (1L << (BYPASSRLS - 576)) | (1L << (NOBYPASSRLS - 576)) | (1L << (SFUNC - 576)) | (1L << (STYPE - 576)) | (1L << (SSPACE - 576)) | (1L << (FINALFUNC - 576)) | (1L << (FINALFUNC_EXTRA - 576)) | (1L << (COMBINEFUNC - 576)))) != 0) || ((((_la - 640)) & ~0x3f) == 0 && ((1L << (_la - 640)) & ((1L << (SERIALFUNC - 640)) | (1L << (DESERIALFUNC - 640)) | (1L << (INITCOND - 640)) | (1L << (MSFUNC - 640)) | (1L << (MINVFUNC - 640)) | (1L << (MSTYPE - 640)) | (1L << (MSSPACE - 640)) | (1L << (MFINALFUNC - 640)) | (1L << (MFINALFUNC_EXTRA - 640)) | (1L << (MINITCOND - 640)) | (1L << (SORTOP - 640)) | (1L << (PARALLEL - 640)) | (1L << (HYPOTHETICAL - 640)) | (1L << (SAFE - 640)) | (1L << (RESTRICTED - 640)) | (1L << (UNSAFE - 640)) | (1L << (BASETYPE - 640)) | (1L << (IF - 640)) | (1L << (LOCALE - 640)) | (1L << (LC_COLLATE - 640)) | (1L << (LC_CTYPE - 640)) | (1L << (PROVIDER - 640)) | (1L << (VERSION - 640)) | (1L << (ALLOW_CONNECTIONS - 640)) | (1L << (IS_TEMPLATE - 640)) | (1L << (EVENT - 640)) | (1L << (WRAPPER - 640)) | (1L << (SERVER - 640)) | (1L << (BTREE - 640)) | (1L << (HASH_ - 640)) | (1L << (GIST - 640)) | (1L << (SPGIST - 640)) | (1L << (GIN - 640)) | (1L << (BRIN - 640)) | (1L << (CONCURRENTLY - 640)) | (1L << (INLINE - 640)) | (1L << (MATERIALIZED - 640)) | (1L << (LEFTARG - 640)) | (1L << (RIGHTARG - 640)) | (1L << (COMMUTATOR - 640)) | (1L << (NEGATOR - 640)) | (1L << (HASHES - 640)) | (1L << (MERGES - 640)) | (1L << (FAMILY - 640)) | (1L << (POLICY - 640)) | (1L << (OWNED - 640)) | (1L << (ABSTIME - 640)) | (1L << (BOOL - 640)) | (1L << (BOX - 640)) | (1L << (FLOAT4 - 640)) | (1L << (FLOAT8 - 640)) | (1L << (INT2 - 640)) | (1L << (INT4 - 640)) | (1L << (INT8 - 640)) | (1L << (JSON - 640)) | (1L << (JSONB - 640)) | (1L << (LINE - 640)) | (1L << (POINT - 640)) | (1L << (RELTIME - 640)) | (1L << (TEXT - 640)) | (1L << (COMMA - 640)) | (1L << (COLON - 640)) | (1L << (COLON_COLON - 640)) | (1L << (DOLLAR - 640)))) != 0) || ((((_la - 704)) & ~0x3f) == 0 && ((1L << (_la - 704)) & ((1L << (DOLLAR_DOLLAR - 704)) | (1L << (STAR - 704)) | (1L << (OPEN_PAREN - 704)) | (1L << (CLOSE_PAREN - 704)) | (1L << (OPEN_BRACKET - 704)) | (1L << (CLOSE_BRACKET - 704)) | (1L << (BIT_STRING - 704)) | (1L << (REGEX_STRING - 704)) | (1L << (NUMERIC_LITERAL - 704)) | (1L << (INTEGER_LITERAL - 704)) | (1L << (HEX_INTEGER_LITERAL - 704)) | (1L << (DOT - 704)) | (1L << (SINGLEQ_STRING_LITERAL - 704)) | (1L << (DOUBLEQ_STRING_LITERAL - 704)) | (1L << (IDENTIFIER - 704)) | (1L << (AMP - 704)) | (1L << (AMP_AMP - 704)) | (1L << (AMP_LT - 704)) | (1L << (AT_AT - 704)) | (1L << (AT_GT - 704)) | (1L << (AT_SIGN - 704)) | (1L << (BANG - 704)) | (1L << (BANG_BANG - 704)) | (1L << (BANG_EQUAL - 704)) | (1L << (CARET - 704)) | (1L << (EQUAL - 704)) | (1L << (EQUAL_GT - 704)) | (1L << (GT - 704)) | (1L << (GTE - 704)) | (1L << (GT_GT - 704)) | (1L << (HASH - 704)) | (1L << (HASH_EQ - 704)) | (1L << (HASH_GT - 704)) | (1L << (HASH_GT_GT - 704)) | (1L << (HASH_HASH - 704)) | (1L << (HYPHEN_GT - 704)) | (1L << (HYPHEN_GT_GT - 704)) | (1L << (HYPHEN_PIPE_HYPHEN - 704)) | (1L << (LT - 704)) | (1L << (LTE - 704)) | (1L << (LT_AT - 704)) | (1L << (LT_CARET - 704)) | (1L << (LT_GT - 704)) | (1L << (LT_HYPHEN_GT - 704)) | (1L << (LT_LT - 704)) | (1L << (LT_LT_EQ - 704)) | (1L << (LT_QMARK_GT - 704)) | (1L << (MINUS - 704)) | (1L << (PERCENT - 704)) | (1L << (PIPE - 704)) | (1L << (PIPE_PIPE - 704)) | (1L << (PIPE_PIPE_SLASH - 704)) | (1L << (PIPE_SLASH - 704)) | (1L << (PLUS - 704)) | (1L << (QMARK - 704)) | (1L << (QMARK_AMP - 704)) | (1L << (QMARK_HASH - 704)) | (1L << (QMARK_HYPHEN - 704)) | (1L << (QMARK_PIPE - 704)) | (1L << (SLASH - 704)) | (1L << (TIL - 704)) | (1L << (TIL_EQ - 704)) | (1L << (TIL_GTE_TIL - 704)) | (1L << (TIL_GT_TIL - 704)))) != 0) || ((((_la - 768)) & ~0x3f) == 0 && ((1L << (_la - 768)) & ((1L << (TIL_LTE_TIL - 768)) | (1L << (TIL_LT_TIL - 768)) | (1L << (TIL_STAR - 768)) | (1L << (TIL_TIL - 768)))) != 0)) {
					{
					setState(1684);
					todo_fill_in();
					}
				}

				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(1687);
				match(CREATE);
				setState(1688);
				match(SCHEMA);
				setState(1689);
				match(IF);
				setState(1690);
				match(NOT);
				setState(1691);
				match(EXISTS);
				setState(1692);
				((Create_schema_stmtContext)_localctx).schema_name = identifier(0);
				setState(1695);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AUTHORIZATION) {
					{
					setState(1693);
					match(AUTHORIZATION);
					setState(1694);
					create_schema_role_spec();
					}
				}

				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(1697);
				match(CREATE);
				setState(1698);
				match(SCHEMA);
				setState(1699);
				match(IF);
				setState(1700);
				match(NOT);
				setState(1701);
				match(EXISTS);
				setState(1702);
				match(AUTHORIZATION);
				setState(1703);
				create_schema_role_spec();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_sequence_stmtContext extends ParserRuleContext {
		public IdentifierContext name_;
		public Token increment;
		public Token minvalue;
		public Token maxvalue;
		public Token start;
		public Token cache;
		public IdentifierContext table_name_;
		public IdentifierContext column_name_;
		public TerminalNode CREATE() { return getToken(PostgreSQLParser.CREATE, 0); }
		public TerminalNode SEQUENCE() { return getToken(PostgreSQLParser.SEQUENCE, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode IF() { return getToken(PostgreSQLParser.IF, 0); }
		public TerminalNode NOT() { return getToken(PostgreSQLParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(PostgreSQLParser.EXISTS, 0); }
		public TerminalNode INCREMENT() { return getToken(PostgreSQLParser.INCREMENT, 0); }
		public TerminalNode MINVALUE() { return getToken(PostgreSQLParser.MINVALUE, 0); }
		public List<TerminalNode> NO() { return getTokens(PostgreSQLParser.NO); }
		public TerminalNode NO(int i) {
			return getToken(PostgreSQLParser.NO, i);
		}
		public TerminalNode MAXVALUE() { return getToken(PostgreSQLParser.MAXVALUE, 0); }
		public TerminalNode START() { return getToken(PostgreSQLParser.START, 0); }
		public TerminalNode CACHE() { return getToken(PostgreSQLParser.CACHE, 0); }
		public TerminalNode CYCLE() { return getToken(PostgreSQLParser.CYCLE, 0); }
		public TerminalNode OWNED() { return getToken(PostgreSQLParser.OWNED, 0); }
		public List<TerminalNode> BY() { return getTokens(PostgreSQLParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(PostgreSQLParser.BY, i);
		}
		public TerminalNode TEMPORARY() { return getToken(PostgreSQLParser.TEMPORARY, 0); }
		public TerminalNode TEMP() { return getToken(PostgreSQLParser.TEMP, 0); }
		public List<TerminalNode> INTEGER_LITERAL() { return getTokens(PostgreSQLParser.INTEGER_LITERAL); }
		public TerminalNode INTEGER_LITERAL(int i) {
			return getToken(PostgreSQLParser.INTEGER_LITERAL, i);
		}
		public TerminalNode NONE() { return getToken(PostgreSQLParser.NONE, 0); }
		public TerminalNode WITH() { return getToken(PostgreSQLParser.WITH, 0); }
		public TerminalNode DOT() { return getToken(PostgreSQLParser.DOT, 0); }
		public Create_sequence_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_sequence_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterCreate_sequence_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitCreate_sequence_stmt(this);
		}
	}

	public final Create_sequence_stmtContext create_sequence_stmt() throws RecognitionException {
		Create_sequence_stmtContext _localctx = new Create_sequence_stmtContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_create_sequence_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1706);
			match(CREATE);
			setState(1708);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TEMP || _la==TEMPORARY) {
				{
				setState(1707);
				_la = _input.LA(1);
				if ( !(_la==TEMP || _la==TEMPORARY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1710);
			match(SEQUENCE);
			setState(1714);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IF) {
				{
				setState(1711);
				match(IF);
				setState(1712);
				match(NOT);
				setState(1713);
				match(EXISTS);
				}
			}

			setState(1716);
			((Create_sequence_stmtContext)_localctx).name_ = identifier(0);
			setState(1722);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INCREMENT) {
				{
				setState(1717);
				match(INCREMENT);
				setState(1719);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BY) {
					{
					setState(1718);
					match(BY);
					}
				}

				setState(1721);
				((Create_sequence_stmtContext)_localctx).increment = match(INTEGER_LITERAL);
				}
			}

			setState(1728);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
			case 1:
				{
				setState(1724);
				match(MINVALUE);
				setState(1725);
				((Create_sequence_stmtContext)_localctx).minvalue = match(INTEGER_LITERAL);
				}
				break;
			case 2:
				{
				setState(1726);
				match(NO);
				setState(1727);
				match(MINVALUE);
				}
				break;
			}
			setState(1734);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
			case 1:
				{
				setState(1730);
				match(MAXVALUE);
				setState(1731);
				((Create_sequence_stmtContext)_localctx).maxvalue = match(INTEGER_LITERAL);
				}
				break;
			case 2:
				{
				setState(1732);
				match(NO);
				setState(1733);
				match(MAXVALUE);
				}
				break;
			}
			setState(1741);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==START) {
				{
				setState(1736);
				match(START);
				setState(1738);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(1737);
					match(WITH);
					}
				}

				setState(1740);
				((Create_sequence_stmtContext)_localctx).start = match(INTEGER_LITERAL);
				}
			}

			setState(1745);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CACHE) {
				{
				setState(1743);
				match(CACHE);
				setState(1744);
				((Create_sequence_stmtContext)_localctx).cache = match(INTEGER_LITERAL);
				}
			}

			setState(1751);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CYCLE || _la==NO) {
				{
				setState(1748);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NO) {
					{
					setState(1747);
					match(NO);
					}
				}

				setState(1750);
				match(CYCLE);
				}
			}

			setState(1762);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OWNED) {
				{
				setState(1753);
				match(OWNED);
				setState(1754);
				match(BY);
				setState(1760);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
				case 1:
					{
					{
					setState(1755);
					((Create_sequence_stmtContext)_localctx).table_name_ = identifier(0);
					setState(1756);
					match(DOT);
					setState(1757);
					((Create_sequence_stmtContext)_localctx).column_name_ = identifier(0);
					}
					}
					break;
				case 2:
					{
					setState(1759);
					match(NONE);
					}
					break;
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_server_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Create_server_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_server_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterCreate_server_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitCreate_server_stmt(this);
		}
	}

	public final Create_server_stmtContext create_server_stmt() throws RecognitionException {
		Create_server_stmtContext _localctx = new Create_server_stmtContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_create_server_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1764);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_statistics_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Create_statistics_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_statistics_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterCreate_statistics_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitCreate_statistics_stmt(this);
		}
	}

	public final Create_statistics_stmtContext create_statistics_stmt() throws RecognitionException {
		Create_statistics_stmtContext _localctx = new Create_statistics_stmtContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_create_statistics_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1766);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_subscription_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Create_subscription_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_subscription_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterCreate_subscription_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitCreate_subscription_stmt(this);
		}
	}

	public final Create_subscription_stmtContext create_subscription_stmt() throws RecognitionException {
		Create_subscription_stmtContext _localctx = new Create_subscription_stmtContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_create_subscription_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1768);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Create_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterCreate_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitCreate_table_stmt(this);
		}
	}

	public final Create_table_stmtContext create_table_stmt() throws RecognitionException {
		Create_table_stmtContext _localctx = new Create_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_create_table_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1770);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_as_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Create_table_as_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_as_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterCreate_table_as_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitCreate_table_as_stmt(this);
		}
	}

	public final Create_table_as_stmtContext create_table_as_stmt() throws RecognitionException {
		Create_table_as_stmtContext _localctx = new Create_table_as_stmtContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_create_table_as_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1772);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_tablespace_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Create_tablespace_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_tablespace_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterCreate_tablespace_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitCreate_tablespace_stmt(this);
		}
	}

	public final Create_tablespace_stmtContext create_tablespace_stmt() throws RecognitionException {
		Create_tablespace_stmtContext _localctx = new Create_tablespace_stmtContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_create_tablespace_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1774);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_text_search_config_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Create_text_search_config_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_text_search_config_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterCreate_text_search_config_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitCreate_text_search_config_stmt(this);
		}
	}

	public final Create_text_search_config_stmtContext create_text_search_config_stmt() throws RecognitionException {
		Create_text_search_config_stmtContext _localctx = new Create_text_search_config_stmtContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_create_text_search_config_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1776);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_text_search_dict_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Create_text_search_dict_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_text_search_dict_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterCreate_text_search_dict_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitCreate_text_search_dict_stmt(this);
		}
	}

	public final Create_text_search_dict_stmtContext create_text_search_dict_stmt() throws RecognitionException {
		Create_text_search_dict_stmtContext _localctx = new Create_text_search_dict_stmtContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_create_text_search_dict_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1778);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_text_search_parser_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Create_text_search_parser_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_text_search_parser_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterCreate_text_search_parser_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitCreate_text_search_parser_stmt(this);
		}
	}

	public final Create_text_search_parser_stmtContext create_text_search_parser_stmt() throws RecognitionException {
		Create_text_search_parser_stmtContext _localctx = new Create_text_search_parser_stmtContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_create_text_search_parser_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1780);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_text_search_template_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Create_text_search_template_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_text_search_template_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterCreate_text_search_template_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitCreate_text_search_template_stmt(this);
		}
	}

	public final Create_text_search_template_stmtContext create_text_search_template_stmt() throws RecognitionException {
		Create_text_search_template_stmtContext _localctx = new Create_text_search_template_stmtContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_create_text_search_template_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1782);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_transform_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Create_transform_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_transform_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterCreate_transform_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitCreate_transform_stmt(this);
		}
	}

	public final Create_transform_stmtContext create_transform_stmt() throws RecognitionException {
		Create_transform_stmtContext _localctx = new Create_transform_stmtContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_create_transform_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1784);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_trigger_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Create_trigger_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_trigger_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterCreate_trigger_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitCreate_trigger_stmt(this);
		}
	}

	public final Create_trigger_stmtContext create_trigger_stmt() throws RecognitionException {
		Create_trigger_stmtContext _localctx = new Create_trigger_stmtContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_create_trigger_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1786);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_type_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Create_type_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_type_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterCreate_type_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitCreate_type_stmt(this);
		}
	}

	public final Create_type_stmtContext create_type_stmt() throws RecognitionException {
		Create_type_stmtContext _localctx = new Create_type_stmtContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_create_type_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1788);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_user_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Create_user_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_user_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterCreate_user_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitCreate_user_stmt(this);
		}
	}

	public final Create_user_stmtContext create_user_stmt() throws RecognitionException {
		Create_user_stmtContext _localctx = new Create_user_stmtContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_create_user_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1790);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_user_mapping_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Create_user_mapping_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_user_mapping_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterCreate_user_mapping_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitCreate_user_mapping_stmt(this);
		}
	}

	public final Create_user_mapping_stmtContext create_user_mapping_stmt() throws RecognitionException {
		Create_user_mapping_stmtContext _localctx = new Create_user_mapping_stmtContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_create_user_mapping_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1792);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_view_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Create_view_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_view_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterCreate_view_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitCreate_view_stmt(this);
		}
	}

	public final Create_view_stmtContext create_view_stmt() throws RecognitionException {
		Create_view_stmtContext _localctx = new Create_view_stmtContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_create_view_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1794);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Deallocate_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Deallocate_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deallocate_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterDeallocate_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitDeallocate_stmt(this);
		}
	}

	public final Deallocate_stmtContext deallocate_stmt() throws RecognitionException {
		Deallocate_stmtContext _localctx = new Deallocate_stmtContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_deallocate_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1796);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declare_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Declare_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterDeclare_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitDeclare_stmt(this);
		}
	}

	public final Declare_stmtContext declare_stmt() throws RecognitionException {
		Declare_stmtContext _localctx = new Declare_stmtContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_declare_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1798);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Delete_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Delete_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterDelete_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitDelete_stmt(this);
		}
	}

	public final Delete_stmtContext delete_stmt() throws RecognitionException {
		Delete_stmtContext _localctx = new Delete_stmtContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_delete_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1800);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Discard_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Discard_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_discard_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterDiscard_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitDiscard_stmt(this);
		}
	}

	public final Discard_stmtContext discard_stmt() throws RecognitionException {
		Discard_stmtContext _localctx = new Discard_stmtContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_discard_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1802);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_stmtContext extends ParserRuleContext {
		public Drop_access_method_stmtContext drop_access_method_stmt() {
			return getRuleContext(Drop_access_method_stmtContext.class,0);
		}
		public Drop_aggregate_stmtContext drop_aggregate_stmt() {
			return getRuleContext(Drop_aggregate_stmtContext.class,0);
		}
		public Drop_cast_stmtContext drop_cast_stmt() {
			return getRuleContext(Drop_cast_stmtContext.class,0);
		}
		public Drop_collation_stmtContext drop_collation_stmt() {
			return getRuleContext(Drop_collation_stmtContext.class,0);
		}
		public Drop_conversion_stmtContext drop_conversion_stmt() {
			return getRuleContext(Drop_conversion_stmtContext.class,0);
		}
		public Drop_database_stmtContext drop_database_stmt() {
			return getRuleContext(Drop_database_stmtContext.class,0);
		}
		public Drop_domain_stmtContext drop_domain_stmt() {
			return getRuleContext(Drop_domain_stmtContext.class,0);
		}
		public Drop_event_trigger_stmtContext drop_event_trigger_stmt() {
			return getRuleContext(Drop_event_trigger_stmtContext.class,0);
		}
		public Drop_extension_stmtContext drop_extension_stmt() {
			return getRuleContext(Drop_extension_stmtContext.class,0);
		}
		public Drop_foreign_data_wrapper_stmtContext drop_foreign_data_wrapper_stmt() {
			return getRuleContext(Drop_foreign_data_wrapper_stmtContext.class,0);
		}
		public Drop_foreign_table_stmtContext drop_foreign_table_stmt() {
			return getRuleContext(Drop_foreign_table_stmtContext.class,0);
		}
		public Drop_function_stmtContext drop_function_stmt() {
			return getRuleContext(Drop_function_stmtContext.class,0);
		}
		public Drop_group_stmtContext drop_group_stmt() {
			return getRuleContext(Drop_group_stmtContext.class,0);
		}
		public Drop_index_stmtContext drop_index_stmt() {
			return getRuleContext(Drop_index_stmtContext.class,0);
		}
		public Drop_language_stmtContext drop_language_stmt() {
			return getRuleContext(Drop_language_stmtContext.class,0);
		}
		public Drop_materialized_view_stmtContext drop_materialized_view_stmt() {
			return getRuleContext(Drop_materialized_view_stmtContext.class,0);
		}
		public Drop_operator_stmtContext drop_operator_stmt() {
			return getRuleContext(Drop_operator_stmtContext.class,0);
		}
		public Drop_operator_class_stmtContext drop_operator_class_stmt() {
			return getRuleContext(Drop_operator_class_stmtContext.class,0);
		}
		public Drop_operator_family_stmtContext drop_operator_family_stmt() {
			return getRuleContext(Drop_operator_family_stmtContext.class,0);
		}
		public Drop_owned_stmtContext drop_owned_stmt() {
			return getRuleContext(Drop_owned_stmtContext.class,0);
		}
		public Drop_policy_stmtContext drop_policy_stmt() {
			return getRuleContext(Drop_policy_stmtContext.class,0);
		}
		public Drop_publication_stmtContext drop_publication_stmt() {
			return getRuleContext(Drop_publication_stmtContext.class,0);
		}
		public Drop_role_stmtContext drop_role_stmt() {
			return getRuleContext(Drop_role_stmtContext.class,0);
		}
		public Drop_rule_stmtContext drop_rule_stmt() {
			return getRuleContext(Drop_rule_stmtContext.class,0);
		}
		public Drop_schema_stmtContext drop_schema_stmt() {
			return getRuleContext(Drop_schema_stmtContext.class,0);
		}
		public Drop_sequence_stmtContext drop_sequence_stmt() {
			return getRuleContext(Drop_sequence_stmtContext.class,0);
		}
		public Drop_server_stmtContext drop_server_stmt() {
			return getRuleContext(Drop_server_stmtContext.class,0);
		}
		public Drop_statistics_stmtContext drop_statistics_stmt() {
			return getRuleContext(Drop_statistics_stmtContext.class,0);
		}
		public Drop_subscription_stmtContext drop_subscription_stmt() {
			return getRuleContext(Drop_subscription_stmtContext.class,0);
		}
		public Drop_table_stmtContext drop_table_stmt() {
			return getRuleContext(Drop_table_stmtContext.class,0);
		}
		public Drop_tablespace_stmtContext drop_tablespace_stmt() {
			return getRuleContext(Drop_tablespace_stmtContext.class,0);
		}
		public Drop_text_search_config_stmtContext drop_text_search_config_stmt() {
			return getRuleContext(Drop_text_search_config_stmtContext.class,0);
		}
		public Drop_text_search_dict_stmtContext drop_text_search_dict_stmt() {
			return getRuleContext(Drop_text_search_dict_stmtContext.class,0);
		}
		public Drop_text_search_parser_stmtContext drop_text_search_parser_stmt() {
			return getRuleContext(Drop_text_search_parser_stmtContext.class,0);
		}
		public Drop_text_search_template_stmtContext drop_text_search_template_stmt() {
			return getRuleContext(Drop_text_search_template_stmtContext.class,0);
		}
		public Drop_transform_stmtContext drop_transform_stmt() {
			return getRuleContext(Drop_transform_stmtContext.class,0);
		}
		public Drop_trigger_stmtContext drop_trigger_stmt() {
			return getRuleContext(Drop_trigger_stmtContext.class,0);
		}
		public Drop_type_stmtContext drop_type_stmt() {
			return getRuleContext(Drop_type_stmtContext.class,0);
		}
		public Drop_user_stmtContext drop_user_stmt() {
			return getRuleContext(Drop_user_stmtContext.class,0);
		}
		public Drop_user_mapping_stmtContext drop_user_mapping_stmt() {
			return getRuleContext(Drop_user_mapping_stmtContext.class,0);
		}
		public Drop_view_stmtContext drop_view_stmt() {
			return getRuleContext(Drop_view_stmtContext.class,0);
		}
		public Drop_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterDrop_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitDrop_stmt(this);
		}
	}

	public final Drop_stmtContext drop_stmt() throws RecognitionException {
		Drop_stmtContext _localctx = new Drop_stmtContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_drop_stmt);
		try {
			setState(1845);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1804);
				drop_access_method_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1805);
				drop_aggregate_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1806);
				drop_cast_stmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1807);
				drop_collation_stmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1808);
				drop_conversion_stmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1809);
				drop_database_stmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1810);
				drop_domain_stmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1811);
				drop_event_trigger_stmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1812);
				drop_extension_stmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1813);
				drop_foreign_data_wrapper_stmt();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1814);
				drop_foreign_table_stmt();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1815);
				drop_function_stmt();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1816);
				drop_group_stmt();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1817);
				drop_index_stmt();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1818);
				drop_language_stmt();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1819);
				drop_materialized_view_stmt();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1820);
				drop_operator_stmt();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1821);
				drop_operator_class_stmt();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1822);
				drop_operator_family_stmt();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(1823);
				drop_owned_stmt();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(1824);
				drop_policy_stmt();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(1825);
				drop_publication_stmt();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(1826);
				drop_role_stmt();
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(1827);
				drop_rule_stmt();
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(1828);
				drop_schema_stmt();
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(1829);
				drop_sequence_stmt();
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(1830);
				drop_server_stmt();
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(1831);
				drop_statistics_stmt();
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(1832);
				drop_subscription_stmt();
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(1833);
				drop_table_stmt();
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(1834);
				drop_tablespace_stmt();
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(1835);
				drop_text_search_config_stmt();
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(1836);
				drop_text_search_dict_stmt();
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(1837);
				drop_text_search_parser_stmt();
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(1838);
				drop_text_search_template_stmt();
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(1839);
				drop_transform_stmt();
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(1840);
				drop_trigger_stmt();
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(1841);
				drop_type_stmt();
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(1842);
				drop_user_stmt();
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(1843);
				drop_user_mapping_stmt();
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(1844);
				drop_view_stmt();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_access_method_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Drop_access_method_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_access_method_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterDrop_access_method_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitDrop_access_method_stmt(this);
		}
	}

	public final Drop_access_method_stmtContext drop_access_method_stmt() throws RecognitionException {
		Drop_access_method_stmtContext _localctx = new Drop_access_method_stmtContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_drop_access_method_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1847);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_aggregate_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Drop_aggregate_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_aggregate_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterDrop_aggregate_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitDrop_aggregate_stmt(this);
		}
	}

	public final Drop_aggregate_stmtContext drop_aggregate_stmt() throws RecognitionException {
		Drop_aggregate_stmtContext _localctx = new Drop_aggregate_stmtContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_drop_aggregate_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1849);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_cast_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Drop_cast_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_cast_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterDrop_cast_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitDrop_cast_stmt(this);
		}
	}

	public final Drop_cast_stmtContext drop_cast_stmt() throws RecognitionException {
		Drop_cast_stmtContext _localctx = new Drop_cast_stmtContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_drop_cast_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1851);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_collation_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Drop_collation_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_collation_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterDrop_collation_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitDrop_collation_stmt(this);
		}
	}

	public final Drop_collation_stmtContext drop_collation_stmt() throws RecognitionException {
		Drop_collation_stmtContext _localctx = new Drop_collation_stmtContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_drop_collation_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1853);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_conversion_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Drop_conversion_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_conversion_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterDrop_conversion_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitDrop_conversion_stmt(this);
		}
	}

	public final Drop_conversion_stmtContext drop_conversion_stmt() throws RecognitionException {
		Drop_conversion_stmtContext _localctx = new Drop_conversion_stmtContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_drop_conversion_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1855);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_database_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Drop_database_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_database_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterDrop_database_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitDrop_database_stmt(this);
		}
	}

	public final Drop_database_stmtContext drop_database_stmt() throws RecognitionException {
		Drop_database_stmtContext _localctx = new Drop_database_stmtContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_drop_database_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1857);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_domain_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Drop_domain_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_domain_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterDrop_domain_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitDrop_domain_stmt(this);
		}
	}

	public final Drop_domain_stmtContext drop_domain_stmt() throws RecognitionException {
		Drop_domain_stmtContext _localctx = new Drop_domain_stmtContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_drop_domain_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1859);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_event_trigger_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Drop_event_trigger_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_event_trigger_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterDrop_event_trigger_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitDrop_event_trigger_stmt(this);
		}
	}

	public final Drop_event_trigger_stmtContext drop_event_trigger_stmt() throws RecognitionException {
		Drop_event_trigger_stmtContext _localctx = new Drop_event_trigger_stmtContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_drop_event_trigger_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1861);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_extension_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Drop_extension_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_extension_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterDrop_extension_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitDrop_extension_stmt(this);
		}
	}

	public final Drop_extension_stmtContext drop_extension_stmt() throws RecognitionException {
		Drop_extension_stmtContext _localctx = new Drop_extension_stmtContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_drop_extension_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1863);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_foreign_data_wrapper_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Drop_foreign_data_wrapper_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_foreign_data_wrapper_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterDrop_foreign_data_wrapper_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitDrop_foreign_data_wrapper_stmt(this);
		}
	}

	public final Drop_foreign_data_wrapper_stmtContext drop_foreign_data_wrapper_stmt() throws RecognitionException {
		Drop_foreign_data_wrapper_stmtContext _localctx = new Drop_foreign_data_wrapper_stmtContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_drop_foreign_data_wrapper_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1865);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_foreign_table_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Drop_foreign_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_foreign_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterDrop_foreign_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitDrop_foreign_table_stmt(this);
		}
	}

	public final Drop_foreign_table_stmtContext drop_foreign_table_stmt() throws RecognitionException {
		Drop_foreign_table_stmtContext _localctx = new Drop_foreign_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_drop_foreign_table_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1867);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_function_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Drop_function_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_function_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterDrop_function_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitDrop_function_stmt(this);
		}
	}

	public final Drop_function_stmtContext drop_function_stmt() throws RecognitionException {
		Drop_function_stmtContext _localctx = new Drop_function_stmtContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_drop_function_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1869);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_group_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Drop_group_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_group_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterDrop_group_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitDrop_group_stmt(this);
		}
	}

	public final Drop_group_stmtContext drop_group_stmt() throws RecognitionException {
		Drop_group_stmtContext _localctx = new Drop_group_stmtContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_drop_group_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1871);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_index_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Drop_index_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_index_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterDrop_index_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitDrop_index_stmt(this);
		}
	}

	public final Drop_index_stmtContext drop_index_stmt() throws RecognitionException {
		Drop_index_stmtContext _localctx = new Drop_index_stmtContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_drop_index_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1873);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_language_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Drop_language_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_language_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterDrop_language_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitDrop_language_stmt(this);
		}
	}

	public final Drop_language_stmtContext drop_language_stmt() throws RecognitionException {
		Drop_language_stmtContext _localctx = new Drop_language_stmtContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_drop_language_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1875);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_materialized_view_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Drop_materialized_view_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_materialized_view_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterDrop_materialized_view_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitDrop_materialized_view_stmt(this);
		}
	}

	public final Drop_materialized_view_stmtContext drop_materialized_view_stmt() throws RecognitionException {
		Drop_materialized_view_stmtContext _localctx = new Drop_materialized_view_stmtContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_drop_materialized_view_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1877);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_operator_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Drop_operator_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_operator_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterDrop_operator_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitDrop_operator_stmt(this);
		}
	}

	public final Drop_operator_stmtContext drop_operator_stmt() throws RecognitionException {
		Drop_operator_stmtContext _localctx = new Drop_operator_stmtContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_drop_operator_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1879);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_operator_class_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Drop_operator_class_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_operator_class_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterDrop_operator_class_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitDrop_operator_class_stmt(this);
		}
	}

	public final Drop_operator_class_stmtContext drop_operator_class_stmt() throws RecognitionException {
		Drop_operator_class_stmtContext _localctx = new Drop_operator_class_stmtContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_drop_operator_class_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1881);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_operator_family_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Drop_operator_family_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_operator_family_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterDrop_operator_family_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitDrop_operator_family_stmt(this);
		}
	}

	public final Drop_operator_family_stmtContext drop_operator_family_stmt() throws RecognitionException {
		Drop_operator_family_stmtContext _localctx = new Drop_operator_family_stmtContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_drop_operator_family_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1883);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_owned_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Drop_owned_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_owned_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterDrop_owned_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitDrop_owned_stmt(this);
		}
	}

	public final Drop_owned_stmtContext drop_owned_stmt() throws RecognitionException {
		Drop_owned_stmtContext _localctx = new Drop_owned_stmtContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_drop_owned_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1885);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_policy_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Drop_policy_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_policy_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterDrop_policy_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitDrop_policy_stmt(this);
		}
	}

	public final Drop_policy_stmtContext drop_policy_stmt() throws RecognitionException {
		Drop_policy_stmtContext _localctx = new Drop_policy_stmtContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_drop_policy_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1887);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_publication_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Drop_publication_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_publication_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterDrop_publication_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitDrop_publication_stmt(this);
		}
	}

	public final Drop_publication_stmtContext drop_publication_stmt() throws RecognitionException {
		Drop_publication_stmtContext _localctx = new Drop_publication_stmtContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_drop_publication_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1889);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_role_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Drop_role_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_role_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterDrop_role_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitDrop_role_stmt(this);
		}
	}

	public final Drop_role_stmtContext drop_role_stmt() throws RecognitionException {
		Drop_role_stmtContext _localctx = new Drop_role_stmtContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_drop_role_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1891);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_rule_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Drop_rule_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_rule_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterDrop_rule_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitDrop_rule_stmt(this);
		}
	}

	public final Drop_rule_stmtContext drop_rule_stmt() throws RecognitionException {
		Drop_rule_stmtContext _localctx = new Drop_rule_stmtContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_drop_rule_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1893);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_schema_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Drop_schema_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_schema_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterDrop_schema_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitDrop_schema_stmt(this);
		}
	}

	public final Drop_schema_stmtContext drop_schema_stmt() throws RecognitionException {
		Drop_schema_stmtContext _localctx = new Drop_schema_stmtContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_drop_schema_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1895);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_sequence_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Drop_sequence_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_sequence_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterDrop_sequence_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitDrop_sequence_stmt(this);
		}
	}

	public final Drop_sequence_stmtContext drop_sequence_stmt() throws RecognitionException {
		Drop_sequence_stmtContext _localctx = new Drop_sequence_stmtContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_drop_sequence_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1897);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_server_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Drop_server_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_server_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterDrop_server_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitDrop_server_stmt(this);
		}
	}

	public final Drop_server_stmtContext drop_server_stmt() throws RecognitionException {
		Drop_server_stmtContext _localctx = new Drop_server_stmtContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_drop_server_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1899);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_statistics_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Drop_statistics_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_statistics_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterDrop_statistics_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitDrop_statistics_stmt(this);
		}
	}

	public final Drop_statistics_stmtContext drop_statistics_stmt() throws RecognitionException {
		Drop_statistics_stmtContext _localctx = new Drop_statistics_stmtContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_drop_statistics_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1901);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_subscription_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Drop_subscription_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_subscription_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterDrop_subscription_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitDrop_subscription_stmt(this);
		}
	}

	public final Drop_subscription_stmtContext drop_subscription_stmt() throws RecognitionException {
		Drop_subscription_stmtContext _localctx = new Drop_subscription_stmtContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_drop_subscription_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1903);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_table_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Drop_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterDrop_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitDrop_table_stmt(this);
		}
	}

	public final Drop_table_stmtContext drop_table_stmt() throws RecognitionException {
		Drop_table_stmtContext _localctx = new Drop_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_drop_table_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1905);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_tablespace_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Drop_tablespace_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_tablespace_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterDrop_tablespace_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitDrop_tablespace_stmt(this);
		}
	}

	public final Drop_tablespace_stmtContext drop_tablespace_stmt() throws RecognitionException {
		Drop_tablespace_stmtContext _localctx = new Drop_tablespace_stmtContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_drop_tablespace_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1907);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_text_search_config_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Drop_text_search_config_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_text_search_config_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterDrop_text_search_config_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitDrop_text_search_config_stmt(this);
		}
	}

	public final Drop_text_search_config_stmtContext drop_text_search_config_stmt() throws RecognitionException {
		Drop_text_search_config_stmtContext _localctx = new Drop_text_search_config_stmtContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_drop_text_search_config_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1909);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_text_search_dict_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Drop_text_search_dict_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_text_search_dict_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterDrop_text_search_dict_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitDrop_text_search_dict_stmt(this);
		}
	}

	public final Drop_text_search_dict_stmtContext drop_text_search_dict_stmt() throws RecognitionException {
		Drop_text_search_dict_stmtContext _localctx = new Drop_text_search_dict_stmtContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_drop_text_search_dict_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1911);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_text_search_parser_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Drop_text_search_parser_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_text_search_parser_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterDrop_text_search_parser_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitDrop_text_search_parser_stmt(this);
		}
	}

	public final Drop_text_search_parser_stmtContext drop_text_search_parser_stmt() throws RecognitionException {
		Drop_text_search_parser_stmtContext _localctx = new Drop_text_search_parser_stmtContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_drop_text_search_parser_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1913);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_text_search_template_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Drop_text_search_template_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_text_search_template_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterDrop_text_search_template_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitDrop_text_search_template_stmt(this);
		}
	}

	public final Drop_text_search_template_stmtContext drop_text_search_template_stmt() throws RecognitionException {
		Drop_text_search_template_stmtContext _localctx = new Drop_text_search_template_stmtContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_drop_text_search_template_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1915);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_transform_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Drop_transform_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_transform_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterDrop_transform_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitDrop_transform_stmt(this);
		}
	}

	public final Drop_transform_stmtContext drop_transform_stmt() throws RecognitionException {
		Drop_transform_stmtContext _localctx = new Drop_transform_stmtContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_drop_transform_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1917);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_trigger_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Drop_trigger_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_trigger_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterDrop_trigger_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitDrop_trigger_stmt(this);
		}
	}

	public final Drop_trigger_stmtContext drop_trigger_stmt() throws RecognitionException {
		Drop_trigger_stmtContext _localctx = new Drop_trigger_stmtContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_drop_trigger_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1919);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_type_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Drop_type_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_type_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterDrop_type_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitDrop_type_stmt(this);
		}
	}

	public final Drop_type_stmtContext drop_type_stmt() throws RecognitionException {
		Drop_type_stmtContext _localctx = new Drop_type_stmtContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_drop_type_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1921);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_user_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Drop_user_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_user_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterDrop_user_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitDrop_user_stmt(this);
		}
	}

	public final Drop_user_stmtContext drop_user_stmt() throws RecognitionException {
		Drop_user_stmtContext _localctx = new Drop_user_stmtContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_drop_user_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1923);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_user_mapping_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Drop_user_mapping_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_user_mapping_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterDrop_user_mapping_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitDrop_user_mapping_stmt(this);
		}
	}

	public final Drop_user_mapping_stmtContext drop_user_mapping_stmt() throws RecognitionException {
		Drop_user_mapping_stmtContext _localctx = new Drop_user_mapping_stmtContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_drop_user_mapping_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1925);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_view_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Drop_view_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_view_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterDrop_view_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitDrop_view_stmt(this);
		}
	}

	public final Drop_view_stmtContext drop_view_stmt() throws RecognitionException {
		Drop_view_stmtContext _localctx = new Drop_view_stmtContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_drop_view_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1927);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Execute_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Execute_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_execute_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterExecute_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitExecute_stmt(this);
		}
	}

	public final Execute_stmtContext execute_stmt() throws RecognitionException {
		Execute_stmtContext _localctx = new Execute_stmtContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_execute_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1929);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Explain_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Explain_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explain_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterExplain_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitExplain_stmt(this);
		}
	}

	public final Explain_stmtContext explain_stmt() throws RecognitionException {
		Explain_stmtContext _localctx = new Explain_stmtContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_explain_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1931);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fetch_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Fetch_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fetch_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterFetch_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitFetch_stmt(this);
		}
	}

	public final Fetch_stmtContext fetch_stmt() throws RecognitionException {
		Fetch_stmtContext _localctx = new Fetch_stmtContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_fetch_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1933);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Grant_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Grant_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grant_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterGrant_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitGrant_stmt(this);
		}
	}

	public final Grant_stmtContext grant_stmt() throws RecognitionException {
		Grant_stmtContext _localctx = new Grant_stmtContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_grant_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1935);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Import_foreign_schema_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Import_foreign_schema_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_foreign_schema_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterImport_foreign_schema_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitImport_foreign_schema_stmt(this);
		}
	}

	public final Import_foreign_schema_stmtContext import_foreign_schema_stmt() throws RecognitionException {
		Import_foreign_schema_stmtContext _localctx = new Import_foreign_schema_stmtContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_import_foreign_schema_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1937);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insert_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Insert_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterInsert_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitInsert_stmt(this);
		}
	}

	public final Insert_stmtContext insert_stmt() throws RecognitionException {
		Insert_stmtContext _localctx = new Insert_stmtContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_insert_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1939);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Listen_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Listen_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listen_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterListen_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitListen_stmt(this);
		}
	}

	public final Listen_stmtContext listen_stmt() throws RecognitionException {
		Listen_stmtContext _localctx = new Listen_stmtContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_listen_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1941);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Load_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Load_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_load_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterLoad_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitLoad_stmt(this);
		}
	}

	public final Load_stmtContext load_stmt() throws RecognitionException {
		Load_stmtContext _localctx = new Load_stmtContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_load_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1943);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Lock_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Lock_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lock_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterLock_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitLock_stmt(this);
		}
	}

	public final Lock_stmtContext lock_stmt() throws RecognitionException {
		Lock_stmtContext _localctx = new Lock_stmtContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_lock_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1945);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Move_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Move_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_move_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterMove_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitMove_stmt(this);
		}
	}

	public final Move_stmtContext move_stmt() throws RecognitionException {
		Move_stmtContext _localctx = new Move_stmtContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_move_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1947);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Notify_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Notify_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notify_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterNotify_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitNotify_stmt(this);
		}
	}

	public final Notify_stmtContext notify_stmt() throws RecognitionException {
		Notify_stmtContext _localctx = new Notify_stmtContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_notify_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1949);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Prepare_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Prepare_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prepare_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterPrepare_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitPrepare_stmt(this);
		}
	}

	public final Prepare_stmtContext prepare_stmt() throws RecognitionException {
		Prepare_stmtContext _localctx = new Prepare_stmtContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_prepare_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1951);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Prepare_transaction_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Prepare_transaction_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prepare_transaction_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterPrepare_transaction_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitPrepare_transaction_stmt(this);
		}
	}

	public final Prepare_transaction_stmtContext prepare_transaction_stmt() throws RecognitionException {
		Prepare_transaction_stmtContext _localctx = new Prepare_transaction_stmtContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_prepare_transaction_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1953);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Reassign_owned_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Reassign_owned_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reassign_owned_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterReassign_owned_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitReassign_owned_stmt(this);
		}
	}

	public final Reassign_owned_stmtContext reassign_owned_stmt() throws RecognitionException {
		Reassign_owned_stmtContext _localctx = new Reassign_owned_stmtContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_reassign_owned_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1955);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Refresh_materialized_view_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Refresh_materialized_view_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_refresh_materialized_view_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterRefresh_materialized_view_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitRefresh_materialized_view_stmt(this);
		}
	}

	public final Refresh_materialized_view_stmtContext refresh_materialized_view_stmt() throws RecognitionException {
		Refresh_materialized_view_stmtContext _localctx = new Refresh_materialized_view_stmtContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_refresh_materialized_view_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1957);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Reindex_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Reindex_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reindex_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterReindex_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitReindex_stmt(this);
		}
	}

	public final Reindex_stmtContext reindex_stmt() throws RecognitionException {
		Reindex_stmtContext _localctx = new Reindex_stmtContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_reindex_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1959);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Release_savepoint_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Release_savepoint_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_release_savepoint_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterRelease_savepoint_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitRelease_savepoint_stmt(this);
		}
	}

	public final Release_savepoint_stmtContext release_savepoint_stmt() throws RecognitionException {
		Release_savepoint_stmtContext _localctx = new Release_savepoint_stmtContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_release_savepoint_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1961);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Reset_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Reset_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reset_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterReset_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitReset_stmt(this);
		}
	}

	public final Reset_stmtContext reset_stmt() throws RecognitionException {
		Reset_stmtContext _localctx = new Reset_stmtContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_reset_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1963);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Revoke_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Revoke_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_revoke_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterRevoke_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitRevoke_stmt(this);
		}
	}

	public final Revoke_stmtContext revoke_stmt() throws RecognitionException {
		Revoke_stmtContext _localctx = new Revoke_stmtContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_revoke_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1965);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rollback_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Rollback_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rollback_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterRollback_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitRollback_stmt(this);
		}
	}

	public final Rollback_stmtContext rollback_stmt() throws RecognitionException {
		Rollback_stmtContext _localctx = new Rollback_stmtContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_rollback_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1967);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rollback_prepared_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Rollback_prepared_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rollback_prepared_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterRollback_prepared_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitRollback_prepared_stmt(this);
		}
	}

	public final Rollback_prepared_stmtContext rollback_prepared_stmt() throws RecognitionException {
		Rollback_prepared_stmtContext _localctx = new Rollback_prepared_stmtContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_rollback_prepared_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1969);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rollback_to_savepoint_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Rollback_to_savepoint_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rollback_to_savepoint_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterRollback_to_savepoint_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitRollback_to_savepoint_stmt(this);
		}
	}

	public final Rollback_to_savepoint_stmtContext rollback_to_savepoint_stmt() throws RecognitionException {
		Rollback_to_savepoint_stmtContext _localctx = new Rollback_to_savepoint_stmtContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_rollback_to_savepoint_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1971);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Savepoint_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Savepoint_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_savepoint_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterSavepoint_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitSavepoint_stmt(this);
		}
	}

	public final Savepoint_stmtContext savepoint_stmt() throws RecognitionException {
		Savepoint_stmtContext _localctx = new Savepoint_stmtContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_savepoint_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1973);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Security_label_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Security_label_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_security_label_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterSecurity_label_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitSecurity_label_stmt(this);
		}
	}

	public final Security_label_stmtContext security_label_stmt() throws RecognitionException {
		Security_label_stmtContext _localctx = new Security_label_stmtContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_security_label_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1975);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_stmtContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(PostgreSQLParser.SELECT, 0); }
		public Selector_clauseContext selector_clause() {
			return getRuleContext(Selector_clauseContext.class,0);
		}
		public From_clauseContext from_clause() {
			return getRuleContext(From_clauseContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Group_by_clauseContext group_by_clause() {
			return getRuleContext(Group_by_clauseContext.class,0);
		}
		public Having_clauseContext having_clause() {
			return getRuleContext(Having_clauseContext.class,0);
		}
		public Window_clauseContext window_clause() {
			return getRuleContext(Window_clauseContext.class,0);
		}
		public Combine_clauseContext combine_clause() {
			return getRuleContext(Combine_clauseContext.class,0);
		}
		public Order_by_clauseContext order_by_clause() {
			return getRuleContext(Order_by_clauseContext.class,0);
		}
		public Limit_clauseContext limit_clause() {
			return getRuleContext(Limit_clauseContext.class,0);
		}
		public Offset_clauseContext offset_clause() {
			return getRuleContext(Offset_clauseContext.class,0);
		}
		public Fetch_clauseContext fetch_clause() {
			return getRuleContext(Fetch_clauseContext.class,0);
		}
		public For_clauseContext for_clause() {
			return getRuleContext(For_clauseContext.class,0);
		}
		public Select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterSelect_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitSelect_stmt(this);
		}
	}

	public final Select_stmtContext select_stmt() throws RecognitionException {
		Select_stmtContext _localctx = new Select_stmtContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1977);
			match(SELECT);
			setState(1978);
			selector_clause();
			setState(1980);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(1979);
				from_clause();
				}
			}

			setState(1983);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(1982);
				where_clause();
				}
			}

			setState(1986);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(1985);
				group_by_clause();
				}
			}

			setState(1989);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HAVING) {
				{
				setState(1988);
				having_clause();
				}
			}

			setState(1992);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WINDOW) {
				{
				setState(1991);
				window_clause();
				}
			}

			setState(1995);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXCEPT || _la==INTERSECT || _la==UNION) {
				{
				setState(1994);
				combine_clause();
				}
			}

			setState(1998);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
			case 1:
				{
				setState(1997);
				order_by_clause();
				}
				break;
			}
			setState(2001);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
			case 1:
				{
				setState(2000);
				limit_clause();
				}
				break;
			}
			setState(2004);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				{
				setState(2003);
				offset_clause();
				}
				break;
			}
			setState(2007);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
			case 1:
				{
				setState(2006);
				fetch_clause();
				}
				break;
			}
			setState(2010);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
			case 1:
				{
				setState(2009);
				for_clause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Set_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Set_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterSet_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitSet_stmt(this);
		}
	}

	public final Set_stmtContext set_stmt() throws RecognitionException {
		Set_stmtContext _localctx = new Set_stmtContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_set_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2012);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Set_constraints_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Set_constraints_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_constraints_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterSet_constraints_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitSet_constraints_stmt(this);
		}
	}

	public final Set_constraints_stmtContext set_constraints_stmt() throws RecognitionException {
		Set_constraints_stmtContext _localctx = new Set_constraints_stmtContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_set_constraints_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2014);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Set_role_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Set_role_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_role_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterSet_role_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitSet_role_stmt(this);
		}
	}

	public final Set_role_stmtContext set_role_stmt() throws RecognitionException {
		Set_role_stmtContext _localctx = new Set_role_stmtContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_set_role_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2016);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Set_session_authorization_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Set_session_authorization_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_session_authorization_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterSet_session_authorization_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitSet_session_authorization_stmt(this);
		}
	}

	public final Set_session_authorization_stmtContext set_session_authorization_stmt() throws RecognitionException {
		Set_session_authorization_stmtContext _localctx = new Set_session_authorization_stmtContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_set_session_authorization_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2018);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Set_transaction_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Set_transaction_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_transaction_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterSet_transaction_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitSet_transaction_stmt(this);
		}
	}

	public final Set_transaction_stmtContext set_transaction_stmt() throws RecognitionException {
		Set_transaction_stmtContext _localctx = new Set_transaction_stmtContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_set_transaction_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2020);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Show_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Show_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_show_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterShow_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitShow_stmt(this);
		}
	}

	public final Show_stmtContext show_stmt() throws RecognitionException {
		Show_stmtContext _localctx = new Show_stmtContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_show_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2022);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Truncate_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Truncate_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_truncate_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterTruncate_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitTruncate_stmt(this);
		}
	}

	public final Truncate_stmtContext truncate_stmt() throws RecognitionException {
		Truncate_stmtContext _localctx = new Truncate_stmtContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_truncate_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2024);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unlisten_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Unlisten_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unlisten_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterUnlisten_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitUnlisten_stmt(this);
		}
	}

	public final Unlisten_stmtContext unlisten_stmt() throws RecognitionException {
		Unlisten_stmtContext _localctx = new Unlisten_stmtContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_unlisten_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2026);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Update_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Update_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterUpdate_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitUpdate_stmt(this);
		}
	}

	public final Update_stmtContext update_stmt() throws RecognitionException {
		Update_stmtContext _localctx = new Update_stmtContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_update_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2028);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Vacuum_stmtContext extends ParserRuleContext {
		public Todo_implementContext todo_implement() {
			return getRuleContext(Todo_implementContext.class,0);
		}
		public Vacuum_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vacuum_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterVacuum_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitVacuum_stmt(this);
		}
	}

	public final Vacuum_stmtContext vacuum_stmt() throws RecognitionException {
		Vacuum_stmtContext _localctx = new Vacuum_stmtContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_vacuum_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2030);
			todo_implement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Values_stmtContext extends ParserRuleContext {
		public TerminalNode VALUES() { return getToken(PostgreSQLParser.VALUES, 0); }
		public Expr_list_listContext expr_list_list() {
			return getRuleContext(Expr_list_listContext.class,0);
		}
		public Expr_listContext expr_list() {
			return getRuleContext(Expr_listContext.class,0);
		}
		public Order_by_clauseContext order_by_clause() {
			return getRuleContext(Order_by_clauseContext.class,0);
		}
		public Limit_clauseContext limit_clause() {
			return getRuleContext(Limit_clauseContext.class,0);
		}
		public Offset_clauseContext offset_clause() {
			return getRuleContext(Offset_clauseContext.class,0);
		}
		public Fetch_clauseContext fetch_clause() {
			return getRuleContext(Fetch_clauseContext.class,0);
		}
		public Values_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_values_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterValues_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitValues_stmt(this);
		}
	}

	public final Values_stmtContext values_stmt() throws RecognitionException {
		Values_stmtContext _localctx = new Values_stmtContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_values_stmt);
		try {
			setState(2049);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(2032);
				match(VALUES);
				setState(2033);
				expr_list_list();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(2034);
				match(VALUES);
				setState(2035);
				expr_list();
				}
				setState(2038);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
				case 1:
					{
					setState(2037);
					order_by_clause();
					}
					break;
				}
				setState(2041);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
				case 1:
					{
					setState(2040);
					limit_clause();
					}
					break;
				}
				setState(2044);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
				case 1:
					{
					setState(2043);
					offset_clause();
					}
					break;
				}
				setState(2047);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
				case 1:
					{
					setState(2046);
					fetch_clause();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Selector_clauseContext extends ParserRuleContext {
		public TerminalNode ALL() { return getToken(PostgreSQLParser.ALL, 0); }
		public List<TerminalNode> STAR() { return getTokens(PostgreSQLParser.STAR); }
		public TerminalNode STAR(int i) {
			return getToken(PostgreSQLParser.STAR, i);
		}
		public TerminalNode DISTINCT() { return getToken(PostgreSQLParser.DISTINCT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ON() { return getToken(PostgreSQLParser.ON, 0); }
		public Expr_listContext expr_list() {
			return getRuleContext(Expr_listContext.class,0);
		}
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PostgreSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PostgreSQLParser.COMMA, i);
		}
		public List<TerminalNode> AS() { return getTokens(PostgreSQLParser.AS); }
		public TerminalNode AS(int i) {
			return getToken(PostgreSQLParser.AS, i);
		}
		public Selector_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterSelector_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitSelector_clause(this);
		}
	}

	public final Selector_clauseContext selector_clause() throws RecognitionException {
		Selector_clauseContext _localctx = new Selector_clauseContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_selector_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2057);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
			case 1:
				{
				setState(2051);
				match(ALL);
				}
				break;
			case 2:
				{
				{
				setState(2052);
				match(DISTINCT);
				setState(2055);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(2053);
					match(ON);
					setState(2054);
					expr_list();
					}
				}

				}
				}
				break;
			}
			setState(2083);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
				{
				setState(2059);
				match(STAR);
				}
				break;
			case WHITESPACE:
			case A_:
			case ABORT:
			case ABS:
			case ABSOLUTE:
			case ACCESS:
			case ACTION:
			case ADA:
			case ADD:
			case ADMIN:
			case AFTER:
			case AGGREGATE:
			case ALL:
			case ALLOCATE:
			case ALSO:
			case ALTER:
			case ALWAYS:
			case ARE:
			case ARRAY:
			case ASENSITIVE:
			case ASSERTION:
			case ASSIGNMENT:
			case AT:
			case ATOMIC:
			case ATTRIBUTE:
			case ATTRIBUTES:
			case AVG:
			case BACKWARD:
			case BEFORE:
			case BEGIN:
			case BERNOULLI:
			case BETWEEN:
			case BIGINT:
			case BIT:
			case BIT_LENGTH:
			case BLOB:
			case BOOLEAN:
			case BREADTH:
			case BY:
			case C_:
			case CACHE:
			case CALL:
			case CALLED:
			case CARDINALITY:
			case CASCADE:
			case CASCADED:
			case CASE:
			case CAST:
			case CATALOG:
			case CATALOG_NAME:
			case CEIL:
			case CEILING:
			case CHAIN:
			case CHAR:
			case CHARACTER:
			case CHARACTERISTICS:
			case CHARACTERS:
			case CHARACTER_LENGTH:
			case CHARACTER_SET_CATALOG:
			case CHARACTER_SET_NAME:
			case CHARACTER_SET_SCHEMA:
			case CHAR_LENGTH:
			case CHECKPOINT:
			case CLASS:
			case CLASS_ORIGIN:
			case CLOB:
			case CLOSE:
			case CLUSTER:
			case COALESCE:
			case COBOL:
			case COLLATION_CATALOG:
			case COLLATION_NAME:
			case COLLATION_SCHEMA:
			case COLLECT:
			case COLUMN_NAME:
			case COMMAND_FUNCTION:
			case COMMAND_FUNCTION_CODE:
			case COMMENT:
			case COMMIT:
			case COMMITTED:
			case CONDITION:
			case CONDITION_NUMBER:
			case CONNECT:
			case CONNECTION:
			case CONNECTION_NAME:
			case CONSTRAINTS:
			case CONSTRAINT_CATALOG:
			case CONSTRAINT_NAME:
			case CONSTRAINT_SCHEMA:
			case CONSTRUCTOR:
			case CONTAINS:
			case CONTINUE:
			case CONVERSION:
			case CONVERT:
			case COPY:
			case CORR:
			case CORRESPONDING:
			case COUNT:
			case COVAR_POP:
			case COVAR_SAMP:
			case CSV:
			case CUBE:
			case CUME_DIST:
			case CURRENT:
			case CURRENT_DATE:
			case CURRENT_DEFAULT_TRANSFORM_GROUP:
			case CURRENT_PATH:
			case CURRENT_ROLE:
			case CURRENT_TIME:
			case CURRENT_TIMESTAMP:
			case CURRENT_TRANSFORM_GROUP_FOR_TYPE:
			case CURRENT_USER:
			case CURSOR:
			case CURSOR_NAME:
			case CYCLE:
			case DATA:
			case DATABASE:
			case DATE:
			case DATETIME_INTERVAL_CODE:
			case DATETIME_INTERVAL_PRECISION:
			case DAY:
			case DEALLOCATE:
			case DEC:
			case DECIMAL:
			case DECLARE:
			case DEFAULTS:
			case DEFERRED:
			case DEFINED:
			case DEFINER:
			case DEGREE:
			case DELETE:
			case DELIMITER:
			case DELIMITERS:
			case DENSE_RANK:
			case DEPTH:
			case DEREF:
			case DERIVED:
			case DESCRIBE:
			case DESCRIPTOR:
			case DETERMINISTIC:
			case DIAGNOSTICS:
			case DICTIONARY:
			case DISCONNECT:
			case DISPATCH:
			case DOMAIN:
			case DOUBLE:
			case DROP:
			case DYNAMIC:
			case DYNAMIC_FUNCTION:
			case DYNAMIC_FUNCTION_CODE:
			case EACH:
			case ELEMENT:
			case ENCODING:
			case ENCRYPTED:
			case END:
			case EQUALS:
			case ESCAPE:
			case EVERY:
			case EXCEPTION:
			case EXCLUDE:
			case EXCLUDING:
			case EXCLUSIVE:
			case EXEC:
			case EXECUTE:
			case EXISTS:
			case EXP:
			case EXPLAIN:
			case EXTERNAL:
			case EXTRACT:
			case FALSE:
			case FILTER:
			case FINAL:
			case FIRST:
			case FLOAT:
			case FLOOR:
			case FOLLOWING:
			case FORCE:
			case FORTRAN:
			case FORWARD:
			case FOUND:
			case FREE:
			case FUNCTION:
			case FUSION:
			case G_:
			case GENERAL:
			case GENERATED:
			case GET:
			case GLOBAL:
			case GO:
			case GOTO:
			case GRANTED:
			case GROUPING:
			case HANDLER:
			case HIERARCHY:
			case HOLD:
			case HOUR:
			case IDENTITY:
			case IGNORE:
			case IMMEDIATE:
			case IMMUTABLE:
			case IMPLEMENTATION:
			case IMPLICIT:
			case INCLUDING:
			case INCREMENT:
			case INDEX:
			case INDICATOR:
			case INHERITS:
			case INOUT:
			case INPUT:
			case INSENSITIVE:
			case INSERT:
			case INSTANCE:
			case INSTANTIABLE:
			case INSTEAD:
			case INT:
			case INTEGER:
			case INTERSECTION:
			case INTERVAL:
			case INVOKER:
			case ISOLATION:
			case KEY:
			case KEY_MEMBER:
			case KEY_TYPE:
			case LANGUAGE:
			case LARGE:
			case LAST:
			case LEFT:
			case LENGTH:
			case LEVEL:
			case LISTEN:
			case LN:
			case LOAD:
			case LOCAL:
			case LOCATION:
			case LOCATOR:
			case LOCK:
			case LOCKED:
			case LOWER:
			case M_:
			case MAP:
			case MATCH:
			case MATCHED:
			case MAX:
			case MAXVALUE:
			case MEMBER:
			case MERGE:
			case MESSAGE_LENGTH:
			case MESSAGE_OCTET_LENGTH:
			case MESSAGE_TEXT:
			case METHOD:
			case MIN:
			case MINUTE:
			case MINVALUE:
			case MOD:
			case MODE:
			case MODIFIES:
			case MODULE:
			case MONTH:
			case MORE_:
			case MOVE:
			case MULTISET:
			case MUMPS:
			case NAME:
			case NAMES:
			case NATIONAL:
			case NCHAR:
			case NCLOB:
			case NESTING:
			case NEW:
			case NEXT:
			case NO:
			case NONE:
			case NORMALIZE:
			case NORMALIZED:
			case NOT:
			case NOTHING:
			case NOTIFY:
			case NOWAIT:
			case NULL:
			case NULLABLE:
			case NULLIF:
			case NULLS:
			case NUMBER:
			case NUMERIC:
			case OBJECT:
			case OCTETS:
			case OCTET_LENGTH:
			case OF:
			case OFF:
			case OIDS:
			case OLD:
			case OPEN:
			case OPERATOR:
			case OPTION:
			case OPTIONS:
			case ORDERING:
			case ORDINALITY:
			case OTHERS:
			case OUT:
			case OUTPUT:
			case OVER:
			case OVERLAY:
			case OVERRIDING:
			case OWNER:
			case PAD:
			case PARAMETER:
			case PARAMETER_MODE:
			case PARAMETER_NAME:
			case PARAMETER_ORDINAL_POSITION:
			case PARAMETER_SPECIFIC_CATALOG:
			case PARAMETER_SPECIFIC_NAME:
			case PARAMETER_SPECIFIC_SCHEMA:
			case PARTIAL:
			case PARTITION:
			case PASCAL:
			case PASSWORD:
			case PATH:
			case PERCENTILE_CONT:
			case PERCENTILE_DISC:
			case PERCENT_RANK:
			case PLI:
			case POSITION:
			case POWER:
			case PRECEDING:
			case PRECISION:
			case PREPARE:
			case PRESERVE:
			case PRIOR:
			case PRIVILEGES:
			case PROCEDURAL:
			case PROCEDURE:
			case PUBLIC:
			case QUOTE:
			case RANGE:
			case RANK:
			case READ:
			case READS:
			case REAL:
			case RECHECK:
			case RECURSIVE:
			case REF:
			case REFERENCING:
			case REGR_AVGX:
			case REGR_AVGY:
			case REGR_COUNT:
			case REGR_INTERCEPT:
			case REGR_SLOPE:
			case REGR_SXX:
			case REGR_SXY:
			case REGR_SYY:
			case REINDEX:
			case RELATIVE:
			case RELEASE:
			case RENAME:
			case REPEATABLE:
			case REPLACE:
			case RESET:
			case RESTART:
			case RESTRICT:
			case RESULT:
			case RETURN:
			case RETURNED_CARDINALITY:
			case RETURNED_LENGTH:
			case RETURNED_OCTET_LENGTH:
			case RETURNED_SQLSTATE:
			case RETURNS:
			case REVOKE:
			case RIGHT:
			case ROLE:
			case ROLLBACK:
			case ROLLUP:
			case ROUTINE:
			case ROUTINE_CATALOG:
			case ROUTINE_NAME:
			case ROUTINE_SCHEMA:
			case ROW:
			case ROWS:
			case ROW_COUNT:
			case ROW_NUMBER:
			case RULE:
			case SAVEPOINT:
			case SCALE:
			case SCHEMA:
			case SCHEMA_NAME:
			case SCOPE:
			case SCOPE_CATALOG:
			case SCOPE_NAME:
			case SCOPE_SCHEMA:
			case SCROLL:
			case SEARCH:
			case SECOND:
			case SECTION:
			case SECURITY:
			case SELF:
			case SENSITIVE:
			case SEQUENCE:
			case SERIALIZABLE:
			case SERVER_NAME:
			case SESSION:
			case SET:
			case SETOF:
			case SETS:
			case SHARE:
			case SHOW:
			case SIMPLE:
			case SIZE:
			case SMALLINT:
			case SOURCE:
			case SPACE:
			case SPECIFIC:
			case SPECIFICTYPE:
			case SPECIFIC_NAME:
			case SQL:
			case SQLCODE:
			case SQLERROR:
			case SQLEXCEPTION:
			case SQLSTATE:
			case SQLWARNING:
			case SQRT:
			case STABLE:
			case START:
			case STATE:
			case STATEMENT:
			case STATIC:
			case STATISTICS:
			case STDDEV_POP:
			case STDDEV_SAMP:
			case STDIN:
			case STDOUT:
			case STORAGE:
			case STRICT:
			case STRUCTURE:
			case STYLE:
			case SUBCLASS_ORIGIN:
			case SUBMULTISET:
			case SUBSTRING:
			case SUM:
			case SYSID:
			case SYSTEM:
			case SYSTEM_USER:
			case TABLESPACE:
			case TABLE_NAME:
			case TEMP:
			case TEMPLATE:
			case TEMPORARY:
			case TIES:
			case TIME:
			case TIME_TZ:
			case TIMESTAMP:
			case TIMESTAMP_TZ:
			case TIMEZONE_HOUR:
			case TIMEZONE_MINUTE:
			case TOP_LEVEL_COUNT:
			case TRANSACTION:
			case TRANSACTIONS_COMMITTED:
			case TRANSACTIONS_ROLLED_BACK:
			case TRANSACTION_ACTIVE:
			case TRANSFORM:
			case TRANSFORMS:
			case TRANSLATE:
			case TRANSLATION:
			case TREAT:
			case TRIGGER:
			case TRIGGER_CATALOG:
			case TRIGGER_NAME:
			case TRIGGER_SCHEMA:
			case TRIM:
			case TRUE:
			case TRUNCATE:
			case TRUSTED:
			case TYPE:
			case UESCAPE:
			case UNBOUNDED:
			case UNCOMMITTED:
			case UNDER:
			case UNENCRYPTED:
			case UNKNOWN:
			case UNLISTEN:
			case UNNAMED:
			case UNNEST:
			case UNTIL:
			case UPDATE:
			case UPPER:
			case USAGE:
			case USER_DEFINED_TYPE_CATALOG:
			case USER_DEFINED_TYPE_CODE:
			case USER_DEFINED_TYPE_NAME:
			case USER_DEFINED_TYPE_SCHEMA:
			case VACUUM:
			case VALID:
			case VALIDATOR:
			case VALUE:
			case VALUES:
			case VARCHAR:
			case VARYING:
			case VAR_POP:
			case VAR_SAMP:
			case VIEW:
			case VOLATILE:
			case WHENEVER:
			case WIDTH_BUCKET:
			case WITHIN:
			case WITHOUT:
			case WORK:
			case WRITE:
			case YEAR:
			case ZONE:
			case ABSTIME:
			case BOOL:
			case BOX:
			case FLOAT4:
			case FLOAT8:
			case INT2:
			case INT4:
			case INT8:
			case JSON:
			case JSONB:
			case LINE:
			case POINT:
			case RELTIME:
			case TEXT:
			case DOLLAR:
			case DOLLAR_DOLLAR:
			case OPEN_PAREN:
			case BIT_STRING:
			case REGEX_STRING:
			case NUMERIC_LITERAL:
			case INTEGER_LITERAL:
			case HEX_INTEGER_LITERAL:
			case SINGLEQ_STRING_LITERAL:
			case DOUBLEQ_STRING_LITERAL:
			case IDENTIFIER:
			case AT_SIGN:
			case BANG_BANG:
			case MINUS:
			case PLUS:
			case QMARK_HYPHEN:
			case TIL:
				{
				{
				setState(2060);
				expr(0);
				setState(2065);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHITESPACE) | (1L << A_) | (1L << ABORT) | (1L << ABS) | (1L << ABSOLUTE) | (1L << ACCESS) | (1L << ACTION) | (1L << ADA) | (1L << ADD) | (1L << ADMIN) | (1L << AFTER) | (1L << AGGREGATE) | (1L << ALLOCATE) | (1L << ALSO) | (1L << ALTER) | (1L << ALWAYS) | (1L << ARE) | (1L << AS) | (1L << ASENSITIVE) | (1L << ASSERTION) | (1L << ASSIGNMENT) | (1L << AT) | (1L << ATOMIC) | (1L << ATTRIBUTE) | (1L << ATTRIBUTES) | (1L << AVG) | (1L << BACKWARD) | (1L << BEFORE) | (1L << BEGIN) | (1L << BERNOULLI) | (1L << BETWEEN) | (1L << BIGINT) | (1L << BIT) | (1L << BIT_LENGTH) | (1L << BLOB) | (1L << BOOLEAN) | (1L << BREADTH) | (1L << BY) | (1L << C_) | (1L << CACHE) | (1L << CALL) | (1L << CALLED) | (1L << CARDINALITY) | (1L << CASCADE) | (1L << CASCADED) | (1L << CATALOG))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CATALOG_NAME - 64)) | (1L << (CEIL - 64)) | (1L << (CEILING - 64)) | (1L << (CHAIN - 64)) | (1L << (CHAR - 64)) | (1L << (CHARACTER - 64)) | (1L << (CHARACTERISTICS - 64)) | (1L << (CHARACTERS - 64)) | (1L << (CHARACTER_LENGTH - 64)) | (1L << (CHARACTER_SET_CATALOG - 64)) | (1L << (CHARACTER_SET_NAME - 64)) | (1L << (CHARACTER_SET_SCHEMA - 64)) | (1L << (CHAR_LENGTH - 64)) | (1L << (CHECKPOINT - 64)) | (1L << (CLASS - 64)) | (1L << (CLASS_ORIGIN - 64)) | (1L << (CLOB - 64)) | (1L << (CLOSE - 64)) | (1L << (CLUSTER - 64)) | (1L << (COALESCE - 64)) | (1L << (COBOL - 64)) | (1L << (COLLATION_CATALOG - 64)) | (1L << (COLLATION_NAME - 64)) | (1L << (COLLATION_SCHEMA - 64)) | (1L << (COLLECT - 64)) | (1L << (COLUMN_NAME - 64)) | (1L << (COMMAND_FUNCTION - 64)) | (1L << (COMMAND_FUNCTION_CODE - 64)) | (1L << (COMMENT - 64)) | (1L << (COMMIT - 64)) | (1L << (COMMITTED - 64)) | (1L << (CONDITION - 64)) | (1L << (CONDITION_NUMBER - 64)) | (1L << (CONNECT - 64)) | (1L << (CONNECTION - 64)) | (1L << (CONNECTION_NAME - 64)) | (1L << (CONSTRAINTS - 64)) | (1L << (CONSTRAINT_CATALOG - 64)) | (1L << (CONSTRAINT_NAME - 64)) | (1L << (CONSTRAINT_SCHEMA - 64)) | (1L << (CONSTRUCTOR - 64)) | (1L << (CONTAINS - 64)) | (1L << (CONTINUE - 64)) | (1L << (CONVERSION - 64)) | (1L << (CONVERT - 64)) | (1L << (COPY - 64)) | (1L << (CORR - 64)) | (1L << (CORRESPONDING - 64)) | (1L << (COUNT - 64)) | (1L << (COVAR_POP - 64)) | (1L << (COVAR_SAMP - 64)) | (1L << (CSV - 64)) | (1L << (CUBE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (CUME_DIST - 128)) | (1L << (CURRENT - 128)) | (1L << (CURRENT_DEFAULT_TRANSFORM_GROUP - 128)) | (1L << (CURRENT_PATH - 128)) | (1L << (CURRENT_TRANSFORM_GROUP_FOR_TYPE - 128)) | (1L << (CURSOR - 128)) | (1L << (CURSOR_NAME - 128)) | (1L << (CYCLE - 128)) | (1L << (DATA - 128)) | (1L << (DATABASE - 128)) | (1L << (DATE - 128)) | (1L << (DATETIME_INTERVAL_CODE - 128)) | (1L << (DATETIME_INTERVAL_PRECISION - 128)) | (1L << (DAY - 128)) | (1L << (DEALLOCATE - 128)) | (1L << (DEC - 128)) | (1L << (DECIMAL - 128)) | (1L << (DECLARE - 128)) | (1L << (DEFAULTS - 128)) | (1L << (DEFERRED - 128)) | (1L << (DEFINED - 128)) | (1L << (DEFINER - 128)) | (1L << (DEGREE - 128)) | (1L << (DELETE - 128)) | (1L << (DELIMITER - 128)) | (1L << (DELIMITERS - 128)) | (1L << (DENSE_RANK - 128)) | (1L << (DEPTH - 128)) | (1L << (DEREF - 128)) | (1L << (DERIVED - 128)) | (1L << (DESCRIBE - 128)) | (1L << (DESCRIPTOR - 128)) | (1L << (DETERMINISTIC - 128)) | (1L << (DIAGNOSTICS - 128)) | (1L << (DICTIONARY - 128)) | (1L << (DISCONNECT - 128)) | (1L << (DISPATCH - 128)) | (1L << (DOMAIN - 128)) | (1L << (DOUBLE - 128)) | (1L << (DROP - 128)) | (1L << (DYNAMIC - 128)) | (1L << (DYNAMIC_FUNCTION - 128)) | (1L << (DYNAMIC_FUNCTION_CODE - 128)) | (1L << (EACH - 128)) | (1L << (ELEMENT - 128)) | (1L << (ENCODING - 128)) | (1L << (ENCRYPTED - 128)) | (1L << (END - 128)) | (1L << (EQUALS - 128)) | (1L << (ESCAPE - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (EVERY - 192)) | (1L << (EXCEPTION - 192)) | (1L << (EXCLUDE - 192)) | (1L << (EXCLUDING - 192)) | (1L << (EXCLUSIVE - 192)) | (1L << (EXEC - 192)) | (1L << (EXECUTE - 192)) | (1L << (EXISTS - 192)) | (1L << (EXP - 192)) | (1L << (EXPLAIN - 192)) | (1L << (EXTERNAL - 192)) | (1L << (EXTRACT - 192)) | (1L << (FILTER - 192)) | (1L << (FINAL - 192)) | (1L << (FIRST - 192)) | (1L << (FLOAT - 192)) | (1L << (FLOOR - 192)) | (1L << (FOLLOWING - 192)) | (1L << (FORCE - 192)) | (1L << (FORTRAN - 192)) | (1L << (FORWARD - 192)) | (1L << (FOUND - 192)) | (1L << (FREE - 192)) | (1L << (FUNCTION - 192)) | (1L << (FUSION - 192)) | (1L << (G_ - 192)) | (1L << (GENERAL - 192)) | (1L << (GENERATED - 192)) | (1L << (GET - 192)) | (1L << (GLOBAL - 192)) | (1L << (GO - 192)) | (1L << (GOTO - 192)) | (1L << (GRANTED - 192)) | (1L << (GROUPING - 192)) | (1L << (HANDLER - 192)) | (1L << (HIERARCHY - 192)) | (1L << (HOLD - 192)) | (1L << (HOUR - 192)) | (1L << (IDENTITY - 192)) | (1L << (IGNORE - 192)) | (1L << (IMMEDIATE - 192)) | (1L << (IMMUTABLE - 192)) | (1L << (IMPLEMENTATION - 192)) | (1L << (IMPLICIT - 192)) | (1L << (INCLUDING - 192)) | (1L << (INCREMENT - 192)) | (1L << (INDEX - 192)) | (1L << (INDICATOR - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (INHERITS - 256)) | (1L << (INOUT - 256)) | (1L << (INPUT - 256)) | (1L << (INSENSITIVE - 256)) | (1L << (INSERT - 256)) | (1L << (INSTANCE - 256)) | (1L << (INSTANTIABLE - 256)) | (1L << (INSTEAD - 256)) | (1L << (INT - 256)) | (1L << (INTEGER - 256)) | (1L << (INTERSECTION - 256)) | (1L << (INTERVAL - 256)) | (1L << (INVOKER - 256)) | (1L << (ISOLATION - 256)) | (1L << (KEY - 256)) | (1L << (KEY_MEMBER - 256)) | (1L << (KEY_TYPE - 256)) | (1L << (LANGUAGE - 256)) | (1L << (LARGE - 256)) | (1L << (LAST - 256)) | (1L << (LEFT - 256)) | (1L << (LENGTH - 256)) | (1L << (LEVEL - 256)) | (1L << (LISTEN - 256)) | (1L << (LN - 256)) | (1L << (LOAD - 256)) | (1L << (LOCAL - 256)) | (1L << (LOCATION - 256)) | (1L << (LOCATOR - 256)) | (1L << (LOCK - 256)) | (1L << (LOCKED - 256)) | (1L << (LOWER - 256)) | (1L << (M_ - 256)) | (1L << (MAP - 256)) | (1L << (MATCH - 256)) | (1L << (MATCHED - 256)) | (1L << (MAX - 256)) | (1L << (MAXVALUE - 256)) | (1L << (MEMBER - 256)) | (1L << (MERGE - 256)) | (1L << (MESSAGE_LENGTH - 256)) | (1L << (MESSAGE_OCTET_LENGTH - 256)) | (1L << (MESSAGE_TEXT - 256)) | (1L << (METHOD - 256)) | (1L << (MIN - 256)) | (1L << (MINUTE - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (MINVALUE - 320)) | (1L << (MOD - 320)) | (1L << (MODE - 320)) | (1L << (MODIFIES - 320)) | (1L << (MODULE - 320)) | (1L << (MONTH - 320)) | (1L << (MORE_ - 320)) | (1L << (MOVE - 320)) | (1L << (MULTISET - 320)) | (1L << (MUMPS - 320)) | (1L << (NAME - 320)) | (1L << (NAMES - 320)) | (1L << (NATIONAL - 320)) | (1L << (NCHAR - 320)) | (1L << (NCLOB - 320)) | (1L << (NESTING - 320)) | (1L << (NEW - 320)) | (1L << (NEXT - 320)) | (1L << (NO - 320)) | (1L << (NONE - 320)) | (1L << (NORMALIZE - 320)) | (1L << (NORMALIZED - 320)) | (1L << (NOTHING - 320)) | (1L << (NOTIFY - 320)) | (1L << (NOWAIT - 320)) | (1L << (NULLABLE - 320)) | (1L << (NULLIF - 320)) | (1L << (NULLS - 320)) | (1L << (NUMBER - 320)) | (1L << (NUMERIC - 320)) | (1L << (OBJECT - 320)) | (1L << (OCTETS - 320)) | (1L << (OCTET_LENGTH - 320)) | (1L << (OF - 320)) | (1L << (OFF - 320)) | (1L << (OIDS - 320)) | (1L << (OLD - 320)) | (1L << (OPEN - 320)) | (1L << (OPERATOR - 320)) | (1L << (OPTION - 320)) | (1L << (OPTIONS - 320)) | (1L << (ORDERING - 320)) | (1L << (ORDINALITY - 320)) | (1L << (OTHERS - 320)) | (1L << (OUT - 320)) | (1L << (OUTPUT - 320)) | (1L << (OVER - 320)) | (1L << (OVERLAY - 320)) | (1L << (OVERRIDING - 320)))) != 0) || ((((_la - 384)) & ~0x3f) == 0 && ((1L << (_la - 384)) & ((1L << (OWNER - 384)) | (1L << (PAD - 384)) | (1L << (PARAMETER - 384)) | (1L << (PARAMETER_MODE - 384)) | (1L << (PARAMETER_NAME - 384)) | (1L << (PARAMETER_ORDINAL_POSITION - 384)) | (1L << (PARAMETER_SPECIFIC_CATALOG - 384)) | (1L << (PARAMETER_SPECIFIC_NAME - 384)) | (1L << (PARAMETER_SPECIFIC_SCHEMA - 384)) | (1L << (PARTIAL - 384)) | (1L << (PARTITION - 384)) | (1L << (PASCAL - 384)) | (1L << (PASSWORD - 384)) | (1L << (PATH - 384)) | (1L << (PERCENTILE_CONT - 384)) | (1L << (PERCENTILE_DISC - 384)) | (1L << (PERCENT_RANK - 384)) | (1L << (PLI - 384)) | (1L << (POSITION - 384)) | (1L << (POWER - 384)) | (1L << (PRECEDING - 384)) | (1L << (PRECISION - 384)) | (1L << (PREPARE - 384)) | (1L << (PRESERVE - 384)) | (1L << (PRIOR - 384)) | (1L << (PRIVILEGES - 384)) | (1L << (PROCEDURAL - 384)) | (1L << (PROCEDURE - 384)) | (1L << (PUBLIC - 384)) | (1L << (QUOTE - 384)) | (1L << (RANGE - 384)) | (1L << (RANK - 384)) | (1L << (READ - 384)) | (1L << (READS - 384)) | (1L << (REAL - 384)) | (1L << (RECHECK - 384)) | (1L << (RECURSIVE - 384)) | (1L << (REF - 384)) | (1L << (REFERENCING - 384)) | (1L << (REGR_AVGX - 384)) | (1L << (REGR_AVGY - 384)) | (1L << (REGR_COUNT - 384)) | (1L << (REGR_INTERCEPT - 384)) | (1L << (REGR_SLOPE - 384)) | (1L << (REGR_SXX - 384)) | (1L << (REGR_SXY - 384)) | (1L << (REGR_SYY - 384)) | (1L << (REINDEX - 384)) | (1L << (RELATIVE - 384)) | (1L << (RELEASE - 384)) | (1L << (RENAME - 384)) | (1L << (REPEATABLE - 384)) | (1L << (REPLACE - 384)) | (1L << (RESET - 384)) | (1L << (RESTART - 384)) | (1L << (RESTRICT - 384)))) != 0) || ((((_la - 448)) & ~0x3f) == 0 && ((1L << (_la - 448)) & ((1L << (RESULT - 448)) | (1L << (RETURN - 448)) | (1L << (RETURNED_CARDINALITY - 448)) | (1L << (RETURNED_LENGTH - 448)) | (1L << (RETURNED_OCTET_LENGTH - 448)) | (1L << (RETURNED_SQLSTATE - 448)) | (1L << (RETURNS - 448)) | (1L << (REVOKE - 448)) | (1L << (RIGHT - 448)) | (1L << (ROLE - 448)) | (1L << (ROLLBACK - 448)) | (1L << (ROLLUP - 448)) | (1L << (ROUTINE - 448)) | (1L << (ROUTINE_CATALOG - 448)) | (1L << (ROUTINE_NAME - 448)) | (1L << (ROUTINE_SCHEMA - 448)) | (1L << (ROW - 448)) | (1L << (ROWS - 448)) | (1L << (ROW_COUNT - 448)) | (1L << (ROW_NUMBER - 448)) | (1L << (RULE - 448)) | (1L << (SAVEPOINT - 448)) | (1L << (SCALE - 448)) | (1L << (SCHEMA - 448)) | (1L << (SCHEMA_NAME - 448)) | (1L << (SCOPE - 448)) | (1L << (SCOPE_CATALOG - 448)) | (1L << (SCOPE_NAME - 448)) | (1L << (SCOPE_SCHEMA - 448)) | (1L << (SCROLL - 448)) | (1L << (SEARCH - 448)) | (1L << (SECOND - 448)) | (1L << (SECTION - 448)) | (1L << (SECURITY - 448)) | (1L << (SELF - 448)) | (1L << (SENSITIVE - 448)) | (1L << (SEQUENCE - 448)) | (1L << (SERIALIZABLE - 448)) | (1L << (SERVER_NAME - 448)) | (1L << (SESSION - 448)) | (1L << (SET - 448)) | (1L << (SETOF - 448)) | (1L << (SETS - 448)) | (1L << (SHARE - 448)) | (1L << (SHOW - 448)) | (1L << (SIMPLE - 448)) | (1L << (SIZE - 448)) | (1L << (SMALLINT - 448)) | (1L << (SOURCE - 448)) | (1L << (SPACE - 448)) | (1L << (SPECIFIC - 448)) | (1L << (SPECIFICTYPE - 448)) | (1L << (SPECIFIC_NAME - 448)) | (1L << (SQL - 448)) | (1L << (SQLCODE - 448)) | (1L << (SQLERROR - 448)) | (1L << (SQLEXCEPTION - 448)) | (1L << (SQLSTATE - 448)) | (1L << (SQLWARNING - 448)))) != 0) || ((((_la - 512)) & ~0x3f) == 0 && ((1L << (_la - 512)) & ((1L << (SQRT - 512)) | (1L << (STABLE - 512)) | (1L << (START - 512)) | (1L << (STATE - 512)) | (1L << (STATEMENT - 512)) | (1L << (STATIC - 512)) | (1L << (STATISTICS - 512)) | (1L << (STDDEV_POP - 512)) | (1L << (STDDEV_SAMP - 512)) | (1L << (STDIN - 512)) | (1L << (STDOUT - 512)) | (1L << (STORAGE - 512)) | (1L << (STRICT - 512)) | (1L << (STRUCTURE - 512)) | (1L << (STYLE - 512)) | (1L << (SUBCLASS_ORIGIN - 512)) | (1L << (SUBMULTISET - 512)) | (1L << (SUBSTRING - 512)) | (1L << (SUM - 512)) | (1L << (SYSID - 512)) | (1L << (SYSTEM - 512)) | (1L << (SYSTEM_USER - 512)) | (1L << (TABLESPACE - 512)) | (1L << (TABLE_NAME - 512)) | (1L << (TEMP - 512)) | (1L << (TEMPLATE - 512)) | (1L << (TEMPORARY - 512)) | (1L << (TIES - 512)) | (1L << (TIME - 512)) | (1L << (TIMESTAMP - 512)) | (1L << (TIMEZONE_HOUR - 512)) | (1L << (TIMEZONE_MINUTE - 512)) | (1L << (TOP_LEVEL_COUNT - 512)) | (1L << (TRANSACTION - 512)) | (1L << (TRANSACTIONS_COMMITTED - 512)) | (1L << (TRANSACTIONS_ROLLED_BACK - 512)) | (1L << (TRANSACTION_ACTIVE - 512)) | (1L << (TRANSFORM - 512)) | (1L << (TRANSFORMS - 512)) | (1L << (TRANSLATE - 512)) | (1L << (TRANSLATION - 512)) | (1L << (TREAT - 512)) | (1L << (TRIGGER - 512)) | (1L << (TRIGGER_CATALOG - 512)) | (1L << (TRIGGER_NAME - 512)) | (1L << (TRIGGER_SCHEMA - 512)) | (1L << (TRIM - 512)) | (1L << (TRUNCATE - 512)) | (1L << (TRUSTED - 512)) | (1L << (TYPE - 512)) | (1L << (UESCAPE - 512)))) != 0) || ((((_la - 576)) & ~0x3f) == 0 && ((1L << (_la - 576)) & ((1L << (UNBOUNDED - 576)) | (1L << (UNCOMMITTED - 576)) | (1L << (UNDER - 576)) | (1L << (UNENCRYPTED - 576)) | (1L << (UNKNOWN - 576)) | (1L << (UNLISTEN - 576)) | (1L << (UNNAMED - 576)) | (1L << (UNNEST - 576)) | (1L << (UNTIL - 576)) | (1L << (UPDATE - 576)) | (1L << (UPPER - 576)) | (1L << (USAGE - 576)) | (1L << (USER_DEFINED_TYPE_CATALOG - 576)) | (1L << (USER_DEFINED_TYPE_CODE - 576)) | (1L << (USER_DEFINED_TYPE_NAME - 576)) | (1L << (USER_DEFINED_TYPE_SCHEMA - 576)) | (1L << (VACUUM - 576)) | (1L << (VALID - 576)) | (1L << (VALIDATOR - 576)) | (1L << (VALUE - 576)) | (1L << (VALUES - 576)) | (1L << (VARCHAR - 576)) | (1L << (VARYING - 576)) | (1L << (VAR_POP - 576)) | (1L << (VAR_SAMP - 576)) | (1L << (VIEW - 576)) | (1L << (VOLATILE - 576)) | (1L << (WHENEVER - 576)) | (1L << (WIDTH_BUCKET - 576)) | (1L << (WITHIN - 576)) | (1L << (WITHOUT - 576)) | (1L << (WORK - 576)) | (1L << (WRITE - 576)) | (1L << (YEAR - 576)) | (1L << (ZONE - 576)))) != 0) || ((((_la - 716)) & ~0x3f) == 0 && ((1L << (_la - 716)) & ((1L << (SINGLEQ_STRING_LITERAL - 716)) | (1L << (DOUBLEQ_STRING_LITERAL - 716)) | (1L << (IDENTIFIER - 716)))) != 0)) {
					{
					setState(2062);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(2061);
						match(AS);
						}
					}

					setState(2064);
					name();
					}
				}

				setState(2080);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2067);
					match(COMMA);
					setState(2076);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case STAR:
						{
						setState(2068);
						match(STAR);
						}
						break;
					case WHITESPACE:
					case A_:
					case ABORT:
					case ABS:
					case ABSOLUTE:
					case ACCESS:
					case ACTION:
					case ADA:
					case ADD:
					case ADMIN:
					case AFTER:
					case AGGREGATE:
					case ALL:
					case ALLOCATE:
					case ALSO:
					case ALTER:
					case ALWAYS:
					case ARE:
					case ARRAY:
					case ASENSITIVE:
					case ASSERTION:
					case ASSIGNMENT:
					case AT:
					case ATOMIC:
					case ATTRIBUTE:
					case ATTRIBUTES:
					case AVG:
					case BACKWARD:
					case BEFORE:
					case BEGIN:
					case BERNOULLI:
					case BETWEEN:
					case BIGINT:
					case BIT:
					case BIT_LENGTH:
					case BLOB:
					case BOOLEAN:
					case BREADTH:
					case BY:
					case C_:
					case CACHE:
					case CALL:
					case CALLED:
					case CARDINALITY:
					case CASCADE:
					case CASCADED:
					case CASE:
					case CAST:
					case CATALOG:
					case CATALOG_NAME:
					case CEIL:
					case CEILING:
					case CHAIN:
					case CHAR:
					case CHARACTER:
					case CHARACTERISTICS:
					case CHARACTERS:
					case CHARACTER_LENGTH:
					case CHARACTER_SET_CATALOG:
					case CHARACTER_SET_NAME:
					case CHARACTER_SET_SCHEMA:
					case CHAR_LENGTH:
					case CHECKPOINT:
					case CLASS:
					case CLASS_ORIGIN:
					case CLOB:
					case CLOSE:
					case CLUSTER:
					case COALESCE:
					case COBOL:
					case COLLATION_CATALOG:
					case COLLATION_NAME:
					case COLLATION_SCHEMA:
					case COLLECT:
					case COLUMN_NAME:
					case COMMAND_FUNCTION:
					case COMMAND_FUNCTION_CODE:
					case COMMENT:
					case COMMIT:
					case COMMITTED:
					case CONDITION:
					case CONDITION_NUMBER:
					case CONNECT:
					case CONNECTION:
					case CONNECTION_NAME:
					case CONSTRAINTS:
					case CONSTRAINT_CATALOG:
					case CONSTRAINT_NAME:
					case CONSTRAINT_SCHEMA:
					case CONSTRUCTOR:
					case CONTAINS:
					case CONTINUE:
					case CONVERSION:
					case CONVERT:
					case COPY:
					case CORR:
					case CORRESPONDING:
					case COUNT:
					case COVAR_POP:
					case COVAR_SAMP:
					case CSV:
					case CUBE:
					case CUME_DIST:
					case CURRENT:
					case CURRENT_DATE:
					case CURRENT_DEFAULT_TRANSFORM_GROUP:
					case CURRENT_PATH:
					case CURRENT_ROLE:
					case CURRENT_TIME:
					case CURRENT_TIMESTAMP:
					case CURRENT_TRANSFORM_GROUP_FOR_TYPE:
					case CURRENT_USER:
					case CURSOR:
					case CURSOR_NAME:
					case CYCLE:
					case DATA:
					case DATABASE:
					case DATE:
					case DATETIME_INTERVAL_CODE:
					case DATETIME_INTERVAL_PRECISION:
					case DAY:
					case DEALLOCATE:
					case DEC:
					case DECIMAL:
					case DECLARE:
					case DEFAULTS:
					case DEFERRED:
					case DEFINED:
					case DEFINER:
					case DEGREE:
					case DELETE:
					case DELIMITER:
					case DELIMITERS:
					case DENSE_RANK:
					case DEPTH:
					case DEREF:
					case DERIVED:
					case DESCRIBE:
					case DESCRIPTOR:
					case DETERMINISTIC:
					case DIAGNOSTICS:
					case DICTIONARY:
					case DISCONNECT:
					case DISPATCH:
					case DOMAIN:
					case DOUBLE:
					case DROP:
					case DYNAMIC:
					case DYNAMIC_FUNCTION:
					case DYNAMIC_FUNCTION_CODE:
					case EACH:
					case ELEMENT:
					case ENCODING:
					case ENCRYPTED:
					case END:
					case EQUALS:
					case ESCAPE:
					case EVERY:
					case EXCEPTION:
					case EXCLUDE:
					case EXCLUDING:
					case EXCLUSIVE:
					case EXEC:
					case EXECUTE:
					case EXISTS:
					case EXP:
					case EXPLAIN:
					case EXTERNAL:
					case EXTRACT:
					case FALSE:
					case FILTER:
					case FINAL:
					case FIRST:
					case FLOAT:
					case FLOOR:
					case FOLLOWING:
					case FORCE:
					case FORTRAN:
					case FORWARD:
					case FOUND:
					case FREE:
					case FUNCTION:
					case FUSION:
					case G_:
					case GENERAL:
					case GENERATED:
					case GET:
					case GLOBAL:
					case GO:
					case GOTO:
					case GRANTED:
					case GROUPING:
					case HANDLER:
					case HIERARCHY:
					case HOLD:
					case HOUR:
					case IDENTITY:
					case IGNORE:
					case IMMEDIATE:
					case IMMUTABLE:
					case IMPLEMENTATION:
					case IMPLICIT:
					case INCLUDING:
					case INCREMENT:
					case INDEX:
					case INDICATOR:
					case INHERITS:
					case INOUT:
					case INPUT:
					case INSENSITIVE:
					case INSERT:
					case INSTANCE:
					case INSTANTIABLE:
					case INSTEAD:
					case INT:
					case INTEGER:
					case INTERSECTION:
					case INTERVAL:
					case INVOKER:
					case ISOLATION:
					case KEY:
					case KEY_MEMBER:
					case KEY_TYPE:
					case LANGUAGE:
					case LARGE:
					case LAST:
					case LEFT:
					case LENGTH:
					case LEVEL:
					case LISTEN:
					case LN:
					case LOAD:
					case LOCAL:
					case LOCATION:
					case LOCATOR:
					case LOCK:
					case LOCKED:
					case LOWER:
					case M_:
					case MAP:
					case MATCH:
					case MATCHED:
					case MAX:
					case MAXVALUE:
					case MEMBER:
					case MERGE:
					case MESSAGE_LENGTH:
					case MESSAGE_OCTET_LENGTH:
					case MESSAGE_TEXT:
					case METHOD:
					case MIN:
					case MINUTE:
					case MINVALUE:
					case MOD:
					case MODE:
					case MODIFIES:
					case MODULE:
					case MONTH:
					case MORE_:
					case MOVE:
					case MULTISET:
					case MUMPS:
					case NAME:
					case NAMES:
					case NATIONAL:
					case NCHAR:
					case NCLOB:
					case NESTING:
					case NEW:
					case NEXT:
					case NO:
					case NONE:
					case NORMALIZE:
					case NORMALIZED:
					case NOT:
					case NOTHING:
					case NOTIFY:
					case NOWAIT:
					case NULL:
					case NULLABLE:
					case NULLIF:
					case NULLS:
					case NUMBER:
					case NUMERIC:
					case OBJECT:
					case OCTETS:
					case OCTET_LENGTH:
					case OF:
					case OFF:
					case OIDS:
					case OLD:
					case OPEN:
					case OPERATOR:
					case OPTION:
					case OPTIONS:
					case ORDERING:
					case ORDINALITY:
					case OTHERS:
					case OUT:
					case OUTPUT:
					case OVER:
					case OVERLAY:
					case OVERRIDING:
					case OWNER:
					case PAD:
					case PARAMETER:
					case PARAMETER_MODE:
					case PARAMETER_NAME:
					case PARAMETER_ORDINAL_POSITION:
					case PARAMETER_SPECIFIC_CATALOG:
					case PARAMETER_SPECIFIC_NAME:
					case PARAMETER_SPECIFIC_SCHEMA:
					case PARTIAL:
					case PARTITION:
					case PASCAL:
					case PASSWORD:
					case PATH:
					case PERCENTILE_CONT:
					case PERCENTILE_DISC:
					case PERCENT_RANK:
					case PLI:
					case POSITION:
					case POWER:
					case PRECEDING:
					case PRECISION:
					case PREPARE:
					case PRESERVE:
					case PRIOR:
					case PRIVILEGES:
					case PROCEDURAL:
					case PROCEDURE:
					case PUBLIC:
					case QUOTE:
					case RANGE:
					case RANK:
					case READ:
					case READS:
					case REAL:
					case RECHECK:
					case RECURSIVE:
					case REF:
					case REFERENCING:
					case REGR_AVGX:
					case REGR_AVGY:
					case REGR_COUNT:
					case REGR_INTERCEPT:
					case REGR_SLOPE:
					case REGR_SXX:
					case REGR_SXY:
					case REGR_SYY:
					case REINDEX:
					case RELATIVE:
					case RELEASE:
					case RENAME:
					case REPEATABLE:
					case REPLACE:
					case RESET:
					case RESTART:
					case RESTRICT:
					case RESULT:
					case RETURN:
					case RETURNED_CARDINALITY:
					case RETURNED_LENGTH:
					case RETURNED_OCTET_LENGTH:
					case RETURNED_SQLSTATE:
					case RETURNS:
					case REVOKE:
					case RIGHT:
					case ROLE:
					case ROLLBACK:
					case ROLLUP:
					case ROUTINE:
					case ROUTINE_CATALOG:
					case ROUTINE_NAME:
					case ROUTINE_SCHEMA:
					case ROW:
					case ROWS:
					case ROW_COUNT:
					case ROW_NUMBER:
					case RULE:
					case SAVEPOINT:
					case SCALE:
					case SCHEMA:
					case SCHEMA_NAME:
					case SCOPE:
					case SCOPE_CATALOG:
					case SCOPE_NAME:
					case SCOPE_SCHEMA:
					case SCROLL:
					case SEARCH:
					case SECOND:
					case SECTION:
					case SECURITY:
					case SELF:
					case SENSITIVE:
					case SEQUENCE:
					case SERIALIZABLE:
					case SERVER_NAME:
					case SESSION:
					case SET:
					case SETOF:
					case SETS:
					case SHARE:
					case SHOW:
					case SIMPLE:
					case SIZE:
					case SMALLINT:
					case SOURCE:
					case SPACE:
					case SPECIFIC:
					case SPECIFICTYPE:
					case SPECIFIC_NAME:
					case SQL:
					case SQLCODE:
					case SQLERROR:
					case SQLEXCEPTION:
					case SQLSTATE:
					case SQLWARNING:
					case SQRT:
					case STABLE:
					case START:
					case STATE:
					case STATEMENT:
					case STATIC:
					case STATISTICS:
					case STDDEV_POP:
					case STDDEV_SAMP:
					case STDIN:
					case STDOUT:
					case STORAGE:
					case STRICT:
					case STRUCTURE:
					case STYLE:
					case SUBCLASS_ORIGIN:
					case SUBMULTISET:
					case SUBSTRING:
					case SUM:
					case SYSID:
					case SYSTEM:
					case SYSTEM_USER:
					case TABLESPACE:
					case TABLE_NAME:
					case TEMP:
					case TEMPLATE:
					case TEMPORARY:
					case TIES:
					case TIME:
					case TIME_TZ:
					case TIMESTAMP:
					case TIMESTAMP_TZ:
					case TIMEZONE_HOUR:
					case TIMEZONE_MINUTE:
					case TOP_LEVEL_COUNT:
					case TRANSACTION:
					case TRANSACTIONS_COMMITTED:
					case TRANSACTIONS_ROLLED_BACK:
					case TRANSACTION_ACTIVE:
					case TRANSFORM:
					case TRANSFORMS:
					case TRANSLATE:
					case TRANSLATION:
					case TREAT:
					case TRIGGER:
					case TRIGGER_CATALOG:
					case TRIGGER_NAME:
					case TRIGGER_SCHEMA:
					case TRIM:
					case TRUE:
					case TRUNCATE:
					case TRUSTED:
					case TYPE:
					case UESCAPE:
					case UNBOUNDED:
					case UNCOMMITTED:
					case UNDER:
					case UNENCRYPTED:
					case UNKNOWN:
					case UNLISTEN:
					case UNNAMED:
					case UNNEST:
					case UNTIL:
					case UPDATE:
					case UPPER:
					case USAGE:
					case USER_DEFINED_TYPE_CATALOG:
					case USER_DEFINED_TYPE_CODE:
					case USER_DEFINED_TYPE_NAME:
					case USER_DEFINED_TYPE_SCHEMA:
					case VACUUM:
					case VALID:
					case VALIDATOR:
					case VALUE:
					case VALUES:
					case VARCHAR:
					case VARYING:
					case VAR_POP:
					case VAR_SAMP:
					case VIEW:
					case VOLATILE:
					case WHENEVER:
					case WIDTH_BUCKET:
					case WITHIN:
					case WITHOUT:
					case WORK:
					case WRITE:
					case YEAR:
					case ZONE:
					case ABSTIME:
					case BOOL:
					case BOX:
					case FLOAT4:
					case FLOAT8:
					case INT2:
					case INT4:
					case INT8:
					case JSON:
					case JSONB:
					case LINE:
					case POINT:
					case RELTIME:
					case TEXT:
					case DOLLAR:
					case DOLLAR_DOLLAR:
					case OPEN_PAREN:
					case BIT_STRING:
					case REGEX_STRING:
					case NUMERIC_LITERAL:
					case INTEGER_LITERAL:
					case HEX_INTEGER_LITERAL:
					case SINGLEQ_STRING_LITERAL:
					case DOUBLEQ_STRING_LITERAL:
					case IDENTIFIER:
					case AT_SIGN:
					case BANG_BANG:
					case MINUS:
					case PLUS:
					case QMARK_HYPHEN:
					case TIL:
						{
						setState(2069);
						expr(0);
						setState(2074);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHITESPACE) | (1L << A_) | (1L << ABORT) | (1L << ABS) | (1L << ABSOLUTE) | (1L << ACCESS) | (1L << ACTION) | (1L << ADA) | (1L << ADD) | (1L << ADMIN) | (1L << AFTER) | (1L << AGGREGATE) | (1L << ALLOCATE) | (1L << ALSO) | (1L << ALTER) | (1L << ALWAYS) | (1L << ARE) | (1L << AS) | (1L << ASENSITIVE) | (1L << ASSERTION) | (1L << ASSIGNMENT) | (1L << AT) | (1L << ATOMIC) | (1L << ATTRIBUTE) | (1L << ATTRIBUTES) | (1L << AVG) | (1L << BACKWARD) | (1L << BEFORE) | (1L << BEGIN) | (1L << BERNOULLI) | (1L << BETWEEN) | (1L << BIGINT) | (1L << BIT) | (1L << BIT_LENGTH) | (1L << BLOB) | (1L << BOOLEAN) | (1L << BREADTH) | (1L << BY) | (1L << C_) | (1L << CACHE) | (1L << CALL) | (1L << CALLED) | (1L << CARDINALITY) | (1L << CASCADE) | (1L << CASCADED) | (1L << CATALOG))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CATALOG_NAME - 64)) | (1L << (CEIL - 64)) | (1L << (CEILING - 64)) | (1L << (CHAIN - 64)) | (1L << (CHAR - 64)) | (1L << (CHARACTER - 64)) | (1L << (CHARACTERISTICS - 64)) | (1L << (CHARACTERS - 64)) | (1L << (CHARACTER_LENGTH - 64)) | (1L << (CHARACTER_SET_CATALOG - 64)) | (1L << (CHARACTER_SET_NAME - 64)) | (1L << (CHARACTER_SET_SCHEMA - 64)) | (1L << (CHAR_LENGTH - 64)) | (1L << (CHECKPOINT - 64)) | (1L << (CLASS - 64)) | (1L << (CLASS_ORIGIN - 64)) | (1L << (CLOB - 64)) | (1L << (CLOSE - 64)) | (1L << (CLUSTER - 64)) | (1L << (COALESCE - 64)) | (1L << (COBOL - 64)) | (1L << (COLLATION_CATALOG - 64)) | (1L << (COLLATION_NAME - 64)) | (1L << (COLLATION_SCHEMA - 64)) | (1L << (COLLECT - 64)) | (1L << (COLUMN_NAME - 64)) | (1L << (COMMAND_FUNCTION - 64)) | (1L << (COMMAND_FUNCTION_CODE - 64)) | (1L << (COMMENT - 64)) | (1L << (COMMIT - 64)) | (1L << (COMMITTED - 64)) | (1L << (CONDITION - 64)) | (1L << (CONDITION_NUMBER - 64)) | (1L << (CONNECT - 64)) | (1L << (CONNECTION - 64)) | (1L << (CONNECTION_NAME - 64)) | (1L << (CONSTRAINTS - 64)) | (1L << (CONSTRAINT_CATALOG - 64)) | (1L << (CONSTRAINT_NAME - 64)) | (1L << (CONSTRAINT_SCHEMA - 64)) | (1L << (CONSTRUCTOR - 64)) | (1L << (CONTAINS - 64)) | (1L << (CONTINUE - 64)) | (1L << (CONVERSION - 64)) | (1L << (CONVERT - 64)) | (1L << (COPY - 64)) | (1L << (CORR - 64)) | (1L << (CORRESPONDING - 64)) | (1L << (COUNT - 64)) | (1L << (COVAR_POP - 64)) | (1L << (COVAR_SAMP - 64)) | (1L << (CSV - 64)) | (1L << (CUBE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (CUME_DIST - 128)) | (1L << (CURRENT - 128)) | (1L << (CURRENT_DEFAULT_TRANSFORM_GROUP - 128)) | (1L << (CURRENT_PATH - 128)) | (1L << (CURRENT_TRANSFORM_GROUP_FOR_TYPE - 128)) | (1L << (CURSOR - 128)) | (1L << (CURSOR_NAME - 128)) | (1L << (CYCLE - 128)) | (1L << (DATA - 128)) | (1L << (DATABASE - 128)) | (1L << (DATE - 128)) | (1L << (DATETIME_INTERVAL_CODE - 128)) | (1L << (DATETIME_INTERVAL_PRECISION - 128)) | (1L << (DAY - 128)) | (1L << (DEALLOCATE - 128)) | (1L << (DEC - 128)) | (1L << (DECIMAL - 128)) | (1L << (DECLARE - 128)) | (1L << (DEFAULTS - 128)) | (1L << (DEFERRED - 128)) | (1L << (DEFINED - 128)) | (1L << (DEFINER - 128)) | (1L << (DEGREE - 128)) | (1L << (DELETE - 128)) | (1L << (DELIMITER - 128)) | (1L << (DELIMITERS - 128)) | (1L << (DENSE_RANK - 128)) | (1L << (DEPTH - 128)) | (1L << (DEREF - 128)) | (1L << (DERIVED - 128)) | (1L << (DESCRIBE - 128)) | (1L << (DESCRIPTOR - 128)) | (1L << (DETERMINISTIC - 128)) | (1L << (DIAGNOSTICS - 128)) | (1L << (DICTIONARY - 128)) | (1L << (DISCONNECT - 128)) | (1L << (DISPATCH - 128)) | (1L << (DOMAIN - 128)) | (1L << (DOUBLE - 128)) | (1L << (DROP - 128)) | (1L << (DYNAMIC - 128)) | (1L << (DYNAMIC_FUNCTION - 128)) | (1L << (DYNAMIC_FUNCTION_CODE - 128)) | (1L << (EACH - 128)) | (1L << (ELEMENT - 128)) | (1L << (ENCODING - 128)) | (1L << (ENCRYPTED - 128)) | (1L << (END - 128)) | (1L << (EQUALS - 128)) | (1L << (ESCAPE - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (EVERY - 192)) | (1L << (EXCEPTION - 192)) | (1L << (EXCLUDE - 192)) | (1L << (EXCLUDING - 192)) | (1L << (EXCLUSIVE - 192)) | (1L << (EXEC - 192)) | (1L << (EXECUTE - 192)) | (1L << (EXISTS - 192)) | (1L << (EXP - 192)) | (1L << (EXPLAIN - 192)) | (1L << (EXTERNAL - 192)) | (1L << (EXTRACT - 192)) | (1L << (FILTER - 192)) | (1L << (FINAL - 192)) | (1L << (FIRST - 192)) | (1L << (FLOAT - 192)) | (1L << (FLOOR - 192)) | (1L << (FOLLOWING - 192)) | (1L << (FORCE - 192)) | (1L << (FORTRAN - 192)) | (1L << (FORWARD - 192)) | (1L << (FOUND - 192)) | (1L << (FREE - 192)) | (1L << (FUNCTION - 192)) | (1L << (FUSION - 192)) | (1L << (G_ - 192)) | (1L << (GENERAL - 192)) | (1L << (GENERATED - 192)) | (1L << (GET - 192)) | (1L << (GLOBAL - 192)) | (1L << (GO - 192)) | (1L << (GOTO - 192)) | (1L << (GRANTED - 192)) | (1L << (GROUPING - 192)) | (1L << (HANDLER - 192)) | (1L << (HIERARCHY - 192)) | (1L << (HOLD - 192)) | (1L << (HOUR - 192)) | (1L << (IDENTITY - 192)) | (1L << (IGNORE - 192)) | (1L << (IMMEDIATE - 192)) | (1L << (IMMUTABLE - 192)) | (1L << (IMPLEMENTATION - 192)) | (1L << (IMPLICIT - 192)) | (1L << (INCLUDING - 192)) | (1L << (INCREMENT - 192)) | (1L << (INDEX - 192)) | (1L << (INDICATOR - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (INHERITS - 256)) | (1L << (INOUT - 256)) | (1L << (INPUT - 256)) | (1L << (INSENSITIVE - 256)) | (1L << (INSERT - 256)) | (1L << (INSTANCE - 256)) | (1L << (INSTANTIABLE - 256)) | (1L << (INSTEAD - 256)) | (1L << (INT - 256)) | (1L << (INTEGER - 256)) | (1L << (INTERSECTION - 256)) | (1L << (INTERVAL - 256)) | (1L << (INVOKER - 256)) | (1L << (ISOLATION - 256)) | (1L << (KEY - 256)) | (1L << (KEY_MEMBER - 256)) | (1L << (KEY_TYPE - 256)) | (1L << (LANGUAGE - 256)) | (1L << (LARGE - 256)) | (1L << (LAST - 256)) | (1L << (LEFT - 256)) | (1L << (LENGTH - 256)) | (1L << (LEVEL - 256)) | (1L << (LISTEN - 256)) | (1L << (LN - 256)) | (1L << (LOAD - 256)) | (1L << (LOCAL - 256)) | (1L << (LOCATION - 256)) | (1L << (LOCATOR - 256)) | (1L << (LOCK - 256)) | (1L << (LOCKED - 256)) | (1L << (LOWER - 256)) | (1L << (M_ - 256)) | (1L << (MAP - 256)) | (1L << (MATCH - 256)) | (1L << (MATCHED - 256)) | (1L << (MAX - 256)) | (1L << (MAXVALUE - 256)) | (1L << (MEMBER - 256)) | (1L << (MERGE - 256)) | (1L << (MESSAGE_LENGTH - 256)) | (1L << (MESSAGE_OCTET_LENGTH - 256)) | (1L << (MESSAGE_TEXT - 256)) | (1L << (METHOD - 256)) | (1L << (MIN - 256)) | (1L << (MINUTE - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (MINVALUE - 320)) | (1L << (MOD - 320)) | (1L << (MODE - 320)) | (1L << (MODIFIES - 320)) | (1L << (MODULE - 320)) | (1L << (MONTH - 320)) | (1L << (MORE_ - 320)) | (1L << (MOVE - 320)) | (1L << (MULTISET - 320)) | (1L << (MUMPS - 320)) | (1L << (NAME - 320)) | (1L << (NAMES - 320)) | (1L << (NATIONAL - 320)) | (1L << (NCHAR - 320)) | (1L << (NCLOB - 320)) | (1L << (NESTING - 320)) | (1L << (NEW - 320)) | (1L << (NEXT - 320)) | (1L << (NO - 320)) | (1L << (NONE - 320)) | (1L << (NORMALIZE - 320)) | (1L << (NORMALIZED - 320)) | (1L << (NOTHING - 320)) | (1L << (NOTIFY - 320)) | (1L << (NOWAIT - 320)) | (1L << (NULLABLE - 320)) | (1L << (NULLIF - 320)) | (1L << (NULLS - 320)) | (1L << (NUMBER - 320)) | (1L << (NUMERIC - 320)) | (1L << (OBJECT - 320)) | (1L << (OCTETS - 320)) | (1L << (OCTET_LENGTH - 320)) | (1L << (OF - 320)) | (1L << (OFF - 320)) | (1L << (OIDS - 320)) | (1L << (OLD - 320)) | (1L << (OPEN - 320)) | (1L << (OPERATOR - 320)) | (1L << (OPTION - 320)) | (1L << (OPTIONS - 320)) | (1L << (ORDERING - 320)) | (1L << (ORDINALITY - 320)) | (1L << (OTHERS - 320)) | (1L << (OUT - 320)) | (1L << (OUTPUT - 320)) | (1L << (OVER - 320)) | (1L << (OVERLAY - 320)) | (1L << (OVERRIDING - 320)))) != 0) || ((((_la - 384)) & ~0x3f) == 0 && ((1L << (_la - 384)) & ((1L << (OWNER - 384)) | (1L << (PAD - 384)) | (1L << (PARAMETER - 384)) | (1L << (PARAMETER_MODE - 384)) | (1L << (PARAMETER_NAME - 384)) | (1L << (PARAMETER_ORDINAL_POSITION - 384)) | (1L << (PARAMETER_SPECIFIC_CATALOG - 384)) | (1L << (PARAMETER_SPECIFIC_NAME - 384)) | (1L << (PARAMETER_SPECIFIC_SCHEMA - 384)) | (1L << (PARTIAL - 384)) | (1L << (PARTITION - 384)) | (1L << (PASCAL - 384)) | (1L << (PASSWORD - 384)) | (1L << (PATH - 384)) | (1L << (PERCENTILE_CONT - 384)) | (1L << (PERCENTILE_DISC - 384)) | (1L << (PERCENT_RANK - 384)) | (1L << (PLI - 384)) | (1L << (POSITION - 384)) | (1L << (POWER - 384)) | (1L << (PRECEDING - 384)) | (1L << (PRECISION - 384)) | (1L << (PREPARE - 384)) | (1L << (PRESERVE - 384)) | (1L << (PRIOR - 384)) | (1L << (PRIVILEGES - 384)) | (1L << (PROCEDURAL - 384)) | (1L << (PROCEDURE - 384)) | (1L << (PUBLIC - 384)) | (1L << (QUOTE - 384)) | (1L << (RANGE - 384)) | (1L << (RANK - 384)) | (1L << (READ - 384)) | (1L << (READS - 384)) | (1L << (REAL - 384)) | (1L << (RECHECK - 384)) | (1L << (RECURSIVE - 384)) | (1L << (REF - 384)) | (1L << (REFERENCING - 384)) | (1L << (REGR_AVGX - 384)) | (1L << (REGR_AVGY - 384)) | (1L << (REGR_COUNT - 384)) | (1L << (REGR_INTERCEPT - 384)) | (1L << (REGR_SLOPE - 384)) | (1L << (REGR_SXX - 384)) | (1L << (REGR_SXY - 384)) | (1L << (REGR_SYY - 384)) | (1L << (REINDEX - 384)) | (1L << (RELATIVE - 384)) | (1L << (RELEASE - 384)) | (1L << (RENAME - 384)) | (1L << (REPEATABLE - 384)) | (1L << (REPLACE - 384)) | (1L << (RESET - 384)) | (1L << (RESTART - 384)) | (1L << (RESTRICT - 384)))) != 0) || ((((_la - 448)) & ~0x3f) == 0 && ((1L << (_la - 448)) & ((1L << (RESULT - 448)) | (1L << (RETURN - 448)) | (1L << (RETURNED_CARDINALITY - 448)) | (1L << (RETURNED_LENGTH - 448)) | (1L << (RETURNED_OCTET_LENGTH - 448)) | (1L << (RETURNED_SQLSTATE - 448)) | (1L << (RETURNS - 448)) | (1L << (REVOKE - 448)) | (1L << (RIGHT - 448)) | (1L << (ROLE - 448)) | (1L << (ROLLBACK - 448)) | (1L << (ROLLUP - 448)) | (1L << (ROUTINE - 448)) | (1L << (ROUTINE_CATALOG - 448)) | (1L << (ROUTINE_NAME - 448)) | (1L << (ROUTINE_SCHEMA - 448)) | (1L << (ROW - 448)) | (1L << (ROWS - 448)) | (1L << (ROW_COUNT - 448)) | (1L << (ROW_NUMBER - 448)) | (1L << (RULE - 448)) | (1L << (SAVEPOINT - 448)) | (1L << (SCALE - 448)) | (1L << (SCHEMA - 448)) | (1L << (SCHEMA_NAME - 448)) | (1L << (SCOPE - 448)) | (1L << (SCOPE_CATALOG - 448)) | (1L << (SCOPE_NAME - 448)) | (1L << (SCOPE_SCHEMA - 448)) | (1L << (SCROLL - 448)) | (1L << (SEARCH - 448)) | (1L << (SECOND - 448)) | (1L << (SECTION - 448)) | (1L << (SECURITY - 448)) | (1L << (SELF - 448)) | (1L << (SENSITIVE - 448)) | (1L << (SEQUENCE - 448)) | (1L << (SERIALIZABLE - 448)) | (1L << (SERVER_NAME - 448)) | (1L << (SESSION - 448)) | (1L << (SET - 448)) | (1L << (SETOF - 448)) | (1L << (SETS - 448)) | (1L << (SHARE - 448)) | (1L << (SHOW - 448)) | (1L << (SIMPLE - 448)) | (1L << (SIZE - 448)) | (1L << (SMALLINT - 448)) | (1L << (SOURCE - 448)) | (1L << (SPACE - 448)) | (1L << (SPECIFIC - 448)) | (1L << (SPECIFICTYPE - 448)) | (1L << (SPECIFIC_NAME - 448)) | (1L << (SQL - 448)) | (1L << (SQLCODE - 448)) | (1L << (SQLERROR - 448)) | (1L << (SQLEXCEPTION - 448)) | (1L << (SQLSTATE - 448)) | (1L << (SQLWARNING - 448)))) != 0) || ((((_la - 512)) & ~0x3f) == 0 && ((1L << (_la - 512)) & ((1L << (SQRT - 512)) | (1L << (STABLE - 512)) | (1L << (START - 512)) | (1L << (STATE - 512)) | (1L << (STATEMENT - 512)) | (1L << (STATIC - 512)) | (1L << (STATISTICS - 512)) | (1L << (STDDEV_POP - 512)) | (1L << (STDDEV_SAMP - 512)) | (1L << (STDIN - 512)) | (1L << (STDOUT - 512)) | (1L << (STORAGE - 512)) | (1L << (STRICT - 512)) | (1L << (STRUCTURE - 512)) | (1L << (STYLE - 512)) | (1L << (SUBCLASS_ORIGIN - 512)) | (1L << (SUBMULTISET - 512)) | (1L << (SUBSTRING - 512)) | (1L << (SUM - 512)) | (1L << (SYSID - 512)) | (1L << (SYSTEM - 512)) | (1L << (SYSTEM_USER - 512)) | (1L << (TABLESPACE - 512)) | (1L << (TABLE_NAME - 512)) | (1L << (TEMP - 512)) | (1L << (TEMPLATE - 512)) | (1L << (TEMPORARY - 512)) | (1L << (TIES - 512)) | (1L << (TIME - 512)) | (1L << (TIMESTAMP - 512)) | (1L << (TIMEZONE_HOUR - 512)) | (1L << (TIMEZONE_MINUTE - 512)) | (1L << (TOP_LEVEL_COUNT - 512)) | (1L << (TRANSACTION - 512)) | (1L << (TRANSACTIONS_COMMITTED - 512)) | (1L << (TRANSACTIONS_ROLLED_BACK - 512)) | (1L << (TRANSACTION_ACTIVE - 512)) | (1L << (TRANSFORM - 512)) | (1L << (TRANSFORMS - 512)) | (1L << (TRANSLATE - 512)) | (1L << (TRANSLATION - 512)) | (1L << (TREAT - 512)) | (1L << (TRIGGER - 512)) | (1L << (TRIGGER_CATALOG - 512)) | (1L << (TRIGGER_NAME - 512)) | (1L << (TRIGGER_SCHEMA - 512)) | (1L << (TRIM - 512)) | (1L << (TRUNCATE - 512)) | (1L << (TRUSTED - 512)) | (1L << (TYPE - 512)) | (1L << (UESCAPE - 512)))) != 0) || ((((_la - 576)) & ~0x3f) == 0 && ((1L << (_la - 576)) & ((1L << (UNBOUNDED - 576)) | (1L << (UNCOMMITTED - 576)) | (1L << (UNDER - 576)) | (1L << (UNENCRYPTED - 576)) | (1L << (UNKNOWN - 576)) | (1L << (UNLISTEN - 576)) | (1L << (UNNAMED - 576)) | (1L << (UNNEST - 576)) | (1L << (UNTIL - 576)) | (1L << (UPDATE - 576)) | (1L << (UPPER - 576)) | (1L << (USAGE - 576)) | (1L << (USER_DEFINED_TYPE_CATALOG - 576)) | (1L << (USER_DEFINED_TYPE_CODE - 576)) | (1L << (USER_DEFINED_TYPE_NAME - 576)) | (1L << (USER_DEFINED_TYPE_SCHEMA - 576)) | (1L << (VACUUM - 576)) | (1L << (VALID - 576)) | (1L << (VALIDATOR - 576)) | (1L << (VALUE - 576)) | (1L << (VALUES - 576)) | (1L << (VARCHAR - 576)) | (1L << (VARYING - 576)) | (1L << (VAR_POP - 576)) | (1L << (VAR_SAMP - 576)) | (1L << (VIEW - 576)) | (1L << (VOLATILE - 576)) | (1L << (WHENEVER - 576)) | (1L << (WIDTH_BUCKET - 576)) | (1L << (WITHIN - 576)) | (1L << (WITHOUT - 576)) | (1L << (WORK - 576)) | (1L << (WRITE - 576)) | (1L << (YEAR - 576)) | (1L << (ZONE - 576)))) != 0) || ((((_la - 716)) & ~0x3f) == 0 && ((1L << (_la - 716)) & ((1L << (SINGLEQ_STRING_LITERAL - 716)) | (1L << (DOUBLEQ_STRING_LITERAL - 716)) | (1L << (IDENTIFIER - 716)))) != 0)) {
							{
							setState(2071);
							_errHandler.sync(this);
							_la = _input.LA(1);
							if (_la==AS) {
								{
								setState(2070);
								match(AS);
								}
							}

							setState(2073);
							name();
							}
						}

						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(2082);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case EOF:
			case EXCEPT:
			case FETCH:
			case FOR:
			case FROM:
			case GROUP:
			case HAVING:
			case INTERSECT:
			case LIMIT:
			case OFFSET:
			case ORDER:
			case UNION:
			case WHERE:
			case WINDOW:
			case WITH:
			case CLOSE_PAREN:
				break;
			default:
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_clauseContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(PostgreSQLParser.FROM, 0); }
		public List<From_itemContext> from_item() {
			return getRuleContexts(From_itemContext.class);
		}
		public From_itemContext from_item(int i) {
			return getRuleContext(From_itemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PostgreSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PostgreSQLParser.COMMA, i);
		}
		public From_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterFrom_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitFrom_clause(this);
		}
	}

	public final From_clauseContext from_clause() throws RecognitionException {
		From_clauseContext _localctx = new From_clauseContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_from_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2085);
			match(FROM);
			setState(2086);
			from_item(0);
			setState(2091);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2087);
				match(COMMA);
				setState(2088);
				from_item(0);
				}
				}
				setState(2093);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Where_clauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(PostgreSQLParser.WHERE, 0); }
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public Where_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterWhere_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitWhere_clause(this);
		}
	}

	public final Where_clauseContext where_clause() throws RecognitionException {
		Where_clauseContext _localctx = new Where_clauseContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_where_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2094);
			match(WHERE);
			setState(2095);
			predicate(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Group_by_clauseContext extends ParserRuleContext {
		public TerminalNode GROUP() { return getToken(PostgreSQLParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(PostgreSQLParser.BY, 0); }
		public List<Grouping_elemContext> grouping_elem() {
			return getRuleContexts(Grouping_elemContext.class);
		}
		public Grouping_elemContext grouping_elem(int i) {
			return getRuleContext(Grouping_elemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PostgreSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PostgreSQLParser.COMMA, i);
		}
		public Group_by_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group_by_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterGroup_by_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitGroup_by_clause(this);
		}
	}

	public final Group_by_clauseContext group_by_clause() throws RecognitionException {
		Group_by_clauseContext _localctx = new Group_by_clauseContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_group_by_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2097);
			match(GROUP);
			setState(2098);
			match(BY);
			setState(2099);
			grouping_elem();
			setState(2104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2100);
				match(COMMA);
				setState(2101);
				grouping_elem();
				}
				}
				setState(2106);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Grouping_elemContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(PostgreSQLParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(PostgreSQLParser.CLOSE_PAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<Expr_listContext> expr_list() {
			return getRuleContexts(Expr_listContext.class);
		}
		public Expr_listContext expr_list(int i) {
			return getRuleContext(Expr_listContext.class,i);
		}
		public TerminalNode ROLLUP() { return getToken(PostgreSQLParser.ROLLUP, 0); }
		public TerminalNode CUBE() { return getToken(PostgreSQLParser.CUBE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(PostgreSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PostgreSQLParser.COMMA, i);
		}
		public TerminalNode GROUPING() { return getToken(PostgreSQLParser.GROUPING, 0); }
		public TerminalNode SETS() { return getToken(PostgreSQLParser.SETS, 0); }
		public Grouping_elem_listContext grouping_elem_list() {
			return getRuleContext(Grouping_elem_listContext.class,0);
		}
		public Grouping_elemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grouping_elem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterGrouping_elem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitGrouping_elem(this);
		}
	}

	public final Grouping_elemContext grouping_elem() throws RecognitionException {
		Grouping_elemContext _localctx = new Grouping_elemContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_grouping_elem);
		int _la;
		try {
			setState(2132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2107);
				match(OPEN_PAREN);
				setState(2108);
				match(CLOSE_PAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2109);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2110);
				expr_list();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2111);
				_la = _input.LA(1);
				if ( !(_la==CUBE || _la==ROLLUP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2112);
				match(OPEN_PAREN);
				setState(2115);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
				case 1:
					{
					setState(2113);
					expr(0);
					}
					break;
				case 2:
					{
					setState(2114);
					expr_list();
					}
					break;
				}
				setState(2124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2117);
					match(COMMA);
					setState(2120);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
					case 1:
						{
						setState(2118);
						expr(0);
						}
						break;
					case 2:
						{
						setState(2119);
						expr_list();
						}
						break;
					}
					}
					}
					setState(2126);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2127);
				match(CLOSE_PAREN);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2129);
				match(GROUPING);
				setState(2130);
				match(SETS);
				setState(2131);
				grouping_elem_list();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Grouping_elem_listContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(PostgreSQLParser.OPEN_PAREN, 0); }
		public List<Grouping_elemContext> grouping_elem() {
			return getRuleContexts(Grouping_elemContext.class);
		}
		public Grouping_elemContext grouping_elem(int i) {
			return getRuleContext(Grouping_elemContext.class,i);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(PostgreSQLParser.CLOSE_PAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(PostgreSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PostgreSQLParser.COMMA, i);
		}
		public Grouping_elem_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grouping_elem_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterGrouping_elem_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitGrouping_elem_list(this);
		}
	}

	public final Grouping_elem_listContext grouping_elem_list() throws RecognitionException {
		Grouping_elem_listContext _localctx = new Grouping_elem_listContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_grouping_elem_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2134);
			match(OPEN_PAREN);
			setState(2135);
			grouping_elem();
			setState(2140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2136);
				match(COMMA);
				setState(2137);
				grouping_elem();
				}
				}
				setState(2142);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2143);
			match(CLOSE_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Having_clauseContext extends ParserRuleContext {
		public TerminalNode HAVING() { return getToken(PostgreSQLParser.HAVING, 0); }
		public List<PredicateContext> predicate() {
			return getRuleContexts(PredicateContext.class);
		}
		public PredicateContext predicate(int i) {
			return getRuleContext(PredicateContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PostgreSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PostgreSQLParser.COMMA, i);
		}
		public Having_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_having_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterHaving_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitHaving_clause(this);
		}
	}

	public final Having_clauseContext having_clause() throws RecognitionException {
		Having_clauseContext _localctx = new Having_clauseContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_having_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2145);
			match(HAVING);
			setState(2146);
			predicate(0);
			setState(2151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2147);
				match(COMMA);
				setState(2148);
				predicate(0);
				}
				}
				setState(2153);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FrameContext extends ParserRuleContext {
		public TerminalNode UNBOUNDED() { return getToken(PostgreSQLParser.UNBOUNDED, 0); }
		public TerminalNode PRECEDING() { return getToken(PostgreSQLParser.PRECEDING, 0); }
		public TerminalNode INTEGER_LITERAL() { return getToken(PostgreSQLParser.INTEGER_LITERAL, 0); }
		public TerminalNode CURRENT() { return getToken(PostgreSQLParser.CURRENT, 0); }
		public TerminalNode ROW() { return getToken(PostgreSQLParser.ROW, 0); }
		public TerminalNode FOLLOWING() { return getToken(PostgreSQLParser.FOLLOWING, 0); }
		public FrameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frame; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterFrame(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitFrame(this);
		}
	}

	public final FrameContext frame() throws RecognitionException {
		FrameContext _localctx = new FrameContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_frame);
		try {
			setState(2164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2154);
				match(UNBOUNDED);
				setState(2155);
				match(PRECEDING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2156);
				match(INTEGER_LITERAL);
				setState(2157);
				match(PRECEDING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2158);
				match(CURRENT);
				setState(2159);
				match(ROW);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2160);
				match(INTEGER_LITERAL);
				setState(2161);
				match(FOLLOWING);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2162);
				match(UNBOUNDED);
				setState(2163);
				match(FOLLOWING);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Frame_startContext extends ParserRuleContext {
		public FrameContext frame() {
			return getRuleContext(FrameContext.class,0);
		}
		public Frame_startContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frame_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterFrame_start(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitFrame_start(this);
		}
	}

	public final Frame_startContext frame_start() throws RecognitionException {
		Frame_startContext _localctx = new Frame_startContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_frame_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2166);
			frame();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Frame_endContext extends ParserRuleContext {
		public FrameContext frame() {
			return getRuleContext(FrameContext.class,0);
		}
		public Frame_endContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frame_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterFrame_end(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitFrame_end(this);
		}
	}

	public final Frame_endContext frame_end() throws RecognitionException {
		Frame_endContext _localctx = new Frame_endContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_frame_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2168);
			frame();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Frame_clauseContext extends ParserRuleContext {
		public Frame_startContext frame_start() {
			return getRuleContext(Frame_startContext.class,0);
		}
		public TerminalNode RANGE() { return getToken(PostgreSQLParser.RANGE, 0); }
		public TerminalNode ROWS() { return getToken(PostgreSQLParser.ROWS, 0); }
		public TerminalNode BETWEEN() { return getToken(PostgreSQLParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(PostgreSQLParser.AND, 0); }
		public Frame_endContext frame_end() {
			return getRuleContext(Frame_endContext.class,0);
		}
		public Frame_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frame_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterFrame_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitFrame_clause(this);
		}
	}

	public final Frame_clauseContext frame_clause() throws RecognitionException {
		Frame_clauseContext _localctx = new Frame_clauseContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_frame_clause);
		int _la;
		try {
			setState(2178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2170);
				_la = _input.LA(1);
				if ( !(_la==RANGE || _la==ROWS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2171);
				frame_start();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2172);
				_la = _input.LA(1);
				if ( !(_la==RANGE || _la==ROWS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2173);
				match(BETWEEN);
				setState(2174);
				frame_start();
				setState(2175);
				match(AND);
				setState(2176);
				frame_end();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Window_definitionContext extends ParserRuleContext {
		public Window_nameContext window_name() {
			return getRuleContext(Window_nameContext.class,0);
		}
		public TerminalNode PARTITION() { return getToken(PostgreSQLParser.PARTITION, 0); }
		public TerminalNode BY() { return getToken(PostgreSQLParser.BY, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PostgreSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PostgreSQLParser.COMMA, i);
		}
		public Order_by_clauseContext order_by_clause() {
			return getRuleContext(Order_by_clauseContext.class,0);
		}
		public Window_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_window_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterWindow_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitWindow_definition(this);
		}
	}

	public final Window_definitionContext window_definition() throws RecognitionException {
		Window_definitionContext _localctx = new Window_definitionContext(_ctx, getState());
		enterRule(_localctx, 382, RULE_window_definition);
		int _la;
		try {
			setState(2192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2180);
				window_name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2181);
				match(PARTITION);
				setState(2182);
				match(BY);
				setState(2183);
				expr(0);
				setState(2188);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2184);
					match(COMMA);
					setState(2185);
					expr(0);
					}
					}
					setState(2190);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2191);
				order_by_clause();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Window_clauseContext extends ParserRuleContext {
		public TerminalNode WINDOW() { return getToken(PostgreSQLParser.WINDOW, 0); }
		public Window_nameContext window_name() {
			return getRuleContext(Window_nameContext.class,0);
		}
		public TerminalNode AS() { return getToken(PostgreSQLParser.AS, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(PostgreSQLParser.OPEN_PAREN, 0); }
		public Window_definitionContext window_definition() {
			return getRuleContext(Window_definitionContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(PostgreSQLParser.CLOSE_PAREN, 0); }
		public Window_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_window_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterWindow_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitWindow_clause(this);
		}
	}

	public final Window_clauseContext window_clause() throws RecognitionException {
		Window_clauseContext _localctx = new Window_clauseContext(_ctx, getState());
		enterRule(_localctx, 384, RULE_window_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2194);
			match(WINDOW);
			setState(2195);
			window_name();
			setState(2196);
			match(AS);
			setState(2197);
			match(OPEN_PAREN);
			setState(2198);
			window_definition();
			setState(2199);
			match(CLOSE_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Combine_clauseContext extends ParserRuleContext {
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode UNION() { return getToken(PostgreSQLParser.UNION, 0); }
		public TerminalNode INTERSECT() { return getToken(PostgreSQLParser.INTERSECT, 0); }
		public TerminalNode EXCEPT() { return getToken(PostgreSQLParser.EXCEPT, 0); }
		public TerminalNode ALL() { return getToken(PostgreSQLParser.ALL, 0); }
		public TerminalNode DISTINCT() { return getToken(PostgreSQLParser.DISTINCT, 0); }
		public Combine_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_combine_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterCombine_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitCombine_clause(this);
		}
	}

	public final Combine_clauseContext combine_clause() throws RecognitionException {
		Combine_clauseContext _localctx = new Combine_clauseContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_combine_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2201);
			_la = _input.LA(1);
			if ( !(_la==EXCEPT || _la==INTERSECT || _la==UNION) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALL || _la==DISTINCT) {
				{
				setState(2202);
				_la = _input.LA(1);
				if ( !(_la==ALL || _la==DISTINCT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(2205);
			select_stmt();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Order_by_clauseContext extends ParserRuleContext {
		public TerminalNode ORDER() { return getToken(PostgreSQLParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(PostgreSQLParser.BY, 0); }
		public List<Order_by_itemContext> order_by_item() {
			return getRuleContexts(Order_by_itemContext.class);
		}
		public Order_by_itemContext order_by_item(int i) {
			return getRuleContext(Order_by_itemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PostgreSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PostgreSQLParser.COMMA, i);
		}
		public Order_by_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order_by_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterOrder_by_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitOrder_by_clause(this);
		}
	}

	public final Order_by_clauseContext order_by_clause() throws RecognitionException {
		Order_by_clauseContext _localctx = new Order_by_clauseContext(_ctx, getState());
		enterRule(_localctx, 388, RULE_order_by_clause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2207);
			match(ORDER);
			setState(2208);
			match(BY);
			setState(2209);
			order_by_item();
			setState(2214);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,202,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2210);
					match(COMMA);
					setState(2211);
					order_by_item();
					}
					} 
				}
				setState(2216);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,202,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Order_by_itemContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode DOUBLEQ_STRING_LITERAL() { return getToken(PostgreSQLParser.DOUBLEQ_STRING_LITERAL, 0); }
		public TerminalNode ASC() { return getToken(PostgreSQLParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(PostgreSQLParser.DESC, 0); }
		public TerminalNode USING() { return getToken(PostgreSQLParser.USING, 0); }
		public List<TerminalNode> NULLS() { return getTokens(PostgreSQLParser.NULLS); }
		public TerminalNode NULLS(int i) {
			return getToken(PostgreSQLParser.NULLS, i);
		}
		public List<TerminalNode> FIRST() { return getTokens(PostgreSQLParser.FIRST); }
		public TerminalNode FIRST(int i) {
			return getToken(PostgreSQLParser.FIRST, i);
		}
		public List<TerminalNode> LAST() { return getTokens(PostgreSQLParser.LAST); }
		public TerminalNode LAST(int i) {
			return getToken(PostgreSQLParser.LAST, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PostgreSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PostgreSQLParser.COMMA, i);
		}
		public Order_by_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order_by_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterOrder_by_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitOrder_by_item(this);
		}
	}

	public final Order_by_itemContext order_by_item() throws RecognitionException {
		Order_by_itemContext _localctx = new Order_by_itemContext(_ctx, getState());
		enterRule(_localctx, 390, RULE_order_by_item);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
			case 1:
				{
				setState(2217);
				expr(0);
				}
				break;
			case 2:
				{
				setState(2218);
				match(DOUBLEQ_STRING_LITERAL);
				}
				break;
			}
			setState(2225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
			case 1:
				{
				setState(2221);
				match(ASC);
				}
				break;
			case 2:
				{
				setState(2222);
				match(DESC);
				}
				break;
			case 3:
				{
				setState(2223);
				match(USING);
				setState(2224);
				expr(0);
				}
				break;
			}
			setState(2238);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
			case 1:
				{
				{
				setState(2227);
				match(NULLS);
				setState(2228);
				_la = _input.LA(1);
				if ( !(_la==FIRST || _la==LAST) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				setState(2235);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,205,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2230);
						match(COMMA);
						{
						setState(2231);
						match(NULLS);
						setState(2232);
						_la = _input.LA(1);
						if ( !(_la==FIRST || _la==LAST) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						} 
					}
					setState(2237);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,205,_ctx);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Limit_clauseContext extends ParserRuleContext {
		public TerminalNode LIMIT() { return getToken(PostgreSQLParser.LIMIT, 0); }
		public TerminalNode INTEGER_LITERAL() { return getToken(PostgreSQLParser.INTEGER_LITERAL, 0); }
		public TerminalNode ALL() { return getToken(PostgreSQLParser.ALL, 0); }
		public Limit_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limit_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterLimit_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitLimit_clause(this);
		}
	}

	public final Limit_clauseContext limit_clause() throws RecognitionException {
		Limit_clauseContext _localctx = new Limit_clauseContext(_ctx, getState());
		enterRule(_localctx, 392, RULE_limit_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2240);
			match(LIMIT);
			setState(2241);
			_la = _input.LA(1);
			if ( !(_la==ALL || _la==INTEGER_LITERAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Offset_clauseContext extends ParserRuleContext {
		public TerminalNode OFFSET() { return getToken(PostgreSQLParser.OFFSET, 0); }
		public TerminalNode INTEGER_LITERAL() { return getToken(PostgreSQLParser.INTEGER_LITERAL, 0); }
		public TerminalNode ROW() { return getToken(PostgreSQLParser.ROW, 0); }
		public TerminalNode ROWS() { return getToken(PostgreSQLParser.ROWS, 0); }
		public Offset_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_offset_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterOffset_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitOffset_clause(this);
		}
	}

	public final Offset_clauseContext offset_clause() throws RecognitionException {
		Offset_clauseContext _localctx = new Offset_clauseContext(_ctx, getState());
		enterRule(_localctx, 394, RULE_offset_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2243);
			match(OFFSET);
			setState(2244);
			match(INTEGER_LITERAL);
			setState(2246);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
			case 1:
				{
				setState(2245);
				_la = _input.LA(1);
				if ( !(_la==ROW || _la==ROWS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fetch_clauseContext extends ParserRuleContext {
		public TerminalNode FETCH() { return getToken(PostgreSQLParser.FETCH, 0); }
		public TerminalNode ONLY() { return getToken(PostgreSQLParser.ONLY, 0); }
		public TerminalNode FIRST() { return getToken(PostgreSQLParser.FIRST, 0); }
		public TerminalNode NEXT() { return getToken(PostgreSQLParser.NEXT, 0); }
		public TerminalNode ROW() { return getToken(PostgreSQLParser.ROW, 0); }
		public TerminalNode ROWS() { return getToken(PostgreSQLParser.ROWS, 0); }
		public TerminalNode INTEGER_LITERAL() { return getToken(PostgreSQLParser.INTEGER_LITERAL, 0); }
		public Fetch_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fetch_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterFetch_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitFetch_clause(this);
		}
	}

	public final Fetch_clauseContext fetch_clause() throws RecognitionException {
		Fetch_clauseContext _localctx = new Fetch_clauseContext(_ctx, getState());
		enterRule(_localctx, 396, RULE_fetch_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2248);
			match(FETCH);
			setState(2249);
			_la = _input.LA(1);
			if ( !(_la==FIRST || _la==NEXT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INTEGER_LITERAL) {
				{
				setState(2250);
				match(INTEGER_LITERAL);
				}
			}

			setState(2253);
			_la = _input.LA(1);
			if ( !(_la==ROW || _la==ROWS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(2254);
			match(ONLY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_clauseContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(PostgreSQLParser.FOR, 0); }
		public TerminalNode UPDATE() { return getToken(PostgreSQLParser.UPDATE, 0); }
		public TerminalNode NO() { return getToken(PostgreSQLParser.NO, 0); }
		public TerminalNode KEY() { return getToken(PostgreSQLParser.KEY, 0); }
		public TerminalNode SHARE() { return getToken(PostgreSQLParser.SHARE, 0); }
		public TerminalNode OF() { return getToken(PostgreSQLParser.OF, 0); }
		public List<Table_nameContext> table_name() {
			return getRuleContexts(Table_nameContext.class);
		}
		public Table_nameContext table_name(int i) {
			return getRuleContext(Table_nameContext.class,i);
		}
		public List<TerminalNode> NOWAIT() { return getTokens(PostgreSQLParser.NOWAIT); }
		public TerminalNode NOWAIT(int i) {
			return getToken(PostgreSQLParser.NOWAIT, i);
		}
		public List<TerminalNode> SKIP_() { return getTokens(PostgreSQLParser.SKIP_); }
		public TerminalNode SKIP_(int i) {
			return getToken(PostgreSQLParser.SKIP_, i);
		}
		public List<TerminalNode> LOCKED() { return getTokens(PostgreSQLParser.LOCKED); }
		public TerminalNode LOCKED(int i) {
			return getToken(PostgreSQLParser.LOCKED, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PostgreSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PostgreSQLParser.COMMA, i);
		}
		public For_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterFor_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitFor_clause(this);
		}
	}

	public final For_clauseContext for_clause() throws RecognitionException {
		For_clauseContext _localctx = new For_clauseContext(_ctx, getState());
		enterRule(_localctx, 398, RULE_for_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2256);
			match(FOR);
			setState(2264);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UPDATE:
				{
				setState(2257);
				match(UPDATE);
				}
				break;
			case NO:
				{
				setState(2258);
				match(NO);
				setState(2259);
				match(KEY);
				setState(2260);
				match(UPDATE);
				}
				break;
			case SHARE:
				{
				setState(2261);
				match(SHARE);
				}
				break;
			case KEY:
				{
				setState(2262);
				match(KEY);
				setState(2263);
				match(SHARE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OF) {
				{
				setState(2266);
				match(OF);
				setState(2267);
				table_name();
				setState(2272);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2268);
					match(COMMA);
					setState(2269);
					table_name();
					}
					}
					setState(2274);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(2282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NOWAIT || _la==SKIP_) {
				{
				setState(2280);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NOWAIT:
					{
					setState(2277);
					match(NOWAIT);
					}
					break;
				case SKIP_:
					{
					setState(2278);
					match(SKIP_);
					setState(2279);
					match(LOCKED);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(2284);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public Token op;
		public TerminalNode NULL() { return getToken(PostgreSQLParser.NULL, 0); }
		public TerminalNode CURRENT_DATE() { return getToken(PostgreSQLParser.CURRENT_DATE, 0); }
		public TerminalNode CURRENT_ROLE() { return getToken(PostgreSQLParser.CURRENT_ROLE, 0); }
		public TerminalNode CURRENT_TIME() { return getToken(PostgreSQLParser.CURRENT_TIME, 0); }
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(PostgreSQLParser.CURRENT_TIMESTAMP, 0); }
		public TerminalNode CURRENT_USER() { return getToken(PostgreSQLParser.CURRENT_USER, 0); }
		public TerminalNode INTEGER_LITERAL() { return getToken(PostgreSQLParser.INTEGER_LITERAL, 0); }
		public TerminalNode HEX_INTEGER_LITERAL() { return getToken(PostgreSQLParser.HEX_INTEGER_LITERAL, 0); }
		public TerminalNode NUMERIC_LITERAL() { return getToken(PostgreSQLParser.NUMERIC_LITERAL, 0); }
		public TerminalNode SINGLEQ_STRING_LITERAL() { return getToken(PostgreSQLParser.SINGLEQ_STRING_LITERAL, 0); }
		public TerminalNode DOUBLEQ_STRING_LITERAL() { return getToken(PostgreSQLParser.DOUBLEQ_STRING_LITERAL, 0); }
		public TerminalNode BIT_STRING() { return getToken(PostgreSQLParser.BIT_STRING, 0); }
		public TerminalNode REGEX_STRING() { return getToken(PostgreSQLParser.REGEX_STRING, 0); }
		public List<TerminalNode> DOLLAR_DOLLAR() { return getTokens(PostgreSQLParser.DOLLAR_DOLLAR); }
		public TerminalNode DOLLAR_DOLLAR(int i) {
			return getToken(PostgreSQLParser.DOLLAR_DOLLAR, i);
		}
		public List<TerminalNode> DOLLAR() { return getTokens(PostgreSQLParser.DOLLAR); }
		public TerminalNode DOLLAR(int i) {
			return getToken(PostgreSQLParser.DOLLAR, i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public Values_stmtContext values_stmt() {
			return getRuleContext(Values_stmtContext.class,0);
		}
		public Expr_listContext expr_list() {
			return getRuleContext(Expr_listContext.class,0);
		}
		public TerminalNode OPEN_PAREN() { return getToken(PostgreSQLParser.OPEN_PAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(PostgreSQLParser.CLOSE_PAREN, 0); }
		public Type_literalContext type_literal() {
			return getRuleContext(Type_literalContext.class,0);
		}
		public TerminalNode BANG_BANG() { return getToken(PostgreSQLParser.BANG_BANG, 0); }
		public TerminalNode AT_SIGN() { return getToken(PostgreSQLParser.AT_SIGN, 0); }
		public TerminalNode PLUS() { return getToken(PostgreSQLParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(PostgreSQLParser.MINUS, 0); }
		public TerminalNode TIL() { return getToken(PostgreSQLParser.TIL, 0); }
		public TerminalNode QMARK_HYPHEN() { return getToken(PostgreSQLParser.QMARK_HYPHEN, 0); }
		public TerminalNode NOT() { return getToken(PostgreSQLParser.NOT, 0); }
		public TerminalNode ALL() { return getToken(PostgreSQLParser.ALL, 0); }
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public TerminalNode CAST() { return getToken(PostgreSQLParser.CAST, 0); }
		public TerminalNode AS() { return getToken(PostgreSQLParser.AS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Correlation_nameContext correlation_name() {
			return getRuleContext(Correlation_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(PostgreSQLParser.DOT, 0); }
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public TerminalNode CASE() { return getToken(PostgreSQLParser.CASE, 0); }
		public TerminalNode WHEN() { return getToken(PostgreSQLParser.WHEN, 0); }
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public TerminalNode THEN() { return getToken(PostgreSQLParser.THEN, 0); }
		public TerminalNode END() { return getToken(PostgreSQLParser.END, 0); }
		public TerminalNode ELSE() { return getToken(PostgreSQLParser.ELSE, 0); }
		public AggregateContext aggregate() {
			return getRuleContext(AggregateContext.class,0);
		}
		public Array_cons_exprContext array_cons_expr() {
			return getRuleContext(Array_cons_exprContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode CARET() { return getToken(PostgreSQLParser.CARET, 0); }
		public TerminalNode PIPE_SLASH() { return getToken(PostgreSQLParser.PIPE_SLASH, 0); }
		public TerminalNode PIPE_PIPE_SLASH() { return getToken(PostgreSQLParser.PIPE_PIPE_SLASH, 0); }
		public TerminalNode STAR() { return getToken(PostgreSQLParser.STAR, 0); }
		public TerminalNode SLASH() { return getToken(PostgreSQLParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(PostgreSQLParser.PERCENT, 0); }
		public TerminalNode AMP() { return getToken(PostgreSQLParser.AMP, 0); }
		public TerminalNode PIPE() { return getToken(PostgreSQLParser.PIPE, 0); }
		public TerminalNode HASH() { return getToken(PostgreSQLParser.HASH, 0); }
		public TerminalNode LT_LT() { return getToken(PostgreSQLParser.LT_LT, 0); }
		public TerminalNode LT_LT_EQ() { return getToken(PostgreSQLParser.LT_LT_EQ, 0); }
		public TerminalNode GT_GT() { return getToken(PostgreSQLParser.GT_GT, 0); }
		public TerminalNode AT_AT() { return getToken(PostgreSQLParser.AT_AT, 0); }
		public TerminalNode LT_HYPHEN_GT() { return getToken(PostgreSQLParser.LT_HYPHEN_GT, 0); }
		public TerminalNode AT_GT() { return getToken(PostgreSQLParser.AT_GT, 0); }
		public TerminalNode LT_AT() { return getToken(PostgreSQLParser.LT_AT, 0); }
		public TerminalNode TIL_EQ() { return getToken(PostgreSQLParser.TIL_EQ, 0); }
		public TerminalNode TIL_STAR() { return getToken(PostgreSQLParser.TIL_STAR, 0); }
		public TerminalNode TIL_TIL() { return getToken(PostgreSQLParser.TIL_TIL, 0); }
		public TerminalNode TIL_LT_TIL() { return getToken(PostgreSQLParser.TIL_LT_TIL, 0); }
		public TerminalNode TIL_GT_TIL() { return getToken(PostgreSQLParser.TIL_GT_TIL, 0); }
		public TerminalNode TIL_LTE_TIL() { return getToken(PostgreSQLParser.TIL_LTE_TIL, 0); }
		public TerminalNode TIL_GTE_TIL() { return getToken(PostgreSQLParser.TIL_GTE_TIL, 0); }
		public TerminalNode LT_QMARK_GT() { return getToken(PostgreSQLParser.LT_QMARK_GT, 0); }
		public TerminalNode HYPHEN_GT() { return getToken(PostgreSQLParser.HYPHEN_GT, 0); }
		public TerminalNode HYPHEN_GT_GT() { return getToken(PostgreSQLParser.HYPHEN_GT_GT, 0); }
		public TerminalNode HASH_HASH() { return getToken(PostgreSQLParser.HASH_HASH, 0); }
		public TerminalNode HASH_GT() { return getToken(PostgreSQLParser.HASH_GT, 0); }
		public TerminalNode HASH_GT_GT() { return getToken(PostgreSQLParser.HASH_GT_GT, 0); }
		public TerminalNode QMARK() { return getToken(PostgreSQLParser.QMARK, 0); }
		public TerminalNode QMARK_PIPE() { return getToken(PostgreSQLParser.QMARK_PIPE, 0); }
		public TerminalNode QMARK_AMP() { return getToken(PostgreSQLParser.QMARK_AMP, 0); }
		public TerminalNode QMARK_HASH() { return getToken(PostgreSQLParser.QMARK_HASH, 0); }
		public TerminalNode LT_CARET() { return getToken(PostgreSQLParser.LT_CARET, 0); }
		public TerminalNode AMP_LT() { return getToken(PostgreSQLParser.AMP_LT, 0); }
		public TerminalNode HYPHEN_PIPE_HYPHEN() { return getToken(PostgreSQLParser.HYPHEN_PIPE_HYPHEN, 0); }
		public TerminalNode HASH_EQ() { return getToken(PostgreSQLParser.HASH_EQ, 0); }
		public TerminalNode AMP_AMP() { return getToken(PostgreSQLParser.AMP_AMP, 0); }
		public TerminalNode PIPE_PIPE() { return getToken(PostgreSQLParser.PIPE_PIPE, 0); }
		public TerminalNode EQUAL_GT() { return getToken(PostgreSQLParser.EQUAL_GT, 0); }
		public TerminalNode AND() { return getToken(PostgreSQLParser.AND, 0); }
		public TerminalNode OR() { return getToken(PostgreSQLParser.OR, 0); }
		public TerminalNode LIKE() { return getToken(PostgreSQLParser.LIKE, 0); }
		public TerminalNode BETWEEN() { return getToken(PostgreSQLParser.BETWEEN, 0); }
		public TerminalNode IN() { return getToken(PostgreSQLParser.IN, 0); }
		public TerminalNode LT() { return getToken(PostgreSQLParser.LT, 0); }
		public TerminalNode GT() { return getToken(PostgreSQLParser.GT, 0); }
		public TerminalNode EQUAL() { return getToken(PostgreSQLParser.EQUAL, 0); }
		public TerminalNode LTE() { return getToken(PostgreSQLParser.LTE, 0); }
		public TerminalNode GTE() { return getToken(PostgreSQLParser.GTE, 0); }
		public TerminalNode LT_GT() { return getToken(PostgreSQLParser.LT_GT, 0); }
		public TerminalNode BANG_EQUAL() { return getToken(PostgreSQLParser.BANG_EQUAL, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(PostgreSQLParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(PostgreSQLParser.CLOSE_BRACKET, 0); }
		public TerminalNode BANG() { return getToken(PostgreSQLParser.BANG, 0); }
		public TerminalNode IS() { return getToken(PostgreSQLParser.IS, 0); }
		public TerminalNode ISNULL() { return getToken(PostgreSQLParser.ISNULL, 0); }
		public TerminalNode NOTNULL() { return getToken(PostgreSQLParser.NOTNULL, 0); }
		public TerminalNode COLON() { return getToken(PostgreSQLParser.COLON, 0); }
		public TerminalNode COLON_COLON() { return getToken(PostgreSQLParser.COLON_COLON, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 400;
		enterRecursionRule(_localctx, 400, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2363);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
			case 1:
				{
				setState(2286);
				match(NULL);
				}
				break;
			case 2:
				{
				setState(2287);
				match(CURRENT_DATE);
				}
				break;
			case 3:
				{
				setState(2288);
				match(CURRENT_ROLE);
				}
				break;
			case 4:
				{
				setState(2289);
				match(CURRENT_TIME);
				}
				break;
			case 5:
				{
				setState(2290);
				match(CURRENT_TIMESTAMP);
				}
				break;
			case 6:
				{
				setState(2291);
				match(CURRENT_USER);
				}
				break;
			case 7:
				{
				setState(2292);
				match(INTEGER_LITERAL);
				}
				break;
			case 8:
				{
				setState(2293);
				match(HEX_INTEGER_LITERAL);
				}
				break;
			case 9:
				{
				setState(2294);
				match(NUMERIC_LITERAL);
				}
				break;
			case 10:
				{
				setState(2295);
				match(SINGLEQ_STRING_LITERAL);
				}
				break;
			case 11:
				{
				setState(2296);
				match(DOUBLEQ_STRING_LITERAL);
				}
				break;
			case 12:
				{
				setState(2297);
				match(BIT_STRING);
				}
				break;
			case 13:
				{
				setState(2298);
				match(REGEX_STRING);
				}
				break;
			case 14:
				{
				setState(2299);
				match(DOLLAR_DOLLAR);
				setState(2301); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2300);
						_la = _input.LA(1);
						if ( _la <= 0 || (_la==DOLLAR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2303); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,214,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(2305);
				match(DOLLAR_DOLLAR);
				}
				break;
			case 15:
				{
				setState(2306);
				match(DOLLAR);
				setState(2307);
				identifier(0);
				setState(2309); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2308);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==DOLLAR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(2311); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHITESPACE) | (1L << BLOCK_COMMENT) | (1L << LINE_COMMENT) | (1L << A_) | (1L << ABORT) | (1L << ABS) | (1L << ABSOLUTE) | (1L << ACCESS) | (1L << ACTION) | (1L << ADA) | (1L << ADD) | (1L << ADMIN) | (1L << AFTER) | (1L << AGGREGATE) | (1L << ALIAS) | (1L << ALL) | (1L << ALLOCATE) | (1L << ALSO) | (1L << ALTER) | (1L << ALWAYS) | (1L << ANALYSE) | (1L << ANALYZE) | (1L << AND) | (1L << ANY) | (1L << ARE) | (1L << ARRAY) | (1L << AS) | (1L << ASC) | (1L << ASENSITIVE) | (1L << ASSERTION) | (1L << ASSIGNMENT) | (1L << ASYMMETRIC) | (1L << AT) | (1L << ATOMIC) | (1L << ATTRIBUTE) | (1L << ATTRIBUTES) | (1L << AUTHORIZATION) | (1L << AVG) | (1L << BACKWARD) | (1L << BEFORE) | (1L << BEGIN) | (1L << BERNOULLI) | (1L << BETWEEN) | (1L << BIGINT) | (1L << BINARY) | (1L << BIT) | (1L << BITVAR) | (1L << BIT_LENGTH) | (1L << BLOB) | (1L << BOOLEAN) | (1L << BOTH) | (1L << BREADTH) | (1L << BY) | (1L << C_) | (1L << CACHE) | (1L << CALL) | (1L << CALLED) | (1L << CARDINALITY) | (1L << CASCADE) | (1L << CASCADED) | (1L << CASE) | (1L << CAST) | (1L << CATALOG))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CATALOG_NAME - 64)) | (1L << (CEIL - 64)) | (1L << (CEILING - 64)) | (1L << (CHAIN - 64)) | (1L << (CHAR - 64)) | (1L << (CHARACTER - 64)) | (1L << (CHARACTERISTICS - 64)) | (1L << (CHARACTERS - 64)) | (1L << (CHARACTER_LENGTH - 64)) | (1L << (CHARACTER_SET_CATALOG - 64)) | (1L << (CHARACTER_SET_NAME - 64)) | (1L << (CHARACTER_SET_SCHEMA - 64)) | (1L << (CHAR_LENGTH - 64)) | (1L << (CHECK - 64)) | (1L << (CHECKED - 64)) | (1L << (CHECKPOINT - 64)) | (1L << (CLASS - 64)) | (1L << (CLASS_ORIGIN - 64)) | (1L << (CLOB - 64)) | (1L << (CLOSE - 64)) | (1L << (CLUSTER - 64)) | (1L << (COALESCE - 64)) | (1L << (COBOL - 64)) | (1L << (COLLATE - 64)) | (1L << (COLLATION - 64)) | (1L << (COLLATION_CATALOG - 64)) | (1L << (COLLATION_NAME - 64)) | (1L << (COLLATION_SCHEMA - 64)) | (1L << (COLLECT - 64)) | (1L << (COLUMN - 64)) | (1L << (COLUMN_NAME - 64)) | (1L << (COMMAND_FUNCTION - 64)) | (1L << (COMMAND_FUNCTION_CODE - 64)) | (1L << (COMMENT - 64)) | (1L << (COMMIT - 64)) | (1L << (COMMITTED - 64)) | (1L << (COMPLETION - 64)) | (1L << (CONDITION - 64)) | (1L << (CONDITION_NUMBER - 64)) | (1L << (CONNECT - 64)) | (1L << (CONNECTION - 64)) | (1L << (CONNECTION_NAME - 64)) | (1L << (CONSTRAINT - 64)) | (1L << (CONSTRAINTS - 64)) | (1L << (CONSTRAINT_CATALOG - 64)) | (1L << (CONSTRAINT_NAME - 64)) | (1L << (CONSTRAINT_SCHEMA - 64)) | (1L << (CONSTRUCTOR - 64)) | (1L << (CONTAINS - 64)) | (1L << (CONTINUE - 64)) | (1L << (CONVERSION - 64)) | (1L << (CONVERT - 64)) | (1L << (COPY - 64)) | (1L << (CORR - 64)) | (1L << (CORRESPONDING - 64)) | (1L << (COUNT - 64)) | (1L << (COVAR_POP - 64)) | (1L << (COVAR_SAMP - 64)) | (1L << (CREATE - 64)) | (1L << (CREATEDB - 64)) | (1L << (CREATEUSER - 64)) | (1L << (CROSS - 64)) | (1L << (CSV - 64)) | (1L << (CUBE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (CUME_DIST - 128)) | (1L << (CURRENT - 128)) | (1L << (CURRENT_DATE - 128)) | (1L << (CURRENT_DEFAULT_TRANSFORM_GROUP - 128)) | (1L << (CURRENT_PATH - 128)) | (1L << (CURRENT_ROLE - 128)) | (1L << (CURRENT_TIME - 128)) | (1L << (CURRENT_TIMESTAMP - 128)) | (1L << (CURRENT_TRANSFORM_GROUP_FOR_TYPE - 128)) | (1L << (CURRENT_USER - 128)) | (1L << (CURSOR - 128)) | (1L << (CURSOR_NAME - 128)) | (1L << (CYCLE - 128)) | (1L << (DATA - 128)) | (1L << (DATABASE - 128)) | (1L << (DATE - 128)) | (1L << (DATETIME_INTERVAL_CODE - 128)) | (1L << (DATETIME_INTERVAL_PRECISION - 128)) | (1L << (DAY - 128)) | (1L << (DEALLOCATE - 128)) | (1L << (DEC - 128)) | (1L << (DECIMAL - 128)) | (1L << (DECLARE - 128)) | (1L << (DEFAULT - 128)) | (1L << (DEFAULTS - 128)) | (1L << (DEFERRABLE - 128)) | (1L << (DEFERRED - 128)) | (1L << (DEFINED - 128)) | (1L << (DEFINER - 128)) | (1L << (DEGREE - 128)) | (1L << (DELETE - 128)) | (1L << (DELIMITER - 128)) | (1L << (DELIMITERS - 128)) | (1L << (DENSE_RANK - 128)) | (1L << (DEPTH - 128)) | (1L << (DEREF - 128)) | (1L << (DERIVED - 128)) | (1L << (DESC - 128)) | (1L << (DESCRIBE - 128)) | (1L << (DESCRIPTOR - 128)) | (1L << (DESTROY - 128)) | (1L << (DESTRUCTOR - 128)) | (1L << (DETERMINISTIC - 128)) | (1L << (DIAGNOSTICS - 128)) | (1L << (DICTIONARY - 128)) | (1L << (DISCONNECT - 128)) | (1L << (DISPATCH - 128)) | (1L << (DISTINCT - 128)) | (1L << (DO - 128)) | (1L << (DOMAIN - 128)) | (1L << (DOUBLE - 128)) | (1L << (DROP - 128)) | (1L << (DYNAMIC - 128)) | (1L << (DYNAMIC_FUNCTION - 128)) | (1L << (DYNAMIC_FUNCTION_CODE - 128)) | (1L << (EACH - 128)) | (1L << (ELEMENT - 128)) | (1L << (ELSE - 128)) | (1L << (ENCODING - 128)) | (1L << (ENCRYPTED - 128)) | (1L << (END - 128)) | (1L << (END_EXEC - 128)) | (1L << (EQUALS - 128)) | (1L << (ESCAPE - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (EVERY - 192)) | (1L << (EXCEPT - 192)) | (1L << (EXCEPTION - 192)) | (1L << (EXCLUDE - 192)) | (1L << (EXCLUDING - 192)) | (1L << (EXCLUSIVE - 192)) | (1L << (EXEC - 192)) | (1L << (EXECUTE - 192)) | (1L << (EXISTING - 192)) | (1L << (EXISTS - 192)) | (1L << (EXP - 192)) | (1L << (EXPLAIN - 192)) | (1L << (EXTERNAL - 192)) | (1L << (EXTRACT - 192)) | (1L << (FALSE - 192)) | (1L << (FETCH - 192)) | (1L << (FILTER - 192)) | (1L << (FINAL - 192)) | (1L << (FIRST - 192)) | (1L << (FLOAT - 192)) | (1L << (FLOOR - 192)) | (1L << (FOLLOWING - 192)) | (1L << (FOR - 192)) | (1L << (FORCE - 192)) | (1L << (FOREIGN - 192)) | (1L << (FORTRAN - 192)) | (1L << (FORWARD - 192)) | (1L << (FOUND - 192)) | (1L << (FREE - 192)) | (1L << (FREEZE - 192)) | (1L << (FROM - 192)) | (1L << (FULL - 192)) | (1L << (FUNCTION - 192)) | (1L << (FUSION - 192)) | (1L << (G_ - 192)) | (1L << (GENERAL - 192)) | (1L << (GENERATED - 192)) | (1L << (GET - 192)) | (1L << (GLOBAL - 192)) | (1L << (GO - 192)) | (1L << (GOTO - 192)) | (1L << (GRANT - 192)) | (1L << (GRANTED - 192)) | (1L << (GROUP - 192)) | (1L << (GROUPING - 192)) | (1L << (HANDLER - 192)) | (1L << (HAVING - 192)) | (1L << (HIERARCHY - 192)) | (1L << (HOLD - 192)) | (1L << (HOST - 192)) | (1L << (HOUR - 192)) | (1L << (IDENTITY - 192)) | (1L << (IGNORE - 192)) | (1L << (ILIKE - 192)) | (1L << (IMMEDIATE - 192)) | (1L << (IMMUTABLE - 192)) | (1L << (IMPLEMENTATION - 192)) | (1L << (IMPLICIT - 192)) | (1L << (IN - 192)) | (1L << (INCLUDING - 192)) | (1L << (INCREMENT - 192)) | (1L << (INDEX - 192)) | (1L << (INDICATOR - 192)) | (1L << (INFIX - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (INHERITS - 256)) | (1L << (INITIALIZE - 256)) | (1L << (INITIALLY - 256)) | (1L << (INNER - 256)) | (1L << (INOUT - 256)) | (1L << (INPUT - 256)) | (1L << (INSENSITIVE - 256)) | (1L << (INSERT - 256)) | (1L << (INSTANCE - 256)) | (1L << (INSTANTIABLE - 256)) | (1L << (INSTEAD - 256)) | (1L << (INT - 256)) | (1L << (INTEGER - 256)) | (1L << (INTERSECT - 256)) | (1L << (INTERSECTION - 256)) | (1L << (INTERVAL - 256)) | (1L << (INTO - 256)) | (1L << (INVOKER - 256)) | (1L << (IS - 256)) | (1L << (ISNULL - 256)) | (1L << (ISOLATION - 256)) | (1L << (ITERATE - 256)) | (1L << (JOIN - 256)) | (1L << (K_ - 256)) | (1L << (KEY - 256)) | (1L << (KEY_MEMBER - 256)) | (1L << (KEY_TYPE - 256)) | (1L << (LANCOMPILER - 256)) | (1L << (LANGUAGE - 256)) | (1L << (LARGE - 256)) | (1L << (LAST - 256)) | (1L << (LATERAL - 256)) | (1L << (LEADING - 256)) | (1L << (LEFT - 256)) | (1L << (LENGTH - 256)) | (1L << (LESS - 256)) | (1L << (LEVEL - 256)) | (1L << (LIKE - 256)) | (1L << (LIMIT - 256)) | (1L << (LISTEN - 256)) | (1L << (LN - 256)) | (1L << (LOAD - 256)) | (1L << (LOCAL - 256)) | (1L << (LOCALTIME - 256)) | (1L << (LOCALTIMESTAMP - 256)) | (1L << (LOCATION - 256)) | (1L << (LOCATOR - 256)) | (1L << (LOCK - 256)) | (1L << (LOCKED - 256)) | (1L << (LOWER - 256)) | (1L << (M_ - 256)) | (1L << (MAP - 256)) | (1L << (MATCH - 256)) | (1L << (MATCHED - 256)) | (1L << (MAX - 256)) | (1L << (MAXVALUE - 256)) | (1L << (MEMBER - 256)) | (1L << (MERGE - 256)) | (1L << (MESSAGE_LENGTH - 256)) | (1L << (MESSAGE_OCTET_LENGTH - 256)) | (1L << (MESSAGE_TEXT - 256)) | (1L << (METHOD - 256)) | (1L << (MIN - 256)) | (1L << (MINUTE - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (MINVALUE - 320)) | (1L << (MOD - 320)) | (1L << (MODE - 320)) | (1L << (MODIFIES - 320)) | (1L << (MODIFY - 320)) | (1L << (MODULE - 320)) | (1L << (MONTH - 320)) | (1L << (MORE_ - 320)) | (1L << (MOVE - 320)) | (1L << (MULTISET - 320)) | (1L << (MUMPS - 320)) | (1L << (NAME - 320)) | (1L << (NAMES - 320)) | (1L << (NATIONAL - 320)) | (1L << (NATURAL - 320)) | (1L << (NCHAR - 320)) | (1L << (NCLOB - 320)) | (1L << (NESTING - 320)) | (1L << (NEW - 320)) | (1L << (NEXT - 320)) | (1L << (NO - 320)) | (1L << (NOCREATEDB - 320)) | (1L << (NOCREATEUSER - 320)) | (1L << (NONE - 320)) | (1L << (NORMALIZE - 320)) | (1L << (NORMALIZED - 320)) | (1L << (NOT - 320)) | (1L << (NOTHING - 320)) | (1L << (NOTIFY - 320)) | (1L << (NOTNULL - 320)) | (1L << (NOWAIT - 320)) | (1L << (NULL - 320)) | (1L << (NULLABLE - 320)) | (1L << (NULLIF - 320)) | (1L << (NULLS - 320)) | (1L << (NUMBER - 320)) | (1L << (NUMERIC - 320)) | (1L << (OBJECT - 320)) | (1L << (OCTETS - 320)) | (1L << (OCTET_LENGTH - 320)) | (1L << (OF - 320)) | (1L << (OFF - 320)) | (1L << (OFFSET - 320)) | (1L << (OIDS - 320)) | (1L << (OLD - 320)) | (1L << (ON - 320)) | (1L << (ONLY - 320)) | (1L << (OPEN - 320)) | (1L << (OPERATION - 320)) | (1L << (OPERATOR - 320)) | (1L << (OPTION - 320)) | (1L << (OPTIONS - 320)) | (1L << (OR - 320)) | (1L << (ORDER - 320)) | (1L << (ORDERING - 320)) | (1L << (ORDINALITY - 320)) | (1L << (OTHERS - 320)) | (1L << (OUT - 320)) | (1L << (OUTER - 320)) | (1L << (OUTPUT - 320)) | (1L << (OVER - 320)) | (1L << (OVERLAPS - 320)) | (1L << (OVERLAY - 320)) | (1L << (OVERRIDING - 320)))) != 0) || ((((_la - 384)) & ~0x3f) == 0 && ((1L << (_la - 384)) & ((1L << (OWNER - 384)) | (1L << (PAD - 384)) | (1L << (PARAMETER - 384)) | (1L << (PARAMETERS - 384)) | (1L << (PARAMETER_MODE - 384)) | (1L << (PARAMETER_NAME - 384)) | (1L << (PARAMETER_ORDINAL_POSITION - 384)) | (1L << (PARAMETER_SPECIFIC_CATALOG - 384)) | (1L << (PARAMETER_SPECIFIC_NAME - 384)) | (1L << (PARAMETER_SPECIFIC_SCHEMA - 384)) | (1L << (PARTIAL - 384)) | (1L << (PARTITION - 384)) | (1L << (PASCAL - 384)) | (1L << (PASSWORD - 384)) | (1L << (PATH - 384)) | (1L << (PERCENTILE_CONT - 384)) | (1L << (PERCENTILE_DISC - 384)) | (1L << (PERCENT_RANK - 384)) | (1L << (PLACING - 384)) | (1L << (PLI - 384)) | (1L << (POSITION - 384)) | (1L << (POSTFIX - 384)) | (1L << (POWER - 384)) | (1L << (PRECEDING - 384)) | (1L << (PRECISION - 384)) | (1L << (PREFIX - 384)) | (1L << (PREORDER - 384)) | (1L << (PREPARE - 384)) | (1L << (PRESERVE - 384)) | (1L << (PRIMARY - 384)) | (1L << (PRIOR - 384)) | (1L << (PRIVILEGES - 384)) | (1L << (PROCEDURAL - 384)) | (1L << (PROCEDURE - 384)) | (1L << (PUBLIC - 384)) | (1L << (QUOTE - 384)) | (1L << (RANGE - 384)) | (1L << (RANK - 384)) | (1L << (READ - 384)) | (1L << (READS - 384)) | (1L << (REAL - 384)) | (1L << (RECHECK - 384)) | (1L << (RECURSIVE - 384)) | (1L << (REF - 384)) | (1L << (REFERENCES - 384)) | (1L << (REFERENCING - 384)) | (1L << (REGR_AVGX - 384)) | (1L << (REGR_AVGY - 384)) | (1L << (REGR_COUNT - 384)) | (1L << (REGR_INTERCEPT - 384)) | (1L << (REGR_R2 - 384)) | (1L << (REGR_SLOPE - 384)) | (1L << (REGR_SXX - 384)) | (1L << (REGR_SXY - 384)) | (1L << (REGR_SYY - 384)) | (1L << (REINDEX - 384)) | (1L << (RELATIVE - 384)) | (1L << (RELEASE - 384)) | (1L << (RENAME - 384)) | (1L << (REPEATABLE - 384)) | (1L << (REPLACE - 384)) | (1L << (RESET - 384)) | (1L << (RESTART - 384)) | (1L << (RESTRICT - 384)))) != 0) || ((((_la - 448)) & ~0x3f) == 0 && ((1L << (_la - 448)) & ((1L << (RESULT - 448)) | (1L << (RETURN - 448)) | (1L << (RETURNED_CARDINALITY - 448)) | (1L << (RETURNED_LENGTH - 448)) | (1L << (RETURNED_OCTET_LENGTH - 448)) | (1L << (RETURNED_SQLSTATE - 448)) | (1L << (RETURNS - 448)) | (1L << (REVOKE - 448)) | (1L << (RIGHT - 448)) | (1L << (ROLE - 448)) | (1L << (ROLLBACK - 448)) | (1L << (ROLLUP - 448)) | (1L << (ROUTINE - 448)) | (1L << (ROUTINE_CATALOG - 448)) | (1L << (ROUTINE_NAME - 448)) | (1L << (ROUTINE_SCHEMA - 448)) | (1L << (ROW - 448)) | (1L << (ROWS - 448)) | (1L << (ROW_COUNT - 448)) | (1L << (ROW_NUMBER - 448)) | (1L << (RULE - 448)) | (1L << (SAVEPOINT - 448)) | (1L << (SCALE - 448)) | (1L << (SCHEMA - 448)) | (1L << (SCHEMA_NAME - 448)) | (1L << (SCOPE - 448)) | (1L << (SCOPE_CATALOG - 448)) | (1L << (SCOPE_NAME - 448)) | (1L << (SCOPE_SCHEMA - 448)) | (1L << (SCROLL - 448)) | (1L << (SEARCH - 448)) | (1L << (SECOND - 448)) | (1L << (SECTION - 448)) | (1L << (SECURITY - 448)) | (1L << (SELECT - 448)) | (1L << (SELF - 448)) | (1L << (SENSITIVE - 448)) | (1L << (SEQUENCE - 448)) | (1L << (SERIALIZABLE - 448)) | (1L << (SERVER_NAME - 448)) | (1L << (SESSION - 448)) | (1L << (SESSION_USER - 448)) | (1L << (SET - 448)) | (1L << (SETOF - 448)) | (1L << (SETS - 448)) | (1L << (SHARE - 448)) | (1L << (SHOW - 448)) | (1L << (SIMILAR - 448)) | (1L << (SIMPLE - 448)) | (1L << (SIZE - 448)) | (1L << (SKIP_ - 448)) | (1L << (SMALLINT - 448)) | (1L << (SOME - 448)) | (1L << (SOURCE - 448)) | (1L << (SPACE - 448)) | (1L << (SPECIFIC - 448)) | (1L << (SPECIFICTYPE - 448)) | (1L << (SPECIFIC_NAME - 448)) | (1L << (SQL - 448)) | (1L << (SQLCODE - 448)) | (1L << (SQLERROR - 448)) | (1L << (SQLEXCEPTION - 448)) | (1L << (SQLSTATE - 448)) | (1L << (SQLWARNING - 448)))) != 0) || ((((_la - 512)) & ~0x3f) == 0 && ((1L << (_la - 512)) & ((1L << (SQRT - 512)) | (1L << (STABLE - 512)) | (1L << (START - 512)) | (1L << (STATE - 512)) | (1L << (STATEMENT - 512)) | (1L << (STATIC - 512)) | (1L << (STATISTICS - 512)) | (1L << (STDDEV_POP - 512)) | (1L << (STDDEV_SAMP - 512)) | (1L << (STDIN - 512)) | (1L << (STDOUT - 512)) | (1L << (STORAGE - 512)) | (1L << (STRICT - 512)) | (1L << (STRUCTURE - 512)) | (1L << (STYLE - 512)) | (1L << (SUBCLASS_ORIGIN - 512)) | (1L << (SUBLIST - 512)) | (1L << (SUBMULTISET - 512)) | (1L << (SUBSTRING - 512)) | (1L << (SUM - 512)) | (1L << (SYMMETRIC - 512)) | (1L << (SYSID - 512)) | (1L << (SYSTEM - 512)) | (1L << (SYSTEM_USER - 512)) | (1L << (TABLE - 512)) | (1L << (TABLESAMPLE - 512)) | (1L << (TABLESPACE - 512)) | (1L << (TABLE_NAME - 512)) | (1L << (TEMP - 512)) | (1L << (TEMPLATE - 512)) | (1L << (TEMPORARY - 512)) | (1L << (TERMINATE - 512)) | (1L << (THAN - 512)) | (1L << (THEN - 512)) | (1L << (TIES - 512)) | (1L << (TIME - 512)) | (1L << (TIME_TZ - 512)) | (1L << (TIMESTAMP - 512)) | (1L << (TIMESTAMP_TZ - 512)) | (1L << (TIMEZONE_HOUR - 512)) | (1L << (TIMEZONE_MINUTE - 512)) | (1L << (TO - 512)) | (1L << (TOAST - 512)) | (1L << (TOP_LEVEL_COUNT - 512)) | (1L << (TRAILING - 512)) | (1L << (TRANSACTION - 512)) | (1L << (TRANSACTIONS_COMMITTED - 512)) | (1L << (TRANSACTIONS_ROLLED_BACK - 512)) | (1L << (TRANSACTION_ACTIVE - 512)) | (1L << (TRANSFORM - 512)) | (1L << (TRANSFORMS - 512)) | (1L << (TRANSLATE - 512)) | (1L << (TRANSLATION - 512)) | (1L << (TREAT - 512)) | (1L << (TRIGGER - 512)) | (1L << (TRIGGER_CATALOG - 512)) | (1L << (TRIGGER_NAME - 512)) | (1L << (TRIGGER_SCHEMA - 512)) | (1L << (TRIM - 512)) | (1L << (TRUE - 512)) | (1L << (TRUNCATE - 512)) | (1L << (TRUSTED - 512)) | (1L << (TYPE - 512)) | (1L << (UESCAPE - 512)))) != 0) || ((((_la - 576)) & ~0x3f) == 0 && ((1L << (_la - 576)) & ((1L << (UNBOUNDED - 576)) | (1L << (UNCOMMITTED - 576)) | (1L << (UNDER - 576)) | (1L << (UNENCRYPTED - 576)) | (1L << (UNION - 576)) | (1L << (UNIQUE - 576)) | (1L << (UNKNOWN - 576)) | (1L << (UNLISTEN - 576)) | (1L << (UNNAMED - 576)) | (1L << (UNNEST - 576)) | (1L << (UNTIL - 576)) | (1L << (UPDATE - 576)) | (1L << (UPPER - 576)) | (1L << (USAGE - 576)) | (1L << (USER - 576)) | (1L << (USER_DEFINED_TYPE_CATALOG - 576)) | (1L << (USER_DEFINED_TYPE_CODE - 576)) | (1L << (USER_DEFINED_TYPE_NAME - 576)) | (1L << (USER_DEFINED_TYPE_SCHEMA - 576)) | (1L << (USING - 576)) | (1L << (VACUUM - 576)) | (1L << (VALID - 576)) | (1L << (VALIDATOR - 576)) | (1L << (VALUE - 576)) | (1L << (VALUES - 576)) | (1L << (VARCHAR - 576)) | (1L << (VARIABLE - 576)) | (1L << (VARIADIC - 576)) | (1L << (VARYING - 576)) | (1L << (VAR_POP - 576)) | (1L << (VAR_SAMP - 576)) | (1L << (VERBOSE - 576)) | (1L << (VIEW - 576)) | (1L << (VOLATILE - 576)) | (1L << (WHEN - 576)) | (1L << (WHENEVER - 576)) | (1L << (WHERE - 576)) | (1L << (WIDTH_BUCKET - 576)) | (1L << (WINDOW - 576)) | (1L << (WITH - 576)) | (1L << (WITHIN - 576)) | (1L << (WITHOUT - 576)) | (1L << (WORK - 576)) | (1L << (WRITE - 576)) | (1L << (YEAR - 576)) | (1L << (ZONE - 576)) | (1L << (SUPERUSER - 576)) | (1L << (NOSUPERUSER - 576)) | (1L << (CREATEROLE - 576)) | (1L << (NOCREATEROLE - 576)) | (1L << (INHERIT - 576)) | (1L << (NOINHERIT - 576)) | (1L << (LOGIN - 576)) | (1L << (NOLOGIN - 576)) | (1L << (REPLICATION - 576)) | (1L << (NOREPLICATION - 576)) | (1L << (BYPASSRLS - 576)) | (1L << (NOBYPASSRLS - 576)) | (1L << (SFUNC - 576)) | (1L << (STYPE - 576)) | (1L << (SSPACE - 576)) | (1L << (FINALFUNC - 576)) | (1L << (FINALFUNC_EXTRA - 576)) | (1L << (COMBINEFUNC - 576)))) != 0) || ((((_la - 640)) & ~0x3f) == 0 && ((1L << (_la - 640)) & ((1L << (SERIALFUNC - 640)) | (1L << (DESERIALFUNC - 640)) | (1L << (INITCOND - 640)) | (1L << (MSFUNC - 640)) | (1L << (MINVFUNC - 640)) | (1L << (MSTYPE - 640)) | (1L << (MSSPACE - 640)) | (1L << (MFINALFUNC - 640)) | (1L << (MFINALFUNC_EXTRA - 640)) | (1L << (MINITCOND - 640)) | (1L << (SORTOP - 640)) | (1L << (PARALLEL - 640)) | (1L << (HYPOTHETICAL - 640)) | (1L << (SAFE - 640)) | (1L << (RESTRICTED - 640)) | (1L << (UNSAFE - 640)) | (1L << (BASETYPE - 640)) | (1L << (IF - 640)) | (1L << (LOCALE - 640)) | (1L << (LC_COLLATE - 640)) | (1L << (LC_CTYPE - 640)) | (1L << (PROVIDER - 640)) | (1L << (VERSION - 640)) | (1L << (ALLOW_CONNECTIONS - 640)) | (1L << (IS_TEMPLATE - 640)) | (1L << (EVENT - 640)) | (1L << (WRAPPER - 640)) | (1L << (SERVER - 640)) | (1L << (BTREE - 640)) | (1L << (HASH_ - 640)) | (1L << (GIST - 640)) | (1L << (SPGIST - 640)) | (1L << (GIN - 640)) | (1L << (BRIN - 640)) | (1L << (CONCURRENTLY - 640)) | (1L << (INLINE - 640)) | (1L << (MATERIALIZED - 640)) | (1L << (LEFTARG - 640)) | (1L << (RIGHTARG - 640)) | (1L << (COMMUTATOR - 640)) | (1L << (NEGATOR - 640)) | (1L << (HASHES - 640)) | (1L << (MERGES - 640)) | (1L << (FAMILY - 640)) | (1L << (POLICY - 640)) | (1L << (OWNED - 640)) | (1L << (ABSTIME - 640)) | (1L << (BOOL - 640)) | (1L << (BOX - 640)) | (1L << (FLOAT4 - 640)) | (1L << (FLOAT8 - 640)) | (1L << (INT2 - 640)) | (1L << (INT4 - 640)) | (1L << (INT8 - 640)) | (1L << (JSON - 640)) | (1L << (JSONB - 640)) | (1L << (LINE - 640)) | (1L << (POINT - 640)) | (1L << (RELTIME - 640)) | (1L << (TEXT - 640)) | (1L << (COMMA - 640)) | (1L << (COLON - 640)) | (1L << (COLON_COLON - 640)))) != 0) || ((((_la - 704)) & ~0x3f) == 0 && ((1L << (_la - 704)) & ((1L << (DOLLAR_DOLLAR - 704)) | (1L << (STAR - 704)) | (1L << (OPEN_PAREN - 704)) | (1L << (CLOSE_PAREN - 704)) | (1L << (OPEN_BRACKET - 704)) | (1L << (CLOSE_BRACKET - 704)) | (1L << (BIT_STRING - 704)) | (1L << (REGEX_STRING - 704)) | (1L << (NUMERIC_LITERAL - 704)) | (1L << (INTEGER_LITERAL - 704)) | (1L << (HEX_INTEGER_LITERAL - 704)) | (1L << (DOT - 704)) | (1L << (SINGLEQ_STRING_LITERAL - 704)) | (1L << (DOUBLEQ_STRING_LITERAL - 704)) | (1L << (IDENTIFIER - 704)) | (1L << (AMP - 704)) | (1L << (AMP_AMP - 704)) | (1L << (AMP_LT - 704)) | (1L << (AT_AT - 704)) | (1L << (AT_GT - 704)) | (1L << (AT_SIGN - 704)) | (1L << (BANG - 704)) | (1L << (BANG_BANG - 704)) | (1L << (BANG_EQUAL - 704)) | (1L << (CARET - 704)) | (1L << (EQUAL - 704)) | (1L << (EQUAL_GT - 704)) | (1L << (GT - 704)) | (1L << (GTE - 704)) | (1L << (GT_GT - 704)) | (1L << (HASH - 704)) | (1L << (HASH_EQ - 704)) | (1L << (HASH_GT - 704)) | (1L << (HASH_GT_GT - 704)) | (1L << (HASH_HASH - 704)) | (1L << (HYPHEN_GT - 704)) | (1L << (HYPHEN_GT_GT - 704)) | (1L << (HYPHEN_PIPE_HYPHEN - 704)) | (1L << (LT - 704)) | (1L << (LTE - 704)) | (1L << (LT_AT - 704)) | (1L << (LT_CARET - 704)) | (1L << (LT_GT - 704)) | (1L << (LT_HYPHEN_GT - 704)) | (1L << (LT_LT - 704)) | (1L << (LT_LT_EQ - 704)) | (1L << (LT_QMARK_GT - 704)) | (1L << (MINUS - 704)) | (1L << (PERCENT - 704)) | (1L << (PIPE - 704)) | (1L << (PIPE_PIPE - 704)) | (1L << (PIPE_PIPE_SLASH - 704)) | (1L << (PIPE_SLASH - 704)) | (1L << (PLUS - 704)) | (1L << (QMARK - 704)) | (1L << (QMARK_AMP - 704)) | (1L << (QMARK_HASH - 704)) | (1L << (QMARK_HYPHEN - 704)) | (1L << (QMARK_PIPE - 704)) | (1L << (SLASH - 704)) | (1L << (TIL - 704)) | (1L << (TIL_EQ - 704)) | (1L << (TIL_GTE_TIL - 704)) | (1L << (TIL_GT_TIL - 704)))) != 0) || ((((_la - 768)) & ~0x3f) == 0 && ((1L << (_la - 768)) & ((1L << (TIL_LTE_TIL - 768)) | (1L << (TIL_LT_TIL - 768)) | (1L << (TIL_STAR - 768)) | (1L << (TIL_TIL - 768)))) != 0) );
				setState(2313);
				match(DOLLAR);
				setState(2314);
				identifier(0);
				setState(2315);
				match(DOLLAR);
				}
				break;
			case 16:
				{
				setState(2317);
				bool_expr(0);
				}
				break;
			case 17:
				{
				setState(2318);
				values_stmt();
				}
				break;
			case 18:
				{
				setState(2319);
				expr_list();
				}
				break;
			case 19:
				{
				setState(2320);
				match(OPEN_PAREN);
				setState(2321);
				expr(0);
				setState(2322);
				match(CLOSE_PAREN);
				}
				break;
			case 20:
				{
				setState(2324);
				type_literal();
				setState(2325);
				match(SINGLEQ_STRING_LITERAL);
				}
				break;
			case 21:
				{
				setState(2327);
				((ExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 724)) & ~0x3f) == 0 && ((1L << (_la - 724)) & ((1L << (AT_SIGN - 724)) | (1L << (BANG_BANG - 724)) | (1L << (MINUS - 724)) | (1L << (PLUS - 724)))) != 0)) ) {
					((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2328);
				expr(25);
				}
				break;
			case 22:
				{
				setState(2329);
				((ExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==QMARK_HYPHEN || _la==TIL) ) {
					((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2330);
				expr(24);
				}
				break;
			case 23:
				{
				setState(2331);
				((ExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ALL || _la==NOT) ) {
					((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2332);
				expr(12);
				}
				break;
			case 24:
				{
				setState(2333);
				func_call();
				}
				break;
			case 25:
				{
				setState(2334);
				identifier(0);
				}
				break;
			case 26:
				{
				setState(2335);
				match(CAST);
				setState(2336);
				match(OPEN_PAREN);
				setState(2337);
				expr(0);
				setState(2338);
				match(AS);
				setState(2339);
				type(0);
				setState(2340);
				match(CLOSE_PAREN);
				}
				break;
			case 27:
				{
				setState(2342);
				correlation_name();
				setState(2343);
				match(DOT);
				setState(2344);
				column_name();
				}
				break;
			case 28:
				{
				setState(2346);
				match(CASE);
				setState(2347);
				match(WHEN);
				setState(2348);
				predicate(0);
				setState(2349);
				match(THEN);
				setState(2350);
				expr(0);
				setState(2353);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(2351);
					match(ELSE);
					setState(2352);
					expr(0);
					}
				}

				setState(2355);
				match(END);
				}
				break;
			case 29:
				{
				setState(2357);
				aggregate();
				}
				break;
			case 30:
				{
				setState(2358);
				array_cons_expr();
				}
				break;
			case 31:
				{
				setState(2359);
				match(OPEN_PAREN);
				setState(2360);
				select_stmt();
				setState(2361);
				match(CLOSE_PAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2431);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,223,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2429);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,222,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2365);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(2366);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 728)) & ~0x3f) == 0 && ((1L << (_la - 728)) & ((1L << (CARET - 728)) | (1L << (PIPE_PIPE_SLASH - 728)) | (1L << (PIPE_SLASH - 728)))) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2367);
						expr(23);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2368);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(2369);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 705)) & ~0x3f) == 0 && ((1L << (_la - 705)) & ((1L << (STAR - 705)) | (1L << (PERCENT - 705)) | (1L << (SLASH - 705)))) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2370);
						expr(22);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2371);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(2372);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MINUS || _la==PLUS) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2373);
						expr(21);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2374);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(2375);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==NOT || _la==OR || ((((_la - 719)) & ~0x3f) == 0 && ((1L << (_la - 719)) & ((1L << (AMP - 719)) | (1L << (AMP_AMP - 719)) | (1L << (AMP_LT - 719)) | (1L << (AT_AT - 719)) | (1L << (AT_GT - 719)) | (1L << (EQUAL_GT - 719)) | (1L << (GT_GT - 719)) | (1L << (HASH - 719)) | (1L << (HASH_EQ - 719)) | (1L << (HASH_GT - 719)) | (1L << (HASH_GT_GT - 719)) | (1L << (HASH_HASH - 719)) | (1L << (HYPHEN_GT - 719)) | (1L << (HYPHEN_GT_GT - 719)) | (1L << (HYPHEN_PIPE_HYPHEN - 719)) | (1L << (LT_AT - 719)) | (1L << (LT_CARET - 719)) | (1L << (LT_HYPHEN_GT - 719)) | (1L << (LT_LT - 719)) | (1L << (LT_LT_EQ - 719)) | (1L << (LT_QMARK_GT - 719)) | (1L << (PIPE - 719)) | (1L << (PIPE_PIPE - 719)) | (1L << (QMARK - 719)) | (1L << (QMARK_AMP - 719)) | (1L << (QMARK_HASH - 719)) | (1L << (QMARK_PIPE - 719)) | (1L << (TIL - 719)) | (1L << (TIL_EQ - 719)) | (1L << (TIL_GTE_TIL - 719)) | (1L << (TIL_GT_TIL - 719)) | (1L << (TIL_LTE_TIL - 719)) | (1L << (TIL_LT_TIL - 719)) | (1L << (TIL_STAR - 719)) | (1L << (TIL_TIL - 719)))) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2376);
						expr(20);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2377);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(2379);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(2378);
							match(NOT);
							}
						}

						setState(2381);
						match(LIKE);
						setState(2382);
						expr(19);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2383);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(2385);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(2384);
							match(NOT);
							}
						}

						setState(2387);
						match(BETWEEN);
						setState(2388);
						expr(0);
						setState(2389);
						match(AND);
						setState(2390);
						expr(18);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2392);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(2393);
						match(IN);
						setState(2394);
						expr(17);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2395);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(2396);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 727)) & ~0x3f) == 0 && ((1L << (_la - 727)) & ((1L << (BANG_EQUAL - 727)) | (1L << (EQUAL - 727)) | (1L << (GT - 727)) | (1L << (GTE - 727)) | (1L << (LT - 727)) | (1L << (LTE - 727)) | (1L << (LT_GT - 727)))) != 0)) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2397);
						expr(16);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2398);
						if (!(precpred(_ctx, 28))) throw new FailedPredicateException(this, "precpred(_ctx, 28)");
						setState(2399);
						match(OPEN_BRACKET);
						setState(2400);
						expr(0);
						setState(2401);
						match(CLOSE_BRACKET);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2403);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(2404);
						((ExprContext)_localctx).op = match(BANG);
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2405);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(2406);
						((ExprContext)_localctx).op = match(IS);
						setState(2409);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case FALSE:
						case NOT:
						case TRUE:
							{
							setState(2407);
							bool_expr(0);
							}
							break;
						case NULL:
							{
							setState(2408);
							match(NULL);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					case 12:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2411);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(2412);
						((ExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ISNULL || _la==NOTNULL) ) {
							((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case 13:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2413);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(2414);
						match(OPEN_BRACKET);
						setState(2415);
						expr(0);
						setState(2416);
						match(COLON);
						setState(2417);
						expr(0);
						setState(2418);
						match(CLOSE_BRACKET);
						}
						break;
					case 14:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2420);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(2421);
						match(COLON_COLON);
						setState(2422);
						type(0);
						}
						break;
					case 15:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(2423);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2424);
						match(DOT);
						setState(2427);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case WHITESPACE:
						case A_:
						case ABORT:
						case ABS:
						case ABSOLUTE:
						case ACCESS:
						case ACTION:
						case ADA:
						case ADD:
						case ADMIN:
						case AFTER:
						case AGGREGATE:
						case ALLOCATE:
						case ALSO:
						case ALTER:
						case ALWAYS:
						case ARE:
						case ASENSITIVE:
						case ASSERTION:
						case ASSIGNMENT:
						case AT:
						case ATOMIC:
						case ATTRIBUTE:
						case ATTRIBUTES:
						case AVG:
						case BACKWARD:
						case BEFORE:
						case BEGIN:
						case BERNOULLI:
						case BETWEEN:
						case BIGINT:
						case BIT:
						case BIT_LENGTH:
						case BLOB:
						case BOOLEAN:
						case BREADTH:
						case BY:
						case C_:
						case CACHE:
						case CALL:
						case CALLED:
						case CARDINALITY:
						case CASCADE:
						case CASCADED:
						case CATALOG:
						case CATALOG_NAME:
						case CEIL:
						case CEILING:
						case CHAIN:
						case CHAR:
						case CHARACTER:
						case CHARACTERISTICS:
						case CHARACTERS:
						case CHARACTER_LENGTH:
						case CHARACTER_SET_CATALOG:
						case CHARACTER_SET_NAME:
						case CHARACTER_SET_SCHEMA:
						case CHAR_LENGTH:
						case CHECKPOINT:
						case CLASS:
						case CLASS_ORIGIN:
						case CLOB:
						case CLOSE:
						case CLUSTER:
						case COALESCE:
						case COBOL:
						case COLLATION_CATALOG:
						case COLLATION_NAME:
						case COLLATION_SCHEMA:
						case COLLECT:
						case COLUMN_NAME:
						case COMMAND_FUNCTION:
						case COMMAND_FUNCTION_CODE:
						case COMMENT:
						case COMMIT:
						case COMMITTED:
						case CONDITION:
						case CONDITION_NUMBER:
						case CONNECT:
						case CONNECTION:
						case CONNECTION_NAME:
						case CONSTRAINTS:
						case CONSTRAINT_CATALOG:
						case CONSTRAINT_NAME:
						case CONSTRAINT_SCHEMA:
						case CONSTRUCTOR:
						case CONTAINS:
						case CONTINUE:
						case CONVERSION:
						case CONVERT:
						case COPY:
						case CORR:
						case CORRESPONDING:
						case COUNT:
						case COVAR_POP:
						case COVAR_SAMP:
						case CSV:
						case CUBE:
						case CUME_DIST:
						case CURRENT:
						case CURRENT_DEFAULT_TRANSFORM_GROUP:
						case CURRENT_PATH:
						case CURRENT_TRANSFORM_GROUP_FOR_TYPE:
						case CURSOR:
						case CURSOR_NAME:
						case CYCLE:
						case DATA:
						case DATABASE:
						case DATE:
						case DATETIME_INTERVAL_CODE:
						case DATETIME_INTERVAL_PRECISION:
						case DAY:
						case DEALLOCATE:
						case DEC:
						case DECIMAL:
						case DECLARE:
						case DEFAULTS:
						case DEFERRED:
						case DEFINED:
						case DEFINER:
						case DEGREE:
						case DELETE:
						case DELIMITER:
						case DELIMITERS:
						case DENSE_RANK:
						case DEPTH:
						case DEREF:
						case DERIVED:
						case DESCRIBE:
						case DESCRIPTOR:
						case DETERMINISTIC:
						case DIAGNOSTICS:
						case DICTIONARY:
						case DISCONNECT:
						case DISPATCH:
						case DOMAIN:
						case DOUBLE:
						case DROP:
						case DYNAMIC:
						case DYNAMIC_FUNCTION:
						case DYNAMIC_FUNCTION_CODE:
						case EACH:
						case ELEMENT:
						case ENCODING:
						case ENCRYPTED:
						case END:
						case EQUALS:
						case ESCAPE:
						case EVERY:
						case EXCEPTION:
						case EXCLUDE:
						case EXCLUDING:
						case EXCLUSIVE:
						case EXEC:
						case EXECUTE:
						case EXISTS:
						case EXP:
						case EXPLAIN:
						case EXTERNAL:
						case EXTRACT:
						case FILTER:
						case FINAL:
						case FIRST:
						case FLOAT:
						case FLOOR:
						case FOLLOWING:
						case FORCE:
						case FORTRAN:
						case FORWARD:
						case FOUND:
						case FREE:
						case FUNCTION:
						case FUSION:
						case G_:
						case GENERAL:
						case GENERATED:
						case GET:
						case GLOBAL:
						case GO:
						case GOTO:
						case GRANTED:
						case GROUPING:
						case HANDLER:
						case HIERARCHY:
						case HOLD:
						case HOUR:
						case IDENTITY:
						case IGNORE:
						case IMMEDIATE:
						case IMMUTABLE:
						case IMPLEMENTATION:
						case IMPLICIT:
						case INCLUDING:
						case INCREMENT:
						case INDEX:
						case INDICATOR:
						case INHERITS:
						case INOUT:
						case INPUT:
						case INSENSITIVE:
						case INSERT:
						case INSTANCE:
						case INSTANTIABLE:
						case INSTEAD:
						case INT:
						case INTEGER:
						case INTERSECTION:
						case INTERVAL:
						case INVOKER:
						case ISOLATION:
						case KEY:
						case KEY_MEMBER:
						case KEY_TYPE:
						case LANGUAGE:
						case LARGE:
						case LAST:
						case LEFT:
						case LENGTH:
						case LEVEL:
						case LISTEN:
						case LN:
						case LOAD:
						case LOCAL:
						case LOCATION:
						case LOCATOR:
						case LOCK:
						case LOCKED:
						case LOWER:
						case M_:
						case MAP:
						case MATCH:
						case MATCHED:
						case MAX:
						case MAXVALUE:
						case MEMBER:
						case MERGE:
						case MESSAGE_LENGTH:
						case MESSAGE_OCTET_LENGTH:
						case MESSAGE_TEXT:
						case METHOD:
						case MIN:
						case MINUTE:
						case MINVALUE:
						case MOD:
						case MODE:
						case MODIFIES:
						case MODULE:
						case MONTH:
						case MORE_:
						case MOVE:
						case MULTISET:
						case MUMPS:
						case NAME:
						case NAMES:
						case NATIONAL:
						case NCHAR:
						case NCLOB:
						case NESTING:
						case NEW:
						case NEXT:
						case NO:
						case NONE:
						case NORMALIZE:
						case NORMALIZED:
						case NOTHING:
						case NOTIFY:
						case NOWAIT:
						case NULLABLE:
						case NULLIF:
						case NULLS:
						case NUMBER:
						case NUMERIC:
						case OBJECT:
						case OCTETS:
						case OCTET_LENGTH:
						case OF:
						case OFF:
						case OIDS:
						case OLD:
						case OPEN:
						case OPERATOR:
						case OPTION:
						case OPTIONS:
						case ORDERING:
						case ORDINALITY:
						case OTHERS:
						case OUT:
						case OUTPUT:
						case OVER:
						case OVERLAY:
						case OVERRIDING:
						case OWNER:
						case PAD:
						case PARAMETER:
						case PARAMETER_MODE:
						case PARAMETER_NAME:
						case PARAMETER_ORDINAL_POSITION:
						case PARAMETER_SPECIFIC_CATALOG:
						case PARAMETER_SPECIFIC_NAME:
						case PARAMETER_SPECIFIC_SCHEMA:
						case PARTIAL:
						case PARTITION:
						case PASCAL:
						case PASSWORD:
						case PATH:
						case PERCENTILE_CONT:
						case PERCENTILE_DISC:
						case PERCENT_RANK:
						case PLI:
						case POSITION:
						case POWER:
						case PRECEDING:
						case PRECISION:
						case PREPARE:
						case PRESERVE:
						case PRIOR:
						case PRIVILEGES:
						case PROCEDURAL:
						case PROCEDURE:
						case PUBLIC:
						case QUOTE:
						case RANGE:
						case RANK:
						case READ:
						case READS:
						case REAL:
						case RECHECK:
						case RECURSIVE:
						case REF:
						case REFERENCING:
						case REGR_AVGX:
						case REGR_AVGY:
						case REGR_COUNT:
						case REGR_INTERCEPT:
						case REGR_SLOPE:
						case REGR_SXX:
						case REGR_SXY:
						case REGR_SYY:
						case REINDEX:
						case RELATIVE:
						case RELEASE:
						case RENAME:
						case REPEATABLE:
						case REPLACE:
						case RESET:
						case RESTART:
						case RESTRICT:
						case RESULT:
						case RETURN:
						case RETURNED_CARDINALITY:
						case RETURNED_LENGTH:
						case RETURNED_OCTET_LENGTH:
						case RETURNED_SQLSTATE:
						case RETURNS:
						case REVOKE:
						case RIGHT:
						case ROLE:
						case ROLLBACK:
						case ROLLUP:
						case ROUTINE:
						case ROUTINE_CATALOG:
						case ROUTINE_NAME:
						case ROUTINE_SCHEMA:
						case ROW:
						case ROWS:
						case ROW_COUNT:
						case ROW_NUMBER:
						case RULE:
						case SAVEPOINT:
						case SCALE:
						case SCHEMA:
						case SCHEMA_NAME:
						case SCOPE:
						case SCOPE_CATALOG:
						case SCOPE_NAME:
						case SCOPE_SCHEMA:
						case SCROLL:
						case SEARCH:
						case SECOND:
						case SECTION:
						case SECURITY:
						case SELF:
						case SENSITIVE:
						case SEQUENCE:
						case SERIALIZABLE:
						case SERVER_NAME:
						case SESSION:
						case SET:
						case SETOF:
						case SETS:
						case SHARE:
						case SHOW:
						case SIMPLE:
						case SIZE:
						case SMALLINT:
						case SOURCE:
						case SPACE:
						case SPECIFIC:
						case SPECIFICTYPE:
						case SPECIFIC_NAME:
						case SQL:
						case SQLCODE:
						case SQLERROR:
						case SQLEXCEPTION:
						case SQLSTATE:
						case SQLWARNING:
						case SQRT:
						case STABLE:
						case START:
						case STATE:
						case STATEMENT:
						case STATIC:
						case STATISTICS:
						case STDDEV_POP:
						case STDDEV_SAMP:
						case STDIN:
						case STDOUT:
						case STORAGE:
						case STRICT:
						case STRUCTURE:
						case STYLE:
						case SUBCLASS_ORIGIN:
						case SUBMULTISET:
						case SUBSTRING:
						case SUM:
						case SYSID:
						case SYSTEM:
						case SYSTEM_USER:
						case TABLESPACE:
						case TABLE_NAME:
						case TEMP:
						case TEMPLATE:
						case TEMPORARY:
						case TIES:
						case TIME:
						case TIMESTAMP:
						case TIMEZONE_HOUR:
						case TIMEZONE_MINUTE:
						case TOP_LEVEL_COUNT:
						case TRANSACTION:
						case TRANSACTIONS_COMMITTED:
						case TRANSACTIONS_ROLLED_BACK:
						case TRANSACTION_ACTIVE:
						case TRANSFORM:
						case TRANSFORMS:
						case TRANSLATE:
						case TRANSLATION:
						case TREAT:
						case TRIGGER:
						case TRIGGER_CATALOG:
						case TRIGGER_NAME:
						case TRIGGER_SCHEMA:
						case TRIM:
						case TRUNCATE:
						case TRUSTED:
						case TYPE:
						case UESCAPE:
						case UNBOUNDED:
						case UNCOMMITTED:
						case UNDER:
						case UNENCRYPTED:
						case UNKNOWN:
						case UNLISTEN:
						case UNNAMED:
						case UNNEST:
						case UNTIL:
						case UPDATE:
						case UPPER:
						case USAGE:
						case USER_DEFINED_TYPE_CATALOG:
						case USER_DEFINED_TYPE_CODE:
						case USER_DEFINED_TYPE_NAME:
						case USER_DEFINED_TYPE_SCHEMA:
						case VACUUM:
						case VALID:
						case VALIDATOR:
						case VALUE:
						case VALUES:
						case VARCHAR:
						case VARYING:
						case VAR_POP:
						case VAR_SAMP:
						case VIEW:
						case VOLATILE:
						case WHENEVER:
						case WIDTH_BUCKET:
						case WITHIN:
						case WITHOUT:
						case WORK:
						case WRITE:
						case YEAR:
						case ZONE:
						case IDENTIFIER:
							{
							setState(2425);
							identifier(0);
							}
							break;
						case STAR:
							{
							setState(2426);
							match(STAR);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					}
					} 
				}
				setState(2433);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,223,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Bool_exprContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(PostgreSQLParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(PostgreSQLParser.FALSE, 0); }
		public TerminalNode NOT() { return getToken(PostgreSQLParser.NOT, 0); }
		public List<Bool_exprContext> bool_expr() {
			return getRuleContexts(Bool_exprContext.class);
		}
		public Bool_exprContext bool_expr(int i) {
			return getRuleContext(Bool_exprContext.class,i);
		}
		public TerminalNode AND() { return getToken(PostgreSQLParser.AND, 0); }
		public TerminalNode OR() { return getToken(PostgreSQLParser.OR, 0); }
		public Bool_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterBool_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitBool_expr(this);
		}
	}

	public final Bool_exprContext bool_expr() throws RecognitionException {
		return bool_expr(0);
	}

	private Bool_exprContext bool_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Bool_exprContext _localctx = new Bool_exprContext(_ctx, _parentState);
		Bool_exprContext _prevctx = _localctx;
		int _startState = 402;
		enterRecursionRule(_localctx, 402, RULE_bool_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2439);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				{
				setState(2435);
				match(TRUE);
				}
				break;
			case FALSE:
				{
				setState(2436);
				match(FALSE);
				}
				break;
			case NOT:
				{
				setState(2437);
				match(NOT);
				setState(2438);
				bool_expr(3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(2449);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,226,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2447);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,225,_ctx) ) {
					case 1:
						{
						_localctx = new Bool_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bool_expr);
						setState(2441);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2442);
						match(AND);
						setState(2443);
						bool_expr(3);
						}
						break;
					case 2:
						{
						_localctx = new Bool_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bool_expr);
						setState(2444);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2445);
						match(OR);
						setState(2446);
						bool_expr(2);
						}
						break;
					}
					} 
				}
				setState(2451);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,226,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Expr_listContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(PostgreSQLParser.OPEN_PAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(PostgreSQLParser.CLOSE_PAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(PostgreSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PostgreSQLParser.COMMA, i);
		}
		public Expr_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterExpr_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitExpr_list(this);
		}
	}

	public final Expr_listContext expr_list() throws RecognitionException {
		Expr_listContext _localctx = new Expr_listContext(_ctx, getState());
		enterRule(_localctx, 404, RULE_expr_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2452);
			match(OPEN_PAREN);
			setState(2453);
			expr(0);
			setState(2458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2454);
				match(COMMA);
				setState(2455);
				expr(0);
				}
				}
				setState(2460);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2461);
			match(CLOSE_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_list_listContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(PostgreSQLParser.OPEN_PAREN, 0); }
		public List<Expr_listContext> expr_list() {
			return getRuleContexts(Expr_listContext.class);
		}
		public Expr_listContext expr_list(int i) {
			return getRuleContext(Expr_listContext.class,i);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(PostgreSQLParser.CLOSE_PAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(PostgreSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PostgreSQLParser.COMMA, i);
		}
		public Expr_list_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_list_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterExpr_list_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitExpr_list_list(this);
		}
	}

	public final Expr_list_listContext expr_list_list() throws RecognitionException {
		Expr_list_listContext _localctx = new Expr_list_listContext(_ctx, getState());
		enterRule(_localctx, 406, RULE_expr_list_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2463);
			match(OPEN_PAREN);
			setState(2464);
			expr_list();
			setState(2469);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2465);
				match(COMMA);
				setState(2466);
				expr_list();
				}
				}
				setState(2471);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2472);
			match(CLOSE_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_literalContext extends ParserRuleContext {
		public TerminalNode ABSTIME() { return getToken(PostgreSQLParser.ABSTIME, 0); }
		public TerminalNode BOOL() { return getToken(PostgreSQLParser.BOOL, 0); }
		public TerminalNode BOX() { return getToken(PostgreSQLParser.BOX, 0); }
		public TerminalNode DATE() { return getToken(PostgreSQLParser.DATE, 0); }
		public TerminalNode FLOAT4() { return getToken(PostgreSQLParser.FLOAT4, 0); }
		public TerminalNode FLOAT8() { return getToken(PostgreSQLParser.FLOAT8, 0); }
		public TerminalNode INTERVAL() { return getToken(PostgreSQLParser.INTERVAL, 0); }
		public TerminalNode JSON() { return getToken(PostgreSQLParser.JSON, 0); }
		public TerminalNode JSONB() { return getToken(PostgreSQLParser.JSONB, 0); }
		public TerminalNode LINE() { return getToken(PostgreSQLParser.LINE, 0); }
		public TerminalNode POINT() { return getToken(PostgreSQLParser.POINT, 0); }
		public TerminalNode NAME() { return getToken(PostgreSQLParser.NAME, 0); }
		public TerminalNode TEXT() { return getToken(PostgreSQLParser.TEXT, 0); }
		public TerminalNode TIMESTAMP() { return getToken(PostgreSQLParser.TIMESTAMP, 0); }
		public List<TerminalNode> TIME() { return getTokens(PostgreSQLParser.TIME); }
		public TerminalNode TIME(int i) {
			return getToken(PostgreSQLParser.TIME, i);
		}
		public TerminalNode ZONE() { return getToken(PostgreSQLParser.ZONE, 0); }
		public TerminalNode WITH() { return getToken(PostgreSQLParser.WITH, 0); }
		public TerminalNode AT() { return getToken(PostgreSQLParser.AT, 0); }
		public TerminalNode WITHOUT() { return getToken(PostgreSQLParser.WITHOUT, 0); }
		public TerminalNode TIMESTAMP_TZ() { return getToken(PostgreSQLParser.TIMESTAMP_TZ, 0); }
		public TerminalNode TIME_TZ() { return getToken(PostgreSQLParser.TIME_TZ, 0); }
		public TerminalNode INT2() { return getToken(PostgreSQLParser.INT2, 0); }
		public TerminalNode INT4() { return getToken(PostgreSQLParser.INT4, 0); }
		public TerminalNode INT8() { return getToken(PostgreSQLParser.INT8, 0); }
		public TerminalNode RELTIME() { return getToken(PostgreSQLParser.RELTIME, 0); }
		public Type_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterType_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitType_literal(this);
		}
	}

	public final Type_literalContext type_literal() throws RecognitionException {
		Type_literalContext _localctx = new Type_literalContext(_ctx, getState());
		enterRule(_localctx, 408, RULE_type_literal);
		int _la;
		try {
			setState(2518);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,233,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2474);
				match(ABSTIME);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2475);
				match(BOOL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2476);
				match(BOX);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2477);
				match(DATE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2478);
				match(FLOAT4);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2479);
				match(FLOAT8);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2480);
				match(INTERVAL);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2481);
				match(JSON);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2482);
				match(JSONB);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(2483);
				match(LINE);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(2484);
				match(POINT);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(2485);
				match(NAME);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(2486);
				match(TEXT);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(2487);
				match(TIMESTAMP);
				setState(2491);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,229,_ctx) ) {
				case 1:
					{
					setState(2488);
					_la = _input.LA(1);
					if ( !(_la==AT || _la==WITH) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(2489);
					match(TIME);
					setState(2490);
					match(ZONE);
					}
					break;
				}
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(2493);
				match(TIMESTAMP);
				setState(2497);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
				case 1:
					{
					setState(2494);
					match(WITHOUT);
					setState(2495);
					match(TIME);
					setState(2496);
					match(ZONE);
					}
					break;
				}
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(2499);
				match(TIMESTAMP_TZ);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(2500);
				match(TIME);
				setState(2504);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,231,_ctx) ) {
				case 1:
					{
					setState(2501);
					match(WITH);
					setState(2502);
					match(TIME);
					setState(2503);
					match(ZONE);
					}
					break;
				}
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(2506);
				match(TIME);
				setState(2510);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
				case 1:
					{
					setState(2507);
					match(WITHOUT);
					setState(2508);
					match(TIME);
					setState(2509);
					match(ZONE);
					}
					break;
				}
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(2512);
				match(TIME_TZ);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(2513);
				match(INT2);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(2514);
				match(INT4);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(2515);
				match(INT8);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(2516);
				match(INTERVAL);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(2517);
				match(RELTIME);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperContext extends ParserRuleContext {
		public TerminalNode IS() { return getToken(PostgreSQLParser.IS, 0); }
		public TerminalNode OF() { return getToken(PostgreSQLParser.OF, 0); }
		public TerminalNode DATE() { return getToken(PostgreSQLParser.DATE, 0); }
		public TerminalNode INTERVAL() { return getToken(PostgreSQLParser.INTERVAL, 0); }
		public TerminalNode DOUBLE() { return getToken(PostgreSQLParser.DOUBLE, 0); }
		public TerminalNode PRECISION() { return getToken(PostgreSQLParser.PRECISION, 0); }
		public TerminalNode IN() { return getToken(PostgreSQLParser.IN, 0); }
		public TerminalNode ALL() { return getToken(PostgreSQLParser.ALL, 0); }
		public OperContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oper; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterOper(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitOper(this);
		}
	}

	public final OperContext oper() throws RecognitionException {
		OperContext _localctx = new OperContext(_ctx, getState());
		enterRule(_localctx, 410, RULE_oper);
		try {
			setState(2529);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2521);
				match(IS);
				setState(2522);
				match(OF);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2523);
				match(DATE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2524);
				match(INTERVAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2525);
				match(DOUBLE);
				setState(2526);
				match(PRECISION);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2527);
				match(IN);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2528);
				match(ALL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AggregateContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> OPEN_PAREN() { return getTokens(PostgreSQLParser.OPEN_PAREN); }
		public TerminalNode OPEN_PAREN(int i) {
			return getToken(PostgreSQLParser.OPEN_PAREN, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> CLOSE_PAREN() { return getTokens(PostgreSQLParser.CLOSE_PAREN); }
		public TerminalNode CLOSE_PAREN(int i) {
			return getToken(PostgreSQLParser.CLOSE_PAREN, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PostgreSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PostgreSQLParser.COMMA, i);
		}
		public Order_by_clauseContext order_by_clause() {
			return getRuleContext(Order_by_clauseContext.class,0);
		}
		public TerminalNode FILTER() { return getToken(PostgreSQLParser.FILTER, 0); }
		public TerminalNode WHERE() { return getToken(PostgreSQLParser.WHERE, 0); }
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public TerminalNode ALL() { return getToken(PostgreSQLParser.ALL, 0); }
		public TerminalNode DISTINCT() { return getToken(PostgreSQLParser.DISTINCT, 0); }
		public TerminalNode STAR() { return getToken(PostgreSQLParser.STAR, 0); }
		public TerminalNode WITHIN() { return getToken(PostgreSQLParser.WITHIN, 0); }
		public TerminalNode GROUP() { return getToken(PostgreSQLParser.GROUP, 0); }
		public AggregateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterAggregate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitAggregate(this);
		}
	}

	public final AggregateContext aggregate() throws RecognitionException {
		AggregateContext _localctx = new AggregateContext(_ctx, getState());
		enterRule(_localctx, 412, RULE_aggregate);
		int _la;
		try {
			setState(2594);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,243,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2531);
				identifier(0);
				setState(2532);
				match(OPEN_PAREN);
				setState(2534);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,235,_ctx) ) {
				case 1:
					{
					setState(2533);
					_la = _input.LA(1);
					if ( !(_la==ALL || _la==DISTINCT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(2536);
				expr(0);
				setState(2541);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2537);
					match(COMMA);
					setState(2538);
					expr(0);
					}
					}
					setState(2543);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2545);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ORDER) {
					{
					setState(2544);
					order_by_clause();
					}
				}

				setState(2547);
				match(CLOSE_PAREN);
				setState(2554);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,238,_ctx) ) {
				case 1:
					{
					setState(2548);
					match(FILTER);
					setState(2549);
					match(OPEN_PAREN);
					setState(2550);
					match(WHERE);
					setState(2551);
					where_clause();
					setState(2552);
					match(CLOSE_PAREN);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2556);
				identifier(0);
				setState(2557);
				match(OPEN_PAREN);
				setState(2558);
				match(STAR);
				setState(2559);
				match(CLOSE_PAREN);
				setState(2566);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,239,_ctx) ) {
				case 1:
					{
					setState(2560);
					match(FILTER);
					setState(2561);
					match(OPEN_PAREN);
					setState(2562);
					match(WHERE);
					setState(2563);
					where_clause();
					setState(2564);
					match(CLOSE_PAREN);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2568);
				identifier(0);
				setState(2569);
				match(OPEN_PAREN);
				setState(2578);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHITESPACE) | (1L << A_) | (1L << ABORT) | (1L << ABS) | (1L << ABSOLUTE) | (1L << ACCESS) | (1L << ACTION) | (1L << ADA) | (1L << ADD) | (1L << ADMIN) | (1L << AFTER) | (1L << AGGREGATE) | (1L << ALL) | (1L << ALLOCATE) | (1L << ALSO) | (1L << ALTER) | (1L << ALWAYS) | (1L << ARE) | (1L << ARRAY) | (1L << ASENSITIVE) | (1L << ASSERTION) | (1L << ASSIGNMENT) | (1L << AT) | (1L << ATOMIC) | (1L << ATTRIBUTE) | (1L << ATTRIBUTES) | (1L << AVG) | (1L << BACKWARD) | (1L << BEFORE) | (1L << BEGIN) | (1L << BERNOULLI) | (1L << BETWEEN) | (1L << BIGINT) | (1L << BIT) | (1L << BIT_LENGTH) | (1L << BLOB) | (1L << BOOLEAN) | (1L << BREADTH) | (1L << BY) | (1L << C_) | (1L << CACHE) | (1L << CALL) | (1L << CALLED) | (1L << CARDINALITY) | (1L << CASCADE) | (1L << CASCADED) | (1L << CASE) | (1L << CAST) | (1L << CATALOG))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CATALOG_NAME - 64)) | (1L << (CEIL - 64)) | (1L << (CEILING - 64)) | (1L << (CHAIN - 64)) | (1L << (CHAR - 64)) | (1L << (CHARACTER - 64)) | (1L << (CHARACTERISTICS - 64)) | (1L << (CHARACTERS - 64)) | (1L << (CHARACTER_LENGTH - 64)) | (1L << (CHARACTER_SET_CATALOG - 64)) | (1L << (CHARACTER_SET_NAME - 64)) | (1L << (CHARACTER_SET_SCHEMA - 64)) | (1L << (CHAR_LENGTH - 64)) | (1L << (CHECKPOINT - 64)) | (1L << (CLASS - 64)) | (1L << (CLASS_ORIGIN - 64)) | (1L << (CLOB - 64)) | (1L << (CLOSE - 64)) | (1L << (CLUSTER - 64)) | (1L << (COALESCE - 64)) | (1L << (COBOL - 64)) | (1L << (COLLATION_CATALOG - 64)) | (1L << (COLLATION_NAME - 64)) | (1L << (COLLATION_SCHEMA - 64)) | (1L << (COLLECT - 64)) | (1L << (COLUMN_NAME - 64)) | (1L << (COMMAND_FUNCTION - 64)) | (1L << (COMMAND_FUNCTION_CODE - 64)) | (1L << (COMMENT - 64)) | (1L << (COMMIT - 64)) | (1L << (COMMITTED - 64)) | (1L << (CONDITION - 64)) | (1L << (CONDITION_NUMBER - 64)) | (1L << (CONNECT - 64)) | (1L << (CONNECTION - 64)) | (1L << (CONNECTION_NAME - 64)) | (1L << (CONSTRAINTS - 64)) | (1L << (CONSTRAINT_CATALOG - 64)) | (1L << (CONSTRAINT_NAME - 64)) | (1L << (CONSTRAINT_SCHEMA - 64)) | (1L << (CONSTRUCTOR - 64)) | (1L << (CONTAINS - 64)) | (1L << (CONTINUE - 64)) | (1L << (CONVERSION - 64)) | (1L << (CONVERT - 64)) | (1L << (COPY - 64)) | (1L << (CORR - 64)) | (1L << (CORRESPONDING - 64)) | (1L << (COUNT - 64)) | (1L << (COVAR_POP - 64)) | (1L << (COVAR_SAMP - 64)) | (1L << (CSV - 64)) | (1L << (CUBE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (CUME_DIST - 128)) | (1L << (CURRENT - 128)) | (1L << (CURRENT_DATE - 128)) | (1L << (CURRENT_DEFAULT_TRANSFORM_GROUP - 128)) | (1L << (CURRENT_PATH - 128)) | (1L << (CURRENT_ROLE - 128)) | (1L << (CURRENT_TIME - 128)) | (1L << (CURRENT_TIMESTAMP - 128)) | (1L << (CURRENT_TRANSFORM_GROUP_FOR_TYPE - 128)) | (1L << (CURRENT_USER - 128)) | (1L << (CURSOR - 128)) | (1L << (CURSOR_NAME - 128)) | (1L << (CYCLE - 128)) | (1L << (DATA - 128)) | (1L << (DATABASE - 128)) | (1L << (DATE - 128)) | (1L << (DATETIME_INTERVAL_CODE - 128)) | (1L << (DATETIME_INTERVAL_PRECISION - 128)) | (1L << (DAY - 128)) | (1L << (DEALLOCATE - 128)) | (1L << (DEC - 128)) | (1L << (DECIMAL - 128)) | (1L << (DECLARE - 128)) | (1L << (DEFAULTS - 128)) | (1L << (DEFERRED - 128)) | (1L << (DEFINED - 128)) | (1L << (DEFINER - 128)) | (1L << (DEGREE - 128)) | (1L << (DELETE - 128)) | (1L << (DELIMITER - 128)) | (1L << (DELIMITERS - 128)) | (1L << (DENSE_RANK - 128)) | (1L << (DEPTH - 128)) | (1L << (DEREF - 128)) | (1L << (DERIVED - 128)) | (1L << (DESCRIBE - 128)) | (1L << (DESCRIPTOR - 128)) | (1L << (DETERMINISTIC - 128)) | (1L << (DIAGNOSTICS - 128)) | (1L << (DICTIONARY - 128)) | (1L << (DISCONNECT - 128)) | (1L << (DISPATCH - 128)) | (1L << (DOMAIN - 128)) | (1L << (DOUBLE - 128)) | (1L << (DROP - 128)) | (1L << (DYNAMIC - 128)) | (1L << (DYNAMIC_FUNCTION - 128)) | (1L << (DYNAMIC_FUNCTION_CODE - 128)) | (1L << (EACH - 128)) | (1L << (ELEMENT - 128)) | (1L << (ENCODING - 128)) | (1L << (ENCRYPTED - 128)) | (1L << (END - 128)) | (1L << (EQUALS - 128)) | (1L << (ESCAPE - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (EVERY - 192)) | (1L << (EXCEPTION - 192)) | (1L << (EXCLUDE - 192)) | (1L << (EXCLUDING - 192)) | (1L << (EXCLUSIVE - 192)) | (1L << (EXEC - 192)) | (1L << (EXECUTE - 192)) | (1L << (EXISTS - 192)) | (1L << (EXP - 192)) | (1L << (EXPLAIN - 192)) | (1L << (EXTERNAL - 192)) | (1L << (EXTRACT - 192)) | (1L << (FALSE - 192)) | (1L << (FILTER - 192)) | (1L << (FINAL - 192)) | (1L << (FIRST - 192)) | (1L << (FLOAT - 192)) | (1L << (FLOOR - 192)) | (1L << (FOLLOWING - 192)) | (1L << (FORCE - 192)) | (1L << (FORTRAN - 192)) | (1L << (FORWARD - 192)) | (1L << (FOUND - 192)) | (1L << (FREE - 192)) | (1L << (FUNCTION - 192)) | (1L << (FUSION - 192)) | (1L << (G_ - 192)) | (1L << (GENERAL - 192)) | (1L << (GENERATED - 192)) | (1L << (GET - 192)) | (1L << (GLOBAL - 192)) | (1L << (GO - 192)) | (1L << (GOTO - 192)) | (1L << (GRANTED - 192)) | (1L << (GROUPING - 192)) | (1L << (HANDLER - 192)) | (1L << (HIERARCHY - 192)) | (1L << (HOLD - 192)) | (1L << (HOUR - 192)) | (1L << (IDENTITY - 192)) | (1L << (IGNORE - 192)) | (1L << (IMMEDIATE - 192)) | (1L << (IMMUTABLE - 192)) | (1L << (IMPLEMENTATION - 192)) | (1L << (IMPLICIT - 192)) | (1L << (INCLUDING - 192)) | (1L << (INCREMENT - 192)) | (1L << (INDEX - 192)) | (1L << (INDICATOR - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (INHERITS - 256)) | (1L << (INOUT - 256)) | (1L << (INPUT - 256)) | (1L << (INSENSITIVE - 256)) | (1L << (INSERT - 256)) | (1L << (INSTANCE - 256)) | (1L << (INSTANTIABLE - 256)) | (1L << (INSTEAD - 256)) | (1L << (INT - 256)) | (1L << (INTEGER - 256)) | (1L << (INTERSECTION - 256)) | (1L << (INTERVAL - 256)) | (1L << (INVOKER - 256)) | (1L << (ISOLATION - 256)) | (1L << (KEY - 256)) | (1L << (KEY_MEMBER - 256)) | (1L << (KEY_TYPE - 256)) | (1L << (LANGUAGE - 256)) | (1L << (LARGE - 256)) | (1L << (LAST - 256)) | (1L << (LEFT - 256)) | (1L << (LENGTH - 256)) | (1L << (LEVEL - 256)) | (1L << (LISTEN - 256)) | (1L << (LN - 256)) | (1L << (LOAD - 256)) | (1L << (LOCAL - 256)) | (1L << (LOCATION - 256)) | (1L << (LOCATOR - 256)) | (1L << (LOCK - 256)) | (1L << (LOCKED - 256)) | (1L << (LOWER - 256)) | (1L << (M_ - 256)) | (1L << (MAP - 256)) | (1L << (MATCH - 256)) | (1L << (MATCHED - 256)) | (1L << (MAX - 256)) | (1L << (MAXVALUE - 256)) | (1L << (MEMBER - 256)) | (1L << (MERGE - 256)) | (1L << (MESSAGE_LENGTH - 256)) | (1L << (MESSAGE_OCTET_LENGTH - 256)) | (1L << (MESSAGE_TEXT - 256)) | (1L << (METHOD - 256)) | (1L << (MIN - 256)) | (1L << (MINUTE - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (MINVALUE - 320)) | (1L << (MOD - 320)) | (1L << (MODE - 320)) | (1L << (MODIFIES - 320)) | (1L << (MODULE - 320)) | (1L << (MONTH - 320)) | (1L << (MORE_ - 320)) | (1L << (MOVE - 320)) | (1L << (MULTISET - 320)) | (1L << (MUMPS - 320)) | (1L << (NAME - 320)) | (1L << (NAMES - 320)) | (1L << (NATIONAL - 320)) | (1L << (NCHAR - 320)) | (1L << (NCLOB - 320)) | (1L << (NESTING - 320)) | (1L << (NEW - 320)) | (1L << (NEXT - 320)) | (1L << (NO - 320)) | (1L << (NONE - 320)) | (1L << (NORMALIZE - 320)) | (1L << (NORMALIZED - 320)) | (1L << (NOT - 320)) | (1L << (NOTHING - 320)) | (1L << (NOTIFY - 320)) | (1L << (NOWAIT - 320)) | (1L << (NULL - 320)) | (1L << (NULLABLE - 320)) | (1L << (NULLIF - 320)) | (1L << (NULLS - 320)) | (1L << (NUMBER - 320)) | (1L << (NUMERIC - 320)) | (1L << (OBJECT - 320)) | (1L << (OCTETS - 320)) | (1L << (OCTET_LENGTH - 320)) | (1L << (OF - 320)) | (1L << (OFF - 320)) | (1L << (OIDS - 320)) | (1L << (OLD - 320)) | (1L << (OPEN - 320)) | (1L << (OPERATOR - 320)) | (1L << (OPTION - 320)) | (1L << (OPTIONS - 320)) | (1L << (ORDERING - 320)) | (1L << (ORDINALITY - 320)) | (1L << (OTHERS - 320)) | (1L << (OUT - 320)) | (1L << (OUTPUT - 320)) | (1L << (OVER - 320)) | (1L << (OVERLAY - 320)) | (1L << (OVERRIDING - 320)))) != 0) || ((((_la - 384)) & ~0x3f) == 0 && ((1L << (_la - 384)) & ((1L << (OWNER - 384)) | (1L << (PAD - 384)) | (1L << (PARAMETER - 384)) | (1L << (PARAMETER_MODE - 384)) | (1L << (PARAMETER_NAME - 384)) | (1L << (PARAMETER_ORDINAL_POSITION - 384)) | (1L << (PARAMETER_SPECIFIC_CATALOG - 384)) | (1L << (PARAMETER_SPECIFIC_NAME - 384)) | (1L << (PARAMETER_SPECIFIC_SCHEMA - 384)) | (1L << (PARTIAL - 384)) | (1L << (PARTITION - 384)) | (1L << (PASCAL - 384)) | (1L << (PASSWORD - 384)) | (1L << (PATH - 384)) | (1L << (PERCENTILE_CONT - 384)) | (1L << (PERCENTILE_DISC - 384)) | (1L << (PERCENT_RANK - 384)) | (1L << (PLI - 384)) | (1L << (POSITION - 384)) | (1L << (POWER - 384)) | (1L << (PRECEDING - 384)) | (1L << (PRECISION - 384)) | (1L << (PREPARE - 384)) | (1L << (PRESERVE - 384)) | (1L << (PRIOR - 384)) | (1L << (PRIVILEGES - 384)) | (1L << (PROCEDURAL - 384)) | (1L << (PROCEDURE - 384)) | (1L << (PUBLIC - 384)) | (1L << (QUOTE - 384)) | (1L << (RANGE - 384)) | (1L << (RANK - 384)) | (1L << (READ - 384)) | (1L << (READS - 384)) | (1L << (REAL - 384)) | (1L << (RECHECK - 384)) | (1L << (RECURSIVE - 384)) | (1L << (REF - 384)) | (1L << (REFERENCING - 384)) | (1L << (REGR_AVGX - 384)) | (1L << (REGR_AVGY - 384)) | (1L << (REGR_COUNT - 384)) | (1L << (REGR_INTERCEPT - 384)) | (1L << (REGR_SLOPE - 384)) | (1L << (REGR_SXX - 384)) | (1L << (REGR_SXY - 384)) | (1L << (REGR_SYY - 384)) | (1L << (REINDEX - 384)) | (1L << (RELATIVE - 384)) | (1L << (RELEASE - 384)) | (1L << (RENAME - 384)) | (1L << (REPEATABLE - 384)) | (1L << (REPLACE - 384)) | (1L << (RESET - 384)) | (1L << (RESTART - 384)) | (1L << (RESTRICT - 384)))) != 0) || ((((_la - 448)) & ~0x3f) == 0 && ((1L << (_la - 448)) & ((1L << (RESULT - 448)) | (1L << (RETURN - 448)) | (1L << (RETURNED_CARDINALITY - 448)) | (1L << (RETURNED_LENGTH - 448)) | (1L << (RETURNED_OCTET_LENGTH - 448)) | (1L << (RETURNED_SQLSTATE - 448)) | (1L << (RETURNS - 448)) | (1L << (REVOKE - 448)) | (1L << (RIGHT - 448)) | (1L << (ROLE - 448)) | (1L << (ROLLBACK - 448)) | (1L << (ROLLUP - 448)) | (1L << (ROUTINE - 448)) | (1L << (ROUTINE_CATALOG - 448)) | (1L << (ROUTINE_NAME - 448)) | (1L << (ROUTINE_SCHEMA - 448)) | (1L << (ROW - 448)) | (1L << (ROWS - 448)) | (1L << (ROW_COUNT - 448)) | (1L << (ROW_NUMBER - 448)) | (1L << (RULE - 448)) | (1L << (SAVEPOINT - 448)) | (1L << (SCALE - 448)) | (1L << (SCHEMA - 448)) | (1L << (SCHEMA_NAME - 448)) | (1L << (SCOPE - 448)) | (1L << (SCOPE_CATALOG - 448)) | (1L << (SCOPE_NAME - 448)) | (1L << (SCOPE_SCHEMA - 448)) | (1L << (SCROLL - 448)) | (1L << (SEARCH - 448)) | (1L << (SECOND - 448)) | (1L << (SECTION - 448)) | (1L << (SECURITY - 448)) | (1L << (SELF - 448)) | (1L << (SENSITIVE - 448)) | (1L << (SEQUENCE - 448)) | (1L << (SERIALIZABLE - 448)) | (1L << (SERVER_NAME - 448)) | (1L << (SESSION - 448)) | (1L << (SET - 448)) | (1L << (SETOF - 448)) | (1L << (SETS - 448)) | (1L << (SHARE - 448)) | (1L << (SHOW - 448)) | (1L << (SIMPLE - 448)) | (1L << (SIZE - 448)) | (1L << (SMALLINT - 448)) | (1L << (SOURCE - 448)) | (1L << (SPACE - 448)) | (1L << (SPECIFIC - 448)) | (1L << (SPECIFICTYPE - 448)) | (1L << (SPECIFIC_NAME - 448)) | (1L << (SQL - 448)) | (1L << (SQLCODE - 448)) | (1L << (SQLERROR - 448)) | (1L << (SQLEXCEPTION - 448)) | (1L << (SQLSTATE - 448)) | (1L << (SQLWARNING - 448)))) != 0) || ((((_la - 512)) & ~0x3f) == 0 && ((1L << (_la - 512)) & ((1L << (SQRT - 512)) | (1L << (STABLE - 512)) | (1L << (START - 512)) | (1L << (STATE - 512)) | (1L << (STATEMENT - 512)) | (1L << (STATIC - 512)) | (1L << (STATISTICS - 512)) | (1L << (STDDEV_POP - 512)) | (1L << (STDDEV_SAMP - 512)) | (1L << (STDIN - 512)) | (1L << (STDOUT - 512)) | (1L << (STORAGE - 512)) | (1L << (STRICT - 512)) | (1L << (STRUCTURE - 512)) | (1L << (STYLE - 512)) | (1L << (SUBCLASS_ORIGIN - 512)) | (1L << (SUBMULTISET - 512)) | (1L << (SUBSTRING - 512)) | (1L << (SUM - 512)) | (1L << (SYSID - 512)) | (1L << (SYSTEM - 512)) | (1L << (SYSTEM_USER - 512)) | (1L << (TABLESPACE - 512)) | (1L << (TABLE_NAME - 512)) | (1L << (TEMP - 512)) | (1L << (TEMPLATE - 512)) | (1L << (TEMPORARY - 512)) | (1L << (TIES - 512)) | (1L << (TIME - 512)) | (1L << (TIME_TZ - 512)) | (1L << (TIMESTAMP - 512)) | (1L << (TIMESTAMP_TZ - 512)) | (1L << (TIMEZONE_HOUR - 512)) | (1L << (TIMEZONE_MINUTE - 512)) | (1L << (TOP_LEVEL_COUNT - 512)) | (1L << (TRANSACTION - 512)) | (1L << (TRANSACTIONS_COMMITTED - 512)) | (1L << (TRANSACTIONS_ROLLED_BACK - 512)) | (1L << (TRANSACTION_ACTIVE - 512)) | (1L << (TRANSFORM - 512)) | (1L << (TRANSFORMS - 512)) | (1L << (TRANSLATE - 512)) | (1L << (TRANSLATION - 512)) | (1L << (TREAT - 512)) | (1L << (TRIGGER - 512)) | (1L << (TRIGGER_CATALOG - 512)) | (1L << (TRIGGER_NAME - 512)) | (1L << (TRIGGER_SCHEMA - 512)) | (1L << (TRIM - 512)) | (1L << (TRUE - 512)) | (1L << (TRUNCATE - 512)) | (1L << (TRUSTED - 512)) | (1L << (TYPE - 512)) | (1L << (UESCAPE - 512)))) != 0) || ((((_la - 576)) & ~0x3f) == 0 && ((1L << (_la - 576)) & ((1L << (UNBOUNDED - 576)) | (1L << (UNCOMMITTED - 576)) | (1L << (UNDER - 576)) | (1L << (UNENCRYPTED - 576)) | (1L << (UNKNOWN - 576)) | (1L << (UNLISTEN - 576)) | (1L << (UNNAMED - 576)) | (1L << (UNNEST - 576)) | (1L << (UNTIL - 576)) | (1L << (UPDATE - 576)) | (1L << (UPPER - 576)) | (1L << (USAGE - 576)) | (1L << (USER_DEFINED_TYPE_CATALOG - 576)) | (1L << (USER_DEFINED_TYPE_CODE - 576)) | (1L << (USER_DEFINED_TYPE_NAME - 576)) | (1L << (USER_DEFINED_TYPE_SCHEMA - 576)) | (1L << (VACUUM - 576)) | (1L << (VALID - 576)) | (1L << (VALIDATOR - 576)) | (1L << (VALUE - 576)) | (1L << (VALUES - 576)) | (1L << (VARCHAR - 576)) | (1L << (VARYING - 576)) | (1L << (VAR_POP - 576)) | (1L << (VAR_SAMP - 576)) | (1L << (VIEW - 576)) | (1L << (VOLATILE - 576)) | (1L << (WHENEVER - 576)) | (1L << (WIDTH_BUCKET - 576)) | (1L << (WITHIN - 576)) | (1L << (WITHOUT - 576)) | (1L << (WORK - 576)) | (1L << (WRITE - 576)) | (1L << (YEAR - 576)) | (1L << (ZONE - 576)))) != 0) || ((((_la - 686)) & ~0x3f) == 0 && ((1L << (_la - 686)) & ((1L << (ABSTIME - 686)) | (1L << (BOOL - 686)) | (1L << (BOX - 686)) | (1L << (FLOAT4 - 686)) | (1L << (FLOAT8 - 686)) | (1L << (INT2 - 686)) | (1L << (INT4 - 686)) | (1L << (INT8 - 686)) | (1L << (JSON - 686)) | (1L << (JSONB - 686)) | (1L << (LINE - 686)) | (1L << (POINT - 686)) | (1L << (RELTIME - 686)) | (1L << (TEXT - 686)) | (1L << (DOLLAR - 686)) | (1L << (DOLLAR_DOLLAR - 686)) | (1L << (OPEN_PAREN - 686)) | (1L << (BIT_STRING - 686)) | (1L << (REGEX_STRING - 686)) | (1L << (NUMERIC_LITERAL - 686)) | (1L << (INTEGER_LITERAL - 686)) | (1L << (HEX_INTEGER_LITERAL - 686)) | (1L << (SINGLEQ_STRING_LITERAL - 686)) | (1L << (DOUBLEQ_STRING_LITERAL - 686)) | (1L << (IDENTIFIER - 686)) | (1L << (AT_SIGN - 686)) | (1L << (BANG_BANG - 686)))) != 0) || ((((_la - 751)) & ~0x3f) == 0 && ((1L << (_la - 751)) & ((1L << (MINUS - 751)) | (1L << (PLUS - 751)) | (1L << (QMARK_HYPHEN - 751)) | (1L << (TIL - 751)))) != 0)) {
					{
					setState(2570);
					expr(0);
					setState(2575);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(2571);
						match(COMMA);
						setState(2572);
						expr(0);
						}
						}
						setState(2577);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2580);
				match(CLOSE_PAREN);
				setState(2581);
				match(WITHIN);
				setState(2582);
				match(GROUP);
				setState(2583);
				match(OPEN_PAREN);
				setState(2584);
				order_by_clause();
				setState(2585);
				match(CLOSE_PAREN);
				setState(2592);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
				case 1:
					{
					setState(2586);
					match(FILTER);
					setState(2587);
					match(OPEN_PAREN);
					setState(2588);
					match(WHERE);
					setState(2589);
					where_clause();
					setState(2590);
					match(CLOSE_PAREN);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameContext extends ParserRuleContext {
		public TerminalNode SINGLEQ_STRING_LITERAL() { return getToken(PostgreSQLParser.SINGLEQ_STRING_LITERAL, 0); }
		public TerminalNode DOUBLEQ_STRING_LITERAL() { return getToken(PostgreSQLParser.DOUBLEQ_STRING_LITERAL, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitName(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 414, RULE_name);
		try {
			setState(2599);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SINGLEQ_STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(2596);
				match(SINGLEQ_STRING_LITERAL);
				}
				break;
			case DOUBLEQ_STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(2597);
				match(DOUBLEQ_STRING_LITERAL);
				}
				break;
			case WHITESPACE:
			case A_:
			case ABORT:
			case ABS:
			case ABSOLUTE:
			case ACCESS:
			case ACTION:
			case ADA:
			case ADD:
			case ADMIN:
			case AFTER:
			case AGGREGATE:
			case ALLOCATE:
			case ALSO:
			case ALTER:
			case ALWAYS:
			case ARE:
			case ASENSITIVE:
			case ASSERTION:
			case ASSIGNMENT:
			case AT:
			case ATOMIC:
			case ATTRIBUTE:
			case ATTRIBUTES:
			case AVG:
			case BACKWARD:
			case BEFORE:
			case BEGIN:
			case BERNOULLI:
			case BETWEEN:
			case BIGINT:
			case BIT:
			case BIT_LENGTH:
			case BLOB:
			case BOOLEAN:
			case BREADTH:
			case BY:
			case C_:
			case CACHE:
			case CALL:
			case CALLED:
			case CARDINALITY:
			case CASCADE:
			case CASCADED:
			case CATALOG:
			case CATALOG_NAME:
			case CEIL:
			case CEILING:
			case CHAIN:
			case CHAR:
			case CHARACTER:
			case CHARACTERISTICS:
			case CHARACTERS:
			case CHARACTER_LENGTH:
			case CHARACTER_SET_CATALOG:
			case CHARACTER_SET_NAME:
			case CHARACTER_SET_SCHEMA:
			case CHAR_LENGTH:
			case CHECKPOINT:
			case CLASS:
			case CLASS_ORIGIN:
			case CLOB:
			case CLOSE:
			case CLUSTER:
			case COALESCE:
			case COBOL:
			case COLLATION_CATALOG:
			case COLLATION_NAME:
			case COLLATION_SCHEMA:
			case COLLECT:
			case COLUMN_NAME:
			case COMMAND_FUNCTION:
			case COMMAND_FUNCTION_CODE:
			case COMMENT:
			case COMMIT:
			case COMMITTED:
			case CONDITION:
			case CONDITION_NUMBER:
			case CONNECT:
			case CONNECTION:
			case CONNECTION_NAME:
			case CONSTRAINTS:
			case CONSTRAINT_CATALOG:
			case CONSTRAINT_NAME:
			case CONSTRAINT_SCHEMA:
			case CONSTRUCTOR:
			case CONTAINS:
			case CONTINUE:
			case CONVERSION:
			case CONVERT:
			case COPY:
			case CORR:
			case CORRESPONDING:
			case COUNT:
			case COVAR_POP:
			case COVAR_SAMP:
			case CSV:
			case CUBE:
			case CUME_DIST:
			case CURRENT:
			case CURRENT_DEFAULT_TRANSFORM_GROUP:
			case CURRENT_PATH:
			case CURRENT_TRANSFORM_GROUP_FOR_TYPE:
			case CURSOR:
			case CURSOR_NAME:
			case CYCLE:
			case DATA:
			case DATABASE:
			case DATE:
			case DATETIME_INTERVAL_CODE:
			case DATETIME_INTERVAL_PRECISION:
			case DAY:
			case DEALLOCATE:
			case DEC:
			case DECIMAL:
			case DECLARE:
			case DEFAULTS:
			case DEFERRED:
			case DEFINED:
			case DEFINER:
			case DEGREE:
			case DELETE:
			case DELIMITER:
			case DELIMITERS:
			case DENSE_RANK:
			case DEPTH:
			case DEREF:
			case DERIVED:
			case DESCRIBE:
			case DESCRIPTOR:
			case DETERMINISTIC:
			case DIAGNOSTICS:
			case DICTIONARY:
			case DISCONNECT:
			case DISPATCH:
			case DOMAIN:
			case DOUBLE:
			case DROP:
			case DYNAMIC:
			case DYNAMIC_FUNCTION:
			case DYNAMIC_FUNCTION_CODE:
			case EACH:
			case ELEMENT:
			case ENCODING:
			case ENCRYPTED:
			case END:
			case EQUALS:
			case ESCAPE:
			case EVERY:
			case EXCEPTION:
			case EXCLUDE:
			case EXCLUDING:
			case EXCLUSIVE:
			case EXEC:
			case EXECUTE:
			case EXISTS:
			case EXP:
			case EXPLAIN:
			case EXTERNAL:
			case EXTRACT:
			case FILTER:
			case FINAL:
			case FIRST:
			case FLOAT:
			case FLOOR:
			case FOLLOWING:
			case FORCE:
			case FORTRAN:
			case FORWARD:
			case FOUND:
			case FREE:
			case FUNCTION:
			case FUSION:
			case G_:
			case GENERAL:
			case GENERATED:
			case GET:
			case GLOBAL:
			case GO:
			case GOTO:
			case GRANTED:
			case GROUPING:
			case HANDLER:
			case HIERARCHY:
			case HOLD:
			case HOUR:
			case IDENTITY:
			case IGNORE:
			case IMMEDIATE:
			case IMMUTABLE:
			case IMPLEMENTATION:
			case IMPLICIT:
			case INCLUDING:
			case INCREMENT:
			case INDEX:
			case INDICATOR:
			case INHERITS:
			case INOUT:
			case INPUT:
			case INSENSITIVE:
			case INSERT:
			case INSTANCE:
			case INSTANTIABLE:
			case INSTEAD:
			case INT:
			case INTEGER:
			case INTERSECTION:
			case INTERVAL:
			case INVOKER:
			case ISOLATION:
			case KEY:
			case KEY_MEMBER:
			case KEY_TYPE:
			case LANGUAGE:
			case LARGE:
			case LAST:
			case LEFT:
			case LENGTH:
			case LEVEL:
			case LISTEN:
			case LN:
			case LOAD:
			case LOCAL:
			case LOCATION:
			case LOCATOR:
			case LOCK:
			case LOCKED:
			case LOWER:
			case M_:
			case MAP:
			case MATCH:
			case MATCHED:
			case MAX:
			case MAXVALUE:
			case MEMBER:
			case MERGE:
			case MESSAGE_LENGTH:
			case MESSAGE_OCTET_LENGTH:
			case MESSAGE_TEXT:
			case METHOD:
			case MIN:
			case MINUTE:
			case MINVALUE:
			case MOD:
			case MODE:
			case MODIFIES:
			case MODULE:
			case MONTH:
			case MORE_:
			case MOVE:
			case MULTISET:
			case MUMPS:
			case NAME:
			case NAMES:
			case NATIONAL:
			case NCHAR:
			case NCLOB:
			case NESTING:
			case NEW:
			case NEXT:
			case NO:
			case NONE:
			case NORMALIZE:
			case NORMALIZED:
			case NOTHING:
			case NOTIFY:
			case NOWAIT:
			case NULLABLE:
			case NULLIF:
			case NULLS:
			case NUMBER:
			case NUMERIC:
			case OBJECT:
			case OCTETS:
			case OCTET_LENGTH:
			case OF:
			case OFF:
			case OIDS:
			case OLD:
			case OPEN:
			case OPERATOR:
			case OPTION:
			case OPTIONS:
			case ORDERING:
			case ORDINALITY:
			case OTHERS:
			case OUT:
			case OUTPUT:
			case OVER:
			case OVERLAY:
			case OVERRIDING:
			case OWNER:
			case PAD:
			case PARAMETER:
			case PARAMETER_MODE:
			case PARAMETER_NAME:
			case PARAMETER_ORDINAL_POSITION:
			case PARAMETER_SPECIFIC_CATALOG:
			case PARAMETER_SPECIFIC_NAME:
			case PARAMETER_SPECIFIC_SCHEMA:
			case PARTIAL:
			case PARTITION:
			case PASCAL:
			case PASSWORD:
			case PATH:
			case PERCENTILE_CONT:
			case PERCENTILE_DISC:
			case PERCENT_RANK:
			case PLI:
			case POSITION:
			case POWER:
			case PRECEDING:
			case PRECISION:
			case PREPARE:
			case PRESERVE:
			case PRIOR:
			case PRIVILEGES:
			case PROCEDURAL:
			case PROCEDURE:
			case PUBLIC:
			case QUOTE:
			case RANGE:
			case RANK:
			case READ:
			case READS:
			case REAL:
			case RECHECK:
			case RECURSIVE:
			case REF:
			case REFERENCING:
			case REGR_AVGX:
			case REGR_AVGY:
			case REGR_COUNT:
			case REGR_INTERCEPT:
			case REGR_SLOPE:
			case REGR_SXX:
			case REGR_SXY:
			case REGR_SYY:
			case REINDEX:
			case RELATIVE:
			case RELEASE:
			case RENAME:
			case REPEATABLE:
			case REPLACE:
			case RESET:
			case RESTART:
			case RESTRICT:
			case RESULT:
			case RETURN:
			case RETURNED_CARDINALITY:
			case RETURNED_LENGTH:
			case RETURNED_OCTET_LENGTH:
			case RETURNED_SQLSTATE:
			case RETURNS:
			case REVOKE:
			case RIGHT:
			case ROLE:
			case ROLLBACK:
			case ROLLUP:
			case ROUTINE:
			case ROUTINE_CATALOG:
			case ROUTINE_NAME:
			case ROUTINE_SCHEMA:
			case ROW:
			case ROWS:
			case ROW_COUNT:
			case ROW_NUMBER:
			case RULE:
			case SAVEPOINT:
			case SCALE:
			case SCHEMA:
			case SCHEMA_NAME:
			case SCOPE:
			case SCOPE_CATALOG:
			case SCOPE_NAME:
			case SCOPE_SCHEMA:
			case SCROLL:
			case SEARCH:
			case SECOND:
			case SECTION:
			case SECURITY:
			case SELF:
			case SENSITIVE:
			case SEQUENCE:
			case SERIALIZABLE:
			case SERVER_NAME:
			case SESSION:
			case SET:
			case SETOF:
			case SETS:
			case SHARE:
			case SHOW:
			case SIMPLE:
			case SIZE:
			case SMALLINT:
			case SOURCE:
			case SPACE:
			case SPECIFIC:
			case SPECIFICTYPE:
			case SPECIFIC_NAME:
			case SQL:
			case SQLCODE:
			case SQLERROR:
			case SQLEXCEPTION:
			case SQLSTATE:
			case SQLWARNING:
			case SQRT:
			case STABLE:
			case START:
			case STATE:
			case STATEMENT:
			case STATIC:
			case STATISTICS:
			case STDDEV_POP:
			case STDDEV_SAMP:
			case STDIN:
			case STDOUT:
			case STORAGE:
			case STRICT:
			case STRUCTURE:
			case STYLE:
			case SUBCLASS_ORIGIN:
			case SUBMULTISET:
			case SUBSTRING:
			case SUM:
			case SYSID:
			case SYSTEM:
			case SYSTEM_USER:
			case TABLESPACE:
			case TABLE_NAME:
			case TEMP:
			case TEMPLATE:
			case TEMPORARY:
			case TIES:
			case TIME:
			case TIMESTAMP:
			case TIMEZONE_HOUR:
			case TIMEZONE_MINUTE:
			case TOP_LEVEL_COUNT:
			case TRANSACTION:
			case TRANSACTIONS_COMMITTED:
			case TRANSACTIONS_ROLLED_BACK:
			case TRANSACTION_ACTIVE:
			case TRANSFORM:
			case TRANSFORMS:
			case TRANSLATE:
			case TRANSLATION:
			case TREAT:
			case TRIGGER:
			case TRIGGER_CATALOG:
			case TRIGGER_NAME:
			case TRIGGER_SCHEMA:
			case TRIM:
			case TRUNCATE:
			case TRUSTED:
			case TYPE:
			case UESCAPE:
			case UNBOUNDED:
			case UNCOMMITTED:
			case UNDER:
			case UNENCRYPTED:
			case UNKNOWN:
			case UNLISTEN:
			case UNNAMED:
			case UNNEST:
			case UNTIL:
			case UPDATE:
			case UPPER:
			case USAGE:
			case USER_DEFINED_TYPE_CATALOG:
			case USER_DEFINED_TYPE_CODE:
			case USER_DEFINED_TYPE_NAME:
			case USER_DEFINED_TYPE_SCHEMA:
			case VACUUM:
			case VALID:
			case VALIDATOR:
			case VALUE:
			case VALUES:
			case VARCHAR:
			case VARYING:
			case VAR_POP:
			case VAR_SAMP:
			case VIEW:
			case VOLATILE:
			case WHENEVER:
			case WIDTH_BUCKET:
			case WITHIN:
			case WITHOUT:
			case WORK:
			case WRITE:
			case YEAR:
			case ZONE:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(2598);
				identifier(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Name_listContext extends ParserRuleContext {
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PostgreSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PostgreSQLParser.COMMA, i);
		}
		public Name_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterName_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitName_list(this);
		}
	}

	public final Name_listContext name_list() throws RecognitionException {
		Name_listContext _localctx = new Name_listContext(_ctx, getState());
		enterRule(_localctx, 416, RULE_name_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2601);
			name();
			setState(2606);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2602);
				match(COMMA);
				setState(2603);
				name();
				}
				}
				setState(2608);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Identifier_listContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PostgreSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PostgreSQLParser.COMMA, i);
		}
		public Identifier_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterIdentifier_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitIdentifier_list(this);
		}
	}

	public final Identifier_listContext identifier_list() throws RecognitionException {
		Identifier_listContext _localctx = new Identifier_listContext(_ctx, getState());
		enterRule(_localctx, 418, RULE_identifier_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2609);
			identifier(0);
			setState(2614);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2610);
				match(COMMA);
				setState(2611);
				identifier(0);
				}
				}
				setState(2616);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterTable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitTable_name(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 420, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2617);
			identifier(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public Type_literalContext type_literal() {
			return getRuleContext(Type_literalContext.class,0);
		}
		public TerminalNode VARCHAR() { return getToken(PostgreSQLParser.VARCHAR, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(PostgreSQLParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(PostgreSQLParser.CLOSE_PAREN, 0); }
		public TerminalNode INTEGER_LITERAL() { return getToken(PostgreSQLParser.INTEGER_LITERAL, 0); }
		public TerminalNode NUMERIC() { return getToken(PostgreSQLParser.NUMERIC, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PostgreSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PostgreSQLParser.COMMA, i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode OPEN_BRACKET() { return getToken(PostgreSQLParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(PostgreSQLParser.CLOSE_BRACKET, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		return type(0);
	}

	private TypeContext type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeContext _localctx = new TypeContext(_ctx, _parentState);
		TypeContext _prevctx = _localctx;
		int _startState = 422;
		enterRecursionRule(_localctx, 422, RULE_type, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2641);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,250,_ctx) ) {
			case 1:
				{
				setState(2620);
				type_literal();
				}
				break;
			case 2:
				{
				setState(2621);
				match(VARCHAR);
				setState(2622);
				match(OPEN_PAREN);
				setState(2624);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INTEGER_LITERAL) {
					{
					setState(2623);
					match(INTEGER_LITERAL);
					}
				}

				setState(2626);
				match(CLOSE_PAREN);
				}
				break;
			case 3:
				{
				setState(2627);
				match(NUMERIC);
				setState(2628);
				match(OPEN_PAREN);
				setState(2637);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHITESPACE) | (1L << A_) | (1L << ABORT) | (1L << ABS) | (1L << ABSOLUTE) | (1L << ACCESS) | (1L << ACTION) | (1L << ADA) | (1L << ADD) | (1L << ADMIN) | (1L << AFTER) | (1L << AGGREGATE) | (1L << ALL) | (1L << ALLOCATE) | (1L << ALSO) | (1L << ALTER) | (1L << ALWAYS) | (1L << ARE) | (1L << ARRAY) | (1L << ASENSITIVE) | (1L << ASSERTION) | (1L << ASSIGNMENT) | (1L << AT) | (1L << ATOMIC) | (1L << ATTRIBUTE) | (1L << ATTRIBUTES) | (1L << AVG) | (1L << BACKWARD) | (1L << BEFORE) | (1L << BEGIN) | (1L << BERNOULLI) | (1L << BETWEEN) | (1L << BIGINT) | (1L << BIT) | (1L << BIT_LENGTH) | (1L << BLOB) | (1L << BOOLEAN) | (1L << BREADTH) | (1L << BY) | (1L << C_) | (1L << CACHE) | (1L << CALL) | (1L << CALLED) | (1L << CARDINALITY) | (1L << CASCADE) | (1L << CASCADED) | (1L << CASE) | (1L << CAST) | (1L << CATALOG))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CATALOG_NAME - 64)) | (1L << (CEIL - 64)) | (1L << (CEILING - 64)) | (1L << (CHAIN - 64)) | (1L << (CHAR - 64)) | (1L << (CHARACTER - 64)) | (1L << (CHARACTERISTICS - 64)) | (1L << (CHARACTERS - 64)) | (1L << (CHARACTER_LENGTH - 64)) | (1L << (CHARACTER_SET_CATALOG - 64)) | (1L << (CHARACTER_SET_NAME - 64)) | (1L << (CHARACTER_SET_SCHEMA - 64)) | (1L << (CHAR_LENGTH - 64)) | (1L << (CHECKPOINT - 64)) | (1L << (CLASS - 64)) | (1L << (CLASS_ORIGIN - 64)) | (1L << (CLOB - 64)) | (1L << (CLOSE - 64)) | (1L << (CLUSTER - 64)) | (1L << (COALESCE - 64)) | (1L << (COBOL - 64)) | (1L << (COLLATION_CATALOG - 64)) | (1L << (COLLATION_NAME - 64)) | (1L << (COLLATION_SCHEMA - 64)) | (1L << (COLLECT - 64)) | (1L << (COLUMN_NAME - 64)) | (1L << (COMMAND_FUNCTION - 64)) | (1L << (COMMAND_FUNCTION_CODE - 64)) | (1L << (COMMENT - 64)) | (1L << (COMMIT - 64)) | (1L << (COMMITTED - 64)) | (1L << (CONDITION - 64)) | (1L << (CONDITION_NUMBER - 64)) | (1L << (CONNECT - 64)) | (1L << (CONNECTION - 64)) | (1L << (CONNECTION_NAME - 64)) | (1L << (CONSTRAINTS - 64)) | (1L << (CONSTRAINT_CATALOG - 64)) | (1L << (CONSTRAINT_NAME - 64)) | (1L << (CONSTRAINT_SCHEMA - 64)) | (1L << (CONSTRUCTOR - 64)) | (1L << (CONTAINS - 64)) | (1L << (CONTINUE - 64)) | (1L << (CONVERSION - 64)) | (1L << (CONVERT - 64)) | (1L << (COPY - 64)) | (1L << (CORR - 64)) | (1L << (CORRESPONDING - 64)) | (1L << (COUNT - 64)) | (1L << (COVAR_POP - 64)) | (1L << (COVAR_SAMP - 64)) | (1L << (CSV - 64)) | (1L << (CUBE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (CUME_DIST - 128)) | (1L << (CURRENT - 128)) | (1L << (CURRENT_DATE - 128)) | (1L << (CURRENT_DEFAULT_TRANSFORM_GROUP - 128)) | (1L << (CURRENT_PATH - 128)) | (1L << (CURRENT_ROLE - 128)) | (1L << (CURRENT_TIME - 128)) | (1L << (CURRENT_TIMESTAMP - 128)) | (1L << (CURRENT_TRANSFORM_GROUP_FOR_TYPE - 128)) | (1L << (CURRENT_USER - 128)) | (1L << (CURSOR - 128)) | (1L << (CURSOR_NAME - 128)) | (1L << (CYCLE - 128)) | (1L << (DATA - 128)) | (1L << (DATABASE - 128)) | (1L << (DATE - 128)) | (1L << (DATETIME_INTERVAL_CODE - 128)) | (1L << (DATETIME_INTERVAL_PRECISION - 128)) | (1L << (DAY - 128)) | (1L << (DEALLOCATE - 128)) | (1L << (DEC - 128)) | (1L << (DECIMAL - 128)) | (1L << (DECLARE - 128)) | (1L << (DEFAULTS - 128)) | (1L << (DEFERRED - 128)) | (1L << (DEFINED - 128)) | (1L << (DEFINER - 128)) | (1L << (DEGREE - 128)) | (1L << (DELETE - 128)) | (1L << (DELIMITER - 128)) | (1L << (DELIMITERS - 128)) | (1L << (DENSE_RANK - 128)) | (1L << (DEPTH - 128)) | (1L << (DEREF - 128)) | (1L << (DERIVED - 128)) | (1L << (DESCRIBE - 128)) | (1L << (DESCRIPTOR - 128)) | (1L << (DETERMINISTIC - 128)) | (1L << (DIAGNOSTICS - 128)) | (1L << (DICTIONARY - 128)) | (1L << (DISCONNECT - 128)) | (1L << (DISPATCH - 128)) | (1L << (DOMAIN - 128)) | (1L << (DOUBLE - 128)) | (1L << (DROP - 128)) | (1L << (DYNAMIC - 128)) | (1L << (DYNAMIC_FUNCTION - 128)) | (1L << (DYNAMIC_FUNCTION_CODE - 128)) | (1L << (EACH - 128)) | (1L << (ELEMENT - 128)) | (1L << (ENCODING - 128)) | (1L << (ENCRYPTED - 128)) | (1L << (END - 128)) | (1L << (EQUALS - 128)) | (1L << (ESCAPE - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (EVERY - 192)) | (1L << (EXCEPTION - 192)) | (1L << (EXCLUDE - 192)) | (1L << (EXCLUDING - 192)) | (1L << (EXCLUSIVE - 192)) | (1L << (EXEC - 192)) | (1L << (EXECUTE - 192)) | (1L << (EXISTS - 192)) | (1L << (EXP - 192)) | (1L << (EXPLAIN - 192)) | (1L << (EXTERNAL - 192)) | (1L << (EXTRACT - 192)) | (1L << (FALSE - 192)) | (1L << (FILTER - 192)) | (1L << (FINAL - 192)) | (1L << (FIRST - 192)) | (1L << (FLOAT - 192)) | (1L << (FLOOR - 192)) | (1L << (FOLLOWING - 192)) | (1L << (FORCE - 192)) | (1L << (FORTRAN - 192)) | (1L << (FORWARD - 192)) | (1L << (FOUND - 192)) | (1L << (FREE - 192)) | (1L << (FUNCTION - 192)) | (1L << (FUSION - 192)) | (1L << (G_ - 192)) | (1L << (GENERAL - 192)) | (1L << (GENERATED - 192)) | (1L << (GET - 192)) | (1L << (GLOBAL - 192)) | (1L << (GO - 192)) | (1L << (GOTO - 192)) | (1L << (GRANTED - 192)) | (1L << (GROUPING - 192)) | (1L << (HANDLER - 192)) | (1L << (HIERARCHY - 192)) | (1L << (HOLD - 192)) | (1L << (HOUR - 192)) | (1L << (IDENTITY - 192)) | (1L << (IGNORE - 192)) | (1L << (IMMEDIATE - 192)) | (1L << (IMMUTABLE - 192)) | (1L << (IMPLEMENTATION - 192)) | (1L << (IMPLICIT - 192)) | (1L << (INCLUDING - 192)) | (1L << (INCREMENT - 192)) | (1L << (INDEX - 192)) | (1L << (INDICATOR - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (INHERITS - 256)) | (1L << (INOUT - 256)) | (1L << (INPUT - 256)) | (1L << (INSENSITIVE - 256)) | (1L << (INSERT - 256)) | (1L << (INSTANCE - 256)) | (1L << (INSTANTIABLE - 256)) | (1L << (INSTEAD - 256)) | (1L << (INT - 256)) | (1L << (INTEGER - 256)) | (1L << (INTERSECTION - 256)) | (1L << (INTERVAL - 256)) | (1L << (INVOKER - 256)) | (1L << (ISOLATION - 256)) | (1L << (KEY - 256)) | (1L << (KEY_MEMBER - 256)) | (1L << (KEY_TYPE - 256)) | (1L << (LANGUAGE - 256)) | (1L << (LARGE - 256)) | (1L << (LAST - 256)) | (1L << (LEFT - 256)) | (1L << (LENGTH - 256)) | (1L << (LEVEL - 256)) | (1L << (LISTEN - 256)) | (1L << (LN - 256)) | (1L << (LOAD - 256)) | (1L << (LOCAL - 256)) | (1L << (LOCATION - 256)) | (1L << (LOCATOR - 256)) | (1L << (LOCK - 256)) | (1L << (LOCKED - 256)) | (1L << (LOWER - 256)) | (1L << (M_ - 256)) | (1L << (MAP - 256)) | (1L << (MATCH - 256)) | (1L << (MATCHED - 256)) | (1L << (MAX - 256)) | (1L << (MAXVALUE - 256)) | (1L << (MEMBER - 256)) | (1L << (MERGE - 256)) | (1L << (MESSAGE_LENGTH - 256)) | (1L << (MESSAGE_OCTET_LENGTH - 256)) | (1L << (MESSAGE_TEXT - 256)) | (1L << (METHOD - 256)) | (1L << (MIN - 256)) | (1L << (MINUTE - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (MINVALUE - 320)) | (1L << (MOD - 320)) | (1L << (MODE - 320)) | (1L << (MODIFIES - 320)) | (1L << (MODULE - 320)) | (1L << (MONTH - 320)) | (1L << (MORE_ - 320)) | (1L << (MOVE - 320)) | (1L << (MULTISET - 320)) | (1L << (MUMPS - 320)) | (1L << (NAME - 320)) | (1L << (NAMES - 320)) | (1L << (NATIONAL - 320)) | (1L << (NCHAR - 320)) | (1L << (NCLOB - 320)) | (1L << (NESTING - 320)) | (1L << (NEW - 320)) | (1L << (NEXT - 320)) | (1L << (NO - 320)) | (1L << (NONE - 320)) | (1L << (NORMALIZE - 320)) | (1L << (NORMALIZED - 320)) | (1L << (NOT - 320)) | (1L << (NOTHING - 320)) | (1L << (NOTIFY - 320)) | (1L << (NOWAIT - 320)) | (1L << (NULL - 320)) | (1L << (NULLABLE - 320)) | (1L << (NULLIF - 320)) | (1L << (NULLS - 320)) | (1L << (NUMBER - 320)) | (1L << (NUMERIC - 320)) | (1L << (OBJECT - 320)) | (1L << (OCTETS - 320)) | (1L << (OCTET_LENGTH - 320)) | (1L << (OF - 320)) | (1L << (OFF - 320)) | (1L << (OIDS - 320)) | (1L << (OLD - 320)) | (1L << (OPEN - 320)) | (1L << (OPERATOR - 320)) | (1L << (OPTION - 320)) | (1L << (OPTIONS - 320)) | (1L << (ORDERING - 320)) | (1L << (ORDINALITY - 320)) | (1L << (OTHERS - 320)) | (1L << (OUT - 320)) | (1L << (OUTPUT - 320)) | (1L << (OVER - 320)) | (1L << (OVERLAY - 320)) | (1L << (OVERRIDING - 320)))) != 0) || ((((_la - 384)) & ~0x3f) == 0 && ((1L << (_la - 384)) & ((1L << (OWNER - 384)) | (1L << (PAD - 384)) | (1L << (PARAMETER - 384)) | (1L << (PARAMETER_MODE - 384)) | (1L << (PARAMETER_NAME - 384)) | (1L << (PARAMETER_ORDINAL_POSITION - 384)) | (1L << (PARAMETER_SPECIFIC_CATALOG - 384)) | (1L << (PARAMETER_SPECIFIC_NAME - 384)) | (1L << (PARAMETER_SPECIFIC_SCHEMA - 384)) | (1L << (PARTIAL - 384)) | (1L << (PARTITION - 384)) | (1L << (PASCAL - 384)) | (1L << (PASSWORD - 384)) | (1L << (PATH - 384)) | (1L << (PERCENTILE_CONT - 384)) | (1L << (PERCENTILE_DISC - 384)) | (1L << (PERCENT_RANK - 384)) | (1L << (PLI - 384)) | (1L << (POSITION - 384)) | (1L << (POWER - 384)) | (1L << (PRECEDING - 384)) | (1L << (PRECISION - 384)) | (1L << (PREPARE - 384)) | (1L << (PRESERVE - 384)) | (1L << (PRIOR - 384)) | (1L << (PRIVILEGES - 384)) | (1L << (PROCEDURAL - 384)) | (1L << (PROCEDURE - 384)) | (1L << (PUBLIC - 384)) | (1L << (QUOTE - 384)) | (1L << (RANGE - 384)) | (1L << (RANK - 384)) | (1L << (READ - 384)) | (1L << (READS - 384)) | (1L << (REAL - 384)) | (1L << (RECHECK - 384)) | (1L << (RECURSIVE - 384)) | (1L << (REF - 384)) | (1L << (REFERENCING - 384)) | (1L << (REGR_AVGX - 384)) | (1L << (REGR_AVGY - 384)) | (1L << (REGR_COUNT - 384)) | (1L << (REGR_INTERCEPT - 384)) | (1L << (REGR_SLOPE - 384)) | (1L << (REGR_SXX - 384)) | (1L << (REGR_SXY - 384)) | (1L << (REGR_SYY - 384)) | (1L << (REINDEX - 384)) | (1L << (RELATIVE - 384)) | (1L << (RELEASE - 384)) | (1L << (RENAME - 384)) | (1L << (REPEATABLE - 384)) | (1L << (REPLACE - 384)) | (1L << (RESET - 384)) | (1L << (RESTART - 384)) | (1L << (RESTRICT - 384)))) != 0) || ((((_la - 448)) & ~0x3f) == 0 && ((1L << (_la - 448)) & ((1L << (RESULT - 448)) | (1L << (RETURN - 448)) | (1L << (RETURNED_CARDINALITY - 448)) | (1L << (RETURNED_LENGTH - 448)) | (1L << (RETURNED_OCTET_LENGTH - 448)) | (1L << (RETURNED_SQLSTATE - 448)) | (1L << (RETURNS - 448)) | (1L << (REVOKE - 448)) | (1L << (RIGHT - 448)) | (1L << (ROLE - 448)) | (1L << (ROLLBACK - 448)) | (1L << (ROLLUP - 448)) | (1L << (ROUTINE - 448)) | (1L << (ROUTINE_CATALOG - 448)) | (1L << (ROUTINE_NAME - 448)) | (1L << (ROUTINE_SCHEMA - 448)) | (1L << (ROW - 448)) | (1L << (ROWS - 448)) | (1L << (ROW_COUNT - 448)) | (1L << (ROW_NUMBER - 448)) | (1L << (RULE - 448)) | (1L << (SAVEPOINT - 448)) | (1L << (SCALE - 448)) | (1L << (SCHEMA - 448)) | (1L << (SCHEMA_NAME - 448)) | (1L << (SCOPE - 448)) | (1L << (SCOPE_CATALOG - 448)) | (1L << (SCOPE_NAME - 448)) | (1L << (SCOPE_SCHEMA - 448)) | (1L << (SCROLL - 448)) | (1L << (SEARCH - 448)) | (1L << (SECOND - 448)) | (1L << (SECTION - 448)) | (1L << (SECURITY - 448)) | (1L << (SELF - 448)) | (1L << (SENSITIVE - 448)) | (1L << (SEQUENCE - 448)) | (1L << (SERIALIZABLE - 448)) | (1L << (SERVER_NAME - 448)) | (1L << (SESSION - 448)) | (1L << (SET - 448)) | (1L << (SETOF - 448)) | (1L << (SETS - 448)) | (1L << (SHARE - 448)) | (1L << (SHOW - 448)) | (1L << (SIMPLE - 448)) | (1L << (SIZE - 448)) | (1L << (SMALLINT - 448)) | (1L << (SOURCE - 448)) | (1L << (SPACE - 448)) | (1L << (SPECIFIC - 448)) | (1L << (SPECIFICTYPE - 448)) | (1L << (SPECIFIC_NAME - 448)) | (1L << (SQL - 448)) | (1L << (SQLCODE - 448)) | (1L << (SQLERROR - 448)) | (1L << (SQLEXCEPTION - 448)) | (1L << (SQLSTATE - 448)) | (1L << (SQLWARNING - 448)))) != 0) || ((((_la - 512)) & ~0x3f) == 0 && ((1L << (_la - 512)) & ((1L << (SQRT - 512)) | (1L << (STABLE - 512)) | (1L << (START - 512)) | (1L << (STATE - 512)) | (1L << (STATEMENT - 512)) | (1L << (STATIC - 512)) | (1L << (STATISTICS - 512)) | (1L << (STDDEV_POP - 512)) | (1L << (STDDEV_SAMP - 512)) | (1L << (STDIN - 512)) | (1L << (STDOUT - 512)) | (1L << (STORAGE - 512)) | (1L << (STRICT - 512)) | (1L << (STRUCTURE - 512)) | (1L << (STYLE - 512)) | (1L << (SUBCLASS_ORIGIN - 512)) | (1L << (SUBMULTISET - 512)) | (1L << (SUBSTRING - 512)) | (1L << (SUM - 512)) | (1L << (SYSID - 512)) | (1L << (SYSTEM - 512)) | (1L << (SYSTEM_USER - 512)) | (1L << (TABLESPACE - 512)) | (1L << (TABLE_NAME - 512)) | (1L << (TEMP - 512)) | (1L << (TEMPLATE - 512)) | (1L << (TEMPORARY - 512)) | (1L << (TIES - 512)) | (1L << (TIME - 512)) | (1L << (TIME_TZ - 512)) | (1L << (TIMESTAMP - 512)) | (1L << (TIMESTAMP_TZ - 512)) | (1L << (TIMEZONE_HOUR - 512)) | (1L << (TIMEZONE_MINUTE - 512)) | (1L << (TOP_LEVEL_COUNT - 512)) | (1L << (TRANSACTION - 512)) | (1L << (TRANSACTIONS_COMMITTED - 512)) | (1L << (TRANSACTIONS_ROLLED_BACK - 512)) | (1L << (TRANSACTION_ACTIVE - 512)) | (1L << (TRANSFORM - 512)) | (1L << (TRANSFORMS - 512)) | (1L << (TRANSLATE - 512)) | (1L << (TRANSLATION - 512)) | (1L << (TREAT - 512)) | (1L << (TRIGGER - 512)) | (1L << (TRIGGER_CATALOG - 512)) | (1L << (TRIGGER_NAME - 512)) | (1L << (TRIGGER_SCHEMA - 512)) | (1L << (TRIM - 512)) | (1L << (TRUE - 512)) | (1L << (TRUNCATE - 512)) | (1L << (TRUSTED - 512)) | (1L << (TYPE - 512)) | (1L << (UESCAPE - 512)))) != 0) || ((((_la - 576)) & ~0x3f) == 0 && ((1L << (_la - 576)) & ((1L << (UNBOUNDED - 576)) | (1L << (UNCOMMITTED - 576)) | (1L << (UNDER - 576)) | (1L << (UNENCRYPTED - 576)) | (1L << (UNKNOWN - 576)) | (1L << (UNLISTEN - 576)) | (1L << (UNNAMED - 576)) | (1L << (UNNEST - 576)) | (1L << (UNTIL - 576)) | (1L << (UPDATE - 576)) | (1L << (UPPER - 576)) | (1L << (USAGE - 576)) | (1L << (USER_DEFINED_TYPE_CATALOG - 576)) | (1L << (USER_DEFINED_TYPE_CODE - 576)) | (1L << (USER_DEFINED_TYPE_NAME - 576)) | (1L << (USER_DEFINED_TYPE_SCHEMA - 576)) | (1L << (VACUUM - 576)) | (1L << (VALID - 576)) | (1L << (VALIDATOR - 576)) | (1L << (VALUE - 576)) | (1L << (VALUES - 576)) | (1L << (VARCHAR - 576)) | (1L << (VARYING - 576)) | (1L << (VAR_POP - 576)) | (1L << (VAR_SAMP - 576)) | (1L << (VIEW - 576)) | (1L << (VOLATILE - 576)) | (1L << (WHENEVER - 576)) | (1L << (WIDTH_BUCKET - 576)) | (1L << (WITHIN - 576)) | (1L << (WITHOUT - 576)) | (1L << (WORK - 576)) | (1L << (WRITE - 576)) | (1L << (YEAR - 576)) | (1L << (ZONE - 576)))) != 0) || ((((_la - 686)) & ~0x3f) == 0 && ((1L << (_la - 686)) & ((1L << (ABSTIME - 686)) | (1L << (BOOL - 686)) | (1L << (BOX - 686)) | (1L << (FLOAT4 - 686)) | (1L << (FLOAT8 - 686)) | (1L << (INT2 - 686)) | (1L << (INT4 - 686)) | (1L << (INT8 - 686)) | (1L << (JSON - 686)) | (1L << (JSONB - 686)) | (1L << (LINE - 686)) | (1L << (POINT - 686)) | (1L << (RELTIME - 686)) | (1L << (TEXT - 686)) | (1L << (DOLLAR - 686)) | (1L << (DOLLAR_DOLLAR - 686)) | (1L << (OPEN_PAREN - 686)) | (1L << (BIT_STRING - 686)) | (1L << (REGEX_STRING - 686)) | (1L << (NUMERIC_LITERAL - 686)) | (1L << (INTEGER_LITERAL - 686)) | (1L << (HEX_INTEGER_LITERAL - 686)) | (1L << (SINGLEQ_STRING_LITERAL - 686)) | (1L << (DOUBLEQ_STRING_LITERAL - 686)) | (1L << (IDENTIFIER - 686)) | (1L << (AT_SIGN - 686)) | (1L << (BANG_BANG - 686)))) != 0) || ((((_la - 751)) & ~0x3f) == 0 && ((1L << (_la - 751)) & ((1L << (MINUS - 751)) | (1L << (PLUS - 751)) | (1L << (QMARK_HYPHEN - 751)) | (1L << (TIL - 751)))) != 0)) {
					{
					setState(2629);
					expr(0);
					setState(2634);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(2630);
						match(COMMA);
						setState(2631);
						expr(0);
						}
						}
						setState(2636);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(2639);
				match(CLOSE_PAREN);
				}
				break;
			case 4:
				{
				setState(2640);
				identifier(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2651);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,252,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_type);
					setState(2643);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2644);
					match(OPEN_BRACKET);
					setState(2646);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==INTEGER_LITERAL) {
						{
						setState(2645);
						match(INTEGER_LITERAL);
						}
					}

					setState(2648);
					match(CLOSE_BRACKET);
					}
					} 
				}
				setState(2653);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,252,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Type_listContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PostgreSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PostgreSQLParser.COMMA, i);
		}
		public Type_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterType_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitType_list(this);
		}
	}

	public final Type_listContext type_list() throws RecognitionException {
		Type_listContext _localctx = new Type_listContext(_ctx, getState());
		enterRule(_localctx, 424, RULE_type_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2654);
			type(0);
			setState(2659);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2655);
				match(COMMA);
				setState(2656);
				type(0);
				}
				}
				setState(2661);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_methodContext extends ParserRuleContext {
		public TerminalNode BTREE() { return getToken(PostgreSQLParser.BTREE, 0); }
		public TerminalNode HASH_() { return getToken(PostgreSQLParser.HASH_, 0); }
		public TerminalNode GIST() { return getToken(PostgreSQLParser.GIST, 0); }
		public TerminalNode SPGIST() { return getToken(PostgreSQLParser.SPGIST, 0); }
		public TerminalNode GIN() { return getToken(PostgreSQLParser.GIN, 0); }
		public TerminalNode BRIN() { return getToken(PostgreSQLParser.BRIN, 0); }
		public Index_methodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterIndex_method(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitIndex_method(this);
		}
	}

	public final Index_methodContext index_method() throws RecognitionException {
		Index_methodContext _localctx = new Index_methodContext(_ctx, getState());
		enterRule(_localctx, 426, RULE_index_method);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2662);
			_la = _input.LA(1);
			if ( !(((((_la - 668)) & ~0x3f) == 0 && ((1L << (_la - 668)) & ((1L << (BTREE - 668)) | (1L << (HASH_ - 668)) | (1L << (GIST - 668)) | (1L << (SPGIST - 668)) | (1L << (GIN - 668)) | (1L << (BRIN - 668)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_nameContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Func_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterFunc_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitFunc_name(this);
		}
	}

	public final Func_nameContext func_name() throws RecognitionException {
		Func_nameContext _localctx = new Func_nameContext(_ctx, getState());
		enterRule(_localctx, 428, RULE_func_name);
		try {
			setState(2666);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,254,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2664);
				type(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2665);
				identifier(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Func_callContext extends ParserRuleContext {
		public Func_nameContext func_name() {
			return getRuleContext(Func_nameContext.class,0);
		}
		public TerminalNode OPEN_PAREN() { return getToken(PostgreSQLParser.OPEN_PAREN, 0); }
		public TerminalNode VARIADIC() { return getToken(PostgreSQLParser.VARIADIC, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(PostgreSQLParser.CLOSE_PAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(PostgreSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PostgreSQLParser.COMMA, i);
		}
		public Todo_fill_inContext todo_fill_in() {
			return getRuleContext(Todo_fill_inContext.class,0);
		}
		public TerminalNode FROM() { return getToken(PostgreSQLParser.FROM, 0); }
		public Func_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterFunc_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitFunc_call(this);
		}
	}

	public final Func_callContext func_call() throws RecognitionException {
		Func_callContext _localctx = new Func_callContext(_ctx, getState());
		enterRule(_localctx, 430, RULE_func_call);
		int _la;
		try {
			int _alt;
			setState(2700);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,258,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2668);
				func_name();
				setState(2669);
				match(OPEN_PAREN);
				setState(2670);
				match(VARIADIC);
				setState(2671);
				expr(0);
				setState(2672);
				match(CLOSE_PAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2674);
				func_name();
				setState(2675);
				match(OPEN_PAREN);
				setState(2689);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHITESPACE) | (1L << A_) | (1L << ABORT) | (1L << ABS) | (1L << ABSOLUTE) | (1L << ACCESS) | (1L << ACTION) | (1L << ADA) | (1L << ADD) | (1L << ADMIN) | (1L << AFTER) | (1L << AGGREGATE) | (1L << ALL) | (1L << ALLOCATE) | (1L << ALSO) | (1L << ALTER) | (1L << ALWAYS) | (1L << ARE) | (1L << ARRAY) | (1L << ASENSITIVE) | (1L << ASSERTION) | (1L << ASSIGNMENT) | (1L << AT) | (1L << ATOMIC) | (1L << ATTRIBUTE) | (1L << ATTRIBUTES) | (1L << AVG) | (1L << BACKWARD) | (1L << BEFORE) | (1L << BEGIN) | (1L << BERNOULLI) | (1L << BETWEEN) | (1L << BIGINT) | (1L << BIT) | (1L << BIT_LENGTH) | (1L << BLOB) | (1L << BOOLEAN) | (1L << BREADTH) | (1L << BY) | (1L << C_) | (1L << CACHE) | (1L << CALL) | (1L << CALLED) | (1L << CARDINALITY) | (1L << CASCADE) | (1L << CASCADED) | (1L << CASE) | (1L << CAST) | (1L << CATALOG))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CATALOG_NAME - 64)) | (1L << (CEIL - 64)) | (1L << (CEILING - 64)) | (1L << (CHAIN - 64)) | (1L << (CHAR - 64)) | (1L << (CHARACTER - 64)) | (1L << (CHARACTERISTICS - 64)) | (1L << (CHARACTERS - 64)) | (1L << (CHARACTER_LENGTH - 64)) | (1L << (CHARACTER_SET_CATALOG - 64)) | (1L << (CHARACTER_SET_NAME - 64)) | (1L << (CHARACTER_SET_SCHEMA - 64)) | (1L << (CHAR_LENGTH - 64)) | (1L << (CHECKPOINT - 64)) | (1L << (CLASS - 64)) | (1L << (CLASS_ORIGIN - 64)) | (1L << (CLOB - 64)) | (1L << (CLOSE - 64)) | (1L << (CLUSTER - 64)) | (1L << (COALESCE - 64)) | (1L << (COBOL - 64)) | (1L << (COLLATION_CATALOG - 64)) | (1L << (COLLATION_NAME - 64)) | (1L << (COLLATION_SCHEMA - 64)) | (1L << (COLLECT - 64)) | (1L << (COLUMN_NAME - 64)) | (1L << (COMMAND_FUNCTION - 64)) | (1L << (COMMAND_FUNCTION_CODE - 64)) | (1L << (COMMENT - 64)) | (1L << (COMMIT - 64)) | (1L << (COMMITTED - 64)) | (1L << (CONDITION - 64)) | (1L << (CONDITION_NUMBER - 64)) | (1L << (CONNECT - 64)) | (1L << (CONNECTION - 64)) | (1L << (CONNECTION_NAME - 64)) | (1L << (CONSTRAINTS - 64)) | (1L << (CONSTRAINT_CATALOG - 64)) | (1L << (CONSTRAINT_NAME - 64)) | (1L << (CONSTRAINT_SCHEMA - 64)) | (1L << (CONSTRUCTOR - 64)) | (1L << (CONTAINS - 64)) | (1L << (CONTINUE - 64)) | (1L << (CONVERSION - 64)) | (1L << (CONVERT - 64)) | (1L << (COPY - 64)) | (1L << (CORR - 64)) | (1L << (CORRESPONDING - 64)) | (1L << (COUNT - 64)) | (1L << (COVAR_POP - 64)) | (1L << (COVAR_SAMP - 64)) | (1L << (CSV - 64)) | (1L << (CUBE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (CUME_DIST - 128)) | (1L << (CURRENT - 128)) | (1L << (CURRENT_DATE - 128)) | (1L << (CURRENT_DEFAULT_TRANSFORM_GROUP - 128)) | (1L << (CURRENT_PATH - 128)) | (1L << (CURRENT_ROLE - 128)) | (1L << (CURRENT_TIME - 128)) | (1L << (CURRENT_TIMESTAMP - 128)) | (1L << (CURRENT_TRANSFORM_GROUP_FOR_TYPE - 128)) | (1L << (CURRENT_USER - 128)) | (1L << (CURSOR - 128)) | (1L << (CURSOR_NAME - 128)) | (1L << (CYCLE - 128)) | (1L << (DATA - 128)) | (1L << (DATABASE - 128)) | (1L << (DATE - 128)) | (1L << (DATETIME_INTERVAL_CODE - 128)) | (1L << (DATETIME_INTERVAL_PRECISION - 128)) | (1L << (DAY - 128)) | (1L << (DEALLOCATE - 128)) | (1L << (DEC - 128)) | (1L << (DECIMAL - 128)) | (1L << (DECLARE - 128)) | (1L << (DEFAULTS - 128)) | (1L << (DEFERRED - 128)) | (1L << (DEFINED - 128)) | (1L << (DEFINER - 128)) | (1L << (DEGREE - 128)) | (1L << (DELETE - 128)) | (1L << (DELIMITER - 128)) | (1L << (DELIMITERS - 128)) | (1L << (DENSE_RANK - 128)) | (1L << (DEPTH - 128)) | (1L << (DEREF - 128)) | (1L << (DERIVED - 128)) | (1L << (DESCRIBE - 128)) | (1L << (DESCRIPTOR - 128)) | (1L << (DETERMINISTIC - 128)) | (1L << (DIAGNOSTICS - 128)) | (1L << (DICTIONARY - 128)) | (1L << (DISCONNECT - 128)) | (1L << (DISPATCH - 128)) | (1L << (DOMAIN - 128)) | (1L << (DOUBLE - 128)) | (1L << (DROP - 128)) | (1L << (DYNAMIC - 128)) | (1L << (DYNAMIC_FUNCTION - 128)) | (1L << (DYNAMIC_FUNCTION_CODE - 128)) | (1L << (EACH - 128)) | (1L << (ELEMENT - 128)) | (1L << (ENCODING - 128)) | (1L << (ENCRYPTED - 128)) | (1L << (END - 128)) | (1L << (EQUALS - 128)) | (1L << (ESCAPE - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (EVERY - 192)) | (1L << (EXCEPTION - 192)) | (1L << (EXCLUDE - 192)) | (1L << (EXCLUDING - 192)) | (1L << (EXCLUSIVE - 192)) | (1L << (EXEC - 192)) | (1L << (EXECUTE - 192)) | (1L << (EXISTS - 192)) | (1L << (EXP - 192)) | (1L << (EXPLAIN - 192)) | (1L << (EXTERNAL - 192)) | (1L << (EXTRACT - 192)) | (1L << (FALSE - 192)) | (1L << (FILTER - 192)) | (1L << (FINAL - 192)) | (1L << (FIRST - 192)) | (1L << (FLOAT - 192)) | (1L << (FLOOR - 192)) | (1L << (FOLLOWING - 192)) | (1L << (FORCE - 192)) | (1L << (FORTRAN - 192)) | (1L << (FORWARD - 192)) | (1L << (FOUND - 192)) | (1L << (FREE - 192)) | (1L << (FUNCTION - 192)) | (1L << (FUSION - 192)) | (1L << (G_ - 192)) | (1L << (GENERAL - 192)) | (1L << (GENERATED - 192)) | (1L << (GET - 192)) | (1L << (GLOBAL - 192)) | (1L << (GO - 192)) | (1L << (GOTO - 192)) | (1L << (GRANTED - 192)) | (1L << (GROUPING - 192)) | (1L << (HANDLER - 192)) | (1L << (HIERARCHY - 192)) | (1L << (HOLD - 192)) | (1L << (HOUR - 192)) | (1L << (IDENTITY - 192)) | (1L << (IGNORE - 192)) | (1L << (IMMEDIATE - 192)) | (1L << (IMMUTABLE - 192)) | (1L << (IMPLEMENTATION - 192)) | (1L << (IMPLICIT - 192)) | (1L << (INCLUDING - 192)) | (1L << (INCREMENT - 192)) | (1L << (INDEX - 192)) | (1L << (INDICATOR - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (INHERITS - 256)) | (1L << (INOUT - 256)) | (1L << (INPUT - 256)) | (1L << (INSENSITIVE - 256)) | (1L << (INSERT - 256)) | (1L << (INSTANCE - 256)) | (1L << (INSTANTIABLE - 256)) | (1L << (INSTEAD - 256)) | (1L << (INT - 256)) | (1L << (INTEGER - 256)) | (1L << (INTERSECTION - 256)) | (1L << (INTERVAL - 256)) | (1L << (INVOKER - 256)) | (1L << (ISOLATION - 256)) | (1L << (KEY - 256)) | (1L << (KEY_MEMBER - 256)) | (1L << (KEY_TYPE - 256)) | (1L << (LANGUAGE - 256)) | (1L << (LARGE - 256)) | (1L << (LAST - 256)) | (1L << (LEFT - 256)) | (1L << (LENGTH - 256)) | (1L << (LEVEL - 256)) | (1L << (LISTEN - 256)) | (1L << (LN - 256)) | (1L << (LOAD - 256)) | (1L << (LOCAL - 256)) | (1L << (LOCATION - 256)) | (1L << (LOCATOR - 256)) | (1L << (LOCK - 256)) | (1L << (LOCKED - 256)) | (1L << (LOWER - 256)) | (1L << (M_ - 256)) | (1L << (MAP - 256)) | (1L << (MATCH - 256)) | (1L << (MATCHED - 256)) | (1L << (MAX - 256)) | (1L << (MAXVALUE - 256)) | (1L << (MEMBER - 256)) | (1L << (MERGE - 256)) | (1L << (MESSAGE_LENGTH - 256)) | (1L << (MESSAGE_OCTET_LENGTH - 256)) | (1L << (MESSAGE_TEXT - 256)) | (1L << (METHOD - 256)) | (1L << (MIN - 256)) | (1L << (MINUTE - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (MINVALUE - 320)) | (1L << (MOD - 320)) | (1L << (MODE - 320)) | (1L << (MODIFIES - 320)) | (1L << (MODULE - 320)) | (1L << (MONTH - 320)) | (1L << (MORE_ - 320)) | (1L << (MOVE - 320)) | (1L << (MULTISET - 320)) | (1L << (MUMPS - 320)) | (1L << (NAME - 320)) | (1L << (NAMES - 320)) | (1L << (NATIONAL - 320)) | (1L << (NCHAR - 320)) | (1L << (NCLOB - 320)) | (1L << (NESTING - 320)) | (1L << (NEW - 320)) | (1L << (NEXT - 320)) | (1L << (NO - 320)) | (1L << (NONE - 320)) | (1L << (NORMALIZE - 320)) | (1L << (NORMALIZED - 320)) | (1L << (NOT - 320)) | (1L << (NOTHING - 320)) | (1L << (NOTIFY - 320)) | (1L << (NOWAIT - 320)) | (1L << (NULL - 320)) | (1L << (NULLABLE - 320)) | (1L << (NULLIF - 320)) | (1L << (NULLS - 320)) | (1L << (NUMBER - 320)) | (1L << (NUMERIC - 320)) | (1L << (OBJECT - 320)) | (1L << (OCTETS - 320)) | (1L << (OCTET_LENGTH - 320)) | (1L << (OF - 320)) | (1L << (OFF - 320)) | (1L << (OIDS - 320)) | (1L << (OLD - 320)) | (1L << (OPEN - 320)) | (1L << (OPERATOR - 320)) | (1L << (OPTION - 320)) | (1L << (OPTIONS - 320)) | (1L << (ORDERING - 320)) | (1L << (ORDINALITY - 320)) | (1L << (OTHERS - 320)) | (1L << (OUT - 320)) | (1L << (OUTPUT - 320)) | (1L << (OVER - 320)) | (1L << (OVERLAY - 320)) | (1L << (OVERRIDING - 320)))) != 0) || ((((_la - 384)) & ~0x3f) == 0 && ((1L << (_la - 384)) & ((1L << (OWNER - 384)) | (1L << (PAD - 384)) | (1L << (PARAMETER - 384)) | (1L << (PARAMETER_MODE - 384)) | (1L << (PARAMETER_NAME - 384)) | (1L << (PARAMETER_ORDINAL_POSITION - 384)) | (1L << (PARAMETER_SPECIFIC_CATALOG - 384)) | (1L << (PARAMETER_SPECIFIC_NAME - 384)) | (1L << (PARAMETER_SPECIFIC_SCHEMA - 384)) | (1L << (PARTIAL - 384)) | (1L << (PARTITION - 384)) | (1L << (PASCAL - 384)) | (1L << (PASSWORD - 384)) | (1L << (PATH - 384)) | (1L << (PERCENTILE_CONT - 384)) | (1L << (PERCENTILE_DISC - 384)) | (1L << (PERCENT_RANK - 384)) | (1L << (PLI - 384)) | (1L << (POSITION - 384)) | (1L << (POWER - 384)) | (1L << (PRECEDING - 384)) | (1L << (PRECISION - 384)) | (1L << (PREPARE - 384)) | (1L << (PRESERVE - 384)) | (1L << (PRIOR - 384)) | (1L << (PRIVILEGES - 384)) | (1L << (PROCEDURAL - 384)) | (1L << (PROCEDURE - 384)) | (1L << (PUBLIC - 384)) | (1L << (QUOTE - 384)) | (1L << (RANGE - 384)) | (1L << (RANK - 384)) | (1L << (READ - 384)) | (1L << (READS - 384)) | (1L << (REAL - 384)) | (1L << (RECHECK - 384)) | (1L << (RECURSIVE - 384)) | (1L << (REF - 384)) | (1L << (REFERENCING - 384)) | (1L << (REGR_AVGX - 384)) | (1L << (REGR_AVGY - 384)) | (1L << (REGR_COUNT - 384)) | (1L << (REGR_INTERCEPT - 384)) | (1L << (REGR_SLOPE - 384)) | (1L << (REGR_SXX - 384)) | (1L << (REGR_SXY - 384)) | (1L << (REGR_SYY - 384)) | (1L << (REINDEX - 384)) | (1L << (RELATIVE - 384)) | (1L << (RELEASE - 384)) | (1L << (RENAME - 384)) | (1L << (REPEATABLE - 384)) | (1L << (REPLACE - 384)) | (1L << (RESET - 384)) | (1L << (RESTART - 384)) | (1L << (RESTRICT - 384)))) != 0) || ((((_la - 448)) & ~0x3f) == 0 && ((1L << (_la - 448)) & ((1L << (RESULT - 448)) | (1L << (RETURN - 448)) | (1L << (RETURNED_CARDINALITY - 448)) | (1L << (RETURNED_LENGTH - 448)) | (1L << (RETURNED_OCTET_LENGTH - 448)) | (1L << (RETURNED_SQLSTATE - 448)) | (1L << (RETURNS - 448)) | (1L << (REVOKE - 448)) | (1L << (RIGHT - 448)) | (1L << (ROLE - 448)) | (1L << (ROLLBACK - 448)) | (1L << (ROLLUP - 448)) | (1L << (ROUTINE - 448)) | (1L << (ROUTINE_CATALOG - 448)) | (1L << (ROUTINE_NAME - 448)) | (1L << (ROUTINE_SCHEMA - 448)) | (1L << (ROW - 448)) | (1L << (ROWS - 448)) | (1L << (ROW_COUNT - 448)) | (1L << (ROW_NUMBER - 448)) | (1L << (RULE - 448)) | (1L << (SAVEPOINT - 448)) | (1L << (SCALE - 448)) | (1L << (SCHEMA - 448)) | (1L << (SCHEMA_NAME - 448)) | (1L << (SCOPE - 448)) | (1L << (SCOPE_CATALOG - 448)) | (1L << (SCOPE_NAME - 448)) | (1L << (SCOPE_SCHEMA - 448)) | (1L << (SCROLL - 448)) | (1L << (SEARCH - 448)) | (1L << (SECOND - 448)) | (1L << (SECTION - 448)) | (1L << (SECURITY - 448)) | (1L << (SELF - 448)) | (1L << (SENSITIVE - 448)) | (1L << (SEQUENCE - 448)) | (1L << (SERIALIZABLE - 448)) | (1L << (SERVER_NAME - 448)) | (1L << (SESSION - 448)) | (1L << (SET - 448)) | (1L << (SETOF - 448)) | (1L << (SETS - 448)) | (1L << (SHARE - 448)) | (1L << (SHOW - 448)) | (1L << (SIMPLE - 448)) | (1L << (SIZE - 448)) | (1L << (SMALLINT - 448)) | (1L << (SOURCE - 448)) | (1L << (SPACE - 448)) | (1L << (SPECIFIC - 448)) | (1L << (SPECIFICTYPE - 448)) | (1L << (SPECIFIC_NAME - 448)) | (1L << (SQL - 448)) | (1L << (SQLCODE - 448)) | (1L << (SQLERROR - 448)) | (1L << (SQLEXCEPTION - 448)) | (1L << (SQLSTATE - 448)) | (1L << (SQLWARNING - 448)))) != 0) || ((((_la - 512)) & ~0x3f) == 0 && ((1L << (_la - 512)) & ((1L << (SQRT - 512)) | (1L << (STABLE - 512)) | (1L << (START - 512)) | (1L << (STATE - 512)) | (1L << (STATEMENT - 512)) | (1L << (STATIC - 512)) | (1L << (STATISTICS - 512)) | (1L << (STDDEV_POP - 512)) | (1L << (STDDEV_SAMP - 512)) | (1L << (STDIN - 512)) | (1L << (STDOUT - 512)) | (1L << (STORAGE - 512)) | (1L << (STRICT - 512)) | (1L << (STRUCTURE - 512)) | (1L << (STYLE - 512)) | (1L << (SUBCLASS_ORIGIN - 512)) | (1L << (SUBMULTISET - 512)) | (1L << (SUBSTRING - 512)) | (1L << (SUM - 512)) | (1L << (SYSID - 512)) | (1L << (SYSTEM - 512)) | (1L << (SYSTEM_USER - 512)) | (1L << (TABLESPACE - 512)) | (1L << (TABLE_NAME - 512)) | (1L << (TEMP - 512)) | (1L << (TEMPLATE - 512)) | (1L << (TEMPORARY - 512)) | (1L << (TIES - 512)) | (1L << (TIME - 512)) | (1L << (TIME_TZ - 512)) | (1L << (TIMESTAMP - 512)) | (1L << (TIMESTAMP_TZ - 512)) | (1L << (TIMEZONE_HOUR - 512)) | (1L << (TIMEZONE_MINUTE - 512)) | (1L << (TOP_LEVEL_COUNT - 512)) | (1L << (TRANSACTION - 512)) | (1L << (TRANSACTIONS_COMMITTED - 512)) | (1L << (TRANSACTIONS_ROLLED_BACK - 512)) | (1L << (TRANSACTION_ACTIVE - 512)) | (1L << (TRANSFORM - 512)) | (1L << (TRANSFORMS - 512)) | (1L << (TRANSLATE - 512)) | (1L << (TRANSLATION - 512)) | (1L << (TREAT - 512)) | (1L << (TRIGGER - 512)) | (1L << (TRIGGER_CATALOG - 512)) | (1L << (TRIGGER_NAME - 512)) | (1L << (TRIGGER_SCHEMA - 512)) | (1L << (TRIM - 512)) | (1L << (TRUE - 512)) | (1L << (TRUNCATE - 512)) | (1L << (TRUSTED - 512)) | (1L << (TYPE - 512)) | (1L << (UESCAPE - 512)))) != 0) || ((((_la - 576)) & ~0x3f) == 0 && ((1L << (_la - 576)) & ((1L << (UNBOUNDED - 576)) | (1L << (UNCOMMITTED - 576)) | (1L << (UNDER - 576)) | (1L << (UNENCRYPTED - 576)) | (1L << (UNKNOWN - 576)) | (1L << (UNLISTEN - 576)) | (1L << (UNNAMED - 576)) | (1L << (UNNEST - 576)) | (1L << (UNTIL - 576)) | (1L << (UPDATE - 576)) | (1L << (UPPER - 576)) | (1L << (USAGE - 576)) | (1L << (USER_DEFINED_TYPE_CATALOG - 576)) | (1L << (USER_DEFINED_TYPE_CODE - 576)) | (1L << (USER_DEFINED_TYPE_NAME - 576)) | (1L << (USER_DEFINED_TYPE_SCHEMA - 576)) | (1L << (VACUUM - 576)) | (1L << (VALID - 576)) | (1L << (VALIDATOR - 576)) | (1L << (VALUE - 576)) | (1L << (VALUES - 576)) | (1L << (VARCHAR - 576)) | (1L << (VARYING - 576)) | (1L << (VAR_POP - 576)) | (1L << (VAR_SAMP - 576)) | (1L << (VIEW - 576)) | (1L << (VOLATILE - 576)) | (1L << (WHENEVER - 576)) | (1L << (WIDTH_BUCKET - 576)) | (1L << (WITHIN - 576)) | (1L << (WITHOUT - 576)) | (1L << (WORK - 576)) | (1L << (WRITE - 576)) | (1L << (YEAR - 576)) | (1L << (ZONE - 576)))) != 0) || ((((_la - 686)) & ~0x3f) == 0 && ((1L << (_la - 686)) & ((1L << (ABSTIME - 686)) | (1L << (BOOL - 686)) | (1L << (BOX - 686)) | (1L << (FLOAT4 - 686)) | (1L << (FLOAT8 - 686)) | (1L << (INT2 - 686)) | (1L << (INT4 - 686)) | (1L << (INT8 - 686)) | (1L << (JSON - 686)) | (1L << (JSONB - 686)) | (1L << (LINE - 686)) | (1L << (POINT - 686)) | (1L << (RELTIME - 686)) | (1L << (TEXT - 686)) | (1L << (DOLLAR - 686)) | (1L << (DOLLAR_DOLLAR - 686)) | (1L << (OPEN_PAREN - 686)) | (1L << (BIT_STRING - 686)) | (1L << (REGEX_STRING - 686)) | (1L << (NUMERIC_LITERAL - 686)) | (1L << (INTEGER_LITERAL - 686)) | (1L << (HEX_INTEGER_LITERAL - 686)) | (1L << (SINGLEQ_STRING_LITERAL - 686)) | (1L << (DOUBLEQ_STRING_LITERAL - 686)) | (1L << (IDENTIFIER - 686)) | (1L << (AT_SIGN - 686)) | (1L << (BANG_BANG - 686)))) != 0) || ((((_la - 751)) & ~0x3f) == 0 && ((1L << (_la - 751)) & ((1L << (MINUS - 751)) | (1L << (PLUS - 751)) | (1L << (QMARK_HYPHEN - 751)) | (1L << (TIL - 751)))) != 0)) {
					{
					setState(2676);
					expr(0);
					setState(2681);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,255,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(2677);
							match(COMMA);
							setState(2678);
							expr(0);
							}
							} 
						}
						setState(2683);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,255,_ctx);
					}
					setState(2687);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(2684);
						match(COMMA);
						setState(2685);
						match(VARIADIC);
						setState(2686);
						expr(0);
						}
					}

					}
				}

				setState(2691);
				match(CLOSE_PAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2693);
				func_name();
				setState(2694);
				match(OPEN_PAREN);
				setState(2695);
				todo_fill_in();
				setState(2696);
				match(FROM);
				setState(2697);
				expr(0);
				setState(2698);
				match(CLOSE_PAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_cons_exprContext extends ParserRuleContext {
		public TerminalNode ARRAY() { return getToken(PostgreSQLParser.ARRAY, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(PostgreSQLParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(PostgreSQLParser.CLOSE_BRACKET, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PostgreSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PostgreSQLParser.COMMA, i);
		}
		public Array_cons_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_cons_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterArray_cons_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitArray_cons_expr(this);
		}
	}

	public final Array_cons_exprContext array_cons_expr() throws RecognitionException {
		Array_cons_exprContext _localctx = new Array_cons_exprContext(_ctx, getState());
		enterRule(_localctx, 432, RULE_array_cons_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2702);
			match(ARRAY);
			setState(2703);
			match(OPEN_BRACKET);
			setState(2712);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHITESPACE) | (1L << A_) | (1L << ABORT) | (1L << ABS) | (1L << ABSOLUTE) | (1L << ACCESS) | (1L << ACTION) | (1L << ADA) | (1L << ADD) | (1L << ADMIN) | (1L << AFTER) | (1L << AGGREGATE) | (1L << ALL) | (1L << ALLOCATE) | (1L << ALSO) | (1L << ALTER) | (1L << ALWAYS) | (1L << ARE) | (1L << ARRAY) | (1L << ASENSITIVE) | (1L << ASSERTION) | (1L << ASSIGNMENT) | (1L << AT) | (1L << ATOMIC) | (1L << ATTRIBUTE) | (1L << ATTRIBUTES) | (1L << AVG) | (1L << BACKWARD) | (1L << BEFORE) | (1L << BEGIN) | (1L << BERNOULLI) | (1L << BETWEEN) | (1L << BIGINT) | (1L << BIT) | (1L << BIT_LENGTH) | (1L << BLOB) | (1L << BOOLEAN) | (1L << BREADTH) | (1L << BY) | (1L << C_) | (1L << CACHE) | (1L << CALL) | (1L << CALLED) | (1L << CARDINALITY) | (1L << CASCADE) | (1L << CASCADED) | (1L << CASE) | (1L << CAST) | (1L << CATALOG))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CATALOG_NAME - 64)) | (1L << (CEIL - 64)) | (1L << (CEILING - 64)) | (1L << (CHAIN - 64)) | (1L << (CHAR - 64)) | (1L << (CHARACTER - 64)) | (1L << (CHARACTERISTICS - 64)) | (1L << (CHARACTERS - 64)) | (1L << (CHARACTER_LENGTH - 64)) | (1L << (CHARACTER_SET_CATALOG - 64)) | (1L << (CHARACTER_SET_NAME - 64)) | (1L << (CHARACTER_SET_SCHEMA - 64)) | (1L << (CHAR_LENGTH - 64)) | (1L << (CHECKPOINT - 64)) | (1L << (CLASS - 64)) | (1L << (CLASS_ORIGIN - 64)) | (1L << (CLOB - 64)) | (1L << (CLOSE - 64)) | (1L << (CLUSTER - 64)) | (1L << (COALESCE - 64)) | (1L << (COBOL - 64)) | (1L << (COLLATION_CATALOG - 64)) | (1L << (COLLATION_NAME - 64)) | (1L << (COLLATION_SCHEMA - 64)) | (1L << (COLLECT - 64)) | (1L << (COLUMN_NAME - 64)) | (1L << (COMMAND_FUNCTION - 64)) | (1L << (COMMAND_FUNCTION_CODE - 64)) | (1L << (COMMENT - 64)) | (1L << (COMMIT - 64)) | (1L << (COMMITTED - 64)) | (1L << (CONDITION - 64)) | (1L << (CONDITION_NUMBER - 64)) | (1L << (CONNECT - 64)) | (1L << (CONNECTION - 64)) | (1L << (CONNECTION_NAME - 64)) | (1L << (CONSTRAINTS - 64)) | (1L << (CONSTRAINT_CATALOG - 64)) | (1L << (CONSTRAINT_NAME - 64)) | (1L << (CONSTRAINT_SCHEMA - 64)) | (1L << (CONSTRUCTOR - 64)) | (1L << (CONTAINS - 64)) | (1L << (CONTINUE - 64)) | (1L << (CONVERSION - 64)) | (1L << (CONVERT - 64)) | (1L << (COPY - 64)) | (1L << (CORR - 64)) | (1L << (CORRESPONDING - 64)) | (1L << (COUNT - 64)) | (1L << (COVAR_POP - 64)) | (1L << (COVAR_SAMP - 64)) | (1L << (CSV - 64)) | (1L << (CUBE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (CUME_DIST - 128)) | (1L << (CURRENT - 128)) | (1L << (CURRENT_DATE - 128)) | (1L << (CURRENT_DEFAULT_TRANSFORM_GROUP - 128)) | (1L << (CURRENT_PATH - 128)) | (1L << (CURRENT_ROLE - 128)) | (1L << (CURRENT_TIME - 128)) | (1L << (CURRENT_TIMESTAMP - 128)) | (1L << (CURRENT_TRANSFORM_GROUP_FOR_TYPE - 128)) | (1L << (CURRENT_USER - 128)) | (1L << (CURSOR - 128)) | (1L << (CURSOR_NAME - 128)) | (1L << (CYCLE - 128)) | (1L << (DATA - 128)) | (1L << (DATABASE - 128)) | (1L << (DATE - 128)) | (1L << (DATETIME_INTERVAL_CODE - 128)) | (1L << (DATETIME_INTERVAL_PRECISION - 128)) | (1L << (DAY - 128)) | (1L << (DEALLOCATE - 128)) | (1L << (DEC - 128)) | (1L << (DECIMAL - 128)) | (1L << (DECLARE - 128)) | (1L << (DEFAULTS - 128)) | (1L << (DEFERRED - 128)) | (1L << (DEFINED - 128)) | (1L << (DEFINER - 128)) | (1L << (DEGREE - 128)) | (1L << (DELETE - 128)) | (1L << (DELIMITER - 128)) | (1L << (DELIMITERS - 128)) | (1L << (DENSE_RANK - 128)) | (1L << (DEPTH - 128)) | (1L << (DEREF - 128)) | (1L << (DERIVED - 128)) | (1L << (DESCRIBE - 128)) | (1L << (DESCRIPTOR - 128)) | (1L << (DETERMINISTIC - 128)) | (1L << (DIAGNOSTICS - 128)) | (1L << (DICTIONARY - 128)) | (1L << (DISCONNECT - 128)) | (1L << (DISPATCH - 128)) | (1L << (DOMAIN - 128)) | (1L << (DOUBLE - 128)) | (1L << (DROP - 128)) | (1L << (DYNAMIC - 128)) | (1L << (DYNAMIC_FUNCTION - 128)) | (1L << (DYNAMIC_FUNCTION_CODE - 128)) | (1L << (EACH - 128)) | (1L << (ELEMENT - 128)) | (1L << (ENCODING - 128)) | (1L << (ENCRYPTED - 128)) | (1L << (END - 128)) | (1L << (EQUALS - 128)) | (1L << (ESCAPE - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (EVERY - 192)) | (1L << (EXCEPTION - 192)) | (1L << (EXCLUDE - 192)) | (1L << (EXCLUDING - 192)) | (1L << (EXCLUSIVE - 192)) | (1L << (EXEC - 192)) | (1L << (EXECUTE - 192)) | (1L << (EXISTS - 192)) | (1L << (EXP - 192)) | (1L << (EXPLAIN - 192)) | (1L << (EXTERNAL - 192)) | (1L << (EXTRACT - 192)) | (1L << (FALSE - 192)) | (1L << (FILTER - 192)) | (1L << (FINAL - 192)) | (1L << (FIRST - 192)) | (1L << (FLOAT - 192)) | (1L << (FLOOR - 192)) | (1L << (FOLLOWING - 192)) | (1L << (FORCE - 192)) | (1L << (FORTRAN - 192)) | (1L << (FORWARD - 192)) | (1L << (FOUND - 192)) | (1L << (FREE - 192)) | (1L << (FUNCTION - 192)) | (1L << (FUSION - 192)) | (1L << (G_ - 192)) | (1L << (GENERAL - 192)) | (1L << (GENERATED - 192)) | (1L << (GET - 192)) | (1L << (GLOBAL - 192)) | (1L << (GO - 192)) | (1L << (GOTO - 192)) | (1L << (GRANTED - 192)) | (1L << (GROUPING - 192)) | (1L << (HANDLER - 192)) | (1L << (HIERARCHY - 192)) | (1L << (HOLD - 192)) | (1L << (HOUR - 192)) | (1L << (IDENTITY - 192)) | (1L << (IGNORE - 192)) | (1L << (IMMEDIATE - 192)) | (1L << (IMMUTABLE - 192)) | (1L << (IMPLEMENTATION - 192)) | (1L << (IMPLICIT - 192)) | (1L << (INCLUDING - 192)) | (1L << (INCREMENT - 192)) | (1L << (INDEX - 192)) | (1L << (INDICATOR - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (INHERITS - 256)) | (1L << (INOUT - 256)) | (1L << (INPUT - 256)) | (1L << (INSENSITIVE - 256)) | (1L << (INSERT - 256)) | (1L << (INSTANCE - 256)) | (1L << (INSTANTIABLE - 256)) | (1L << (INSTEAD - 256)) | (1L << (INT - 256)) | (1L << (INTEGER - 256)) | (1L << (INTERSECTION - 256)) | (1L << (INTERVAL - 256)) | (1L << (INVOKER - 256)) | (1L << (ISOLATION - 256)) | (1L << (KEY - 256)) | (1L << (KEY_MEMBER - 256)) | (1L << (KEY_TYPE - 256)) | (1L << (LANGUAGE - 256)) | (1L << (LARGE - 256)) | (1L << (LAST - 256)) | (1L << (LEFT - 256)) | (1L << (LENGTH - 256)) | (1L << (LEVEL - 256)) | (1L << (LISTEN - 256)) | (1L << (LN - 256)) | (1L << (LOAD - 256)) | (1L << (LOCAL - 256)) | (1L << (LOCATION - 256)) | (1L << (LOCATOR - 256)) | (1L << (LOCK - 256)) | (1L << (LOCKED - 256)) | (1L << (LOWER - 256)) | (1L << (M_ - 256)) | (1L << (MAP - 256)) | (1L << (MATCH - 256)) | (1L << (MATCHED - 256)) | (1L << (MAX - 256)) | (1L << (MAXVALUE - 256)) | (1L << (MEMBER - 256)) | (1L << (MERGE - 256)) | (1L << (MESSAGE_LENGTH - 256)) | (1L << (MESSAGE_OCTET_LENGTH - 256)) | (1L << (MESSAGE_TEXT - 256)) | (1L << (METHOD - 256)) | (1L << (MIN - 256)) | (1L << (MINUTE - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (MINVALUE - 320)) | (1L << (MOD - 320)) | (1L << (MODE - 320)) | (1L << (MODIFIES - 320)) | (1L << (MODULE - 320)) | (1L << (MONTH - 320)) | (1L << (MORE_ - 320)) | (1L << (MOVE - 320)) | (1L << (MULTISET - 320)) | (1L << (MUMPS - 320)) | (1L << (NAME - 320)) | (1L << (NAMES - 320)) | (1L << (NATIONAL - 320)) | (1L << (NCHAR - 320)) | (1L << (NCLOB - 320)) | (1L << (NESTING - 320)) | (1L << (NEW - 320)) | (1L << (NEXT - 320)) | (1L << (NO - 320)) | (1L << (NONE - 320)) | (1L << (NORMALIZE - 320)) | (1L << (NORMALIZED - 320)) | (1L << (NOT - 320)) | (1L << (NOTHING - 320)) | (1L << (NOTIFY - 320)) | (1L << (NOWAIT - 320)) | (1L << (NULL - 320)) | (1L << (NULLABLE - 320)) | (1L << (NULLIF - 320)) | (1L << (NULLS - 320)) | (1L << (NUMBER - 320)) | (1L << (NUMERIC - 320)) | (1L << (OBJECT - 320)) | (1L << (OCTETS - 320)) | (1L << (OCTET_LENGTH - 320)) | (1L << (OF - 320)) | (1L << (OFF - 320)) | (1L << (OIDS - 320)) | (1L << (OLD - 320)) | (1L << (OPEN - 320)) | (1L << (OPERATOR - 320)) | (1L << (OPTION - 320)) | (1L << (OPTIONS - 320)) | (1L << (ORDERING - 320)) | (1L << (ORDINALITY - 320)) | (1L << (OTHERS - 320)) | (1L << (OUT - 320)) | (1L << (OUTPUT - 320)) | (1L << (OVER - 320)) | (1L << (OVERLAY - 320)) | (1L << (OVERRIDING - 320)))) != 0) || ((((_la - 384)) & ~0x3f) == 0 && ((1L << (_la - 384)) & ((1L << (OWNER - 384)) | (1L << (PAD - 384)) | (1L << (PARAMETER - 384)) | (1L << (PARAMETER_MODE - 384)) | (1L << (PARAMETER_NAME - 384)) | (1L << (PARAMETER_ORDINAL_POSITION - 384)) | (1L << (PARAMETER_SPECIFIC_CATALOG - 384)) | (1L << (PARAMETER_SPECIFIC_NAME - 384)) | (1L << (PARAMETER_SPECIFIC_SCHEMA - 384)) | (1L << (PARTIAL - 384)) | (1L << (PARTITION - 384)) | (1L << (PASCAL - 384)) | (1L << (PASSWORD - 384)) | (1L << (PATH - 384)) | (1L << (PERCENTILE_CONT - 384)) | (1L << (PERCENTILE_DISC - 384)) | (1L << (PERCENT_RANK - 384)) | (1L << (PLI - 384)) | (1L << (POSITION - 384)) | (1L << (POWER - 384)) | (1L << (PRECEDING - 384)) | (1L << (PRECISION - 384)) | (1L << (PREPARE - 384)) | (1L << (PRESERVE - 384)) | (1L << (PRIOR - 384)) | (1L << (PRIVILEGES - 384)) | (1L << (PROCEDURAL - 384)) | (1L << (PROCEDURE - 384)) | (1L << (PUBLIC - 384)) | (1L << (QUOTE - 384)) | (1L << (RANGE - 384)) | (1L << (RANK - 384)) | (1L << (READ - 384)) | (1L << (READS - 384)) | (1L << (REAL - 384)) | (1L << (RECHECK - 384)) | (1L << (RECURSIVE - 384)) | (1L << (REF - 384)) | (1L << (REFERENCING - 384)) | (1L << (REGR_AVGX - 384)) | (1L << (REGR_AVGY - 384)) | (1L << (REGR_COUNT - 384)) | (1L << (REGR_INTERCEPT - 384)) | (1L << (REGR_SLOPE - 384)) | (1L << (REGR_SXX - 384)) | (1L << (REGR_SXY - 384)) | (1L << (REGR_SYY - 384)) | (1L << (REINDEX - 384)) | (1L << (RELATIVE - 384)) | (1L << (RELEASE - 384)) | (1L << (RENAME - 384)) | (1L << (REPEATABLE - 384)) | (1L << (REPLACE - 384)) | (1L << (RESET - 384)) | (1L << (RESTART - 384)) | (1L << (RESTRICT - 384)))) != 0) || ((((_la - 448)) & ~0x3f) == 0 && ((1L << (_la - 448)) & ((1L << (RESULT - 448)) | (1L << (RETURN - 448)) | (1L << (RETURNED_CARDINALITY - 448)) | (1L << (RETURNED_LENGTH - 448)) | (1L << (RETURNED_OCTET_LENGTH - 448)) | (1L << (RETURNED_SQLSTATE - 448)) | (1L << (RETURNS - 448)) | (1L << (REVOKE - 448)) | (1L << (RIGHT - 448)) | (1L << (ROLE - 448)) | (1L << (ROLLBACK - 448)) | (1L << (ROLLUP - 448)) | (1L << (ROUTINE - 448)) | (1L << (ROUTINE_CATALOG - 448)) | (1L << (ROUTINE_NAME - 448)) | (1L << (ROUTINE_SCHEMA - 448)) | (1L << (ROW - 448)) | (1L << (ROWS - 448)) | (1L << (ROW_COUNT - 448)) | (1L << (ROW_NUMBER - 448)) | (1L << (RULE - 448)) | (1L << (SAVEPOINT - 448)) | (1L << (SCALE - 448)) | (1L << (SCHEMA - 448)) | (1L << (SCHEMA_NAME - 448)) | (1L << (SCOPE - 448)) | (1L << (SCOPE_CATALOG - 448)) | (1L << (SCOPE_NAME - 448)) | (1L << (SCOPE_SCHEMA - 448)) | (1L << (SCROLL - 448)) | (1L << (SEARCH - 448)) | (1L << (SECOND - 448)) | (1L << (SECTION - 448)) | (1L << (SECURITY - 448)) | (1L << (SELF - 448)) | (1L << (SENSITIVE - 448)) | (1L << (SEQUENCE - 448)) | (1L << (SERIALIZABLE - 448)) | (1L << (SERVER_NAME - 448)) | (1L << (SESSION - 448)) | (1L << (SET - 448)) | (1L << (SETOF - 448)) | (1L << (SETS - 448)) | (1L << (SHARE - 448)) | (1L << (SHOW - 448)) | (1L << (SIMPLE - 448)) | (1L << (SIZE - 448)) | (1L << (SMALLINT - 448)) | (1L << (SOURCE - 448)) | (1L << (SPACE - 448)) | (1L << (SPECIFIC - 448)) | (1L << (SPECIFICTYPE - 448)) | (1L << (SPECIFIC_NAME - 448)) | (1L << (SQL - 448)) | (1L << (SQLCODE - 448)) | (1L << (SQLERROR - 448)) | (1L << (SQLEXCEPTION - 448)) | (1L << (SQLSTATE - 448)) | (1L << (SQLWARNING - 448)))) != 0) || ((((_la - 512)) & ~0x3f) == 0 && ((1L << (_la - 512)) & ((1L << (SQRT - 512)) | (1L << (STABLE - 512)) | (1L << (START - 512)) | (1L << (STATE - 512)) | (1L << (STATEMENT - 512)) | (1L << (STATIC - 512)) | (1L << (STATISTICS - 512)) | (1L << (STDDEV_POP - 512)) | (1L << (STDDEV_SAMP - 512)) | (1L << (STDIN - 512)) | (1L << (STDOUT - 512)) | (1L << (STORAGE - 512)) | (1L << (STRICT - 512)) | (1L << (STRUCTURE - 512)) | (1L << (STYLE - 512)) | (1L << (SUBCLASS_ORIGIN - 512)) | (1L << (SUBMULTISET - 512)) | (1L << (SUBSTRING - 512)) | (1L << (SUM - 512)) | (1L << (SYSID - 512)) | (1L << (SYSTEM - 512)) | (1L << (SYSTEM_USER - 512)) | (1L << (TABLESPACE - 512)) | (1L << (TABLE_NAME - 512)) | (1L << (TEMP - 512)) | (1L << (TEMPLATE - 512)) | (1L << (TEMPORARY - 512)) | (1L << (TIES - 512)) | (1L << (TIME - 512)) | (1L << (TIME_TZ - 512)) | (1L << (TIMESTAMP - 512)) | (1L << (TIMESTAMP_TZ - 512)) | (1L << (TIMEZONE_HOUR - 512)) | (1L << (TIMEZONE_MINUTE - 512)) | (1L << (TOP_LEVEL_COUNT - 512)) | (1L << (TRANSACTION - 512)) | (1L << (TRANSACTIONS_COMMITTED - 512)) | (1L << (TRANSACTIONS_ROLLED_BACK - 512)) | (1L << (TRANSACTION_ACTIVE - 512)) | (1L << (TRANSFORM - 512)) | (1L << (TRANSFORMS - 512)) | (1L << (TRANSLATE - 512)) | (1L << (TRANSLATION - 512)) | (1L << (TREAT - 512)) | (1L << (TRIGGER - 512)) | (1L << (TRIGGER_CATALOG - 512)) | (1L << (TRIGGER_NAME - 512)) | (1L << (TRIGGER_SCHEMA - 512)) | (1L << (TRIM - 512)) | (1L << (TRUE - 512)) | (1L << (TRUNCATE - 512)) | (1L << (TRUSTED - 512)) | (1L << (TYPE - 512)) | (1L << (UESCAPE - 512)))) != 0) || ((((_la - 576)) & ~0x3f) == 0 && ((1L << (_la - 576)) & ((1L << (UNBOUNDED - 576)) | (1L << (UNCOMMITTED - 576)) | (1L << (UNDER - 576)) | (1L << (UNENCRYPTED - 576)) | (1L << (UNKNOWN - 576)) | (1L << (UNLISTEN - 576)) | (1L << (UNNAMED - 576)) | (1L << (UNNEST - 576)) | (1L << (UNTIL - 576)) | (1L << (UPDATE - 576)) | (1L << (UPPER - 576)) | (1L << (USAGE - 576)) | (1L << (USER_DEFINED_TYPE_CATALOG - 576)) | (1L << (USER_DEFINED_TYPE_CODE - 576)) | (1L << (USER_DEFINED_TYPE_NAME - 576)) | (1L << (USER_DEFINED_TYPE_SCHEMA - 576)) | (1L << (VACUUM - 576)) | (1L << (VALID - 576)) | (1L << (VALIDATOR - 576)) | (1L << (VALUE - 576)) | (1L << (VALUES - 576)) | (1L << (VARCHAR - 576)) | (1L << (VARYING - 576)) | (1L << (VAR_POP - 576)) | (1L << (VAR_SAMP - 576)) | (1L << (VIEW - 576)) | (1L << (VOLATILE - 576)) | (1L << (WHENEVER - 576)) | (1L << (WIDTH_BUCKET - 576)) | (1L << (WITHIN - 576)) | (1L << (WITHOUT - 576)) | (1L << (WORK - 576)) | (1L << (WRITE - 576)) | (1L << (YEAR - 576)) | (1L << (ZONE - 576)))) != 0) || ((((_la - 686)) & ~0x3f) == 0 && ((1L << (_la - 686)) & ((1L << (ABSTIME - 686)) | (1L << (BOOL - 686)) | (1L << (BOX - 686)) | (1L << (FLOAT4 - 686)) | (1L << (FLOAT8 - 686)) | (1L << (INT2 - 686)) | (1L << (INT4 - 686)) | (1L << (INT8 - 686)) | (1L << (JSON - 686)) | (1L << (JSONB - 686)) | (1L << (LINE - 686)) | (1L << (POINT - 686)) | (1L << (RELTIME - 686)) | (1L << (TEXT - 686)) | (1L << (DOLLAR - 686)) | (1L << (DOLLAR_DOLLAR - 686)) | (1L << (OPEN_PAREN - 686)) | (1L << (BIT_STRING - 686)) | (1L << (REGEX_STRING - 686)) | (1L << (NUMERIC_LITERAL - 686)) | (1L << (INTEGER_LITERAL - 686)) | (1L << (HEX_INTEGER_LITERAL - 686)) | (1L << (SINGLEQ_STRING_LITERAL - 686)) | (1L << (DOUBLEQ_STRING_LITERAL - 686)) | (1L << (IDENTIFIER - 686)) | (1L << (AT_SIGN - 686)) | (1L << (BANG_BANG - 686)))) != 0) || ((((_la - 751)) & ~0x3f) == 0 && ((1L << (_la - 751)) & ((1L << (MINUS - 751)) | (1L << (PLUS - 751)) | (1L << (QMARK_HYPHEN - 751)) | (1L << (TIL - 751)))) != 0)) {
				{
				setState(2704);
				expr(0);
				setState(2709);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2705);
					match(COMMA);
					setState(2706);
					expr(0);
					}
					}
					setState(2711);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(2714);
			match(CLOSE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_itemContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode ONLY() { return getToken(PostgreSQLParser.ONLY, 0); }
		public TerminalNode STAR() { return getToken(PostgreSQLParser.STAR, 0); }
		public With_column_aliasContext with_column_alias() {
			return getRuleContext(With_column_aliasContext.class,0);
		}
		public TerminalNode TABLESAMPLE() { return getToken(PostgreSQLParser.TABLESAMPLE, 0); }
		public List<Todo_fill_inContext> todo_fill_in() {
			return getRuleContexts(Todo_fill_inContext.class);
		}
		public Todo_fill_inContext todo_fill_in(int i) {
			return getRuleContext(Todo_fill_inContext.class,i);
		}
		public List<TerminalNode> OPEN_PAREN() { return getTokens(PostgreSQLParser.OPEN_PAREN); }
		public TerminalNode OPEN_PAREN(int i) {
			return getToken(PostgreSQLParser.OPEN_PAREN, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> CLOSE_PAREN() { return getTokens(PostgreSQLParser.CLOSE_PAREN); }
		public TerminalNode CLOSE_PAREN(int i) {
			return getToken(PostgreSQLParser.CLOSE_PAREN, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PostgreSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PostgreSQLParser.COMMA, i);
		}
		public TerminalNode REPEATABLE() { return getToken(PostgreSQLParser.REPEATABLE, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public TerminalNode LATERAL() { return getToken(PostgreSQLParser.LATERAL, 0); }
		public TerminalNode AS() { return getToken(PostgreSQLParser.AS, 0); }
		public List<Column_aliasContext> column_alias() {
			return getRuleContexts(Column_aliasContext.class);
		}
		public Column_aliasContext column_alias(int i) {
			return getRuleContext(Column_aliasContext.class,i);
		}
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public TerminalNode WITH() { return getToken(PostgreSQLParser.WITH, 0); }
		public TerminalNode ORDINALITY() { return getToken(PostgreSQLParser.ORDINALITY, 0); }
		public List<Column_definitionContext> column_definition() {
			return getRuleContexts(Column_definitionContext.class);
		}
		public Column_definitionContext column_definition(int i) {
			return getRuleContext(Column_definitionContext.class,i);
		}
		public TerminalNode ROWS() { return getToken(PostgreSQLParser.ROWS, 0); }
		public TerminalNode FROM() { return getToken(PostgreSQLParser.FROM, 0); }
		public List<From_itemContext> from_item() {
			return getRuleContexts(From_itemContext.class);
		}
		public From_itemContext from_item(int i) {
			return getRuleContext(From_itemContext.class,i);
		}
		public Join_typeContext join_type() {
			return getRuleContext(Join_typeContext.class,0);
		}
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public TerminalNode NATURAL() { return getToken(PostgreSQLParser.NATURAL, 0); }
		public From_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterFrom_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitFrom_item(this);
		}
	}

	public final From_itemContext from_item() throws RecognitionException {
		return from_item(0);
	}

	private From_itemContext from_item(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		From_itemContext _localctx = new From_itemContext(_ctx, _parentState);
		From_itemContext _prevctx = _localctx;
		int _startState = 434;
		enterRecursionRule(_localctx, 434, RULE_from_item, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2822);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,279,_ctx) ) {
			case 1:
				{
				setState(2718);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ONLY) {
					{
					setState(2717);
					match(ONLY);
					}
				}

				setState(2720);
				table_name();
				setState(2722);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,262,_ctx) ) {
				case 1:
					{
					setState(2721);
					match(STAR);
					}
					break;
				}
				setState(2725);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,263,_ctx) ) {
				case 1:
					{
					setState(2724);
					with_column_alias();
					}
					break;
				}
				setState(2746);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,266,_ctx) ) {
				case 1:
					{
					setState(2727);
					match(TABLESAMPLE);
					setState(2728);
					todo_fill_in();
					setState(2729);
					match(OPEN_PAREN);
					setState(2730);
					expr(0);
					setState(2735);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(2731);
						match(COMMA);
						setState(2732);
						expr(0);
						}
						}
						setState(2737);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2738);
					match(CLOSE_PAREN);
					setState(2744);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,265,_ctx) ) {
					case 1:
						{
						setState(2739);
						match(REPEATABLE);
						setState(2740);
						match(OPEN_PAREN);
						setState(2741);
						todo_fill_in();
						setState(2742);
						match(CLOSE_PAREN);
						}
						break;
					}
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(2749);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LATERAL) {
					{
					setState(2748);
					match(LATERAL);
					}
				}

				setState(2751);
				match(OPEN_PAREN);
				setState(2752);
				stmt();
				setState(2753);
				match(CLOSE_PAREN);
				setState(2755);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(2754);
					match(AS);
					}
				}

				setState(2757);
				alias();
				setState(2769);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,270,_ctx) ) {
				case 1:
					{
					setState(2758);
					match(OPEN_PAREN);
					setState(2759);
					column_alias();
					setState(2764);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(2760);
						match(COMMA);
						setState(2761);
						column_alias();
						}
						}
						setState(2766);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2767);
					match(CLOSE_PAREN);
					}
					break;
				}
				}
				break;
			case 3:
				{
				setState(2772);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LATERAL) {
					{
					setState(2771);
					match(LATERAL);
					}
				}

				setState(2774);
				func_call();
				setState(2777);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,272,_ctx) ) {
				case 1:
					{
					setState(2775);
					match(WITH);
					setState(2776);
					match(ORDINALITY);
					}
					break;
				}
				setState(2780);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,273,_ctx) ) {
				case 1:
					{
					setState(2779);
					with_column_alias();
					}
					break;
				}
				}
				break;
			case 4:
				{
				setState(2783);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LATERAL) {
					{
					setState(2782);
					match(LATERAL);
					}
				}

				setState(2785);
				func_call();
				setState(2786);
				match(AS);
				setState(2787);
				match(OPEN_PAREN);
				setState(2788);
				column_definition();
				setState(2793);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2789);
					match(COMMA);
					setState(2790);
					column_definition();
					}
					}
					setState(2795);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2796);
				match(CLOSE_PAREN);
				}
				break;
			case 5:
				{
				setState(2799);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LATERAL) {
					{
					setState(2798);
					match(LATERAL);
					}
				}

				setState(2801);
				match(ROWS);
				setState(2802);
				match(FROM);
				setState(2803);
				match(OPEN_PAREN);
				setState(2804);
				func_call();
				setState(2805);
				match(CLOSE_PAREN);
				setState(2818);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(2806);
					match(AS);
					setState(2807);
					match(OPEN_PAREN);
					setState(2808);
					column_definition();
					setState(2813);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(2809);
						match(COMMA);
						setState(2810);
						column_definition();
						}
						}
						setState(2815);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2816);
					match(CLOSE_PAREN);
					}
				}

				setState(2820);
				match(CLOSE_PAREN);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2834);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,281,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new From_itemContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_from_item);
					setState(2824);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2826);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NATURAL) {
						{
						setState(2825);
						match(NATURAL);
						}
					}

					setState(2828);
					join_type();
					setState(2829);
					from_item(0);
					setState(2830);
					join_clause();
					}
					} 
				}
				setState(2836);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,281,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class With_column_aliasContext extends ParserRuleContext {
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public TerminalNode AS() { return getToken(PostgreSQLParser.AS, 0); }
		public List<Column_aliasContext> column_alias() {
			return getRuleContexts(Column_aliasContext.class);
		}
		public Column_aliasContext column_alias(int i) {
			return getRuleContext(Column_aliasContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PostgreSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PostgreSQLParser.COMMA, i);
		}
		public With_column_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_column_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterWith_column_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitWith_column_alias(this);
		}
	}

	public final With_column_aliasContext with_column_alias() throws RecognitionException {
		With_column_aliasContext _localctx = new With_column_aliasContext(_ctx, getState());
		enterRule(_localctx, 436, RULE_with_column_alias);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2838);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(2837);
				match(AS);
				}
			}

			setState(2840);
			alias();
			setState(2849);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,284,_ctx) ) {
			case 1:
				{
				setState(2841);
				column_alias();
				setState(2846);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,283,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2842);
						match(COMMA);
						setState(2843);
						column_alias();
						}
						} 
					}
					setState(2848);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,283,_ctx);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Join_typeContext extends ParserRuleContext {
		public TerminalNode JOIN() { return getToken(PostgreSQLParser.JOIN, 0); }
		public TerminalNode INNER() { return getToken(PostgreSQLParser.INNER, 0); }
		public TerminalNode LEFT() { return getToken(PostgreSQLParser.LEFT, 0); }
		public TerminalNode OUTER() { return getToken(PostgreSQLParser.OUTER, 0); }
		public TerminalNode RIGHT() { return getToken(PostgreSQLParser.RIGHT, 0); }
		public TerminalNode FULL() { return getToken(PostgreSQLParser.FULL, 0); }
		public TerminalNode CROSS() { return getToken(PostgreSQLParser.CROSS, 0); }
		public Join_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterJoin_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitJoin_type(this);
		}
	}

	public final Join_typeContext join_type() throws RecognitionException {
		Join_typeContext _localctx = new Join_typeContext(_ctx, getState());
		enterRule(_localctx, 438, RULE_join_type);
		int _la;
		try {
			setState(2872);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INNER:
			case JOIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(2852);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INNER) {
					{
					setState(2851);
					match(INNER);
					}
				}

				setState(2854);
				match(JOIN);
				}
				break;
			case LEFT:
				enterOuterAlt(_localctx, 2);
				{
				setState(2855);
				match(LEFT);
				setState(2857);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(2856);
					match(OUTER);
					}
				}

				setState(2859);
				match(JOIN);
				}
				break;
			case RIGHT:
				enterOuterAlt(_localctx, 3);
				{
				setState(2860);
				match(RIGHT);
				setState(2862);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(2861);
					match(OUTER);
					}
				}

				setState(2864);
				match(JOIN);
				}
				break;
			case FULL:
				enterOuterAlt(_localctx, 4);
				{
				setState(2865);
				match(FULL);
				setState(2867);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(2866);
					match(OUTER);
					}
				}

				setState(2869);
				match(JOIN);
				}
				break;
			case CROSS:
				enterOuterAlt(_localctx, 5);
				{
				setState(2870);
				match(CROSS);
				setState(2871);
				match(JOIN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Join_clauseContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(PostgreSQLParser.ON, 0); }
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public TerminalNode USING() { return getToken(PostgreSQLParser.USING, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(PostgreSQLParser.OPEN_PAREN, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(PostgreSQLParser.CLOSE_PAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(PostgreSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PostgreSQLParser.COMMA, i);
		}
		public Join_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterJoin_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitJoin_clause(this);
		}
	}

	public final Join_clauseContext join_clause() throws RecognitionException {
		Join_clauseContext _localctx = new Join_clauseContext(_ctx, getState());
		enterRule(_localctx, 440, RULE_join_clause);
		int _la;
		try {
			setState(2888);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(2874);
				match(ON);
				setState(2875);
				predicate(0);
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 2);
				{
				setState(2876);
				match(USING);
				setState(2877);
				match(OPEN_PAREN);
				setState(2878);
				column_name();
				setState(2883);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2879);
					match(COMMA);
					setState(2880);
					column_name();
					}
					}
					setState(2885);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2886);
				match(CLOSE_PAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PredicateContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OperContext oper() {
			return getRuleContext(OperContext.class,0);
		}
		public TerminalNode IS() { return getToken(PostgreSQLParser.IS, 0); }
		public TerminalNode NULL() { return getToken(PostgreSQLParser.NULL, 0); }
		public TerminalNode NOT() { return getToken(PostgreSQLParser.NOT, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(PostgreSQLParser.OPEN_PAREN, 0); }
		public List<PredicateContext> predicate() {
			return getRuleContexts(PredicateContext.class);
		}
		public PredicateContext predicate(int i) {
			return getRuleContext(PredicateContext.class,i);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(PostgreSQLParser.CLOSE_PAREN, 0); }
		public TerminalNode EXISTS() { return getToken(PostgreSQLParser.EXISTS, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode AND() { return getToken(PostgreSQLParser.AND, 0); }
		public TerminalNode OR() { return getToken(PostgreSQLParser.OR, 0); }
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitPredicate(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		return predicate(0);
	}

	private PredicateContext predicate(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PredicateContext _localctx = new PredicateContext(_ctx, _parentState);
		PredicateContext _prevctx = _localctx;
		int _startState = 442;
		enterRecursionRule(_localctx, 442, RULE_predicate, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2914);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,293,_ctx) ) {
			case 1:
				{
				setState(2891);
				expr(0);
				}
				break;
			case 2:
				{
				setState(2892);
				expr(0);
				setState(2893);
				oper();
				setState(2894);
				expr(0);
				}
				break;
			case 3:
				{
				setState(2896);
				expr(0);
				{
				setState(2897);
				match(IS);
				setState(2899);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2898);
					match(NOT);
					}
				}

				setState(2901);
				match(NULL);
				}
				}
				break;
			case 4:
				{
				setState(2903);
				match(OPEN_PAREN);
				setState(2904);
				predicate(0);
				setState(2905);
				match(CLOSE_PAREN);
				}
				break;
			case 5:
				{
				setState(2907);
				match(EXISTS);
				setState(2908);
				match(OPEN_PAREN);
				setState(2909);
				select_stmt();
				setState(2910);
				match(CLOSE_PAREN);
				}
				break;
			case 6:
				{
				setState(2912);
				match(NOT);
				setState(2913);
				predicate(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2924);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,295,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2922);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,294,_ctx) ) {
					case 1:
						{
						_localctx = new PredicateContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_predicate);
						setState(2916);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2917);
						match(AND);
						setState(2918);
						predicate(4);
						}
						break;
					case 2:
						{
						_localctx = new PredicateContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_predicate);
						setState(2919);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2920);
						match(OR);
						setState(2921);
						predicate(3);
						}
						break;
					}
					} 
				}
				setState(2926);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,295,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Non_reserved_keywordContext extends ParserRuleContext {
		public TerminalNode A_() { return getToken(PostgreSQLParser.A_, 0); }
		public TerminalNode ABORT() { return getToken(PostgreSQLParser.ABORT, 0); }
		public TerminalNode ABS() { return getToken(PostgreSQLParser.ABS, 0); }
		public TerminalNode ABSOLUTE() { return getToken(PostgreSQLParser.ABSOLUTE, 0); }
		public TerminalNode ACCESS() { return getToken(PostgreSQLParser.ACCESS, 0); }
		public TerminalNode ACTION() { return getToken(PostgreSQLParser.ACTION, 0); }
		public TerminalNode ADA() { return getToken(PostgreSQLParser.ADA, 0); }
		public TerminalNode ADD() { return getToken(PostgreSQLParser.ADD, 0); }
		public TerminalNode ADMIN() { return getToken(PostgreSQLParser.ADMIN, 0); }
		public TerminalNode AFTER() { return getToken(PostgreSQLParser.AFTER, 0); }
		public TerminalNode AGGREGATE() { return getToken(PostgreSQLParser.AGGREGATE, 0); }
		public TerminalNode ALLOCATE() { return getToken(PostgreSQLParser.ALLOCATE, 0); }
		public TerminalNode ALSO() { return getToken(PostgreSQLParser.ALSO, 0); }
		public TerminalNode ALTER() { return getToken(PostgreSQLParser.ALTER, 0); }
		public TerminalNode ALWAYS() { return getToken(PostgreSQLParser.ALWAYS, 0); }
		public TerminalNode ARE() { return getToken(PostgreSQLParser.ARE, 0); }
		public TerminalNode ASENSITIVE() { return getToken(PostgreSQLParser.ASENSITIVE, 0); }
		public TerminalNode ASSERTION() { return getToken(PostgreSQLParser.ASSERTION, 0); }
		public TerminalNode ASSIGNMENT() { return getToken(PostgreSQLParser.ASSIGNMENT, 0); }
		public TerminalNode AT() { return getToken(PostgreSQLParser.AT, 0); }
		public TerminalNode ATOMIC() { return getToken(PostgreSQLParser.ATOMIC, 0); }
		public TerminalNode ATTRIBUTE() { return getToken(PostgreSQLParser.ATTRIBUTE, 0); }
		public TerminalNode ATTRIBUTES() { return getToken(PostgreSQLParser.ATTRIBUTES, 0); }
		public TerminalNode AVG() { return getToken(PostgreSQLParser.AVG, 0); }
		public TerminalNode BACKWARD() { return getToken(PostgreSQLParser.BACKWARD, 0); }
		public TerminalNode BEFORE() { return getToken(PostgreSQLParser.BEFORE, 0); }
		public TerminalNode BEGIN() { return getToken(PostgreSQLParser.BEGIN, 0); }
		public TerminalNode BERNOULLI() { return getToken(PostgreSQLParser.BERNOULLI, 0); }
		public TerminalNode BETWEEN() { return getToken(PostgreSQLParser.BETWEEN, 0); }
		public TerminalNode BIGINT() { return getToken(PostgreSQLParser.BIGINT, 0); }
		public TerminalNode BIT() { return getToken(PostgreSQLParser.BIT, 0); }
		public TerminalNode BIT_LENGTH() { return getToken(PostgreSQLParser.BIT_LENGTH, 0); }
		public TerminalNode BLOB() { return getToken(PostgreSQLParser.BLOB, 0); }
		public TerminalNode BOOLEAN() { return getToken(PostgreSQLParser.BOOLEAN, 0); }
		public TerminalNode BREADTH() { return getToken(PostgreSQLParser.BREADTH, 0); }
		public TerminalNode BY() { return getToken(PostgreSQLParser.BY, 0); }
		public TerminalNode C_() { return getToken(PostgreSQLParser.C_, 0); }
		public TerminalNode CACHE() { return getToken(PostgreSQLParser.CACHE, 0); }
		public TerminalNode CALL() { return getToken(PostgreSQLParser.CALL, 0); }
		public TerminalNode CALLED() { return getToken(PostgreSQLParser.CALLED, 0); }
		public TerminalNode CARDINALITY() { return getToken(PostgreSQLParser.CARDINALITY, 0); }
		public TerminalNode CASCADE() { return getToken(PostgreSQLParser.CASCADE, 0); }
		public TerminalNode CASCADED() { return getToken(PostgreSQLParser.CASCADED, 0); }
		public TerminalNode CATALOG() { return getToken(PostgreSQLParser.CATALOG, 0); }
		public TerminalNode CATALOG_NAME() { return getToken(PostgreSQLParser.CATALOG_NAME, 0); }
		public TerminalNode CEIL() { return getToken(PostgreSQLParser.CEIL, 0); }
		public TerminalNode CEILING() { return getToken(PostgreSQLParser.CEILING, 0); }
		public TerminalNode CHAIN() { return getToken(PostgreSQLParser.CHAIN, 0); }
		public TerminalNode CHAR() { return getToken(PostgreSQLParser.CHAR, 0); }
		public TerminalNode CHARACTER() { return getToken(PostgreSQLParser.CHARACTER, 0); }
		public TerminalNode CHARACTERISTICS() { return getToken(PostgreSQLParser.CHARACTERISTICS, 0); }
		public TerminalNode CHARACTERS() { return getToken(PostgreSQLParser.CHARACTERS, 0); }
		public TerminalNode CHARACTER_LENGTH() { return getToken(PostgreSQLParser.CHARACTER_LENGTH, 0); }
		public TerminalNode CHARACTER_SET_CATALOG() { return getToken(PostgreSQLParser.CHARACTER_SET_CATALOG, 0); }
		public TerminalNode CHARACTER_SET_NAME() { return getToken(PostgreSQLParser.CHARACTER_SET_NAME, 0); }
		public TerminalNode CHARACTER_SET_SCHEMA() { return getToken(PostgreSQLParser.CHARACTER_SET_SCHEMA, 0); }
		public TerminalNode CHAR_LENGTH() { return getToken(PostgreSQLParser.CHAR_LENGTH, 0); }
		public TerminalNode CHECKPOINT() { return getToken(PostgreSQLParser.CHECKPOINT, 0); }
		public TerminalNode CLASS() { return getToken(PostgreSQLParser.CLASS, 0); }
		public TerminalNode CLASS_ORIGIN() { return getToken(PostgreSQLParser.CLASS_ORIGIN, 0); }
		public TerminalNode CLOB() { return getToken(PostgreSQLParser.CLOB, 0); }
		public TerminalNode CLOSE() { return getToken(PostgreSQLParser.CLOSE, 0); }
		public TerminalNode CLUSTER() { return getToken(PostgreSQLParser.CLUSTER, 0); }
		public TerminalNode COALESCE() { return getToken(PostgreSQLParser.COALESCE, 0); }
		public TerminalNode COBOL() { return getToken(PostgreSQLParser.COBOL, 0); }
		public TerminalNode COLLATION_CATALOG() { return getToken(PostgreSQLParser.COLLATION_CATALOG, 0); }
		public TerminalNode COLLATION_NAME() { return getToken(PostgreSQLParser.COLLATION_NAME, 0); }
		public TerminalNode COLLATION_SCHEMA() { return getToken(PostgreSQLParser.COLLATION_SCHEMA, 0); }
		public TerminalNode COLLECT() { return getToken(PostgreSQLParser.COLLECT, 0); }
		public TerminalNode COLUMN_NAME() { return getToken(PostgreSQLParser.COLUMN_NAME, 0); }
		public TerminalNode COMMAND_FUNCTION() { return getToken(PostgreSQLParser.COMMAND_FUNCTION, 0); }
		public TerminalNode COMMAND_FUNCTION_CODE() { return getToken(PostgreSQLParser.COMMAND_FUNCTION_CODE, 0); }
		public TerminalNode COMMENT() { return getToken(PostgreSQLParser.COMMENT, 0); }
		public TerminalNode COMMIT() { return getToken(PostgreSQLParser.COMMIT, 0); }
		public TerminalNode COMMITTED() { return getToken(PostgreSQLParser.COMMITTED, 0); }
		public TerminalNode CONDITION() { return getToken(PostgreSQLParser.CONDITION, 0); }
		public TerminalNode CONDITION_NUMBER() { return getToken(PostgreSQLParser.CONDITION_NUMBER, 0); }
		public TerminalNode CONNECT() { return getToken(PostgreSQLParser.CONNECT, 0); }
		public TerminalNode CONNECTION() { return getToken(PostgreSQLParser.CONNECTION, 0); }
		public TerminalNode CONNECTION_NAME() { return getToken(PostgreSQLParser.CONNECTION_NAME, 0); }
		public TerminalNode CONSTRAINTS() { return getToken(PostgreSQLParser.CONSTRAINTS, 0); }
		public TerminalNode CONSTRAINT_CATALOG() { return getToken(PostgreSQLParser.CONSTRAINT_CATALOG, 0); }
		public TerminalNode CONSTRAINT_NAME() { return getToken(PostgreSQLParser.CONSTRAINT_NAME, 0); }
		public TerminalNode CONSTRAINT_SCHEMA() { return getToken(PostgreSQLParser.CONSTRAINT_SCHEMA, 0); }
		public TerminalNode CONSTRUCTOR() { return getToken(PostgreSQLParser.CONSTRUCTOR, 0); }
		public TerminalNode CONTAINS() { return getToken(PostgreSQLParser.CONTAINS, 0); }
		public TerminalNode CONTINUE() { return getToken(PostgreSQLParser.CONTINUE, 0); }
		public TerminalNode CONVERSION() { return getToken(PostgreSQLParser.CONVERSION, 0); }
		public TerminalNode CONVERT() { return getToken(PostgreSQLParser.CONVERT, 0); }
		public TerminalNode COPY() { return getToken(PostgreSQLParser.COPY, 0); }
		public TerminalNode CORR() { return getToken(PostgreSQLParser.CORR, 0); }
		public TerminalNode CORRESPONDING() { return getToken(PostgreSQLParser.CORRESPONDING, 0); }
		public TerminalNode COUNT() { return getToken(PostgreSQLParser.COUNT, 0); }
		public TerminalNode COVAR_POP() { return getToken(PostgreSQLParser.COVAR_POP, 0); }
		public TerminalNode COVAR_SAMP() { return getToken(PostgreSQLParser.COVAR_SAMP, 0); }
		public TerminalNode CSV() { return getToken(PostgreSQLParser.CSV, 0); }
		public TerminalNode CUBE() { return getToken(PostgreSQLParser.CUBE, 0); }
		public TerminalNode CUME_DIST() { return getToken(PostgreSQLParser.CUME_DIST, 0); }
		public TerminalNode CURRENT() { return getToken(PostgreSQLParser.CURRENT, 0); }
		public TerminalNode CURRENT_DEFAULT_TRANSFORM_GROUP() { return getToken(PostgreSQLParser.CURRENT_DEFAULT_TRANSFORM_GROUP, 0); }
		public TerminalNode CURRENT_PATH() { return getToken(PostgreSQLParser.CURRENT_PATH, 0); }
		public TerminalNode CURRENT_TRANSFORM_GROUP_FOR_TYPE() { return getToken(PostgreSQLParser.CURRENT_TRANSFORM_GROUP_FOR_TYPE, 0); }
		public TerminalNode CURSOR() { return getToken(PostgreSQLParser.CURSOR, 0); }
		public TerminalNode CURSOR_NAME() { return getToken(PostgreSQLParser.CURSOR_NAME, 0); }
		public TerminalNode CYCLE() { return getToken(PostgreSQLParser.CYCLE, 0); }
		public TerminalNode DATA() { return getToken(PostgreSQLParser.DATA, 0); }
		public TerminalNode DATABASE() { return getToken(PostgreSQLParser.DATABASE, 0); }
		public TerminalNode DATE() { return getToken(PostgreSQLParser.DATE, 0); }
		public TerminalNode DATETIME_INTERVAL_CODE() { return getToken(PostgreSQLParser.DATETIME_INTERVAL_CODE, 0); }
		public TerminalNode DATETIME_INTERVAL_PRECISION() { return getToken(PostgreSQLParser.DATETIME_INTERVAL_PRECISION, 0); }
		public TerminalNode DAY() { return getToken(PostgreSQLParser.DAY, 0); }
		public TerminalNode DEALLOCATE() { return getToken(PostgreSQLParser.DEALLOCATE, 0); }
		public TerminalNode DEC() { return getToken(PostgreSQLParser.DEC, 0); }
		public TerminalNode DECIMAL() { return getToken(PostgreSQLParser.DECIMAL, 0); }
		public TerminalNode DECLARE() { return getToken(PostgreSQLParser.DECLARE, 0); }
		public TerminalNode DEFAULTS() { return getToken(PostgreSQLParser.DEFAULTS, 0); }
		public TerminalNode DEFERRED() { return getToken(PostgreSQLParser.DEFERRED, 0); }
		public TerminalNode DEFINED() { return getToken(PostgreSQLParser.DEFINED, 0); }
		public TerminalNode DEFINER() { return getToken(PostgreSQLParser.DEFINER, 0); }
		public TerminalNode DEGREE() { return getToken(PostgreSQLParser.DEGREE, 0); }
		public TerminalNode DELETE() { return getToken(PostgreSQLParser.DELETE, 0); }
		public TerminalNode DELIMITER() { return getToken(PostgreSQLParser.DELIMITER, 0); }
		public TerminalNode DELIMITERS() { return getToken(PostgreSQLParser.DELIMITERS, 0); }
		public TerminalNode DENSE_RANK() { return getToken(PostgreSQLParser.DENSE_RANK, 0); }
		public TerminalNode DEPTH() { return getToken(PostgreSQLParser.DEPTH, 0); }
		public TerminalNode DEREF() { return getToken(PostgreSQLParser.DEREF, 0); }
		public TerminalNode DERIVED() { return getToken(PostgreSQLParser.DERIVED, 0); }
		public TerminalNode DESCRIBE() { return getToken(PostgreSQLParser.DESCRIBE, 0); }
		public TerminalNode DESCRIPTOR() { return getToken(PostgreSQLParser.DESCRIPTOR, 0); }
		public TerminalNode DETERMINISTIC() { return getToken(PostgreSQLParser.DETERMINISTIC, 0); }
		public TerminalNode DIAGNOSTICS() { return getToken(PostgreSQLParser.DIAGNOSTICS, 0); }
		public TerminalNode DICTIONARY() { return getToken(PostgreSQLParser.DICTIONARY, 0); }
		public TerminalNode DISCONNECT() { return getToken(PostgreSQLParser.DISCONNECT, 0); }
		public TerminalNode DISPATCH() { return getToken(PostgreSQLParser.DISPATCH, 0); }
		public TerminalNode DOMAIN() { return getToken(PostgreSQLParser.DOMAIN, 0); }
		public TerminalNode DOUBLE() { return getToken(PostgreSQLParser.DOUBLE, 0); }
		public TerminalNode DROP() { return getToken(PostgreSQLParser.DROP, 0); }
		public TerminalNode DYNAMIC() { return getToken(PostgreSQLParser.DYNAMIC, 0); }
		public TerminalNode DYNAMIC_FUNCTION() { return getToken(PostgreSQLParser.DYNAMIC_FUNCTION, 0); }
		public TerminalNode DYNAMIC_FUNCTION_CODE() { return getToken(PostgreSQLParser.DYNAMIC_FUNCTION_CODE, 0); }
		public TerminalNode EACH() { return getToken(PostgreSQLParser.EACH, 0); }
		public TerminalNode ELEMENT() { return getToken(PostgreSQLParser.ELEMENT, 0); }
		public TerminalNode ENCODING() { return getToken(PostgreSQLParser.ENCODING, 0); }
		public TerminalNode ENCRYPTED() { return getToken(PostgreSQLParser.ENCRYPTED, 0); }
		public TerminalNode END() { return getToken(PostgreSQLParser.END, 0); }
		public TerminalNode EQUALS() { return getToken(PostgreSQLParser.EQUALS, 0); }
		public TerminalNode ESCAPE() { return getToken(PostgreSQLParser.ESCAPE, 0); }
		public TerminalNode EVERY() { return getToken(PostgreSQLParser.EVERY, 0); }
		public TerminalNode EXCEPTION() { return getToken(PostgreSQLParser.EXCEPTION, 0); }
		public TerminalNode EXCLUDE() { return getToken(PostgreSQLParser.EXCLUDE, 0); }
		public TerminalNode EXCLUDING() { return getToken(PostgreSQLParser.EXCLUDING, 0); }
		public TerminalNode EXCLUSIVE() { return getToken(PostgreSQLParser.EXCLUSIVE, 0); }
		public TerminalNode EXEC() { return getToken(PostgreSQLParser.EXEC, 0); }
		public TerminalNode EXECUTE() { return getToken(PostgreSQLParser.EXECUTE, 0); }
		public TerminalNode EXISTS() { return getToken(PostgreSQLParser.EXISTS, 0); }
		public TerminalNode EXP() { return getToken(PostgreSQLParser.EXP, 0); }
		public TerminalNode EXPLAIN() { return getToken(PostgreSQLParser.EXPLAIN, 0); }
		public TerminalNode EXTERNAL() { return getToken(PostgreSQLParser.EXTERNAL, 0); }
		public TerminalNode EXTRACT() { return getToken(PostgreSQLParser.EXTRACT, 0); }
		public TerminalNode FILTER() { return getToken(PostgreSQLParser.FILTER, 0); }
		public TerminalNode FINAL() { return getToken(PostgreSQLParser.FINAL, 0); }
		public TerminalNode FIRST() { return getToken(PostgreSQLParser.FIRST, 0); }
		public TerminalNode FLOAT() { return getToken(PostgreSQLParser.FLOAT, 0); }
		public TerminalNode FLOOR() { return getToken(PostgreSQLParser.FLOOR, 0); }
		public TerminalNode FOLLOWING() { return getToken(PostgreSQLParser.FOLLOWING, 0); }
		public TerminalNode FORCE() { return getToken(PostgreSQLParser.FORCE, 0); }
		public TerminalNode FORTRAN() { return getToken(PostgreSQLParser.FORTRAN, 0); }
		public TerminalNode FORWARD() { return getToken(PostgreSQLParser.FORWARD, 0); }
		public TerminalNode FOUND() { return getToken(PostgreSQLParser.FOUND, 0); }
		public TerminalNode FREE() { return getToken(PostgreSQLParser.FREE, 0); }
		public TerminalNode FUNCTION() { return getToken(PostgreSQLParser.FUNCTION, 0); }
		public TerminalNode FUSION() { return getToken(PostgreSQLParser.FUSION, 0); }
		public TerminalNode G_() { return getToken(PostgreSQLParser.G_, 0); }
		public TerminalNode GENERAL() { return getToken(PostgreSQLParser.GENERAL, 0); }
		public TerminalNode GENERATED() { return getToken(PostgreSQLParser.GENERATED, 0); }
		public TerminalNode GET() { return getToken(PostgreSQLParser.GET, 0); }
		public TerminalNode GLOBAL() { return getToken(PostgreSQLParser.GLOBAL, 0); }
		public TerminalNode GO() { return getToken(PostgreSQLParser.GO, 0); }
		public TerminalNode GOTO() { return getToken(PostgreSQLParser.GOTO, 0); }
		public TerminalNode GRANTED() { return getToken(PostgreSQLParser.GRANTED, 0); }
		public TerminalNode GROUPING() { return getToken(PostgreSQLParser.GROUPING, 0); }
		public TerminalNode HANDLER() { return getToken(PostgreSQLParser.HANDLER, 0); }
		public TerminalNode HIERARCHY() { return getToken(PostgreSQLParser.HIERARCHY, 0); }
		public TerminalNode HOLD() { return getToken(PostgreSQLParser.HOLD, 0); }
		public TerminalNode HOUR() { return getToken(PostgreSQLParser.HOUR, 0); }
		public TerminalNode IDENTITY() { return getToken(PostgreSQLParser.IDENTITY, 0); }
		public TerminalNode IGNORE() { return getToken(PostgreSQLParser.IGNORE, 0); }
		public TerminalNode IMMEDIATE() { return getToken(PostgreSQLParser.IMMEDIATE, 0); }
		public TerminalNode IMMUTABLE() { return getToken(PostgreSQLParser.IMMUTABLE, 0); }
		public TerminalNode IMPLEMENTATION() { return getToken(PostgreSQLParser.IMPLEMENTATION, 0); }
		public TerminalNode IMPLICIT() { return getToken(PostgreSQLParser.IMPLICIT, 0); }
		public TerminalNode INCLUDING() { return getToken(PostgreSQLParser.INCLUDING, 0); }
		public TerminalNode INCREMENT() { return getToken(PostgreSQLParser.INCREMENT, 0); }
		public TerminalNode INDEX() { return getToken(PostgreSQLParser.INDEX, 0); }
		public TerminalNode INDICATOR() { return getToken(PostgreSQLParser.INDICATOR, 0); }
		public TerminalNode INHERITS() { return getToken(PostgreSQLParser.INHERITS, 0); }
		public TerminalNode INOUT() { return getToken(PostgreSQLParser.INOUT, 0); }
		public TerminalNode INPUT() { return getToken(PostgreSQLParser.INPUT, 0); }
		public TerminalNode INSENSITIVE() { return getToken(PostgreSQLParser.INSENSITIVE, 0); }
		public TerminalNode INSERT() { return getToken(PostgreSQLParser.INSERT, 0); }
		public TerminalNode INSTANCE() { return getToken(PostgreSQLParser.INSTANCE, 0); }
		public TerminalNode INSTANTIABLE() { return getToken(PostgreSQLParser.INSTANTIABLE, 0); }
		public TerminalNode INSTEAD() { return getToken(PostgreSQLParser.INSTEAD, 0); }
		public TerminalNode INT() { return getToken(PostgreSQLParser.INT, 0); }
		public TerminalNode INTEGER() { return getToken(PostgreSQLParser.INTEGER, 0); }
		public TerminalNode INTERSECTION() { return getToken(PostgreSQLParser.INTERSECTION, 0); }
		public TerminalNode INTERVAL() { return getToken(PostgreSQLParser.INTERVAL, 0); }
		public TerminalNode INVOKER() { return getToken(PostgreSQLParser.INVOKER, 0); }
		public TerminalNode ISOLATION() { return getToken(PostgreSQLParser.ISOLATION, 0); }
		public TerminalNode KEY() { return getToken(PostgreSQLParser.KEY, 0); }
		public TerminalNode KEY_MEMBER() { return getToken(PostgreSQLParser.KEY_MEMBER, 0); }
		public TerminalNode KEY_TYPE() { return getToken(PostgreSQLParser.KEY_TYPE, 0); }
		public TerminalNode LANGUAGE() { return getToken(PostgreSQLParser.LANGUAGE, 0); }
		public TerminalNode LARGE() { return getToken(PostgreSQLParser.LARGE, 0); }
		public TerminalNode LAST() { return getToken(PostgreSQLParser.LAST, 0); }
		public TerminalNode LEFT() { return getToken(PostgreSQLParser.LEFT, 0); }
		public TerminalNode LENGTH() { return getToken(PostgreSQLParser.LENGTH, 0); }
		public TerminalNode LEVEL() { return getToken(PostgreSQLParser.LEVEL, 0); }
		public TerminalNode LISTEN() { return getToken(PostgreSQLParser.LISTEN, 0); }
		public TerminalNode LN() { return getToken(PostgreSQLParser.LN, 0); }
		public TerminalNode LOAD() { return getToken(PostgreSQLParser.LOAD, 0); }
		public TerminalNode LOCAL() { return getToken(PostgreSQLParser.LOCAL, 0); }
		public TerminalNode LOCATION() { return getToken(PostgreSQLParser.LOCATION, 0); }
		public TerminalNode LOCATOR() { return getToken(PostgreSQLParser.LOCATOR, 0); }
		public TerminalNode LOCK() { return getToken(PostgreSQLParser.LOCK, 0); }
		public TerminalNode LOCKED() { return getToken(PostgreSQLParser.LOCKED, 0); }
		public TerminalNode LOWER() { return getToken(PostgreSQLParser.LOWER, 0); }
		public TerminalNode M_() { return getToken(PostgreSQLParser.M_, 0); }
		public TerminalNode MAP() { return getToken(PostgreSQLParser.MAP, 0); }
		public TerminalNode MATCH() { return getToken(PostgreSQLParser.MATCH, 0); }
		public TerminalNode MATCHED() { return getToken(PostgreSQLParser.MATCHED, 0); }
		public TerminalNode MAX() { return getToken(PostgreSQLParser.MAX, 0); }
		public TerminalNode MAXVALUE() { return getToken(PostgreSQLParser.MAXVALUE, 0); }
		public TerminalNode MEMBER() { return getToken(PostgreSQLParser.MEMBER, 0); }
		public TerminalNode MERGE() { return getToken(PostgreSQLParser.MERGE, 0); }
		public TerminalNode MESSAGE_LENGTH() { return getToken(PostgreSQLParser.MESSAGE_LENGTH, 0); }
		public TerminalNode MESSAGE_OCTET_LENGTH() { return getToken(PostgreSQLParser.MESSAGE_OCTET_LENGTH, 0); }
		public TerminalNode MESSAGE_TEXT() { return getToken(PostgreSQLParser.MESSAGE_TEXT, 0); }
		public TerminalNode METHOD() { return getToken(PostgreSQLParser.METHOD, 0); }
		public TerminalNode MIN() { return getToken(PostgreSQLParser.MIN, 0); }
		public TerminalNode MINUTE() { return getToken(PostgreSQLParser.MINUTE, 0); }
		public TerminalNode MINVALUE() { return getToken(PostgreSQLParser.MINVALUE, 0); }
		public TerminalNode MOD() { return getToken(PostgreSQLParser.MOD, 0); }
		public TerminalNode MODE() { return getToken(PostgreSQLParser.MODE, 0); }
		public TerminalNode MODIFIES() { return getToken(PostgreSQLParser.MODIFIES, 0); }
		public TerminalNode MODULE() { return getToken(PostgreSQLParser.MODULE, 0); }
		public TerminalNode MONTH() { return getToken(PostgreSQLParser.MONTH, 0); }
		public TerminalNode MORE_() { return getToken(PostgreSQLParser.MORE_, 0); }
		public TerminalNode MOVE() { return getToken(PostgreSQLParser.MOVE, 0); }
		public TerminalNode MULTISET() { return getToken(PostgreSQLParser.MULTISET, 0); }
		public TerminalNode MUMPS() { return getToken(PostgreSQLParser.MUMPS, 0); }
		public TerminalNode NAME() { return getToken(PostgreSQLParser.NAME, 0); }
		public TerminalNode NAMES() { return getToken(PostgreSQLParser.NAMES, 0); }
		public TerminalNode NATIONAL() { return getToken(PostgreSQLParser.NATIONAL, 0); }
		public TerminalNode NCHAR() { return getToken(PostgreSQLParser.NCHAR, 0); }
		public TerminalNode NCLOB() { return getToken(PostgreSQLParser.NCLOB, 0); }
		public TerminalNode NESTING() { return getToken(PostgreSQLParser.NESTING, 0); }
		public TerminalNode NEW() { return getToken(PostgreSQLParser.NEW, 0); }
		public TerminalNode NEXT() { return getToken(PostgreSQLParser.NEXT, 0); }
		public TerminalNode NO() { return getToken(PostgreSQLParser.NO, 0); }
		public TerminalNode NONE() { return getToken(PostgreSQLParser.NONE, 0); }
		public TerminalNode NORMALIZE() { return getToken(PostgreSQLParser.NORMALIZE, 0); }
		public TerminalNode NORMALIZED() { return getToken(PostgreSQLParser.NORMALIZED, 0); }
		public TerminalNode NOTHING() { return getToken(PostgreSQLParser.NOTHING, 0); }
		public TerminalNode NOTIFY() { return getToken(PostgreSQLParser.NOTIFY, 0); }
		public TerminalNode NOWAIT() { return getToken(PostgreSQLParser.NOWAIT, 0); }
		public TerminalNode NULLABLE() { return getToken(PostgreSQLParser.NULLABLE, 0); }
		public TerminalNode NULLIF() { return getToken(PostgreSQLParser.NULLIF, 0); }
		public TerminalNode NULLS() { return getToken(PostgreSQLParser.NULLS, 0); }
		public TerminalNode NUMBER() { return getToken(PostgreSQLParser.NUMBER, 0); }
		public TerminalNode NUMERIC() { return getToken(PostgreSQLParser.NUMERIC, 0); }
		public TerminalNode OBJECT() { return getToken(PostgreSQLParser.OBJECT, 0); }
		public TerminalNode OCTETS() { return getToken(PostgreSQLParser.OCTETS, 0); }
		public TerminalNode OCTET_LENGTH() { return getToken(PostgreSQLParser.OCTET_LENGTH, 0); }
		public TerminalNode OF() { return getToken(PostgreSQLParser.OF, 0); }
		public TerminalNode OFF() { return getToken(PostgreSQLParser.OFF, 0); }
		public TerminalNode OIDS() { return getToken(PostgreSQLParser.OIDS, 0); }
		public TerminalNode OLD() { return getToken(PostgreSQLParser.OLD, 0); }
		public TerminalNode OPEN() { return getToken(PostgreSQLParser.OPEN, 0); }
		public TerminalNode OPERATOR() { return getToken(PostgreSQLParser.OPERATOR, 0); }
		public TerminalNode OPTION() { return getToken(PostgreSQLParser.OPTION, 0); }
		public TerminalNode OPTIONS() { return getToken(PostgreSQLParser.OPTIONS, 0); }
		public TerminalNode ORDERING() { return getToken(PostgreSQLParser.ORDERING, 0); }
		public TerminalNode ORDINALITY() { return getToken(PostgreSQLParser.ORDINALITY, 0); }
		public TerminalNode OTHERS() { return getToken(PostgreSQLParser.OTHERS, 0); }
		public TerminalNode OUT() { return getToken(PostgreSQLParser.OUT, 0); }
		public TerminalNode OUTPUT() { return getToken(PostgreSQLParser.OUTPUT, 0); }
		public TerminalNode OVER() { return getToken(PostgreSQLParser.OVER, 0); }
		public TerminalNode OVERLAY() { return getToken(PostgreSQLParser.OVERLAY, 0); }
		public TerminalNode OVERRIDING() { return getToken(PostgreSQLParser.OVERRIDING, 0); }
		public TerminalNode OWNER() { return getToken(PostgreSQLParser.OWNER, 0); }
		public TerminalNode PAD() { return getToken(PostgreSQLParser.PAD, 0); }
		public TerminalNode PARAMETER() { return getToken(PostgreSQLParser.PARAMETER, 0); }
		public TerminalNode PARAMETER_MODE() { return getToken(PostgreSQLParser.PARAMETER_MODE, 0); }
		public TerminalNode PARAMETER_NAME() { return getToken(PostgreSQLParser.PARAMETER_NAME, 0); }
		public TerminalNode PARAMETER_ORDINAL_POSITION() { return getToken(PostgreSQLParser.PARAMETER_ORDINAL_POSITION, 0); }
		public TerminalNode PARAMETER_SPECIFIC_CATALOG() { return getToken(PostgreSQLParser.PARAMETER_SPECIFIC_CATALOG, 0); }
		public TerminalNode PARAMETER_SPECIFIC_NAME() { return getToken(PostgreSQLParser.PARAMETER_SPECIFIC_NAME, 0); }
		public TerminalNode PARAMETER_SPECIFIC_SCHEMA() { return getToken(PostgreSQLParser.PARAMETER_SPECIFIC_SCHEMA, 0); }
		public TerminalNode PARTIAL() { return getToken(PostgreSQLParser.PARTIAL, 0); }
		public TerminalNode PARTITION() { return getToken(PostgreSQLParser.PARTITION, 0); }
		public TerminalNode PASCAL() { return getToken(PostgreSQLParser.PASCAL, 0); }
		public TerminalNode PASSWORD() { return getToken(PostgreSQLParser.PASSWORD, 0); }
		public TerminalNode PATH() { return getToken(PostgreSQLParser.PATH, 0); }
		public TerminalNode PERCENTILE_CONT() { return getToken(PostgreSQLParser.PERCENTILE_CONT, 0); }
		public TerminalNode PERCENTILE_DISC() { return getToken(PostgreSQLParser.PERCENTILE_DISC, 0); }
		public TerminalNode PERCENT_RANK() { return getToken(PostgreSQLParser.PERCENT_RANK, 0); }
		public TerminalNode PLI() { return getToken(PostgreSQLParser.PLI, 0); }
		public TerminalNode POSITION() { return getToken(PostgreSQLParser.POSITION, 0); }
		public TerminalNode POWER() { return getToken(PostgreSQLParser.POWER, 0); }
		public TerminalNode PRECEDING() { return getToken(PostgreSQLParser.PRECEDING, 0); }
		public TerminalNode PRECISION() { return getToken(PostgreSQLParser.PRECISION, 0); }
		public TerminalNode PREPARE() { return getToken(PostgreSQLParser.PREPARE, 0); }
		public TerminalNode PRESERVE() { return getToken(PostgreSQLParser.PRESERVE, 0); }
		public TerminalNode PRIOR() { return getToken(PostgreSQLParser.PRIOR, 0); }
		public TerminalNode PRIVILEGES() { return getToken(PostgreSQLParser.PRIVILEGES, 0); }
		public TerminalNode PROCEDURAL() { return getToken(PostgreSQLParser.PROCEDURAL, 0); }
		public TerminalNode PROCEDURE() { return getToken(PostgreSQLParser.PROCEDURE, 0); }
		public TerminalNode PUBLIC() { return getToken(PostgreSQLParser.PUBLIC, 0); }
		public TerminalNode QUOTE() { return getToken(PostgreSQLParser.QUOTE, 0); }
		public TerminalNode RANGE() { return getToken(PostgreSQLParser.RANGE, 0); }
		public TerminalNode RANK() { return getToken(PostgreSQLParser.RANK, 0); }
		public TerminalNode READ() { return getToken(PostgreSQLParser.READ, 0); }
		public TerminalNode READS() { return getToken(PostgreSQLParser.READS, 0); }
		public TerminalNode REAL() { return getToken(PostgreSQLParser.REAL, 0); }
		public TerminalNode RECHECK() { return getToken(PostgreSQLParser.RECHECK, 0); }
		public TerminalNode RECURSIVE() { return getToken(PostgreSQLParser.RECURSIVE, 0); }
		public TerminalNode REF() { return getToken(PostgreSQLParser.REF, 0); }
		public TerminalNode REFERENCING() { return getToken(PostgreSQLParser.REFERENCING, 0); }
		public TerminalNode REGR_AVGX() { return getToken(PostgreSQLParser.REGR_AVGX, 0); }
		public TerminalNode REGR_AVGY() { return getToken(PostgreSQLParser.REGR_AVGY, 0); }
		public TerminalNode REGR_COUNT() { return getToken(PostgreSQLParser.REGR_COUNT, 0); }
		public TerminalNode REGR_INTERCEPT() { return getToken(PostgreSQLParser.REGR_INTERCEPT, 0); }
		public TerminalNode REGR_SLOPE() { return getToken(PostgreSQLParser.REGR_SLOPE, 0); }
		public TerminalNode REGR_SXX() { return getToken(PostgreSQLParser.REGR_SXX, 0); }
		public TerminalNode REGR_SXY() { return getToken(PostgreSQLParser.REGR_SXY, 0); }
		public TerminalNode REGR_SYY() { return getToken(PostgreSQLParser.REGR_SYY, 0); }
		public TerminalNode REINDEX() { return getToken(PostgreSQLParser.REINDEX, 0); }
		public TerminalNode RELATIVE() { return getToken(PostgreSQLParser.RELATIVE, 0); }
		public TerminalNode RELEASE() { return getToken(PostgreSQLParser.RELEASE, 0); }
		public TerminalNode RENAME() { return getToken(PostgreSQLParser.RENAME, 0); }
		public TerminalNode REPEATABLE() { return getToken(PostgreSQLParser.REPEATABLE, 0); }
		public TerminalNode REPLACE() { return getToken(PostgreSQLParser.REPLACE, 0); }
		public TerminalNode RESET() { return getToken(PostgreSQLParser.RESET, 0); }
		public TerminalNode RESTART() { return getToken(PostgreSQLParser.RESTART, 0); }
		public TerminalNode RESTRICT() { return getToken(PostgreSQLParser.RESTRICT, 0); }
		public TerminalNode RESULT() { return getToken(PostgreSQLParser.RESULT, 0); }
		public TerminalNode RETURN() { return getToken(PostgreSQLParser.RETURN, 0); }
		public TerminalNode RETURNED_CARDINALITY() { return getToken(PostgreSQLParser.RETURNED_CARDINALITY, 0); }
		public TerminalNode RETURNED_LENGTH() { return getToken(PostgreSQLParser.RETURNED_LENGTH, 0); }
		public TerminalNode RETURNED_OCTET_LENGTH() { return getToken(PostgreSQLParser.RETURNED_OCTET_LENGTH, 0); }
		public TerminalNode RETURNED_SQLSTATE() { return getToken(PostgreSQLParser.RETURNED_SQLSTATE, 0); }
		public TerminalNode RETURNS() { return getToken(PostgreSQLParser.RETURNS, 0); }
		public TerminalNode REVOKE() { return getToken(PostgreSQLParser.REVOKE, 0); }
		public TerminalNode RIGHT() { return getToken(PostgreSQLParser.RIGHT, 0); }
		public TerminalNode ROLE() { return getToken(PostgreSQLParser.ROLE, 0); }
		public TerminalNode ROLLBACK() { return getToken(PostgreSQLParser.ROLLBACK, 0); }
		public TerminalNode ROLLUP() { return getToken(PostgreSQLParser.ROLLUP, 0); }
		public TerminalNode ROUTINE() { return getToken(PostgreSQLParser.ROUTINE, 0); }
		public TerminalNode ROUTINE_CATALOG() { return getToken(PostgreSQLParser.ROUTINE_CATALOG, 0); }
		public TerminalNode ROUTINE_NAME() { return getToken(PostgreSQLParser.ROUTINE_NAME, 0); }
		public TerminalNode ROUTINE_SCHEMA() { return getToken(PostgreSQLParser.ROUTINE_SCHEMA, 0); }
		public TerminalNode ROW() { return getToken(PostgreSQLParser.ROW, 0); }
		public TerminalNode ROWS() { return getToken(PostgreSQLParser.ROWS, 0); }
		public TerminalNode ROW_COUNT() { return getToken(PostgreSQLParser.ROW_COUNT, 0); }
		public TerminalNode ROW_NUMBER() { return getToken(PostgreSQLParser.ROW_NUMBER, 0); }
		public TerminalNode RULE() { return getToken(PostgreSQLParser.RULE, 0); }
		public TerminalNode SAVEPOINT() { return getToken(PostgreSQLParser.SAVEPOINT, 0); }
		public TerminalNode SCALE() { return getToken(PostgreSQLParser.SCALE, 0); }
		public TerminalNode SCHEMA() { return getToken(PostgreSQLParser.SCHEMA, 0); }
		public TerminalNode SCHEMA_NAME() { return getToken(PostgreSQLParser.SCHEMA_NAME, 0); }
		public TerminalNode SCOPE() { return getToken(PostgreSQLParser.SCOPE, 0); }
		public TerminalNode SCOPE_CATALOG() { return getToken(PostgreSQLParser.SCOPE_CATALOG, 0); }
		public TerminalNode SCOPE_NAME() { return getToken(PostgreSQLParser.SCOPE_NAME, 0); }
		public TerminalNode SCOPE_SCHEMA() { return getToken(PostgreSQLParser.SCOPE_SCHEMA, 0); }
		public TerminalNode SCROLL() { return getToken(PostgreSQLParser.SCROLL, 0); }
		public TerminalNode SEARCH() { return getToken(PostgreSQLParser.SEARCH, 0); }
		public TerminalNode SECOND() { return getToken(PostgreSQLParser.SECOND, 0); }
		public TerminalNode SECTION() { return getToken(PostgreSQLParser.SECTION, 0); }
		public TerminalNode SECURITY() { return getToken(PostgreSQLParser.SECURITY, 0); }
		public TerminalNode SELF() { return getToken(PostgreSQLParser.SELF, 0); }
		public TerminalNode SENSITIVE() { return getToken(PostgreSQLParser.SENSITIVE, 0); }
		public TerminalNode SEQUENCE() { return getToken(PostgreSQLParser.SEQUENCE, 0); }
		public TerminalNode SERIALIZABLE() { return getToken(PostgreSQLParser.SERIALIZABLE, 0); }
		public TerminalNode SERVER_NAME() { return getToken(PostgreSQLParser.SERVER_NAME, 0); }
		public TerminalNode SESSION() { return getToken(PostgreSQLParser.SESSION, 0); }
		public TerminalNode SET() { return getToken(PostgreSQLParser.SET, 0); }
		public TerminalNode SETOF() { return getToken(PostgreSQLParser.SETOF, 0); }
		public TerminalNode SETS() { return getToken(PostgreSQLParser.SETS, 0); }
		public TerminalNode SHARE() { return getToken(PostgreSQLParser.SHARE, 0); }
		public TerminalNode SHOW() { return getToken(PostgreSQLParser.SHOW, 0); }
		public TerminalNode SIMPLE() { return getToken(PostgreSQLParser.SIMPLE, 0); }
		public TerminalNode SIZE() { return getToken(PostgreSQLParser.SIZE, 0); }
		public TerminalNode SMALLINT() { return getToken(PostgreSQLParser.SMALLINT, 0); }
		public TerminalNode SOURCE() { return getToken(PostgreSQLParser.SOURCE, 0); }
		public TerminalNode SPACE() { return getToken(PostgreSQLParser.SPACE, 0); }
		public TerminalNode SPECIFIC() { return getToken(PostgreSQLParser.SPECIFIC, 0); }
		public TerminalNode SPECIFICTYPE() { return getToken(PostgreSQLParser.SPECIFICTYPE, 0); }
		public TerminalNode SPECIFIC_NAME() { return getToken(PostgreSQLParser.SPECIFIC_NAME, 0); }
		public TerminalNode SQL() { return getToken(PostgreSQLParser.SQL, 0); }
		public TerminalNode SQLCODE() { return getToken(PostgreSQLParser.SQLCODE, 0); }
		public TerminalNode SQLERROR() { return getToken(PostgreSQLParser.SQLERROR, 0); }
		public TerminalNode SQLEXCEPTION() { return getToken(PostgreSQLParser.SQLEXCEPTION, 0); }
		public TerminalNode SQLSTATE() { return getToken(PostgreSQLParser.SQLSTATE, 0); }
		public TerminalNode SQLWARNING() { return getToken(PostgreSQLParser.SQLWARNING, 0); }
		public TerminalNode SQRT() { return getToken(PostgreSQLParser.SQRT, 0); }
		public TerminalNode STABLE() { return getToken(PostgreSQLParser.STABLE, 0); }
		public TerminalNode START() { return getToken(PostgreSQLParser.START, 0); }
		public TerminalNode STATE() { return getToken(PostgreSQLParser.STATE, 0); }
		public TerminalNode STATEMENT() { return getToken(PostgreSQLParser.STATEMENT, 0); }
		public TerminalNode STATIC() { return getToken(PostgreSQLParser.STATIC, 0); }
		public TerminalNode STATISTICS() { return getToken(PostgreSQLParser.STATISTICS, 0); }
		public TerminalNode STDDEV_POP() { return getToken(PostgreSQLParser.STDDEV_POP, 0); }
		public TerminalNode STDDEV_SAMP() { return getToken(PostgreSQLParser.STDDEV_SAMP, 0); }
		public TerminalNode STDIN() { return getToken(PostgreSQLParser.STDIN, 0); }
		public TerminalNode STDOUT() { return getToken(PostgreSQLParser.STDOUT, 0); }
		public TerminalNode STORAGE() { return getToken(PostgreSQLParser.STORAGE, 0); }
		public TerminalNode STRICT() { return getToken(PostgreSQLParser.STRICT, 0); }
		public TerminalNode STRUCTURE() { return getToken(PostgreSQLParser.STRUCTURE, 0); }
		public TerminalNode STYLE() { return getToken(PostgreSQLParser.STYLE, 0); }
		public TerminalNode SUBCLASS_ORIGIN() { return getToken(PostgreSQLParser.SUBCLASS_ORIGIN, 0); }
		public TerminalNode SUBMULTISET() { return getToken(PostgreSQLParser.SUBMULTISET, 0); }
		public TerminalNode SUBSTRING() { return getToken(PostgreSQLParser.SUBSTRING, 0); }
		public TerminalNode SUM() { return getToken(PostgreSQLParser.SUM, 0); }
		public TerminalNode SYSID() { return getToken(PostgreSQLParser.SYSID, 0); }
		public TerminalNode SYSTEM() { return getToken(PostgreSQLParser.SYSTEM, 0); }
		public TerminalNode SYSTEM_USER() { return getToken(PostgreSQLParser.SYSTEM_USER, 0); }
		public TerminalNode TABLESPACE() { return getToken(PostgreSQLParser.TABLESPACE, 0); }
		public TerminalNode TABLE_NAME() { return getToken(PostgreSQLParser.TABLE_NAME, 0); }
		public TerminalNode TEMP() { return getToken(PostgreSQLParser.TEMP, 0); }
		public TerminalNode TEMPLATE() { return getToken(PostgreSQLParser.TEMPLATE, 0); }
		public TerminalNode TEMPORARY() { return getToken(PostgreSQLParser.TEMPORARY, 0); }
		public TerminalNode TIES() { return getToken(PostgreSQLParser.TIES, 0); }
		public TerminalNode TIME() { return getToken(PostgreSQLParser.TIME, 0); }
		public TerminalNode TIMESTAMP() { return getToken(PostgreSQLParser.TIMESTAMP, 0); }
		public TerminalNode TIMEZONE_HOUR() { return getToken(PostgreSQLParser.TIMEZONE_HOUR, 0); }
		public TerminalNode TIMEZONE_MINUTE() { return getToken(PostgreSQLParser.TIMEZONE_MINUTE, 0); }
		public TerminalNode TOP_LEVEL_COUNT() { return getToken(PostgreSQLParser.TOP_LEVEL_COUNT, 0); }
		public TerminalNode TRANSACTION() { return getToken(PostgreSQLParser.TRANSACTION, 0); }
		public TerminalNode TRANSACTIONS_COMMITTED() { return getToken(PostgreSQLParser.TRANSACTIONS_COMMITTED, 0); }
		public TerminalNode TRANSACTIONS_ROLLED_BACK() { return getToken(PostgreSQLParser.TRANSACTIONS_ROLLED_BACK, 0); }
		public TerminalNode TRANSACTION_ACTIVE() { return getToken(PostgreSQLParser.TRANSACTION_ACTIVE, 0); }
		public TerminalNode TRANSFORM() { return getToken(PostgreSQLParser.TRANSFORM, 0); }
		public TerminalNode TRANSFORMS() { return getToken(PostgreSQLParser.TRANSFORMS, 0); }
		public TerminalNode TRANSLATE() { return getToken(PostgreSQLParser.TRANSLATE, 0); }
		public TerminalNode TRANSLATION() { return getToken(PostgreSQLParser.TRANSLATION, 0); }
		public TerminalNode TREAT() { return getToken(PostgreSQLParser.TREAT, 0); }
		public TerminalNode TRIGGER() { return getToken(PostgreSQLParser.TRIGGER, 0); }
		public TerminalNode TRIGGER_CATALOG() { return getToken(PostgreSQLParser.TRIGGER_CATALOG, 0); }
		public TerminalNode TRIGGER_NAME() { return getToken(PostgreSQLParser.TRIGGER_NAME, 0); }
		public TerminalNode TRIGGER_SCHEMA() { return getToken(PostgreSQLParser.TRIGGER_SCHEMA, 0); }
		public TerminalNode TRIM() { return getToken(PostgreSQLParser.TRIM, 0); }
		public TerminalNode TRUNCATE() { return getToken(PostgreSQLParser.TRUNCATE, 0); }
		public TerminalNode TRUSTED() { return getToken(PostgreSQLParser.TRUSTED, 0); }
		public TerminalNode TYPE() { return getToken(PostgreSQLParser.TYPE, 0); }
		public TerminalNode UESCAPE() { return getToken(PostgreSQLParser.UESCAPE, 0); }
		public TerminalNode UNBOUNDED() { return getToken(PostgreSQLParser.UNBOUNDED, 0); }
		public TerminalNode UNCOMMITTED() { return getToken(PostgreSQLParser.UNCOMMITTED, 0); }
		public TerminalNode UNDER() { return getToken(PostgreSQLParser.UNDER, 0); }
		public TerminalNode UNENCRYPTED() { return getToken(PostgreSQLParser.UNENCRYPTED, 0); }
		public TerminalNode UNKNOWN() { return getToken(PostgreSQLParser.UNKNOWN, 0); }
		public TerminalNode UNLISTEN() { return getToken(PostgreSQLParser.UNLISTEN, 0); }
		public TerminalNode UNNAMED() { return getToken(PostgreSQLParser.UNNAMED, 0); }
		public TerminalNode UNNEST() { return getToken(PostgreSQLParser.UNNEST, 0); }
		public TerminalNode UNTIL() { return getToken(PostgreSQLParser.UNTIL, 0); }
		public TerminalNode UPDATE() { return getToken(PostgreSQLParser.UPDATE, 0); }
		public TerminalNode UPPER() { return getToken(PostgreSQLParser.UPPER, 0); }
		public TerminalNode USAGE() { return getToken(PostgreSQLParser.USAGE, 0); }
		public TerminalNode USER_DEFINED_TYPE_CATALOG() { return getToken(PostgreSQLParser.USER_DEFINED_TYPE_CATALOG, 0); }
		public TerminalNode USER_DEFINED_TYPE_CODE() { return getToken(PostgreSQLParser.USER_DEFINED_TYPE_CODE, 0); }
		public TerminalNode USER_DEFINED_TYPE_NAME() { return getToken(PostgreSQLParser.USER_DEFINED_TYPE_NAME, 0); }
		public TerminalNode USER_DEFINED_TYPE_SCHEMA() { return getToken(PostgreSQLParser.USER_DEFINED_TYPE_SCHEMA, 0); }
		public TerminalNode VACUUM() { return getToken(PostgreSQLParser.VACUUM, 0); }
		public TerminalNode VALID() { return getToken(PostgreSQLParser.VALID, 0); }
		public TerminalNode VALIDATOR() { return getToken(PostgreSQLParser.VALIDATOR, 0); }
		public TerminalNode VALUE() { return getToken(PostgreSQLParser.VALUE, 0); }
		public TerminalNode VALUES() { return getToken(PostgreSQLParser.VALUES, 0); }
		public TerminalNode VARCHAR() { return getToken(PostgreSQLParser.VARCHAR, 0); }
		public TerminalNode VARYING() { return getToken(PostgreSQLParser.VARYING, 0); }
		public TerminalNode VAR_POP() { return getToken(PostgreSQLParser.VAR_POP, 0); }
		public TerminalNode VAR_SAMP() { return getToken(PostgreSQLParser.VAR_SAMP, 0); }
		public TerminalNode VIEW() { return getToken(PostgreSQLParser.VIEW, 0); }
		public TerminalNode VOLATILE() { return getToken(PostgreSQLParser.VOLATILE, 0); }
		public TerminalNode WHENEVER() { return getToken(PostgreSQLParser.WHENEVER, 0); }
		public TerminalNode WHITESPACE() { return getToken(PostgreSQLParser.WHITESPACE, 0); }
		public TerminalNode WIDTH_BUCKET() { return getToken(PostgreSQLParser.WIDTH_BUCKET, 0); }
		public TerminalNode WITHIN() { return getToken(PostgreSQLParser.WITHIN, 0); }
		public TerminalNode WITHOUT() { return getToken(PostgreSQLParser.WITHOUT, 0); }
		public TerminalNode WORK() { return getToken(PostgreSQLParser.WORK, 0); }
		public TerminalNode WRITE() { return getToken(PostgreSQLParser.WRITE, 0); }
		public TerminalNode YEAR() { return getToken(PostgreSQLParser.YEAR, 0); }
		public TerminalNode ZONE() { return getToken(PostgreSQLParser.ZONE, 0); }
		public Non_reserved_keywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_non_reserved_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterNon_reserved_keyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitNon_reserved_keyword(this);
		}
	}

	public final Non_reserved_keywordContext non_reserved_keyword() throws RecognitionException {
		Non_reserved_keywordContext _localctx = new Non_reserved_keywordContext(_ctx, getState());
		enterRule(_localctx, 444, RULE_non_reserved_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2927);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHITESPACE) | (1L << A_) | (1L << ABORT) | (1L << ABS) | (1L << ABSOLUTE) | (1L << ACCESS) | (1L << ACTION) | (1L << ADA) | (1L << ADD) | (1L << ADMIN) | (1L << AFTER) | (1L << AGGREGATE) | (1L << ALLOCATE) | (1L << ALSO) | (1L << ALTER) | (1L << ALWAYS) | (1L << ARE) | (1L << ASENSITIVE) | (1L << ASSERTION) | (1L << ASSIGNMENT) | (1L << AT) | (1L << ATOMIC) | (1L << ATTRIBUTE) | (1L << ATTRIBUTES) | (1L << AVG) | (1L << BACKWARD) | (1L << BEFORE) | (1L << BEGIN) | (1L << BERNOULLI) | (1L << BETWEEN) | (1L << BIGINT) | (1L << BIT) | (1L << BIT_LENGTH) | (1L << BLOB) | (1L << BOOLEAN) | (1L << BREADTH) | (1L << BY) | (1L << C_) | (1L << CACHE) | (1L << CALL) | (1L << CALLED) | (1L << CARDINALITY) | (1L << CASCADE) | (1L << CASCADED) | (1L << CATALOG))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CATALOG_NAME - 64)) | (1L << (CEIL - 64)) | (1L << (CEILING - 64)) | (1L << (CHAIN - 64)) | (1L << (CHAR - 64)) | (1L << (CHARACTER - 64)) | (1L << (CHARACTERISTICS - 64)) | (1L << (CHARACTERS - 64)) | (1L << (CHARACTER_LENGTH - 64)) | (1L << (CHARACTER_SET_CATALOG - 64)) | (1L << (CHARACTER_SET_NAME - 64)) | (1L << (CHARACTER_SET_SCHEMA - 64)) | (1L << (CHAR_LENGTH - 64)) | (1L << (CHECKPOINT - 64)) | (1L << (CLASS - 64)) | (1L << (CLASS_ORIGIN - 64)) | (1L << (CLOB - 64)) | (1L << (CLOSE - 64)) | (1L << (CLUSTER - 64)) | (1L << (COALESCE - 64)) | (1L << (COBOL - 64)) | (1L << (COLLATION_CATALOG - 64)) | (1L << (COLLATION_NAME - 64)) | (1L << (COLLATION_SCHEMA - 64)) | (1L << (COLLECT - 64)) | (1L << (COLUMN_NAME - 64)) | (1L << (COMMAND_FUNCTION - 64)) | (1L << (COMMAND_FUNCTION_CODE - 64)) | (1L << (COMMENT - 64)) | (1L << (COMMIT - 64)) | (1L << (COMMITTED - 64)) | (1L << (CONDITION - 64)) | (1L << (CONDITION_NUMBER - 64)) | (1L << (CONNECT - 64)) | (1L << (CONNECTION - 64)) | (1L << (CONNECTION_NAME - 64)) | (1L << (CONSTRAINTS - 64)) | (1L << (CONSTRAINT_CATALOG - 64)) | (1L << (CONSTRAINT_NAME - 64)) | (1L << (CONSTRAINT_SCHEMA - 64)) | (1L << (CONSTRUCTOR - 64)) | (1L << (CONTAINS - 64)) | (1L << (CONTINUE - 64)) | (1L << (CONVERSION - 64)) | (1L << (CONVERT - 64)) | (1L << (COPY - 64)) | (1L << (CORR - 64)) | (1L << (CORRESPONDING - 64)) | (1L << (COUNT - 64)) | (1L << (COVAR_POP - 64)) | (1L << (COVAR_SAMP - 64)) | (1L << (CSV - 64)) | (1L << (CUBE - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (CUME_DIST - 128)) | (1L << (CURRENT - 128)) | (1L << (CURRENT_DEFAULT_TRANSFORM_GROUP - 128)) | (1L << (CURRENT_PATH - 128)) | (1L << (CURRENT_TRANSFORM_GROUP_FOR_TYPE - 128)) | (1L << (CURSOR - 128)) | (1L << (CURSOR_NAME - 128)) | (1L << (CYCLE - 128)) | (1L << (DATA - 128)) | (1L << (DATABASE - 128)) | (1L << (DATE - 128)) | (1L << (DATETIME_INTERVAL_CODE - 128)) | (1L << (DATETIME_INTERVAL_PRECISION - 128)) | (1L << (DAY - 128)) | (1L << (DEALLOCATE - 128)) | (1L << (DEC - 128)) | (1L << (DECIMAL - 128)) | (1L << (DECLARE - 128)) | (1L << (DEFAULTS - 128)) | (1L << (DEFERRED - 128)) | (1L << (DEFINED - 128)) | (1L << (DEFINER - 128)) | (1L << (DEGREE - 128)) | (1L << (DELETE - 128)) | (1L << (DELIMITER - 128)) | (1L << (DELIMITERS - 128)) | (1L << (DENSE_RANK - 128)) | (1L << (DEPTH - 128)) | (1L << (DEREF - 128)) | (1L << (DERIVED - 128)) | (1L << (DESCRIBE - 128)) | (1L << (DESCRIPTOR - 128)) | (1L << (DETERMINISTIC - 128)) | (1L << (DIAGNOSTICS - 128)) | (1L << (DICTIONARY - 128)) | (1L << (DISCONNECT - 128)) | (1L << (DISPATCH - 128)) | (1L << (DOMAIN - 128)) | (1L << (DOUBLE - 128)) | (1L << (DROP - 128)) | (1L << (DYNAMIC - 128)) | (1L << (DYNAMIC_FUNCTION - 128)) | (1L << (DYNAMIC_FUNCTION_CODE - 128)) | (1L << (EACH - 128)) | (1L << (ELEMENT - 128)) | (1L << (ENCODING - 128)) | (1L << (ENCRYPTED - 128)) | (1L << (END - 128)) | (1L << (EQUALS - 128)) | (1L << (ESCAPE - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (EVERY - 192)) | (1L << (EXCEPTION - 192)) | (1L << (EXCLUDE - 192)) | (1L << (EXCLUDING - 192)) | (1L << (EXCLUSIVE - 192)) | (1L << (EXEC - 192)) | (1L << (EXECUTE - 192)) | (1L << (EXISTS - 192)) | (1L << (EXP - 192)) | (1L << (EXPLAIN - 192)) | (1L << (EXTERNAL - 192)) | (1L << (EXTRACT - 192)) | (1L << (FILTER - 192)) | (1L << (FINAL - 192)) | (1L << (FIRST - 192)) | (1L << (FLOAT - 192)) | (1L << (FLOOR - 192)) | (1L << (FOLLOWING - 192)) | (1L << (FORCE - 192)) | (1L << (FORTRAN - 192)) | (1L << (FORWARD - 192)) | (1L << (FOUND - 192)) | (1L << (FREE - 192)) | (1L << (FUNCTION - 192)) | (1L << (FUSION - 192)) | (1L << (G_ - 192)) | (1L << (GENERAL - 192)) | (1L << (GENERATED - 192)) | (1L << (GET - 192)) | (1L << (GLOBAL - 192)) | (1L << (GO - 192)) | (1L << (GOTO - 192)) | (1L << (GRANTED - 192)) | (1L << (GROUPING - 192)) | (1L << (HANDLER - 192)) | (1L << (HIERARCHY - 192)) | (1L << (HOLD - 192)) | (1L << (HOUR - 192)) | (1L << (IDENTITY - 192)) | (1L << (IGNORE - 192)) | (1L << (IMMEDIATE - 192)) | (1L << (IMMUTABLE - 192)) | (1L << (IMPLEMENTATION - 192)) | (1L << (IMPLICIT - 192)) | (1L << (INCLUDING - 192)) | (1L << (INCREMENT - 192)) | (1L << (INDEX - 192)) | (1L << (INDICATOR - 192)))) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & ((1L << (INHERITS - 256)) | (1L << (INOUT - 256)) | (1L << (INPUT - 256)) | (1L << (INSENSITIVE - 256)) | (1L << (INSERT - 256)) | (1L << (INSTANCE - 256)) | (1L << (INSTANTIABLE - 256)) | (1L << (INSTEAD - 256)) | (1L << (INT - 256)) | (1L << (INTEGER - 256)) | (1L << (INTERSECTION - 256)) | (1L << (INTERVAL - 256)) | (1L << (INVOKER - 256)) | (1L << (ISOLATION - 256)) | (1L << (KEY - 256)) | (1L << (KEY_MEMBER - 256)) | (1L << (KEY_TYPE - 256)) | (1L << (LANGUAGE - 256)) | (1L << (LARGE - 256)) | (1L << (LAST - 256)) | (1L << (LEFT - 256)) | (1L << (LENGTH - 256)) | (1L << (LEVEL - 256)) | (1L << (LISTEN - 256)) | (1L << (LN - 256)) | (1L << (LOAD - 256)) | (1L << (LOCAL - 256)) | (1L << (LOCATION - 256)) | (1L << (LOCATOR - 256)) | (1L << (LOCK - 256)) | (1L << (LOCKED - 256)) | (1L << (LOWER - 256)) | (1L << (M_ - 256)) | (1L << (MAP - 256)) | (1L << (MATCH - 256)) | (1L << (MATCHED - 256)) | (1L << (MAX - 256)) | (1L << (MAXVALUE - 256)) | (1L << (MEMBER - 256)) | (1L << (MERGE - 256)) | (1L << (MESSAGE_LENGTH - 256)) | (1L << (MESSAGE_OCTET_LENGTH - 256)) | (1L << (MESSAGE_TEXT - 256)) | (1L << (METHOD - 256)) | (1L << (MIN - 256)) | (1L << (MINUTE - 256)))) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & ((1L << (MINVALUE - 320)) | (1L << (MOD - 320)) | (1L << (MODE - 320)) | (1L << (MODIFIES - 320)) | (1L << (MODULE - 320)) | (1L << (MONTH - 320)) | (1L << (MORE_ - 320)) | (1L << (MOVE - 320)) | (1L << (MULTISET - 320)) | (1L << (MUMPS - 320)) | (1L << (NAME - 320)) | (1L << (NAMES - 320)) | (1L << (NATIONAL - 320)) | (1L << (NCHAR - 320)) | (1L << (NCLOB - 320)) | (1L << (NESTING - 320)) | (1L << (NEW - 320)) | (1L << (NEXT - 320)) | (1L << (NO - 320)) | (1L << (NONE - 320)) | (1L << (NORMALIZE - 320)) | (1L << (NORMALIZED - 320)) | (1L << (NOTHING - 320)) | (1L << (NOTIFY - 320)) | (1L << (NOWAIT - 320)) | (1L << (NULLABLE - 320)) | (1L << (NULLIF - 320)) | (1L << (NULLS - 320)) | (1L << (NUMBER - 320)) | (1L << (NUMERIC - 320)) | (1L << (OBJECT - 320)) | (1L << (OCTETS - 320)) | (1L << (OCTET_LENGTH - 320)) | (1L << (OF - 320)) | (1L << (OFF - 320)) | (1L << (OIDS - 320)) | (1L << (OLD - 320)) | (1L << (OPEN - 320)) | (1L << (OPERATOR - 320)) | (1L << (OPTION - 320)) | (1L << (OPTIONS - 320)) | (1L << (ORDERING - 320)) | (1L << (ORDINALITY - 320)) | (1L << (OTHERS - 320)) | (1L << (OUT - 320)) | (1L << (OUTPUT - 320)) | (1L << (OVER - 320)) | (1L << (OVERLAY - 320)) | (1L << (OVERRIDING - 320)))) != 0) || ((((_la - 384)) & ~0x3f) == 0 && ((1L << (_la - 384)) & ((1L << (OWNER - 384)) | (1L << (PAD - 384)) | (1L << (PARAMETER - 384)) | (1L << (PARAMETER_MODE - 384)) | (1L << (PARAMETER_NAME - 384)) | (1L << (PARAMETER_ORDINAL_POSITION - 384)) | (1L << (PARAMETER_SPECIFIC_CATALOG - 384)) | (1L << (PARAMETER_SPECIFIC_NAME - 384)) | (1L << (PARAMETER_SPECIFIC_SCHEMA - 384)) | (1L << (PARTIAL - 384)) | (1L << (PARTITION - 384)) | (1L << (PASCAL - 384)) | (1L << (PASSWORD - 384)) | (1L << (PATH - 384)) | (1L << (PERCENTILE_CONT - 384)) | (1L << (PERCENTILE_DISC - 384)) | (1L << (PERCENT_RANK - 384)) | (1L << (PLI - 384)) | (1L << (POSITION - 384)) | (1L << (POWER - 384)) | (1L << (PRECEDING - 384)) | (1L << (PRECISION - 384)) | (1L << (PREPARE - 384)) | (1L << (PRESERVE - 384)) | (1L << (PRIOR - 384)) | (1L << (PRIVILEGES - 384)) | (1L << (PROCEDURAL - 384)) | (1L << (PROCEDURE - 384)) | (1L << (PUBLIC - 384)) | (1L << (QUOTE - 384)) | (1L << (RANGE - 384)) | (1L << (RANK - 384)) | (1L << (READ - 384)) | (1L << (READS - 384)) | (1L << (REAL - 384)) | (1L << (RECHECK - 384)) | (1L << (RECURSIVE - 384)) | (1L << (REF - 384)) | (1L << (REFERENCING - 384)) | (1L << (REGR_AVGX - 384)) | (1L << (REGR_AVGY - 384)) | (1L << (REGR_COUNT - 384)) | (1L << (REGR_INTERCEPT - 384)) | (1L << (REGR_SLOPE - 384)) | (1L << (REGR_SXX - 384)) | (1L << (REGR_SXY - 384)) | (1L << (REGR_SYY - 384)) | (1L << (REINDEX - 384)) | (1L << (RELATIVE - 384)) | (1L << (RELEASE - 384)) | (1L << (RENAME - 384)) | (1L << (REPEATABLE - 384)) | (1L << (REPLACE - 384)) | (1L << (RESET - 384)) | (1L << (RESTART - 384)) | (1L << (RESTRICT - 384)))) != 0) || ((((_la - 448)) & ~0x3f) == 0 && ((1L << (_la - 448)) & ((1L << (RESULT - 448)) | (1L << (RETURN - 448)) | (1L << (RETURNED_CARDINALITY - 448)) | (1L << (RETURNED_LENGTH - 448)) | (1L << (RETURNED_OCTET_LENGTH - 448)) | (1L << (RETURNED_SQLSTATE - 448)) | (1L << (RETURNS - 448)) | (1L << (REVOKE - 448)) | (1L << (RIGHT - 448)) | (1L << (ROLE - 448)) | (1L << (ROLLBACK - 448)) | (1L << (ROLLUP - 448)) | (1L << (ROUTINE - 448)) | (1L << (ROUTINE_CATALOG - 448)) | (1L << (ROUTINE_NAME - 448)) | (1L << (ROUTINE_SCHEMA - 448)) | (1L << (ROW - 448)) | (1L << (ROWS - 448)) | (1L << (ROW_COUNT - 448)) | (1L << (ROW_NUMBER - 448)) | (1L << (RULE - 448)) | (1L << (SAVEPOINT - 448)) | (1L << (SCALE - 448)) | (1L << (SCHEMA - 448)) | (1L << (SCHEMA_NAME - 448)) | (1L << (SCOPE - 448)) | (1L << (SCOPE_CATALOG - 448)) | (1L << (SCOPE_NAME - 448)) | (1L << (SCOPE_SCHEMA - 448)) | (1L << (SCROLL - 448)) | (1L << (SEARCH - 448)) | (1L << (SECOND - 448)) | (1L << (SECTION - 448)) | (1L << (SECURITY - 448)) | (1L << (SELF - 448)) | (1L << (SENSITIVE - 448)) | (1L << (SEQUENCE - 448)) | (1L << (SERIALIZABLE - 448)) | (1L << (SERVER_NAME - 448)) | (1L << (SESSION - 448)) | (1L << (SET - 448)) | (1L << (SETOF - 448)) | (1L << (SETS - 448)) | (1L << (SHARE - 448)) | (1L << (SHOW - 448)) | (1L << (SIMPLE - 448)) | (1L << (SIZE - 448)) | (1L << (SMALLINT - 448)) | (1L << (SOURCE - 448)) | (1L << (SPACE - 448)) | (1L << (SPECIFIC - 448)) | (1L << (SPECIFICTYPE - 448)) | (1L << (SPECIFIC_NAME - 448)) | (1L << (SQL - 448)) | (1L << (SQLCODE - 448)) | (1L << (SQLERROR - 448)) | (1L << (SQLEXCEPTION - 448)) | (1L << (SQLSTATE - 448)) | (1L << (SQLWARNING - 448)))) != 0) || ((((_la - 512)) & ~0x3f) == 0 && ((1L << (_la - 512)) & ((1L << (SQRT - 512)) | (1L << (STABLE - 512)) | (1L << (START - 512)) | (1L << (STATE - 512)) | (1L << (STATEMENT - 512)) | (1L << (STATIC - 512)) | (1L << (STATISTICS - 512)) | (1L << (STDDEV_POP - 512)) | (1L << (STDDEV_SAMP - 512)) | (1L << (STDIN - 512)) | (1L << (STDOUT - 512)) | (1L << (STORAGE - 512)) | (1L << (STRICT - 512)) | (1L << (STRUCTURE - 512)) | (1L << (STYLE - 512)) | (1L << (SUBCLASS_ORIGIN - 512)) | (1L << (SUBMULTISET - 512)) | (1L << (SUBSTRING - 512)) | (1L << (SUM - 512)) | (1L << (SYSID - 512)) | (1L << (SYSTEM - 512)) | (1L << (SYSTEM_USER - 512)) | (1L << (TABLESPACE - 512)) | (1L << (TABLE_NAME - 512)) | (1L << (TEMP - 512)) | (1L << (TEMPLATE - 512)) | (1L << (TEMPORARY - 512)) | (1L << (TIES - 512)) | (1L << (TIME - 512)) | (1L << (TIMESTAMP - 512)) | (1L << (TIMEZONE_HOUR - 512)) | (1L << (TIMEZONE_MINUTE - 512)) | (1L << (TOP_LEVEL_COUNT - 512)) | (1L << (TRANSACTION - 512)) | (1L << (TRANSACTIONS_COMMITTED - 512)) | (1L << (TRANSACTIONS_ROLLED_BACK - 512)) | (1L << (TRANSACTION_ACTIVE - 512)) | (1L << (TRANSFORM - 512)) | (1L << (TRANSFORMS - 512)) | (1L << (TRANSLATE - 512)) | (1L << (TRANSLATION - 512)) | (1L << (TREAT - 512)) | (1L << (TRIGGER - 512)) | (1L << (TRIGGER_CATALOG - 512)) | (1L << (TRIGGER_NAME - 512)) | (1L << (TRIGGER_SCHEMA - 512)) | (1L << (TRIM - 512)) | (1L << (TRUNCATE - 512)) | (1L << (TRUSTED - 512)) | (1L << (TYPE - 512)) | (1L << (UESCAPE - 512)))) != 0) || ((((_la - 576)) & ~0x3f) == 0 && ((1L << (_la - 576)) & ((1L << (UNBOUNDED - 576)) | (1L << (UNCOMMITTED - 576)) | (1L << (UNDER - 576)) | (1L << (UNENCRYPTED - 576)) | (1L << (UNKNOWN - 576)) | (1L << (UNLISTEN - 576)) | (1L << (UNNAMED - 576)) | (1L << (UNNEST - 576)) | (1L << (UNTIL - 576)) | (1L << (UPDATE - 576)) | (1L << (UPPER - 576)) | (1L << (USAGE - 576)) | (1L << (USER_DEFINED_TYPE_CATALOG - 576)) | (1L << (USER_DEFINED_TYPE_CODE - 576)) | (1L << (USER_DEFINED_TYPE_NAME - 576)) | (1L << (USER_DEFINED_TYPE_SCHEMA - 576)) | (1L << (VACUUM - 576)) | (1L << (VALID - 576)) | (1L << (VALIDATOR - 576)) | (1L << (VALUE - 576)) | (1L << (VALUES - 576)) | (1L << (VARCHAR - 576)) | (1L << (VARYING - 576)) | (1L << (VAR_POP - 576)) | (1L << (VAR_SAMP - 576)) | (1L << (VIEW - 576)) | (1L << (VOLATILE - 576)) | (1L << (WHENEVER - 576)) | (1L << (WIDTH_BUCKET - 576)) | (1L << (WITHIN - 576)) | (1L << (WITHOUT - 576)) | (1L << (WORK - 576)) | (1L << (WRITE - 576)) | (1L << (YEAR - 576)) | (1L << (ZONE - 576)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public Non_reserved_keywordContext non_reserved_keyword() {
			return getRuleContext(Non_reserved_keywordContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(PostgreSQLParser.IDENTIFIER, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode DOT() { return getToken(PostgreSQLParser.DOT, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		return identifier(0);
	}

	private IdentifierContext identifier(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		IdentifierContext _localctx = new IdentifierContext(_ctx, _parentState);
		IdentifierContext _prevctx = _localctx;
		int _startState = 446;
		enterRecursionRule(_localctx, 446, RULE_identifier, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2932);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHITESPACE:
			case A_:
			case ABORT:
			case ABS:
			case ABSOLUTE:
			case ACCESS:
			case ACTION:
			case ADA:
			case ADD:
			case ADMIN:
			case AFTER:
			case AGGREGATE:
			case ALLOCATE:
			case ALSO:
			case ALTER:
			case ALWAYS:
			case ARE:
			case ASENSITIVE:
			case ASSERTION:
			case ASSIGNMENT:
			case AT:
			case ATOMIC:
			case ATTRIBUTE:
			case ATTRIBUTES:
			case AVG:
			case BACKWARD:
			case BEFORE:
			case BEGIN:
			case BERNOULLI:
			case BETWEEN:
			case BIGINT:
			case BIT:
			case BIT_LENGTH:
			case BLOB:
			case BOOLEAN:
			case BREADTH:
			case BY:
			case C_:
			case CACHE:
			case CALL:
			case CALLED:
			case CARDINALITY:
			case CASCADE:
			case CASCADED:
			case CATALOG:
			case CATALOG_NAME:
			case CEIL:
			case CEILING:
			case CHAIN:
			case CHAR:
			case CHARACTER:
			case CHARACTERISTICS:
			case CHARACTERS:
			case CHARACTER_LENGTH:
			case CHARACTER_SET_CATALOG:
			case CHARACTER_SET_NAME:
			case CHARACTER_SET_SCHEMA:
			case CHAR_LENGTH:
			case CHECKPOINT:
			case CLASS:
			case CLASS_ORIGIN:
			case CLOB:
			case CLOSE:
			case CLUSTER:
			case COALESCE:
			case COBOL:
			case COLLATION_CATALOG:
			case COLLATION_NAME:
			case COLLATION_SCHEMA:
			case COLLECT:
			case COLUMN_NAME:
			case COMMAND_FUNCTION:
			case COMMAND_FUNCTION_CODE:
			case COMMENT:
			case COMMIT:
			case COMMITTED:
			case CONDITION:
			case CONDITION_NUMBER:
			case CONNECT:
			case CONNECTION:
			case CONNECTION_NAME:
			case CONSTRAINTS:
			case CONSTRAINT_CATALOG:
			case CONSTRAINT_NAME:
			case CONSTRAINT_SCHEMA:
			case CONSTRUCTOR:
			case CONTAINS:
			case CONTINUE:
			case CONVERSION:
			case CONVERT:
			case COPY:
			case CORR:
			case CORRESPONDING:
			case COUNT:
			case COVAR_POP:
			case COVAR_SAMP:
			case CSV:
			case CUBE:
			case CUME_DIST:
			case CURRENT:
			case CURRENT_DEFAULT_TRANSFORM_GROUP:
			case CURRENT_PATH:
			case CURRENT_TRANSFORM_GROUP_FOR_TYPE:
			case CURSOR:
			case CURSOR_NAME:
			case CYCLE:
			case DATA:
			case DATABASE:
			case DATE:
			case DATETIME_INTERVAL_CODE:
			case DATETIME_INTERVAL_PRECISION:
			case DAY:
			case DEALLOCATE:
			case DEC:
			case DECIMAL:
			case DECLARE:
			case DEFAULTS:
			case DEFERRED:
			case DEFINED:
			case DEFINER:
			case DEGREE:
			case DELETE:
			case DELIMITER:
			case DELIMITERS:
			case DENSE_RANK:
			case DEPTH:
			case DEREF:
			case DERIVED:
			case DESCRIBE:
			case DESCRIPTOR:
			case DETERMINISTIC:
			case DIAGNOSTICS:
			case DICTIONARY:
			case DISCONNECT:
			case DISPATCH:
			case DOMAIN:
			case DOUBLE:
			case DROP:
			case DYNAMIC:
			case DYNAMIC_FUNCTION:
			case DYNAMIC_FUNCTION_CODE:
			case EACH:
			case ELEMENT:
			case ENCODING:
			case ENCRYPTED:
			case END:
			case EQUALS:
			case ESCAPE:
			case EVERY:
			case EXCEPTION:
			case EXCLUDE:
			case EXCLUDING:
			case EXCLUSIVE:
			case EXEC:
			case EXECUTE:
			case EXISTS:
			case EXP:
			case EXPLAIN:
			case EXTERNAL:
			case EXTRACT:
			case FILTER:
			case FINAL:
			case FIRST:
			case FLOAT:
			case FLOOR:
			case FOLLOWING:
			case FORCE:
			case FORTRAN:
			case FORWARD:
			case FOUND:
			case FREE:
			case FUNCTION:
			case FUSION:
			case G_:
			case GENERAL:
			case GENERATED:
			case GET:
			case GLOBAL:
			case GO:
			case GOTO:
			case GRANTED:
			case GROUPING:
			case HANDLER:
			case HIERARCHY:
			case HOLD:
			case HOUR:
			case IDENTITY:
			case IGNORE:
			case IMMEDIATE:
			case IMMUTABLE:
			case IMPLEMENTATION:
			case IMPLICIT:
			case INCLUDING:
			case INCREMENT:
			case INDEX:
			case INDICATOR:
			case INHERITS:
			case INOUT:
			case INPUT:
			case INSENSITIVE:
			case INSERT:
			case INSTANCE:
			case INSTANTIABLE:
			case INSTEAD:
			case INT:
			case INTEGER:
			case INTERSECTION:
			case INTERVAL:
			case INVOKER:
			case ISOLATION:
			case KEY:
			case KEY_MEMBER:
			case KEY_TYPE:
			case LANGUAGE:
			case LARGE:
			case LAST:
			case LEFT:
			case LENGTH:
			case LEVEL:
			case LISTEN:
			case LN:
			case LOAD:
			case LOCAL:
			case LOCATION:
			case LOCATOR:
			case LOCK:
			case LOCKED:
			case LOWER:
			case M_:
			case MAP:
			case MATCH:
			case MATCHED:
			case MAX:
			case MAXVALUE:
			case MEMBER:
			case MERGE:
			case MESSAGE_LENGTH:
			case MESSAGE_OCTET_LENGTH:
			case MESSAGE_TEXT:
			case METHOD:
			case MIN:
			case MINUTE:
			case MINVALUE:
			case MOD:
			case MODE:
			case MODIFIES:
			case MODULE:
			case MONTH:
			case MORE_:
			case MOVE:
			case MULTISET:
			case MUMPS:
			case NAME:
			case NAMES:
			case NATIONAL:
			case NCHAR:
			case NCLOB:
			case NESTING:
			case NEW:
			case NEXT:
			case NO:
			case NONE:
			case NORMALIZE:
			case NORMALIZED:
			case NOTHING:
			case NOTIFY:
			case NOWAIT:
			case NULLABLE:
			case NULLIF:
			case NULLS:
			case NUMBER:
			case NUMERIC:
			case OBJECT:
			case OCTETS:
			case OCTET_LENGTH:
			case OF:
			case OFF:
			case OIDS:
			case OLD:
			case OPEN:
			case OPERATOR:
			case OPTION:
			case OPTIONS:
			case ORDERING:
			case ORDINALITY:
			case OTHERS:
			case OUT:
			case OUTPUT:
			case OVER:
			case OVERLAY:
			case OVERRIDING:
			case OWNER:
			case PAD:
			case PARAMETER:
			case PARAMETER_MODE:
			case PARAMETER_NAME:
			case PARAMETER_ORDINAL_POSITION:
			case PARAMETER_SPECIFIC_CATALOG:
			case PARAMETER_SPECIFIC_NAME:
			case PARAMETER_SPECIFIC_SCHEMA:
			case PARTIAL:
			case PARTITION:
			case PASCAL:
			case PASSWORD:
			case PATH:
			case PERCENTILE_CONT:
			case PERCENTILE_DISC:
			case PERCENT_RANK:
			case PLI:
			case POSITION:
			case POWER:
			case PRECEDING:
			case PRECISION:
			case PREPARE:
			case PRESERVE:
			case PRIOR:
			case PRIVILEGES:
			case PROCEDURAL:
			case PROCEDURE:
			case PUBLIC:
			case QUOTE:
			case RANGE:
			case RANK:
			case READ:
			case READS:
			case REAL:
			case RECHECK:
			case RECURSIVE:
			case REF:
			case REFERENCING:
			case REGR_AVGX:
			case REGR_AVGY:
			case REGR_COUNT:
			case REGR_INTERCEPT:
			case REGR_SLOPE:
			case REGR_SXX:
			case REGR_SXY:
			case REGR_SYY:
			case REINDEX:
			case RELATIVE:
			case RELEASE:
			case RENAME:
			case REPEATABLE:
			case REPLACE:
			case RESET:
			case RESTART:
			case RESTRICT:
			case RESULT:
			case RETURN:
			case RETURNED_CARDINALITY:
			case RETURNED_LENGTH:
			case RETURNED_OCTET_LENGTH:
			case RETURNED_SQLSTATE:
			case RETURNS:
			case REVOKE:
			case RIGHT:
			case ROLE:
			case ROLLBACK:
			case ROLLUP:
			case ROUTINE:
			case ROUTINE_CATALOG:
			case ROUTINE_NAME:
			case ROUTINE_SCHEMA:
			case ROW:
			case ROWS:
			case ROW_COUNT:
			case ROW_NUMBER:
			case RULE:
			case SAVEPOINT:
			case SCALE:
			case SCHEMA:
			case SCHEMA_NAME:
			case SCOPE:
			case SCOPE_CATALOG:
			case SCOPE_NAME:
			case SCOPE_SCHEMA:
			case SCROLL:
			case SEARCH:
			case SECOND:
			case SECTION:
			case SECURITY:
			case SELF:
			case SENSITIVE:
			case SEQUENCE:
			case SERIALIZABLE:
			case SERVER_NAME:
			case SESSION:
			case SET:
			case SETOF:
			case SETS:
			case SHARE:
			case SHOW:
			case SIMPLE:
			case SIZE:
			case SMALLINT:
			case SOURCE:
			case SPACE:
			case SPECIFIC:
			case SPECIFICTYPE:
			case SPECIFIC_NAME:
			case SQL:
			case SQLCODE:
			case SQLERROR:
			case SQLEXCEPTION:
			case SQLSTATE:
			case SQLWARNING:
			case SQRT:
			case STABLE:
			case START:
			case STATE:
			case STATEMENT:
			case STATIC:
			case STATISTICS:
			case STDDEV_POP:
			case STDDEV_SAMP:
			case STDIN:
			case STDOUT:
			case STORAGE:
			case STRICT:
			case STRUCTURE:
			case STYLE:
			case SUBCLASS_ORIGIN:
			case SUBMULTISET:
			case SUBSTRING:
			case SUM:
			case SYSID:
			case SYSTEM:
			case SYSTEM_USER:
			case TABLESPACE:
			case TABLE_NAME:
			case TEMP:
			case TEMPLATE:
			case TEMPORARY:
			case TIES:
			case TIME:
			case TIMESTAMP:
			case TIMEZONE_HOUR:
			case TIMEZONE_MINUTE:
			case TOP_LEVEL_COUNT:
			case TRANSACTION:
			case TRANSACTIONS_COMMITTED:
			case TRANSACTIONS_ROLLED_BACK:
			case TRANSACTION_ACTIVE:
			case TRANSFORM:
			case TRANSFORMS:
			case TRANSLATE:
			case TRANSLATION:
			case TREAT:
			case TRIGGER:
			case TRIGGER_CATALOG:
			case TRIGGER_NAME:
			case TRIGGER_SCHEMA:
			case TRIM:
			case TRUNCATE:
			case TRUSTED:
			case TYPE:
			case UESCAPE:
			case UNBOUNDED:
			case UNCOMMITTED:
			case UNDER:
			case UNENCRYPTED:
			case UNKNOWN:
			case UNLISTEN:
			case UNNAMED:
			case UNNEST:
			case UNTIL:
			case UPDATE:
			case UPPER:
			case USAGE:
			case USER_DEFINED_TYPE_CATALOG:
			case USER_DEFINED_TYPE_CODE:
			case USER_DEFINED_TYPE_NAME:
			case USER_DEFINED_TYPE_SCHEMA:
			case VACUUM:
			case VALID:
			case VALIDATOR:
			case VALUE:
			case VALUES:
			case VARCHAR:
			case VARYING:
			case VAR_POP:
			case VAR_SAMP:
			case VIEW:
			case VOLATILE:
			case WHENEVER:
			case WIDTH_BUCKET:
			case WITHIN:
			case WITHOUT:
			case WORK:
			case WRITE:
			case YEAR:
			case ZONE:
				{
				setState(2930);
				non_reserved_keyword();
				}
				break;
			case IDENTIFIER:
				{
				setState(2931);
				match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(2939);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,297,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new IdentifierContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_identifier);
					setState(2934);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2935);
					match(DOT);
					setState(2936);
					identifier(2);
					}
					} 
				}
				setState(2941);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,297,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Todo_fill_inContext extends ParserRuleContext {
		public Todo_fill_inContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_todo_fill_in; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterTodo_fill_in(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitTodo_fill_in(this);
		}
	}

	public final Todo_fill_inContext todo_fill_in() throws RecognitionException {
		Todo_fill_inContext _localctx = new Todo_fill_inContext(_ctx, getState());
		enterRule(_localctx, 448, RULE_todo_fill_in);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2942);
			matchWildcard();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Todo_implementContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Todo_implementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_todo_implement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterTodo_implement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitTodo_implement(this);
		}
	}

	public final Todo_implementContext todo_implement() throws RecognitionException {
		Todo_implementContext _localctx = new Todo_implementContext(_ctx, getState());
		enterRule(_localctx, 450, RULE_todo_implement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2944);
			identifier(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Correlation_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Correlation_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_correlation_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterCorrelation_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitCorrelation_name(this);
		}
	}

	public final Correlation_nameContext correlation_name() throws RecognitionException {
		Correlation_nameContext _localctx = new Correlation_nameContext(_ctx, getState());
		enterRule(_localctx, 452, RULE_correlation_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2946);
			identifier(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterColumn_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitColumn_name(this);
		}
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 454, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2948);
			identifier(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AliasContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitAlias(this);
		}
	}

	public final AliasContext alias() throws RecognitionException {
		AliasContext _localctx = new AliasContext(_ctx, getState());
		enterRule(_localctx, 456, RULE_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2950);
			identifier(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_aliasContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Column_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterColumn_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitColumn_alias(this);
		}
	}

	public final Column_aliasContext column_alias() throws RecognitionException {
		Column_aliasContext _localctx = new Column_aliasContext(_ctx, getState());
		enterRule(_localctx, 458, RULE_column_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2952);
			identifier(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_definitionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Column_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterColumn_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitColumn_definition(this);
		}
	}

	public final Column_definitionContext column_definition() throws RecognitionException {
		Column_definitionContext _localctx = new Column_definitionContext(_ctx, getState());
		enterRule(_localctx, 460, RULE_column_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2954);
			identifier(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Window_nameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Window_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_window_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).enterWindow_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostgreSQLParserListener ) ((PostgreSQLParserListener)listener).exitWindow_name(this);
		}
	}

	public final Window_nameContext window_name() throws RecognitionException {
		Window_nameContext _localctx = new Window_nameContext(_ctx, getState());
		enterRule(_localctx, 462, RULE_window_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2956);
			identifier(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 200:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 201:
			return bool_expr_sempred((Bool_exprContext)_localctx, predIndex);
		case 211:
			return type_sempred((TypeContext)_localctx, predIndex);
		case 217:
			return from_item_sempred((From_itemContext)_localctx, predIndex);
		case 221:
			return predicate_sempred((PredicateContext)_localctx, predIndex);
		case 223:
			return identifier_sempred((IdentifierContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 22);
		case 1:
			return precpred(_ctx, 21);
		case 2:
			return precpred(_ctx, 20);
		case 3:
			return precpred(_ctx, 19);
		case 4:
			return precpred(_ctx, 18);
		case 5:
			return precpred(_ctx, 17);
		case 6:
			return precpred(_ctx, 16);
		case 7:
			return precpred(_ctx, 15);
		case 8:
			return precpred(_ctx, 28);
		case 9:
			return precpred(_ctx, 23);
		case 10:
			return precpred(_ctx, 14);
		case 11:
			return precpred(_ctx, 13);
		case 12:
			return precpred(_ctx, 6);
		case 13:
			return precpred(_ctx, 5);
		case 14:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean bool_expr_sempred(Bool_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 15:
			return precpred(_ctx, 2);
		case 16:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 17:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean from_item_sempred(From_itemContext _localctx, int predIndex) {
		switch (predIndex) {
		case 18:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean predicate_sempred(PredicateContext _localctx, int predIndex) {
		switch (predIndex) {
		case 19:
			return precpred(_ctx, 3);
		case 20:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean identifier_sempred(IdentifierContext _localctx, int predIndex) {
		switch (predIndex) {
		case 21:
			return precpred(_ctx, 1);
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0305\u0b91\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"+
		"\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"+
		"\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1\4\u00b2"+
		"\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\4\u00b5\t\u00b5\4\u00b6\t\u00b6"+
		"\4\u00b7\t\u00b7\4\u00b8\t\u00b8\4\u00b9\t\u00b9\4\u00ba\t\u00ba\4\u00bb"+
		"\t\u00bb\4\u00bc\t\u00bc\4\u00bd\t\u00bd\4\u00be\t\u00be\4\u00bf\t\u00bf"+
		"\4\u00c0\t\u00c0\4\u00c1\t\u00c1\4\u00c2\t\u00c2\4\u00c3\t\u00c3\4\u00c4"+
		"\t\u00c4\4\u00c5\t\u00c5\4\u00c6\t\u00c6\4\u00c7\t\u00c7\4\u00c8\t\u00c8"+
		"\4\u00c9\t\u00c9\4\u00ca\t\u00ca\4\u00cb\t\u00cb\4\u00cc\t\u00cc\4\u00cd"+
		"\t\u00cd\4\u00ce\t\u00ce\4\u00cf\t\u00cf\4\u00d0\t\u00d0\4\u00d1\t\u00d1"+
		"\4\u00d2\t\u00d2\4\u00d3\t\u00d3\4\u00d4\t\u00d4\4\u00d5\t\u00d5\4\u00d6"+
		"\t\u00d6\4\u00d7\t\u00d7\4\u00d8\t\u00d8\4\u00d9\t\u00d9\4\u00da\t\u00da"+
		"\4\u00db\t\u00db\4\u00dc\t\u00dc\4\u00dd\t\u00dd\4\u00de\t\u00de\4\u00df"+
		"\t\u00df\4\u00e0\t\u00e0\4\u00e1\t\u00e1\4\u00e2\t\u00e2\4\u00e3\t\u00e3"+
		"\4\u00e4\t\u00e4\4\u00e5\t\u00e5\4\u00e6\t\u00e6\4\u00e7\t\u00e7\4\u00e8"+
		"\t\u00e8\4\u00e9\t\u00e9\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\u020a\n\2\3\2\3\2\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\5\4\u0238\n\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3"+
		"\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3"+
		"\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3"+
		"\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3"+
		"\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3"+
		"*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63"+
		"\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64\u02bf"+
		"\n\64\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66"+
		"\3\66\5\66\u02cf\n\66\3\66\5\66\u02d2\n\66\3\66\3\66\3\66\3\66\3\66\3"+
		"\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u02e2\n\66\3\66\3\66"+
		"\3\66\3\66\5\66\u02e8\n\66\3\66\3\66\5\66\u02ec\n\66\3\66\3\66\3\66\3"+
		"\66\5\66\u02f2\n\66\3\66\3\66\3\66\3\66\5\66\u02f8\n\66\3\66\3\66\3\66"+
		"\3\66\5\66\u02fe\n\66\3\66\3\66\3\66\3\66\5\66\u0304\n\66\3\66\3\66\3"+
		"\66\3\66\5\66\u030a\n\66\3\66\3\66\3\66\3\66\5\66\u0310\n\66\3\66\3\66"+
		"\3\66\3\66\5\66\u0316\n\66\3\66\3\66\3\66\3\66\5\66\u031c\n\66\3\66\3"+
		"\66\3\66\3\66\5\66\u0322\n\66\3\66\3\66\5\66\u0326\n\66\3\66\3\66\3\66"+
		"\3\66\5\66\u032c\n\66\3\66\3\66\3\66\3\66\5\66\u0332\n\66\3\66\3\66\3"+
		"\66\3\66\5\66\u0338\n\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u0341"+
		"\n\66\3\66\5\66\u0344\n\66\3\66\5\66\u0347\n\66\3\66\3\66\3\66\5\66\u034c"+
		"\n\66\3\66\5\66\u034f\n\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\5\66\u035f\n\66\3\66\3\66\3\66\3\66\5\66\u0365"+
		"\n\66\3\66\3\66\5\66\u0369\n\66\3\66\3\66\3\66\3\66\5\66\u036f\n\66\3"+
		"\66\3\66\3\66\3\66\5\66\u0375\n\66\3\66\3\66\5\66\u0379\n\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\5\66\u0390\n\66\3\66\3\66\3\66\3\66\5\66\u0396"+
		"\n\66\3\66\3\66\5\66\u039a\n\66\3\66\3\66\3\66\3\66\5\66\u03a0\n\66\3"+
		"\66\3\66\3\66\3\66\5\66\u03a6\n\66\3\66\3\66\3\66\3\66\5\66\u03ac\n\66"+
		"\3\66\3\66\3\66\3\66\5\66\u03b2\n\66\3\66\3\66\3\66\3\66\5\66\u03b8\n"+
		"\66\3\66\3\66\3\66\3\66\5\66\u03be\n\66\3\66\3\66\3\66\3\66\5\66\u03c4"+
		"\n\66\3\66\3\66\3\66\3\66\5\66\u03ca\n\66\3\66\3\66\3\66\3\66\5\66\u03d0"+
		"\n\66\3\66\3\66\5\66\u03d4\n\66\3\66\3\66\3\66\3\66\5\66\u03da\n\66\3"+
		"\66\3\66\3\66\3\66\5\66\u03e0\n\66\3\66\3\66\5\66\u03e4\n\66\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\5\67\u03f4"+
		"\n\67\3\67\3\67\3\67\3\67\5\67\u03fa\n\67\3\67\3\67\3\67\3\67\5\67\u0400"+
		"\n\67\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\58\u0414\n"+
		"8\39\39\39\79\u0419\n9\f9\169\u041c\139\3:\3:\3:\3:\3:\5:\u0423\n:\3:"+
		"\3:\3:\3:\3:\3:\3:\3:\3:\3:\5:\u042f\n:\3:\3:\3:\3:\5:\u0435\n:\3;\3;"+
		"\5;\u0439\n;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<\5<\u0448\n<\3<\3<"+
		"\3<\5<\u044d\n<\3<\3<\3<\5<\u0452\n<\3<\3<\3<\5<\u0457\n<\3<\3<\3<\5<"+
		"\u045c\n<\3<\3<\3<\5<\u0461\n<\3<\3<\3<\5<\u0466\n<\3<\3<\3<\5<\u046b"+
		"\n<\3<\3<\3<\3<\5<\u0471\n<\3<\3<\3<\5<\u0476\n<\5<\u0478\n<\5<\u047a"+
		"\n<\3=\3=\5=\u047e\n=\3=\3=\3=\3=\3=\3=\3=\3=\5=\u0488\n=\3>\3>\3>\3>"+
		"\5>\u048e\n>\3>\3>\3>\3>\3>\3>\7>\u0496\n>\f>\16>\u0499\13>\3?\3?\3?\3"+
		"?\3?\3?\7?\u04a1\n?\f?\16?\u04a4\13?\3?\3?\3?\7?\u04a9\n?\f?\16?\u04ac"+
		"\13?\3@\3@\3@\3@\3@\3@\3@\3@\5@\u04b6\n@\3@\3@\3@\3@\3@\3@\3A\3A\3A\3"+
		"A\7A\u04c2\nA\fA\16A\u04c5\13A\3B\3B\3B\3B\3B\3B\3B\3B\3B\7B\u04d0\nB"+
		"\fB\16B\u04d3\13B\3B\3B\3B\3B\5B\u04d9\nB\3B\3B\3B\3B\3B\5B\u04e0\nB\3"+
		"C\3C\3C\3C\3C\3C\5C\u04e8\nC\3C\3C\3C\3C\3C\3C\3C\3C\3C\5C\u04f3\nC\3"+
		"C\3C\5C\u04f7\nC\3C\3C\3C\5C\u04fc\nC\3C\3C\3C\3C\3C\3C\3C\5C\u0505\n"+
		"C\3D\3D\3D\5D\u050a\nD\3D\3D\3D\3E\3E\3E\3E\5E\u0513\nE\3E\3E\3E\3E\3"+
		"E\3E\3E\3E\3E\3E\3E\3E\3E\5E\u0522\nE\3E\3E\3E\3E\3E\3E\3E\3E\3E\3E\3"+
		"E\3E\3E\3E\3E\3E\3E\3E\3E\6E\u0537\nE\rE\16E\u0538\5E\u053b\nE\3F\3F\5"+
		"F\u053f\nF\3F\3F\5F\u0543\nF\3F\3F\3F\5F\u0548\nF\3F\5F\u054b\nF\3F\3"+
		"F\3F\3F\5F\u0551\nF\3F\3F\5F\u0555\nF\3F\3F\5F\u0559\nF\3G\3G\3G\5G\u055e"+
		"\nG\3G\5G\u0561\nG\3G\3G\3G\3G\3G\5G\u0568\nG\3G\5G\u056b\nG\3G\5G\u056e"+
		"\nG\3G\3G\3G\3G\3G\3G\5G\u0576\nG\3G\3G\5G\u057a\nG\5G\u057c\nG\3H\3H"+
		"\3H\3H\3H\3H\5H\u0584\nH\3H\3H\3H\3H\3H\5H\u058b\nH\3H\5H\u058e\nH\3H"+
		"\3H\5H\u0592\nH\3H\3H\3H\3H\5H\u0598\nH\3H\5H\u059b\nH\3I\3I\3I\3I\3I"+
		"\3I\3I\3I\3I\3I\3I\5I\u05a8\nI\3I\3I\3I\3I\5I\u05ae\nI\3I\3I\3I\3I\5I"+
		"\u05b4\nI\3I\3I\3I\3I\5I\u05ba\nI\3I\3I\3I\3I\5I\u05c0\nI\3I\3I\3I\3I"+
		"\5I\u05c6\nI\3I\3I\5I\u05ca\nI\3I\3I\5I\u05ce\nI\3I\3I\3J\3J\3J\3J\3J"+
		"\3J\3J\3J\3J\5J\u05db\nJ\3J\3J\3J\3J\3J\3J\5J\u05e3\nJ\3J\3J\5J\u05e7"+
		"\nJ\3J\3J\3J\3J\3J\3J\3J\5J\u05f0\nJ\3K\3K\3K\3K\3K\5K\u05f7\nK\3K\3K"+
		"\3K\3K\3K\3K\3K\5K\u0600\nK\3K\3K\3K\3K\7K\u0606\nK\fK\16K\u0609\13K\3"+
		"L\3L\3L\3L\3L\3L\3L\3M\3M\3M\3M\3M\3M\3M\5M\u0619\nM\3M\3M\3M\3M\3M\5"+
		"M\u0620\nM\5M\u0622\nM\3M\3M\3M\3M\3M\5M\u0629\nM\3M\3M\3M\3M\3M\3M\5"+
		"M\u0631\nM\3N\3N\3N\3N\3N\5N\u0638\nN\3N\5N\u063b\nN\3N\3N\3N\3N\3N\3"+
		"N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\5N\u064f\nN\3N\3N\3N\3N\3N\3N\3"+
		"N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\3N\6N\u0664\nN\rN\16N\u0665\5N\u0668"+
		"\nN\3O\3O\3P\3P\3P\5P\u066f\nP\3P\3P\3P\3P\3P\3P\3P\3P\3P\5P\u067a\nP"+
		"\3P\3P\5P\u067e\nP\3P\3P\5P\u0682\nP\3Q\3Q\3Q\5Q\u0687\nQ\3R\3R\3R\3R"+
		"\3R\5R\u068e\nR\3R\5R\u0691\nR\3R\3R\3R\3R\3R\5R\u0698\nR\3R\3R\3R\3R"+
		"\3R\3R\3R\3R\5R\u06a2\nR\3R\3R\3R\3R\3R\3R\3R\5R\u06ab\nR\3S\3S\5S\u06af"+
		"\nS\3S\3S\3S\3S\5S\u06b5\nS\3S\3S\3S\5S\u06ba\nS\3S\5S\u06bd\nS\3S\3S"+
		"\3S\3S\5S\u06c3\nS\3S\3S\3S\3S\5S\u06c9\nS\3S\3S\5S\u06cd\nS\3S\5S\u06d0"+
		"\nS\3S\3S\5S\u06d4\nS\3S\5S\u06d7\nS\3S\5S\u06da\nS\3S\3S\3S\3S\3S\3S"+
		"\3S\5S\u06e3\nS\5S\u06e5\nS\3T\3T\3U\3U\3V\3V\3W\3W\3X\3X\3Y\3Y\3Z\3Z"+
		"\3[\3[\3\\\3\\\3]\3]\3^\3^\3_\3_\3`\3`\3a\3a\3b\3b\3c\3c\3d\3d\3e\3e\3"+
		"f\3f\3g\3g\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3"+
		"h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\3h\5h\u0738"+
		"\nh\3i\3i\3j\3j\3k\3k\3l\3l\3m\3m\3n\3n\3o\3o\3p\3p\3q\3q\3r\3r\3s\3s"+
		"\3t\3t\3u\3u\3v\3v\3w\3w\3x\3x\3y\3y\3z\3z\3{\3{\3|\3|\3}\3}\3~\3~\3\177"+
		"\3\177\3\u0080\3\u0080\3\u0081\3\u0081\3\u0082\3\u0082\3\u0083\3\u0083"+
		"\3\u0084\3\u0084\3\u0085\3\u0085\3\u0086\3\u0086\3\u0087\3\u0087\3\u0088"+
		"\3\u0088\3\u0089\3\u0089\3\u008a\3\u008a\3\u008b\3\u008b\3\u008c\3\u008c"+
		"\3\u008d\3\u008d\3\u008e\3\u008e\3\u008f\3\u008f\3\u0090\3\u0090\3\u0091"+
		"\3\u0091\3\u0092\3\u0092\3\u0093\3\u0093\3\u0094\3\u0094\3\u0095\3\u0095"+
		"\3\u0096\3\u0096\3\u0097\3\u0097\3\u0098\3\u0098\3\u0099\3\u0099\3\u009a"+
		"\3\u009a\3\u009b\3\u009b\3\u009c\3\u009c\3\u009d\3\u009d\3\u009e\3\u009e"+
		"\3\u009f\3\u009f\3\u00a0\3\u00a0\3\u00a1\3\u00a1\3\u00a2\3\u00a2\3\u00a3"+
		"\3\u00a3\3\u00a4\3\u00a4\3\u00a5\3\u00a5\3\u00a6\3\u00a6\3\u00a7\3\u00a7"+
		"\3\u00a8\3\u00a8\3\u00a9\3\u00a9\3\u00aa\3\u00aa\3\u00aa\5\u00aa\u07bf"+
		"\n\u00aa\3\u00aa\5\u00aa\u07c2\n\u00aa\3\u00aa\5\u00aa\u07c5\n\u00aa\3"+
		"\u00aa\5\u00aa\u07c8\n\u00aa\3\u00aa\5\u00aa\u07cb\n\u00aa\3\u00aa\5\u00aa"+
		"\u07ce\n\u00aa\3\u00aa\5\u00aa\u07d1\n\u00aa\3\u00aa\5\u00aa\u07d4\n\u00aa"+
		"\3\u00aa\5\u00aa\u07d7\n\u00aa\3\u00aa\5\u00aa\u07da\n\u00aa\3\u00aa\5"+
		"\u00aa\u07dd\n\u00aa\3\u00ab\3\u00ab\3\u00ac\3\u00ac\3\u00ad\3\u00ad\3"+
		"\u00ae\3\u00ae\3\u00af\3\u00af\3\u00b0\3\u00b0\3\u00b1\3\u00b1\3\u00b2"+
		"\3\u00b2\3\u00b3\3\u00b3\3\u00b4\3\u00b4\3\u00b5\3\u00b5\3\u00b5\3\u00b5"+
		"\3\u00b5\3\u00b5\5\u00b5\u07f9\n\u00b5\3\u00b5\5\u00b5\u07fc\n\u00b5\3"+
		"\u00b5\5\u00b5\u07ff\n\u00b5\3\u00b5\5\u00b5\u0802\n\u00b5\5\u00b5\u0804"+
		"\n\u00b5\3\u00b6\3\u00b6\3\u00b6\3\u00b6\5\u00b6\u080a\n\u00b6\5\u00b6"+
		"\u080c\n\u00b6\3\u00b6\3\u00b6\3\u00b6\5\u00b6\u0811\n\u00b6\3\u00b6\5"+
		"\u00b6\u0814\n\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\5\u00b6\u081a\n\u00b6"+
		"\3\u00b6\5\u00b6\u081d\n\u00b6\5\u00b6\u081f\n\u00b6\7\u00b6\u0821\n\u00b6"+
		"\f\u00b6\16\u00b6\u0824\13\u00b6\5\u00b6\u0826\n\u00b6\3\u00b7\3\u00b7"+
		"\3\u00b7\3\u00b7\7\u00b7\u082c\n\u00b7\f\u00b7\16\u00b7\u082f\13\u00b7"+
		"\3\u00b8\3\u00b8\3\u00b8\3\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9\7\u00b9"+
		"\u0839\n\u00b9\f\u00b9\16\u00b9\u083c\13\u00b9\3\u00ba\3\u00ba\3\u00ba"+
		"\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\5\u00ba\u0846\n\u00ba\3\u00ba"+
		"\3\u00ba\3\u00ba\5\u00ba\u084b\n\u00ba\7\u00ba\u084d\n\u00ba\f\u00ba\16"+
		"\u00ba\u0850\13\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\5\u00ba"+
		"\u0857\n\u00ba\3\u00bb\3\u00bb\3\u00bb\3\u00bb\7\u00bb\u085d\n\u00bb\f"+
		"\u00bb\16\u00bb\u0860\13\u00bb\3\u00bb\3\u00bb\3\u00bc\3\u00bc\3\u00bc"+
		"\3\u00bc\7\u00bc\u0868\n\u00bc\f\u00bc\16\u00bc\u086b\13\u00bc\3\u00bd"+
		"\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd"+
		"\5\u00bd\u0877\n\u00bd\3\u00be\3\u00be\3\u00bf\3\u00bf\3\u00c0\3\u00c0"+
		"\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\3\u00c0\5\u00c0\u0885\n\u00c0"+
		"\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c1\7\u00c1\u088d\n\u00c1"+
		"\f\u00c1\16\u00c1\u0890\13\u00c1\3\u00c1\5\u00c1\u0893\n\u00c1\3\u00c2"+
		"\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c3\3\u00c3\5\u00c3"+
		"\u089e\n\u00c3\3\u00c3\3\u00c3\3\u00c4\3\u00c4\3\u00c4\3\u00c4\3\u00c4"+
		"\7\u00c4\u08a7\n\u00c4\f\u00c4\16\u00c4\u08aa\13\u00c4\3\u00c5\3\u00c5"+
		"\5\u00c5\u08ae\n\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\5\u00c5\u08b4\n"+
		"\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\7\u00c5\u08bc\n"+
		"\u00c5\f\u00c5\16\u00c5\u08bf\13\u00c5\5\u00c5\u08c1\n\u00c5\3\u00c6\3"+
		"\u00c6\3\u00c6\3\u00c7\3\u00c7\3\u00c7\5\u00c7\u08c9\n\u00c7\3\u00c8\3"+
		"\u00c8\3\u00c8\5\u00c8\u08ce\n\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c9\3"+
		"\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\5\u00c9\u08db\n"+
		"\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00c9\7\u00c9\u08e1\n\u00c9\f\u00c9\16"+
		"\u00c9\u08e4\13\u00c9\5\u00c9\u08e6\n\u00c9\3\u00c9\3\u00c9\3\u00c9\7"+
		"\u00c9\u08eb\n\u00c9\f\u00c9\16\u00c9\u08ee\13\u00c9\3\u00ca\3\u00ca\3"+
		"\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca"+
		"\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\6\u00ca\u0900\n\u00ca\r\u00ca"+
		"\16\u00ca\u0901\3\u00ca\3\u00ca\3\u00ca\3\u00ca\6\u00ca\u0908\n\u00ca"+
		"\r\u00ca\16\u00ca\u0909\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca"+
		"\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca"+
		"\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca"+
		"\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca"+
		"\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\5\u00ca\u0934"+
		"\n\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca"+
		"\5\u00ca\u093e\n\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca"+
		"\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\5\u00ca"+
		"\u094e\n\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\5\u00ca\u0954\n\u00ca\3"+
		"\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca"+
		"\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca"+
		"\3\u00ca\3\u00ca\3\u00ca\3\u00ca\5\u00ca\u096c\n\u00ca\3\u00ca\3\u00ca"+
		"\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca"+
		"\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00ca\5\u00ca\u097e\n\u00ca\7\u00ca"+
		"\u0980\n\u00ca\f\u00ca\16\u00ca\u0983\13\u00ca\3\u00cb\3\u00cb\3\u00cb"+
		"\3\u00cb\3\u00cb\5\u00cb\u098a\n\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb"+
		"\3\u00cb\3\u00cb\7\u00cb\u0992\n\u00cb\f\u00cb\16\u00cb\u0995\13\u00cb"+
		"\3\u00cc\3\u00cc\3\u00cc\3\u00cc\7\u00cc\u099b\n\u00cc\f\u00cc\16\u00cc"+
		"\u099e\13\u00cc\3\u00cc\3\u00cc\3\u00cd\3\u00cd\3\u00cd\3\u00cd\7\u00cd"+
		"\u09a6\n\u00cd\f\u00cd\16\u00cd\u09a9\13\u00cd\3\u00cd\3\u00cd\3\u00ce"+
		"\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce"+
		"\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\5\u00ce\u09be"+
		"\n\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\5\u00ce\u09c4\n\u00ce\3\u00ce"+
		"\3\u00ce\3\u00ce\3\u00ce\3\u00ce\5\u00ce\u09cb\n\u00ce\3\u00ce\3\u00ce"+
		"\3\u00ce\3\u00ce\5\u00ce\u09d1\n\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce"+
		"\3\u00ce\3\u00ce\5\u00ce\u09d9\n\u00ce\3\u00cf\3\u00cf\3\u00cf\3\u00cf"+
		"\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\5\u00cf\u09e4\n\u00cf\3\u00d0"+
		"\3\u00d0\3\u00d0\5\u00d0\u09e9\n\u00d0\3\u00d0\3\u00d0\3\u00d0\7\u00d0"+
		"\u09ee\n\u00d0\f\u00d0\16\u00d0\u09f1\13\u00d0\3\u00d0\5\u00d0\u09f4\n"+
		"\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\5\u00d0"+
		"\u09fd\n\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0"+
		"\3\u00d0\3\u00d0\3\u00d0\5\u00d0\u0a09\n\u00d0\3\u00d0\3\u00d0\3\u00d0"+
		"\3\u00d0\3\u00d0\7\u00d0\u0a10\n\u00d0\f\u00d0\16\u00d0\u0a13\13\u00d0"+
		"\5\u00d0\u0a15\n\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0"+
		"\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\3\u00d0\5\u00d0\u0a23\n\u00d0"+
		"\5\u00d0\u0a25\n\u00d0\3\u00d1\3\u00d1\3\u00d1\5\u00d1\u0a2a\n\u00d1\3"+
		"\u00d2\3\u00d2\3\u00d2\7\u00d2\u0a2f\n\u00d2\f\u00d2\16\u00d2\u0a32\13"+
		"\u00d2\3\u00d3\3\u00d3\3\u00d3\7\u00d3\u0a37\n\u00d3\f\u00d3\16\u00d3"+
		"\u0a3a\13\u00d3\3\u00d4\3\u00d4\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5"+
		"\5\u00d5\u0a43\n\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5\3\u00d5"+
		"\7\u00d5\u0a4b\n\u00d5\f\u00d5\16\u00d5\u0a4e\13\u00d5\5\u00d5\u0a50\n"+
		"\u00d5\3\u00d5\3\u00d5\5\u00d5\u0a54\n\u00d5\3\u00d5\3\u00d5\3\u00d5\5"+
		"\u00d5\u0a59\n\u00d5\3\u00d5\7\u00d5\u0a5c\n\u00d5\f\u00d5\16\u00d5\u0a5f"+
		"\13\u00d5\3\u00d6\3\u00d6\3\u00d6\7\u00d6\u0a64\n\u00d6\f\u00d6\16\u00d6"+
		"\u0a67\13\u00d6\3\u00d7\3\u00d7\3\u00d8\3\u00d8\5\u00d8\u0a6d\n\u00d8"+
		"\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9"+
		"\3\u00d9\3\u00d9\7\u00d9\u0a7a\n\u00d9\f\u00d9\16\u00d9\u0a7d\13\u00d9"+
		"\3\u00d9\3\u00d9\3\u00d9\5\u00d9\u0a82\n\u00d9\5\u00d9\u0a84\n\u00d9\3"+
		"\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00d9"+
		"\5\u00d9\u0a8f\n\u00d9\3\u00da\3\u00da\3\u00da\3\u00da\3\u00da\7\u00da"+
		"\u0a96\n\u00da\f\u00da\16\u00da\u0a99\13\u00da\5\u00da\u0a9b\n\u00da\3"+
		"\u00da\3\u00da\3\u00db\3\u00db\5\u00db\u0aa1\n\u00db\3\u00db\3\u00db\5"+
		"\u00db\u0aa5\n\u00db\3\u00db\5\u00db\u0aa8\n\u00db\3\u00db\3\u00db\3\u00db"+
		"\3\u00db\3\u00db\3\u00db\7\u00db\u0ab0\n\u00db\f\u00db\16\u00db\u0ab3"+
		"\13\u00db\3\u00db\3\u00db\3\u00db\3\u00db\3\u00db\3\u00db\5\u00db\u0abb"+
		"\n\u00db\5\u00db\u0abd\n\u00db\3\u00db\5\u00db\u0ac0\n\u00db\3\u00db\3"+
		"\u00db\3\u00db\3\u00db\5\u00db\u0ac6\n\u00db\3\u00db\3\u00db\3\u00db\3"+
		"\u00db\3\u00db\7\u00db\u0acd\n\u00db\f\u00db\16\u00db\u0ad0\13\u00db\3"+
		"\u00db\3\u00db\5\u00db\u0ad4\n\u00db\3\u00db\5\u00db\u0ad7\n\u00db\3\u00db"+
		"\3\u00db\3\u00db\5\u00db\u0adc\n\u00db\3\u00db\5\u00db\u0adf\n\u00db\3"+
		"\u00db\5\u00db\u0ae2\n\u00db\3\u00db\3\u00db\3\u00db\3\u00db\3\u00db\3"+
		"\u00db\7\u00db\u0aea\n\u00db\f\u00db\16\u00db\u0aed\13\u00db\3\u00db\3"+
		"\u00db\3\u00db\5\u00db\u0af2\n\u00db\3\u00db\3\u00db\3\u00db\3\u00db\3"+
		"\u00db\3\u00db\3\u00db\3\u00db\3\u00db\3\u00db\7\u00db\u0afe\n\u00db\f"+
		"\u00db\16\u00db\u0b01\13\u00db\3\u00db\3\u00db\5\u00db\u0b05\n\u00db\3"+
		"\u00db\3\u00db\5\u00db\u0b09\n\u00db\3\u00db\3\u00db\5\u00db\u0b0d\n\u00db"+
		"\3\u00db\3\u00db\3\u00db\3\u00db\7\u00db\u0b13\n\u00db\f\u00db\16\u00db"+
		"\u0b16\13\u00db\3\u00dc\5\u00dc\u0b19\n\u00dc\3\u00dc\3\u00dc\3\u00dc"+
		"\3\u00dc\7\u00dc\u0b1f\n\u00dc\f\u00dc\16\u00dc\u0b22\13\u00dc\5\u00dc"+
		"\u0b24\n\u00dc\3\u00dd\5\u00dd\u0b27\n\u00dd\3\u00dd\3\u00dd\3\u00dd\5"+
		"\u00dd\u0b2c\n\u00dd\3\u00dd\3\u00dd\3\u00dd\5\u00dd\u0b31\n\u00dd\3\u00dd"+
		"\3\u00dd\3\u00dd\5\u00dd\u0b36\n\u00dd\3\u00dd\3\u00dd\3\u00dd\5\u00dd"+
		"\u0b3b\n\u00dd\3\u00de\3\u00de\3\u00de\3\u00de\3\u00de\3\u00de\3\u00de"+
		"\7\u00de\u0b44\n\u00de\f\u00de\16\u00de\u0b47\13\u00de\3\u00de\3\u00de"+
		"\5\u00de\u0b4b\n\u00de\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df"+
		"\3\u00df\3\u00df\3\u00df\5\u00df\u0b56\n\u00df\3\u00df\3\u00df\3\u00df"+
		"\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df"+
		"\3\u00df\5\u00df\u0b65\n\u00df\3\u00df\3\u00df\3\u00df\3\u00df\3\u00df"+
		"\3\u00df\7\u00df\u0b6d\n\u00df\f\u00df\16\u00df\u0b70\13\u00df\3\u00e0"+
		"\3\u00e0\3\u00e1\3\u00e1\3\u00e1\5\u00e1\u0b77\n\u00e1\3\u00e1\3\u00e1"+
		"\3\u00e1\7\u00e1\u0b7c\n\u00e1\f\u00e1\16\u00e1\u0b7f\13\u00e1\3\u00e2"+
		"\3\u00e2\3\u00e3\3\u00e3\3\u00e4\3\u00e4\3\u00e5\3\u00e5\3\u00e6\3\u00e6"+
		"\3\u00e7\3\u00e7\3\u00e8\3\u00e8\3\u00e9\3\u00e9\3\u00e9\2\b\u0192\u0194"+
		"\u01a8\u01b4\u01bc\u01c0\u00ea\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a"+
		"\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2"+
		"\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca"+
		"\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2"+
		"\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa"+
		"\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112"+
		"\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128\u012a"+
		"\u012c\u012e\u0130\u0132\u0134\u0136\u0138\u013a\u013c\u013e\u0140\u0142"+
		"\u0144\u0146\u0148\u014a\u014c\u014e\u0150\u0152\u0154\u0156\u0158\u015a"+
		"\u015c\u015e\u0160\u0162\u0164\u0166\u0168\u016a\u016c\u016e\u0170\u0172"+
		"\u0174\u0176\u0178\u017a\u017c\u017e\u0180\u0182\u0184\u0186\u0188\u018a"+
		"\u018c\u018e\u0190\u0192\u0194\u0196\u0198\u019a\u019c\u019e\u01a0\u01a2"+
		"\u01a4\u01a6\u01a8\u01aa\u01ac\u01ae\u01b0\u01b2\u01b4\u01b6\u01b8\u01ba"+
		"\u01bc\u01be\u01c0\u01c2\u01c4\u01c6\u01c8\u01ca\u01cc\u01ce\u01d0\2\37"+
		"\4\2\u00fc\u00fc\u025d\u025d\3\2\u028f\u0291\4\2\u00bd\u00bd\u0245\u0245"+
		"\4\2\u0161\u0161\u02ce\u02ce\7\2\22\22\u00a0\u00a0\u0109\u0109\u01e4\u01e4"+
		"\u024d\u024d\6\2\u00a0\u00a0\u0109\u0109\u01e4\u01e4\u024d\u024d\4\2\24"+
		"\24\u010c\u010c\4\2\u021e\u021e\u0220\u0220\4\2\u0081\u0081\u01cd\u01cd"+
		"\4\2\u01a6\u01a6\u01d3\u01d3\5\2\u00c3\u00c3\u010f\u010f\u0246\u0246\4"+
		"\2\22\22\u00b1\u00b1\4\2\u00d4\u00d4\u0120\u0120\4\2\22\22\u02cb\u02cb"+
		"\3\2\u01d2\u01d3\4\2\u00d4\u00d4\u0155\u0155\3\2\u02c1\u02c1\6\2\u02d6"+
		"\u02d6\u02d8\u02d8\u02f1\u02f1\u02f7\u02f7\4\2\u02fb\u02fb\u02fe\u02fe"+
		"\4\2\22\22\u015c\u015c\4\2\u02da\u02da\u02f5\u02f6\5\2\u02c3\u02c3\u02f2"+
		"\u02f2\u02fd\u02fd\4\2\u02f1\u02f1\u02f7\u02f7\16\2\31\31\u015c\u015c"+
		"\u0176\u0176\u02d1\u02d5\u02dc\u02dc\u02df\u02e7\u02ea\u02eb\u02ed\u02f0"+
		"\u02f3\u02f4\u02f8\u02fa\u02fc\u02fc\u02fe\u0305\7\2\u02d9\u02d9\u02db"+
		"\u02db\u02dd\u02de\u02e8\u02e9\u02ec\u02ec\4\2\u0115\u0115\u015f\u015f"+
		"\4\2##\u0269\u0269\3\2\u029e\u02a3]\2\3\3\6\20\23\26\33\33\37!#&(.\60"+
		"\60\62\64\66>ANQX[^`egkm{\u0080\u0083\u0085\u0086\u008a\u008a\u008c\u0098"+
		"\u009a\u009a\u009c\u00a6\u00a8\u00a9\u00ac\u00b0\u00b3\u00ba\u00bc\u00be"+
		"\u00c0\u00c2\u00c4\u00c9\u00cb\u00cf\u00d2\u00d7\u00d9\u00d9\u00db\u00de"+
		"\u00e2\u00ea\u00ec\u00ec\u00ee\u00ef\u00f1\u00f2\u00f4\u00f6\u00f8\u00fb"+
		"\u00fd\u0100\u0102\u0102\u0106\u010e\u0110\u0111\u0113\u0113\u0116\u0116"+
		"\u011a\u011c\u011e\u0120\u0123\u0124\u0126\u0126\u0129\u012c\u012f\u0145"+
		"\u0147\u014f\u0151\u0156\u0159\u015b\u015d\u015e\u0160\u0160\u0162\u016b"+
		"\u016d\u016e\u0171\u0171\u0173\u0175\u0178\u017b\u017d\u017e\u0180\u0184"+
		"\u0186\u0193\u0195\u0196\u0198\u019a\u019d\u019e\u01a0\u01ad\u01af\u01b3"+
		"\u01b5\u01e3\u01e5\u01ea\u01ec\u01f0\u01f2\u01f3\u01f5\u01f5\u01f7\u0211"+
		"\u0213\u0215\u0217\u0219\u021c\u0220\u0224\u0225\u0227\u0227\u0229\u022a"+
		"\u022d\u022d\u022f\u023c\u023e\u0245\u0248\u024f\u0251\u0254\u0256\u025b"+
		"\u025e\u0260\u0262\u0263\u0265\u0265\u0267\u0267\u026a\u026f\2\u0d12\2"+
		"\u0209\3\2\2\2\4\u020d\3\2\2\2\6\u0237\3\2\2\2\b\u0239\3\2\2\2\n\u023b"+
		"\3\2\2\2\f\u023d\3\2\2\2\16\u023f\3\2\2\2\20\u0241\3\2\2\2\22\u0243\3"+
		"\2\2\2\24\u0245\3\2\2\2\26\u0247\3\2\2\2\30\u0249\3\2\2\2\32\u024b\3\2"+
		"\2\2\34\u024d\3\2\2\2\36\u024f\3\2\2\2 \u0251\3\2\2\2\"\u0253\3\2\2\2"+
		"$\u0255\3\2\2\2&\u0257\3\2\2\2(\u0259\3\2\2\2*\u025b\3\2\2\2,\u025d\3"+
		"\2\2\2.\u025f\3\2\2\2\60\u0261\3\2\2\2\62\u0263\3\2\2\2\64\u0265\3\2\2"+
		"\2\66\u0267\3\2\2\28\u0269\3\2\2\2:\u026b\3\2\2\2<\u026d\3\2\2\2>\u026f"+
		"\3\2\2\2@\u0271\3\2\2\2B\u0273\3\2\2\2D\u0275\3\2\2\2F\u0277\3\2\2\2H"+
		"\u0279\3\2\2\2J\u027b\3\2\2\2L\u027d\3\2\2\2N\u027f\3\2\2\2P\u0281\3\2"+
		"\2\2R\u0283\3\2\2\2T\u0285\3\2\2\2V\u0287\3\2\2\2X\u0289\3\2\2\2Z\u028b"+
		"\3\2\2\2\\\u028d\3\2\2\2^\u028f\3\2\2\2`\u0291\3\2\2\2b\u0293\3\2\2\2"+
		"d\u0295\3\2\2\2f\u02be\3\2\2\2h\u02c0\3\2\2\2j\u03e3\3\2\2\2l\u03e5\3"+
		"\2\2\2n\u0413\3\2\2\2p\u0415\3\2\2\2r\u0434\3\2\2\2t\u0436\3\2\2\2v\u0479"+
		"\3\2\2\2x\u047d\3\2\2\2z\u0489\3\2\2\2|\u049a\3\2\2\2~\u04ad\3\2\2\2\u0080"+
		"\u04bd\3\2\2\2\u0082\u04c6\3\2\2\2\u0084\u04e1\3\2\2\2\u0086\u0506\3\2"+
		"\2\2\u0088\u050e\3\2\2\2\u008a\u053c\3\2\2\2\u008c\u057b\3\2\2\2\u008e"+
		"\u057d\3\2\2\2\u0090\u059c\3\2\2\2\u0092\u05ef\3\2\2\2\u0094\u05f1\3\2"+
		"\2\2\u0096\u060a\3\2\2\2\u0098\u0611\3\2\2\2\u009a\u0632\3\2\2\2\u009c"+
		"\u0669\3\2\2\2\u009e\u066b\3\2\2\2\u00a0\u0686\3\2\2\2\u00a2\u06aa\3\2"+
		"\2\2\u00a4\u06ac\3\2\2\2\u00a6\u06e6\3\2\2\2\u00a8\u06e8\3\2\2\2\u00aa"+
		"\u06ea\3\2\2\2\u00ac\u06ec\3\2\2\2\u00ae\u06ee\3\2\2\2\u00b0\u06f0\3\2"+
		"\2\2\u00b2\u06f2\3\2\2\2\u00b4\u06f4\3\2\2\2\u00b6\u06f6\3\2\2\2\u00b8"+
		"\u06f8\3\2\2\2\u00ba\u06fa\3\2\2\2\u00bc\u06fc\3\2\2\2\u00be\u06fe\3\2"+
		"\2\2\u00c0\u0700\3\2\2\2\u00c2\u0702\3\2\2\2\u00c4\u0704\3\2\2\2\u00c6"+
		"\u0706\3\2\2\2\u00c8\u0708\3\2\2\2\u00ca\u070a\3\2\2\2\u00cc\u070c\3\2"+
		"\2\2\u00ce\u0737\3\2\2\2\u00d0\u0739\3\2\2\2\u00d2\u073b\3\2\2\2\u00d4"+
		"\u073d\3\2\2\2\u00d6\u073f\3\2\2\2\u00d8\u0741\3\2\2\2\u00da\u0743\3\2"+
		"\2\2\u00dc\u0745\3\2\2\2\u00de\u0747\3\2\2\2\u00e0\u0749\3\2\2\2\u00e2"+
		"\u074b\3\2\2\2\u00e4\u074d\3\2\2\2\u00e6\u074f\3\2\2\2\u00e8\u0751\3\2"+
		"\2\2\u00ea\u0753\3\2\2\2\u00ec\u0755\3\2\2\2\u00ee\u0757\3\2\2\2\u00f0"+
		"\u0759\3\2\2\2\u00f2\u075b\3\2\2\2\u00f4\u075d\3\2\2\2\u00f6\u075f\3\2"+
		"\2\2\u00f8\u0761\3\2\2\2\u00fa\u0763\3\2\2\2\u00fc\u0765\3\2\2\2\u00fe"+
		"\u0767\3\2\2\2\u0100\u0769\3\2\2\2\u0102\u076b\3\2\2\2\u0104\u076d\3\2"+
		"\2\2\u0106\u076f\3\2\2\2\u0108\u0771\3\2\2\2\u010a\u0773\3\2\2\2\u010c"+
		"\u0775\3\2\2\2\u010e\u0777\3\2\2\2\u0110\u0779\3\2\2\2\u0112\u077b\3\2"+
		"\2\2\u0114\u077d\3\2\2\2\u0116\u077f\3\2\2\2\u0118\u0781\3\2\2\2\u011a"+
		"\u0783\3\2\2\2\u011c\u0785\3\2\2\2\u011e\u0787\3\2\2\2\u0120\u0789\3\2"+
		"\2\2\u0122\u078b\3\2\2\2\u0124\u078d\3\2\2\2\u0126\u078f\3\2\2\2\u0128"+
		"\u0791\3\2\2\2\u012a\u0793\3\2\2\2\u012c\u0795\3\2\2\2\u012e\u0797\3\2"+
		"\2\2\u0130\u0799\3\2\2\2\u0132\u079b\3\2\2\2\u0134\u079d\3\2\2\2\u0136"+
		"\u079f\3\2\2\2\u0138\u07a1\3\2\2\2\u013a\u07a3\3\2\2\2\u013c\u07a5\3\2"+
		"\2\2\u013e\u07a7\3\2\2\2\u0140\u07a9\3\2\2\2\u0142\u07ab\3\2\2\2\u0144"+
		"\u07ad\3\2\2\2\u0146\u07af\3\2\2\2\u0148\u07b1\3\2\2\2\u014a\u07b3\3\2"+
		"\2\2\u014c\u07b5\3\2\2\2\u014e\u07b7\3\2\2\2\u0150\u07b9\3\2\2\2\u0152"+
		"\u07bb\3\2\2\2\u0154\u07de\3\2\2\2\u0156\u07e0\3\2\2\2\u0158\u07e2\3\2"+
		"\2\2\u015a\u07e4\3\2\2\2\u015c\u07e6\3\2\2\2\u015e\u07e8\3\2\2\2\u0160"+
		"\u07ea\3\2\2\2\u0162\u07ec\3\2\2\2\u0164\u07ee\3\2\2\2\u0166\u07f0\3\2"+
		"\2\2\u0168\u0803\3\2\2\2\u016a\u080b\3\2\2\2\u016c\u0827\3\2\2\2\u016e"+
		"\u0830\3\2\2\2\u0170\u0833\3\2\2\2\u0172\u0856\3\2\2\2\u0174\u0858\3\2"+
		"\2\2\u0176\u0863\3\2\2\2\u0178\u0876\3\2\2\2\u017a\u0878\3\2\2\2\u017c"+
		"\u087a\3\2\2\2\u017e\u0884\3\2\2\2\u0180\u0892\3\2\2\2\u0182\u0894\3\2"+
		"\2\2\u0184\u089b\3\2\2\2\u0186\u08a1\3\2\2\2\u0188\u08ad\3\2\2\2\u018a"+
		"\u08c2\3\2\2\2\u018c\u08c5\3\2\2\2\u018e\u08ca\3\2\2\2\u0190\u08d2\3\2"+
		"\2\2\u0192\u093d\3\2\2\2\u0194\u0989\3\2\2\2\u0196\u0996\3\2\2\2\u0198"+
		"\u09a1\3\2\2\2\u019a\u09d8\3\2\2\2\u019c\u09e3\3\2\2\2\u019e\u0a24\3\2"+
		"\2\2\u01a0\u0a29\3\2\2\2\u01a2\u0a2b\3\2\2\2\u01a4\u0a33\3\2\2\2\u01a6"+
		"\u0a3b\3\2\2\2\u01a8\u0a53\3\2\2\2\u01aa\u0a60\3\2\2\2\u01ac\u0a68\3\2"+
		"\2\2\u01ae\u0a6c\3\2\2\2\u01b0\u0a8e\3\2\2\2\u01b2\u0a90\3\2\2\2\u01b4"+
		"\u0b08\3\2\2\2\u01b6\u0b18\3\2\2\2\u01b8\u0b3a\3\2\2\2\u01ba\u0b4a\3\2"+
		"\2\2\u01bc\u0b64\3\2\2\2\u01be\u0b71\3\2\2\2\u01c0\u0b76\3\2\2\2\u01c2"+
		"\u0b80\3\2\2\2\u01c4\u0b82\3\2\2\2\u01c6\u0b84\3\2\2\2\u01c8\u0b86\3\2"+
		"\2\2\u01ca\u0b88\3\2\2\2\u01cc\u0b8a\3\2\2\2\u01ce\u0b8c\3\2\2\2\u01d0"+
		"\u0b8e\3\2\2\2\u01d2\u020a\5\4\3\2\u01d3\u020a\5\6\4\2\u01d4\u020a\5X"+
		"-\2\u01d5\u020a\5f\64\2\u01d6\u020a\5Z.\2\u01d7\u020a\5\\/\2\u01d8\u020a"+
		"\5^\60\2\u01d9\u020a\5`\61\2\u01da\u020a\5b\62\2\u01db\u020a\5d\63\2\u01dc"+
		"\u020a\5\u00c6d\2\u01dd\u020a\5\u00c8e\2\u01de\u020a\5\u00caf\2\u01df"+
		"\u020a\5\u00ccg\2\u01e0\u020a\5\u00ceh\2\u01e1\u020a\5\u0122\u0092\2\u01e2"+
		"\u020a\5\u0124\u0093\2\u01e3\u020a\5\u0126\u0094\2\u01e4\u020a\5\u0128"+
		"\u0095\2\u01e5\u020a\5\u012a\u0096\2\u01e6\u020a\5\u012c\u0097\2\u01e7"+
		"\u020a\5\u012e\u0098\2\u01e8\u020a\5\u0130\u0099\2\u01e9\u020a\5\u0132"+
		"\u009a\2\u01ea\u020a\5\u0134\u009b\2\u01eb\u020a\5\u0136\u009c\2\u01ec"+
		"\u020a\5\u0138\u009d\2\u01ed\u020a\5\u013a\u009e\2\u01ee\u020a\5\u013c"+
		"\u009f\2\u01ef\u020a\5\u013e\u00a0\2\u01f0\u020a\5\u0140\u00a1\2\u01f1"+
		"\u020a\5\u0142\u00a2\2\u01f2\u020a\5\u0144\u00a3\2\u01f3\u020a\5\u0146"+
		"\u00a4\2\u01f4\u020a\5\u0148\u00a5\2\u01f5\u020a\5\u014a\u00a6\2\u01f6"+
		"\u020a\5\u014c\u00a7\2\u01f7\u020a\5\u014e\u00a8\2\u01f8\u020a\5\u0150"+
		"\u00a9\2\u01f9\u020a\5\u0152\u00aa\2\u01fa\u01fb\7\u02c4\2\2\u01fb\u01fc"+
		"\5\u0152\u00aa\2\u01fc\u01fd\7\u02c5\2\2\u01fd\u020a\3\2\2\2\u01fe\u020a"+
		"\5\u0154\u00ab\2\u01ff\u020a\5\u0156\u00ac\2\u0200\u020a\5\u0158\u00ad"+
		"\2\u0201\u020a\5\u015a\u00ae\2\u0202\u020a\5\u015c\u00af\2\u0203\u020a"+
		"\5\u015e\u00b0\2\u0204\u020a\5\u0160\u00b1\2\u0205\u020a\5\u0162\u00b2"+
		"\2\u0206\u020a\5\u0164\u00b3\2\u0207\u020a\5\u0166\u00b4\2\u0208\u020a"+
		"\5\u0168\u00b5\2\u0209\u01d2\3\2\2\2\u0209\u01d3\3\2\2\2\u0209\u01d4\3"+
		"\2\2\2\u0209\u01d5\3\2\2\2\u0209\u01d6\3\2\2\2\u0209\u01d7\3\2\2\2\u0209"+
		"\u01d8\3\2\2\2\u0209\u01d9\3\2\2\2\u0209\u01da\3\2\2\2\u0209\u01db\3\2"+
		"\2\2\u0209\u01dc\3\2\2\2\u0209\u01dd\3\2\2\2\u0209\u01de\3\2\2\2\u0209"+
		"\u01df\3\2\2\2\u0209\u01e0\3\2\2\2\u0209\u01e1\3\2\2\2\u0209\u01e2\3\2"+
		"\2\2\u0209\u01e3\3\2\2\2\u0209\u01e4\3\2\2\2\u0209\u01e5\3\2\2\2\u0209"+
		"\u01e6\3\2\2\2\u0209\u01e7\3\2\2\2\u0209\u01e8\3\2\2\2\u0209\u01e9\3\2"+
		"\2\2\u0209\u01ea\3\2\2\2\u0209\u01eb\3\2\2\2\u0209\u01ec\3\2\2\2\u0209"+
		"\u01ed\3\2\2\2\u0209\u01ee\3\2\2\2\u0209\u01ef\3\2\2\2\u0209\u01f0\3\2"+
		"\2\2\u0209\u01f1\3\2\2\2\u0209\u01f2\3\2\2\2\u0209\u01f3\3\2\2\2\u0209"+
		"\u01f4\3\2\2\2\u0209\u01f5\3\2\2\2\u0209\u01f6\3\2\2\2\u0209\u01f7\3\2"+
		"\2\2\u0209\u01f8\3\2\2\2\u0209\u01f9\3\2\2\2\u0209\u01fa\3\2\2\2\u0209"+
		"\u01fe\3\2\2\2\u0209\u01ff\3\2\2\2\u0209\u0200\3\2\2\2\u0209\u0201\3\2"+
		"\2\2\u0209\u0202\3\2\2\2\u0209\u0203\3\2\2\2\u0209\u0204\3\2\2\2\u0209"+
		"\u0205\3\2\2\2\u0209\u0206\3\2\2\2\u0209\u0207\3\2\2\2\u0209\u0208\3\2"+
		"\2\2\u020a\u020b\3\2\2\2\u020b\u020c\7\2\2\3\u020c\3\3\2\2\2\u020d\u020e"+
		"\5\u01c0\u00e1\2\u020e\5\3\2\2\2\u020f\u0238\5\b\5\2\u0210\u0238\5\n\6"+
		"\2\u0211\u0238\5\f\7\2\u0212\u0238\5\16\b\2\u0213\u0238\5\20\t\2\u0214"+
		"\u0238\5\22\n\2\u0215\u0238\5\24\13\2\u0216\u0238\5\26\f\2\u0217\u0238"+
		"\5\30\r\2\u0218\u0238\5\32\16\2\u0219\u0238\5\34\17\2\u021a\u0238\5\36"+
		"\20\2\u021b\u0238\5 \21\2\u021c\u0238\5\"\22\2\u021d\u0238\5$\23\2\u021e"+
		"\u0238\5&\24\2\u021f\u0238\5(\25\2\u0220\u0238\5*\26\2\u0221\u0238\5,"+
		"\27\2\u0222\u0238\5.\30\2\u0223\u0238\5\60\31\2\u0224\u0238\5\62\32\2"+
		"\u0225\u0238\5\64\33\2\u0226\u0238\5\66\34\2\u0227\u0238\58\35\2\u0228"+
		"\u0238\5:\36\2\u0229\u0238\5<\37\2\u022a\u0238\5> \2\u022b\u0238\5@!\2"+
		"\u022c\u0238\5B\"\2\u022d\u0238\5D#\2\u022e\u0238\5F$\2\u022f\u0238\5"+
		"H%\2\u0230\u0238\5J&\2\u0231\u0238\5L\'\2\u0232\u0238\5N(\2\u0233\u0238"+
		"\5P)\2\u0234\u0238\5R*\2\u0235\u0238\5T+\2\u0236\u0238\5V,\2\u0237\u020f"+
		"\3\2\2\2\u0237\u0210\3\2\2\2\u0237\u0211\3\2\2\2\u0237\u0212\3\2\2\2\u0237"+
		"\u0213\3\2\2\2\u0237\u0214\3\2\2\2\u0237\u0215\3\2\2\2\u0237\u0216\3\2"+
		"\2\2\u0237\u0217\3\2\2\2\u0237\u0218\3\2\2\2\u0237\u0219\3\2\2\2\u0237"+
		"\u021a\3\2\2\2\u0237\u021b\3\2\2\2\u0237\u021c\3\2\2\2\u0237\u021d\3\2"+
		"\2\2\u0237\u021e\3\2\2\2\u0237\u021f\3\2\2\2\u0237\u0220\3\2\2\2\u0237"+
		"\u0221\3\2\2\2\u0237\u0222\3\2\2\2\u0237\u0223\3\2\2\2\u0237\u0224\3\2"+
		"\2\2\u0237\u0225\3\2\2\2\u0237\u0226\3\2\2\2\u0237\u0227\3\2\2\2\u0237"+
		"\u0228\3\2\2\2\u0237\u0229\3\2\2\2\u0237\u022a\3\2\2\2\u0237\u022b\3\2"+
		"\2\2\u0237\u022c\3\2\2\2\u0237\u022d\3\2\2\2\u0237\u022e\3\2\2\2\u0237"+
		"\u022f\3\2\2\2\u0237\u0230\3\2\2\2\u0237\u0231\3\2\2\2\u0237\u0232\3\2"+
		"\2\2\u0237\u0233\3\2\2\2\u0237\u0234\3\2\2\2\u0237\u0235\3\2\2\2\u0237"+
		"\u0236\3\2\2\2\u0238\7\3\2\2\2\u0239\u023a\5\u01c4\u00e3\2\u023a\t\3\2"+
		"\2\2\u023b\u023c\5\u01c4\u00e3\2\u023c\13\3\2\2\2\u023d\u023e\5\u01c4"+
		"\u00e3\2\u023e\r\3\2\2\2\u023f\u0240\5\u01c4\u00e3\2\u0240\17\3\2\2\2"+
		"\u0241\u0242\5\u01c4\u00e3\2\u0242\21\3\2\2\2\u0243\u0244\5\u01c4\u00e3"+
		"\2\u0244\23\3\2\2\2\u0245\u0246\5\u01c4\u00e3\2\u0246\25\3\2\2\2\u0247"+
		"\u0248\5\u01c4\u00e3\2\u0248\27\3\2\2\2\u0249\u024a\5\u01c4\u00e3\2\u024a"+
		"\31\3\2\2\2\u024b\u024c\5\u01c4\u00e3\2\u024c\33\3\2\2\2\u024d\u024e\5"+
		"\u01c4\u00e3\2\u024e\35\3\2\2\2\u024f\u0250\5\u01c4\u00e3\2\u0250\37\3"+
		"\2\2\2\u0251\u0252\5\u01c4\u00e3\2\u0252!\3\2\2\2\u0253\u0254\5\u01c4"+
		"\u00e3\2\u0254#\3\2\2\2\u0255\u0256\5\u01c4\u00e3\2\u0256%\3\2\2\2\u0257"+
		"\u0258\5\u01c4\u00e3\2\u0258\'\3\2\2\2\u0259\u025a\5\u01c4\u00e3\2\u025a"+
		")\3\2\2\2\u025b\u025c\5\u01c4\u00e3\2\u025c+\3\2\2\2\u025d\u025e\5\u01c4"+
		"\u00e3\2\u025e-\3\2\2\2\u025f\u0260\5\u01c4\u00e3\2\u0260/\3\2\2\2\u0261"+
		"\u0262\5\u01c4\u00e3\2\u0262\61\3\2\2\2\u0263\u0264\5\u01c4\u00e3\2\u0264"+
		"\63\3\2\2\2\u0265\u0266\5\u01c4\u00e3\2\u0266\65\3\2\2\2\u0267\u0268\5"+
		"\u01c4\u00e3\2\u0268\67\3\2\2\2\u0269\u026a\5\u01c4\u00e3\2\u026a9\3\2"+
		"\2\2\u026b\u026c\5\u01c4\u00e3\2\u026c;\3\2\2\2\u026d\u026e\5\u01c4\u00e3"+
		"\2\u026e=\3\2\2\2\u026f\u0270\5\u01c4\u00e3\2\u0270?\3\2\2\2\u0271\u0272"+
		"\5\u01c4\u00e3\2\u0272A\3\2\2\2\u0273\u0274\5\u01c4\u00e3\2\u0274C\3\2"+
		"\2\2\u0275\u0276\5\u01c4\u00e3\2\u0276E\3\2\2\2\u0277\u0278\5\u01c4\u00e3"+
		"\2\u0278G\3\2\2\2\u0279\u027a\5\u01c4\u00e3\2\u027aI\3\2\2\2\u027b\u027c"+
		"\5\u01c4\u00e3\2\u027cK\3\2\2\2\u027d\u027e\5\u01c4\u00e3\2\u027eM\3\2"+
		"\2\2\u027f\u0280\5\u01c4\u00e3\2\u0280O\3\2\2\2\u0281\u0282\5\u01c4\u00e3"+
		"\2\u0282Q\3\2\2\2\u0283\u0284\5\u01c4\u00e3\2\u0284S\3\2\2\2\u0285\u0286"+
		"\5\u01c4\u00e3\2\u0286U\3\2\2\2\u0287\u0288\5\u01c4\u00e3\2\u0288W\3\2"+
		"\2\2\u0289\u028a\5\u01c4\u00e3\2\u028aY\3\2\2\2\u028b\u028c\5\u01c4\u00e3"+
		"\2\u028c[\3\2\2\2\u028d\u028e\5\u01c4\u00e3\2\u028e]\3\2\2\2\u028f\u0290"+
		"\5\u01c4\u00e3\2\u0290_\3\2\2\2\u0291\u0292\5\u01c4\u00e3\2\u0292a\3\2"+
		"\2\2\u0293\u0294\5\u01c4\u00e3\2\u0294c\3\2\2\2\u0295\u0296\5\u01c4\u00e3"+
		"\2\u0296e\3\2\2\2\u0297\u02bf\5h\65\2\u0298\u02bf\5j\66\2\u0299\u02bf"+
		"\5l\67\2\u029a\u02bf\5r:\2\u029b\u02bf\5t;\2\u029c\u02bf\5v<\2\u029d\u02bf"+
		"\5z>\2\u029e\u02bf\5~@\2\u029f\u02bf\5\u0082B\2\u02a0\u02bf\5\u0084C\2"+
		"\u02a1\u02bf\5\u0086D\2\u02a2\u02bf\5\u0088E\2\u02a3\u02bf\5\u008aF\2"+
		"\u02a4\u02bf\5\u008cG\2\u02a5\u02bf\5\u008eH\2\u02a6\u02bf\5\u0090I\2"+
		"\u02a7\u02bf\5\u0094K\2\u02a8\u02bf\5\u0096L\2\u02a9\u02bf\5\u0098M\2"+
		"\u02aa\u02bf\5\u009aN\2\u02ab\u02bf\5\u009eP\2\u02ac\u02bf\5\u00a2R\2"+
		"\u02ad\u02bf\5\u00a4S\2\u02ae\u02bf\5\u00a6T\2\u02af\u02bf\5\u00a8U\2"+
		"\u02b0\u02bf\5\u00aaV\2\u02b1\u02bf\5\u00acW\2\u02b2\u02bf\5\u00aeX\2"+
		"\u02b3\u02bf\5\u00b0Y\2\u02b4\u02bf\5\u00b2Z\2\u02b5\u02bf\5\u00b4[\2"+
		"\u02b6\u02bf\5\u00b6\\\2\u02b7\u02bf\5\u00b8]\2\u02b8\u02bf\5\u00ba^\2"+
		"\u02b9\u02bf\5\u00bc_\2\u02ba\u02bf\5\u00be`\2\u02bb\u02bf\5\u00c0a\2"+
		"\u02bc\u02bf\5\u00c2b\2\u02bd\u02bf\5\u00c4c\2\u02be\u0297\3\2\2\2\u02be"+
		"\u0298\3\2\2\2\u02be\u0299\3\2\2\2\u02be\u029a\3\2\2\2\u02be\u029b\3\2"+
		"\2\2\u02be\u029c\3\2\2\2\u02be\u029d\3\2\2\2\u02be\u029e\3\2\2\2\u02be"+
		"\u029f\3\2\2\2\u02be\u02a0\3\2\2\2\u02be\u02a1\3\2\2\2\u02be\u02a2\3\2"+
		"\2\2\u02be\u02a3\3\2\2\2\u02be\u02a4\3\2\2\2\u02be\u02a5\3\2\2\2\u02be"+
		"\u02a6\3\2\2\2\u02be\u02a7\3\2\2\2\u02be\u02a8\3\2\2\2\u02be\u02a9\3\2"+
		"\2\2\u02be\u02aa\3\2\2\2\u02be\u02ab\3\2\2\2\u02be\u02ac\3\2\2\2\u02be"+
		"\u02ad\3\2\2\2\u02be\u02ae\3\2\2\2\u02be\u02af\3\2\2\2\u02be\u02b0\3\2"+
		"\2\2\u02be\u02b1\3\2\2\2\u02be\u02b2\3\2\2\2\u02be\u02b3\3\2\2\2\u02be"+
		"\u02b4\3\2\2\2\u02be\u02b5\3\2\2\2\u02be\u02b6\3\2\2\2\u02be\u02b7\3\2"+
		"\2\2\u02be\u02b8\3\2\2\2\u02be\u02b9\3\2\2\2\u02be\u02ba\3\2\2\2\u02be"+
		"\u02bb\3\2\2\2\u02be\u02bc\3\2\2\2\u02be\u02bd\3\2\2\2\u02bfg\3\2\2\2"+
		"\u02c0\u02c1\7|\2\2\u02c1\u02c2\7\n\2\2\u02c2\u02c3\7\u013f\2\2\u02c3"+
		"\u02c4\5\u01a0\u00d1\2\u02c4\u02c5\7\u0240\2\2\u02c5\u02c6\7\u00ff\2\2"+
		"\u02c6\u02c7\7\u00ef\2\2\u02c7\u02c8\5\u01a0\u00d1\2\u02c8i\3\2\2\2\u02c9"+
		"\u02ca\7|\2\2\u02ca\u02cb\7\20\2\2\u02cb\u02cc\5\u01a0\u00d1\2\u02cc\u02ce"+
		"\7\u02c4\2\2\u02cd\u02cf\t\2\2\2\u02ce\u02cd\3\2\2\2\u02ce\u02cf\3\2\2"+
		"\2\u02cf\u02d1\3\2\2\2\u02d0\u02d2\5\u01a0\u00d1\2\u02d1\u02d0\3\2\2\2"+
		"\u02d1\u02d2\3\2\2\2\u02d2\u02d3\3\2\2\2\u02d3\u02d4\5\u01aa\u00d6\2\u02d4"+
		"\u02d5\7\u02c5\2\2\u02d5\u02d6\7\u02c4\2\2\u02d6\u02d7\7\u027c\2\2\u02d7"+
		"\u02d8\7\u02db\2\2\u02d8\u02d9\5\u01c0\u00e1\2\u02d9\u02da\7\u02be\2\2"+
		"\u02da\u02db\7\u027d\2\2\u02db\u02dc\7\u02db\2\2\u02dc\u02e1\5\u01c0\u00e1"+
		"\2\u02dd\u02de\7\u02be\2\2\u02de\u02df\7\u027e\2\2\u02df\u02e0\7\u02db"+
		"\2\2\u02e0\u02e2\7\u02cb\2\2\u02e1\u02dd\3\2\2\2\u02e1\u02e2\3\2\2\2\u02e2"+
		"\u02e7\3\2\2\2\u02e3\u02e4\7\u02be\2\2\u02e4\u02e5\7\u027f\2\2\u02e5\u02e6"+
		"\7\u02db\2\2\u02e6\u02e8\5\u01c0\u00e1\2\u02e7\u02e3\3\2\2\2\u02e7\u02e8"+
		"\3\2\2\2\u02e8\u02eb\3\2\2\2\u02e9\u02ea\7\u02be\2\2\u02ea\u02ec\7\u0280"+
		"\2\2\u02eb\u02e9\3\2\2\2\u02eb\u02ec\3\2\2\2\u02ec\u02f1\3\2\2\2\u02ed"+
		"\u02ee\7\u02be\2\2\u02ee\u02ef\7\u0281\2\2\u02ef\u02f0\7\u02db\2\2\u02f0"+
		"\u02f2\5\u01c0\u00e1\2\u02f1\u02ed\3\2\2\2\u02f1\u02f2\3\2\2\2\u02f2\u02f7"+
		"\3\2\2\2\u02f3\u02f4\7\u02be\2\2\u02f4\u02f5\7\u0282\2\2\u02f5\u02f6\7"+
		"\u02db\2\2\u02f6\u02f8\5\u01c0\u00e1\2\u02f7\u02f3\3\2\2\2\u02f7\u02f8"+
		"\3\2\2\2\u02f8\u02fd\3\2\2\2\u02f9\u02fa\7\u02be\2\2\u02fa\u02fb\7\u0283"+
		"\2\2\u02fb\u02fc\7\u02db\2\2\u02fc\u02fe\5\u01c0\u00e1\2\u02fd\u02f9\3"+
		"\2\2\2\u02fd\u02fe\3\2\2\2\u02fe\u0303\3\2\2\2\u02ff\u0300\7\u02be\2\2"+
		"\u0300\u0301\7\u0284\2\2\u0301\u0302\7\u02db\2\2\u0302\u0304\5\u0192\u00ca"+
		"\2\u0303\u02ff\3\2\2\2\u0303\u0304\3\2\2\2\u0304\u0309\3\2\2\2\u0305\u0306"+
		"\7\u02be\2\2\u0306\u0307\7\u0285\2\2\u0307\u0308\7\u02db\2\2\u0308\u030a"+
		"\5\u01c0\u00e1\2\u0309\u0305\3\2\2\2\u0309\u030a\3\2\2\2\u030a\u030f\3"+
		"\2\2\2\u030b\u030c\7\u02be\2\2\u030c\u030d\7\u0286\2\2\u030d\u030e\7\u02db"+
		"\2\2\u030e\u0310\5\u01c0\u00e1\2\u030f\u030b\3\2\2\2\u030f\u0310\3\2\2"+
		"\2\u0310\u0315\3\2\2\2\u0311\u0312\7\u02be\2\2\u0312\u0313\7\u0287\2\2"+
		"\u0313\u0314\7\u02db\2\2\u0314\u0316\5\u01c0\u00e1\2\u0315\u0311\3\2\2"+
		"\2\u0315\u0316\3\2\2\2\u0316\u031b\3\2\2\2\u0317\u0318\7\u02be\2\2\u0318"+
		"\u0319\7\u0288\2\2\u0319\u031a\7\u02db\2\2\u031a\u031c\7\u02cb\2\2\u031b"+
		"\u0317\3\2\2\2\u031b\u031c\3\2\2\2\u031c\u0321\3\2\2\2\u031d\u031e\7\u02be"+
		"\2\2\u031e\u031f\7\u0289\2\2\u031f\u0320\7\u02db\2\2\u0320\u0322\5\u01c0"+
		"\u00e1\2\u0321\u031d\3\2\2\2\u0321\u0322\3\2\2\2\u0322\u0325\3\2\2\2\u0323"+
		"\u0324\7\u02be\2\2\u0324\u0326\7\u028a\2\2\u0325\u0323\3\2\2\2\u0325\u0326"+
		"\3\2\2\2\u0326\u032b\3\2\2\2\u0327\u0328\7\u02be\2\2\u0328\u0329\7\u028b"+
		"\2\2\u0329\u032a\7\u02db\2\2\u032a\u032c\5\u01c0\u00e1\2\u032b\u0327\3"+
		"\2\2\2\u032b\u032c\3\2\2\2\u032c\u0331\3\2\2\2\u032d\u032e\7\u02be\2\2"+
		"\u032e\u032f\7\u028c\2\2\u032f\u0330\7\u02db\2\2\u0330\u0332\5\u01c0\u00e1"+
		"\2\u0331\u032d\3\2\2\2\u0331\u0332\3\2\2\2\u0332\u0337\3\2\2\2\u0333\u0334"+
		"\7\u02be\2\2\u0334\u0335\7\u028d\2\2\u0335\u0336\7\u02db\2\2\u0336\u0338"+
		"\t\3\2\2\u0337\u0333\3\2\2\2\u0337\u0338\3\2\2\2\u0338\u0339\3\2\2\2\u0339"+
		"\u033a\7\u02c5\2\2\u033a\u03e4\3\2\2\2\u033b\u033c\7|\2\2\u033c\u033d"+
		"\7\20\2\2\u033d\u033e\5\u01a0\u00d1\2\u033e\u0346\7\u02c4\2\2\u033f\u0341"+
		"\t\2\2\2\u0340\u033f\3\2\2\2\u0340\u0341\3\2\2\2\u0341\u0343\3\2\2\2\u0342"+
		"\u0344\5\u01a0\u00d1\2\u0343\u0342\3\2\2\2\u0343\u0344\3\2\2\2\u0344\u0345"+
		"\3\2\2\2\u0345\u0347\5\u01aa\u00d6\2\u0346\u0340\3\2\2\2\u0346\u0347\3"+
		"\2\2\2\u0347\u0348\3\2\2\2\u0348\u0349\7\u0177\2\2\u0349\u034b\7\67\2"+
		"\2\u034a\u034c\t\2\2\2\u034b\u034a\3\2\2\2\u034b\u034c\3\2\2\2\u034c\u034e"+
		"\3\2\2\2\u034d\u034f\5\u01a0\u00d1\2\u034e\u034d\3\2\2\2\u034e\u034f\3"+
		"\2\2\2\u034f\u0350\3\2\2\2\u0350\u0351\5\u01aa\u00d6\2\u0351\u0352\7\u02c5"+
		"\2\2\u0352\u0353\7\u02c4\2\2\u0353\u0354\7\u027c\2\2\u0354\u0355\7\u02db"+
		"\2\2\u0355\u0356\5\u01c0\u00e1\2\u0356\u0357\7\u02be\2\2\u0357\u0358\7"+
		"\u027d\2\2\u0358\u0359\7\u02db\2\2\u0359\u035e\5\u01c0\u00e1\2\u035a\u035b"+
		"\7\u02be\2\2\u035b\u035c\7\u027e\2\2\u035c\u035d\7\u02db\2\2\u035d\u035f"+
		"\7\u02cb\2\2\u035e\u035a\3\2\2\2\u035e\u035f\3\2\2\2\u035f\u0364\3\2\2"+
		"\2\u0360\u0361\7\u02be\2\2\u0361\u0362\7\u027f\2\2\u0362\u0363\7\u02db"+
		"\2\2\u0363\u0365\5\u01c0\u00e1\2\u0364\u0360\3\2\2\2\u0364\u0365\3\2\2"+
		"\2\u0365\u0368\3\2\2\2\u0366\u0367\7\u02be\2\2\u0367\u0369\7\u0280\2\2"+
		"\u0368\u0366\3\2\2\2\u0368\u0369\3\2\2\2\u0369\u036e\3\2\2\2\u036a\u036b"+
		"\7\u02be\2\2\u036b\u036c\7\u0284\2\2\u036c\u036d\7\u02db\2\2\u036d\u036f"+
		"\5\u0192\u00ca\2\u036e\u036a\3\2\2\2\u036e\u036f\3\2\2\2\u036f\u0374\3"+
		"\2\2\2\u0370\u0371\7\u02be\2\2\u0371\u0372\7\u028d\2\2\u0372\u0373\7\u02db"+
		"\2\2\u0373\u0375\t\3\2\2\u0374\u0370\3\2\2\2\u0374\u0375\3\2\2\2\u0375"+
		"\u0378\3\2\2\2\u0376\u0377\7\u02be\2\2\u0377\u0379\7\u028e\2\2\u0378\u0376"+
		"\3\2\2\2\u0378\u0379\3\2\2\2\u0379\u037a\3\2\2\2\u037a\u037b\7\u02c5\2"+
		"\2\u037b\u03e4\3\2\2\2\u037c\u037d\7|\2\2\u037d\u037e\7\20\2\2\u037e\u037f"+
		"\5\u01a0\u00d1\2\u037f\u0380\7\u02c4\2\2\u0380\u0381\7\u0292\2\2\u0381"+
		"\u0382\7\u02db\2\2\u0382\u0383\5\u01a8\u00d5\2\u0383\u0384\7\u02be\2\2"+
		"\u0384\u0385\7\u027c\2\2\u0385\u0386\7\u02db\2\2\u0386\u0387\5\u01c0\u00e1"+
		"\2\u0387\u0388\7\u02be\2\2\u0388\u0389\7\u027d\2\2\u0389\u038a\7\u02db"+
		"\2\2\u038a\u038f\5\u01c0\u00e1\2\u038b\u038c\7\u02be\2\2\u038c\u038d\7"+
		"\u027e\2\2\u038d\u038e\7\u02db\2\2\u038e\u0390\7\u02cb\2\2\u038f\u038b"+
		"\3\2\2\2\u038f\u0390\3\2\2\2\u0390\u0395\3\2\2\2\u0391\u0392\7\u02be\2"+
		"\2\u0392\u0393\7\u027f\2\2\u0393\u0394\7\u02db\2\2\u0394\u0396\5\u01c0"+
		"\u00e1\2\u0395\u0391\3\2\2\2\u0395\u0396\3\2\2\2\u0396\u0399\3\2\2\2\u0397"+
		"\u0398\7\u02be\2\2\u0398\u039a\7\u0280\2\2\u0399\u0397\3\2\2\2\u0399\u039a"+
		"\3\2\2\2\u039a\u039f\3\2\2\2\u039b\u039c\7\u02be\2\2\u039c\u039d\7\u0281"+
		"\2\2\u039d\u039e\7\u02db\2\2\u039e\u03a0\5\u01c0\u00e1\2\u039f\u039b\3"+
		"\2\2\2\u039f\u03a0\3\2\2\2\u03a0\u03a5\3\2\2\2\u03a1\u03a2\7\u02be\2\2"+
		"\u03a2\u03a3\7\u0282\2\2\u03a3\u03a4\7\u02db\2\2\u03a4\u03a6\5\u01c0\u00e1"+
		"\2\u03a5\u03a1\3\2\2\2\u03a5\u03a6\3\2\2\2\u03a6\u03ab\3\2\2\2\u03a7\u03a8"+
		"\7\u02be\2\2\u03a8\u03a9\7\u0283\2\2\u03a9\u03aa\7\u02db\2\2\u03aa\u03ac"+
		"\5\u01c0\u00e1\2\u03ab\u03a7\3\2\2\2\u03ab\u03ac\3\2\2\2\u03ac\u03b1\3"+
		"\2\2\2\u03ad\u03ae\7\u02be\2\2\u03ae\u03af\7\u0284\2\2\u03af\u03b0\7\u02db"+
		"\2\2\u03b0\u03b2\5\u0192\u00ca\2\u03b1\u03ad\3\2\2\2\u03b1\u03b2\3\2\2"+
		"\2\u03b2\u03b7\3\2\2\2\u03b3\u03b4\7\u02be\2\2\u03b4\u03b5\7\u0285\2\2"+
		"\u03b5\u03b6\7\u02db\2\2\u03b6\u03b8\5\u01c0\u00e1\2\u03b7\u03b3\3\2\2"+
		"\2\u03b7\u03b8\3\2\2\2\u03b8\u03bd\3\2\2\2\u03b9\u03ba\7\u02be\2\2\u03ba"+
		"\u03bb\7\u0286\2\2\u03bb\u03bc\7\u02db\2\2\u03bc\u03be\5\u01c0\u00e1\2"+
		"\u03bd\u03b9\3\2\2\2\u03bd\u03be\3\2\2\2\u03be\u03c3\3\2\2\2\u03bf\u03c0"+
		"\7\u02be\2\2\u03c0\u03c1\7\u0287\2\2\u03c1\u03c2\7\u02db\2\2\u03c2\u03c4"+
		"\5\u01c0\u00e1\2\u03c3\u03bf\3\2\2\2\u03c3\u03c4\3\2\2\2\u03c4\u03c9\3"+
		"\2\2\2\u03c5\u03c6\7\u02be\2\2\u03c6\u03c7\7\u0288\2\2\u03c7\u03c8\7\u02db"+
		"\2\2\u03c8\u03ca\7\u02cb\2\2\u03c9\u03c5\3\2\2\2\u03c9\u03ca\3\2\2\2\u03ca"+
		"\u03cf\3\2\2\2\u03cb\u03cc\7\u02be\2\2\u03cc\u03cd\7\u0289\2\2\u03cd\u03ce"+
		"\7\u02db\2\2\u03ce\u03d0\5\u01c0\u00e1\2\u03cf\u03cb\3\2\2\2\u03cf\u03d0"+
		"\3\2\2\2\u03d0\u03d3\3\2\2\2\u03d1\u03d2\7\u02be\2\2\u03d2\u03d4\7\u028a"+
		"\2\2\u03d3\u03d1\3\2\2\2\u03d3\u03d4\3\2\2\2\u03d4\u03d9\3\2\2\2\u03d5"+
		"\u03d6\7\u02be\2\2\u03d6\u03d7\7\u028b\2\2\u03d7\u03d8\7\u02db\2\2\u03d8"+
		"\u03da\5\u01c0\u00e1\2\u03d9\u03d5\3\2\2\2\u03d9\u03da\3\2\2\2\u03da\u03df"+
		"\3\2\2\2\u03db\u03dc\7\u02be\2\2\u03dc\u03dd\7\u028c\2\2\u03dd\u03de\7"+
		"\u02db\2\2\u03de\u03e0\5\u01c0\u00e1\2\u03df\u03db\3\2\2\2\u03df\u03e0"+
		"\3\2\2\2\u03e0\u03e1\3\2\2\2\u03e1\u03e2\7\u02c5\2\2\u03e2\u03e4\3\2\2"+
		"\2\u03e3\u02c9\3\2\2\2\u03e3\u033b\3\2\2\2\u03e3\u037c\3\2\2\2\u03e4k"+
		"\3\2\2\2\u03e5\u03e6\7|\2\2\u03e6\u03e7\7@\2\2\u03e7\u03e8\7\u02c4\2\2"+
		"\u03e8\u03e9\5\u01a8\u00d5\2\u03e9\u03ea\7\35\2\2\u03ea\u03eb\5\u01a8"+
		"\u00d5\2\u03eb\u03f9\7\u02c5\2\2\u03ec\u03ed\7\u0269\2\2\u03ed\u03ee\7"+
		"\u00e2\2\2\u03ee\u03f3\5\u01c0\u00e1\2\u03ef\u03f0\7\u02c4\2\2\u03f0\u03f1"+
		"\5\u01aa\u00d6\2\u03f1\u03f2\7\u02c5\2\2\u03f2\u03f4\3\2\2\2\u03f3\u03ef"+
		"\3\2\2\2\u03f3\u03f4\3\2\2\2\u03f4\u03fa\3\2\2\2\u03f5\u03f6\7\u026b\2"+
		"\2\u03f6\u03fa\7\u00e2\2\2\u03f7\u03f8\7\u0269\2\2\u03f8\u03fa\7\u0106"+
		"\2\2\u03f9\u03ec\3\2\2\2\u03f9\u03f5\3\2\2\2\u03f9\u03f7\3\2\2\2\u03fa"+
		"\u03ff\3\2\2\2\u03fb\u03fc\7\35\2\2\u03fc\u0400\7!\2\2\u03fd\u03fe\7\35"+
		"\2\2\u03fe\u0400\7\u00fb\2\2\u03ff\u03fb\3\2\2\2\u03ff\u03fd\3\2\2\2\u03ff"+
		"\u0400\3\2\2\2\u0400m\3\2\2\2\u0401\u0402\7\u0294\2\2\u0402\u0403\7\u02db"+
		"\2\2\u0403\u0414\5\u0192\u00ca\2\u0404\u0405\7\u0295\2\2\u0405\u0406\7"+
		"\u02db\2\2\u0406\u0414\5\u0192\u00ca\2\u0407\u0408\7\u0296\2\2\u0408\u0409"+
		"\7\u02db\2\2\u0409\u0414\5\u0192\u00ca\2\u040a\u040b\7\u0297\2\2\u040b"+
		"\u040c\7\u02db\2\2\u040c\u0414\5\u0192\u00ca\2\u040d\u040e\7\u0298\2\2"+
		"\u040e\u040f\7\u02db\2\2\u040f\u0414\5\u0192\u00ca\2\u0410\u0411\7\u02cf"+
		"\2\2\u0411\u0412\7\u02db\2\2\u0412\u0414\5\u0192\u00ca\2\u0413\u0401\3"+
		"\2\2\2\u0413\u0404\3\2\2\2\u0413\u0407\3\2\2\2\u0413\u040a\3\2\2\2\u0413"+
		"\u040d\3\2\2\2\u0413\u0410\3\2\2\2\u0414o\3\2\2\2\u0415\u041a\5n8\2\u0416"+
		"\u0417\7\u02be\2\2\u0417\u0419\5n8\2\u0418\u0416\3\2\2\2\u0419\u041c\3"+
		"\2\2\2\u041a\u0418\3\2\2\2\u041a\u041b\3\2\2\2\u041bq\3\2\2\2\u041c\u041a"+
		"\3\2\2\2\u041d\u041e\7|\2\2\u041e\u0422\7Z\2\2\u041f\u0420\7\u0293\2\2"+
		"\u0420\u0421\7\u015c\2\2\u0421\u0423\7\u00cb\2\2\u0422\u041f\3\2\2\2\u0422"+
		"\u0423\3\2\2\2\u0423\u0424\3\2\2\2\u0424\u0425\5\u01a0\u00d1\2\u0425\u0426"+
		"\7\u02c4\2\2\u0426\u0427\5p9\2\u0427\u0428\7\u02c5\2\2\u0428\u0435\3\2"+
		"\2\2\u0429\u042a\7|\2\2\u042a\u042e\7Z\2\2\u042b\u042c\7\u0293\2\2\u042c"+
		"\u042d\7\u015c\2\2\u042d\u042f\7\u00cb\2\2\u042e\u042b\3\2\2\2\u042e\u042f"+
		"\3\2\2\2\u042f\u0430\3\2\2\2\u0430\u0431\5\u01a0\u00d1\2\u0431\u0432\7"+
		"\u00e0\2\2\u0432\u0433\5\u01a0\u00d1\2\u0433\u0435\3\2\2\2\u0434\u041d"+
		"\3\2\2\2\u0434\u0429\3\2\2\2\u0435s\3\2\2\2\u0436\u0438\7|\2\2\u0437\u0439"+
		"\7\u0099\2\2\u0438\u0437\3\2\2\2\u0438\u0439\3\2\2\2\u0439\u043a\3\2\2"+
		"\2\u043a\u043b\7t\2\2\u043b\u043c\5\u01c0\u00e1\2\u043c\u043d\7\u00d8"+
		"\2\2\u043d\u043e\7\u02ce\2\2\u043e\u043f\7\u022b\2\2\u043f\u0440\7\u02ce"+
		"\2\2\u0440\u0441\7\u00e0\2\2\u0441\u0442\5\u01a0\u00d1\2\u0442u\3\2\2"+
		"\2\u0443\u0444\7|\2\2\u0444\u0445\7\u0090\2\2\u0445\u047a\5\u01a0\u00d1"+
		"\2\u0446\u0448\7\u0269\2\2\u0447\u0446\3\2\2\2\u0447\u0448\3\2\2\2\u0448"+
		"\u044c\3\2\2\2\u0449\u044a\7\u0182\2\2\u044a\u044b\7\u02db\2\2\u044b\u044d"+
		"\5\u01a0\u00d1\2\u044c\u0449\3\2\2\2\u044c\u044d\3\2\2\2\u044d\u0451\3"+
		"\2\2\2\u044e\u044f\7\u021f\2\2\u044f\u0450\7\u02db\2\2\u0450\u0452\5\u01a0"+
		"\u00d1\2\u0451\u044e\3\2\2\2\u0451\u0452\3\2\2\2\u0452\u0456\3\2\2\2\u0453"+
		"\u0454\7\u00bc\2\2\u0454\u0455\7\u02db\2\2\u0455\u0457\5\u01a0\u00d1\2"+
		"\u0456\u0453\3\2\2\2\u0456\u0457\3\2\2\2\u0457\u045b\3\2\2\2\u0458\u0459"+
		"\7\u0295\2\2\u0459\u045a\7\u02db\2\2\u045a\u045c\5\u01a0\u00d1\2\u045b"+
		"\u0458\3\2\2\2\u045b\u045c\3\2\2\2\u045c\u0460\3\2\2\2\u045d\u045e\7\u0296"+
		"\2\2\u045e\u045f\7\u02db\2\2\u045f\u0461\5\u01a0\u00d1\2\u0460\u045d\3"+
		"\2\2\2\u0460\u0461\3\2\2\2\u0461\u0465\3\2\2\2\u0462\u0463\7\u021c\2\2"+
		"\u0463\u0464\7\u02db\2\2\u0464\u0466\5\u01a0\u00d1\2\u0465\u0462\3\2\2"+
		"\2\u0465\u0466\3\2\2\2\u0466\u046a\3\2\2\2\u0467\u0468\7\u0299\2\2\u0468"+
		"\u0469\7\u02db\2\2\u0469\u046b\5\u01a0\u00d1\2\u046a\u0467\3\2\2\2\u046a"+
		"\u046b\3\2\2\2\u046b\u0470\3\2\2\2\u046c\u046d\7j\2\2\u046d\u046e\7\u0128"+
		"\2\2\u046e\u046f\7\u02db\2\2\u046f\u0471\7\u02cb\2\2\u0470\u046c\3\2\2"+
		"\2\u0470\u0471\3\2\2\2\u0471\u0475\3\2\2\2\u0472\u0473\7\u029a\2\2\u0473"+
		"\u0474\7\u02db\2\2\u0474\u0476\7\u02cb\2\2\u0475\u0472\3\2\2\2\u0475\u0476"+
		"\3\2\2\2\u0476\u0478\3\2\2\2\u0477\u0447\3\2\2\2\u0477\u0478\3\2\2\2\u0478"+
		"\u047a\3\2\2\2\u0479\u0443\3\2\2\2\u0479\u0477\3\2\2\2\u047aw\3\2\2\2"+
		"\u047b\u047c\7l\2\2\u047c\u047e\5\u01a0\u00d1\2\u047d\u047b\3\2\2\2\u047d"+
		"\u047e\3\2\2\2\u047e\u0487\3\2\2\2\u047f\u0480\7\u015c\2\2\u0480\u0488"+
		"\7\u0161\2\2\u0481\u0488\7\u0161\2\2\u0482\u0483\7O\2\2\u0483\u0484\7"+
		"\u02c4\2\2\u0484\u0485\5\u0192\u00ca\2\u0485\u0486\7\u02c5\2\2\u0486\u0488"+
		"\3\2\2\2\u0487\u047f\3\2\2\2\u0487\u0481\3\2\2\2\u0487\u0482\3\2\2\2\u0488"+
		"y\3\2\2\2\u0489\u048a\7|\2\2\u048a\u048b\7\u00b3\2\2\u048b\u048d\5\u01a0"+
		"\u00d1\2\u048c\u048e\7\35\2\2\u048d\u048c\3\2\2\2\u048d\u048e\3\2\2\2"+
		"\u048e\u048f\3\2\2\2\u048f\u0497\5\u01a8\u00d5\2\u0490\u0491\7Y\2\2\u0491"+
		"\u0496\5\u01a0\u00d1\2\u0492\u0493\7\u0099\2\2\u0493\u0496\5\u0192\u00ca"+
		"\2\u0494\u0496\5x=\2\u0495\u0490\3\2\2\2\u0495\u0492\3\2\2\2\u0495\u0494"+
		"\3\2\2\2\u0496\u0499\3\2\2\2\u0497\u0495\3\2\2\2\u0497\u0498\3\2\2\2\u0498"+
		"{\3\2\2\2\u0499\u0497\3\2\2\2\u049a\u049b\5\u01c0\u00e1\2\u049b\u049c"+
		"\7\u00fc\2\2\u049c\u049d\7\u02c4\2\2\u049d\u04a2\7\u02ce\2\2\u049e\u049f"+
		"\7\u02be\2\2\u049f\u04a1\7\u02ce\2\2\u04a0\u049e\3\2\2\2\u04a1\u04a4\3"+
		"\2\2\2\u04a2\u04a0\3\2\2\2\u04a2\u04a3\3\2\2\2\u04a3\u04a5\3\2\2\2\u04a4"+
		"\u04a2\3\2\2\2\u04a5\u04aa\7\u02c5\2\2\u04a6\u04a7\7\31\2\2\u04a7\u04a9"+
		"\5|?\2\u04a8\u04a6\3\2\2\2\u04a9\u04ac\3\2\2\2\u04aa\u04a8\3\2\2\2\u04aa"+
		"\u04ab\3\2\2\2\u04ab}\3\2\2\2\u04ac\u04aa\3\2\2\2\u04ad\u04ae\7|\2\2\u04ae"+
		"\u04af\7\u029b\2\2\u04af\u04b0\7\u0238\2\2\u04b0\u04b1\5\u01c0\u00e1\2"+
		"\u04b1\u04b2\7\u016f\2\2\u04b2\u04b5\5\u01c0\u00e1\2\u04b3\u04b4\7\u0264"+
		"\2\2\u04b4\u04b6\5|?\2\u04b5\u04b3\3\2\2\2\u04b5\u04b6\3\2\2\2\u04b6\u04b7"+
		"\3\2\2\2\u04b7\u04b8\7\u00c9\2\2\u04b8\u04b9\7\u01a3\2\2\u04b9\u04ba\5"+
		"\u01c0\u00e1\2\u04ba\u04bb\7\u02c4\2\2\u04bb\u04bc\7\u02c5\2\2\u04bc\177"+
		"\3\2\2\2\u04bd\u04be\5\u01a0\u00d1\2\u04be\u04c3\7\u02ce\2\2\u04bf\u04c0"+
		"\7\u02be\2\2\u04c0\u04c2\5\u0080A\2\u04c1\u04bf\3\2\2\2\u04c2\u04c5\3"+
		"\2\2\2\u04c3\u04c1\3\2\2\2\u04c3\u04c4\3\2\2\2\u04c4\u0081\3\2\2\2\u04c5"+
		"\u04c3\3\2\2\2\u04c6\u04c7\7|\2\2\u04c7\u04c8\7\u00da\2\2\u04c8\u04c9"+
		"\7\u008f\2\2\u04c9\u04ca\7\u029c\2\2\u04ca\u04d1\5\u01c0\u00e1\2\u04cb"+
		"\u04cc\7\u00ef\2\2\u04cc\u04d0\5\u01c0\u00e1\2\u04cd\u04ce\7\u0156\2\2"+
		"\u04ce\u04d0\7\u00ef\2\2\u04cf\u04cb\3\2\2\2\u04cf\u04cd\3\2\2\2\u04d0"+
		"\u04d3\3\2\2\2\u04d1\u04cf\3\2\2\2\u04d1\u04d2\3\2\2\2\u04d2\u04d8\3\2"+
		"\2\2\u04d3\u04d1\3\2\2\2\u04d4\u04d5\7\u0258\2\2\u04d5\u04d9\5\u01c0\u00e1"+
		"\2\u04d6\u04d7\7\u0156\2\2\u04d7\u04d9\7\u0258\2\2\u04d8\u04d4\3\2\2\2"+
		"\u04d8\u04d6\3\2\2\2\u04d8\u04d9\3\2\2\2\u04d9\u04df\3\2\2\2\u04da\u04db"+
		"\7\u0175\2\2\u04db\u04dc\7\u02c4\2\2\u04dc\u04dd\5\u0080A\2\u04dd\u04de"+
		"\7\u02c5\2\2\u04de\u04e0\3\2\2\2\u04df\u04da\3\2\2\2\u04df\u04e0\3\2\2"+
		"\2\u04e0\u0083\3\2\2\2\u04e1\u04e2\7|\2\2\u04e2\u04e3\7\u00da\2\2\u04e3"+
		"\u04e7\7\u021a\2\2\u04e4\u04e5\7\u0293\2\2\u04e5\u04e6\7\u015c\2\2\u04e6"+
		"\u04e8\7\u00cb\2\2\u04e7\u04e4\3\2\2\2\u04e7\u04e8\3\2\2\2\u04e8\u04e9"+
		"\3\2\2\2\u04e9\u04ea\5\u01c0\u00e1\2\u04ea\u04eb\7\u02c4\2\2\u04eb\u04ec"+
		"\5\u01c0\u00e1\2\u04ec\u04f2\5\u01c0\u00e1\2\u04ed\u04ee\7\u0175\2\2\u04ee"+
		"\u04ef\7\u02c4\2\2\u04ef\u04f0\5\u0080A\2\u04f0\u04f1\7\u02c5\2\2\u04f1"+
		"\u04f3\3\2\2\2\u04f2\u04ed\3\2\2\2\u04f2\u04f3\3\2\2\2\u04f3\u04f6\3\2"+
		"\2\2\u04f4\u04f5\7Y\2\2\u04f5\u04f7\5n8\2\u04f6\u04f4\3\2\2\2\u04f6\u04f7"+
		"\3\2\2\2\u04f7\u04f8\3\2\2\2\u04f8\u04fb\7\u02c5\2\2\u04f9\u04fa\7\u0102"+
		"\2\2\u04fa\u04fc\5\u01a2\u00d2\2\u04fb\u04f9\3\2\2\2\u04fb\u04fc\3\2\2"+
		"\2\u04fc\u04fd\3\2\2\2\u04fd\u04fe\7\u029d\2\2\u04fe\u0504\5\u01a0\u00d1"+
		"\2\u04ff\u0500\7\u0175\2\2\u0500\u0501\7\u02c4\2\2\u0501\u0502\5\u0080"+
		"A\2\u0502\u0503\7\u02c5\2\2\u0503\u0505\3\2\2\2\u0504\u04ff\3\2\2\2\u0504"+
		"\u0505\3\2\2\2\u0505\u0085\3\2\2\2\u0506\u0509\7|\2\2\u0507\u0508\7\u0176"+
		"\2\2\u0508\u050a\7\u01be\2\2\u0509\u0507\3\2\2\2\u0509\u050a\3\2\2\2\u050a"+
		"\u050b\3\2\2\2\u050b\u050c\7\u00e2\2\2\u050c\u050d\5\u01a0\u00d1\2\u050d"+
		"\u0087\3\2\2\2\u050e\u050f\7|\2\2\u050f\u0510\7\u00ed\2\2\u0510\u053a"+
		"\5\u01c0\u00e1\2\u0511\u0513\7\u0269\2\2\u0512\u0511\3\2\2\2\u0512\u0513"+
		"\3\2\2\2\u0513\u0536\3\2\2\2\u0514\u0537\7\u0270\2\2\u0515\u0537\7\u0271"+
		"\2\2\u0516\u0537\7}\2\2\u0517\u0537\7\u0157\2\2\u0518\u0537\7\u0272\2"+
		"\2\u0519\u0537\7\u0273\2\2\u051a\u0537\7~\2\2\u051b\u0537\7\u0158\2\2"+
		"\u051c\u0537\7\u0274\2\2\u051d\u0537\7\u0275\2\2\u051e\u0537\7\u0276\2"+
		"\2\u051f\u0537\7\u0277\2\2\u0520\u0522\t\4\2\2\u0521\u0520\3\2\2\2\u0521"+
		"\u0522\3\2\2\2\u0522\u0523\3\2\2\2\u0523\u0524\7\u018f\2\2\u0524\u0537"+
		"\t\5\2\2\u0525\u0526\7\u0257\2\2\u0526\u0527\7\u024c\2\2\u0527\u0537\7"+
		"\u02ce\2\2\u0528\u0529\7\u00fc\2\2\u0529\u052a\7\u01cb\2\2\u052a\u0537"+
		"\5\u01a2\u00d2\2\u052b\u052c\7\u00fc\2\2\u052c\u052d\7\u00ed\2\2\u052d"+
		"\u0537\5\u01a2\u00d2\2\u052e\u052f\7\u01cb\2\2\u052f\u0537\5\u01a2\u00d2"+
		"\2\u0530\u0531\7\16\2\2\u0531\u0537\5\u01a2\u00d2\2\u0532\u0533\7\u0250"+
		"\2\2\u0533\u0537\5\u01a2\u00d2\2\u0534\u0535\7\u0217\2\2\u0535\u0537\7"+
		"\u02cb\2\2\u0536\u0514\3\2\2\2\u0536\u0515\3\2\2\2\u0536\u0516\3\2\2\2"+
		"\u0536\u0517\3\2\2\2\u0536\u0518\3\2\2\2\u0536\u0519\3\2\2\2\u0536\u051a"+
		"\3\2\2\2\u0536\u051b\3\2\2\2\u0536\u051c\3\2\2\2\u0536\u051d\3\2\2\2\u0536"+
		"\u051e\3\2\2\2\u0536\u051f\3\2\2\2\u0536\u0521\3\2\2\2\u0536\u0525\3\2"+
		"\2\2\u0536\u0528\3\2\2\2\u0536\u052b\3\2\2\2\u0536\u052e\3\2\2\2\u0536"+
		"\u0530\3\2\2\2\u0536\u0532\3\2\2\2\u0536\u0534\3\2\2\2\u0537\u0538\3\2"+
		"\2\2\u0538\u0536\3\2\2\2\u0538\u0539\3\2\2\2\u0539\u053b\3\2\2\2\u053a"+
		"\u0512\3\2\2\2\u053a\u053b\3\2\2\2\u053b\u0089\3\2\2\2\u053c\u053e\7|"+
		"\2\2\u053d\u053f\7\u0247\2\2\u053e\u053d\3\2\2\2\u053e\u053f\3\2\2\2\u053f"+
		"\u0540\3\2\2\2\u0540\u0542\7\u00ff\2\2\u0541\u0543\7\u02a4\2\2\u0542\u0541"+
		"\3\2\2\2\u0542\u0543\3\2\2\2\u0543\u054a\3\2\2\2\u0544\u0545\7\u0293\2"+
		"\2\u0545\u0546\7\u015c\2\2\u0546\u0548\7\u00cb\2\2\u0547\u0544\3\2\2\2"+
		"\u0547\u0548\3\2\2\2\u0548\u0549\3\2\2\2\u0549\u054b\5\u01c0\u00e1\2\u054a"+
		"\u0547\3\2\2\2\u054a\u054b\3\2\2\2\u054b\u054c\3\2\2\2\u054c\u054d\7\u016f"+
		"\2\2\u054d\u0550\5\u01c0\u00e1\2\u054e\u054f\7\u0255\2\2\u054f\u0551\5"+
		"\u01ac\u00d7\2\u0550\u054e\3\2\2\2\u0550\u0551\3\2\2\2\u0551\u0554\3\2"+
		"\2\2\u0552\u0553\7\u021c\2\2\u0553\u0555\5\u01c0\u00e1\2\u0554\u0552\3"+
		"\2\2\2\u0554\u0555\3\2\2\2\u0555\u0558\3\2\2\2\u0556\u0557\7\u0266\2\2"+
		"\u0557\u0559\5\u01bc\u00df\2\u0558\u0556\3\2\2\2\u0558\u0559\3\2\2\2\u0559"+
		"\u008b\3\2\2\2\u055a\u055d\7|\2\2\u055b\u055c\7\u0176\2\2\u055c\u055e"+
		"\7\u01be\2\2\u055d\u055b\3\2\2\2\u055d\u055e\3\2\2\2\u055e\u0560\3\2\2"+
		"\2\u055f\u0561\7\u01a2\2\2\u0560\u055f\3\2\2\2\u0560\u0561\3\2\2\2\u0561"+
		"\u0562\3\2\2\2\u0562\u0563\7\u011e\2\2\u0563\u057c\5\u01c0\u00e1\2\u0564"+
		"\u0567\7|\2\2\u0565\u0566\7\u0176\2\2\u0566\u0568\7\u01be\2\2\u0567\u0565"+
		"\3\2\2\2\u0567\u0568\3\2\2\2\u0568\u056a\3\2\2\2\u0569\u056b\7\u023f\2"+
		"\2\u056a\u0569\3\2\2\2\u056a\u056b\3\2\2\2\u056b\u056d\3\2\2\2\u056c\u056e"+
		"\7\u01a2\2\2\u056d\u056c\3\2\2\2\u056d\u056e\3\2\2\2\u056e\u056f\3\2\2"+
		"\2\u056f\u0570\7\u011e\2\2\u0570\u0571\5\u01c0\u00e1\2\u0571\u0572\7\u00ef"+
		"\2\2\u0572\u0575\5\u01c0\u00e1\2\u0573\u0574\7\u02a5\2\2\u0574\u0576\5"+
		"\u01c0\u00e1\2\u0575\u0573\3\2\2\2\u0575\u0576\3\2\2\2\u0576\u0579\3\2"+
		"\2\2\u0577\u0578\7\u0258\2\2\u0578\u057a\5\u01c0\u00e1\2\u0579\u0577\3"+
		"\2\2\2\u0579\u057a\3\2\2\2\u057a\u057c\3\2\2\2\u057b\u055a\3\2\2\2\u057b"+
		"\u0564\3\2\2\2\u057c\u008d\3\2\2\2\u057d\u057e\7|\2\2\u057e\u057f\7\u02a6"+
		"\2\2\u057f\u0583\7\u0262\2\2\u0580\u0581\7\u0293\2\2\u0581\u0582\7\u015c"+
		"\2\2\u0582\u0584\7\u00cb\2\2\u0583\u0580\3\2\2\2\u0583\u0584\3\2\2\2\u0584"+
		"\u0585\3\2\2\2\u0585\u058a\5\u01c0\u00e1\2\u0586\u0587\7\u02c4\2\2\u0587"+
		"\u0588\5\u01a4\u00d3\2\u0588\u0589\7\u02c5\2\2\u0589\u058b\3\2\2\2\u058a"+
		"\u0586\3\2\2\2\u058a\u058b\3\2\2\2\u058b\u058d\3\2\2\2\u058c\u058e\7\u0269"+
		"\2\2\u058d\u058c\3\2\2\2\u058d\u058e\3\2\2\2\u058e\u0591\3\2\2\2\u058f"+
		"\u0590\7\u021c\2\2\u0590\u0592\5\u01c0\u00e1\2\u0591\u058f\3\2\2\2\u0591"+
		"\u0592\3\2\2\2\u0592\u0593\3\2\2\2\u0593\u0594\7\35\2\2\u0594\u059a\5"+
		"\u0152\u00aa\2\u0595\u0597\7\u0269\2\2\u0596\u0598\7\u0156\2\2\u0597\u0596"+
		"\3\2\2\2\u0597\u0598\3\2\2\2\u0598\u0599\3\2\2\2\u0599\u059b\7\u008f\2"+
		"\2\u059a\u0595\3\2\2\2\u059a\u059b\3\2\2\2\u059b\u008f\3\2\2\2\u059c\u059d"+
		"\7|\2\2\u059d\u059e\7\u0173\2\2\u059e\u059f\5\u01c0\u00e1\2\u059f\u05a0"+
		"\7\u02c4\2\2\u05a0\u05a1\7\u01a3\2\2\u05a1\u05a2\7\u02db\2\2\u05a2\u05a7"+
		"\5\u01c0\u00e1\2\u05a3\u05a4\7\u02be\2\2\u05a4\u05a5\7\u02a7\2\2\u05a5"+
		"\u05a6\7\u02db\2\2\u05a6\u05a8\5\u01a0\u00d1\2\u05a7\u05a3\3\2\2\2\u05a7"+
		"\u05a8\3\2\2\2\u05a8\u05ad\3\2\2\2\u05a9\u05aa\7\u02be\2\2\u05aa\u05ab"+
		"\7\u02a8\2\2\u05ab\u05ac\7\u02db\2\2\u05ac\u05ae\5\u01a0\u00d1\2\u05ad"+
		"\u05a9\3\2\2\2\u05ad\u05ae\3\2\2\2\u05ae\u05b3\3\2\2\2\u05af\u05b0\7\u02be"+
		"\2\2\u05b0\u05b1\7\u02a9\2\2\u05b1\u05b2\7\u02db\2\2\u05b2\u05b4\5\u01a0"+
		"\u00d1\2\u05b3\u05af\3\2\2\2\u05b3\u05b4\3\2\2\2\u05b4\u05b9\3\2\2\2\u05b5"+
		"\u05b6\7\u02be\2\2\u05b6\u05b7\7\u02aa\2\2\u05b7\u05b8\7\u02db\2\2\u05b8"+
		"\u05ba\5\u01a0\u00d1\2\u05b9\u05b5\3\2\2\2\u05b9\u05ba\3\2\2\2\u05ba\u05bf"+
		"\3\2\2\2\u05bb\u05bc\7\u02be\2\2\u05bc\u05bd\7\u01c1\2\2\u05bd\u05be\7"+
		"\u02db\2\2\u05be\u05c0\5\u01a0\u00d1\2\u05bf\u05bb\3\2\2\2\u05bf\u05c0"+
		"\3\2\2\2\u05c0\u05c5\3\2\2\2\u05c1\u05c2\7\u02be\2\2\u05c2\u05c3\7\u0118"+
		"\2\2\u05c3\u05c4\7\u02db\2\2\u05c4\u05c6\5\u01a0\u00d1\2\u05c5\u05c1\3"+
		"\2\2\2\u05c5\u05c6\3\2\2\2\u05c6\u05c9\3\2\2\2\u05c7\u05c8\7\u02be\2\2"+
		"\u05c8\u05ca\7\u02ab\2\2\u05c9\u05c7\3\2\2\2\u05c9\u05ca\3\2\2\2\u05ca"+
		"\u05cd\3\2\2\2\u05cb\u05cc\7\u02be\2\2\u05cc\u05ce\7\u02ac\2\2\u05cd\u05cb"+
		"\3\2\2\2\u05cd\u05ce\3\2\2\2\u05ce\u05cf\3\2\2\2\u05cf\u05d0\7\u02c5\2"+
		"\2\u05d0\u0091\3\2\2\2\u05d1\u05d2\7\u0173\2\2\u05d2\u05d3\7\u02cb\2\2"+
		"\u05d3\u05da\5\u01c0\u00e1\2\u05d4\u05d5\7\u02c4\2\2\u05d5\u05d6\5\u01c0"+
		"\u00e1\2\u05d6\u05d7\7\u02be\2\2\u05d7\u05d8\5\u01c0\u00e1\2\u05d8\u05d9"+
		"\7\u02c5\2\2\u05d9\u05db\3\2\2\2\u05da\u05d4\3\2\2\2\u05da\u05db\3\2\2"+
		"\2\u05db\u05f0\3\2\2\2\u05dc\u05dd\7\u00e2\2\2\u05dd\u05e6\7\u02cb\2\2"+
		"\u05de\u05df\7\u02c4\2\2\u05df\u05e2\5\u01c0\u00e1\2\u05e0\u05e1\7\u02be"+
		"\2\2\u05e1\u05e3\5\u01c0\u00e1\2\u05e2\u05e0\3\2\2\2\u05e2\u05e3\3\2\2"+
		"\2\u05e3\u05e4\3\2\2\2\u05e4\u05e5\7\u02c5\2\2\u05e5\u05e7\3\2\2\2\u05e6"+
		"\u05de\3\2\2\2\u05e6\u05e7\3\2\2\2\u05e7\u05e8\3\2\2\2\u05e8\u05e9\5\u01c0"+
		"\u00e1\2\u05e9\u05ea\7\u02c4\2\2\u05ea\u05eb\5\u01aa\u00d6\2\u05eb\u05ec"+
		"\7\u02c5\2\2\u05ec\u05f0\3\2\2\2\u05ed\u05ee\7\u020d\2\2\u05ee\u05f0\5"+
		"\u01c0\u00e1\2\u05ef\u05d1\3\2\2\2\u05ef\u05dc\3\2\2\2\u05ef\u05ed\3\2"+
		"\2\2\u05f0\u0093\3\2\2\2\u05f1\u05f2\7|\2\2\u05f2\u05f3\7\u0173\2\2\u05f3"+
		"\u05f4\7R\2\2\u05f4\u05f6\5\u01c0\u00e1\2\u05f5\u05f7\7\u0099\2\2\u05f6"+
		"\u05f5\3\2\2\2\u05f6\u05f7\3\2\2\2\u05f7\u05f8\3\2\2\2\u05f8\u05f9\7\u00d8"+
		"\2\2\u05f9\u05fa\7\u0240\2\2\u05fa\u05fb\5\u01c0\u00e1\2\u05fb\u05fc\7"+
		"\u0255\2\2\u05fc\u05ff\5\u01ac\u00d7\2\u05fd\u05fe\7\u02ad\2\2\u05fe\u0600"+
		"\5\u01c0\u00e1\2\u05ff\u05fd\3\2\2\2\u05ff\u0600\3\2\2\2\u0600\u0601\3"+
		"\2\2\2\u0601\u0602\7\35\2\2\u0602\u0607\5\u0092J\2\u0603\u0604\7\u02be"+
		"\2\2\u0604\u0606\5\u0092J\2\u0605\u0603\3\2\2\2\u0606\u0609\3\2\2\2\u0607"+
		"\u0605\3\2\2\2\u0607\u0608\3\2\2\2\u0608\u0095\3\2\2\2\u0609\u0607\3\2"+
		"\2\2\u060a\u060b\7|\2\2\u060b\u060c\7\u0173\2\2\u060c\u060d\7\u02ad\2"+
		"\2\u060d\u060e\5\u01c0\u00e1\2\u060e\u060f\7\u0255\2\2\u060f\u0610\5\u01ac"+
		"\u00d7\2\u0610\u0097\3\2\2\2\u0611\u0612\7|\2\2\u0612\u0613\7\u02ae\2"+
		"\2\u0613\u0614\5\u01c0\u00e1\2\u0614\u0615\7\u016f\2\2\u0615\u0618\5\u01c0"+
		"\u00e1\2\u0616\u0617\7\u00d8\2\2\u0617\u0619\t\6\2\2\u0618\u0616\3\2\2"+
		"\2\u0618\u0619\3\2\2\2\u0619\u0621\3\2\2\2\u061a\u061f\7\u022b\2\2\u061b"+
		"\u0620\5\u01c0\u00e1\2\u061c\u0620\7\u01a4\2\2\u061d\u0620\7\u008b\2\2"+
		"\u061e\u0620\7\u01eb\2\2\u061f\u061b\3\2\2\2\u061f\u061c\3\2\2\2\u061f"+
		"\u061d\3\2\2\2\u061f\u061e\3\2\2\2\u0620\u0622\3\2\2\2\u0621\u061a\3\2"+
		"\2\2\u0621\u0622\3\2\2\2\u0622\u0628\3\2\2\2\u0623\u0624\7\u0255\2\2\u0624"+
		"\u0625\7\u02c4\2\2\u0625\u0626\5\u01bc\u00df\2\u0626\u0627\7\u02c5\2\2"+
		"\u0627\u0629\3\2\2\2\u0628\u0623\3\2\2\2\u0628\u0629\3\2\2\2\u0629\u0630"+
		"\3\2\2\2\u062a\u062b\7\u0269\2\2\u062b\u062c\7O\2\2\u062c\u062d\7\u02c4"+
		"\2\2\u062d\u062e\5\u01bc\u00df\2\u062e\u062f\7\u02c5\2\2\u062f\u0631\3"+
		"\2\2\2\u0630\u062a\3\2\2\2\u0630\u0631\3\2\2\2\u0631\u0099\3\2\2\2\u0632"+
		"\u0633\7|\2\2\u0633\u0637\7\u01cb\2\2\u0634\u0638\5\u01a0\u00d1\2\u0635"+
		"\u0638\7\u008b\2\2\u0636\u0638\7\u01eb\2\2\u0637\u0634\3\2\2\2\u0637\u0635"+
		"\3\2\2\2\u0637\u0636\3\2\2\2\u0638\u0667\3\2\2\2\u0639\u063b\7\u0269\2"+
		"\2\u063a\u0639\3\2\2\2\u063a\u063b\3\2\2\2\u063b\u0663\3\2\2\2\u063c\u0664"+
		"\7\u0270\2\2\u063d\u0664\7\u0271\2\2\u063e\u0664\7}\2\2\u063f\u0664\7"+
		"\u0157\2\2\u0640\u0664\7\u0272\2\2\u0641\u0664\7\u0273\2\2\u0642\u0664"+
		"\7\u0274\2\2\u0643\u0664\7\u0275\2\2\u0644\u0664\7\u0276\2\2\u0645\u0664"+
		"\7\u0277\2\2\u0646\u0664\7\u0278\2\2\u0647\u0664\7\u0279\2\2\u0648\u0664"+
		"\7\u027a\2\2\u0649\u0664\7\u027b\2\2\u064a\u064b\7j\2\2\u064b\u064c\7"+
		"\u0128\2\2\u064c\u0664\7\u02cb\2\2\u064d\u064f\7\u00bd\2\2\u064e\u064d"+
		"\3\2\2\2\u064e\u064f\3\2\2\2\u064f\u0650\3\2\2\2\u0650\u0651\7\u018f\2"+
		"\2\u0651\u0664\t\5\2\2\u0652\u0653\7\u0257\2\2\u0653\u0654\7\u024c\2\2"+
		"\u0654\u0664\7\u02ce\2\2\u0655\u0656\7\u00fc\2\2\u0656\u0657\7\u01cb\2"+
		"\2\u0657\u0664\5\u01a2\u00d2\2\u0658\u0659\7\u00fc\2\2\u0659\u065a\7\u00ed"+
		"\2\2\u065a\u0664\5\u01a2\u00d2\2\u065b\u065c\7\u01cb\2\2\u065c\u0664\5"+
		"\u01a2\u00d2\2\u065d\u065e\7\16\2\2\u065e\u0664\5\u01a2\u00d2\2\u065f"+
		"\u0660\7\u0250\2\2\u0660\u0664\5\u01a2\u00d2\2\u0661\u0662\7\u0217\2\2"+
		"\u0662\u0664\7\u02cb\2\2\u0663\u063c\3\2\2\2\u0663\u063d\3\2\2\2\u0663"+
		"\u063e\3\2\2\2\u0663\u063f\3\2\2\2\u0663\u0640\3\2\2\2\u0663\u0641\3\2"+
		"\2\2\u0663\u0642\3\2\2\2\u0663\u0643\3\2\2\2\u0663\u0644\3\2\2\2\u0663"+
		"\u0645\3\2\2\2\u0663\u0646\3\2\2\2\u0663\u0647\3\2\2\2\u0663\u0648\3\2"+
		"\2\2\u0663\u0649\3\2\2\2\u0663\u064a\3\2\2\2\u0663\u064e\3\2\2\2\u0663"+
		"\u0652\3\2\2\2\u0663\u0655\3\2\2\2\u0663\u0658\3\2\2\2\u0663\u065b\3\2"+
		"\2\2\u0663\u065d\3\2\2\2\u0663\u065f\3\2\2\2\u0663\u0661\3\2\2\2\u0664"+
		"\u0665\3\2\2\2\u0665\u0663\3\2\2\2\u0665\u0666\3\2\2\2\u0666\u0668\3\2"+
		"\2\2\u0667\u063a\3\2\2\2\u0667\u0668\3\2\2\2\u0668\u009b\3\2\2\2\u0669"+
		"\u066a\t\7\2\2\u066a\u009d\3\2\2\2\u066b\u066e\7|\2\2\u066c\u066d\7\u0176"+
		"\2\2\u066d\u066f\7\u01be\2\2\u066e\u066c\3\2\2\2\u066e\u066f\3\2\2\2\u066f"+
		"\u0670\3\2\2\2\u0670\u0671\7\u01d6\2\2\u0671\u0672\5\u01a0\u00d1\2\u0672"+
		"\u0673\7\35\2\2\u0673\u0674\7\u016f\2\2\u0674\u0675\5\u009cO\2\u0675\u0676"+
		"\7\u022b\2\2\u0676\u0679\5\u01c0\u00e1\2\u0677\u0678\7\u0266\2\2\u0678"+
		"\u067a\5\u01bc\u00df\2\u0679\u0677\3\2\2\2\u0679\u067a\3\2\2\2\u067a\u067b"+
		"\3\2\2\2\u067b\u067d\7\u00b2\2\2\u067c\u067e\t\b\2\2\u067d\u067c\3\2\2"+
		"\2\u067d\u067e\3\2\2\2\u067e\u0681\3\2\2\2\u067f\u0682\7\u015d\2\2\u0680"+
		"\u0682\5\u01c0\u00e1\2\u0681\u067f\3\2\2\2\u0681\u0680\3\2\2\2\u0682\u009f"+
		"\3\2\2\2\u0683\u0687\5\u01c0\u00e1\2\u0684\u0687\7\u008b\2\2\u0685\u0687"+
		"\7\u01eb\2\2\u0686\u0683\3\2\2\2\u0686\u0684\3\2\2\2\u0686\u0685\3\2\2"+
		"\2\u0687\u00a1\3\2\2\2\u0688\u0689\7|\2\2\u0689\u068a\7\u01d9\2\2\u068a"+
		"\u068d\5\u01c0\u00e1\2\u068b\u068c\7\'\2\2\u068c\u068e\5\u00a0Q\2\u068d"+
		"\u068b\3\2\2\2\u068d\u068e\3\2\2\2\u068e\u0690\3\2\2\2\u068f\u0691\5\u01c2"+
		"\u00e2\2\u0690\u068f\3\2\2\2\u0690\u0691\3\2\2\2\u0691\u06ab\3\2\2\2\u0692"+
		"\u0693\7|\2\2\u0693\u0694\7\u01d9\2\2\u0694\u0695\7\'\2\2\u0695\u0697"+
		"\5\u00a0Q\2\u0696\u0698\5\u01c2\u00e2\2\u0697\u0696\3\2\2\2\u0697\u0698"+
		"\3\2\2\2\u0698\u06ab\3\2\2\2\u0699\u069a\7|\2\2\u069a\u069b\7\u01d9\2"+
		"\2\u069b\u069c\7\u0293\2\2\u069c\u069d\7\u015c\2\2\u069d\u069e\7\u00cb"+
		"\2\2\u069e\u06a1\5\u01c0\u00e1\2\u069f\u06a0\7\'\2\2\u06a0\u06a2\5\u00a0"+
		"Q\2\u06a1\u069f\3\2\2\2\u06a1\u06a2\3\2\2\2\u06a2\u06ab\3\2\2\2\u06a3"+
		"\u06a4\7|\2\2\u06a4\u06a5\7\u01d9\2\2\u06a5\u06a6\7\u0293\2\2\u06a6\u06a7"+
		"\7\u015c\2\2\u06a7\u06a8\7\u00cb\2\2\u06a8\u06a9\7\'\2\2\u06a9\u06ab\5"+
		"\u00a0Q\2\u06aa\u0688\3\2\2\2\u06aa\u0692\3\2\2\2\u06aa\u0699\3\2\2\2"+
		"\u06aa\u06a3\3\2\2\2\u06ab\u00a3\3\2\2\2\u06ac\u06ae\7|\2\2\u06ad\u06af"+
		"\t\t\2\2\u06ae\u06ad\3\2\2\2\u06ae\u06af\3\2\2\2\u06af\u06b0\3\2\2\2\u06b0"+
		"\u06b4\7\u01e7\2\2\u06b1\u06b2\7\u0293\2\2\u06b2\u06b3\7\u015c\2\2\u06b3"+
		"\u06b5\7\u00cb\2\2\u06b4\u06b1\3\2\2\2\u06b4\u06b5\3\2\2\2\u06b5\u06b6"+
		"\3\2\2\2\u06b6\u06bc\5\u01c0\u00e1\2\u06b7\u06b9\7\u00fe\2\2\u06b8\u06ba"+
		"\7\67\2\2\u06b9\u06b8\3\2\2\2\u06b9\u06ba\3\2\2\2\u06ba\u06bb\3\2\2\2"+
		"\u06bb\u06bd\7\u02cb\2\2\u06bc\u06b7\3\2\2\2\u06bc\u06bd\3\2\2\2\u06bd"+
		"\u06c2\3\2\2\2\u06be\u06bf\7\u0142\2\2\u06bf\u06c3\7\u02cb\2\2\u06c0\u06c1"+
		"\7\u0156\2\2\u06c1\u06c3\7\u0142\2\2\u06c2\u06be\3\2\2\2\u06c2\u06c0\3"+
		"\2\2\2\u06c2\u06c3\3\2\2\2\u06c3\u06c8\3\2\2\2\u06c4\u06c5\7\u0139\2\2"+
		"\u06c5\u06c9\7\u02cb\2\2\u06c6\u06c7\7\u0156\2\2\u06c7\u06c9\7\u0139\2"+
		"\2\u06c8\u06c4\3\2\2\2\u06c8\u06c6\3\2\2\2\u06c8\u06c9\3\2\2\2\u06c9\u06cf"+
		"\3\2\2\2\u06ca\u06cc\7\u0204\2\2\u06cb\u06cd\7\u0269\2\2\u06cc\u06cb\3"+
		"\2\2\2\u06cc\u06cd\3\2\2\2\u06cd\u06ce\3\2\2\2\u06ce\u06d0\7\u02cb\2\2"+
		"\u06cf\u06ca\3\2\2\2\u06cf\u06d0\3\2\2\2\u06d0\u06d3\3\2\2\2\u06d1\u06d2"+
		"\79\2\2\u06d2\u06d4\7\u02cb\2\2\u06d3\u06d1\3\2\2\2\u06d3\u06d4\3\2\2"+
		"\2\u06d4\u06d9\3\2\2\2\u06d5\u06d7\7\u0156\2\2\u06d6\u06d5\3\2\2\2\u06d6"+
		"\u06d7\3\2\2\2\u06d7\u06d8\3\2\2\2\u06d8\u06da\7\u008e\2\2\u06d9\u06d6"+
		"\3\2\2\2\u06d9\u06da\3\2\2\2\u06da\u06e4\3\2\2\2\u06db\u06dc\7\u02af\2"+
		"\2\u06dc\u06e2\7\67\2\2\u06dd\u06de\5\u01c0\u00e1\2\u06de\u06df\7\u02cd"+
		"\2\2\u06df\u06e0\5\u01c0\u00e1\2\u06e0\u06e3\3\2\2\2\u06e1\u06e3\7\u0159"+
		"\2\2\u06e2\u06dd\3\2\2\2\u06e2\u06e1\3\2\2\2\u06e3\u06e5\3\2\2\2\u06e4"+
		"\u06db\3\2\2\2\u06e4\u06e5\3\2\2\2\u06e5\u00a5\3\2\2\2\u06e6\u06e7\5\u01c4"+
		"\u00e3\2\u06e7\u00a7\3\2\2\2\u06e8\u06e9\5\u01c4\u00e3\2\u06e9\u00a9\3"+
		"\2\2\2\u06ea\u06eb\5\u01c4\u00e3\2\u06eb\u00ab\3\2\2\2\u06ec\u06ed\5\u01c4"+
		"\u00e3\2\u06ed\u00ad\3\2\2\2\u06ee\u06ef\5\u01c4\u00e3\2\u06ef\u00af\3"+
		"\2\2\2\u06f0\u06f1\5\u01c4\u00e3\2\u06f1\u00b1\3\2\2\2\u06f2\u06f3\5\u01c4"+
		"\u00e3\2\u06f3\u00b3\3\2\2\2\u06f4\u06f5\5\u01c4\u00e3\2\u06f5\u00b5\3"+
		"\2\2\2\u06f6\u06f7\5\u01c4\u00e3\2\u06f7\u00b7\3\2\2\2\u06f8\u06f9\5\u01c4"+
		"\u00e3\2\u06f9\u00b9\3\2\2\2\u06fa\u06fb\5\u01c4\u00e3\2\u06fb\u00bb\3"+
		"\2\2\2\u06fc\u06fd\5\u01c4\u00e3\2\u06fd\u00bd\3\2\2\2\u06fe\u06ff\5\u01c4"+
		"\u00e3\2\u06ff\u00bf\3\2\2\2\u0700\u0701\5\u01c4\u00e3\2\u0701\u00c1\3"+
		"\2\2\2\u0702\u0703\5\u01c4\u00e3\2\u0703\u00c3\3\2\2\2\u0704\u0705\5\u01c4"+
		"\u00e3\2\u0705\u00c5\3\2\2\2\u0706\u0707\5\u01c4\u00e3\2\u0707\u00c7\3"+
		"\2\2\2\u0708\u0709\5\u01c4\u00e3\2\u0709\u00c9\3\2\2\2\u070a\u070b\5\u01c4"+
		"\u00e3\2\u070b\u00cb\3\2\2\2\u070c\u070d\5\u01c4\u00e3\2\u070d\u00cd\3"+
		"\2\2\2\u070e\u0738\5\u00d0i\2\u070f\u0738\5\u00d2j\2\u0710\u0738\5\u00d4"+
		"k\2\u0711\u0738\5\u00d6l\2\u0712\u0738\5\u00d8m\2\u0713\u0738\5\u00da"+
		"n\2\u0714\u0738\5\u00dco\2\u0715\u0738\5\u00dep\2\u0716\u0738\5\u00e0"+
		"q\2\u0717\u0738\5\u00e2r\2\u0718\u0738\5\u00e4s\2\u0719\u0738\5\u00e6"+
		"t\2\u071a\u0738\5\u00e8u\2\u071b\u0738\5\u00eav\2\u071c\u0738\5\u00ec"+
		"w\2\u071d\u0738\5\u00eex\2\u071e\u0738\5\u00f0y\2\u071f\u0738\5\u00f2"+
		"z\2\u0720\u0738\5\u00f4{\2\u0721\u0738\5\u00f6|\2\u0722\u0738\5\u00f8"+
		"}\2\u0723\u0738\5\u00fa~\2\u0724\u0738\5\u00fc\177\2\u0725\u0738\5\u00fe"+
		"\u0080\2\u0726\u0738\5\u0100\u0081\2\u0727\u0738\5\u0102\u0082\2\u0728"+
		"\u0738\5\u0104\u0083\2\u0729\u0738\5\u0106\u0084\2\u072a\u0738\5\u0108"+
		"\u0085\2\u072b\u0738\5\u010a\u0086\2\u072c\u0738\5\u010c\u0087\2\u072d"+
		"\u0738\5\u010e\u0088\2\u072e\u0738\5\u0110\u0089\2\u072f\u0738\5\u0112"+
		"\u008a\2\u0730\u0738\5\u0114\u008b\2\u0731\u0738\5\u0116\u008c\2\u0732"+
		"\u0738\5\u0118\u008d\2\u0733\u0738\5\u011a\u008e\2\u0734\u0738\5\u011c"+
		"\u008f\2\u0735\u0738\5\u011e\u0090\2\u0736\u0738\5\u0120\u0091\2\u0737"+
		"\u070e\3\2\2\2\u0737\u070f\3\2\2\2\u0737\u0710\3\2\2\2\u0737\u0711\3\2"+
		"\2\2\u0737\u0712\3\2\2\2\u0737\u0713\3\2\2\2\u0737\u0714\3\2\2\2\u0737"+
		"\u0715\3\2\2\2\u0737\u0716\3\2\2\2\u0737\u0717\3\2\2\2\u0737\u0718\3\2"+
		"\2\2\u0737\u0719\3\2\2\2\u0737\u071a\3\2\2\2\u0737\u071b\3\2\2\2\u0737"+
		"\u071c\3\2\2\2\u0737\u071d\3\2\2\2\u0737\u071e\3\2\2\2\u0737\u071f\3\2"+
		"\2\2\u0737\u0720\3\2\2\2\u0737\u0721\3\2\2\2\u0737\u0722\3\2\2\2\u0737"+
		"\u0723\3\2\2\2\u0737\u0724\3\2\2\2\u0737\u0725\3\2\2\2\u0737\u0726\3\2"+
		"\2\2\u0737\u0727\3\2\2\2\u0737\u0728\3\2\2\2\u0737\u0729\3\2\2\2\u0737"+
		"\u072a\3\2\2\2\u0737\u072b\3\2\2\2\u0737\u072c\3\2\2\2\u0737\u072d\3\2"+
		"\2\2\u0737\u072e\3\2\2\2\u0737\u072f\3\2\2\2\u0737\u0730\3\2\2\2\u0737"+
		"\u0731\3\2\2\2\u0737\u0732\3\2\2\2\u0737\u0733\3\2\2\2\u0737\u0734\3\2"+
		"\2\2\u0737\u0735\3\2\2\2\u0737\u0736\3\2\2\2\u0738\u00cf\3\2\2\2\u0739"+
		"\u073a\5\u01c4\u00e3\2\u073a\u00d1\3\2\2\2\u073b\u073c\5\u01c4\u00e3\2"+
		"\u073c\u00d3\3\2\2\2\u073d\u073e\5\u01c4\u00e3\2\u073e\u00d5\3\2\2\2\u073f"+
		"\u0740\5\u01c4\u00e3\2\u0740\u00d7\3\2\2\2\u0741\u0742\5\u01c4\u00e3\2"+
		"\u0742\u00d9\3\2\2\2\u0743\u0744\5\u01c4\u00e3\2\u0744\u00db\3\2\2\2\u0745"+
		"\u0746\5\u01c4\u00e3\2\u0746\u00dd\3\2\2\2\u0747\u0748\5\u01c4\u00e3\2"+
		"\u0748\u00df\3\2\2\2\u0749\u074a\5\u01c4\u00e3\2\u074a\u00e1\3\2\2\2\u074b"+
		"\u074c\5\u01c4\u00e3\2\u074c\u00e3\3\2\2\2\u074d\u074e\5\u01c4\u00e3\2"+
		"\u074e\u00e5\3\2\2\2\u074f\u0750\5\u01c4\u00e3\2\u0750\u00e7\3\2\2\2\u0751"+
		"\u0752\5\u01c4\u00e3\2\u0752\u00e9\3\2\2\2\u0753\u0754\5\u01c4\u00e3\2"+
		"\u0754\u00eb\3\2\2\2\u0755\u0756\5\u01c4\u00e3\2\u0756\u00ed\3\2\2\2\u0757"+
		"\u0758\5\u01c4\u00e3\2\u0758\u00ef\3\2\2\2\u0759\u075a\5\u01c4\u00e3\2"+
		"\u075a\u00f1\3\2\2\2\u075b\u075c\5\u01c4\u00e3\2\u075c\u00f3\3\2\2\2\u075d"+
		"\u075e\5\u01c4\u00e3\2\u075e\u00f5\3\2\2\2\u075f\u0760\5\u01c4\u00e3\2"+
		"\u0760\u00f7\3\2\2\2\u0761\u0762\5\u01c4\u00e3\2\u0762\u00f9\3\2\2\2\u0763"+
		"\u0764\5\u01c4\u00e3\2\u0764\u00fb\3\2\2\2\u0765\u0766\5\u01c4\u00e3\2"+
		"\u0766\u00fd\3\2\2\2\u0767\u0768\5\u01c4\u00e3\2\u0768\u00ff\3\2\2\2\u0769"+
		"\u076a\5\u01c4\u00e3\2\u076a\u0101\3\2\2\2\u076b\u076c\5\u01c4\u00e3\2"+
		"\u076c\u0103\3\2\2\2\u076d\u076e\5\u01c4\u00e3\2\u076e\u0105\3\2\2\2\u076f"+
		"\u0770\5\u01c4\u00e3\2\u0770\u0107\3\2\2\2\u0771\u0772\5\u01c4\u00e3\2"+
		"\u0772\u0109\3\2\2\2\u0773\u0774\5\u01c4\u00e3\2\u0774\u010b\3\2\2\2\u0775"+
		"\u0776\5\u01c4\u00e3\2\u0776\u010d\3\2\2\2\u0777\u0778\5\u01c4\u00e3\2"+
		"\u0778\u010f\3\2\2\2\u0779\u077a\5\u01c4\u00e3\2\u077a\u0111\3\2\2\2\u077b"+
		"\u077c\5\u01c4\u00e3\2\u077c\u0113\3\2\2\2\u077d\u077e\5\u01c4\u00e3\2"+
		"\u077e\u0115\3\2\2\2\u077f\u0780\5\u01c4\u00e3\2\u0780\u0117\3\2\2\2\u0781"+
		"\u0782\5\u01c4\u00e3\2\u0782\u0119\3\2\2\2\u0783\u0784\5\u01c4\u00e3\2"+
		"\u0784\u011b\3\2\2\2\u0785\u0786\5\u01c4\u00e3\2\u0786\u011d\3\2\2\2\u0787"+
		"\u0788\5\u01c4\u00e3\2\u0788\u011f\3\2\2\2\u0789\u078a\5\u01c4\u00e3\2"+
		"\u078a\u0121\3\2\2\2\u078b\u078c\5\u01c4\u00e3\2\u078c\u0123\3\2\2\2\u078d"+
		"\u078e\5\u01c4\u00e3\2\u078e\u0125\3\2\2\2\u078f\u0790\5\u01c4\u00e3\2"+
		"\u0790\u0127\3\2\2\2\u0791\u0792\5\u01c4\u00e3\2\u0792\u0129\3\2\2\2\u0793"+
		"\u0794\5\u01c4\u00e3\2\u0794\u012b\3\2\2\2\u0795\u0796\5\u01c4\u00e3\2"+
		"\u0796\u012d\3\2\2\2\u0797\u0798\5\u01c4\u00e3\2\u0798\u012f\3\2\2\2\u0799"+
		"\u079a\5\u01c4\u00e3\2\u079a\u0131\3\2\2\2\u079b\u079c\5\u01c4\u00e3\2"+
		"\u079c\u0133\3\2\2\2\u079d\u079e\5\u01c4\u00e3\2\u079e\u0135\3\2\2\2\u079f"+
		"\u07a0\5\u01c4\u00e3\2\u07a0\u0137\3\2\2\2\u07a1\u07a2\5\u01c4\u00e3\2"+
		"\u07a2\u0139\3\2\2\2\u07a3\u07a4\5\u01c4\u00e3\2\u07a4\u013b\3\2\2\2\u07a5"+
		"\u07a6\5\u01c4\u00e3\2\u07a6\u013d\3\2\2\2\u07a7\u07a8\5\u01c4\u00e3\2"+
		"\u07a8\u013f\3\2\2\2\u07a9\u07aa\5\u01c4\u00e3\2\u07aa\u0141\3\2\2\2\u07ab"+
		"\u07ac\5\u01c4\u00e3\2\u07ac\u0143\3\2\2\2\u07ad\u07ae\5\u01c4\u00e3\2"+
		"\u07ae\u0145\3\2\2\2\u07af\u07b0\5\u01c4\u00e3\2\u07b0\u0147\3\2\2\2\u07b1"+
		"\u07b2\5\u01c4\u00e3\2\u07b2\u0149\3\2\2\2\u07b3\u07b4\5\u01c4\u00e3\2"+
		"\u07b4\u014b\3\2\2\2\u07b5\u07b6\5\u01c4\u00e3\2\u07b6\u014d\3\2\2\2\u07b7"+
		"\u07b8\5\u01c4\u00e3\2\u07b8\u014f\3\2\2\2\u07b9\u07ba\5\u01c4\u00e3\2"+
		"\u07ba\u0151\3\2\2\2\u07bb\u07bc\7\u01e4\2\2\u07bc\u07be\5\u016a\u00b6"+
		"\2\u07bd\u07bf\5\u016c\u00b7\2\u07be\u07bd\3\2\2\2\u07be\u07bf\3\2\2\2"+
		"\u07bf\u07c1\3\2\2\2\u07c0\u07c2\5\u016e\u00b8\2\u07c1\u07c0\3\2\2\2\u07c1"+
		"\u07c2\3\2\2\2\u07c2\u07c4\3\2\2\2\u07c3\u07c5\5\u0170\u00b9\2\u07c4\u07c3"+
		"\3\2\2\2\u07c4\u07c5\3\2\2\2\u07c5\u07c7\3\2\2\2\u07c6\u07c8\5\u0176\u00bc"+
		"\2\u07c7\u07c6\3\2\2\2\u07c7\u07c8\3\2\2\2\u07c8\u07ca\3\2\2\2\u07c9\u07cb"+
		"\5\u0182\u00c2\2\u07ca\u07c9\3\2\2\2\u07ca\u07cb\3\2\2\2\u07cb\u07cd\3"+
		"\2\2\2\u07cc\u07ce\5\u0184\u00c3\2\u07cd\u07cc\3\2\2\2\u07cd\u07ce\3\2"+
		"\2\2\u07ce\u07d0\3\2\2\2\u07cf\u07d1\5\u0186\u00c4\2\u07d0\u07cf\3\2\2"+
		"\2\u07d0\u07d1\3\2\2\2\u07d1\u07d3\3\2\2\2\u07d2\u07d4\5\u018a\u00c6\2"+
		"\u07d3\u07d2\3\2\2\2\u07d3\u07d4\3\2\2\2\u07d4\u07d6\3\2\2\2\u07d5\u07d7"+
		"\5\u018c\u00c7\2\u07d6\u07d5\3\2\2\2\u07d6\u07d7\3\2\2\2\u07d7\u07d9\3"+
		"\2\2\2\u07d8\u07da\5\u018e\u00c8\2\u07d9\u07d8\3\2\2\2\u07d9\u07da\3\2"+
		"\2\2\u07da\u07dc\3\2\2\2\u07db\u07dd\5\u0190\u00c9\2\u07dc\u07db\3\2\2"+
		"\2\u07dc\u07dd\3\2\2\2\u07dd\u0153\3\2\2\2\u07de\u07df\5\u01c4\u00e3\2"+
		"\u07df\u0155\3\2\2\2\u07e0\u07e1\5\u01c4\u00e3\2\u07e1\u0157\3\2\2\2\u07e2"+
		"\u07e3\5\u01c4\u00e3\2\u07e3\u0159\3\2\2\2\u07e4\u07e5\5\u01c4\u00e3\2"+
		"\u07e5\u015b\3\2\2\2\u07e6\u07e7\5\u01c4\u00e3\2\u07e7\u015d\3\2\2\2\u07e8"+
		"\u07e9\5\u01c4\u00e3\2\u07e9\u015f\3\2\2\2\u07ea\u07eb\5\u01c4\u00e3\2"+
		"\u07eb\u0161\3\2\2\2\u07ec\u07ed\5\u01c4\u00e3\2\u07ed\u0163\3\2\2\2\u07ee"+
		"\u07ef\5\u01c4\u00e3\2\u07ef\u0165\3\2\2\2\u07f0\u07f1\5\u01c4\u00e3\2"+
		"\u07f1\u0167\3\2\2\2\u07f2\u07f3\7\u025a\2\2\u07f3\u0804\5\u0198\u00cd"+
		"\2\u07f4\u07f5\7\u025a\2\2\u07f5\u07f6\5\u0196\u00cc\2\u07f6\u07f8\3\2"+
		"\2\2\u07f7\u07f9\5\u0186\u00c4\2\u07f8\u07f7\3\2\2\2\u07f8\u07f9\3\2\2"+
		"\2\u07f9\u07fb\3\2\2\2\u07fa\u07fc\5\u018a\u00c6\2\u07fb\u07fa\3\2\2\2"+
		"\u07fb\u07fc\3\2\2\2\u07fc\u07fe\3\2\2\2\u07fd\u07ff\5\u018c\u00c7\2\u07fe"+
		"\u07fd\3\2\2\2\u07fe\u07ff\3\2\2\2\u07ff\u0801\3\2\2\2\u0800\u0802\5\u018e"+
		"\u00c8\2\u0801\u0800\3\2\2\2\u0801\u0802\3\2\2\2\u0802\u0804\3\2\2\2\u0803"+
		"\u07f2\3\2\2\2\u0803\u07f4\3\2\2\2\u0804\u0169\3\2\2\2\u0805\u080c\7\22"+
		"\2\2\u0806\u0809\7\u00b1\2\2\u0807\u0808\7\u016f\2\2\u0808\u080a\5\u0196"+
		"\u00cc\2\u0809\u0807\3\2\2\2\u0809\u080a\3\2\2\2\u080a\u080c\3\2\2\2\u080b"+
		"\u0805\3\2\2\2\u080b\u0806\3\2\2\2\u080b\u080c\3\2\2\2\u080c\u0825\3\2"+
		"\2\2\u080d\u0826\7\u02c3\2\2\u080e\u0813\5\u0192\u00ca\2\u080f\u0811\7"+
		"\35\2\2\u0810\u080f\3\2\2\2\u0810\u0811\3\2\2\2\u0811\u0812\3\2\2\2\u0812"+
		"\u0814\5\u01a0\u00d1\2\u0813\u0810\3\2\2\2\u0813\u0814\3\2\2\2\u0814\u0822"+
		"\3\2\2\2\u0815\u081e\7\u02be\2\2\u0816\u081f\7\u02c3\2\2\u0817\u081c\5"+
		"\u0192\u00ca\2\u0818\u081a\7\35\2\2\u0819\u0818\3\2\2\2\u0819\u081a\3"+
		"\2\2\2\u081a\u081b\3\2\2\2\u081b\u081d\5\u01a0\u00d1\2\u081c\u0819\3\2"+
		"\2\2\u081c\u081d\3\2\2\2\u081d\u081f\3\2\2\2\u081e\u0816\3\2\2\2\u081e"+
		"\u0817\3\2\2\2\u081f\u0821\3\2\2\2\u0820\u0815\3\2\2\2\u0821\u0824\3\2"+
		"\2\2\u0822\u0820\3\2\2\2\u0822\u0823\3\2\2\2\u0823\u0826\3\2\2\2\u0824"+
		"\u0822\3\2\2\2\u0825\u080d\3\2\2\2\u0825\u080e\3\2\2\2\u0825\u0826\3\2"+
		"\2\2\u0826\u016b\3\2\2\2\u0827\u0828\7\u00e0\2\2\u0828\u082d\5\u01b4\u00db"+
		"\2\u0829\u082a\7\u02be\2\2\u082a\u082c\5\u01b4\u00db\2\u082b\u0829\3\2"+
		"\2\2\u082c\u082f\3\2\2\2\u082d\u082b\3\2\2\2\u082d\u082e\3\2\2\2\u082e"+
		"\u016d\3\2\2\2\u082f\u082d\3\2\2\2\u0830\u0831\7\u0266\2\2\u0831\u0832"+
		"\5\u01bc\u00df\2\u0832\u016f\3\2\2\2\u0833\u0834\7\u00ed\2\2\u0834\u0835"+
		"\7\67\2\2\u0835\u083a\5\u0172\u00ba\2\u0836\u0837\7\u02be\2\2\u0837\u0839"+
		"\5\u0172\u00ba\2\u0838\u0836\3\2\2\2\u0839\u083c\3\2\2\2\u083a\u0838\3"+
		"\2\2\2\u083a\u083b\3\2\2\2\u083b\u0171\3\2\2\2\u083c\u083a\3\2\2\2\u083d"+
		"\u083e\7\u02c4\2\2\u083e\u0857\7\u02c5\2\2\u083f\u0857\5\u0192\u00ca\2"+
		"\u0840\u0857\5\u0196\u00cc\2\u0841\u0842\t\n\2\2\u0842\u0845\7\u02c4\2"+
		"\2\u0843\u0846\5\u0192\u00ca\2\u0844\u0846\5\u0196\u00cc\2\u0845\u0843"+
		"\3\2\2\2\u0845\u0844\3\2\2\2\u0846\u084e\3\2\2\2\u0847\u084a\7\u02be\2"+
		"\2\u0848\u084b\5\u0192\u00ca\2\u0849\u084b\5\u0196\u00cc\2\u084a\u0848"+
		"\3\2\2\2\u084a\u0849\3\2\2\2\u084b\u084d\3\2\2\2\u084c\u0847\3\2\2\2\u084d"+
		"\u0850\3\2\2\2\u084e\u084c\3\2\2\2\u084e\u084f\3\2\2\2\u084f\u0851\3\2"+
		"\2\2\u0850\u084e\3\2\2\2\u0851\u0852\7\u02c5\2\2\u0852\u0857\3\2\2\2\u0853"+
		"\u0854\7\u00ee\2\2\u0854\u0855\7\u01ee\2\2\u0855\u0857\5\u0174\u00bb\2"+
		"\u0856\u083d\3\2\2\2\u0856\u083f\3\2\2\2\u0856\u0840\3\2\2\2\u0856\u0841"+
		"\3\2\2\2\u0856\u0853\3\2\2\2\u0857\u0173\3\2\2\2\u0858\u0859\7\u02c4\2"+
		"\2\u0859\u085e\5\u0172\u00ba\2\u085a\u085b\7\u02be\2\2\u085b\u085d\5\u0172"+
		"\u00ba\2\u085c\u085a\3\2\2\2\u085d\u0860\3\2\2\2\u085e\u085c\3\2\2\2\u085e"+
		"\u085f\3\2\2\2\u085f\u0861\3\2\2\2\u0860\u085e\3\2\2\2\u0861\u0862\7\u02c5"+
		"\2\2\u0862\u0175\3\2\2\2\u0863\u0864\7\u00f0\2\2\u0864\u0869\5\u01bc\u00df"+
		"\2\u0865\u0866\7\u02be\2\2\u0866\u0868\5\u01bc\u00df\2\u0867\u0865\3\2"+
		"\2\2\u0868\u086b\3\2\2\2\u0869\u0867\3\2\2\2\u0869\u086a\3\2\2\2\u086a"+
		"\u0177\3\2\2\2\u086b\u0869\3\2\2\2\u086c\u086d\7\u0242\2\2\u086d\u0877"+
		"\7\u0199\2\2\u086e\u086f\7\u02cb\2\2\u086f\u0877\7\u0199\2\2\u0870\u0871"+
		"\7\u0083\2\2\u0871\u0877\7\u01d2\2\2\u0872\u0873\7\u02cb\2\2\u0873\u0877"+
		"\7\u00d7\2\2\u0874\u0875\7\u0242\2\2\u0875\u0877\7\u00d7\2\2\u0876\u086c"+
		"\3\2\2\2\u0876\u086e\3\2\2\2\u0876\u0870\3\2\2\2\u0876\u0872\3\2\2\2\u0876"+
		"\u0874\3\2\2\2\u0877\u0179\3\2\2\2\u0878\u0879\5\u0178\u00bd\2\u0879\u017b"+
		"\3\2\2\2\u087a\u087b\5\u0178\u00bd\2\u087b\u017d\3\2\2\2\u087c\u087d\t"+
		"\13\2\2\u087d\u0885\5\u017a\u00be\2\u087e\u087f\t\13\2\2\u087f\u0880\7"+
		"-\2\2\u0880\u0881\5\u017a\u00be\2\u0881\u0882\7\31\2\2\u0882\u0883\5\u017c"+
		"\u00bf\2\u0883\u0885\3\2\2\2\u0884\u087c\3\2\2\2\u0884\u087e\3\2\2\2\u0885"+
		"\u017f\3\2\2\2\u0886\u0893\5\u01d0\u00e9\2\u0887\u0888\7\u018d\2\2\u0888"+
		"\u0889\7\67\2\2\u0889\u088e\5\u0192\u00ca\2\u088a\u088b\7\u02be\2\2\u088b"+
		"\u088d\5\u0192\u00ca\2\u088c\u088a\3\2\2\2\u088d\u0890\3\2\2\2\u088e\u088c"+
		"\3\2\2\2\u088e\u088f\3\2\2\2\u088f\u0893\3\2\2\2\u0890\u088e\3\2\2\2\u0891"+
		"\u0893\5\u0186\u00c4\2\u0892\u0886\3\2\2\2\u0892\u0887\3\2\2\2\u0892\u0891"+
		"\3\2\2\2\u0893\u0181\3\2\2\2\u0894\u0895\7\u0268\2\2\u0895\u0896\5\u01d0"+
		"\u00e9\2\u0896\u0897\7\35\2\2\u0897\u0898\7\u02c4\2\2\u0898\u0899\5\u0180"+
		"\u00c1\2\u0899\u089a\7\u02c5\2\2\u089a\u0183\3\2\2\2\u089b\u089d\t\f\2"+
		"\2\u089c\u089e\t\r\2\2\u089d\u089c\3\2\2\2\u089d\u089e\3\2\2\2\u089e\u089f"+
		"\3\2\2\2\u089f\u08a0\5\u0152\u00aa\2\u08a0\u0185\3\2\2\2\u08a1\u08a2\7"+
		"\u0177\2\2\u08a2\u08a3\7\67\2\2\u08a3\u08a8\5\u0188\u00c5\2\u08a4\u08a5"+
		"\7\u02be\2\2\u08a5\u08a7\5\u0188\u00c5\2\u08a6\u08a4\3\2\2\2\u08a7\u08aa"+
		"\3\2\2\2\u08a8\u08a6\3\2\2\2\u08a8\u08a9\3\2\2\2\u08a9\u0187\3\2\2\2\u08aa"+
		"\u08a8\3\2\2\2\u08ab\u08ae\5\u0192\u00ca\2\u08ac\u08ae\7\u02cf\2\2\u08ad"+
		"\u08ab\3\2\2\2\u08ad\u08ac\3\2\2\2\u08ae\u08b3\3\2\2\2\u08af\u08b4\7\36"+
		"\2\2\u08b0\u08b4\7\u00a7\2\2\u08b1\u08b2\7\u0255\2\2\u08b2\u08b4\5\u0192"+
		"\u00ca\2\u08b3\u08af\3\2\2\2\u08b3\u08b0\3\2\2\2\u08b3\u08b1\3\2\2\2\u08b3"+
		"\u08b4\3\2\2\2\u08b4\u08c0\3\2\2\2\u08b5\u08b6\7\u0164\2\2\u08b6\u08b7"+
		"\t\16\2\2\u08b7\u08bd\3\2\2\2\u08b8\u08b9\7\u02be\2\2\u08b9\u08ba\7\u0164"+
		"\2\2\u08ba\u08bc\t\16\2\2\u08bb\u08b8\3\2\2\2\u08bc\u08bf\3\2\2\2\u08bd"+
		"\u08bb\3\2\2\2\u08bd\u08be\3\2\2\2\u08be\u08c1\3\2\2\2\u08bf\u08bd\3\2"+
		"\2\2\u08c0\u08b5\3\2\2\2\u08c0\u08c1\3\2\2\2\u08c1\u0189\3\2\2\2\u08c2"+
		"\u08c3\7\u0128\2\2\u08c3\u08c4\t\17\2\2\u08c4\u018b\3\2\2\2\u08c5\u08c6"+
		"\7\u016c\2\2\u08c6\u08c8\7\u02cb\2\2\u08c7\u08c9\t\20\2\2\u08c8\u08c7"+
		"\3\2\2\2\u08c8\u08c9\3\2\2\2\u08c9\u018d\3\2\2\2\u08ca\u08cb\7\u00d1\2"+
		"\2\u08cb\u08cd\t\21\2\2\u08cc\u08ce\7\u02cb\2\2\u08cd\u08cc\3\2\2\2\u08cd"+
		"\u08ce\3\2\2\2\u08ce\u08cf\3\2\2\2\u08cf\u08d0\t\20\2\2\u08d0\u08d1\7"+
		"\u0170\2\2\u08d1\u018f\3\2\2\2\u08d2\u08da\7\u00d8\2\2\u08d3\u08db\7\u024d"+
		"\2\2\u08d4\u08d5\7\u0156\2\2\u08d5\u08d6\7\u011a\2\2\u08d6\u08db\7\u024d"+
		"\2\2\u08d7\u08db\7\u01ef\2\2\u08d8\u08d9\7\u011a\2\2\u08d9\u08db\7\u01ef"+
		"\2\2\u08da\u08d3\3\2\2\2\u08da\u08d4\3\2\2\2\u08da\u08d7\3\2\2\2\u08da"+
		"\u08d8\3\2\2\2\u08db\u08e5\3\2\2\2\u08dc\u08dd\7\u016a\2\2\u08dd\u08e2"+
		"\5\u01a6\u00d4\2\u08de\u08df\7\u02be\2\2\u08df\u08e1\5\u01a6\u00d4\2\u08e0"+
		"\u08de\3\2\2\2\u08e1\u08e4\3\2\2\2\u08e2\u08e0\3\2\2\2\u08e2\u08e3\3\2"+
		"\2\2\u08e3\u08e6\3\2\2\2\u08e4\u08e2\3\2\2\2\u08e5\u08dc\3\2\2\2\u08e5"+
		"\u08e6\3\2\2\2\u08e6\u08ec";
	private static final String _serializedATNSegment1 =
		"\3\2\2\2\u08e7\u08eb\7\u0160\2\2\u08e8\u08e9\7\u01f4\2\2\u08e9\u08eb\7"+
		"\u0132\2\2\u08ea\u08e7\3\2\2\2\u08ea\u08e8\3\2\2\2\u08eb\u08ee\3\2\2\2"+
		"\u08ec\u08ea\3\2\2\2\u08ec\u08ed\3\2\2\2\u08ed\u0191\3\2\2\2\u08ee\u08ec"+
		"\3\2\2\2\u08ef\u08f0\b\u00ca\1\2\u08f0\u093e\7\u0161\2\2\u08f1\u093e\7"+
		"\u0084\2\2\u08f2\u093e\7\u0087\2\2\u08f3\u093e\7\u0088\2\2\u08f4\u093e"+
		"\7\u0089\2\2\u08f5\u093e\7\u008b\2\2\u08f6\u093e\7\u02cb\2\2\u08f7\u093e"+
		"\7\u02cc\2\2\u08f8\u093e\7\u02ca\2\2\u08f9\u093e\7\u02ce\2\2\u08fa\u093e"+
		"\7\u02cf\2\2\u08fb\u093e\7\u02c8\2\2\u08fc\u093e\7\u02c9\2\2\u08fd\u08ff"+
		"\7\u02c2\2\2\u08fe\u0900\n\22\2\2\u08ff\u08fe\3\2\2\2\u0900\u0901\3\2"+
		"\2\2\u0901\u08ff\3\2\2\2\u0901\u0902\3\2\2\2\u0902\u0903\3\2\2\2\u0903"+
		"\u093e\7\u02c2\2\2\u0904\u0905\7\u02c1\2\2\u0905\u0907\5\u01c0\u00e1\2"+
		"\u0906\u0908\n\22\2\2\u0907\u0906\3\2\2\2\u0908\u0909\3\2\2\2\u0909\u0907"+
		"\3\2\2\2\u0909\u090a\3\2\2\2\u090a\u090b\3\2\2\2\u090b\u090c\7\u02c1\2"+
		"\2\u090c\u090d\5\u01c0\u00e1\2\u090d\u090e\7\u02c1\2\2\u090e\u093e\3\2"+
		"\2\2\u090f\u093e\5\u0194\u00cb\2\u0910\u093e\5\u0168\u00b5\2\u0911\u093e"+
		"\5\u0196\u00cc\2\u0912\u0913\7\u02c4\2\2\u0913\u0914\5\u0192\u00ca\2\u0914"+
		"\u0915\7\u02c5\2\2\u0915\u093e\3\2\2\2\u0916\u0917\5\u019a\u00ce\2\u0917"+
		"\u0918\7\u02ce\2\2\u0918\u093e\3\2\2\2\u0919\u091a\t\23\2\2\u091a\u093e"+
		"\5\u0192\u00ca\33\u091b\u091c\t\24\2\2\u091c\u093e\5\u0192\u00ca\32\u091d"+
		"\u091e\t\25\2\2\u091e\u093e\5\u0192\u00ca\16\u091f\u093e\5\u01b0\u00d9"+
		"\2\u0920\u093e\5\u01c0\u00e1\2\u0921\u0922\7@\2\2\u0922\u0923\7\u02c4"+
		"\2\2\u0923\u0924\5\u0192\u00ca\2\u0924\u0925\7\35\2\2\u0925\u0926\5\u01a8"+
		"\u00d5\2\u0926\u0927\7\u02c5\2\2\u0927\u093e\3\2\2\2\u0928\u0929\5\u01c6"+
		"\u00e4\2\u0929\u092a\7\u02cd\2\2\u092a\u092b\5\u01c8\u00e5\2\u092b\u093e"+
		"\3\2\2\2\u092c\u092d\7?\2\2\u092d\u092e\7\u0264\2\2\u092e\u092f\5\u01bc"+
		"\u00df\2\u092f\u0930\7\u0223\2\2\u0930\u0933\5\u0192\u00ca\2\u0931\u0932"+
		"\7\u00bb\2\2\u0932\u0934\5\u0192\u00ca\2\u0933\u0931\3\2\2\2\u0933\u0934"+
		"\3\2\2\2\u0934\u0935\3\2\2\2\u0935\u0936\7\u00be\2\2\u0936\u093e\3\2\2"+
		"\2\u0937\u093e\5\u019e\u00d0\2\u0938\u093e\5\u01b2\u00da\2\u0939\u093a"+
		"\7\u02c4\2\2\u093a\u093b\5\u0152\u00aa\2\u093b\u093c\7\u02c5\2\2\u093c"+
		"\u093e\3\2\2\2\u093d\u08ef\3\2\2\2\u093d\u08f1\3\2\2\2\u093d\u08f2\3\2"+
		"\2\2\u093d\u08f3\3\2\2\2\u093d\u08f4\3\2\2\2\u093d\u08f5\3\2\2\2\u093d"+
		"\u08f6\3\2\2\2\u093d\u08f7\3\2\2\2\u093d\u08f8\3\2\2\2\u093d\u08f9\3\2"+
		"\2\2\u093d\u08fa\3\2\2\2\u093d\u08fb\3\2\2\2\u093d\u08fc\3\2\2\2\u093d"+
		"\u08fd\3\2\2\2\u093d\u0904\3\2\2\2\u093d\u090f\3\2\2\2\u093d\u0910\3\2"+
		"\2\2\u093d\u0911\3\2\2\2\u093d\u0912\3\2\2\2\u093d\u0916\3\2\2\2\u093d"+
		"\u0919\3\2\2\2\u093d\u091b\3\2\2\2\u093d\u091d\3\2\2\2\u093d\u091f\3\2"+
		"\2\2\u093d\u0920\3\2\2\2\u093d\u0921\3\2\2\2\u093d\u0928\3\2\2\2\u093d"+
		"\u092c\3\2\2\2\u093d\u0937\3\2\2\2\u093d\u0938\3\2\2\2\u093d\u0939\3\2"+
		"\2\2\u093e\u0981\3\2\2\2\u093f\u0940\f\30\2\2\u0940\u0941\t\26\2\2\u0941"+
		"\u0980\5\u0192\u00ca\31\u0942\u0943\f\27\2\2\u0943\u0944\t\27\2\2\u0944"+
		"\u0980\5\u0192\u00ca\30\u0945\u0946\f\26\2\2\u0946\u0947\t\30\2\2\u0947"+
		"\u0980\5\u0192\u00ca\27\u0948\u0949\f\25\2\2\u0949\u094a\t\31\2\2\u094a"+
		"\u0980\5\u0192\u00ca\26\u094b\u094d\f\24\2\2\u094c\u094e\7\u015c\2\2\u094d"+
		"\u094c\3\2\2\2\u094d\u094e\3\2\2\2\u094e\u094f\3\2\2\2\u094f\u0950\7\u0127"+
		"\2\2\u0950\u0980\5\u0192\u00ca\25\u0951\u0953\f\23\2\2\u0952\u0954\7\u015c"+
		"\2\2\u0953\u0952\3\2\2\2\u0953\u0954\3\2\2\2\u0954\u0955\3\2\2\2\u0955"+
		"\u0956\7-\2\2\u0956\u0957\5\u0192\u00ca\2\u0957\u0958\7\31\2\2\u0958\u0959"+
		"\5\u0192\u00ca\24\u0959\u0980\3\2\2\2\u095a\u095b\f\22\2\2\u095b\u095c"+
		"\7\u00fc\2\2\u095c\u0980\5\u0192\u00ca\23\u095d\u095e\f\21\2\2\u095e\u095f"+
		"\t\32\2\2\u095f\u0980\5\u0192\u00ca\22\u0960\u0961\f\36\2\2\u0961\u0962"+
		"\7\u02c6\2\2\u0962\u0963\5\u0192\u00ca\2\u0963\u0964\7\u02c7\2\2\u0964"+
		"\u0980\3\2\2\2\u0965\u0966\f\31\2\2\u0966\u0980\7\u02d7\2\2\u0967\u0968"+
		"\f\20\2\2\u0968\u096b\7\u0114\2\2\u0969\u096c\5\u0194\u00cb\2\u096a\u096c"+
		"\7\u0161\2\2\u096b\u0969\3\2\2\2\u096b\u096a\3\2\2\2\u096c\u0980\3\2\2"+
		"\2\u096d\u096e\f\17\2\2\u096e\u0980\t\33\2\2\u096f\u0970\f\b\2\2\u0970"+
		"\u0971\7\u02c6\2\2\u0971\u0972\5\u0192\u00ca\2\u0972\u0973\7\u02bf\2\2"+
		"\u0973\u0974\5\u0192\u00ca\2\u0974\u0975\7\u02c7\2\2\u0975\u0980\3\2\2"+
		"\2\u0976\u0977\f\7\2\2\u0977\u0978\7\u02c0\2\2\u0978\u0980\5\u01a8\u00d5"+
		"\2\u0979\u097a\f\6\2\2\u097a\u097d\7\u02cd\2\2\u097b\u097e\5\u01c0\u00e1"+
		"\2\u097c\u097e\7\u02c3\2\2\u097d\u097b\3\2\2\2\u097d\u097c\3\2\2\2\u097e"+
		"\u0980\3\2\2\2\u097f\u093f\3\2\2\2\u097f\u0942\3\2\2\2\u097f\u0945\3\2"+
		"\2\2\u097f\u0948\3\2\2\2\u097f\u094b\3\2\2\2\u097f\u0951\3\2\2\2\u097f"+
		"\u095a\3\2\2\2\u097f\u095d\3\2\2\2\u097f\u0960\3\2\2\2\u097f\u0965\3\2"+
		"\2\2\u097f\u0967\3\2\2\2\u097f\u096d\3\2\2\2\u097f\u096f\3\2\2\2\u097f"+
		"\u0976\3\2\2\2\u097f\u0979\3\2\2\2\u0980\u0983\3\2\2\2\u0981\u097f\3\2"+
		"\2\2\u0981\u0982\3\2\2\2\u0982\u0193\3\2\2\2\u0983\u0981\3\2\2\2\u0984"+
		"\u0985\b\u00cb\1\2\u0985\u098a\7\u023d\2\2\u0986\u098a\7\u00d0\2\2\u0987"+
		"\u0988\7\u015c\2\2\u0988\u098a\5\u0194\u00cb\5\u0989\u0984\3\2\2\2\u0989"+
		"\u0986\3\2\2\2\u0989\u0987\3\2\2\2\u098a\u0993\3\2\2\2\u098b\u098c\f\4"+
		"\2\2\u098c\u098d\7\31\2\2\u098d\u0992\5\u0194\u00cb\5\u098e\u098f\f\3"+
		"\2\2\u098f\u0990\7\u0176\2\2\u0990\u0992\5\u0194\u00cb\4\u0991\u098b\3"+
		"\2\2\2\u0991\u098e\3\2\2\2\u0992\u0995\3\2\2\2\u0993\u0991\3\2\2\2\u0993"+
		"\u0994\3\2\2\2\u0994\u0195\3\2\2\2\u0995\u0993\3\2\2\2\u0996\u0997\7\u02c4"+
		"\2\2\u0997\u099c\5\u0192\u00ca\2\u0998\u0999\7\u02be\2\2\u0999\u099b\5"+
		"\u0192\u00ca\2\u099a\u0998\3\2\2\2\u099b\u099e\3\2\2\2\u099c\u099a\3\2"+
		"\2\2\u099c\u099d\3\2\2\2\u099d\u099f\3\2\2\2\u099e\u099c\3\2\2\2\u099f"+
		"\u09a0\7\u02c5\2\2\u09a0\u0197\3\2\2\2\u09a1\u09a2\7\u02c4\2\2\u09a2\u09a7"+
		"\5\u0196\u00cc\2\u09a3\u09a4\7\u02be\2\2\u09a4\u09a6\5\u0196\u00cc\2\u09a5"+
		"\u09a3\3\2\2\2\u09a6\u09a9\3\2\2\2\u09a7\u09a5\3\2\2\2\u09a7\u09a8\3\2"+
		"\2\2\u09a8\u09aa\3\2\2\2\u09a9\u09a7\3\2\2\2\u09aa\u09ab\7\u02c5\2\2\u09ab"+
		"\u0199\3\2\2\2\u09ac\u09d9\7\u02b0\2\2\u09ad\u09d9\7\u02b1\2\2\u09ae\u09d9"+
		"\7\u02b2\2\2\u09af\u09d9\7\u0091\2\2\u09b0\u09d9\7\u02b3\2\2\u09b1\u09d9"+
		"\7\u02b4\2\2\u09b2\u09d9\7\u0111\2\2\u09b3\u09d9\7\u02b8\2\2\u09b4\u09d9"+
		"\7\u02b9\2\2\u09b5\u09d9\7\u02ba\2\2\u09b6\u09d9\7\u02bb\2\2\u09b7\u09d9"+
		"\7\u014d\2\2\u09b8\u09d9\7\u02bd\2\2\u09b9\u09bd\7\u0227\2\2\u09ba\u09bb"+
		"\t\34\2\2\u09bb\u09bc\7\u0225\2\2\u09bc\u09be\7\u026f\2\2\u09bd\u09ba"+
		"\3\2\2\2\u09bd\u09be\3\2\2\2\u09be\u09d9\3\2\2\2\u09bf\u09c3\7\u0227\2"+
		"\2\u09c0\u09c1\7\u026b\2\2\u09c1\u09c2\7\u0225\2\2\u09c2\u09c4\7\u026f"+
		"\2\2\u09c3\u09c0\3\2\2\2\u09c3\u09c4\3\2\2\2\u09c4\u09d9\3\2\2\2\u09c5"+
		"\u09d9\7\u0228\2\2\u09c6\u09ca\7\u0225\2\2\u09c7\u09c8\7\u0269\2\2\u09c8"+
		"\u09c9\7\u0225\2\2\u09c9\u09cb\7\u026f\2\2\u09ca\u09c7\3\2\2\2\u09ca\u09cb"+
		"\3\2\2\2\u09cb\u09d9\3\2\2\2\u09cc\u09d0\7\u0225\2\2\u09cd\u09ce\7\u026b"+
		"\2\2\u09ce\u09cf\7\u0225\2\2\u09cf\u09d1\7\u026f\2\2\u09d0\u09cd\3\2\2"+
		"\2\u09d0\u09d1\3\2\2\2\u09d1\u09d9\3\2\2\2\u09d2\u09d9\7\u0226\2\2\u09d3"+
		"\u09d9\7\u02b5\2\2\u09d4\u09d9\7\u02b6\2\2\u09d5\u09d9\7\u02b7\2\2\u09d6"+
		"\u09d9\7\u0111\2\2\u09d7\u09d9\7\u02bc\2\2\u09d8\u09ac\3\2\2\2\u09d8\u09ad"+
		"\3\2\2\2\u09d8\u09ae\3\2\2\2\u09d8\u09af\3\2\2\2\u09d8\u09b0\3\2\2\2\u09d8"+
		"\u09b1\3\2\2\2\u09d8\u09b2\3\2\2\2\u09d8\u09b3\3\2\2\2\u09d8\u09b4\3\2"+
		"\2\2\u09d8\u09b5\3\2\2\2\u09d8\u09b6\3\2\2\2\u09d8\u09b7\3\2\2\2\u09d8"+
		"\u09b8\3\2\2\2\u09d8\u09b9\3\2\2\2\u09d8\u09bf\3\2\2\2\u09d8\u09c5\3\2"+
		"\2\2\u09d8\u09c6\3\2\2\2\u09d8\u09cc\3\2\2\2\u09d8\u09d2\3\2\2\2\u09d8"+
		"\u09d3\3\2\2\2\u09d8\u09d4\3\2\2\2\u09d8\u09d5\3\2\2\2\u09d8\u09d6\3\2"+
		"\2\2\u09d8\u09d7\3\2\2\2\u09d9\u019b\3\2\2\2\u09da\u09e4\3\2\2\2\u09db"+
		"\u09dc\7\u0114\2\2\u09dc\u09e4\7\u016a\2\2\u09dd\u09e4\7\u0091\2\2\u09de"+
		"\u09e4\7\u0111\2\2\u09df\u09e0\7\u00b4\2\2\u09e0\u09e4\7\u019a\2\2\u09e1"+
		"\u09e4\7\u00fc\2\2\u09e2\u09e4\7\22\2\2\u09e3\u09da\3\2\2\2\u09e3\u09db"+
		"\3\2\2\2\u09e3\u09dd\3\2\2\2\u09e3\u09de\3\2\2\2\u09e3\u09df\3\2\2\2\u09e3"+
		"\u09e1\3\2\2\2\u09e3\u09e2\3\2\2\2\u09e4\u019d\3\2\2\2\u09e5\u09e6\5\u01c0"+
		"\u00e1\2\u09e6\u09e8\7\u02c4\2\2\u09e7\u09e9\t\r\2\2\u09e8\u09e7\3\2\2"+
		"\2\u09e8\u09e9\3\2\2\2\u09e9\u09ea\3\2\2\2\u09ea\u09ef\5\u0192\u00ca\2"+
		"\u09eb\u09ec\7\u02be\2\2\u09ec\u09ee\5\u0192\u00ca\2\u09ed\u09eb\3\2\2"+
		"\2\u09ee\u09f1\3\2\2\2\u09ef\u09ed\3\2\2\2\u09ef\u09f0\3\2\2\2\u09f0\u09f3"+
		"\3\2\2\2\u09f1\u09ef\3\2\2\2\u09f2\u09f4\5\u0186\u00c4\2\u09f3\u09f2\3"+
		"\2\2\2\u09f3\u09f4\3\2\2\2\u09f4\u09f5\3\2\2\2\u09f5\u09fc\7\u02c5\2\2"+
		"\u09f6\u09f7\7\u00d2\2\2\u09f7\u09f8\7\u02c4\2\2\u09f8\u09f9\7\u0266\2"+
		"\2\u09f9\u09fa\5\u016e\u00b8\2\u09fa\u09fb\7\u02c5\2\2\u09fb\u09fd\3\2"+
		"\2\2\u09fc\u09f6\3\2\2\2\u09fc\u09fd\3\2\2\2\u09fd\u0a25\3\2\2\2\u09fe"+
		"\u09ff\5\u01c0\u00e1\2\u09ff\u0a00\7\u02c4\2\2\u0a00\u0a01\7\u02c3\2\2"+
		"\u0a01\u0a08\7\u02c5\2\2\u0a02\u0a03\7\u00d2\2\2\u0a03\u0a04\7\u02c4\2"+
		"\2\u0a04\u0a05\7\u0266\2\2\u0a05\u0a06\5\u016e\u00b8\2\u0a06\u0a07\7\u02c5"+
		"\2\2\u0a07\u0a09\3\2\2\2\u0a08\u0a02\3\2\2\2\u0a08\u0a09\3\2\2\2\u0a09"+
		"\u0a25\3\2\2\2\u0a0a\u0a0b\5\u01c0\u00e1\2\u0a0b\u0a14\7\u02c4\2\2\u0a0c"+
		"\u0a11\5\u0192\u00ca\2\u0a0d\u0a0e\7\u02be\2\2\u0a0e\u0a10\5\u0192\u00ca"+
		"\2\u0a0f\u0a0d\3\2\2\2\u0a10\u0a13\3\2\2\2\u0a11\u0a0f\3\2\2\2\u0a11\u0a12"+
		"\3\2\2\2\u0a12\u0a15\3\2\2\2\u0a13\u0a11\3\2\2\2\u0a14\u0a0c\3\2\2\2\u0a14"+
		"\u0a15\3\2\2\2\u0a15\u0a16\3\2\2\2\u0a16\u0a17\7\u02c5\2\2\u0a17\u0a18"+
		"\7\u026a\2\2\u0a18\u0a19\7\u00ed\2\2\u0a19\u0a1a\7\u02c4\2\2\u0a1a\u0a1b"+
		"\5\u0186\u00c4\2\u0a1b\u0a22\7\u02c5\2\2\u0a1c\u0a1d\7\u00d2\2\2\u0a1d"+
		"\u0a1e\7\u02c4\2\2\u0a1e\u0a1f\7\u0266\2\2\u0a1f\u0a20\5\u016e\u00b8\2"+
		"\u0a20\u0a21\7\u02c5\2\2\u0a21\u0a23\3\2\2\2\u0a22\u0a1c\3\2\2\2\u0a22"+
		"\u0a23\3\2\2\2\u0a23\u0a25\3\2\2\2\u0a24\u09e5\3\2\2\2\u0a24\u09fe\3\2"+
		"\2\2\u0a24\u0a0a\3\2\2\2\u0a25\u019f\3\2\2\2\u0a26\u0a2a\7\u02ce\2\2\u0a27"+
		"\u0a2a\7\u02cf\2\2\u0a28\u0a2a\5\u01c0\u00e1\2\u0a29\u0a26\3\2\2\2\u0a29"+
		"\u0a27\3\2\2\2\u0a29\u0a28\3\2\2\2\u0a2a\u01a1\3\2\2\2\u0a2b\u0a30\5\u01a0"+
		"\u00d1\2\u0a2c\u0a2d\7\u02be\2\2\u0a2d\u0a2f\5\u01a0\u00d1\2\u0a2e\u0a2c"+
		"\3\2\2\2\u0a2f\u0a32\3\2\2\2\u0a30\u0a2e\3\2\2\2\u0a30\u0a31\3\2\2\2\u0a31"+
		"\u01a3\3\2\2\2\u0a32\u0a30\3\2\2\2\u0a33\u0a38\5\u01c0\u00e1\2\u0a34\u0a35"+
		"\7\u02be\2\2\u0a35\u0a37\5\u01c0\u00e1\2\u0a36\u0a34\3\2\2\2\u0a37\u0a3a"+
		"\3\2\2\2\u0a38\u0a36\3\2\2\2\u0a38\u0a39\3\2\2\2\u0a39\u01a5\3\2\2\2\u0a3a"+
		"\u0a38\3\2\2\2\u0a3b\u0a3c\5\u01c0\u00e1\2\u0a3c\u01a7\3\2\2\2\u0a3d\u0a3e"+
		"\b\u00d5\1\2\u0a3e\u0a54\5\u019a\u00ce\2\u0a3f\u0a40\7\u025b\2\2\u0a40"+
		"\u0a42\7\u02c4\2\2\u0a41\u0a43\7\u02cb\2\2\u0a42\u0a41\3\2\2\2\u0a42\u0a43"+
		"\3\2\2\2\u0a43\u0a44\3\2\2\2\u0a44\u0a54\7\u02c5\2\2\u0a45\u0a46\7\u0166"+
		"\2\2\u0a46\u0a4f\7\u02c4\2\2\u0a47\u0a4c\5\u0192\u00ca\2\u0a48\u0a49\7"+
		"\u02be\2\2\u0a49\u0a4b\5\u0192\u00ca\2\u0a4a\u0a48\3\2\2\2\u0a4b\u0a4e"+
		"\3\2\2\2\u0a4c\u0a4a\3\2\2\2\u0a4c\u0a4d\3\2\2\2\u0a4d\u0a50\3\2\2\2\u0a4e"+
		"\u0a4c\3\2\2\2\u0a4f\u0a47\3\2\2\2\u0a4f\u0a50\3\2\2\2\u0a50\u0a51\3\2"+
		"\2\2\u0a51\u0a54\7\u02c5\2\2\u0a52\u0a54\5\u01c0\u00e1\2\u0a53\u0a3d\3"+
		"\2\2\2\u0a53\u0a3f\3\2\2\2\u0a53\u0a45\3\2\2\2\u0a53\u0a52\3\2\2\2\u0a54"+
		"\u0a5d\3\2\2\2\u0a55\u0a56\f\3\2\2\u0a56\u0a58\7\u02c6\2\2\u0a57\u0a59"+
		"\7\u02cb\2\2\u0a58\u0a57\3\2\2\2\u0a58\u0a59\3\2\2\2\u0a59\u0a5a\3\2\2"+
		"\2\u0a5a\u0a5c\7\u02c7\2\2\u0a5b\u0a55\3\2\2\2\u0a5c\u0a5f\3\2\2\2\u0a5d"+
		"\u0a5b\3\2\2\2\u0a5d\u0a5e\3\2\2\2\u0a5e\u01a9\3\2\2\2\u0a5f\u0a5d\3\2"+
		"\2\2\u0a60\u0a65\5\u01a8\u00d5\2\u0a61\u0a62\7\u02be\2\2\u0a62\u0a64\5"+
		"\u01a8\u00d5\2\u0a63\u0a61\3\2\2\2\u0a64\u0a67\3\2\2\2\u0a65\u0a63\3\2"+
		"\2\2\u0a65\u0a66\3\2\2\2\u0a66\u01ab\3\2\2\2\u0a67\u0a65\3\2\2\2\u0a68"+
		"\u0a69\t\35\2\2\u0a69\u01ad\3\2\2\2\u0a6a\u0a6d\5\u01a8\u00d5\2\u0a6b"+
		"\u0a6d\5\u01c0\u00e1\2\u0a6c\u0a6a\3\2\2\2\u0a6c\u0a6b\3\2\2\2\u0a6d\u01af"+
		"\3\2\2\2\u0a6e\u0a6f\5\u01ae\u00d8\2\u0a6f\u0a70\7\u02c4\2\2\u0a70\u0a71"+
		"\7\u025d\2\2\u0a71\u0a72\5\u0192\u00ca\2\u0a72\u0a73\7\u02c5\2\2\u0a73"+
		"\u0a8f\3\2\2\2\u0a74\u0a75\5\u01ae\u00d8\2\u0a75\u0a83\7\u02c4\2\2\u0a76"+
		"\u0a7b\5\u0192\u00ca\2\u0a77\u0a78\7\u02be\2\2\u0a78\u0a7a\5\u0192\u00ca"+
		"\2\u0a79\u0a77\3\2\2\2\u0a7a\u0a7d\3\2\2\2\u0a7b\u0a79\3\2\2\2\u0a7b\u0a7c"+
		"\3\2\2\2\u0a7c\u0a81\3\2\2\2\u0a7d\u0a7b\3\2\2\2\u0a7e\u0a7f\7\u02be\2"+
		"\2\u0a7f\u0a80\7\u025d\2\2\u0a80\u0a82\5\u0192\u00ca\2\u0a81\u0a7e\3\2"+
		"\2\2\u0a81\u0a82\3\2\2\2\u0a82\u0a84\3\2\2\2\u0a83\u0a76\3\2\2\2\u0a83"+
		"\u0a84\3\2\2\2\u0a84\u0a85\3\2\2\2\u0a85\u0a86\7\u02c5\2\2\u0a86\u0a8f"+
		"\3\2\2\2\u0a87\u0a88\5\u01ae\u00d8\2\u0a88\u0a89\7\u02c4\2\2\u0a89\u0a8a"+
		"\5\u01c2\u00e2\2\u0a8a\u0a8b\7\u00e0\2\2\u0a8b\u0a8c\5\u0192\u00ca\2\u0a8c"+
		"\u0a8d\7\u02c5\2\2\u0a8d\u0a8f\3\2\2\2\u0a8e\u0a6e\3\2\2\2\u0a8e\u0a74"+
		"\3\2\2\2\u0a8e\u0a87\3\2\2\2\u0a8f\u01b1\3\2\2\2\u0a90\u0a91\7\34\2\2"+
		"\u0a91\u0a9a\7\u02c6\2\2\u0a92\u0a97\5\u0192\u00ca\2\u0a93\u0a94\7\u02be"+
		"\2\2\u0a94\u0a96\5\u0192\u00ca\2\u0a95\u0a93\3\2\2\2\u0a96\u0a99\3\2\2"+
		"\2\u0a97\u0a95\3\2\2\2\u0a97\u0a98\3\2\2\2\u0a98\u0a9b\3\2\2\2\u0a99\u0a97"+
		"\3\2\2\2\u0a9a\u0a92\3\2\2\2\u0a9a\u0a9b\3\2\2\2\u0a9b\u0a9c\3\2\2\2\u0a9c"+
		"\u0a9d\7\u02c7\2\2\u0a9d\u01b3\3\2\2\2\u0a9e\u0aa0\b\u00db\1\2\u0a9f\u0aa1"+
		"\7\u0170\2\2\u0aa0\u0a9f\3\2\2\2\u0aa0\u0aa1\3\2\2\2\u0aa1\u0aa2\3\2\2"+
		"\2\u0aa2\u0aa4\5\u01a6\u00d4\2\u0aa3\u0aa5\7\u02c3\2\2\u0aa4\u0aa3\3\2"+
		"\2\2\u0aa4\u0aa5\3\2\2\2\u0aa5\u0aa7\3\2\2\2\u0aa6\u0aa8\5\u01b6\u00dc"+
		"\2\u0aa7\u0aa6\3\2\2\2\u0aa7\u0aa8\3\2\2\2\u0aa8\u0abc\3\2\2\2\u0aa9\u0aaa"+
		"\7\u021b\2\2\u0aaa\u0aab\5\u01c2\u00e2\2\u0aab\u0aac\7\u02c4\2\2\u0aac"+
		"\u0ab1\5\u0192\u00ca\2\u0aad\u0aae\7\u02be\2\2\u0aae\u0ab0\5\u0192\u00ca"+
		"\2\u0aaf\u0aad\3\2\2\2\u0ab0\u0ab3\3\2\2\2\u0ab1\u0aaf\3\2\2\2\u0ab1\u0ab2"+
		"\3\2\2\2\u0ab2\u0ab4\3\2\2\2\u0ab3\u0ab1\3\2\2\2\u0ab4\u0aba\7\u02c5\2"+
		"\2\u0ab5\u0ab6\7\u01bd\2\2\u0ab6\u0ab7\7\u02c4\2\2\u0ab7\u0ab8\5\u01c2"+
		"\u00e2\2\u0ab8\u0ab9\7\u02c5\2\2\u0ab9\u0abb\3\2\2\2\u0aba\u0ab5\3\2\2"+
		"\2\u0aba\u0abb\3\2\2\2\u0abb\u0abd\3\2\2\2\u0abc\u0aa9\3\2\2\2\u0abc\u0abd"+
		"\3\2\2\2\u0abd\u0b09\3\2\2\2\u0abe\u0ac0\7\u0121\2\2\u0abf\u0abe\3\2\2"+
		"\2\u0abf\u0ac0\3\2\2\2\u0ac0\u0ac1\3\2\2\2\u0ac1\u0ac2\7\u02c4\2\2\u0ac2"+
		"\u0ac3\5\2\2\2\u0ac3\u0ac5\7\u02c5\2\2\u0ac4\u0ac6\7\35\2\2\u0ac5\u0ac4"+
		"\3\2\2\2\u0ac5\u0ac6\3\2\2\2\u0ac6\u0ac7\3\2\2\2\u0ac7\u0ad3\5\u01ca\u00e6"+
		"\2\u0ac8\u0ac9\7\u02c4\2\2\u0ac9\u0ace\5\u01cc\u00e7\2\u0aca\u0acb\7\u02be"+
		"\2\2\u0acb\u0acd\5\u01cc\u00e7\2\u0acc\u0aca\3\2\2\2\u0acd\u0ad0\3\2\2"+
		"\2\u0ace\u0acc\3\2\2\2\u0ace\u0acf\3\2\2\2\u0acf\u0ad1\3\2\2\2\u0ad0\u0ace"+
		"\3\2\2\2\u0ad1\u0ad2\7\u02c5\2\2\u0ad2\u0ad4\3\2\2\2\u0ad3\u0ac8\3\2\2"+
		"\2\u0ad3\u0ad4\3\2\2\2\u0ad4\u0b09\3\2\2\2\u0ad5\u0ad7\7\u0121\2\2\u0ad6"+
		"\u0ad5\3\2\2\2\u0ad6\u0ad7\3\2\2\2\u0ad7\u0ad8\3\2\2\2\u0ad8\u0adb\5\u01b0"+
		"\u00d9\2\u0ad9\u0ada\7\u0269\2\2\u0ada\u0adc\7\u0179\2\2\u0adb\u0ad9\3"+
		"\2\2\2\u0adb\u0adc\3\2\2\2\u0adc\u0ade\3\2\2\2\u0add\u0adf\5\u01b6\u00dc"+
		"\2\u0ade\u0add\3\2\2\2\u0ade\u0adf\3\2\2\2\u0adf\u0b09\3\2\2\2\u0ae0\u0ae2"+
		"\7\u0121\2\2\u0ae1\u0ae0\3\2\2\2\u0ae1\u0ae2\3\2\2\2\u0ae2\u0ae3\3\2\2"+
		"\2\u0ae3\u0ae4\5\u01b0\u00d9\2\u0ae4\u0ae5\7\35\2\2\u0ae5\u0ae6\7\u02c4"+
		"\2\2\u0ae6\u0aeb\5\u01ce\u00e8\2\u0ae7\u0ae8\7\u02be\2\2\u0ae8\u0aea\5"+
		"\u01ce\u00e8\2\u0ae9\u0ae7\3\2\2\2\u0aea\u0aed\3\2\2\2\u0aeb\u0ae9\3\2"+
		"\2\2\u0aeb\u0aec\3\2\2\2\u0aec\u0aee\3\2\2\2\u0aed\u0aeb\3\2\2\2\u0aee"+
		"\u0aef\7\u02c5\2\2\u0aef\u0b09\3\2\2\2\u0af0\u0af2\7\u0121\2\2\u0af1\u0af0"+
		"\3\2\2\2\u0af1\u0af2\3\2\2\2\u0af2\u0af3\3\2\2\2\u0af3\u0af4\7\u01d3\2"+
		"\2\u0af4\u0af5\7\u00e0\2\2\u0af5\u0af6\7\u02c4\2\2\u0af6\u0af7\5\u01b0"+
		"\u00d9\2\u0af7\u0b04\7\u02c5\2\2\u0af8\u0af9\7\35\2\2\u0af9\u0afa\7\u02c4"+
		"\2\2\u0afa\u0aff\5\u01ce\u00e8\2\u0afb\u0afc\7\u02be\2\2\u0afc\u0afe\5"+
		"\u01ce\u00e8\2\u0afd\u0afb\3\2\2\2\u0afe\u0b01\3\2\2\2\u0aff\u0afd\3\2"+
		"\2\2\u0aff\u0b00\3\2\2\2\u0b00\u0b02\3\2\2\2\u0b01\u0aff\3\2\2\2\u0b02"+
		"\u0b03\7\u02c5\2\2\u0b03\u0b05\3\2\2\2\u0b04\u0af8\3\2\2\2\u0b04\u0b05"+
		"\3\2\2\2\u0b05\u0b06\3\2\2\2\u0b06\u0b07\7\u02c5\2\2\u0b07\u0b09\3\2\2"+
		"\2\u0b08\u0a9e\3\2\2\2\u0b08\u0abf\3\2\2\2\u0b08\u0ad6\3\2\2\2\u0b08\u0ae1"+
		"\3\2\2\2\u0b08\u0af1\3\2\2\2\u0b09\u0b14\3\2\2\2\u0b0a\u0b0c\f\3\2\2\u0b0b"+
		"\u0b0d\7\u0150\2\2\u0b0c\u0b0b\3\2\2\2\u0b0c\u0b0d\3\2\2\2\u0b0d\u0b0e"+
		"\3\2\2\2\u0b0e\u0b0f\5\u01b8\u00dd\2\u0b0f\u0b10\5\u01b4\u00db\2\u0b10"+
		"\u0b11\5\u01ba\u00de\2\u0b11\u0b13\3\2\2\2\u0b12\u0b0a\3\2\2\2\u0b13\u0b16"+
		"\3\2\2\2\u0b14\u0b12\3\2\2\2\u0b14\u0b15\3\2\2\2\u0b15\u01b5\3\2\2\2\u0b16"+
		"\u0b14\3\2\2\2\u0b17\u0b19\7\35\2\2\u0b18\u0b17\3\2\2\2\u0b18\u0b19\3"+
		"\2\2\2\u0b19\u0b1a\3\2\2\2\u0b1a\u0b23\5\u01ca\u00e6\2\u0b1b\u0b20\5\u01cc"+
		"\u00e7\2\u0b1c\u0b1d\7\u02be\2\2\u0b1d\u0b1f\5\u01cc\u00e7\2\u0b1e\u0b1c"+
		"\3\2\2\2\u0b1f\u0b22\3\2\2\2\u0b20\u0b1e\3\2\2\2\u0b20\u0b21\3\2\2\2\u0b21"+
		"\u0b24\3\2\2\2\u0b22\u0b20\3\2\2\2\u0b23\u0b1b\3\2\2\2\u0b23\u0b24\3\2"+
		"\2\2\u0b24\u01b7\3\2\2\2\u0b25\u0b27\7\u0105\2\2\u0b26\u0b25\3\2\2\2\u0b26"+
		"\u0b27\3\2\2\2\u0b27\u0b28\3\2\2\2\u0b28\u0b3b\7\u0118\2\2\u0b29\u0b2b"+
		"\7\u0123\2\2\u0b2a\u0b2c\7\u017c\2\2\u0b2b\u0b2a\3\2\2\2\u0b2b\u0b2c\3"+
		"\2\2\2\u0b2c\u0b2d\3\2\2\2\u0b2d\u0b3b\7\u0118\2\2\u0b2e\u0b30\7\u01ca"+
		"\2\2\u0b2f\u0b31\7\u017c\2\2\u0b30\u0b2f\3\2\2\2\u0b30\u0b31\3\2\2\2\u0b31"+
		"\u0b32\3\2\2\2\u0b32\u0b3b\7\u0118\2\2\u0b33\u0b35\7\u00e1\2\2\u0b34\u0b36"+
		"\7\u017c\2\2\u0b35\u0b34\3\2\2\2\u0b35\u0b36\3\2\2\2\u0b36\u0b37\3\2\2"+
		"\2\u0b37\u0b3b\7\u0118\2\2\u0b38\u0b39\7\177\2\2\u0b39\u0b3b\7\u0118\2"+
		"\2\u0b3a\u0b26\3\2\2\2\u0b3a\u0b29\3\2\2\2\u0b3a\u0b2e\3\2\2\2\u0b3a\u0b33"+
		"\3\2\2\2\u0b3a\u0b38\3\2\2\2\u0b3b\u01b9\3\2\2\2\u0b3c\u0b3d\7\u016f\2"+
		"\2\u0b3d\u0b4b\5\u01bc\u00df\2\u0b3e\u0b3f\7\u0255\2\2\u0b3f\u0b40\7\u02c4"+
		"\2\2\u0b40\u0b45\5\u01c8\u00e5\2\u0b41\u0b42\7\u02be\2\2\u0b42\u0b44\5"+
		"\u01c8\u00e5\2\u0b43\u0b41\3\2\2\2\u0b44\u0b47\3\2\2\2\u0b45\u0b43\3\2"+
		"\2\2\u0b45\u0b46\3\2\2\2\u0b46\u0b48\3\2\2\2\u0b47\u0b45\3\2\2\2\u0b48"+
		"\u0b49\7\u02c5\2\2\u0b49\u0b4b\3\2\2\2\u0b4a\u0b3c\3\2\2\2\u0b4a\u0b3e"+
		"\3\2\2\2\u0b4b\u01bb\3\2\2\2\u0b4c\u0b4d\b\u00df\1\2\u0b4d\u0b65\5\u0192"+
		"\u00ca\2\u0b4e\u0b4f\5\u0192\u00ca\2\u0b4f\u0b50\5\u019c\u00cf\2\u0b50"+
		"\u0b51\5\u0192\u00ca\2\u0b51\u0b65\3\2\2\2\u0b52\u0b53\5\u0192\u00ca\2"+
		"\u0b53\u0b55\7\u0114\2\2\u0b54\u0b56\7\u015c\2\2\u0b55\u0b54\3\2\2\2\u0b55"+
		"\u0b56\3\2\2\2\u0b56\u0b57\3\2\2\2\u0b57\u0b58\7\u0161\2\2\u0b58\u0b65"+
		"\3\2\2\2\u0b59\u0b5a\7\u02c4\2\2\u0b5a\u0b5b\5\u01bc\u00df\2\u0b5b\u0b5c"+
		"\7\u02c5\2\2\u0b5c\u0b65\3\2\2\2\u0b5d\u0b5e\7\u00cb\2\2\u0b5e\u0b5f\7"+
		"\u02c4\2\2\u0b5f\u0b60\5\u0152\u00aa\2\u0b60\u0b61\7\u02c5\2\2\u0b61\u0b65"+
		"\3\2\2\2\u0b62\u0b63\7\u015c\2\2\u0b63\u0b65\5\u01bc\u00df\3\u0b64\u0b4c"+
		"\3\2\2\2\u0b64\u0b4e\3\2\2\2\u0b64\u0b52\3\2\2\2\u0b64\u0b59\3\2\2\2\u0b64"+
		"\u0b5d\3\2\2\2\u0b64\u0b62\3\2\2\2\u0b65\u0b6e\3\2\2\2\u0b66\u0b67\f\5"+
		"\2\2\u0b67\u0b68\7\31\2\2\u0b68\u0b6d\5\u01bc\u00df\6\u0b69\u0b6a\f\4"+
		"\2\2\u0b6a\u0b6b\7\u0176\2\2\u0b6b\u0b6d\5\u01bc\u00df\5\u0b6c\u0b66\3"+
		"\2\2\2\u0b6c\u0b69\3\2\2\2\u0b6d\u0b70\3\2\2\2\u0b6e\u0b6c\3\2\2\2\u0b6e"+
		"\u0b6f\3\2\2\2\u0b6f\u01bd\3\2\2\2\u0b70\u0b6e\3\2\2\2\u0b71\u0b72\t\36"+
		"\2\2\u0b72\u01bf\3\2\2\2\u0b73\u0b74\b\u00e1\1\2\u0b74\u0b77\5\u01be\u00e0"+
		"\2\u0b75\u0b77\7\u02d0\2\2\u0b76\u0b73\3\2\2\2\u0b76\u0b75\3\2\2\2\u0b77"+
		"\u0b7d\3\2\2\2\u0b78\u0b79\f\3\2\2\u0b79\u0b7a\7\u02cd\2\2\u0b7a\u0b7c"+
		"\5\u01c0\u00e1\4\u0b7b\u0b78\3\2\2\2\u0b7c\u0b7f\3\2\2\2\u0b7d\u0b7b\3"+
		"\2\2\2\u0b7d\u0b7e\3\2\2\2\u0b7e\u01c1\3\2\2\2\u0b7f\u0b7d\3\2\2\2\u0b80"+
		"\u0b81\13\2\2\2\u0b81\u01c3\3\2\2\2\u0b82\u0b83\5\u01c0\u00e1\2\u0b83"+
		"\u01c5\3\2\2\2\u0b84\u0b85\5\u01c0\u00e1\2\u0b85\u01c7\3\2\2\2\u0b86\u0b87"+
		"\5\u01c0\u00e1\2\u0b87\u01c9\3\2\2\2\u0b88\u0b89\5\u01c0\u00e1\2\u0b89"+
		"\u01cb\3\2\2\2\u0b8a\u0b8b\5\u01c0\u00e1\2\u0b8b\u01cd\3\2\2\2\u0b8c\u0b8d"+
		"\5\u01c0\u00e1\2\u0b8d\u01cf\3\2\2\2\u0b8e\u0b8f\5\u01c0\u00e1\2\u0b8f"+
		"\u01d1\3\2\2\2\u012c\u0209\u0237\u02be\u02ce\u02d1\u02e1\u02e7\u02eb\u02f1"+
		"\u02f7\u02fd\u0303\u0309\u030f\u0315\u031b\u0321\u0325\u032b\u0331\u0337"+
		"\u0340\u0343\u0346\u034b\u034e\u035e\u0364\u0368\u036e\u0374\u0378\u038f"+
		"\u0395\u0399\u039f\u03a5\u03ab\u03b1\u03b7\u03bd\u03c3\u03c9\u03cf\u03d3"+
		"\u03d9\u03df\u03e3\u03f3\u03f9\u03ff\u0413\u041a\u0422\u042e\u0434\u0438"+
		"\u0447\u044c\u0451\u0456\u045b\u0460\u0465\u046a\u0470\u0475\u0477\u0479"+
		"\u047d\u0487\u048d\u0495\u0497\u04a2\u04aa\u04b5\u04c3\u04cf\u04d1\u04d8"+
		"\u04df\u04e7\u04f2\u04f6\u04fb\u0504\u0509\u0512\u0521\u0536\u0538\u053a"+
		"\u053e\u0542\u0547\u054a\u0550\u0554\u0558\u055d\u0560\u0567\u056a\u056d"+
		"\u0575\u0579\u057b\u0583\u058a\u058d\u0591\u0597\u059a\u05a7\u05ad\u05b3"+
		"\u05b9\u05bf\u05c5\u05c9\u05cd\u05da\u05e2\u05e6\u05ef\u05f6\u05ff\u0607"+
		"\u0618\u061f\u0621\u0628\u0630\u0637\u063a\u064e\u0663\u0665\u0667\u066e"+
		"\u0679\u067d\u0681\u0686\u068d\u0690\u0697\u06a1\u06aa\u06ae\u06b4\u06b9"+
		"\u06bc\u06c2\u06c8\u06cc\u06cf\u06d3\u06d6\u06d9\u06e2\u06e4\u0737\u07be"+
		"\u07c1\u07c4\u07c7\u07ca\u07cd\u07d0\u07d3\u07d6\u07d9\u07dc\u07f8\u07fb"+
		"\u07fe\u0801\u0803\u0809\u080b\u0810\u0813\u0819\u081c\u081e\u0822\u0825"+
		"\u082d\u083a\u0845\u084a\u084e\u0856\u085e\u0869\u0876\u0884\u088e\u0892"+
		"\u089d\u08a8\u08ad\u08b3\u08bd\u08c0\u08c8\u08cd\u08da\u08e2\u08e5\u08ea"+
		"\u08ec\u0901\u0909\u0933\u093d\u094d\u0953\u096b\u097d\u097f\u0981\u0989"+
		"\u0991\u0993\u099c\u09a7\u09bd\u09c3\u09ca\u09d0\u09d8\u09e3\u09e8\u09ef"+
		"\u09f3\u09fc\u0a08\u0a11\u0a14\u0a22\u0a24\u0a29\u0a30\u0a38\u0a42\u0a4c"+
		"\u0a4f\u0a53\u0a58\u0a5d\u0a65\u0a6c\u0a7b\u0a81\u0a83\u0a8e\u0a97\u0a9a"+
		"\u0aa0\u0aa4\u0aa7\u0ab1\u0aba\u0abc\u0abf\u0ac5\u0ace\u0ad3\u0ad6\u0adb"+
		"\u0ade\u0ae1\u0aeb\u0af1\u0aff\u0b04\u0b08\u0b0c\u0b14\u0b18\u0b20\u0b23"+
		"\u0b26\u0b2b\u0b30\u0b35\u0b3a\u0b45\u0b4a\u0b55\u0b64\u0b6c\u0b6e\u0b76"+
		"\u0b7d";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
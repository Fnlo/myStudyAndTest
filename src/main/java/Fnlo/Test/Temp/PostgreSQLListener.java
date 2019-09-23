package Fnlo.Test.Temp;

import java.util.ArrayList;
import java.util.List;

import Fnlo.Test.Temp.PostgreSQLParser.Func_nameContext;

public class PostgreSQLListener extends PostgreSQLParserBaseListener{

	private List<String> funcNames;
	
	public List<String> getFuncNames(){
		return funcNames;
	}
	
	@Override
	public void enterFunc_name(Func_nameContext ctx) {
		// TODO Auto-generated method stub
		super.enterFunc_name(ctx);
		if(funcNames == null){
			funcNames = new ArrayList<String>();
		}
		funcNames.add(ctx.getText());
	}
	
}

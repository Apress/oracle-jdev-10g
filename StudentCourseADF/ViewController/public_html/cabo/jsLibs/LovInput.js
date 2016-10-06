var _LovDA=null;
var _LovDP=null;
var _LovEV="event";
var _LovFL="field";
var _LovFR="form";
var _LovHR;
var _LovIC=0;
var _LovLD=0;
var _LovNM=null;
var _LovPT="partialTargets";
var _LovSF=null;
var _LovSR="source";
var _LovST="searchText";
var _LovWN='lovWindow';
function _LovInputVTF(a0,
a1,
a2,
a3,
a4,
a5)
{
var a6=(a5!=(void 0));
var a7=new Date();
var a8=null;
if(a6)
{
if(_LovLD)
{
var a9=a7-_LovLD;
if((a9>=0)&&(a9<2000))
{
return false;
}
}
_LovLD=a7;
}
else if(_agent.isIE)
{
if(_LovIC)
{
var a9=a7-_LovIC;
if((a9>=0)&&(a9<500))
{
return false;
}
}
_LovIC=a7;
}
var a10=false;
var a11=true;
if(a2)
{
if(a2.value)
{
a11=(a2.value.search(/\S/)<0);
}
if(a11)
{
if((a3!=(void 0))&&a3)
{
a10=!a6;
}
}
else
{
a10=!a6;
}
if(a10)
{
if(a0)
{
var a12=new Object();
var a13=0;
var a14=new Object();
if(a2.form!=(void 0))
{
a8=a2.form;
if(a8.action!=(void 0))
a13=a8.action;
}
a13=_LovInputDDP(a13,a12);
for(var a15 in a12)
a14[a15]=a12[a15];
if(a2.id)
a12[_LovSR]=a2.id;
else
a12[_LovSR]=a2.name;
a12[_LovST]=a2.value;
a12[_LovPT]=a0;
if(_LovInputMPC(a1,a12,'lovValidate',false))
{
var a16=_LovInputUSF();
for(a15 in a12)
{
if((a14[a15]!=null)
&&(a14[a15]==a12[a15]))
{
delete a12[a15];
}
else
{
if(a14[a15]!=null)
{
delete a14[a15];
}
if(!(a16||a4))
a12[a15]=_LovInputENC(a12[a15]);
}
}
var a17=false;
if(a16&&!a4)
{
var a18=_LovInputUAA(a13,a14,a17);
a12[_getPartialParameter()]=true;
_LovInputSFS(a12,a8,a18);
}
else
{
for(a15 in a14)
a12[a15]=a14[a15];
var a19='_lovInputSFE(';
if(a4)
{
a19+="1);";
top._LovDP=a12;
top._LovDA=a8;
}
else
{
a19+="0);";
top._LovDA=_LovInputUAA(a13,a12,a17);
}
var a20=200;
if(_agent.isIE)
a20=250;
_setRequestedFocusNode(document,a12[_LovSR],true);
window.setTimeout(a19,a20);
}
}
}
}
if(a6)
_LovInputOLW(a0,a5,1);
else
_setNavDirty(window,a2.name);
}
return(a11&&!a6);
}
function _lovInputSFE(a0)
{
var a1=new Date();
if(_recentReset(a1)||_recentSubmit(a1))
return;
if(a0)
{
_submitPartialChange(top._LovDA,0,top._LovDP);
}
else
{
_firePartialChange(top._LovDA);
}
return;
}
function _LovInputOLW(a0,a1,a2)
{
var a3=_getDependent(window,_LovWN);
var a4=a1;
var a5=(a2==1);
if(a4==(void 0))
{
a4=new Object();
}
var a6=_LovInputGPF(a4,'A',false);
var a7=_LovInputGPF(a4,'F',0);
var a8=_LovInputGPF(a4,'N',0);
if(!((a6||a8)&&a7))
return;
var a9=_LovInputGPF(a4,'L',0);
var a10=_LovInputGPF(a4,'T',a8);
var a11=_LovInputGPF(a4,'I',0);
var a12=_LovInputGPF(a4,'S',0);
var a13=_LovEV;
var a14=_LovInputGPF(a4,'D',location.href);
var a15;
if(!a6)
{
var a16=document[a7][a10];
if(!a16)
return;
a15=a16.value;
}
else
{
a15=_LovInputGPF(a4,'R','');
}
_LovSF=a12;
_LovNM=new Object();
_LovNM[_LovFR]=a7;
_LovNM[_LovFL]=a10;
if(a9)
_LovNM[_LovSR]=a9;
else
_LovNM[_LovSR]=a8;
_LovNM[_LovPT]=a0;
if(a3!=(void 0))
{
return false;
}
var a17=_LovInputGPF(a4,'P',false);
if(a17&&a5)
{
_submitPartialChange(a7,0,{'event':'lovPrepare',
'source':_LovNM[_LovSR],
'searchText':a15,
'partialTargets':a0});
}
else
{
var a18=new Object();
var a19="lovFilter";
a14=_LovInputDDP(a14,a18);
a18[_LovSR]=_LovNM[_LovSR];
a18[_LovST]=a15;
if(!a17)
{
if(!_LovInputMPC(a11,a18,a19,true))
return false;
}
else
{
a18[_LovEV]=a19;
}
a14=_LovInputUAA(a14,a18,true);
_LovHR=location.href;
_LovInputOMW(a14,_LovInputWCB);
}
return false;
}
function _LovInputGPF(a0,a1,a2)
{
var a3;
if(a0!=(void 0))
{
a3=a0[a1];
}
if(a3==(void 0))
a3=a2;
return a3;
}
function _LovInputMPC(a0,a1,a2,a3)
{
var a4=_LovEV;
var a5=null;
if(a3)
a5=a1[a4];
delete a1[a4];
if(a0)
{
var a6=a0(a1);
if(!a6)
return false;
}
if(!a1[a4])
{
if(a5)
{
a1[a4]=a5;
}
else
{
a1[a4]=a2;
}
}
return true;
}
function _LovInputOMW(a0,a1)
{
var a2=location.protocol+'//'+location.host;
a2+=_jspDir+_getQuerySeparator(_jspDir)+'_t=';
if(_LovInputUSF())
{
a2+='fredRC&';
}
else
a2+='fred&';
if(_enc)
a2+="enc="+_enc+"&";
a2+='_minWidth=750&_minHeight=550&';
if(_configName)
a2+="configName="+_configName+"&";
if(_contextURI)
a2+="contextURI="+_contextURI+"&";
a2+='redirect=';
if(a0.charAt(0)!='/')
{
var a3=location.pathname;
a0=(a3.substr(0,a3.lastIndexOf('/')+1)
+a0);
}
a2+=a0.replace('?','&');
lovw=openWindow(window,a2,_LovWN,{width:750,height:550},
true,'dialog',a1);
lovw._LovSL=false;
lovw._LovSF=_LovSF;
lovw._LovNM=_LovNM;
}
function _LovInputPWP(a0,a1)
{
var a2=window[a0];
if(a2==(void 0))
{
if((a1!=(void 0))&&a1[a0])
{
a2=a1[a0];
}
else if(top[a0])
{
a2=top[a0];
}
else if((a1.opener!=(void 0))&&(a1.opener[a0]))
{
a2=a1.opener[a0];
}
}
return a2;
}
function _LovInputWCB(a0,a1)
{
var a2=true;
if(!a0._LovSL)
{
_LovInputSTC(a0.opener);
return false;
}
_LovNM=_LovInputPWP('_LovNM',a0);
if(_LovNM==null)
return false;
_setNavDirty(a0.opener,_LovNM[_LovFL]);
if(a2)
{
var a3=new Object();
a3[_LovEV]='lovUpdate';
a3[_LovSR]=_LovNM[_LovSR];
var a4=_LovNM[_LovPT];
_setRequestedFocusNode(a0.opener.document,a3[_LovSR],false);
if(a4)
{
a3[_LovPT]=a4;
}
var a5=_LovInputPWP('_lovClose',a0);
var a6=_LovNM[_LovFR];
if((a5!=(void 0))&&(a6!=(void 0)))
{
a5(a6,a3,(a4));
}
else
{
var a7=_LovInputDDP(0,a3);
if(a4)
{
a7=_LovInputUAA(a7,a3,true);
_firePartialChange(a7);
}
else
{
a7=_LovInputUAA(a7,a3,true);
location=a7;
}
}
}
return false;
}
function _LovInputDDP(a0,a1)
{
var a2=a0;
if(!a0)
{
if(_LovHR!=(void 0))
{
a2=_LovHR;
}
else if((location!=(void 0))
&&(location.href!=(void 0)))
{
a2=location.href;
}
else
{
return"#";
}
}
if(a2.charAt(a2.length-1)=='#')
{
a2=a2.substr(0,a2.length-1);
}
var a3=a2;
var a4=a2.indexOf('?');
if(a4>0)
{
a3=a2.substr(0,a4);
var a5=a2.substr(a4+1);
var a6=a5.split('&');
for(var a7=0;a7<a6.length;a7++)
{
var a8=a6[a7].indexOf('=');
if(a8>=0)
{
a1[a6[a7].substr(0,a8)]=a6[a7].substr(a8+1);
}
else
{
a1[a6[a7]]="";
}
}
}
return a3;
}
function _LovInputUAA(a0,a1,a2)
{
var a3='?';
var a4=a0;
if(a4)
{
for(var a5 in a1)
{
var a6=a1[a5];
a4+=(a3
+(a2?_LovInputENC(a5):a5)
+'=');
if(a6)
a4+=(a2?_LovInputENC(a6):a6);
a3='&';
}
}
return a4;
}
function _LovInputSTC(a0)
{
var a1=_LovInputPWP('_LovNM',a0);
var a2=null;
var a3=null;
if(a1&&a1[_LovFR]&&a1[_LovFL])
{
if((a0!=null)&&(a0["document"]))
{
a2=a0.document;
a3=a2[a1[_LovFR]][a1[_LovFL]];
}
}
if(a3)
{
_pprFocus(a3,a2);
if(a3["select"]!=null)
a3.select();
}
}
function _LovInputCBF()
{
top.close();
return false;
}
function _LovInputSBF(event)
{
top._LovSL=true;
var nameObj=_LovInputPWP('_LovNM',top);
var opn=top.opener;
_setNavDirty(opn,nameObj[_LovFL]);
var stateCheck=_LovInputPWP('_LovSC',window);
var closeWin=true;
if(stateCheck!=(void 0)&&stateCheck!='')
{
closeWin=eval(stateCheck+'(window, "_LOVResFrm")');
}
var selFunc=_LovInputPWP('_LovSF',top);
if(selFunc)
{
top._LovSL=selFunc(window,
opn.document[nameObj[_LovFR]][nameObj[_LovFL]],
event,opn);
}
if(closeWin)
{
window.onunload=function(){top._unloadUIXDialog(window.event);
top.close();};
}
if(_agent.isNav&&_agent.isSolaris)
{
window.onunload=function(){_LovInputWCB(top,event);};
}
submitForm(0,0,{'event':'lovSelect','source':_LovLI});
}
function _LovInputENC(a0)
{
var a1;
var a2=_agent.isNav||_agent.isMac||_agent.atMost("ie",5.49);
if(!a2)
{
a1=encodeURIComponent(a0);
}
else
{
var a3=escape(a0);
var a4=0;
var a5;
a1="";
while((a5=a3.indexOf('+',a4))>0)
{
a1+=a3.substring(a4,a5)+'%2B';
a4=a5+1;
}
a1+=a3.substring(a4);
}
return a1;
}
function _LovInputQSF(a0,a1)
{
var a2=new TableProxy(a0);
a2.setSelectedRow(a1);
_LovInputSBF();
}
function _LovInputUSF()
{
return _enc.toUpperCase()!="UTF-8";
}
function _LovInputSFS(a0,a1,a2)
{
var a3=window.document;
var a4="_LovInput";
if(a1.id)
a4+=a1.id;
else if(a1.name)
a4+=a1.name;
else
a4+="DummyForm";
var a5=a3.createElement("form");
a5.id=a4;
a5.name=a4;
a5.target=a1.target;
a5.method=a1.method;
if(a2)
a5.action=a2;
else
a5.action=a1.action;
for(var a6 in a0)
{
var a7=a3.createElement("input");
a7.type="hidden";
a7.name=a6;
a7.value=a0[a6];
a5.appendChild(a7);
}
a3.body.appendChild(a5);
var a8="_"+a5.name+"Validater";
var a9=false;
if(window[a8]==(void 0))
{
a9=true;
window[a8]=1;
}
_submitPartialChange(a5,0,a0);
if(a9&&(!_agent.isIE))
delete window[a8];
a3.body.removeChild(a5);
}
function _LovInputSOE(a0,a1,a2,a3)
{
if(_getKC(a0)==13)
{
submitForm(a1,1,{'event':a2,'source':a3});
return false;
}
return true;
}

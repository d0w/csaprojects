public boolean frontAgain(String str)
{
	int len = str.length();
	if(len >= 2)
		return str.substring(0, 2).equals(str.substring(len-2, len));
	else
		return false;
}
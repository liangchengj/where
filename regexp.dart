main(List<String> args) {
  var regexp = RegExp(r'.*:\/\/[^\/]*');
  print(regexp.isCaseSensitive);
  print(regexp.isDotAll);
  print(regexp.isUnicode);
  print(regexp.isMultiLine);
  print(regexp.stringMatch(url));
}

var url = 'https://odb.liangchengj.com';

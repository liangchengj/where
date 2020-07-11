import 'package:http/http.dart' as http;

var url = 'https://odb.liangchengj.com';

main(List<String> args) async {
  var resp = await http.get(url);
  print('Response body: ${resp.body}');
}

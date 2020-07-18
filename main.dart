import 'dart:mirrors';

main(List<String> args) {
  // var boy = Boy('邓捷', 20);

  // print('${boy.name}');

  // img.forEach((key, value) => print('$key => $value'));

  var boy = Boy('邓捷', 20);

  InstanceMirror im = reflect(boy);
  ClassMirror cm = im.type;

  // for (var k in cm.declarations.keys) {
  //   print(MirrorSystem.getName(k));
  // }

  Iterable<DeclarationMirror> decls =
      cm.declarations.values.where((element) => element is VariableMirror);

  // decls.forEach((element) => print(MirrorSystem.getName(element.simpleName)));

  cm.declarations.forEach((key, value) {
    if (value is VariableMirror) {
      print(im.getField(key).reflectee);
    }
  });
  // var namefiled = cm.getField(#name);
  // print('$namefiled');
}

var img = {'url': 'https://www.liangchengj.com', 'tags': 'img'};

class Boy {
  var name;
  var age;

  Boy(this.name, this.age);
}

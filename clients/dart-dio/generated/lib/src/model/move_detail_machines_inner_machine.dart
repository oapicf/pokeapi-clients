//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'move_detail_machines_inner_machine.g.dart';

/// MoveDetailMachinesInnerMachine
///
/// Properties:
/// * [url] 
@BuiltValue()
abstract class MoveDetailMachinesInnerMachine implements Built<MoveDetailMachinesInnerMachine, MoveDetailMachinesInnerMachineBuilder> {
  @BuiltValueField(wireName: r'url')
  String get url;

  MoveDetailMachinesInnerMachine._();

  factory MoveDetailMachinesInnerMachine([void updates(MoveDetailMachinesInnerMachineBuilder b)]) = _$MoveDetailMachinesInnerMachine;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(MoveDetailMachinesInnerMachineBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<MoveDetailMachinesInnerMachine> get serializer => _$MoveDetailMachinesInnerMachineSerializer();
}

class _$MoveDetailMachinesInnerMachineSerializer implements PrimitiveSerializer<MoveDetailMachinesInnerMachine> {
  @override
  final Iterable<Type> types = const [MoveDetailMachinesInnerMachine, _$MoveDetailMachinesInnerMachine];

  @override
  final String wireName = r'MoveDetailMachinesInnerMachine';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    MoveDetailMachinesInnerMachine object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'url';
    yield serializers.serialize(
      object.url,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    MoveDetailMachinesInnerMachine object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required MoveDetailMachinesInnerMachineBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'url':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.url = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  MoveDetailMachinesInnerMachine deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = MoveDetailMachinesInnerMachineBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}


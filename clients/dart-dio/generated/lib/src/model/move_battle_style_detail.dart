//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/move_battle_style_name.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'move_battle_style_detail.g.dart';

/// MoveBattleStyleDetail
///
/// Properties:
/// * [id] 
/// * [name] 
/// * [names] 
@BuiltValue()
abstract class MoveBattleStyleDetail implements Built<MoveBattleStyleDetail, MoveBattleStyleDetailBuilder> {
  @BuiltValueField(wireName: r'id')
  int get id;

  @BuiltValueField(wireName: r'name')
  String get name;

  @BuiltValueField(wireName: r'names')
  BuiltList<MoveBattleStyleName> get names;

  MoveBattleStyleDetail._();

  factory MoveBattleStyleDetail([void updates(MoveBattleStyleDetailBuilder b)]) = _$MoveBattleStyleDetail;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(MoveBattleStyleDetailBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<MoveBattleStyleDetail> get serializer => _$MoveBattleStyleDetailSerializer();
}

class _$MoveBattleStyleDetailSerializer implements PrimitiveSerializer<MoveBattleStyleDetail> {
  @override
  final Iterable<Type> types = const [MoveBattleStyleDetail, _$MoveBattleStyleDetail];

  @override
  final String wireName = r'MoveBattleStyleDetail';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    MoveBattleStyleDetail object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'id';
    yield serializers.serialize(
      object.id,
      specifiedType: const FullType(int),
    );
    yield r'name';
    yield serializers.serialize(
      object.name,
      specifiedType: const FullType(String),
    );
    yield r'names';
    yield serializers.serialize(
      object.names,
      specifiedType: const FullType(BuiltList, [FullType(MoveBattleStyleName)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    MoveBattleStyleDetail object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required MoveBattleStyleDetailBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.id = valueDes;
          break;
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.name = valueDes;
          break;
        case r'names':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(MoveBattleStyleName)]),
          ) as BuiltList<MoveBattleStyleName>;
          result.names.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  MoveBattleStyleDetail deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = MoveBattleStyleDetailBuilder();
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


//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/move_damage_class_description.dart';
import 'package:openapi/src/model/move_summary.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/move_damage_class_name.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'move_damage_class_detail.g.dart';

/// MoveDamageClassDetail
///
/// Properties:
/// * [id] 
/// * [name] 
/// * [descriptions] 
/// * [moves] 
/// * [names] 
@BuiltValue()
abstract class MoveDamageClassDetail implements Built<MoveDamageClassDetail, MoveDamageClassDetailBuilder> {
  @BuiltValueField(wireName: r'id')
  int get id;

  @BuiltValueField(wireName: r'name')
  String get name;

  @BuiltValueField(wireName: r'descriptions')
  BuiltList<MoveDamageClassDescription> get descriptions;

  @BuiltValueField(wireName: r'moves')
  BuiltList<MoveSummary> get moves;

  @BuiltValueField(wireName: r'names')
  BuiltList<MoveDamageClassName> get names;

  MoveDamageClassDetail._();

  factory MoveDamageClassDetail([void updates(MoveDamageClassDetailBuilder b)]) = _$MoveDamageClassDetail;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(MoveDamageClassDetailBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<MoveDamageClassDetail> get serializer => _$MoveDamageClassDetailSerializer();
}

class _$MoveDamageClassDetailSerializer implements PrimitiveSerializer<MoveDamageClassDetail> {
  @override
  final Iterable<Type> types = const [MoveDamageClassDetail, _$MoveDamageClassDetail];

  @override
  final String wireName = r'MoveDamageClassDetail';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    MoveDamageClassDetail object, {
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
    yield r'descriptions';
    yield serializers.serialize(
      object.descriptions,
      specifiedType: const FullType(BuiltList, [FullType(MoveDamageClassDescription)]),
    );
    yield r'moves';
    yield serializers.serialize(
      object.moves,
      specifiedType: const FullType(BuiltList, [FullType(MoveSummary)]),
    );
    yield r'names';
    yield serializers.serialize(
      object.names,
      specifiedType: const FullType(BuiltList, [FullType(MoveDamageClassName)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    MoveDamageClassDetail object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required MoveDamageClassDetailBuilder result,
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
        case r'descriptions':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(MoveDamageClassDescription)]),
          ) as BuiltList<MoveDamageClassDescription>;
          result.descriptions.replace(valueDes);
          break;
        case r'moves':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(MoveSummary)]),
          ) as BuiltList<MoveSummary>;
          result.moves.replace(valueDes);
          break;
        case r'names':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(MoveDamageClassName)]),
          ) as BuiltList<MoveDamageClassName>;
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
  MoveDamageClassDetail deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = MoveDamageClassDetailBuilder();
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


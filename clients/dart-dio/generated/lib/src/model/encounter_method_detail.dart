//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/encounter_method_name.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'encounter_method_detail.g.dart';

/// EncounterMethodDetail
///
/// Properties:
/// * [id] 
/// * [name] 
/// * [order] 
/// * [names] 
@BuiltValue()
abstract class EncounterMethodDetail implements Built<EncounterMethodDetail, EncounterMethodDetailBuilder> {
  @BuiltValueField(wireName: r'id')
  int get id;

  @BuiltValueField(wireName: r'name')
  String get name;

  @BuiltValueField(wireName: r'order')
  int? get order;

  @BuiltValueField(wireName: r'names')
  BuiltList<EncounterMethodName> get names;

  EncounterMethodDetail._();

  factory EncounterMethodDetail([void updates(EncounterMethodDetailBuilder b)]) = _$EncounterMethodDetail;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(EncounterMethodDetailBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<EncounterMethodDetail> get serializer => _$EncounterMethodDetailSerializer();
}

class _$EncounterMethodDetailSerializer implements PrimitiveSerializer<EncounterMethodDetail> {
  @override
  final Iterable<Type> types = const [EncounterMethodDetail, _$EncounterMethodDetail];

  @override
  final String wireName = r'EncounterMethodDetail';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    EncounterMethodDetail object, {
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
    if (object.order != null) {
      yield r'order';
      yield serializers.serialize(
        object.order,
        specifiedType: const FullType.nullable(int),
      );
    }
    yield r'names';
    yield serializers.serialize(
      object.names,
      specifiedType: const FullType(BuiltList, [FullType(EncounterMethodName)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    EncounterMethodDetail object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required EncounterMethodDetailBuilder result,
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
        case r'order':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.order = valueDes;
          break;
        case r'names':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(EncounterMethodName)]),
          ) as BuiltList<EncounterMethodName>;
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
  EncounterMethodDetail deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = EncounterMethodDetailBuilder();
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


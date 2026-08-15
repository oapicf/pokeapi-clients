//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/encounter_condition_summary.dart';
import 'package:openapi/src/model/encounter_condition_value_name.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'encounter_condition_value_detail.g.dart';

/// EncounterConditionValueDetail
///
/// Properties:
/// * [id] 
/// * [name] 
/// * [condition] 
/// * [names] 
@BuiltValue()
abstract class EncounterConditionValueDetail implements Built<EncounterConditionValueDetail, EncounterConditionValueDetailBuilder> {
  @BuiltValueField(wireName: r'id')
  int get id;

  @BuiltValueField(wireName: r'name')
  String get name;

  @BuiltValueField(wireName: r'condition')
  EncounterConditionSummary get condition;

  @BuiltValueField(wireName: r'names')
  BuiltList<EncounterConditionValueName> get names;

  EncounterConditionValueDetail._();

  factory EncounterConditionValueDetail([void updates(EncounterConditionValueDetailBuilder b)]) = _$EncounterConditionValueDetail;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(EncounterConditionValueDetailBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<EncounterConditionValueDetail> get serializer => _$EncounterConditionValueDetailSerializer();
}

class _$EncounterConditionValueDetailSerializer implements PrimitiveSerializer<EncounterConditionValueDetail> {
  @override
  final Iterable<Type> types = const [EncounterConditionValueDetail, _$EncounterConditionValueDetail];

  @override
  final String wireName = r'EncounterConditionValueDetail';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    EncounterConditionValueDetail object, {
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
    yield r'condition';
    yield serializers.serialize(
      object.condition,
      specifiedType: const FullType(EncounterConditionSummary),
    );
    yield r'names';
    yield serializers.serialize(
      object.names,
      specifiedType: const FullType(BuiltList, [FullType(EncounterConditionValueName)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    EncounterConditionValueDetail object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required EncounterConditionValueDetailBuilder result,
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
        case r'condition':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(EncounterConditionSummary),
          ) as EncounterConditionSummary;
          result.condition.replace(valueDes);
          break;
        case r'names':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(EncounterConditionValueName)]),
          ) as BuiltList<EncounterConditionValueName>;
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
  EncounterConditionValueDetail deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = EncounterConditionValueDetailBuilder();
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


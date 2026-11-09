//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/type_summary.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'type_relationships.g.dart';

/// TypeRelationships
///
/// Properties:
/// * [noDamageTo] - A list of types this type has no effect on.
/// * [halfDamageTo] - A list of types this type is not very effect against.
/// * [doubleDamageTo] - A list of types this type is very effect against.
/// * [noDamageFrom] - A list of types that have no effect on this type.
/// * [halfDamageFrom] - A list of types that are not very effective against this type.
/// * [doubleDamageFrom] - A list of types that are very effective against this type.
@BuiltValue()
abstract class TypeRelationships implements Built<TypeRelationships, TypeRelationshipsBuilder> {
  /// A list of types this type has no effect on.
  @BuiltValueField(wireName: r'no_damage_to')
  BuiltList<TypeSummary> get noDamageTo;

  /// A list of types this type is not very effect against.
  @BuiltValueField(wireName: r'half_damage_to')
  BuiltList<TypeSummary> get halfDamageTo;

  /// A list of types this type is very effect against.
  @BuiltValueField(wireName: r'double_damage_to')
  BuiltList<TypeSummary> get doubleDamageTo;

  /// A list of types that have no effect on this type.
  @BuiltValueField(wireName: r'no_damage_from')
  BuiltList<TypeSummary> get noDamageFrom;

  /// A list of types that are not very effective against this type.
  @BuiltValueField(wireName: r'half_damage_from')
  BuiltList<TypeSummary> get halfDamageFrom;

  /// A list of types that are very effective against this type.
  @BuiltValueField(wireName: r'double_damage_from')
  BuiltList<TypeSummary> get doubleDamageFrom;

  TypeRelationships._();

  factory TypeRelationships([void updates(TypeRelationshipsBuilder b)]) = _$TypeRelationships;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(TypeRelationshipsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<TypeRelationships> get serializer => _$TypeRelationshipsSerializer();
}

class _$TypeRelationshipsSerializer implements PrimitiveSerializer<TypeRelationships> {
  @override
  final Iterable<Type> types = const [TypeRelationships, _$TypeRelationships];

  @override
  final String wireName = r'TypeRelationships';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    TypeRelationships object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'no_damage_to';
    yield serializers.serialize(
      object.noDamageTo,
      specifiedType: const FullType(BuiltList, [FullType(TypeSummary)]),
    );
    yield r'half_damage_to';
    yield serializers.serialize(
      object.halfDamageTo,
      specifiedType: const FullType(BuiltList, [FullType(TypeSummary)]),
    );
    yield r'double_damage_to';
    yield serializers.serialize(
      object.doubleDamageTo,
      specifiedType: const FullType(BuiltList, [FullType(TypeSummary)]),
    );
    yield r'no_damage_from';
    yield serializers.serialize(
      object.noDamageFrom,
      specifiedType: const FullType(BuiltList, [FullType(TypeSummary)]),
    );
    yield r'half_damage_from';
    yield serializers.serialize(
      object.halfDamageFrom,
      specifiedType: const FullType(BuiltList, [FullType(TypeSummary)]),
    );
    yield r'double_damage_from';
    yield serializers.serialize(
      object.doubleDamageFrom,
      specifiedType: const FullType(BuiltList, [FullType(TypeSummary)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    TypeRelationships object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required TypeRelationshipsBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'no_damage_to':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(TypeSummary)]),
          ) as BuiltList<TypeSummary>;
          result.noDamageTo.replace(valueDes);
          break;
        case r'half_damage_to':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(TypeSummary)]),
          ) as BuiltList<TypeSummary>;
          result.halfDamageTo.replace(valueDes);
          break;
        case r'double_damage_to':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(TypeSummary)]),
          ) as BuiltList<TypeSummary>;
          result.doubleDamageTo.replace(valueDes);
          break;
        case r'no_damage_from':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(TypeSummary)]),
          ) as BuiltList<TypeSummary>;
          result.noDamageFrom.replace(valueDes);
          break;
        case r'half_damage_from':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(TypeSummary)]),
          ) as BuiltList<TypeSummary>;
          result.halfDamageFrom.replace(valueDes);
          break;
        case r'double_damage_from':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(TypeSummary)]),
          ) as BuiltList<TypeSummary>;
          result.doubleDamageFrom.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  TypeRelationships deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = TypeRelationshipsBuilder();
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



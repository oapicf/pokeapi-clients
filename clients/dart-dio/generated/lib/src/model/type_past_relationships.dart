//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/type_relationships.dart';
import 'package:openapi/src/model/generation_summary.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'type_past_relationships.g.dart';

/// TypePastRelationships
///
/// Properties:
/// * [generation] - The last generation in which the referenced type had the listed damage relations
/// * [damageRelations] - The damage relations the referenced type had up to and including the listed generation
@BuiltValue()
abstract class TypePastRelationships implements Built<TypePastRelationships, TypePastRelationshipsBuilder> {
  /// The last generation in which the referenced type had the listed damage relations
  @BuiltValueField(wireName: r'generation')
  GenerationSummary get generation;

  /// The damage relations the referenced type had up to and including the listed generation
  @BuiltValueField(wireName: r'damage_relations')
  TypeRelationships get damageRelations;

  TypePastRelationships._();

  factory TypePastRelationships([void updates(TypePastRelationshipsBuilder b)]) = _$TypePastRelationships;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(TypePastRelationshipsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<TypePastRelationships> get serializer => _$TypePastRelationshipsSerializer();
}

class _$TypePastRelationshipsSerializer implements PrimitiveSerializer<TypePastRelationships> {
  @override
  final Iterable<Type> types = const [TypePastRelationships, _$TypePastRelationships];

  @override
  final String wireName = r'TypePastRelationships';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    TypePastRelationships object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'generation';
    yield serializers.serialize(
      object.generation,
      specifiedType: const FullType(GenerationSummary),
    );
    yield r'damage_relations';
    yield serializers.serialize(
      object.damageRelations,
      specifiedType: const FullType(TypeRelationships),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    TypePastRelationships object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required TypePastRelationshipsBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'generation':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(GenerationSummary),
          ) as GenerationSummary;
          result.generation.replace(valueDes);
          break;
        case r'damage_relations':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(TypeRelationships),
          ) as TypeRelationships;
          result.damageRelations.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  TypePastRelationships deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = TypePastRelationshipsBuilder();
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



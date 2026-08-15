//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/type_detail_past_damage_relations_inner_damage_relations.dart';
import 'package:openapi/src/model/ability_detail_pokemon_inner_pokemon.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'type_detail_past_damage_relations_inner.g.dart';

/// TypeDetailPastDamageRelationsInner
///
/// Properties:
/// * [generation] 
/// * [damageRelations] 
@BuiltValue()
abstract class TypeDetailPastDamageRelationsInner implements Built<TypeDetailPastDamageRelationsInner, TypeDetailPastDamageRelationsInnerBuilder> {
  @BuiltValueField(wireName: r'generation')
  AbilityDetailPokemonInnerPokemon get generation;

  @BuiltValueField(wireName: r'damage_relations')
  TypeDetailPastDamageRelationsInnerDamageRelations get damageRelations;

  TypeDetailPastDamageRelationsInner._();

  factory TypeDetailPastDamageRelationsInner([void updates(TypeDetailPastDamageRelationsInnerBuilder b)]) = _$TypeDetailPastDamageRelationsInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(TypeDetailPastDamageRelationsInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<TypeDetailPastDamageRelationsInner> get serializer => _$TypeDetailPastDamageRelationsInnerSerializer();
}

class _$TypeDetailPastDamageRelationsInnerSerializer implements PrimitiveSerializer<TypeDetailPastDamageRelationsInner> {
  @override
  final Iterable<Type> types = const [TypeDetailPastDamageRelationsInner, _$TypeDetailPastDamageRelationsInner];

  @override
  final String wireName = r'TypeDetailPastDamageRelationsInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    TypeDetailPastDamageRelationsInner object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'generation';
    yield serializers.serialize(
      object.generation,
      specifiedType: const FullType(AbilityDetailPokemonInnerPokemon),
    );
    yield r'damage_relations';
    yield serializers.serialize(
      object.damageRelations,
      specifiedType: const FullType(TypeDetailPastDamageRelationsInnerDamageRelations),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    TypeDetailPastDamageRelationsInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required TypeDetailPastDamageRelationsInnerBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'generation':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AbilityDetailPokemonInnerPokemon),
          ) as AbilityDetailPokemonInnerPokemon;
          result.generation.replace(valueDes);
          break;
        case r'damage_relations':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(TypeDetailPastDamageRelationsInnerDamageRelations),
          ) as TypeDetailPastDamageRelationsInnerDamageRelations;
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
  TypeDetailPastDamageRelationsInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = TypeDetailPastDamageRelationsInnerBuilder();
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


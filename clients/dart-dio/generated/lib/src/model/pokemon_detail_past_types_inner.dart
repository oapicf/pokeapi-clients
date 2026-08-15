//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/pokemon_detail_types_inner.dart';
import 'package:openapi/src/model/ability_detail_pokemon_inner_pokemon.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pokemon_detail_past_types_inner.g.dart';

/// PokemonDetailPastTypesInner
///
/// Properties:
/// * [generation] 
/// * [types] 
@BuiltValue()
abstract class PokemonDetailPastTypesInner implements Built<PokemonDetailPastTypesInner, PokemonDetailPastTypesInnerBuilder> {
  @BuiltValueField(wireName: r'generation')
  AbilityDetailPokemonInnerPokemon get generation;

  @BuiltValueField(wireName: r'types')
  BuiltList<PokemonDetailTypesInner> get types;

  PokemonDetailPastTypesInner._();

  factory PokemonDetailPastTypesInner([void updates(PokemonDetailPastTypesInnerBuilder b)]) = _$PokemonDetailPastTypesInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PokemonDetailPastTypesInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PokemonDetailPastTypesInner> get serializer => _$PokemonDetailPastTypesInnerSerializer();
}

class _$PokemonDetailPastTypesInnerSerializer implements PrimitiveSerializer<PokemonDetailPastTypesInner> {
  @override
  final Iterable<Type> types = const [PokemonDetailPastTypesInner, _$PokemonDetailPastTypesInner];

  @override
  final String wireName = r'PokemonDetailPastTypesInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PokemonDetailPastTypesInner object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'generation';
    yield serializers.serialize(
      object.generation,
      specifiedType: const FullType(AbilityDetailPokemonInnerPokemon),
    );
    yield r'types';
    yield serializers.serialize(
      object.types,
      specifiedType: const FullType(BuiltList, [FullType(PokemonDetailTypesInner)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    PokemonDetailPastTypesInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PokemonDetailPastTypesInnerBuilder result,
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
        case r'types':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(PokemonDetailTypesInner)]),
          ) as BuiltList<PokemonDetailTypesInner>;
          result.types.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  PokemonDetailPastTypesInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PokemonDetailPastTypesInnerBuilder();
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


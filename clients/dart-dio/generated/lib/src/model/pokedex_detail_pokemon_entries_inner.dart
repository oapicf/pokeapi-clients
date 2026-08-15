//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/ability_detail_pokemon_inner_pokemon.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pokedex_detail_pokemon_entries_inner.g.dart';

/// PokedexDetailPokemonEntriesInner
///
/// Properties:
/// * [entryNumber] 
/// * [pokemonSpecies] 
@BuiltValue()
abstract class PokedexDetailPokemonEntriesInner implements Built<PokedexDetailPokemonEntriesInner, PokedexDetailPokemonEntriesInnerBuilder> {
  @BuiltValueField(wireName: r'entry_number')
  int get entryNumber;

  @BuiltValueField(wireName: r'pokemon_species')
  AbilityDetailPokemonInnerPokemon get pokemonSpecies;

  PokedexDetailPokemonEntriesInner._();

  factory PokedexDetailPokemonEntriesInner([void updates(PokedexDetailPokemonEntriesInnerBuilder b)]) = _$PokedexDetailPokemonEntriesInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PokedexDetailPokemonEntriesInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PokedexDetailPokemonEntriesInner> get serializer => _$PokedexDetailPokemonEntriesInnerSerializer();
}

class _$PokedexDetailPokemonEntriesInnerSerializer implements PrimitiveSerializer<PokedexDetailPokemonEntriesInner> {
  @override
  final Iterable<Type> types = const [PokedexDetailPokemonEntriesInner, _$PokedexDetailPokemonEntriesInner];

  @override
  final String wireName = r'PokedexDetailPokemonEntriesInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PokedexDetailPokemonEntriesInner object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'entry_number';
    yield serializers.serialize(
      object.entryNumber,
      specifiedType: const FullType(int),
    );
    yield r'pokemon_species';
    yield serializers.serialize(
      object.pokemonSpecies,
      specifiedType: const FullType(AbilityDetailPokemonInnerPokemon),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    PokedexDetailPokemonEntriesInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PokedexDetailPokemonEntriesInnerBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'entry_number':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.entryNumber = valueDes;
          break;
        case r'pokemon_species':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AbilityDetailPokemonInnerPokemon),
          ) as AbilityDetailPokemonInnerPokemon;
          result.pokemonSpecies.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  PokedexDetailPokemonEntriesInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PokedexDetailPokemonEntriesInnerBuilder();
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


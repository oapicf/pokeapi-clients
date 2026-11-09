//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/pokemon_species_summary.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pokemon_dex_number.g.dart';

/// PokemonDexNumber
///
/// Properties:
/// * [entryNumber] - The index of this Pokémon species entry within the Pokédex.
/// * [pokemonSpecies] - The Pokémon species being encountered.
@BuiltValue()
abstract class PokemonDexNumber implements Built<PokemonDexNumber, PokemonDexNumberBuilder> {
  /// The index of this Pokémon species entry within the Pokédex.
  @BuiltValueField(wireName: r'entry_number')
  int get entryNumber;

  /// The Pokémon species being encountered.
  @BuiltValueField(wireName: r'pokemon_species')
  PokemonSpeciesSummary get pokemonSpecies;

  PokemonDexNumber._();

  factory PokemonDexNumber([void updates(PokemonDexNumberBuilder b)]) = _$PokemonDexNumber;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PokemonDexNumberBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PokemonDexNumber> get serializer => _$PokemonDexNumberSerializer();
}

class _$PokemonDexNumberSerializer implements PrimitiveSerializer<PokemonDexNumber> {
  @override
  final Iterable<Type> types = const [PokemonDexNumber, _$PokemonDexNumber];

  @override
  final String wireName = r'PokemonDexNumber';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PokemonDexNumber object, {
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
      specifiedType: const FullType(PokemonSpeciesSummary),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    PokemonDexNumber object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PokemonDexNumberBuilder result,
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
            specifiedType: const FullType(PokemonSpeciesSummary),
          ) as PokemonSpeciesSummary;
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
  PokemonDexNumber deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PokemonDexNumberBuilder();
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



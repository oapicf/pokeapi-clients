//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/ability_detail_pokemon_inner_pokemon.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pokemon_species_detail_varieties_inner.g.dart';

/// PokemonSpeciesDetailVarietiesInner
///
/// Properties:
/// * [isDefault] 
/// * [pokemon] 
@BuiltValue()
abstract class PokemonSpeciesDetailVarietiesInner implements Built<PokemonSpeciesDetailVarietiesInner, PokemonSpeciesDetailVarietiesInnerBuilder> {
  @BuiltValueField(wireName: r'is_default')
  bool get isDefault;

  @BuiltValueField(wireName: r'pokemon')
  AbilityDetailPokemonInnerPokemon get pokemon;

  PokemonSpeciesDetailVarietiesInner._();

  factory PokemonSpeciesDetailVarietiesInner([void updates(PokemonSpeciesDetailVarietiesInnerBuilder b)]) = _$PokemonSpeciesDetailVarietiesInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PokemonSpeciesDetailVarietiesInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PokemonSpeciesDetailVarietiesInner> get serializer => _$PokemonSpeciesDetailVarietiesInnerSerializer();
}

class _$PokemonSpeciesDetailVarietiesInnerSerializer implements PrimitiveSerializer<PokemonSpeciesDetailVarietiesInner> {
  @override
  final Iterable<Type> types = const [PokemonSpeciesDetailVarietiesInner, _$PokemonSpeciesDetailVarietiesInner];

  @override
  final String wireName = r'PokemonSpeciesDetailVarietiesInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PokemonSpeciesDetailVarietiesInner object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'is_default';
    yield serializers.serialize(
      object.isDefault,
      specifiedType: const FullType(bool),
    );
    yield r'pokemon';
    yield serializers.serialize(
      object.pokemon,
      specifiedType: const FullType(AbilityDetailPokemonInnerPokemon),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    PokemonSpeciesDetailVarietiesInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PokemonSpeciesDetailVarietiesInnerBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'is_default':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(bool),
          ) as bool;
          result.isDefault = valueDes;
          break;
        case r'pokemon':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AbilityDetailPokemonInnerPokemon),
          ) as AbilityDetailPokemonInnerPokemon;
          result.pokemon.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  PokemonSpeciesDetailVarietiesInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PokemonSpeciesDetailVarietiesInnerBuilder();
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


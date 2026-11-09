//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/pokemon_summary.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pokemon_species_variety.g.dart';

/// PokemonSpeciesVariety
///
/// Properties:
/// * [isDefault] - Whether this variety is the default variety.
/// * [pokemon] - The Pokémon variety.
@BuiltValue()
abstract class PokemonSpeciesVariety implements Built<PokemonSpeciesVariety, PokemonSpeciesVarietyBuilder> {
  /// Whether this variety is the default variety.
  @BuiltValueField(wireName: r'is_default')
  bool get isDefault;

  /// The Pokémon variety.
  @BuiltValueField(wireName: r'pokemon')
  PokemonSummary get pokemon;

  PokemonSpeciesVariety._();

  factory PokemonSpeciesVariety([void updates(PokemonSpeciesVarietyBuilder b)]) = _$PokemonSpeciesVariety;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PokemonSpeciesVarietyBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PokemonSpeciesVariety> get serializer => _$PokemonSpeciesVarietySerializer();
}

class _$PokemonSpeciesVarietySerializer implements PrimitiveSerializer<PokemonSpeciesVariety> {
  @override
  final Iterable<Type> types = const [PokemonSpeciesVariety, _$PokemonSpeciesVariety];

  @override
  final String wireName = r'PokemonSpeciesVariety';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PokemonSpeciesVariety object, {
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
      specifiedType: const FullType(PokemonSummary),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    PokemonSpeciesVariety object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PokemonSpeciesVarietyBuilder result,
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
            specifiedType: const FullType(PokemonSummary),
          ) as PokemonSummary;
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
  PokemonSpeciesVariety deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PokemonSpeciesVarietyBuilder();
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



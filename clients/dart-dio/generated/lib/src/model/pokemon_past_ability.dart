//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/pokemon_ability_past.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/generation_summary.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pokemon_past_ability.g.dart';

/// PokemonPastAbility
///
/// Properties:
/// * [abilities] - The abilities the referenced pokémon had up to and including the listed generation. If null, the slot was previously empty.
/// * [generation] - The last generation in which the referenced pokémon had the listed abilities.
@BuiltValue()
abstract class PokemonPastAbility implements Built<PokemonPastAbility, PokemonPastAbilityBuilder> {
  /// The abilities the referenced pokémon had up to and including the listed generation. If null, the slot was previously empty.
  @BuiltValueField(wireName: r'abilities')
  BuiltList<PokemonAbilityPast> get abilities;

  /// The last generation in which the referenced pokémon had the listed abilities.
  @BuiltValueField(wireName: r'generation')
  GenerationSummary get generation;

  PokemonPastAbility._();

  factory PokemonPastAbility([void updates(PokemonPastAbilityBuilder b)]) = _$PokemonPastAbility;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PokemonPastAbilityBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PokemonPastAbility> get serializer => _$PokemonPastAbilitySerializer();
}

class _$PokemonPastAbilitySerializer implements PrimitiveSerializer<PokemonPastAbility> {
  @override
  final Iterable<Type> types = const [PokemonPastAbility, _$PokemonPastAbility];

  @override
  final String wireName = r'PokemonPastAbility';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PokemonPastAbility object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'abilities';
    yield serializers.serialize(
      object.abilities,
      specifiedType: const FullType(BuiltList, [FullType(PokemonAbilityPast)]),
    );
    yield r'generation';
    yield serializers.serialize(
      object.generation,
      specifiedType: const FullType(GenerationSummary),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    PokemonPastAbility object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PokemonPastAbilityBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'abilities':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(PokemonAbilityPast)]),
          ) as BuiltList<PokemonAbilityPast>;
          result.abilities.replace(valueDes);
          break;
        case r'generation':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(GenerationSummary),
          ) as GenerationSummary;
          result.generation.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  PokemonPastAbility deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PokemonPastAbilityBuilder();
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



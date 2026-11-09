//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/evolution_trigger_name.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/pokemon_species_summary.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'evolution_trigger_detail.g.dart';

/// EvolutionTriggerDetail
///
/// Properties:
/// * [id] - The identifier for this resource.
/// * [name] - The name for this resource.
/// * [names] - The name of this resource listed in different languages.
/// * [pokemonSpecies] - A list of pokemon species that result from this evolution trigger.
@BuiltValue()
abstract class EvolutionTriggerDetail implements Built<EvolutionTriggerDetail, EvolutionTriggerDetailBuilder> {
  /// The identifier for this resource.
  @BuiltValueField(wireName: r'id')
  int get id;

  /// The name for this resource.
  @BuiltValueField(wireName: r'name')
  String get name;

  /// The name of this resource listed in different languages.
  @BuiltValueField(wireName: r'names')
  BuiltList<EvolutionTriggerName> get names;

  /// A list of pokemon species that result from this evolution trigger.
  @BuiltValueField(wireName: r'pokemon_species')
  BuiltList<PokemonSpeciesSummary> get pokemonSpecies;

  EvolutionTriggerDetail._();

  factory EvolutionTriggerDetail([void updates(EvolutionTriggerDetailBuilder b)]) = _$EvolutionTriggerDetail;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(EvolutionTriggerDetailBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<EvolutionTriggerDetail> get serializer => _$EvolutionTriggerDetailSerializer();
}

class _$EvolutionTriggerDetailSerializer implements PrimitiveSerializer<EvolutionTriggerDetail> {
  @override
  final Iterable<Type> types = const [EvolutionTriggerDetail, _$EvolutionTriggerDetail];

  @override
  final String wireName = r'EvolutionTriggerDetail';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    EvolutionTriggerDetail object, {
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
    yield r'names';
    yield serializers.serialize(
      object.names,
      specifiedType: const FullType(BuiltList, [FullType(EvolutionTriggerName)]),
    );
    yield r'pokemon_species';
    yield serializers.serialize(
      object.pokemonSpecies,
      specifiedType: const FullType(BuiltList, [FullType(PokemonSpeciesSummary)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    EvolutionTriggerDetail object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required EvolutionTriggerDetailBuilder result,
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
        case r'names':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(EvolutionTriggerName)]),
          ) as BuiltList<EvolutionTriggerName>;
          result.names.replace(valueDes);
          break;
        case r'pokemon_species':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(PokemonSpeciesSummary)]),
          ) as BuiltList<PokemonSpeciesSummary>;
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
  EvolutionTriggerDetail deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = EvolutionTriggerDetailBuilder();
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



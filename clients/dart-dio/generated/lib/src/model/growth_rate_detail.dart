//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/experience.dart';
import 'package:openapi/src/model/growth_rate_description.dart';
import 'package:openapi/src/model/pokemon_species_summary.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'growth_rate_detail.g.dart';

/// GrowthRateDetail
///
/// Properties:
/// * [id] 
/// * [name] 
/// * [formula] 
/// * [descriptions] 
/// * [levels] 
/// * [pokemonSpecies] 
@BuiltValue()
abstract class GrowthRateDetail implements Built<GrowthRateDetail, GrowthRateDetailBuilder> {
  @BuiltValueField(wireName: r'id')
  int get id;

  @BuiltValueField(wireName: r'name')
  String get name;

  @BuiltValueField(wireName: r'formula')
  String get formula;

  @BuiltValueField(wireName: r'descriptions')
  BuiltList<GrowthRateDescription> get descriptions;

  @BuiltValueField(wireName: r'levels')
  BuiltList<Experience> get levels;

  @BuiltValueField(wireName: r'pokemon_species')
  BuiltList<PokemonSpeciesSummary> get pokemonSpecies;

  GrowthRateDetail._();

  factory GrowthRateDetail([void updates(GrowthRateDetailBuilder b)]) = _$GrowthRateDetail;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(GrowthRateDetailBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<GrowthRateDetail> get serializer => _$GrowthRateDetailSerializer();
}

class _$GrowthRateDetailSerializer implements PrimitiveSerializer<GrowthRateDetail> {
  @override
  final Iterable<Type> types = const [GrowthRateDetail, _$GrowthRateDetail];

  @override
  final String wireName = r'GrowthRateDetail';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    GrowthRateDetail object, {
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
    yield r'formula';
    yield serializers.serialize(
      object.formula,
      specifiedType: const FullType(String),
    );
    yield r'descriptions';
    yield serializers.serialize(
      object.descriptions,
      specifiedType: const FullType(BuiltList, [FullType(GrowthRateDescription)]),
    );
    yield r'levels';
    yield serializers.serialize(
      object.levels,
      specifiedType: const FullType(BuiltList, [FullType(Experience)]),
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
    GrowthRateDetail object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required GrowthRateDetailBuilder result,
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
        case r'formula':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.formula = valueDes;
          break;
        case r'descriptions':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(GrowthRateDescription)]),
          ) as BuiltList<GrowthRateDescription>;
          result.descriptions.replace(valueDes);
          break;
        case r'levels':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(Experience)]),
          ) as BuiltList<Experience>;
          result.levels.replace(valueDes);
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
  GrowthRateDetail deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = GrowthRateDetailBuilder();
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

